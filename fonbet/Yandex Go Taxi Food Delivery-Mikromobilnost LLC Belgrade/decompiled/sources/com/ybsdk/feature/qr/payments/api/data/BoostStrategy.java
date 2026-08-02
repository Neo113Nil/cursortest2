package com.ybsdk.feature.qr.payments.api.data;

import defpackage.ja6;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/BoostStrategy;", "", "", "raw", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRaw", "()Ljava/lang/String;", "Companion", "ja6", "WALLET", "BOOST", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoostStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BoostStrategy[] $VALUES;
    public static final ja6 Companion;
    private final String raw;
    public static final BoostStrategy WALLET = new BoostStrategy("WALLET", 0, "wallet");
    public static final BoostStrategy BOOST = new BoostStrategy("BOOST", 1, "boost");

    private static final /* synthetic */ BoostStrategy[] $values() {
        return new BoostStrategy[]{WALLET, BOOST};
    }

    static {
        BoostStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new ja6();
    }

    private BoostStrategy(String str, int i, String str2) {
        this.raw = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BoostStrategy valueOf(String str) {
        return (BoostStrategy) Enum.valueOf(BoostStrategy.class, str);
    }

    public static BoostStrategy[] values() {
        return (BoostStrategy[]) $VALUES.clone();
    }

    public final String getRaw() {
        return this.raw;
    }
}
