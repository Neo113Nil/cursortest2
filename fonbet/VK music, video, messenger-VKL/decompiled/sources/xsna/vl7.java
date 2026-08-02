package xsna;

import java.util.List;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class vl7 implements hfz {
    public final List<hfz> b;

    /* compiled from: ConfirmationItems.kt */
    public static final class a implements hfz {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            return Integer.hashCode(80) * 31;
        }

        public final String toString() {
            return "EarnActionItem(earnAmount=80, additionalInfo=)";
        }
    }

    /* compiled from: ConfirmationItems.kt */
    public static final class b implements hfz {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            return ((Boolean.hashCode(true) + shy.a(10000, Integer.hashCode(80) * 31, 31)) * 31) + 1172427993;
        }

        public final String toString() {
            return "SpendActionItem(spendAmount=80, availableAmount=10000, isSpendingAvailable=true, additionalInfo=А стоит ли?)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vl7(List<? extends hfz> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vl7) && epx.f(this.b, ((vl7) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("BonusesActionSelectionItem(actions="), this.b);
    }
}
