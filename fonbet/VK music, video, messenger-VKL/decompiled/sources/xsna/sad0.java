package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.bbd0;
import xsna.wen;

/* compiled from: PrimaryScreenCaptureViewHolder.kt */
/* loaded from: classes7.dex */
public final class sad0 extends abd0<bbd0.b> {
    public final View s;
    public final nah0 t;

    public sad0(b630 b630Var, ha90 ha90Var, qfu qfuVar, ViewGroup viewGroup) {
        super(R.layout.voip_primary_screen_capture_view_holder, viewGroup, qfuVar, b630Var, ha90Var);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.render_container);
        this.s = this.itemView.findViewById(R.id.voip_fullscreen_loading_group);
        nah0 nah0Var = new nah0(this.itemView, (zzz) this.n.a, frameLayout, (rct0) qfuVar.d, (wly) qfuVar.e, (k490) qfuVar.f);
        this.t = nah0Var;
        nah0Var.a(new rad0(this));
    }

    @Override // xsna.abd0, xsna.vfz
    public final void V5() {
        super.V5();
        l6();
    }

    @Override // xsna.abd0, xsna.vfz
    public final void W5(hfz hfzVar) {
        this.q = (bbd0.b) hfzVar;
        l6();
    }

    @Override // xsna.abd0, xsna.vfz
    public final void a6() {
        super.a6();
        this.t.f();
    }

    @Override // xsna.wen
    public final wen.a getDisplayLayouts() {
        ConversationDisplayLayoutItem g = this.t.g();
        return new wen.a.b(g != null ? Collections.singletonList(g) : EmptyList.b);
    }

    @Override // xsna.abd0
    public final void h6() {
        this.t.o.c(false);
        super.h6();
    }

    @Override // xsna.abd0
    public final void j6() {
        super.j6();
        this.t.getClass();
    }

    public final void l6() {
        bbd0.b bVar = (bbd0.b) this.q;
        if (bVar == null) {
            return;
        }
        this.t.b(new ConversationVideoTrackParticipantKey.Builder().setType(VideoTrackType.SCREEN_CAPTURE).setParticipantId(mnh0.H(bVar.b)).build());
    }
}
