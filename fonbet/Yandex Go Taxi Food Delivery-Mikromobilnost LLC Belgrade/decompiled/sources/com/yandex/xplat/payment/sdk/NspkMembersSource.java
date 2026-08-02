package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/payment/sdk/NspkMembersSource;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "qr", "sub", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NspkMembersSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NspkMembersSource[] $VALUES;
    public static final NspkMembersSource qr;
    public static final NspkMembersSource sub;
    private final String value;

    static {
        NspkMembersSource nspkMembersSource = new NspkMembersSource("qr", 0, "qr");
        qr = nspkMembersSource;
        NspkMembersSource nspkMembersSource2 = new NspkMembersSource("sub", 1, "sub");
        sub = nspkMembersSource2;
        NspkMembersSource[] nspkMembersSourceArr = {nspkMembersSource, nspkMembersSource2};
        $VALUES = nspkMembersSourceArr;
        $ENTRIES = a.a(nspkMembersSourceArr);
    }

    public NspkMembersSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static NspkMembersSource valueOf(String str) {
        return (NspkMembersSource) Enum.valueOf(NspkMembersSource.class, str);
    }

    public static NspkMembersSource[] values() {
        return (NspkMembersSource[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
