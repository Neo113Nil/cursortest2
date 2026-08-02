package xsna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.q8z;

/* compiled from: AnnotatedString.kt */
/* loaded from: classes11.dex */
public final class us2 implements CharSequence {
    public final List<d<? extends a>> b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    /* compiled from: AnnotatedString.kt */
    public interface a {
    }

    /* compiled from: AnnotatedString.kt */
    public static final class b implements Appendable {
        public final StringBuilder b;
        public final ArrayList c;
        public final ArrayList d;

        public b() {
            this.b = new StringBuilder(16);
            this.c = new ArrayList();
            this.d = new ArrayList();
            new ArrayList();
        }

        public final void a(q8z.a aVar, int i, int i2) {
            this.d.add(new a(i, i2, 8, aVar));
        }

        @Override // java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
            f(charSequence);
            return this;
        }

        public final void b(q8z.b bVar, int i, int i2) {
            this.d.add(new a(i, i2, 8, bVar));
        }

        public final void c(int i, int i2, String str, String str2) {
            this.d.add(new a(new wpm0(str2), i, i2, str));
        }

        public final void d(hik0 hik0Var, int i, int i2) {
            this.d.add(new a(i, i2, 8, hik0Var));
        }

        @ozl
        public final void e(seq0 seq0Var, int i, int i2) {
            this.d.add(new a(i, i2, 8, seq0Var));
        }

        public final void f(CharSequence charSequence) {
            if (charSequence instanceof us2) {
                h((us2) charSequence);
            } else {
                this.b.append(charSequence);
            }
        }

        public final void g(String str) {
            this.b.append(str);
        }

