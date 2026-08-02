package com.yandex.div.core.view2.items;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: DivViewWithItems.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class DivViewWithItemsKt$scrollTo$scroll$2 extends FunctionReferenceImpl implements wzs<Integer, Integer, s3q0> {
    public DivViewWithItemsKt$scrollTo$scroll$2(Object obj) {
        super(2, obj, RecyclerView.class, "scrollBy", "scrollBy(II)V", 0);
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ s3q0 invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return s3q0.a;
    }

    public final void invoke(int i, int i2) {
        ((RecyclerView) this.receiver).scrollBy(i, i2);
    }
}
