package org.jsoup.nodes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.SerializationException;
import org.jsoup.helper.ValidationException;
import org.jsoup.nodes.Document;
import xsna.h570;
import xsna.kir0;
import xsna.q7o;
import xsna.sqm0;

/* compiled from: Node.java */
/* loaded from: classes8.dex */
public abstract class j implements Cloneable {
    public static final List<j> d = Collections.EMPTY_LIST;
    public j b;
    public int c;

    /* compiled from: Node.java */
    public static class a implements h570 {
        public final Appendable b;
        public final Document.OutputSettings c;

        public a(Appendable appendable, Document.OutputSettings outputSettings) {
            this.b = appendable;
            this.c = outputSettings;
            outputSettings.e();
        }

        @Override // xsna.h570
        public final void a(j jVar, int i) {
            if (jVar.s().equals("#text")) {
                return;
            }
            try {
                jVar.w(this.b, i, this.c);
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        @Override // xsna.h570
        public final void b(j jVar, int i) {
            try {
                jVar.v(this.b, i, this.c);
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }
    }

    public static void q(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        String valueOf;
        Appendable append = appendable.append('\n');
        int i2 = i * outputSettings.g;
        int i3 = outputSettings.h;
        String[] strArr = sqm0.a;
        if (!(i2 >= 0)) {
            throw new ValidationException("width must be >= 0");
        }
        kir0.a(i3 >= -1);
        if (i3 != -1) {
            i2 = Math.min(i2, i3);
        }
        String[] strArr2 = sqm0.a;
        if (i2 < 21) {
            valueOf = strArr2[i2];
        } else {
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = ' ';
            }
            valueOf = String.valueOf(cArr);
        }
        append.append(valueOf);
    }

    public void A(j jVar) {
        kir0.a(jVar.b == this);
        int i = jVar.c;
        n().remove(i);
        z(i);
        jVar.b = null;
    }

    public j B() {
        j jVar = this;
        while (true) {
            j jVar2 = jVar.b;
            if (jVar2 == null) {
                return jVar;
            }
            jVar = jVar2;
        }
    }

    public String a(String str) {
        Object obj;
        kir0.b(str);
        if (!p() || e().i(str) == -1) {
            return "";
        }
        String i = i();
        b e = e();
        int i2 = e.i(str);
        String str2 = (i2 == -1 || (obj = e.d[i2]) == null) ? "" : (String) obj;
        Pattern pattern = sqm0.d;
        String replaceAll = pattern.matcher(i).replaceAll("");
        String replaceAll2 = pattern.matcher(str2).replaceAll("");
        try {
            try {
                return sqm0.e(new URL(replaceAll), replaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(replaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return sqm0.c.matcher(replaceAll2).find() ? replaceAll2 : "";
        }
    }

    public final void b(int i, j... jVarArr) {
        kir0.c(jVarArr);
        if (jVarArr.length == 0) {
            return;
        }
        List<j> n = n();
        j y = jVarArr[0].y();
        if (y != null && y.j() == jVarArr.length) {
            List<j> n2 = y.n();
            int length = jVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    boolean z = j() == 0;
                    y.m();
                    n.addAll(i, Arrays.asList(jVarArr));
                    int length2 = jVarArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        jVarArr[i3].b = this;
                        length2 = i3;
                    }
                    if (z && jVarArr[0].c == 0) {
                        return;
                    }
                    z(i);
                    return;
                }
                if (jVarArr[i2] != n2.get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (j jVar : jVarArr) {
            if (jVar == null) {
                throw new ValidationException("Array must not contain any null objects");
            }
        }
        for (j jVar2 : jVarArr) {
            jVar2.getClass();
            j jVar3 = jVar2.b;
            if (jVar3 != null) {
                jVar3.A(jVar2);
            }
            jVar2.b = this;
        }
        n.addAll(i, Arrays.asList(jVarArr));
        z(i);
    }

    public String c(String str) {
        Object obj;
        kir0.c(str);
        if (p()) {
            b e = e();
            int i = e.i(str);
            String str2 = (i == -1 || (obj = e.d[i]) == null) ? "" : (String) obj;
            if (str2.length() > 0) {
                return str2;
            }
            if (str.startsWith("abs:")) {
                return a(str.substring(4));
            }
        }
        return "";
    }

    public abstract b e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String i();

    public abstract int j();

    @Override // 
    public j k() {
        j l = l(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(l);
        while (!linkedList.isEmpty()) {
            j jVar = (j) linkedList.remove();
            int j = jVar.j();
            for (int i = 0; i < j; i++) {
                List<j> n = jVar.n();
                j l2 = n.get(i).l(jVar);
                n.set(i, l2);
                linkedList.add(l2);
            }
        }
        return l;
    }

    public j l(j jVar) {
        Document x;
        try {
            j jVar2 = (j) super.clone();
            jVar2.b = jVar;
            jVar2.c = jVar == null ? 0 : this.c;
            if (jVar == null && !(this instanceof Document) && (x = x()) != null) {
                Document document = new Document(x.i());
                b bVar = x.h;
                if (bVar != null) {
                    document.h = bVar.clone();
                }
                document.k = x.k.clone();
                jVar2.b = document;
                document.n().add(jVar2);
            }
            return jVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract j m();

    public abstract List<j> n();

    public final boolean o(String str) {
        if (!p()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (e().i(substring) != -1 && !a(substring).isEmpty()) {
                return true;
            }
        }
        return e().i(str) != -1;
    }

    public abstract boolean p();

    public final j r() {
        j jVar = this.b;
        if (jVar == null) {
            return null;
        }
        List<j> n = jVar.n();
        int i = this.c + 1;
        if (n.size() > i) {
            return n.get(i);
        }
        return null;
    }

    public abstract String s();

    public String t() {
        return s();
    }

    public String toString() {
        return u();
    }

    public String u() {
        StringBuilder a2 = sqm0.a();
        Document x = x();
        if (x == null) {
            x = new Document("");
        }
        q7o.j(new a(a2, x.k), this);
        return sqm0.d(a2);
    }

    public abstract void v(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException;

    public abstract void w(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException;

    public final Document x() {
        j B = B();
        if (B instanceof Document) {
            return (Document) B;
        }
        return null;
    }

    public j y() {
        return this.b;
    }

    public final void z(int i) {
        int j = j();
        if (j == 0) {
            return;
        }
        List<j> n = n();
        while (i < j) {
            n.get(i).c = i;
            i++;
        }
    }
}
