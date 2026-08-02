package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ny61;
import defpackage.u1w;

/* loaded from: classes2.dex */
public final class a33 implements b33 {
    public static final a33 b = new a33(0);
    public static final a33 c = new a33(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a33(int i) {
        this.a = i;
    }

    @Override // defpackage.b33
    public final w23 a(final View view) {
        switch (this.a) {
            case 0:
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                final int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                final int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                final int i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                final int i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
                final int i5 = 0;
                return new w23() { // from class: z23
                    @Override // defpackage.w23
                    public final void a(final u1w u1wVar) {
                        switch (i5) {
                            case 0:
                                final View view2 = view;
                                boolean isLaidOut = view2.isLaidOut();
                                final int i6 = i;
                                final int i7 = i2;
                                final int i8 = i3;
                                final int i9 = i4;
                                if (isLaidOut && !view2.isLayoutRequested()) {
                                    ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                                    if (layoutParams5 == null) {
                                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        break;
                                    } else {
                                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                                        marginLayoutParams5.setMargins(i6 + u1wVar.a, i7 + u1wVar.b, i8 + u1wVar.c, i9 + u1wVar.d);
                                        view2.setLayoutParams(marginLayoutParams5);
                                        break;
                                    }
                                } else {
                                    view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.core.insets.ApplyInsetsStrategy$Margin$createApplier$lambda$2$$inlined$doOnLayout$1
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public void onLayoutChange(View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                            view3.removeOnLayoutChangeListener(this);
                                            View view4 = view2;
                                            ViewGroup.LayoutParams layoutParams6 = view4.getLayoutParams();
                                            if (layoutParams6 == null) {
                                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                return;
                                            }
                                            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                                            int i10 = i6;
                                            u1w u1wVar2 = u1wVar;
                                            marginLayoutParams6.setMargins(i10 + u1wVar2.a, i7 + u1wVar2.b, i8 + u1wVar2.c, i9 + u1wVar2.d);
                                            view4.setLayoutParams(marginLayoutParams6);
                                        }
                                    });
                                    break;
                                }
                            default:
                                view.setPadding(i + u1wVar.a, i2 + u1wVar.b, i3 + u1wVar.c, i4 + u1wVar.d);
                                break;
                        }
                    }
                };
            default:
                final int paddingLeft = view.getPaddingLeft();
                final int paddingTop = view.getPaddingTop();
                final int paddingRight = view.getPaddingRight();
                final int paddingBottom = view.getPaddingBottom();
                final int i6 = 1;
                return new w23() { // from class: z23
                    @Override // defpackage.w23
                    public final void a(final u1w u1wVar) {
                        switch (i6) {
                            case 0:
                                final View view2 = view;
                                boolean isLaidOut = view2.isLaidOut();
                                final int i62 = paddingLeft;
                                final int i7 = paddingTop;
                                final int i8 = paddingRight;
                                final int i9 = paddingBottom;
                                if (isLaidOut && !view2.isLayoutRequested()) {
                                    ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                                    if (layoutParams5 == null) {
                                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        break;
                                    } else {
                                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                                        marginLayoutParams5.setMargins(i62 + u1wVar.a, i7 + u1wVar.b, i8 + u1wVar.c, i9 + u1wVar.d);
                                        view2.setLayoutParams(marginLayoutParams5);
                                        break;
                                    }
                                } else {
                                    view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.core.insets.ApplyInsetsStrategy$Margin$createApplier$lambda$2$$inlined$doOnLayout$1
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public void onLayoutChange(View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                            view3.removeOnLayoutChangeListener(this);
                                            View view4 = view2;
                                            ViewGroup.LayoutParams layoutParams6 = view4.getLayoutParams();
                                            if (layoutParams6 == null) {
                                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                return;
                                            }
                                            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                                            int i10 = i62;
                                            u1w u1wVar2 = u1wVar;
                                            marginLayoutParams6.setMargins(i10 + u1wVar2.a, i7 + u1wVar2.b, i8 + u1wVar2.c, i9 + u1wVar2.d);
                                            view4.setLayoutParams(marginLayoutParams6);
                                        }
                                    });
                                    break;
                                }
                            default:
                                view.setPadding(paddingLeft + u1wVar.a, paddingTop + u1wVar.b, paddingRight + u1wVar.c, paddingBottom + u1wVar.d);
                                break;
                        }
                    }
                };
        }
    }
}
