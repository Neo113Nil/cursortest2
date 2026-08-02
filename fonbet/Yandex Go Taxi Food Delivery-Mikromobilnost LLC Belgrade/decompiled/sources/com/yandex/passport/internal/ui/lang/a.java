package com.yandex.passport.internal.ui.lang;

import android.content.Context;
import com.yandex.passport.R;
import com.yandex.passport.common.ui.lang.b;
import com.yandex.passport.internal.helper.g;
import java.util.Locale;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class a implements b {
    public final Context a;
    public final g b;

    public a(Context context, g gVar) {
        this.a = context;
        this.b = gVar;
    }

    public final Locale a() {
        Object failure;
        String string;
        Locale locale = this.b.a.q;
        if (locale != null) {
            int i = com.yandex.passport.common.ui.lang.a.a;
            return locale;
        }
        Context context = this.a;
        if (locale == null || (string = locale.getLanguage()) == null) {
            try {
                failure = context.getResources().getConfiguration().getLocales().get(0);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Locale locale2 = (Locale) failure;
            String languageTag = locale2 != null ? locale2.toLanguageTag() : null;
            string = languageTag == null ? context.getString(R.string.passport_ui_language) : languageTag;
        }
        return com.yandex.passport.common.ui.lang.a.a(6, string);
    }

    public final Locale b() {
        String string;
        Locale locale = this.b.a.q;
        if (locale != null) {
            int i = com.yandex.passport.common.ui.lang.a.a;
            return locale;
        }
        if (locale == null || (string = locale.getLanguage()) == null) {
            string = this.a.getString(R.string.passport_ui_language);
        }
        return com.yandex.passport.common.ui.lang.a.a(6, string);
    }
}
