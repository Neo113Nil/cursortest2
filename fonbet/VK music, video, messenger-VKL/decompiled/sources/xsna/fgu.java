package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.sgu;
import xsna.wen;

/* compiled from: GridScreenCaptureViewHolder.kt */
/* loaded from: classes7.dex */
public final class fgu extends rgu<sgu.a> {
    public static final int v = cn70.b(175);
    public final mfw0 s;
    public final Object t;
    public final nah0 u;

    public fgu(nit nitVar, ha90 ha90Var, qfu qfuVar, ViewGroup viewGroup, mfw0 mfw0Var) {
        super(R.layout.voip_grid_fullscreen_screen_capture_view_holder, viewGroup, qfuVar, nitVar, ha90Var);
        this.s = mfw0Var;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.render_container);
        this.t = msy.a(LazyThreadSafetyMode.NONE, new x5i(this, 25));
        nah0 nah0Var = new nah0(this.itemView, (zzz) this.l.a, frameLayout, (rct0) qfuVar.d, (wly) qfuVar.e, (k490) qfuVar.f);
        this.u = nah0Var;
        nah0Var.a(new egu(this));
        io.reactivex.rxjava3.disposables.c f = io.reactivex.rxjava3.kotlin.c.f(3, mfw0Var.c(), null, null, new pcg(this, 28));
        io.reactivex.rxjava3.disposables.b bVar = this.p;
        bVar.b(f);
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, mfw0Var.a(), null, null, new wpg(this, 18)));
    }

    @Override // xsna.rgu, xsna.vfz
    public final void V5() {
        super.V5();
        l6();
    }

    @Override // xsna.rgu, xsna.vfz
    public final void W5(hfz hfzVar) {
        this.q = (sgu.a) hfzVar;
        l6();
    }

    @Override // xsna.rgu, xsna.vfz
    public final void a6() {
        super.a6();
        this.u.f();
    }

    @Override // xsna.wen
    public final wen.a getDisplayLayouts() {
        ConversationDisplayLayoutItem g = this.u.g();
        return new wen.a.b(g != null ? Collections.singletonList(g) : EmptyList.b);
    }

    @Override // xsna.rgu
    public final void h6() {
        this.u.o.c(false);
        super.h6();
    }

    @Override // xsna.rgu
    public final void j6() {
        super.j6();
        this.u.getClass();
    }

    public final void l6() {
        sgu.a aVar = (sgu.a) this.q;
        if (aVar == null) {
            return;
        }
        this.u.b(new ConversationVideoTrackParticipantKey.Builder().setType(VideoTrackType.SCREEN_CAPTURE).setParticipantId(mnh0.H(aVar.b)).build());
    }
}
