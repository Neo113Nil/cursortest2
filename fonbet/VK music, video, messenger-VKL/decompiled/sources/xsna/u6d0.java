package xsna;

import android.util.Size;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.bbd0;
import xsna.wen;

/* compiled from: PrimaryAnimojiViewHolder.kt */
/* loaded from: classes7.dex */
public final class u6d0 extends abd0<bbd0.a> {
    public final sr2 s;
    public final h7d0 t;

    public u6d0(u2x0 u2x0Var, b630 b630Var, ha90 ha90Var, qfu qfuVar, ViewGroup viewGroup) {
        super(R.layout.voip_primary_animoji_view_holder, viewGroup, qfuVar, b630Var, ha90Var);
        sr2 sr2Var = new sr2((zzz) this.n.a, (FrameLayout) this.itemView.findViewById(R.id.render_container), (rct0) qfuVar.d, (wly) qfuVar.e, (k490) qfuVar.f);
        this.s = sr2Var;
        this.t = new h7d0(u2x0Var, this.itemView);
        sr2Var.a(new t6d0(this));
    }

    @Override // xsna.abd0, xsna.vfz
    public final void V5() {
        super.V5();
        l6();
    }

    @Override // xsna.abd0, xsna.vfz
    public final void W5(hfz hfzVar) {
        bbd0.a aVar = (bbd0.a) hfzVar;
        this.q = aVar;
        l6();
        this.t.a(aVar.d, aVar.c);
    }

    @Override // xsna.abd0, xsna.vfz
    public final void a6() {
        super.a6();
        this.s.f();
    }

    @Override // xsna.wen
    public final wen.a getDisplayLayouts() {
        sr2 sr2Var = this.s;
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = sr2Var.k;
        ConversationDisplayLayoutItem conversationDisplayLayoutItem = null;
        if (conversationVideoTrackParticipantKey != null) {
            VideoDisplayLayout a = sr2Var.l.a(new Size(sr2Var.b.getWidth(), sr2Var.b.getHeight()));
            if (a != null) {
                sr2Var.m = a;
                sr2Var.n = Float.valueOf(sr2Var.a.c());
                conversationDisplayLayoutItem = new ConversationDisplayLayoutItem(conversationVideoTrackParticipantKey, a);
            }
        }
        return new wen.a.b(conversationDisplayLayoutItem != null ? Collections.singletonList(conversationDisplayLayoutItem) : EmptyList.b);
    }

    @Override // xsna.abd0
    public final void h6() {
        this.s.f();
        super.h6();
    }

    @Override // xsna.abd0
    public final void j6() {
        l6();
        super.j6();
    }

    public final void l6() {
        bbd0.a aVar = (bbd0.a) this.q;
        if (aVar == null) {
            return;
        }
        this.s.b(new ConversationVideoTrackParticipantKey.Builder().setType(VideoTrackType.ANIMOJI).setParticipantId(mnh0.H(aVar.b)).build());
    }
}
