package xsna;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: CLContainer.java */
/* loaded from: classes11.dex */
public class xu8 extends yu8 {
    public ArrayList<yu8> f;

    public xu8(char[] cArr) {
        super(cArr);
        this.f = new ArrayList<>();
    }

    public final void A(float f, String str) {
        z(str, new av8(f));
    }

    public final void B(String str, String str2) {
        dv8 dv8Var = new dv8(str2.toCharArray());
        dv8Var.c = 0L;
        dv8Var.m(str2.length() - 1);
        z(str, dv8Var);
    }

    @Override // xsna.yu8
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xu8) {
            return this.f.equals(((xu8) obj).f);
        }
        return false;
    }

    public final float getFloat(int i) throws CLParsingException {
        yu8 p = p(i);
        if (p != null) {
            return p.j();
        }
        throw new CLParsingException(lhg.a(i, "no float at index "), this);
    }

    public final int getInt(int i) throws CLParsingException {
        yu8 p = p(i);
        if (p != null) {
            return p.k();
        }
        throw new CLParsingException(lhg.a(i, "no int at index "), this);
    }

    @Override // xsna.yu8
    public int hashCode() {
        return Objects.hash(this.f, Integer.valueOf(super.hashCode()));
    }

    public final void n(yu8 yu8Var) {
        this.f.add(yu8Var);
    }

    @Override // xsna.yu8
    @NonNull
    /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public xu8 clone() {
        xu8 xu8Var = (xu8) super.clone();
        ArrayList<yu8> arrayList = new ArrayList<>(this.f.size());
        Iterator<yu8> it = this.f.iterator();
        while (it.hasNext()) {
            yu8 clone = it.next().clone();
            clone.e = xu8Var;
            arrayList.add(clone);
        }
        xu8Var.f = arrayList;
        return xu8Var;
    }

    public final yu8 p(int i) throws CLParsingException {
        if (i < 0 || i >= this.f.size()) {
            throw new CLParsingException(lhg.a(i, "no element at index "), this);
        }
        return this.f.get(i);
    }

    public final yu8 q(String str) throws CLParsingException {
        Iterator<yu8> it = this.f.iterator();
        while (it.hasNext()) {
            zu8 zu8Var = (zu8) it.next();
            if (zu8Var.i().equals(str)) {
                if (zu8Var.f.size() > 0) {
                    return zu8Var.f.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(zr.a("no element for key <", str, ">"), this);
    }

    public final float r(String str) throws CLParsingException {
        yu8 q = q(str);
        if (q != null) {
            return q.j();
        }
        StringBuilder a = t33.a("no float found for key <", str, ">, found [");
        a.append(q.l());
        a.append("] : ");
        a.append(q);
        throw new CLParsingException(a.toString(), this);
    }

    public final yu8 s(int i) {
        if (i < 0 || i >= this.f.size()) {
            return null;
        }
        return this.f.get(i);
    }

    public final yu8 t(String str) {
        Iterator<yu8> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zu8 zu8Var = (zu8) it.next();
            if (zu8Var.i().equals(str)) {
                if (zu8Var.f.size() > 0) {
                    return zu8Var.f.get(0);
                }
            }
        }
        return null;
    }

    @Override // xsna.yu8
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<yu8> it = this.f.iterator();
        while (it.hasNext()) {
            yu8 next = it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final String u(int i) throws CLParsingException {
        yu8 p = p(i);
        if (p instanceof dv8) {
            return p.i();
        }
        throw new CLParsingException(lhg.a(i, "no string at index "), this);
    }

    public final String v(String str) throws CLParsingException {
        yu8 q = q(str);
        if (q instanceof dv8) {
            return q.i();
        }
        StringBuilder a = xe9.a("no string found for key <", str, ">, found [", q != null ? q.l() : null, "] : ");
        a.append(q);
        throw new CLParsingException(a.toString(), this);
    }

    public final String w(String str) {
        yu8 t = t(str);
        if (t instanceof dv8) {
            return t.i();
        }
        return null;
    }

    public final boolean x(String str) {
        Iterator<yu8> it = this.f.iterator();
        while (it.hasNext()) {
            yu8 next = it.next();
            if ((next instanceof zu8) && ((zu8) next).i().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<yu8> it = this.f.iterator();
        while (it.hasNext()) {
            yu8 next = it.next();
            if (next instanceof zu8) {
                arrayList.add(((zu8) next).i());
            }
        }
        return arrayList;
    }

    public final void z(String str, yu8 yu8Var) {
        Iterator<yu8> it = this.f.iterator();
        while (it.hasNext()) {
            zu8 zu8Var = (zu8) it.next();
            if (zu8Var.i().equals(str)) {
                if (zu8Var.f.size() > 0) {
                    zu8Var.f.set(0, yu8Var);
                    return;
                } else {
                    zu8Var.f.add(yu8Var);
                    return;
                }
            }
        }
        zu8 zu8Var2 = new zu8(str.toCharArray());
        zu8Var2.c = 0L;
        zu8Var2.m(str.length() - 1);
        if (zu8Var2.f.size() > 0) {
            zu8Var2.f.set(0, yu8Var);
        } else {
            zu8Var2.f.add(yu8Var);
        }
        this.f.add(zu8Var2);
    }
}
