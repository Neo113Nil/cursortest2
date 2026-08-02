package xsna;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.bbd0;
import xsna.wen;

/* compiled from: PrimaryVideoViewHolder.kt */
/* loaded from: classes7.dex */
public final class yad0 extends abd0<bbd0.c> implements tmg0 {
    public final xct0 s;
    public final h7d0 t;
    public final EmptyList u;
    public final List<VoipAvatarViewContainer> v;

    public yad0(u2x0 u2x0Var, b630 b630Var, ha90 ha90Var, qfu qfuVar, ViewGroup viewGroup) {
        super(R.layout.voip_primary_video_view_holder, viewGroup, qfuVar, b630Var, ha90Var);
        xct0 xct0Var = new xct0((zzz) this.n.a, (FrameLayout) this.itemView.findViewById(R.id.render_container), (rct0) qfuVar.d, (wly) qfuVar.e, (k490) qfuVar.f);
        this.s = xct0Var;
        h7d0 h7d0Var = new h7d0(u2x0Var, this.itemView);
        this.t = h7d0Var;
        this.u = EmptyList.b;
        this.v = Collections.singletonList(h7d0Var.d);
        xct0Var.a(new xad0(this));
    }

    @Override // xsna.abd0, xsna.vfz
    public final void V5() {
        super.V5();
        l6();
        ((zzz) this.n.a).d(this);
    }

    @Override // xsna.abd0, xsna.vfz
    public final void W5(hfz hfzVar) {
        bbd0.c cVar = (bbd0.c) hfzVar;
        this.q = cVar;
        l6();
        this.t.a(cVar.e, cVar.d);
    }

    @Override // xsna.abd0, xsna.vfz
    public final void a6() {
        super.a6();
        this.s.f();
        ((zzz) this.n.a).b(this);
    }

    @Override // xsna.tmg0
    public final List<VoipAvatarViewContainer> getAnimatedViewsToRotate() {
        return this.v;
    }

    @Override // xsna.wen
    public final wen.a getDisplayLayouts() {
        xct0 xct0Var = this.s;
        FrameLayout frameLayout = xct0Var.b;
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = xct0Var.k;
        ConversationDisplayLayoutItem conversationDisplayLayoutItem = null;
        if (conversationVideoTrackParticipantKey != null && !mnh0.n(xct0Var.e.a(), conversationVideoTrackParticipantKey.getParticipantId())) {
            VideoDisplayLayout a = xct0Var.l.a(new Size(frameLayout.getWidth(), frameLayout.getHeight()));
            if (a != null) {
                conversationDisplayLayoutItem = new ConversationDisplayLayoutItem(conversationVideoTrackParticipantKey, a);
            }
        }
        return new wen.a.b(conversationDisplayLayoutItem != null ? Collections.singletonList(conversationDisplayLayoutItem) : EmptyList.b);
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.u;
    }

    public final void l6() {
        bbd0.c cVar = (bbd0.c) this.q;
        if (cVar == null) {
            return;
        }
        boolean z = cVar.c;
        xct0 xct0Var = this.s;
        if (z) {
            xct0Var.b(new ConversationVideoTrackParticipantKey.Builder().setType(VideoTrackType.VIDEO).setParticipantId(mnh0.H(cVar.b)).build());
        } else {
            xct0Var.f();
        }
    }
}
