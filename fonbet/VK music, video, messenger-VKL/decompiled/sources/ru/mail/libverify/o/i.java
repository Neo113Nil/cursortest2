package ru.mail.libverify.o;

import android.os.Bundle;

/* loaded from: classes9.dex */
public final class i {
    private final Bundle a = new Bundle();

    public final Bundle a() {
        return this.a;
    }

    public final void a(String str, String str2) {
        this.a.putString(str, str2);
    }

    public final void a(String str, Boolean bool) {
        this.a.putBoolean(str, bool.booleanValue());
    }

    public final void a(String str, Integer num) {
        this.a.putInt(str, num.intValue());
    }
}
