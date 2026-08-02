package com.yandex.passport.internal;

import android.content.Context;
import com.yandex.passport.R;
import defpackage.i3y;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class e {
    public final Context a;
    public final com.yandex.passport.internal.helper.g b;
    public final i3y c = kotlin.a.a(new d(0, this));

    public e(Context context, com.yandex.passport.internal.helper.g gVar) {
        this.a = context;
        this.b = gVar;
    }

    public final String a() {
        String language;
        Locale locale = this.b.a.q;
        return (locale == null || (language = locale.getLanguage()) == null) ? this.a.getString(R.string.passport_ui_language) : language;
    }
}
