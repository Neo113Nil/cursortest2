package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lightside.slab.SlotView;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.yandex.passport.R;
import com.yandex.passport.internal.flags.presentation.s0;
import defpackage.l7e;
import defpackage.uc20;
import defpackage.wj91;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class s extends l7e {
    public final RecyclerView w;
    public final ImageView x;
    public final com.lightside.slab.c y;
    public final TextView z;

    public s(Activity activity, l lVar) {
        super(activity);
        View view = (View) RoundaboutInnerUi$special$$inlined$recyclerView$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view);
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setAdapter(lVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.a));
        this.w = recyclerView;
        View view2 = (View) RoundaboutInnerUi$special$$inlined$imageView$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view2);
        ImageView imageView = (ImageView) view2;
        imageView.setContentDescription(imageView.getContext().getResources().getString(R.string.passport_roundabout_close_button_description));
        imageView.setImageResource(R.drawable.passport_roundabout_close);
        imageView.setBackgroundResource(R.drawable.passport_roundabout_ripple_unbound);
        this.x = imageView;
        SlotView slotView = new SlotView(wj91.e(0, this.a), null, 0, 0);
        addToParent(slotView);
        this.y = new com.lightside.slab.c(slotView);
        View view3 = (View) RoundaboutInnerUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view3);
        TextView textView = (TextView) view3;
        textView.setText(R.string.passport_accounts_select_text_to_enter);
        c0.a.a(textView);
        textView.setGravity(17);
        int i = (int) (24.0f * uc20.a.density);
        textView.setPadding(i, textView.getPaddingTop(), i, textView.getPaddingBottom());
        this.z = textView;
    }

    @Override // defpackage.l7e
    public final void a(ConstraintSetBuilder constraintSetBuilder) {
        constraintSetBuilder.A(new com.yandex.passport.internal.ui.bouncer.error.b(2, constraintSetBuilder), this.x);
        constraintSetBuilder.A(new com.yandex.passport.internal.ui.bouncer.error.b(3, constraintSetBuilder), this.y.a);
        constraintSetBuilder.A(new com.yandex.passport.internal.ui.bouncer.error.b(4, constraintSetBuilder), this.z);
        constraintSetBuilder.A(new s0(14, constraintSetBuilder, this), this.w);
    }

    @Override // defpackage.l7e
    public final void c(ConstraintLayout constraintLayout) {
        com.yandex.passport.internal.ui.a aVar = new com.yandex.passport.internal.ui.a(7, constraintLayout);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(constraintLayout, aVar);
    }
}
