package com.yandex.div.core.widget;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import defpackage.gpl;
import defpackage.u0u;
import defpackage.w0u;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu0u;", "cell", "Landroid/view/View;", "view", "Lw0u;", "invoke", "(Lu0u;Landroid/view/View;)Lw0u;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class GridContainer$Grid$measureRows$1 extends Lambda implements wls {
    public static final GridContainer$Grid$measureRows$1 w = new GridContainer$Grid$measureRows$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        u0u u0uVar = (u0u) obj;
        View view = (View) obj2;
        gpl gplVar = DivViewGroup.Companion;
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        return new w0u(u0uVar.c, view.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin, u0uVar.e, divLayoutParams.getVerticalWeight());
    }
}
