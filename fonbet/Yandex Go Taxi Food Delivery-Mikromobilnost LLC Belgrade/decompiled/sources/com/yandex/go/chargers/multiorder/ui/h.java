package com.yandex.go.chargers.multiorder.ui;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoImageView;
import defpackage.h4a;
import defpackage.lys;
import defpackage.ny61;
import defpackage.pav;
import defpackage.r5a;
import defpackage.zo31;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class h extends lys {
    public static final /* synthetic */ int T = 0;
    public final pav S;

    public h(h4a h4aVar, pav pavVar) {
        super(h4aVar);
        this.S = pavVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        r5a r5aVar = (r5a) obj;
        h4a h4aVar = (h4a) ((zo31) this.R);
        RobotoTextView robotoTextView = h4aVar.d;
        CharSequence charSequence = r5aVar.b;
        boolean z = r5aVar.f;
        robotoTextView.setText(charSequence);
        h4aVar.e.setText(r5aVar.c);
        h4aVar.f.setVisibility(r5aVar.e ? 0 : 8);
        h4aVar.b.setVisibility(z ? 0 : 8);
        GoImageView goImageView = h4aVar.c;
        ViewGroup.LayoutParams layoutParams = goImageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        View view = this.a;
        marginLayoutParams.setMarginEnd(z ? ru.yandex.taxi.design.utils.c.h(4, view) : ru.yandex.taxi.design.utils.c.h(8, view));
        goImageView.setLayoutParams(marginLayoutParams);
        Z(new LeasingViewHolder$bindImageLoading$1(this, r5aVar, null), "IMAGE_LOADING_TASK_KEY", true);
    }
}
