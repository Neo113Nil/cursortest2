package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdDescriptionView;
import com.vkontakte.android.data.PostInteract;

/* compiled from: MyTargetInternalNativeAdDescriptionViewHolder.kt */
/* loaded from: classes4.dex */
public final class ar50 extends rp6<zq50, MyTargetNativeAdEntry> implements View.OnClickListener {
    public final t2m E;

    public ar50(ViewGroup viewGroup) {
        super(new MyTargetAdDescriptionView(viewGroup.getContext(), null, 0, 14, 0), viewGroup);
        this.E = new t2m((MyTargetAdDescriptionView) this.itemView);
    }

    @Override // xsna.rp6
    public final void R6(zq50 zq50Var) {
        CharSequence charSequence;
        zq50 zq50Var2 = zq50Var;
        u1c0 J0 = J0();
        if (J0 != null) {
            MyTargetNativeAdEntry myTargetNativeAdEntry = zq50Var2.i;
            PostInteract postInteract = this.w;
            String str = this.u;
            t2m t2mVar = this.E;
            t2mVar.a(J0, myTargetNativeAdEntry, postInteract, str);
            ej90 ej90Var = zq50Var2.h;
            ViewGroup viewGroup = t2mVar.b;
            t2mVar.b();
            if (ej90Var == null || (charSequence = ej90Var.a) == null || !drm0.N(charSequence)) {
                t2mVar.g.a(t2mVar.h, ej90Var, t2mVar.i, t2mVar.j);
                bwt0.p0(viewGroup, true);
            } else {
                bwt0.p0(viewGroup, false);
            }
            t2mVar.k = new l22(21, this, zq50Var2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        izs<? super View, s3q0> izsVar;
        if (view == null || (izsVar = this.E.k) == null) {
            return;
        }
        izsVar.invoke(view);
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        t2m t2mVar = this.E;
        izs<? super View, s3q0> izsVar = t2mVar.k;
        if (izsVar != null) {
            izsVar.invoke(t2mVar.b);
        }
    }
}
