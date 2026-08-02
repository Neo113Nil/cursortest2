package com.yandex.div.core.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewPager2Wrapper$onMeasure$maxWidth$1 extends FunctionReferenceImpl implements wls {
    public static final ViewPager2Wrapper$onMeasure$maxWidth$1 b = new ViewPager2Wrapper$onMeasure$maxWidth$1(2, 0, RecyclerView.e.class, "getDecoratedMeasuredWidth", "getDecoratedMeasuredWidth(Landroid/view/View;)I");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((RecyclerView.e) obj).l0((View) obj2));
    }
}
