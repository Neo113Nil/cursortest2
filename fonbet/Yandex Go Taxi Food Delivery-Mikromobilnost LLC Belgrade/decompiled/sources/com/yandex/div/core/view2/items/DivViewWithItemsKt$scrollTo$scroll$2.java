package com.yandex.div.core.view2.items;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class DivViewWithItemsKt$scrollTo$scroll$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((RecyclerView) this.receiver).scrollBy(((Number) obj).intValue(), ((Number) obj2).intValue());
        return zy11.a;
    }
}
