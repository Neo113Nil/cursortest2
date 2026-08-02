package xsna;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.price.model.template.item.DonutPriceTemplateItem;
import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import xsna.us2;

/* compiled from: DonutPriceTemplateExt.kt */
/* loaded from: classes18.dex */
public final class z1o {
    public static final us2 a(DonutPriceTemplate donutPriceTemplate, x1o x1oVar, androidx.compose.runtime.a aVar, int i) {
        x1o x1oVar2;
        int i2 = i & 1;
        Object obj = a.C0011a.a;
        if (i2 != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1821088181, 0, -1, "com.vk.donut.price.core.template.compose.provider.style.simple.rememberSimpleDonutPriceItemStyleProvider (SimpleDonutPriceItemStyleProvider.kt:64)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TypedValue typedValue = krv0.a;
            boolean f = epx.f(krv0.i((Context) aVar.r(AndroidCompositionLocals_androidKt.b)), Boolean.TRUE);
            boolean J = aVar.J(ylu0Var) | aVar.l(f) | aVar.l(false);
            Object x = aVar.x();
            if (J || x == obj) {
                x = new jqj0(ylu0Var, f);
                aVar.R(x);
            }
            x1oVar2 = (jqj0) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            x1oVar2 = x1oVar;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-386937746, 0, -1, "com.vk.donut.price.core.template.compose.rememberAsAnnotatedString (DonutPriceTemplateExt.kt:19)");
        }
        boolean J2 = aVar.J(donutPriceTemplate) | aVar.J(x1oVar2);
        Object x2 = aVar.x();
        if (J2 || x2 == obj) {
            us2.b bVar = new us2.b();
            for (DonutPriceTemplateItem donutPriceTemplateItem : donutPriceTemplate.b) {
                if (donutPriceTemplateItem instanceof DonutPriceTemplateItem.PlainText) {
                    bVar.g(((DonutPriceTemplateItem.PlainText) donutPriceTemplateItem).b);
                } else if (donutPriceTemplateItem instanceof DonutPriceTemplateItem.StrikethroughText) {
                    DonutPriceTemplateItem.StrikethroughText strikethroughText = (DonutPriceTemplateItem.StrikethroughText) donutPriceTemplateItem;
                    DonutPriceTemplateItemStyle donutPriceTemplateItemStyle = strikethroughText.c;
                    int m = bVar.m(new hik0(donutPriceTemplateItemStyle != null ? x1oVar2.a(donutPriceTemplateItemStyle) : l5g.k, 0L, null, null, null, null, null, 0L, null, null, null, 0L, pdo0.d, null, 61438));
                    try {
                        bVar.g(strikethroughText.b);
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                        bVar.k(m);
                    }
                } else {
                    continue;
                }
            }
            x2 = bVar.n();
            aVar.R(x2);
        }
        us2 us2Var = (us2) x2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return us2Var;
    }
}
