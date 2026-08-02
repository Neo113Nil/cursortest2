package com.yandex.div.internal.parser;

import android.net.Uri;
import defpackage.rg21;
import defpackage.tls;
import defpackage.xfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParsingConvertersKt$ANY_TO_URI$1 extends Lambda implements tls {
    public static final ParsingConvertersKt$ANY_TO_URI$1 w = new ParsingConvertersKt$ANY_TO_URI$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        if (obj instanceof String) {
            return Uri.parse((String) obj);
        }
        if (obj instanceof rg21) {
            return Uri.parse(((rg21) obj).a);
        }
        xfo.h("Received value of wrong type");
        return null;
    }
}
