package xsna;

import android.content.SharedPreferences;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class z3l implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z3l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                uek uekVar = (uek) this.d;
                File file = (File) this.e;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f;
                String[] strArr = DebugDevSettingsFragment.t0;
                uekVar.c();
                synchronized (uekVar.d) {
                    try {
                        boolean z = uekVar.c;
                        uekVar.c();
                        nbr.l(uekVar.a.a);
                        if (z) {
                            uekVar.b();
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                new File(file.getParentFile().getAbsolutePath() + '/' + file.getName() + ".zip").delete();
                if (sharedPreferences.getBoolean("__dbg_network_netlog_write", false)) {
                    uekVar.b();
                }
                enj.r(debugDevSettingsFragment.mo2getContext(), "NetLog-данные удалены", 0);
                wjy.a.getClass();
                uek b = wjy.b();
                asu0.a.getClass();
                asu0.n().submit(new od6(1, debugDevSettingsFragment, b));
                return;
            default:
                sg40 sg40Var = (sg40) this.c;
                UserId userId = (UserId) this.d;
                List<MusicTrack> list = (List) this.e;
                if (sg40Var.e.q(userId, (String) this.f, list) != 0) {
                    sg40Var.a.a0(list, (((Boolean) sg40Var.p.getValue()).booleanValue() || ((Boolean) sg40Var.q.getValue()).booleanValue()) ? sg40Var.k.d() : EmptyList.b);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        sg40Var.l.C(((MusicTrack) it.next()).Fb());
                    }
                    return;
                }
                return;
        }
    }
}
