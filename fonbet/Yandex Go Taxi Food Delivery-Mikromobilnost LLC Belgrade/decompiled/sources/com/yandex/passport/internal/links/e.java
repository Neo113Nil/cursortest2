package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.internal.ModernAccount;

/* loaded from: classes15.dex */
public abstract class e {
    public final Uri a;
    public final ModernAccount b;
    public final LinkMode c;
    public final String d;

    public e(Uri uri, ModernAccount modernAccount, LinkMode linkMode, String str) {
        this.a = uri;
        this.b = modernAccount;
        this.c = linkMode;
        this.d = str;
    }
}
