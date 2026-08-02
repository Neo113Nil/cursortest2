package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import android.graphics.Color;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.bm50;
import defpackage.hk80;
import defpackage.ho4;
import defpackage.k7v;
import defpackage.kdc;
import defpackage.mia1;
import defpackage.nac;
import defpackage.tls;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class OrganizationPreviewV2ViewHolder$bind$2$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        hk80 hk80Var = (hk80) obj;
        a aVar = (a) this.receiver;
        ho4 ho4Var = (ho4) aVar.c0.invoke();
        GoImageView goImageView = (GoImageView) ho4Var.b;
        RobotoTextView robotoTextView = (RobotoTextView) ho4Var.d;
        GoLinearLayout goLinearLayout = (GoLinearLayout) ho4Var.c;
        goImageView.setVisibility(8);
        String str = hk80Var.c;
        String str2 = hk80Var.b;
        k7v k7vVar = hk80Var.d;
        String str3 = hk80Var.e;
        if (str.length() > 0) {
            c.z(new bm50(16, aVar, hk80Var), goLinearLayout);
        }
        kdc kdcVar = hk80Var.f;
        if (kdcVar != null) {
            robotoTextView.setTextColor(kdcVar);
        }
        if (str3.length() > 0) {
            goLinearLayout.setBackgroundColor(Color.parseColor(str3));
        }
        if (k7vVar != null) {
            goImageView.setVisibility(0);
            ((nac) aVar.U.a(goImageView)).c(k7vVar.a);
        }
        goLinearLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(((Number) aVar.f0.getValue()).intValue()));
        goLinearLayout.setClipToOutline(true);
        robotoTextView.setText(str2.toUpperCase(Locale.ROOT));
        goLinearLayout.setContentDescription(str2);
        mia1.c(goLinearLayout);
        return goLinearLayout;
    }
}
