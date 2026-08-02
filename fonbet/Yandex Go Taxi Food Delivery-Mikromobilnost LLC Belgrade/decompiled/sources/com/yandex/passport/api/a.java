package com.yandex.passport.api;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class a {
    public final String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    public static final /* synthetic */ a a(String str) {
        return new a(str);
    }

    public static final boolean b(String str, String str2) {
        return jl40.l(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static String d(String str) {
        return unr0.l(')', "AdditionalActionRequest(rawValue=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return d(this.a);
    }
}
