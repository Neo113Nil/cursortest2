package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.navigation.NavigationBarView;
import com.lightside.visum.layouts.constraint.ChainStyle;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.yandex.passport.R;
import com.yandex.passport.internal.badges.MaxLinesChipGroup;
import com.yandex.passport.internal.ui.bouncer.roundabout.c0;
import defpackage.d8e;
import defpackage.l7e;
import defpackage.li91;
import defpackage.n7e;
import defpackage.ny61;
import defpackage.p7e;
import defpackage.t7e;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uc20;
import defpackage.uw51;
import defpackage.wj91;
import defpackage.y4h0;
import defpackage.yw41;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class f extends l7e {
    public final MaxLinesChipGroup A;
    public final Space B;
    public final ContextThemeWrapper w;
    public final ImageView x;
    public final TextView y;
    public final TextView z;

    public f(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.w = contextThemeWrapper;
        View view = (View) AccountUi$special$$inlined$imageView$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view);
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.passport_icon_user_unknown);
        this.x = imageView;
        View view2 = (View) AccountUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view2);
        TextView textView = (TextView) view2;
        textView.setId(R.id.passport_roundabout_account_title);
        c0.a.a(textView);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        textView.setTextDirection(5);
        this.y = textView;
        View view3 = (View) AccountUi$special$$inlined$textView$default$2.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view3);
        TextView textView2 = (TextView) view3;
        textView2.setId(R.id.passport_roundabout_account_subtitle);
        c0.b.getClass();
        textView2.setTextSize(14.0f);
        li91.l(textView2, R.color.passport_roundabout_text_secondary);
        li91.k(textView2, y4h0.ys_text_regular);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(2);
        textView2.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.z = textView2;
        View view4 = (View) AccountUi$special$$inlined$view$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view4);
        MaxLinesChipGroup maxLinesChipGroup = (MaxLinesChipGroup) view4;
        maxLinesChipGroup.setId(R.id.passport_roundabout_order_flow);
        maxLinesChipGroup.setMaxLines(2);
        maxLinesChipGroup.setChipSpacing((int) (4.0f * uc20.a.density));
        this.A = maxLinesChipGroup;
        View view5 = (View) AccountUi$special$$inlined$space$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view5);
        this.B = (Space) view5;
    }

    @Override // defpackage.l7e
    public final void a(final ConstraintSetBuilder constraintSetBuilder) {
        com.yandex.passport.internal.ui.bouncer.error.b bVar = new com.yandex.passport.internal.ui.bouncer.error.b(5, constraintSetBuilder);
        ImageView imageView = this.x;
        constraintSetBuilder.A(bVar, imageView);
        int id = imageView.getId();
        final int i = 2;
        d8e d8eVar = new d8e(id, 2);
        int id2 = imageView.getId();
        t7e t7eVar = new t7e(id2, 2);
        ChainStyle chainStyle = ChainStyle.PACKED;
        yw41 yw41Var = new yw41();
        TextView textView = this.z;
        Integer valueOf = Integer.valueOf(textView.getId());
        Float valueOf2 = Float.valueOf(1.0f);
        Pair pair = new Pair(valueOf, valueOf2);
        ArrayList arrayList = yw41Var.a;
        arrayList.add(pair);
        TextView textView2 = this.y;
        arrayList.add(new Pair(Integer.valueOf(textView2.getId()), valueOf2));
        int e = d8eVar.e();
        int e2 = t7eVar.e();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) ((Pair) it.next()).c()).intValue()));
        }
        int[] I0 = kotlin.collections.a.I0(arrayList2);
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(((Number) ((Pair) it2.next()).f()).floatValue()));
        }
        float[] G0 = kotlin.collections.a.G0(arrayList3);
        int value = chainStyle.getValue();
        if (I0.length < 2) {
            ny61.g("must have 2 or more widgets in a chain");
            return;
        }
        if (G0.length != I0.length) {
            ny61.g("must have 2 or more widgets in a chain");
            return;
        }
        final int i2 = 0;
        constraintSetBuilder.o(I0[0]).e.U = G0[0];
        constraintSetBuilder.o(I0[0]).e.X = value;
        constraintSetBuilder.j(I0[0], 3, id, e, 0);
        final int i3 = 1;
        int i4 = 1;
        while (i4 < I0.length) {
            int i5 = i4 - 1;
            int i6 = i4;
            constraintSetBuilder.j(I0[i4], 3, I0[i5], 4, 0);
            constraintSetBuilder.j(I0[i5], 4, I0[i6], 3, 0);
            constraintSetBuilder.o(I0[i6]).e.U = G0[i6];
            i4 = i6 + 1;
        }
        constraintSetBuilder.j(I0[I0.length - 1], 4, id2, e2, 0);
        constraintSetBuilder.A(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.items.e
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i7 = i2;
                zy11 zy11Var = zy11.a;
                f fVar = this;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i7) {
                    case 0:
                        cVar.d(0);
                        cVar.c(-2);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        Pair pair2 = new Pair(side, side);
                        ImageView imageView2 = fVar.x;
                        n7e b = cVar.b(pair2, imageView2);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.END;
                        n7e b2 = cVar.b(new Pair(side2, side3), imageView2);
                        DisplayMetrics displayMetrics = uc20.a;
                        int i8 = (int) (displayMetrics.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(b, ConstraintSetBuilder.B(b2, i8), ConstraintSetBuilder.B(uw51.d(side3, side3, cVar, 0), (int) (12.0f * displayMetrics.density)), ConstraintSetBuilder.B(cVar.b(new Pair(ConstraintSetBuilder.Side.BOTTOM, side), fVar.z), (int) (2.0f * displayMetrics.density)));
                        break;
                    case 1:
                        cVar.d(0);
                        cVar.c(-2);
                        cVar.b.x(cVar.a, 0);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.TOP;
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.BOTTOM;
                        n7e b3 = cVar.b(new Pair(side4, side5), fVar.y);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.START;
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.END;
                        Pair pair3 = new Pair(side6, side7);
                        ImageView imageView3 = fVar.x;
                        n7e b4 = cVar.b(pair3, imageView3);
                        DisplayMetrics displayMetrics2 = uc20.a;
                        int i9 = (int) (displayMetrics2.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(b3, ConstraintSetBuilder.B(b4, i9), ConstraintSetBuilder.B(uw51.d(side7, side7, cVar, 0), (int) (12.0f * displayMetrics2.density)), cVar.b(new Pair(side5, side5), imageView3));
                        break;
                    default:
                        cVar.d(0);
                        cVar.c(-2);
                        n7e b5 = cVar.b(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), fVar.x);
                        DisplayMetrics displayMetrics3 = uc20.a;
                        int i10 = (int) (displayMetrics3.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        p7e B = ConstraintSetBuilder.B(b5, i10);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.START;
                        p7e B2 = ConstraintSetBuilder.B(uw51.d(side8, side8, cVar, 0), (int) (displayMetrics3.density * 12.0f));
                        ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B, B2, ConstraintSetBuilder.B(uw51.d(side9, side9, cVar, 0), (int) (12.0f * displayMetrics3.density)));
                        break;
                }
                return zy11Var;
            }
        }, textView2);
        constraintSetBuilder.A(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.items.e
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i7 = i3;
                zy11 zy11Var = zy11.a;
                f fVar = this;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i7) {
                    case 0:
                        cVar.d(0);
                        cVar.c(-2);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        Pair pair2 = new Pair(side, side);
                        ImageView imageView2 = fVar.x;
                        n7e b = cVar.b(pair2, imageView2);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.END;
                        n7e b2 = cVar.b(new Pair(side2, side3), imageView2);
                        DisplayMetrics displayMetrics = uc20.a;
                        int i8 = (int) (displayMetrics.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(b, ConstraintSetBuilder.B(b2, i8), ConstraintSetBuilder.B(uw51.d(side3, side3, cVar, 0), (int) (12.0f * displayMetrics.density)), ConstraintSetBuilder.B(cVar.b(new Pair(ConstraintSetBuilder.Side.BOTTOM, side), fVar.z), (int) (2.0f * displayMetrics.density)));
                        break;
                    case 1:
                        cVar.d(0);
                        cVar.c(-2);
                        cVar.b.x(cVar.a, 0);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.TOP;
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.BOTTOM;
                        n7e b3 = cVar.b(new Pair(side4, side5), fVar.y);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.START;
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.END;
                        Pair pair3 = new Pair(side6, side7);
                        ImageView imageView3 = fVar.x;
                        n7e b4 = cVar.b(pair3, imageView3);
                        DisplayMetrics displayMetrics2 = uc20.a;
                        int i9 = (int) (displayMetrics2.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(b3, ConstraintSetBuilder.B(b4, i9), ConstraintSetBuilder.B(uw51.d(side7, side7, cVar, 0), (int) (12.0f * displayMetrics2.density)), cVar.b(new Pair(side5, side5), imageView3));
                        break;
                    default:
                        cVar.d(0);
                        cVar.c(-2);
                        n7e b5 = cVar.b(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), fVar.x);
                        DisplayMetrics displayMetrics3 = uc20.a;
                        int i10 = (int) (displayMetrics3.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        p7e B = ConstraintSetBuilder.B(b5, i10);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.START;
                        p7e B2 = ConstraintSetBuilder.B(uw51.d(side8, side8, cVar, 0), (int) (displayMetrics3.density * 12.0f));
                        ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B, B2, ConstraintSetBuilder.B(uw51.d(side9, side9, cVar, 0), (int) (12.0f * displayMetrics3.density)));
                        break;
                }
                return zy11Var;
            }
        }, textView);
        tls tlsVar = new tls() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.items.e
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i7 = i;
                zy11 zy11Var = zy11.a;
                f fVar = this;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i7) {
                    case 0:
                        cVar.d(0);
                        cVar.c(-2);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        Pair pair2 = new Pair(side, side);
                        ImageView imageView2 = fVar.x;
                        n7e b = cVar.b(pair2, imageView2);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.END;
                        n7e b2 = cVar.b(new Pair(side2, side3), imageView2);
                        DisplayMetrics displayMetrics = uc20.a;
                        int i8 = (int) (displayMetrics.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(b, ConstraintSetBuilder.B(b2, i8), ConstraintSetBuilder.B(uw51.d(side3, side3, cVar, 0), (int) (12.0f * displayMetrics.density)), ConstraintSetBuilder.B(cVar.b(new Pair(ConstraintSetBuilder.Side.BOTTOM, side), fVar.z), (int) (2.0f * displayMetrics.density)));
                        break;
                    case 1:
                        cVar.d(0);
                        cVar.c(-2);
                        cVar.b.x(cVar.a, 0);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.TOP;
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.BOTTOM;
                        n7e b3 = cVar.b(new Pair(side4, side5), fVar.y);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.START;
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.END;
                        Pair pair3 = new Pair(side6, side7);
                        ImageView imageView3 = fVar.x;
                        n7e b4 = cVar.b(pair3, imageView3);
                        DisplayMetrics displayMetrics2 = uc20.a;
                        int i9 = (int) (displayMetrics2.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(b3, ConstraintSetBuilder.B(b4, i9), ConstraintSetBuilder.B(uw51.d(side7, side7, cVar, 0), (int) (12.0f * displayMetrics2.density)), cVar.b(new Pair(side5, side5), imageView3));
                        break;
                    default:
                        cVar.d(0);
                        cVar.c(-2);
                        n7e b5 = cVar.b(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), fVar.x);
                        DisplayMetrics displayMetrics3 = uc20.a;
                        int i10 = (int) (displayMetrics3.density * 12.0f);
                        constraintSetBuilder2.getClass();
                        p7e B = ConstraintSetBuilder.B(b5, i10);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.START;
                        p7e B2 = ConstraintSetBuilder.B(uw51.d(side8, side8, cVar, 0), (int) (displayMetrics3.density * 12.0f));
                        ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B, B2, ConstraintSetBuilder.B(uw51.d(side9, side9, cVar, 0), (int) (12.0f * displayMetrics3.density)));
                        break;
                }
                return zy11Var;
            }
        };
        MaxLinesChipGroup maxLinesChipGroup = this.A;
        constraintSetBuilder.A(tlsVar, maxLinesChipGroup);
        com.lightside.visum.layouts.constraint.c cVar = new com.lightside.visum.layouts.constraint.c(this.B.getId(), constraintSetBuilder);
        cVar.d(0);
        cVar.c(0);
        constraintSetBuilder.z(ConstraintSetBuilder.B(cVar.b(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), maxLinesChipGroup), (int) (12.0f * uc20.a.density)));
    }

    @Override // defpackage.l7e
    public final void c(ConstraintLayout constraintLayout) {
        constraintLayout.setClickable(true);
        constraintLayout.setBackgroundResource(R.drawable.passport_roundabout_account);
        constraintLayout.setClipToPadding(true);
    }
}
