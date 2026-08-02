package com.yandex.plus.pay.repository.api.model.contacts;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/plus/pay/repository/api/model/contacts/CollectContactsWebUrlParams$Theme", "", "Lcom/yandex/plus/pay/repository/api/model/contacts/CollectContactsWebUrlParams$Theme;", "", "rawName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LIGHT", "DARK", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CollectContactsWebUrlParams$Theme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CollectContactsWebUrlParams$Theme[] $VALUES;
    public static final CollectContactsWebUrlParams$Theme DARK;
    public static final CollectContactsWebUrlParams$Theme LIGHT;
    private final String rawName;

    static {
        CollectContactsWebUrlParams$Theme collectContactsWebUrlParams$Theme = new CollectContactsWebUrlParams$Theme("LIGHT", 0, "light");
        LIGHT = collectContactsWebUrlParams$Theme;
        CollectContactsWebUrlParams$Theme collectContactsWebUrlParams$Theme2 = new CollectContactsWebUrlParams$Theme("DARK", 1, "dark");
        DARK = collectContactsWebUrlParams$Theme2;
        CollectContactsWebUrlParams$Theme[] collectContactsWebUrlParams$ThemeArr = {collectContactsWebUrlParams$Theme, collectContactsWebUrlParams$Theme2};
        $VALUES = collectContactsWebUrlParams$ThemeArr;
        $ENTRIES = a.a(collectContactsWebUrlParams$ThemeArr);
    }

    public CollectContactsWebUrlParams$Theme(String str, int i, String str2) {
        this.rawName = str2;
    }

    public static CollectContactsWebUrlParams$Theme valueOf(String str) {
        return (CollectContactsWebUrlParams$Theme) Enum.valueOf(CollectContactsWebUrlParams$Theme.class, str);
    }

    public static CollectContactsWebUrlParams$Theme[] values() {
        return (CollectContactsWebUrlParams$Theme[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawName() {
        return this.rawName;
    }
}
