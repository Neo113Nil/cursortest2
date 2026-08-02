package com.yandex.fintechsdk.core.network.impl.internal.model;

import defpackage.k4o;
import defpackage.qje;
import defpackage.wg10;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.text.Regex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/fintechsdk/core/network/impl/internal/model/MimeType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "APPLICATION_JSON", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MimeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MimeType[] $VALUES;
    public static final MimeType APPLICATION_JSON;
    private final String value = "application/json";

    static {
        MimeType mimeType = new MimeType();
        APPLICATION_JSON = mimeType;
        MimeType[] mimeTypeArr = {mimeType};
        $VALUES = mimeTypeArr;
        $ENTRIES = a.a(mimeTypeArr);
    }

    public static MimeType valueOf(String str) {
        return (MimeType) Enum.valueOf(MimeType.class, str);
    }

    public static MimeType[] values() {
        return (MimeType[]) $VALUES.clone();
    }

    public final wg10 a() {
        Regex regex = wg10.e;
        try {
            return qje.o(this.value);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
