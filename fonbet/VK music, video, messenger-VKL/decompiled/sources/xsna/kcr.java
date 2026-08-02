package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.group.FilterButtonVh;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class kcr implements gzs<s3q0> {
    public final /* synthetic */ View b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ FilterButtonVh e;
    public final /* synthetic */ String f;

    public kcr(View view, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, FilterButtonVh filterButtonVh, String str) {
        this.b = view;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = filterButtonVh;
        this.f = str;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        View view = this.b;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            FilterButtonVh filterButtonVh = this.e;
            TextView textView = filterButtonVh.e;
            if (textView == null) {
                textView = null;
            }
            float measureText = textView.getPaint().measureText(this.f);
            TextView textView2 = filterButtonVh.e;
            if (textView2 == null) {
                textView2 = null;
            }
            float paddingLeft = measureText + textView2.getPaddingLeft();
            TextView textView3 = filterButtonVh.e;
            if (textView3 == null) {
                textView3 = null;
            }
            float paddingRight = paddingLeft + textView3.getPaddingRight();
            TextView textView4 = filterButtonVh.e;
            if (textView4 == null) {
                textView4 = null;
            }
            ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
            float f = paddingRight + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r3.leftMargin : 0);
            TextView textView5 = filterButtonVh.e;
            if (textView5 == null) {
                textView5 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = textView5.getLayoutParams();
            float f2 = f + ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r3.rightMargin : 0);
            View view2 = filterButtonVh.c;
            if (view2 == null) {
                view2 = null;
            }
            int paddingLeft2 = view2.getPaddingLeft();
            View view3 = filterButtonVh.c;
            if (view3 == null) {
                view3 = null;
            }
            int paddingRight2 = view3.getPaddingRight() + paddingLeft2;
            TextView textView6 = filterButtonVh.d;
            if (textView6 == null) {
                textView6 = null;
            }
            ViewGroup.LayoutParams layoutParams3 = textView6.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i2 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
            TextView textView7 = filterButtonVh.d;
            if (textView7 == null) {
                textView7 = null;
            }
            ViewGroup.LayoutParams layoutParams4 = textView7.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            int i3 = i2 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            TextView textView8 = filterButtonVh.d;
            if (textView8 == null) {
                textView8 = null;
            }
            View view4 = filterButtonVh.c;
            textView8.setMaxWidth((view4 != null ? view4 : null).getMeasuredWidth() - an10.b((f2 + paddingRight2) + i3));
        }
        return s3q0.a;
    }
}
