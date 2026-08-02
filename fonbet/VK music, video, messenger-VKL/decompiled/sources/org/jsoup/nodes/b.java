package org.jsoup.nodes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.jsoup.SerializationException;
import org.jsoup.helper.ValidationException;
import org.jsoup.nodes.Document;
import xsna.kir0;
import xsna.sqm0;

/* compiled from: Attributes.java */
/* loaded from: classes8.dex */
public final class b implements Iterable<org.jsoup.nodes.a>, Cloneable {
    public int b = 0;
    public String[] c = new String[3];
    public Object[] d = new Object[3];

    /* compiled from: Attributes.java */
    public class a implements Iterator<org.jsoup.nodes.a> {
        public int b = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            b bVar;
            while (true) {
                int i = this.b;
                bVar = b.this;
                if (i >= bVar.b || !b.j(bVar.c[i])) {
                    break;
                }
                this.b++;
            }
            return this.b < bVar.b;
        }

        @Override // java.util.Iterator
        public final org.jsoup.nodes.a next() {
            b bVar = b.this;
            String[] strArr = bVar.c;
            int i = this.b;
            String str = strArr[i];
            String str2 = (String) bVar.d[i];
            org.jsoup.nodes.a aVar = new org.jsoup.nodes.a();
            kir0.c(str);
            String trim = str.trim();
            kir0.b(trim);
            aVar.b = trim;
            aVar.c = str2;
            aVar.d = bVar;
            this.b++;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.b - 1;
            this.b = i;
            b.this.m(i);
        }
    }

    public static boolean j(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public final void a(String str, String str2) {
        c(this.b + 1);
        String[] strArr = this.c;
        int i = this.b;
        strArr[i] = str;
        this.d[i] = str2;
        this.b = i + 1;
    }

    public final void c(int i) {
        kir0.a(i >= this.b);
        String[] strArr = this.c;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.b * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.c = (String[]) Arrays.copyOf(strArr, i);
        this.d = Arrays.copyOf(this.d, i);
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.b = this.b;
            bVar.c = (String[]) Arrays.copyOf(this.c, this.b);
            bVar.d = Arrays.copyOf(this.d, this.b);
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b != bVar.b) {
            return false;
        }
        for (int i = 0; i < this.b; i++) {
            int h = bVar.h(this.c[i]);
            if (h == -1) {
                return false;
            }
            Object obj2 = this.d[i];
            Object obj3 = bVar.d[h];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final String f(String str) {
        Object obj;
        int h = h(str);
        return (h == -1 || (obj = this.d[h]) == null) ? "" : (String) obj;
    }

    public final void g(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        String a2;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!j(this.c[i2]) && (a2 = org.jsoup.nodes.a.a(this.c[i2], outputSettings.i)) != null) {
                org.jsoup.nodes.a.b(a2, (String) this.d[i2], appendable.append(' '), outputSettings);
            }
        }
    }

    public final int h(String str) {
        kir0.c(str);
        for (int i = 0; i < this.b; i++) {
            if (str.equals(this.c[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (((this.b * 31) + Arrays.hashCode(this.c)) * 31);
    }

    public final int i(String str) {
        kir0.c(str);
        for (int i = 0; i < this.b; i++) {
            if (str.equalsIgnoreCase(this.c[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public final Iterator<org.jsoup.nodes.a> iterator() {
        return new a();
    }

    public final void k(String str, String str2) {
        kir0.c(str);
        int h = h(str);
        if (h != -1) {
            this.d[h] = str2;
        } else {
            a(str, str2);
        }
    }

    public final void l(org.jsoup.nodes.a aVar) {
        String str = aVar.b;
        String str2 = aVar.c;
        if (str2 == null) {
            str2 = "";
        }
        k(str, str2);
        aVar.d = this;
    }

    public final void m(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new ValidationException("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.c;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.d;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.b - 1;
        this.b = i5;
        this.c[i5] = null;
        this.d[i5] = null;
    }

    public final String toString() {
        StringBuilder a2 = sqm0.a();
        try {
            g(a2, new Document("").k);
            return sqm0.d(a2);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }
}
