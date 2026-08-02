package com.yandex.passport.internal.ui.common.web;

import com.adjust.sdk.Constants;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class d {
    public final b a;

    public d(b bVar) {
        this.a = bVar;
    }

    public final WebUrlChecker$Status a(String str, String str2) {
        b bVar = this.a;
        if (bVar.b(str)) {
            return WebUrlChecker$Status.EXTERNAL;
        }
        if (bVar.c(str)) {
            return WebUrlChecker$Status.EXTERNAL_AND_CANCEL;
        }
        String j = com.yandex.passport.common.url.b.j(str);
        Locale locale = Locale.US;
        return j.toLowerCase(locale).equals(Constants.SCHEME) ? (!com.yandex.passport.common.url.b.g(str).equalsIgnoreCase(com.yandex.passport.common.url.b.g(str2)) && !com.yandex.passport.common.url.b.g(str).equalsIgnoreCase("webauth-ext.yandex.net") && !com.yandex.passport.common.url.b.g(str).equalsIgnoreCase("passport.toloka.ai")) ? true ^ bVar.a(com.yandex.passport.common.url.b.g(str).toLowerCase(locale)) : false : true ? WebUrlChecker$Status.BLOCKED : WebUrlChecker$Status.ALLOWED;
    }
}