        public final void h(us2 us2Var) {
            StringBuilder sb = this.b;
            int length = sb.length();
            sb.append(us2Var.c);
            List<d<? extends a>> list = us2Var.b;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    d<? extends a> dVar = list.get(i);
                    this.d.add(new a(dVar.a, dVar.b + length, dVar.c + length, dVar.d));
                }
            }
        }

        public final void i(us2 us2Var, int i, int i2) {
            StringBuilder sb = this.b;
            int length = sb.length();
            sb.append((CharSequence) us2Var.c, i, i2);
            List b = zs2.b(us2Var, i, i2, null);
            if (b != null) {
                int size = b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    d dVar = (d) b.get(i3);
                    this.d.add(new a(dVar.a, dVar.b + length, dVar.c + length, dVar.d));
                }
            }
        }

        public final void j() {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                vzw.c("Nothing to pop.");
            }
            ((a) arrayList.remove(arrayList.size() - 1)).c = this.b.length();
        }

        public final void k(int i) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                vzw.c(i + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i) {
                j();
            }
        }

        public final int l(q8z.a aVar) {
            a aVar2 = new a(this.b.length(), 0, 12, aVar);
            this.c.add(aVar2);
            this.d.add(aVar2);
            return r5.size() - 1;
        }

        public final int m(hik0 hik0Var) {
            a aVar = new a(this.b.length(), 0, 12, hik0Var);
            this.c.add(aVar);
            this.d.add(aVar);
            return r5.size() - 1;
        }

        public final us2 n() {
            StringBuilder sb = this.b;
            String sb2 = sb.toString();
            ArrayList arrayList = this.d;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((a) arrayList.get(i)).a(sb.length()));
            }
            return new us2(sb2, arrayList2);
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof us2) {
                i((us2) charSequence, i, i2);
                return this;
            }
            this.b.append(charSequence, i, i2);
            return this;
        }

        /* compiled from: AnnotatedString.kt */
        public static final class a<T> {
            public final T a;
            public final int b;
            public int c;
            public final String d;

            public a(T t, int i, int i2, String str) {
                this.a = t;
                this.b = i;
                this.c = i2;
                this.d = str;
            }

            public final d<T> a(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    vzw.c("Item.end should be set first");
                }
                return new d<>(this.a, this.b, i, this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                T t = this.a;
                return this.d.hashCode() + shy.a(this.c, shy.a(this.b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.a);
                sb.append(", start=");
                sb.append(this.b);
                sb.append(", end=");
                sb.append(this.c);
                sb.append(", tag=");
                return ho8.a(sb, this.d, ')');
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ a(int i, int i2, int i3, Object obj) {
                this(obj, i, i2, r4);
                String str;
                i2 = (i3 & 4) != 0 ? Integer.MIN_VALUE : i2;
                if ((i3 & 8) != 0) {
                    str = "";
                } else {
                    str = "androidx.compose.foundation.text.inlineContent";
                }
            }
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            this.b.append(c);
            return this;
        }

        public b(String str) {
            this();
            g(str);
        }

        public b(us2 us2Var) {
            this();
            h(us2Var);
        }
    }

    /* compiled from: AnnotatedString.kt */
    public static final class c {
    }

    /* compiled from: Comparisons.kt */
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((d) t).b), Integer.valueOf(((d) t2).b));
        }
    }

    static {
        fh9 fh9Var = i2h0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public us2(List<? extends d<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.b = list;
        this.c = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                d dVar = (d) list.get(i);
                T t = dVar.a;
                if (t instanceof hik0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(dVar);
                } else if (t instanceof fh90) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(dVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.d = arrayList;
        this.e = arrayList2;
        List D0 = arrayList2 != null ? j5g.D0(new e(), arrayList2) : null;
        List list2 = D0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((d) j5g.Y(D0)).c;
        ng50 ng50Var = b9x.a;
        ng50 ng50Var2 = new ng50(1);
        ng50Var2.c(i2);
        int size2 = D0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            d dVar2 = (d) D0.get(i3);
            while (true) {
                if (ng50Var2.b != 0) {
                    int b2 = ng50Var2.b();
                    int i4 = dVar2.b;
                    int i5 = dVar2.c;
                    if (i4 >= b2) {
                        ng50Var2.f(ng50Var2.b - 1);
                    } else if (i5 > b2) {
                        vzw.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + b2);
                    }
                }
            }
            ng50Var2.c(dVar2.c);
        }
    }

    public final List a(int i) {
        List<d<? extends a>> list = this.b;
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            d<? extends a> dVar = list.get(i2);
            d<? extends a> dVar2 = dVar;
            if ((dVar2.a instanceof q8z) && zs2.c(0, i, dVar2.b, dVar2.c)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<d<String>> b(int i, int i2) {
        List<d<? extends a>> list = this.b;
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            d<? extends a> dVar = list.get(i3);
            T t = dVar.a;
            int i4 = dVar.c;
            int i5 = dVar.b;
            if ((t instanceof wpm0) && zs2.c(i, i2, i5, i4)) {
                arrayList.add(new d(((wpm0) dVar.a).a, i5, i4, dVar.d));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List c(int i, int i2, String str) {
        List<d<? extends a>> list = this.b;
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            d<? extends a> dVar = list.get(i3);
            T t = dVar.a;
            int i4 = dVar.c;
            int i5 = dVar.b;
            String str2 = dVar.d;
            if ((t instanceof wpm0) && str.equals(str2) && zs2.c(i, i2, i5, i4)) {
                arrayList.add(new d(((wpm0) dVar.a).a, i5, i4, str2));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c.charAt(i);
    }

    public final us2 d(izs<? super d<? extends a>, ? extends d<? extends a>> izsVar) {
        b bVar = new b(this);
        ArrayList arrayList = bVar.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d<? extends a> invoke = izsVar.invoke(((b.a) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new b.a(invoke.a, invoke.b, invoke.c, invoke.d));
        }
        return bVar.n();
    }

    public final us2 e(us2 us2Var) {
        b bVar = new b(this);
        bVar.h(us2Var);
        return bVar.n();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us2)) {
            return false;
        }
        us2 us2Var = (us2) obj;
        return epx.f(this.c, us2Var.c) && epx.f(this.b, us2Var.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final us2 subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            vzw.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.c;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        us2 us2Var = zs2.a;
        if (i > i2) {
            vzw.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List<d<? extends a>> list = this.b;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                d<? extends a> dVar = list.get(i3);
                int i4 = dVar.b;
                int i5 = dVar.c;
                if (zs2.c(i, i2, i4, i5)) {
                    arrayList.add(new d(dVar.a, Math.max(i, dVar.b) - i, Math.min(i2, i5) - i, dVar.d));
                }
            }
        }
        arrayList = null;
        return new us2(arrayList, substring);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        List<d<? extends a>> list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.c;
    }

    /* compiled from: AnnotatedString.kt */
    public static final class d<T> {
        public final T a;
        public final int b;
        public final int c;
        public final String d;

        public d(T t, int i, int i2, String str) {
            this.a = t;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i <= i2) {
                return;
            }
            vzw.a("Reversed range is not supported");
        }

        public static d a(d dVar, a aVar, int i, int i2) {
            if ((i2 & 1) != 0) {
                aVar = dVar.a;
            }
            int i3 = dVar.b;
            if ((i2 & 4) != 0) {
                i = dVar.c;
            }
            String str = dVar.d;
            dVar.getClass();
            return new d(aVar, i3, i, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            T t = this.a;
            return this.d.hashCode() + shy.a(this.c, shy.a(this.b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return ho8.a(sb, this.d, ')');
        }

        public d(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    public us2(String str) {
        this(str, EmptyList.b);
    }

    public us2(String str, List list, int i) {
        this(str, (List<d<hik0>>) list, EmptyList.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public us2(String str, List<d<hik0>> list, List<d<fh90>> list2) {
        this(list, str);
        us2 us2Var = zs2.a;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        } else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            } else {
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(list.get(i));
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add((d) list2.get(i2));
                }
                list = arrayList;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public us2(String str, List<? extends d<? extends a>> list) {
        this(r3.isEmpty() ? null : r3, str);
        List<? extends d<? extends a>> list2 = list;
    }
}
