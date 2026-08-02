package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.yandex.div.core.player.DivVideoResolution;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.rd;
import com.yandex.div2.td;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;

/* compiled from: DivVideoBinder.kt */
/* loaded from: classes7.dex */
public final class DivVideoBinderKt {
    public static final List<DivVideoSource> createSource(rd rdVar, ExpressionResolver expressionResolver) {
        List<td> list = rdVar.Q;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (td tdVar : list) {
            Uri evaluate = tdVar.d.evaluate(expressionResolver);
            String evaluate2 = tdVar.b.evaluate(expressionResolver);
            td.a aVar = tdVar.c;
            Long l = null;
            DivVideoResolution divVideoResolution = aVar != null ? new DivVideoResolution((int) aVar.b.evaluate(expressionResolver).longValue(), (int) aVar.a.evaluate(expressionResolver).longValue()) : null;
            Expression<Long> expression = tdVar.a;
            if (expression != null) {
                l = expression.evaluate(expressionResolver);
            }
            arrayList.add(new DivVideoSource(evaluate, evaluate2, divVideoResolution, l));
        }
        return arrayList;
    }
}
