package com.yandex.div.evaluable.types;

import java.net.MalformedURLException;
import java.net.URL;
import xsna.epx;
import xsna.vby;
import xsna.zcl;

/* compiled from: Url.kt */
@vby
/* loaded from: classes7.dex */
public final class Url {
    public static final Companion Companion = new Companion(null);
    private final String value;

    /* compiled from: Url.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final boolean isValid(String str) {
            try {
                new URL(str);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        /* renamed from: from-VcSV9u8, reason: not valid java name */
        public final String m202fromVcSV9u8(String str) throws IllegalArgumentException {
            if (isValid(str)) {
                return Url.m196constructorimpl(str);
            }
            throw new IllegalArgumentException("Invalid url ".concat(str));
        }

        private Companion() {
        }
    }

    private /* synthetic */ Url(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Url m195boximpl(String str) {
        return new Url(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m197equalsimpl(String str, Object obj) {
        return (obj instanceof Url) && epx.f(str, ((Url) obj).m201unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m198equalsimpl0(String str, String str2) {
        return epx.f(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m199hashCodeimpl(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return m197equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m199hashCodeimpl(this.value);
    }

    public String toString() {
        return m200toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m201unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m196constructorimpl(String str) {
        return str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m200toStringimpl(String str) {
        return str;
    }
}
