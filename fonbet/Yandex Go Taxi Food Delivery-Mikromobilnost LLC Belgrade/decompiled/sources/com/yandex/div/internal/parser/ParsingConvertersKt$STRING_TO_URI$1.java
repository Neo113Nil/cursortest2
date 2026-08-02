package com.yandex.div.internal.parser;

import android.net.Uri;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParsingConvertersKt$STRING_TO_URI$1 extends Lambda implements tls {
    public static final ParsingConvertersKt$STRING_TO_URI$1 w = new ParsingConvertersKt$STRING_TO_URI$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Uri.parse((String) obj);
    }
}
