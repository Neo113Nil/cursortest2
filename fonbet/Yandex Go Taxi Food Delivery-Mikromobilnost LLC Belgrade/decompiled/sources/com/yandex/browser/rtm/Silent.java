package com.yandex.browser.rtm;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/browser/rtm/Silent;", "", "", "tag", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TRUE", "FALSE", "lib-redir-log"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Silent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Silent[] $VALUES;
    public static final Silent FALSE;
    public static final Silent TRUE;
    private final String tag;

    static {
        Silent silent = new Silent("TRUE", 0, "yes");
        TRUE = silent;
        Silent silent2 = new Silent("FALSE", 1, "no");
        FALSE = silent2;
        Silent[] silentArr = {silent, silent2};
        $VALUES = silentArr;
        $ENTRIES = a.a(silentArr);
    }

    public Silent(String str, int i, String str2) {
        this.tag = str2;
    }

    public static Silent valueOf(String str) {
        return (Silent) Enum.valueOf(Silent.class, str);
    }

    public static Silent[] values() {
        return (Silent[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }
}
