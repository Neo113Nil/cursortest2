package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.newsfeed.common.recycler.holders.clips.ClipActionButtonStateRepository;
import com.vk.newsfeed.common.recycler.holders.clips.SingleClipV2Holder;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.qi6;

/* compiled from: PromoClipHolder.kt */
/* loaded from: classes4.dex */
public final class y4e0 extends rp6<efd, ShitAttachment> implements ent0, i7o, cui, qfd {
    public static final /* synthetic */ int F = 0;
    public final cfd E;

    public y4e0(ViewGroup viewGroup, h170 h170Var, zof zofVar, ClipActionButtonStateRepository clipActionButtonStateRepository) {
        super(new FrameLayout(viewGroup.getContext()), viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        cfd cfdVar = new cfd(frameLayout, new p8d(frameLayout.getContext(), g620.f().a(), zofVar, new x4e0(this, y4e0.class, "displayContext", "getDisplayContext()Lcom/vk/newsfeed/presentation/model/PostDisplayContext;", 0), clipActionButtonStateRepository, true), null, null, h170Var, 28);
        this.E = cfdVar;
        viewGroup.getContext();
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(cfdVar.itemView);
    }

    @Override // xsna.qfd
    public final View F1() {
        return this.E.X;
    }

    @Override // xsna.qfd
    public final boolean J5() {
        return this.E.K7();
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.E.Q6(s6oVar);
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(efd efdVar) {
    }

    @Override // xsna.rp6
    public final void U6(ShitAttachment shitAttachment) {
        super.U6(shitAttachment);
        u1c0 J0 = J0();
        if (J0 == null) {
            return;
        }
        this.E.J7(J0, false, null);
    }

    @Override // xsna.qfd
    public final String W0() {
        return this.E.W0();
    }

    @Override // xsna.rp6, xsna.qi6
    public final void b6(u1c0 u1c0Var, Object obj) {
        if ((obj instanceof Iterable ? j5g.Z((Iterable) obj) : obj) == SingleClipV2Holder.BindConfig.HEADER) {
            super.b6(u1c0Var, obj);
        } else {
            a6(u1c0Var);
        }
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.E.L;
    }

    @Override // xsna.cui
    public final void q5(s980 s980Var, qi6.b bVar) {
        cfd cfdVar = this.E;
        cfdVar.y = s980Var;
        if (s980Var != null) {
            cfdVar.D = s980Var;
        }
        cfdVar.A = bVar;
    }
}
