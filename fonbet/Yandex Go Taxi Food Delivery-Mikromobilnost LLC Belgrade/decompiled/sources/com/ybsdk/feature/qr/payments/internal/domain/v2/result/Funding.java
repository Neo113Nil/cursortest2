package com.ybsdk.feature.qr.payments.internal.domain.v2.result;

import defpackage.cqs;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/domain/v2/result/Funding;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "cqs", "BOOST", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Funding {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Funding[] $VALUES;
    public static final Funding BOOST = new Funding("BOOST", 0);
    public static final cqs Companion;

    private static final /* synthetic */ Funding[] $values() {
        return new Funding[]{BOOST};
    }

    static {
        Funding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new cqs();
    }

    private Funding(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Funding valueOf(String str) {
        return (Funding) Enum.valueOf(Funding.class, str);
    }

    public static Funding[] values() {
        return (Funding[]) $VALUES.clone();
    }
}
