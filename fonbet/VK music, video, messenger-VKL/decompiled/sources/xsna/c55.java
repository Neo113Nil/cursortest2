package xsna;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.superapp.api.states.VkAuthState;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class c55 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializer.StreamParcelableAdapter e;

    public /* synthetic */ c55(Object obj, Object obj2, Serializer.StreamParcelableAdapter streamParcelableAdapter, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = streamParcelableAdapter;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        boolean z = true;
        Serializer.StreamParcelableAdapter streamParcelableAdapter = this.e;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AuthResult authResult = (AuthResult) obj;
                VkAuthState vkAuthState = (VkAuthState) streamParcelableAdapter;
                if (((String) obj2) != null) {
                    jsp0 jsp0Var = jsp0.a;
                    r55 r55Var = r55.a;
                    Context a = r55.a();
                    jsp0Var.getClass();
                    try {
                        new File(a.getFilesDir(), "onRestoreFinished2").delete();
                    } catch (Throwable unused) {
                    }
                }
                String str = authResult.g;
                if (str != null && !drm0.N(str) && vkAuthState != null) {
                    l55.a.getClass();
                    ((hsp0) l55.b.getValue()).c(authResult.d, str);
                    r55 r55Var2 = r55.a;
                    Context a2 = r55.a();
                    ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 0);
                    boolean z2 = (applicationInfo.flags & 32768) != 0;
                    String str2 = applicationInfo.backupAgentName;
                    if (str2 != null && !drm0.N(str2)) {
                        z = false;
                    }
                    if (z2 && !z) {
                        new BackupManager(r55.a()).dataChanged();
                        break;
                    }
                }
                break;
            default:
                fxf0 fxf0Var = (fxf0) obj2;
                Context context = (Context) obj;
                MusicTrack musicTrack = (MusicTrack) streamParcelableAdapter;
                MusicBottomSheetActionTracker musicBottomSheetActionTracker = fxf0Var.b;
                if (musicBottomSheetActionTracker != null) {
                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.RemoveFromMyMusic);
                }
                a630.d1(fxf0Var.a, context, musicTrack, true);
                break;
        }
    }
}
