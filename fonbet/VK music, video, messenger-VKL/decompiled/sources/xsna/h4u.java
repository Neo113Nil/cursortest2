package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: GoodDescriptionComposeViewHolders.kt */
/* loaded from: classes18.dex */
public abstract class h4u {
    public final int a;

    /* compiled from: GoodDescriptionComposeViewHolders.kt */
    public static final class a extends h4u {
        public final ArrayList b;

        public a(ArrayList arrayList) {
            super(R.string.good_characteristics_tab);
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("CharacteristicsPageItem(characteristics="), this.b);
        }
    }

    /* compiled from: GoodDescriptionComposeViewHolders.kt */
    public static final class b extends h4u {
        public final ynd0 b;

        public b(ynd0 ynd0Var) {
            super(R.string.good_description_tab);
            this.b = ynd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DescriptionPageItem(description=" + this.b + ')';
        }
    }

    public h4u(int i) {
        this.a = i;
    }
}
