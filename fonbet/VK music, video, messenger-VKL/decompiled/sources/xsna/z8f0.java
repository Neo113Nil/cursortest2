package xsna;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class z8f0 implements hfz {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8f0)) {
            return false;
        }
        ((z8f0) obj).getClass();
        return true;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(400) + shy.a(70, Integer.hashCode(100) * 31, 31);
    }

    public final String toString() {
        return "ReceiptWithBonusesItem(orderAmount=100, spendBonusesAmount=70, totalAmount=400)";
    }
}
