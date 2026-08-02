package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketItemsForReviewPatch.kt */
/* loaded from: classes18.dex */
public abstract class c610 implements xl50 {

    /* compiled from: MarketItemsForReviewPatch.kt */
    public static final class a extends c610 {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("InitError(error="), this.b, ')');
        }
    }

    /* compiled from: MarketItemsForReviewPatch.kt */
    public static final class b extends c610 {
        public final boolean b = true;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("InitLoad(loading="), this.b, ')');
        }
    }

    /* compiled from: MarketItemsForReviewPatch.kt */
    public static final class c extends c610 {
        public final List<a610> b;

        public c(List<a610> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("InitSuccess(items="), this.b);
        }
    }

    /* compiled from: MarketItemsForReviewPatch.kt */
    public static final class d extends c610 {
        public final ArrayList b;

        public d(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Update(items="), this.b);
        }
    }

    /* compiled from: MarketItemsForReviewPatch.kt */
    public static final class e extends c610 {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdatePosition(position="), this.b, ')');
        }
    }
}
