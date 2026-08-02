package com.yandex.quark.webchat.cookie;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/quark/webchat/cookie/Cookie$SameSite", "", "Lcom/yandex/quark/webchat/cookie/Cookie$SameSite;", "", "headerValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "STRICT", "LAX", JCP.RAW_PREFIX, "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Cookie$SameSite {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Cookie$SameSite[] $VALUES;
    public static final Cookie$SameSite LAX;
    public static final Cookie$SameSite NONE;
    public static final Cookie$SameSite STRICT;
    private final String headerValue;

    static {
        Cookie$SameSite cookie$SameSite = new Cookie$SameSite("STRICT", 0, "strict");
        STRICT = cookie$SameSite;
        Cookie$SameSite cookie$SameSite2 = new Cookie$SameSite("LAX", 1, "lax");
        LAX = cookie$SameSite2;
        Cookie$SameSite cookie$SameSite3 = new Cookie$SameSite(JCP.RAW_PREFIX, 2, "none");
        NONE = cookie$SameSite3;
        Cookie$SameSite[] cookie$SameSiteArr = {cookie$SameSite, cookie$SameSite2, cookie$SameSite3};
        $VALUES = cookie$SameSiteArr;
        $ENTRIES = a.a(cookie$SameSiteArr);
    }

    public Cookie$SameSite(String str, int i, String str2) {
        this.headerValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static Cookie$SameSite valueOf(String str) {
        return (Cookie$SameSite) Enum.valueOf(Cookie$SameSite.class, str);
    }

    public static Cookie$SameSite[] values() {
        return (Cookie$SameSite[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getHeaderValue() {
        return this.headerValue;
    }
}
