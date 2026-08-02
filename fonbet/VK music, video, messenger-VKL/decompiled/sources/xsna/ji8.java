package xsna;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: BroadcastScheduledViewModel.kt */
/* loaded from: classes7.dex */
public final class ji8 {
    public final ArrayList a;

    /* compiled from: BroadcastScheduledViewModel.kt */
    public static final class a {
        public final String a;
        public final CharSequence b;
        public final Collection<eqw0> c;
        public final CharSequence d;
        public final long e;
        public final boolean f;
        public final boolean g;

        public a(String str, CharSequence charSequence, Collection<eqw0> collection, CharSequence charSequence2, long j, boolean z, boolean z2) {
            this.a = str;
            this.b = charSequence;
            this.c = collection;
            this.d = charSequence2;
            this.e = j;
            this.f = z;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + qoy.b(bh10.a(u11.c(s3j0.a(u11.c(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Broadcast(id=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append((Object) this.b);
            sb.append(", images=");
            sb.append(this.c);
            sb.append(", ownerName=");
            sb.append((Object) this.d);
            sb.append(", timeStartMs=");
            sb.append(this.e);
            sb.append(", isUpcoming=");
            sb.append(this.f);
            sb.append(", isSelected=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    public ji8(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji8) && this.a.equals(((ji8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("BroadcastScheduledViewModel(broadcasts="), this.a);
    }
}
