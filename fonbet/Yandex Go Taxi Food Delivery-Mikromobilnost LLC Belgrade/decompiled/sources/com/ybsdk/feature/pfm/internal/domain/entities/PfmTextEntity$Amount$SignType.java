package com.ybsdk.feature.pfm.internal.domain.entities;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/pfm/internal/domain/entities/PfmTextEntity$Amount$SignType", "", "Lcom/ybsdk/feature/pfm/internal/domain/entities/PfmTextEntity$Amount$SignType;", "<init>", "(Ljava/lang/String;I)V", Card.CARD_TYPE_CREDIT, Card.CARD_TYPE_DEBIT, "NEUTRAL", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmTextEntity$Amount$SignType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PfmTextEntity$Amount$SignType[] $VALUES;
    public static final PfmTextEntity$Amount$SignType CREDIT = new PfmTextEntity$Amount$SignType(Card.CARD_TYPE_CREDIT, 0);
    public static final PfmTextEntity$Amount$SignType DEBIT = new PfmTextEntity$Amount$SignType(Card.CARD_TYPE_DEBIT, 1);
    public static final PfmTextEntity$Amount$SignType NEUTRAL = new PfmTextEntity$Amount$SignType("NEUTRAL", 2);

    private static final /* synthetic */ PfmTextEntity$Amount$SignType[] $values() {
        return new PfmTextEntity$Amount$SignType[]{CREDIT, DEBIT, NEUTRAL};
    }

    static {
        PfmTextEntity$Amount$SignType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PfmTextEntity$Amount$SignType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PfmTextEntity$Amount$SignType valueOf(String str) {
        return (PfmTextEntity$Amount$SignType) Enum.valueOf(PfmTextEntity$Amount$SignType.class, str);
    }

    public static PfmTextEntity$Amount$SignType[] values() {
        return (PfmTextEntity$Amount$SignType[]) $VALUES.clone();
    }
}
