package com.yandex.go.promocodes.base.impl.ui.share;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/ui/share/PromoCodeShareViewHolderState;", "", "V1", "V2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoCodeShareViewHolderState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoCodeShareViewHolderState[] $VALUES;
    public static final PromoCodeShareViewHolderState V1;
    public static final PromoCodeShareViewHolderState V2;

    static {
        PromoCodeShareViewHolderState promoCodeShareViewHolderState = new PromoCodeShareViewHolderState("V1", 0);
        V1 = promoCodeShareViewHolderState;
        PromoCodeShareViewHolderState promoCodeShareViewHolderState2 = new PromoCodeShareViewHolderState("V2", 1);
        V2 = promoCodeShareViewHolderState2;
        PromoCodeShareViewHolderState[] promoCodeShareViewHolderStateArr = {promoCodeShareViewHolderState, promoCodeShareViewHolderState2};
        $VALUES = promoCodeShareViewHolderStateArr;
        $ENTRIES = a.a(promoCodeShareViewHolderStateArr);
    }

    public static PromoCodeShareViewHolderState valueOf(String str) {
        return (PromoCodeShareViewHolderState) Enum.valueOf(PromoCodeShareViewHolderState.class, str);
    }

    public static PromoCodeShareViewHolderState[] values() {
        return (PromoCodeShareViewHolderState[]) $VALUES.clone();
    }
}
