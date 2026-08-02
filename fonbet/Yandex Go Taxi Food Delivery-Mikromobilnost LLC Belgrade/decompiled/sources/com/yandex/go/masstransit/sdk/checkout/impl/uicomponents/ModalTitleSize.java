package com.yandex.go.masstransit.sdk.checkout.impl.uicomponents;

import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.an91;
import defpackage.j690;
import defpackage.k4o;
import defpackage.l690;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/masstransit/sdk/checkout/impl/uicomponents/ModalTitleSize;", "", "Lj690;", "paddingValues", "Lj690;", "a", "()Lj690;", "Lcom/yandex/go/design/compose/slot/SlotSize;", "slotSize", "Lcom/yandex/go/design/compose/slot/SlotSize;", "b", "()Lcom/yandex/go/design/compose/slot/SlotSize;", "L", "M", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ModalTitleSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalTitleSize[] $VALUES;
    public static final ModalTitleSize L;
    public static final ModalTitleSize M;
    private final j690 paddingValues;
    private final SlotSize slotSize;

    static {
        ModalTitleSize modalTitleSize = new ModalTitleSize("L", 0, an91.d(0.0f, 4.0f, 0.0f, 4.0f, 5), SlotSize.L);
        L = modalTitleSize;
        ModalTitleSize modalTitleSize2 = new ModalTitleSize("M", 1, an91.d(0.0f, 12.0f, 0.0f, 4.0f, 5), SlotSize.M);
        M = modalTitleSize2;
        ModalTitleSize[] modalTitleSizeArr = {modalTitleSize, modalTitleSize2};
        $VALUES = modalTitleSizeArr;
        $ENTRIES = a.a(modalTitleSizeArr);
    }

    public ModalTitleSize(String str, int i, l690 l690Var, SlotSize slotSize) {
        this.paddingValues = l690Var;
        this.slotSize = slotSize;
    }

    public static ModalTitleSize valueOf(String str) {
        return (ModalTitleSize) Enum.valueOf(ModalTitleSize.class, str);
    }

    public static ModalTitleSize[] values() {
        return (ModalTitleSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final j690 getPaddingValues() {
        return this.paddingValues;
    }

    /* renamed from: b, reason: from getter */
    public final SlotSize getSlotSize() {
        return this.slotSize;
    }
}
