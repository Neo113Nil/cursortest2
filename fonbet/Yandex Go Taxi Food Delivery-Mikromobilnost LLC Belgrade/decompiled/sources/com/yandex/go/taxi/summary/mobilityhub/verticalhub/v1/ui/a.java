package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b0v;
import defpackage.bys;
import defpackage.d0v;
import defpackage.ec31;
import defpackage.f0v;
import defpackage.h0v;
import defpackage.szu;
import defpackage.tls;
import defpackage.uzu;
import defpackage.w511;
import defpackage.xw31;
import defpackage.xzu;
import defpackage.zzu;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes14.dex */
public final class a {
    public final tls a;
    public final ec31 b;
    public final LinkedHashSet c = new LinkedHashSet();

    public a(tls tlsVar, ec31 ec31Var) {
        this.a = tlsVar;
        this.b = ec31Var;
    }

    public final void a(RecyclerView recyclerView) {
        Pair pair;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            Integer valueOf = Integer.valueOf(childAdapterPosition);
            if (childAdapterPosition == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                bys bysVar = adapter instanceof bys ? (bys) adapter : null;
                Object item = bysVar != null ? bysVar.getItem(intValue) : null;
                h0v h0vVar = item instanceof h0v ? (h0v) item : null;
                if (h0vVar != null) {
                    if (h0vVar instanceof xzu) {
                        xzu xzuVar = (xzu) h0vVar;
                        pair = new Pair(xzuVar.d, Integer.valueOf(xzuVar.e));
                    } else if (h0vVar instanceof b0v) {
                        b0v b0vVar = (b0v) h0vVar;
                        pair = new Pair(b0vVar.f, Integer.valueOf(b0vVar.g));
                    } else if (h0vVar instanceof zzu) {
                        zzu zzuVar = (zzu) h0vVar;
                        pair = new Pair(zzuVar.e, Integer.valueOf(zzuVar.f));
                    } else {
                        if (!h0vVar.equals(d0v.a) && !(h0vVar instanceof uzu) && !(h0vVar instanceof szu) && !(h0vVar instanceof f0v)) {
                            w511.b();
                            return;
                        }
                        pair = new Pair(null, 0);
                    }
                    List list = (List) pair.getFirst();
                    int intValue2 = ((Number) pair.getSecond()).intValue();
                    if (list != null) {
                        Integer valueOf2 = Integer.valueOf(intValue2);
                        LinkedHashSet linkedHashSet = this.c;
                        if (!linkedHashSet.contains(valueOf2)) {
                            Rect rect = xw31.a;
                            int[] iArr = new int[2];
                            childAt.getLocationOnScreen(iArr);
                            float f = iArr[1];
                            int intValue3 = ((Number) this.b.invoke()).intValue();
                            if ((childAt.getTop() < 0 && childAt.getBottom() > 0 ? childAt.getBottom() / childAt.getHeight() : childAt.getBottom() > 0 && childAt.getTop() > 0 && f < ((float) intValue3) ? (intValue3 - f) / childAt.getHeight() : 0.0f) >= 0.5f) {
                                linkedHashSet.add(Integer.valueOf(intValue2));
                                ((VerticalHubV1ModalView$shownItemsDelegate$1) this.a).invoke(h0vVar);
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
