package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Base64;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.b;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.archive.impl.ArchiveWithChannelsFragment;
import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import kotlin.Pair;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandOnErrorListener;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Command;
import ru.ok.android.webrtc.topology.server.layout.DiffDisplayLayouts;
import xsna.b6l0;
import xsna.fit;
import xsna.osh;
import xsna.t24;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class kb implements io.reactivex.rxjava3.functions.l, Toolbar.h, t24.e, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.s, SuccessContinuation, Preference.c, RtcCommandOnErrorListener, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (b6l0.a) ((com.vk.movika.tools.controls.seekbar.u) this.c).invoke(obj, obj2);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 23:
                String[] strArr = DebugDevSettingsFragment.t0;
                vx2.a.getClass();
                String token = vx2.b().a.C.getValue().getToken();
                DecimalFormat decimalFormat = uqm0.a;
                String str = new String(Base64.decode((String) drm0.c0(token, new String[]{"."}, 0, 6).get(2), 0), emb.b);
                ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText(null, erm0.w0(1, drm0.g0(str, "anonym_id_long\":", str))));
                break;
            default:
                String[] strArr2 = DebugDevSettingsFragment.t0;
                ((DebugDevSettingsFragment) obj).kn().getApplication().onLowMemory();
                break;
        }
        return true;
    }

    @Override // xsna.t24.e
    public void onClick() {
        ((t24) this.c).Bn();
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ArchiveWithChannelsFragment archiveWithChannelsFragment = (ArchiveWithChannelsFragment) this.c;
        int i = ArchiveWithChannelsFragment.V;
        if (menuItem.getItemId() != R.id.search) {
            return false;
        }
        cvk.r(new ji0(archiveWithChannelsFragment, 3));
        return true;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandOnErrorListener
    public void onRtcCommandError(RtcCommand rtcCommand, Throwable th) {
        ((DiffDisplayLayouts) this.c).a((UpdateDisplayLayoutV2Command) rtcCommand, th);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        zld zldVar = (zld) this.c;
        zldVar.d.V4(new k8(7, rVar, zldVar));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((i8) this.c).invoke(obj)).booleanValue();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((b.a) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (UsersUserFullDto) ((i8) this.c).invoke(obj);
            case 1:
                return (Pair) ((qu) this.c).invoke(obj);
            case 2:
                return (it80) ((i8) this.c).invoke(obj);
            case 3:
            case 4:
            case 6:
            case 11:
            case 15:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                return (y6u.d.c) ((j0r) this.c).invoke(obj);
            case 5:
                return (lw4) ((nw4) this.c).invoke(obj);
            case 7:
                return (it80) ((i8) this.c).invoke(obj);
            case 8:
                return (w5w0) ((qu) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((bi0) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((bi0) this.c).invoke(obj);
            case 12:
                return (s3q0) ((qu) this.c).invoke(obj);
            case 13:
                return (DialogExt) ((hob) this.c).invoke(obj);
            case 14:
                return (Boolean) ((i8) this.c).invoke(obj);
            case 16:
                return (u2e) ((i8) this.c).invoke(obj);
            case 17:
                return (ClipsInterestsStatusProvider.Status) ((i8) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.t) ((i8) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((bi0) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((jng) this.c).invoke(obj);
            case 21:
                return (osh.a) ((qu) this.c).invoke(obj);
            case 27:
                return (nex0) ((fit.p) this.c).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((qcl) this.c).invoke(obj);
        }
    }
}
