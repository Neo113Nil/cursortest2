package xsna;

import android.util.Size;
import android.view.ViewGroup;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.grid.holder.video_grid.GroupCallGridView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.el90;
import xsna.ktw;
import xsna.qhu;
import xsna.sgu;
import xsna.wen;

/* compiled from: VideoGridViewHolder.kt */
/* loaded from: classes7.dex */
public final class wns0 extends rgu<sgu.b> implements ktw.a {
    public final ktw s;
    public final ehs0 t;
    public final GroupCallGridView u;
    public final wx40 v;

    public wns0(ltw ltwVar, ehs0 ehs0Var, nit nitVar, ha90 ha90Var, qfu qfuVar, ViewGroup viewGroup) {
        super(R.layout.voip_grid_video_grid_view_holder, viewGroup, qfuVar, nitVar, ha90Var);
        this.s = ltwVar;
        this.t = ehs0Var;
        GroupCallGridView groupCallGridView = (GroupCallGridView) this.itemView;
        this.u = groupCallGridView;
        bwt0.i0(groupCallGridView, new isb0(11, nitVar, this));
        this.v = new wx40(this, 14);
    }

    @Override // xsna.ktw.a
    public final void I5(qhu.a aVar) {
        GroupCallGridView groupCallGridView = this.u;
        ViewGroup.LayoutParams layoutParams = groupCallGridView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = aVar.a;
        marginLayoutParams.bottomMargin = aVar.b;
        groupCallGridView.setLayoutParams(marginLayoutParams);
    }

    @Override // xsna.rgu, xsna.vfz
    public final void V5() {
        super.V5();
        sgu.b bVar = (sgu.b) this.q;
        qfu qfuVar = this.l;
        GroupCallGridView groupCallGridView = this.u;
        if (bVar != null && groupCallGridView.a(bVar)) {
            ((cfn) qfuVar.b).a();
        }
        this.s.b(this);
        ((zzz) qfuVar.a).d(groupCallGridView);
    }

    @Override // xsna.rgu, xsna.vfz
    public final void W5(hfz hfzVar) {
        sgu.b bVar = (sgu.b) hfzVar;
        this.q = bVar;
        if (bVar != null && this.u.a(bVar)) {
            ((cfn) this.l.b).a();
        }
    }

    @Override // xsna.rgu, xsna.vfz
    public final void a6() {
        super.a6();
        GroupCallGridView groupCallGridView = this.u;
        groupCallGridView.g();
        this.s.a(this);
        ((zzz) this.l.a).b(groupCallGridView);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    @Override // xsna.wen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wen.a getDisplayLayouts() {
        ConversationVideoTrackParticipantKey a;
        Size size;
        VideoDisplayLayout build;
        sgu.b bVar = (sgu.b) this.q;
        if (bVar == null) {
            return wen.a.C3930a.a;
        }
        List<CallMemberId> list = bVar.c;
        ehs0 ehs0Var = this.t;
        ehs0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (CallMemberId callMemberId : list) {
            ehs0Var.a.b.getClass();
            kiu b = GroupCallViewModel.b(callMemberId);
            ConversationDisplayLayoutItem conversationDisplayLayoutItem = null;
            if (b != null) {
                ParticipantId H = mnh0.H(b.a.a);
                Movie movie = (Movie) j5g.a0(b.a.s);
                if (movie != null) {
                    new el90.e(H, movie);
                }
                CallMember callMember = b.a;
                if (callMember.i && !callMember.n) {
                    new el90.b(H);
                }
                el90.a aVar = b.a.h ? new el90.a(H) : null;
                el90.d dVar = b.a.g ? new el90.d(H) : null;
                if (dVar != null) {
                    a = dVar.a();
                } else if (aVar != null) {
                    a = aVar.a();
                }
                diu diuVar = (diu) ((wns0) this.v.c).u.c.get(callMemberId);
                if (diuVar != null) {
                    qcy<Object>[] qcyVarArr = bwt0.a;
                    size = new Size(diuVar.getWidth(), diuVar.getHeight());
                } else {
                    size = null;
                }
                if (size != null) {
                    boolean isHorizontal = ehs0Var.b.isHorizontal();
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (width > 0 && height > 0) {
                        if (width == height || !isHorizontal) {
                            width = height;
                            height = width;
                        }
                        build = new VideoDisplayLayout.Builder().setHeight(width).setWidth(height).setFit(VideoDisplayLayout.Fit.COVER).build();
                        if (build != null) {
                            conversationDisplayLayoutItem = new ConversationDisplayLayoutItem(a, build);
                        }
                    }
                }
                build = null;
                if (build != null) {
                }
            }
            if (conversationDisplayLayoutItem != null) {
                arrayList.add(conversationDisplayLayoutItem);
            }
        }
        return new wen.a.b(arrayList);
    }

    @Override // xsna.rgu
    public final void h6() {
        super.h6();
        this.u.setIsVideoOn(false);
    }

    @Override // xsna.rgu
    public final void j6() {
        super.j6();
        this.u.setIsVideoOn(true);
    }
}
