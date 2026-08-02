package xsna;

import java.util.ArrayList;
import xsna.q8z;
import xsna.us2;

/* compiled from: VkAnnotatedStringBuilder.kt */
/* loaded from: classes17.dex */
public final class s8u0 {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public s8u0() {
        this(0);
    }

    public final void a(h2v0 h2v0Var, int i, int i2) {
        this.d.add(new a(i, i2, 8, h2v0Var));
    }

    public final void b(i2v0 i2v0Var, int i, int i2) {
        this.d.add(new a(i, i2, 8, i2v0Var));
    }

    public final void c(int i, int i2, String str, String str2) {
        this.d.add(new a(str2, i, i2, str));
    }

    public final void d(klv0 klv0Var, int i, int i2) {
        this.b.add(new a(i, i2, 8, klv0Var));
    }

    public final void e(String str) {
        this.a.append(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s8u0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        s8u0 s8u0Var = (s8u0) obj;
        return epx.f(this.a.toString(), s8u0Var.a.toString()) && epx.f(this.b, s8u0Var.b) && epx.f(this.c, s8u0Var.c) && epx.f(this.d, s8u0Var.d) && epx.f(this.e, s8u0Var.e);
    }

    public final void f(int i) {
        ArrayList arrayList = this.e;
        if (i >= arrayList.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" should be less than ");
            throw new IllegalStateException(uq.b(arrayList, sb).toString());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            ((a) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
        }
    }

    public final int g(h2v0 h2v0Var) {
        a aVar = new a(this.a.length(), 0, 12, h2v0Var);
        this.e.add(aVar);
        this.d.add(aVar);
        return r5.size() - 1;
    }

    public final int h(uav0 uav0Var) {
        a aVar = new a(this.a.length(), 0, 12, uav0Var);
        this.e.add(aVar);
        this.c.add(aVar);
        return r5.size() - 1;
    }

    public final int hashCode() {
        return this.e.hashCode() + qr.a(this.d, qr.a(this.c, qr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final int i(klv0 klv0Var) {
        a aVar = new a(this.a.length(), 0, 12, klv0Var);
        this.e.add(aVar);
        this.b.add(aVar);
        return r5.size() - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final us2 j(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1940048542, i, -1, "com.vk.core.compose.annotated.VkAnnotatedStringBuilder.toAnnotatedString (VkAnnotatedStringBuilder.kt:120)");
        }
        us2.b b = xga0.b(-370836267, aVar);
        ArrayList arrayList = b.d;
        b.g(this.a.toString());
        aVar.K(-370835229);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            b.d(bkt0.c((klv0) ((a) arrayList2.get(i2)).a, aVar), ((a) arrayList2.get(i2)).b, ((a) arrayList2.get(i2)).c);
        }
        aVar.j();
        aVar.K(-370822468);
        ArrayList arrayList3 = this.c;
        int size2 = arrayList3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            uav0 uav0Var = (uav0) ((a) arrayList3.get(i3)).a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-804834774, 0, -1, "com.vk.core.compose.annotated.toParagraphStyle (VkParagraphStyle.kt:10)");
            }
            fh90 fh90Var = uav0Var.a.a(aVar).a.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            arrayList.add(new us2.b.a(((a) arrayList3.get(i3)).b, ((a) arrayList3.get(i3)).c, 8, fh90Var));
        }
        aVar.j();
        aVar.K(-370807540);
        ArrayList arrayList4 = this.d;
        int size3 = arrayList4.size();
        for (int i4 = 0; i4 < size3; i4++) {
            T t = ((a) arrayList4.get(i4)).a;
            if (t instanceof String) {
                aVar.K(-164389625);
                aVar.j();
                b.c(((a) arrayList4.get(i4)).b, ((a) arrayList4.get(i4)).c, ((a) arrayList4.get(i4)).d, (String) t);
            } else if (t instanceof ysp0) {
                aVar.K(-1944951677);
                aVar.j();
                arrayList.add(new us2.b.a(((a) arrayList4.get(i4)).b, ((a) arrayList4.get(i4)).c, 8, (ysp0) t));
            } else {
                tjo0 tjo0Var = null;
                if (t instanceof i2v0) {
                    aVar.K(-1944940317);
                    i2v0 i2v0Var = (i2v0) t;
                    i2v0Var.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2109150291, 0, -1, "com.vk.core.compose.annotated.VkLinkAnnotation.Url.toLinkAnnotation (VkLinkAnnotation.kt:38)");
                    }
                    String str = i2v0Var.a;
                    zqv0 zqv0Var = i2v0Var.b;
                    if (zqv0Var == null) {
                        aVar.K(-1675058052);
                    } else {
                        aVar.K(-331128795);
                        tjo0Var = zqv0Var.a(aVar);
                    }
                    aVar.j();
                    q8z.b bVar = new q8z.b(str, tjo0Var, i2v0Var.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b.b(bVar, ((a) arrayList4.get(i4)).b, ((a) arrayList4.get(i4)).c);
                    aVar.j();
                } else {
                    if (!(t instanceof h2v0)) {
                        aVar.K(-1944918947);
                        aVar.j();
                        throw new IllegalStateException("Cannot pass " + t.getClass() + " as annotation");
                    }
                    aVar.K(-1944928759);
                    h2v0 h2v0Var = (h2v0) t;
                    h2v0Var.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-822338567, 0, -1, "com.vk.core.compose.annotated.VkLinkAnnotation.Clickable.toLinkAnnotation (VkLinkAnnotation.kt:76)");
                    }
                    String str2 = h2v0Var.a;
                    zqv0 zqv0Var2 = h2v0Var.b;
                    if (zqv0Var2 == null) {
                        aVar.K(205382038);
                    } else {
                        aVar.K(6625227);
                        tjo0Var = zqv0Var2.a(aVar);
                    }
                    aVar.j();
                    q8z.a aVar2 = new q8z.a(str2, tjo0Var, h2v0Var.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b.a(aVar2, ((a) arrayList4.get(i4)).b, ((a) arrayList4.get(i4)).c);
                    aVar.j();
                }
            }
        }
        aVar.j();
        us2 n = b.n();
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAnnotatedStringBuilder(text=");
        sb.append((Object) this.a);
        sb.append(", spanStyles=");
        sb.append(this.b);
        sb.append(", paragraphStyles=");
        sb.append(this.c);
        sb.append(", annotations=");
        sb.append(this.d);
        sb.append(", styleStack=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }

    public s8u0(int i) {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    /* compiled from: VkAnnotatedStringBuilder.kt */
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

        public /* synthetic */ a(int i, int i2, int i3, Object obj) {
            this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, "");
        }
    }
}
