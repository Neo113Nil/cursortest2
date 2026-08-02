package xsna;

import xsna.anp0;

/* compiled from: TransitionOptions.java */
/* loaded from: classes12.dex */
public abstract class anp0<CHILD extends anp0<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof anp0)) {
            return false;
        }
        ((anp0) obj).getClass();
        char[] cArr = s2r0.a;
        Object obj2 = n470.a;
        return obj2.equals(obj2);
    }

    public int hashCode() {
        return n470.a.hashCode();
    }
}
