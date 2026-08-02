package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import xsna.bq6;
import xsna.xnn0;

/* compiled from: RelatedUserViewHolder.kt */
/* loaded from: classes6.dex */
public final class wsf0 extends bq6 {
    public final VKReplacerView w;
    public final TextView x;

    public wsf0(ViewGroup viewGroup, kgq0 kgq0Var, jzq0 jzq0Var) {
        super(viewGroup, R.layout.vk_auth_related_users_view_holder, kgq0Var, jzq0Var);
        this.w = (VKReplacerView) this.itemView.findViewById(R.id.user_avatar);
        this.x = (TextView) this.itemView.findViewById(R.id.user_name);
    }

    @Override // xsna.bq6
    public final void V5(xnn0.h hVar) {
        super.V5(hVar);
        this.m.setBackground(vjo.a(this.u, 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_CODE_INIT_FAILED));
        com.vk.superapp.multiaccount.api.f fVar = hVar.a;
        this.x.setText(fVar.a().c);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        v9r0<View> a = ifx0Var.a();
        Context context = this.u;
        lgr0 create = a.create(context);
        this.w.a(create.getView());
        create.f(fVar.a().d, adu0.a(6, context));
    }

    @Override // xsna.bq6
    public final bq6.a W5() {
        float f = 3;
        return new bq6.a(iah0.a(f), 0, iah0.a(f), 2);
    }
}
