package com.yandex.passport.internal.ui.bouncer.error;

import android.app.Activity;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.yandex.passport.R;
import defpackage.l7e;
import defpackage.li91;
import defpackage.n7e;
import defpackage.p7e;
import defpackage.tls;
import defpackage.uc20;
import defpackage.uw51;
import defpackage.wj91;
import defpackage.y4h0;
import defpackage.zy11;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class d extends l7e {
    public final TextView A;
    public final TextView B;
    public final ImageView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public d(Activity activity) {
        super(activity);
        View view = (View) ErrorSlabDetailsUi$special$$inlined$imageView$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        addToParent(view);
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.passport_error_slab_copy);
        this.w = imageView;
        int i = R.id.passport_error_slab_hint;
        View view2 = (View) ErrorSlabDetailsUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        if (i != -1) {
            view2.setId(i);
        }
        addToParent(view2);
        TextView textView = (TextView) view2;
        textView.setText(R.string.passport_error_slab_hint_text);
        m.a.getClass();
        textView.setTextSize(14.0f);
        li91.l(textView, R.color.passport_error_slab_text_secondary);
        li91.k(textView, y4h0.ya_regular);
        textView.setLineSpacing(TypedValue.applyDimension(2, 1.0f, uc20.a), textView.getLineSpacingMultiplier());
        this.x = textView;
        int i2 = R.id.passport_error_slab_datetime;
        View view3 = (View) ErrorSlabDetailsUi$special$$inlined$textView$default$2.b.invoke(wj91.e(0, this.a), 0, 0);
        if (i2 != -1) {
            view3.setId(i2);
        }
        addToParent(view3);
        TextView textView2 = (TextView) view3;
        l lVar = m.b;
        lVar.a(textView2);
        this.y = textView2;
        int i3 = R.id.passport_error_slab_app_id;
        View view4 = (View) ErrorSlabDetailsUi$special$$inlined$textView$default$3.b.invoke(wj91.e(0, this.a), 0, 0);
        if (i3 != -1) {
            view4.setId(i3);
        }
        addToParent(view4);
        TextView textView3 = (TextView) view4;
        lVar.a(textView3);
        this.z = textView3;
        int i4 = R.id.passport_error_slab_details;
        View view5 = (View) ErrorSlabDetailsUi$special$$inlined$textView$default$4.b.invoke(wj91.e(0, this.a), 0, 0);
        if (i4 != -1) {
            view5.setId(i4);
        }
        addToParent(view5);
        TextView textView4 = (TextView) view5;
        lVar.a(textView4);
        textView4.setMaxLines(3);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        this.A = textView4;
        int i5 = R.id.passport_error_slab_device_id;
        View view6 = (View) ErrorSlabDetailsUi$special$$inlined$textView$default$5.b.invoke(wj91.e(0, this.a), 0, 0);
        if (i5 != -1) {
            view6.setId(i5);
        }
        addToParent(view6);
        TextView textView5 = (TextView) view6;
        lVar.a(textView5);
        this.B = textView5;
    }

    @Override // defpackage.l7e
    public final void a(final ConstraintSetBuilder constraintSetBuilder) {
        final int i = 0;
        constraintSetBuilder.A(new b(i, constraintSetBuilder), this.w);
        constraintSetBuilder.A(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.error.c
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                d dVar = this;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i2) {
                    case 0:
                        cVar.d(0);
                        cVar.c(-2);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        n7e d = uw51.d(side, side, cVar, 0);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                        n7e d2 = uw51.d(side2, side2, cVar, 0);
                        n7e b = cVar.b(new Pair(ConstraintSetBuilder.Side.END, side2), dVar.w);
                        int i3 = (int) (15.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(d, d2, ConstraintSetBuilder.B(b, i3));
                        break;
                    case 1:
                        cVar.d(0);
                        cVar.c(-2);
                        cVar.b.x(cVar.a, 0);
                        Pair pair = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView = dVar.x;
                        n7e b2 = cVar.b(pair, textView);
                        int i4 = (int) (16.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B = ConstraintSetBuilder.B(b2, i4);
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                        n7e b3 = cVar.b(new Pair(side3, side3), textView);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B, b3, uw51.d(side4, side4, cVar, 0));
                        break;
                    case 2:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair2 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView2 = dVar.y;
                        n7e b4 = cVar.b(pair2, textView2);
                        int i5 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B2 = ConstraintSetBuilder.B(b4, i5);
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.START;
                        n7e b5 = cVar.b(new Pair(side5, side5), textView2);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B2, b5, uw51.d(side6, side6, cVar, 0));
                        break;
                    case 3:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair3 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView3 = dVar.z;
                        n7e b6 = cVar.b(pair3, textView3);
                        int i6 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B3 = ConstraintSetBuilder.B(b6, i6);
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.START;
                        n7e b7 = cVar.b(new Pair(side7, side7), textView3);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B3, b7, uw51.d(side8, side8, cVar, 0));
                        break;
                    default:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair4 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView4 = dVar.A;
                        n7e b8 = cVar.b(pair4, textView4);
                        int i7 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B4 = ConstraintSetBuilder.B(b8, i7);
                        ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.START;
                        n7e b9 = cVar.b(new Pair(side9, side9), textView4);
                        ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B4, b9, uw51.d(side10, side10, cVar, 0));
                        break;
                }
                return zy11Var;
            }
        }, this.x);
        final int i2 = 1;
        constraintSetBuilder.A(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.error.c
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                d dVar = this;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i22) {
                    case 0:
                        cVar.d(0);
                        cVar.c(-2);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        n7e d = uw51.d(side, side, cVar, 0);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                        n7e d2 = uw51.d(side2, side2, cVar, 0);
                        n7e b = cVar.b(new Pair(ConstraintSetBuilder.Side.END, side2), dVar.w);
                        int i3 = (int) (15.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(d, d2, ConstraintSetBuilder.B(b, i3));
                        break;
                    case 1:
                        cVar.d(0);
                        cVar.c(-2);
                        cVar.b.x(cVar.a, 0);
                        Pair pair = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView = dVar.x;
                        n7e b2 = cVar.b(pair, textView);
                        int i4 = (int) (16.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B = ConstraintSetBuilder.B(b2, i4);
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                        n7e b3 = cVar.b(new Pair(side3, side3), textView);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B, b3, uw51.d(side4, side4, cVar, 0));
                        break;
                    case 2:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair2 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView2 = dVar.y;
                        n7e b4 = cVar.b(pair2, textView2);
                        int i5 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B2 = ConstraintSetBuilder.B(b4, i5);
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.START;
                        n7e b5 = cVar.b(new Pair(side5, side5), textView2);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B2, b5, uw51.d(side6, side6, cVar, 0));
                        break;
                    case 3:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair3 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView3 = dVar.z;
                        n7e b6 = cVar.b(pair3, textView3);
                        int i6 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B3 = ConstraintSetBuilder.B(b6, i6);
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.START;
                        n7e b7 = cVar.b(new Pair(side7, side7), textView3);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B3, b7, uw51.d(side8, side8, cVar, 0));
                        break;
                    default:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair4 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView4 = dVar.A;
                        n7e b8 = cVar.b(pair4, textView4);
                        int i7 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B4 = ConstraintSetBuilder.B(b8, i7);
                        ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.START;
                        n7e b9 = cVar.b(new Pair(side9, side9), textView4);
                        ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B4, b9, uw51.d(side10, side10, cVar, 0));
                        break;
                }
                return zy11Var;
            }
        }, this.y);
        final int i3 = 2;
        constraintSetBuilder.A(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.error.c
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i3;
                zy11 zy11Var = zy11.a;
                d dVar = this;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i22) {
                    case 0:
                        cVar.d(0);
                        cVar.c(-2);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        n7e d = uw51.d(side, side, cVar, 0);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                        n7e d2 = uw51.d(side2, side2, cVar, 0);
                        n7e b = cVar.b(new Pair(ConstraintSetBuilder.Side.END, side2), dVar.w);
                        int i32 = (int) (15.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(d, d2, ConstraintSetBuilder.B(b, i32));
                        break;
                    case 1:
                        cVar.d(0);
                        cVar.c(-2);
                        cVar.b.x(cVar.a, 0);
                        Pair pair = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView = dVar.x;
                        n7e b2 = cVar.b(pair, textView);
                        int i4 = (int) (16.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B = ConstraintSetBuilder.B(b2, i4);
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                        n7e b3 = cVar.b(new Pair(side3, side3), textView);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B, b3, uw51.d(side4, side4, cVar, 0));
                        break;
                    case 2:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair2 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView2 = dVar.y;
                        n7e b4 = cVar.b(pair2, textView2);
                        int i5 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B2 = ConstraintSetBuilder.B(b4, i5);
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.START;
                        n7e b5 = cVar.b(new Pair(side5, side5), textView2);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B2, b5, uw51.d(side6, side6, cVar, 0));
                        break;
                    case 3:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair3 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView3 = dVar.z;
                        n7e b6 = cVar.b(pair3, textView3);
                        int i6 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B3 = ConstraintSetBuilder.B(b6, i6);
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.START;
                        n7e b7 = cVar.b(new Pair(side7, side7), textView3);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B3, b7, uw51.d(side8, side8, cVar, 0));
                        break;
                    default:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair4 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView4 = dVar.A;
                        n7e b8 = cVar.b(pair4, textView4);
                        int i7 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B4 = ConstraintSetBuilder.B(b8, i7);
                        ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.START;
                        n7e b9 = cVar.b(new Pair(side9, side9), textView4);
                        ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B4, b9, uw51.d(side10, side10, cVar, 0));
                        break;
                }
                return zy11Var;
            }
        }, this.z);
        final int i4 = 3;
        constraintSetBuilder.A(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.error.c
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i4;
                zy11 zy11Var = zy11.a;
                d dVar = this;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i22) {
                    case 0:
                        cVar.d(0);
                        cVar.c(-2);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        n7e d = uw51.d(side, side, cVar, 0);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                        n7e d2 = uw51.d(side2, side2, cVar, 0);
                        n7e b = cVar.b(new Pair(ConstraintSetBuilder.Side.END, side2), dVar.w);
                        int i32 = (int) (15.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(d, d2, ConstraintSetBuilder.B(b, i32));
                        break;
                    case 1:
                        cVar.d(0);
                        cVar.c(-2);
                        cVar.b.x(cVar.a, 0);
                        Pair pair = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView = dVar.x;
                        n7e b2 = cVar.b(pair, textView);
                        int i42 = (int) (16.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B = ConstraintSetBuilder.B(b2, i42);
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                        n7e b3 = cVar.b(new Pair(side3, side3), textView);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B, b3, uw51.d(side4, side4, cVar, 0));
                        break;
                    case 2:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair2 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView2 = dVar.y;
                        n7e b4 = cVar.b(pair2, textView2);
                        int i5 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B2 = ConstraintSetBuilder.B(b4, i5);
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.START;
                        n7e b5 = cVar.b(new Pair(side5, side5), textView2);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B2, b5, uw51.d(side6, side6, cVar, 0));
                        break;
                    case 3:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair3 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView3 = dVar.z;
                        n7e b6 = cVar.b(pair3, textView3);
                        int i6 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B3 = ConstraintSetBuilder.B(b6, i6);
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.START;
                        n7e b7 = cVar.b(new Pair(side7, side7), textView3);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B3, b7, uw51.d(side8, side8, cVar, 0));
                        break;
                    default:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair4 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView4 = dVar.A;
                        n7e b8 = cVar.b(pair4, textView4);
                        int i7 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B4 = ConstraintSetBuilder.B(b8, i7);
                        ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.START;
                        n7e b9 = cVar.b(new Pair(side9, side9), textView4);
                        ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B4, b9, uw51.d(side10, side10, cVar, 0));
                        break;
                }
                return zy11Var;
            }
        }, this.A);
        final int i5 = 4;
        constraintSetBuilder.A(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.error.c
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i5;
                zy11 zy11Var = zy11.a;
                d dVar = this;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i22) {
                    case 0:
                        cVar.d(0);
                        cVar.c(-2);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        n7e d = uw51.d(side, side, cVar, 0);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                        n7e d2 = uw51.d(side2, side2, cVar, 0);
                        n7e b = cVar.b(new Pair(ConstraintSetBuilder.Side.END, side2), dVar.w);
                        int i32 = (int) (15.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        constraintSetBuilder2.z(d, d2, ConstraintSetBuilder.B(b, i32));
                        break;
                    case 1:
                        cVar.d(0);
                        cVar.c(-2);
                        cVar.b.x(cVar.a, 0);
                        Pair pair = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView = dVar.x;
                        n7e b2 = cVar.b(pair, textView);
                        int i42 = (int) (16.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B = ConstraintSetBuilder.B(b2, i42);
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                        n7e b3 = cVar.b(new Pair(side3, side3), textView);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B, b3, uw51.d(side4, side4, cVar, 0));
                        break;
                    case 2:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair2 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView2 = dVar.y;
                        n7e b4 = cVar.b(pair2, textView2);
                        int i52 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B2 = ConstraintSetBuilder.B(b4, i52);
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.START;
                        n7e b5 = cVar.b(new Pair(side5, side5), textView2);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B2, b5, uw51.d(side6, side6, cVar, 0));
                        break;
                    case 3:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair3 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView3 = dVar.z;
                        n7e b6 = cVar.b(pair3, textView3);
                        int i6 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B3 = ConstraintSetBuilder.B(b6, i6);
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.START;
                        n7e b7 = cVar.b(new Pair(side7, side7), textView3);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B3, b7, uw51.d(side8, side8, cVar, 0));
                        break;
                    default:
                        cVar.d(0);
                        cVar.c(-2);
                        Pair pair4 = new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM);
                        TextView textView4 = dVar.A;
                        n7e b8 = cVar.b(pair4, textView4);
                        int i7 = (int) (8.0f * uc20.a.density);
                        constraintSetBuilder2.getClass();
                        p7e B4 = ConstraintSetBuilder.B(b8, i7);
                        ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.START;
                        n7e b9 = cVar.b(new Pair(side9, side9), textView4);
                        ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(B4, b9, uw51.d(side10, side10, cVar, 0));
                        break;
                }
                return zy11Var;
            }
        }, this.B);
    }

    @Override // defpackage.l7e
    public final void c(ConstraintLayout constraintLayout) {
        int i = (int) (16.0f * uc20.a.density);
        constraintLayout.setPadding(i, i, i, i);
        constraintLayout.setBackgroundResource(R.drawable.passport_error_slab_details_background);
    }
}
