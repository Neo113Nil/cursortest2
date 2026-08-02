package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import defpackage.i3y;
import defpackage.p7c;
import defpackage.phl;
import defpackage.ql40;
import defpackage.rvo;
import defpackage.sls;
import defpackage.yfl;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class a {
    public final View a;
    public final rvo b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final i3y e = kotlin.a.a(new sls() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$singleLineRenderer$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            a aVar = a.this;
            return new ql40(aVar.a, aVar.b, 1);
        }
    });
    public final i3y f = kotlin.a.a(new sls() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$multiLineRenderer$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            a aVar = a.this;
            return new ql40(aVar.a, aVar.b, 0);
        }
    });
    public final i3y g = kotlin.a.a(new sls() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$cloudBackgroundRenderer$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return new p7c(a.this.a.getContext(), a.this.b);
        }
    });

    public a(DivLineHeightTextView divLineHeightTextView, rvo rvoVar) {
        this.a = divLineHeightTextView;
        this.b = rvoVar;
    }

    public final void a(DivBackgroundSpan divBackgroundSpan, boolean z) {
        if (z) {
            this.d.add(divBackgroundSpan);
        } else {
            this.c.add(divBackgroundSpan);
        }
    }

    public final void b(DivBackgroundSpan divBackgroundSpan, Canvas canvas, Spanned spanned, Layout layout) {
        int spanStart = spanned.getSpanStart(divBackgroundSpan);
        int spanEnd = spanned.getSpanEnd(divBackgroundSpan);
        if (spanStart < 0 || spanEnd < 0 || spanStart >= spanEnd) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        int primaryHorizontal = (int) layout.getPrimaryHorizontal(spanStart);
        int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(spanEnd);
        if (divBackgroundSpan.getBackground() instanceof yfl) {
            ((p7c) this.g.getValue()).a(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan);
        } else {
            (lineForOffset == lineForOffset2 ? (phl) this.e.getValue() : (phl) this.f.getValue()).a(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan);
        }
    }

    public final void c(Canvas canvas, Spanned spanned, Layout layout) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            b((DivBackgroundSpan) it.next(), canvas, spanned, layout);
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            b((DivBackgroundSpan) it2.next(), canvas, spanned, layout);
        }
    }

    public final boolean d() {
        return (this.c.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    public final void e(boolean z) {
        if (z) {
            this.d.clear();
        } else {
            this.c.clear();
        }
    }
}
