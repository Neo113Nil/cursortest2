package xsna;

import com.vk.clips.internal.nps.api.InternalNpsStateHolder$NpsEventType;
import com.vk.profile.user.impl.ui.b;
import ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat;
import xsna.k840;
import xsna.l2f;
import xsna.ys8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g57 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g57(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((l57) this.c).c.un();
                break;
            case 1:
                ((l2f.a) this.c).a(null);
                break;
            case 2:
                ConversationWebRTCStat.getConfigDisposable$lambda$0((ConversationWebRTCStat) this.c);
                break;
            case 3:
                ((ys8.b) this.c).a();
                break;
            case 4:
                ((ruu) this.c).L().invoke(b.r.C1713b.b);
                break;
            case 5:
                ojx ojxVar = (ojx) this.c;
                ojxVar.i.a.onNext(new xjx(ojxVar.f.d.b, InternalNpsStateHolder$NpsEventType.FINISHED));
                break;
            case 6:
                if (((vh40) this.c).b.v(o25.a().c()) == 0) {
                    r5v0 r5v0Var = k840.a.h;
                    if (r5v0Var == null) {
                        r5v0Var = null;
                    }
                    r5v0Var.b(new gi40());
                    break;
                }
                break;
            case 7:
                ((fp7) this.c).b = false;
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}
