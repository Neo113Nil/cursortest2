package com.yandex.div.core.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wzs;

/* compiled from: ViewPager2Wrapper.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class ViewPager2Wrapper$onMeasure$maxHeight$1 extends FunctionReferenceImpl implements wzs<RecyclerView.o, View, Integer> {
    public static final ViewPager2Wrapper$onMeasure$maxHeight$1 INSTANCE = new ViewPager2Wrapper$onMeasure$maxHeight$1();

    public ViewPager2Wrapper$onMeasure$maxHeight$1() {
        super(2, RecyclerView.o.class, "getDecoratedMeasuredHeight", "getDecoratedMeasuredHeight(Landroid/view/View;)I", 0);
    }

    @Override // xsna.wzs
    public final Integer invoke(RecyclerView.o oVar, View view) {
        return Integer.valueOf(oVar.getDecoratedMeasuredHeight(view));
    }
}
