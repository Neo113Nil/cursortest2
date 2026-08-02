package com.yandex.div.core.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "Lzy11;", "invoke", "(Landroidx/recyclerview/widget/RecyclerView;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class ViewPager2Wrapper$orientation$1 extends Lambda implements tls {
    public static final ViewPager2Wrapper$orientation$1 w = new ViewPager2Wrapper$orientation$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        RecyclerView recyclerView = (RecyclerView) obj;
        recyclerView.getRecycledViewPool().a();
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return zy11.a;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return null;
            }
            childAt.setTranslationX(0.0f);
            childAt.setTranslationY(0.0f);
            i = i2;
        }
    }
}
