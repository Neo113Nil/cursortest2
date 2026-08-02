package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.tlo0;
import xsna.zsp0;

/* compiled from: BonusCatalogTutorialHolderDs.kt */
/* loaded from: classes5.dex */
public final class vk7 extends qf6 {
    public final zsp0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vk7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(r0);
        zsp0 zsp0Var = new zsp0(viewGroup.getContext(), null, 0);
        zsp0Var.setOrientation(1);
        zsp0Var.setBackgroundResource(R.drawable.tutorial_banner_background);
        int a = iah0.a(12);
        zsp0Var.setPadding(a, a, a, a);
        zsp0Var.setId(View.generateViewId());
        zsp0Var.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), -2));
        View view = this.itemView;
        this.l = (zsp0) view;
        bwt0.i0(view, new u8(bonusCatalogFragment, 8));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        wk7 wk7Var = (wk7) hfzVar;
        this.l.setContent(new zsp0.a(tq.h(tlo0.Companion, wk7Var.c), new tlo0.f(wk7Var.d), new zsp0.a.C4198a(wk7Var.e)));
    }
}
