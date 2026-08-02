package xsna;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* compiled from: CLObject.java */
/* loaded from: classes11.dex */
public final class bv8 extends xu8 implements Iterable<zu8> {

    /* compiled from: CLObject.java */
    public static class a implements Iterator<zu8> {
        public bv8 b;
        public int c;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.b.f.size();
        }

        @Override // java.util.Iterator
        public final zu8 next() {
            zu8 zu8Var = (zu8) this.b.f.get(this.c);
            this.c++;
            return zu8Var;
        }
    }

    @Override // xsna.xu8
    @NonNull
    /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final bv8 clone() {
        return (bv8) super.clone();
    }

    @Override // xsna.xu8, xsna.yu8
    @NonNull
    /* renamed from: clone */
    public final Object e() throws CloneNotSupportedException {
        return (bv8) super.clone();
    }

    @Override // java.lang.Iterable
    public final Iterator<zu8> iterator() {
        a aVar = new a();
        aVar.c = 0;
        aVar.b = this;
        return aVar;
    }
}
