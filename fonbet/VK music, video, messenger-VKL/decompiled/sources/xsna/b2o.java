package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.price.model.template.item.DonutPriceTemplateItem;
import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import xsna.kjt;

/* compiled from: DonutPriceTemplateParserImpl.kt */
/* loaded from: classes.dex */
public final class b2o implements a2o {
    public static final Regex a = new Regex("\\[#old_price\\|([^]]+)]");

    @Override // xsna.a2o
    public final DonutPriceTemplate parse(String str) {
        if (str.length() == 0) {
            return new DonutPriceTemplate(EmptyList.b);
        }
        ListBuilder e = e43.e();
        kjt.a aVar = new kjt.a(Regex.d(a, str));
        int i = 0;
        while (aVar.hasNext()) {
            zk10 zk10Var = (zk10) aVar.next();
            int i2 = zk10Var.c().b;
            if (i2 > i) {
                e.add(new DonutPriceTemplateItem.PlainText(str.substring(i, i2)));
            }
            e.add(new DonutPriceTemplateItem.StrikethroughText(zk10Var.b().get(1), DonutPriceTemplateItemStyle.SECONDARY));
            i = zk10Var.c().c + 1;
        }
        if (i < str.length()) {
            e.add(new DonutPriceTemplateItem.PlainText(str.substring(i)));
        }
        return new DonutPriceTemplate(e.g());
    }
}
