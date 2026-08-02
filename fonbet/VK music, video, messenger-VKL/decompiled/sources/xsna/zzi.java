package xsna;

import java.util.ArrayList;

/* compiled from: ConfigureItemListPatch.kt */
/* loaded from: classes18.dex */
public abstract class zzi implements xl50 {

    /* compiled from: ConfigureItemListPatch.kt */
    public static final class a extends zzi {
        public final ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdateItemsPatch(items="), this.b);
        }
    }
}
