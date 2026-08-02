package xsna;

import java.util.ArrayList;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class iv9 implements hfz {
    public final ArrayList b;

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
            return -1999244505;
        }

        public final String toString() {
            return "PromoItem(iconUrl=https://sun9-50.userapi.com/ywytsH1RsgfipAxPYeikNt1kaihXRic29stFrg/FhoNGgLJi5U.jpg, text=Получайте кешбэк от 2% бонусами за каждую покупку)";
        }
    }

    public iv9(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv9) && this.b.equals(((iv9) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("CarouselPromosListItem(promos="), this.b);
    }
}
