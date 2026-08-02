package xsna;

import android.view.View;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.im.channelcreation.impl.i;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.pushes.NotificationUtils;
import xsna.tsb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lg4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((ng4) this.c).k.b(null);
                return;
            case 1:
                ((com.vk.channels.impl.comments.b) this.c).q(new af2(5));
                return;
            case 2:
                ((com.vk.im.channelcreation.impl.b) this.c).n(i.a.a);
                return;
            case 3:
                p9w p9wVar = (p9w) this.c;
                synchronized (p9wVar) {
                    try {
                        if (p9wVar.d.isEmpty()) {
                            return;
                        }
                        for (ImMsgPushSettingsProvider.Type type : ImMsgPushSettingsProvider.Type.h()) {
                            ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source source = ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source.SYSTEM;
                            p9wVar.k[source.ordinal()][type.ordinal()] = p9wVar.i(source, type);
                            ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source source2 = ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source.IN_APP;
                            p9wVar.k[source2.ordinal()][type.ordinal()] = p9wVar.i(source2, type);
                        }
                        synchronized (p9wVar) {
                            p9wVar.b.execute(new t12(p9wVar, 8));
                            p9wVar.c.b(p9wVar.e);
                            NotificationUtils.a(p9wVar.a, p9wVar.f);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 4:
                u440 u440Var = (u440) this.c;
                u440Var.B.a.f(new PlaybackActionMeta(6, 0L, 2, null));
                ((g440) u440Var.s).getAnimationStickerManager().a(true);
                return;
            case 5:
                ((lsb0) this.c).U(tsb0.b.a);
                return;
            case 6:
                VideoFile A = k15.A(((ikd) this.c).a);
                ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
                if (clipVideoFile == null) {
                    return;
                }
                wjs0.a(new fyr0(ClipVideoFile.Kb(clipVideoFile, false, null, null, null, null, null, ClipMainTabState.ON_TAB, 7340031)));
                return;
            case 7:
                com.vk.profile.user.impl.ui.i iVar = ((UserProfileFragment) this.c).Q;
                (iVar != null ? iVar : null).i.a();
                return;
            default:
                View view = ((c2x0) this.c).f1;
                if (view != null) {
                    bwt0.p0(view, false);
                    return;
                }
                return;
        }
    }
}
