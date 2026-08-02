package com.yandex.go.places.impl.ui.organizations.recycler.viewholders.images;

import android.graphics.PorterDuff;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.ap80;
import defpackage.cj80;
import defpackage.dj80;
import defpackage.dug0;
import defpackage.ej80;
import defpackage.f65;
import defpackage.fj80;
import defpackage.fr;
import defpackage.lys;
import defpackage.pav;
import defpackage.tls;
import defpackage.ud30;
import defpackage.w511;
import defpackage.wj80;
import defpackage.xog0;
import defpackage.xvq;
import defpackage.zo31;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class a extends lys {
    public static final /* synthetic */ int V = 0;
    public final pav S;
    public final xvq T;
    public final tls U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ap80 ap80Var, pav pavVar, xvq xvqVar, tls tlsVar, Integer num, Integer num2, Integer num3) {
        super(ap80Var);
        GoFrameLayout goFrameLayout = ap80Var.a;
        this.S = pavVar;
        this.T = xvqVar;
        this.U = tlsVar;
        if (num != null && num2 != null) {
            c.D(num.intValue(), num2.intValue(), goFrameLayout);
        }
        if (num3 != null) {
            goFrameLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(num3.intValue()));
            goFrameLayout.setClipToOutline(true);
        }
        GoImageView goImageView = ap80Var.b;
        goImageView.setColorFilter(c.a(xog0.discovery_organizations_snippet_v2_icon_tint, this.a), PorterDuff.Mode.SRC_OVER);
        goImageView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(c.d(dug0.organizations_preview_image_icon_size, this.a)));
        goImageView.setClipToOutline(true);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        b0(new OrganizationPreviewImageViewHolder$bind$1((f65) obj, this, null));
    }

    public final void c0(f65 f65Var, fj80 fj80Var) {
        zo31 zo31Var = (zo31) this.R;
        if (fj80Var instanceof dj80) {
            ap80 ap80Var = (ap80) zo31Var;
            OneShotPreDrawListener.add(ap80Var.d, new ud30(7, ap80Var, this, f65Var));
            return;
        }
        if (fj80Var instanceof cj80) {
            ap80 ap80Var2 = (ap80) zo31Var;
            ap80Var2.e.setVisibility(8);
            ap80Var2.f.setVisibility(0);
            ap80Var2.d.setImageBitmap(null);
            c.z(new wj80(this, f65Var, r3), ap80Var2.a);
            return;
        }
        if (!(fj80Var instanceof ej80)) {
            w511.b();
            return;
        }
        ap80 ap80Var3 = (ap80) zo31Var;
        ap80Var3.e.setVisibility(8);
        ap80Var3.f.setVisibility(8);
        int i = 1;
        boolean z = f65Var.a != null;
        ap80Var3.c.setVisibility(z ? 0 : 8);
        ap80Var3.b.setVisibility(z ? 0 : 8);
        fr frVar = f65Var.d;
        GoFrameLayout goFrameLayout = ap80Var3.a;
        if (frVar != null) {
            c.z(new wj80(this, f65Var, i), goFrameLayout);
        } else {
            goFrameLayout.setOnClickListener(null);
        }
    }
}
