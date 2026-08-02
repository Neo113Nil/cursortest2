package com.yandex.go.payments.domain;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import defpackage.fef;
import defpackage.jl40;
import defpackage.mqg0;
import defpackage.xdf;
import org.xml.sax.XMLReader;

/* loaded from: classes13.dex */
public final class l {
    public final Context a;
    public final xdf b;

    public l(Context context, xdf xdfVar) {
        this.a = context;
        this.b = xdfVar;
    }

    public final Spanned a(fef fefVar, String str) {
        if (str == null) {
            return null;
        }
        String a = this.b.a(fefVar, str, false, false);
        final Context context = this.a;
        return Html.fromHtml(a, 0, null, new Html.TagHandler(context) { // from class: com.yandex.go.payments.domain.HtmlCurrencyFormatterImpl$RedTagHandler
            private final Context context;
            private int redStart;

            {
                this.context = context;
            }

            @Override // android.text.Html.TagHandler
            public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
                if (jl40.l(tag, "red")) {
                    if (opening) {
                        this.redStart = output.length();
                    } else {
                        output.setSpan(new ForegroundColorSpan(this.context.getColor(mqg0.component_red_normal)), this.redStart, output.length(), 33);
                    }
                }
            }
        });
    }
}
