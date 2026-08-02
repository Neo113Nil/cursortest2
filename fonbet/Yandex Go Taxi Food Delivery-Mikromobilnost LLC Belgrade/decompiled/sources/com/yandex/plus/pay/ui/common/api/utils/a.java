package com.yandex.plus.pay.ui.common.api.utils;

import android.text.SpannableStringBuilder;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.d6w;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w511;
import defpackage.yw01;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.sequences.b;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* loaded from: classes2.dex */
public abstract class a {
    public static final List a(CharSequence charSequence, String str) {
        return b.s(new yw01(Regex.c(new Regex(str, RegexOption.LITERAL), charSequence), PlusPayRichTextExtKt$findAllOccurrences$1.b));
    }

    public static final LinkedHashMap b(PlusPayRichText plusPayRichText) {
        List<PlusPayRichText.Item> items = plusPayRichText.getItems();
        int d = gw00.d(tcc.n(items, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : items) {
            linkedHashMap.put("{{" + ((PlusPayRichText.Item) obj).getKey() + "}}", obj);
        }
        return linkedHashMap;
    }

    public static final String c(PlusPayRichText plusPayRichText) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(plusPayRichText.getText());
        for (Map.Entry entry : b(plusPayRichText).entrySet()) {
            String str = (String) entry.getKey();
            PlusPayRichText.Item item = (PlusPayRichText.Item) entry.getValue();
            List<d6w> a = a(spannableStringBuilder, str);
            if (!(item instanceof PlusPayRichText.Item.Icon) && !(item instanceof PlusPayRichText.Item.TextColor) && !(item instanceof PlusPayRichText.Item.Highlight) && !(item instanceof PlusPayRichText.Item.Link) && !(item instanceof PlusPayRichText.Item.Strikethrough) && !(item instanceof PlusPayRichText.Item.Text)) {
                w511.b();
                return null;
            }
            String data = item.getData();
            if (data == null) {
                data = item.getAltText();
            }
            if (data == null) {
                ny61.g("error ");
                return null;
            }
            for (d6w d6wVar : a) {
                spannableStringBuilder.replace(d6wVar.a, d6wVar.b + 1, (CharSequence) data);
                int i = d6wVar.a;
                new d6w(i, data.length() + i, 1);
            }
        }
        return spannableStringBuilder.toString();
    }
}
