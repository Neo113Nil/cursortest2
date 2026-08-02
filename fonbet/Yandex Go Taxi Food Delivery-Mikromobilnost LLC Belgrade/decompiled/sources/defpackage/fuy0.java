package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.widget.TextView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.spannable.ImageSpan;
import com.yandex.div.internal.widget.TextViewWithAccessibleSpans;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fuy0 extends xso {
    public final /* synthetic */ TextViewWithAccessibleSpans G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuy0(TextViewWithAccessibleSpans textViewWithAccessibleSpans) {
        super(textViewWithAccessibleSpans);
        this.G = textViewWithAccessibleSpans;
    }

    @Override // defpackage.xso
    public final int e(float f, float f2) {
        List list;
        RectF rectF = new RectF();
        list = this.G.accessibleImageSpans;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ((ImageSpan) obj).getBoundsInText(rectF).offset(r7.getPaddingLeft(), r7.getPaddingTop());
            if (rectF.contains(f, f2)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // defpackage.xso
    public final void f(ArrayList arrayList) {
        List list;
        list = this.G.accessibleImageSpans;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(Integer.valueOf(i));
            i = i2;
        }
    }

    @Override // defpackage.xso
    public final boolean k(int i, int i2, Bundle bundle) {
        afv accessibility;
        int0 int0Var;
        ImageSpan q = q(i);
        if (q == null || (accessibility = q.getAccessibility()) == null || (int0Var = accessibility.c) == null || i2 != 16) {
            return false;
        }
        ((Div2View) int0Var.a).getDiv2Component().o().a((aw5) int0Var.b, (TextView) int0Var.c, (List) int0Var.d);
        return true;
    }

    @Override // defpackage.xso
    public final void m(int i, wh whVar) {
        String str;
        ImageSpan q = q(i);
        if (q == null) {
            return;
        }
        afv accessibility = q.getAccessibility();
        if (accessibility == null || (str = accessibility.a) == null) {
            str = "";
        }
        whVar.p(str);
        TextViewWithAccessibleSpans textViewWithAccessibleSpans = this.G;
        whVar.z(textViewWithAccessibleSpans.getContext().getPackageName());
        Rect boundsInText = q.getBoundsInText(new Rect());
        boundsInText.offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
        afv accessibility2 = q.getAccessibility();
        whVar.t(accessibility2 != null ? accessibility2.b : null);
        afv accessibility3 = q.getAccessibility();
        if ((accessibility3 != null ? accessibility3.c : null) == null) {
            whVar.q(false);
        } else {
            whVar.q(true);
            whVar.a(16);
        }
        whVar.k(boundsInText);
    }

    public final ImageSpan q(int i) {
        List list;
        List list2;
        List list3;
        if (i == -1) {
            return null;
        }
        TextViewWithAccessibleSpans textViewWithAccessibleSpans = this.G;
        list = textViewWithAccessibleSpans.accessibleImageSpans;
        if (list.size() == 0) {
            return null;
        }
        list2 = textViewWithAccessibleSpans.accessibleImageSpans;
        if (i >= list2.size() || i < 0) {
            return null;
        }
        list3 = textViewWithAccessibleSpans.accessibleImageSpans;
        return (ImageSpan) list3.get(i);
    }
}
