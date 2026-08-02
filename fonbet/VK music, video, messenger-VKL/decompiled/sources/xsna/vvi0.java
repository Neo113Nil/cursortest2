package xsna;

import android.view.View;
import com.vk.dto.stories.model.StoryPrivacyResponse;
import com.vk.lists.AbstractPaginatedView;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import xsna.h8z0;
import xsna.hjz0;
import xsna.jgz0;
import xsna.kkz0;
import xsna.l5v0;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vvi0 implements io.reactivex.rxjava3.functions.i, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.l, AbstractPaginatedView.g, yads.ng1, ydz0.b, yads.qp, h8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vvi0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.qp
    public long a(long j) {
        return ((yads.cw0) this.c).a(j);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return (StoryPrivacyResponse) ((on7) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((qcw) this.c).invoke(obj);
            case 4:
                return (Pair) ((qcw) this.c).invoke(obj);
            case 5:
            default:
                ((mkw0) this.c).getClass();
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                VoipViewModelState voipViewModelState = com.vk.voip.ui.c.K0;
                return new Pair(Boolean.valueOf((voipViewModelState == VoipViewModelState.InCall || voipViewModelState == VoipViewModelState.ReceivingCallFromPeer) ? false : true), cVar.M());
            case 6:
                return (hxq0) ((vlc0) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.e) ((w8t0) this.c).invoke(obj);
            case 8:
                return (l5v0.a) ((dgu0) this.c).invoke(obj);
        }
    }

    @Override // com.vk.lists.AbstractPaginatedView.g
    public int c(int i) {
        s5n0 s5n0Var = (s5n0) this.c;
        int b = i - (cn70.b(12) * 2);
        s5n0Var.getClass();
        int b2 = b / cn70.b(112);
        if (b2 < 1) {
            return 1;
        }
        return b2;
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (a.c) ((uvi0) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        switch (this.b) {
            case 10:
                ((yads.af) obj).getClass();
                break;
            default:
                ((yads.nf2) obj).a((yads.ig0) this.c);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        StatListenerManager.a((StatListenerManager) this.c, yVar);
    }

    @Override // xsna.h8z0.b
    public void a() {
        igz0 igz0Var = (igz0) this.c;
        hjz0.a aVar = igz0Var.a;
        String str = igz0Var.o.F;
        yil0.d(aVar);
    }

    @Override // xsna.ydz0.b
    public void a(View view, dhz0 dhz0Var) {
        kkz0.a aVar;
        ydz0 ydz0Var = (ydz0) ((bj50) ((ydz0.a) this.c)).c;
        if (!view.isEnabled() || (aVar = ydz0Var.t) == null) {
            return;
        }
        ((jgz0.b) aVar).a(1, dhz0Var);
    }
}
