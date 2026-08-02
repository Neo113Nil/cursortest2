package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: Strings.kt */
/* loaded from: classes8.dex */
public final class zvl implements uki0<k9x> {
    public final CharSequence a;
    public final int b;
    public final wzs<CharSequence, Integer, Pair<Integer, Integer>> c;

    /* compiled from: Strings.kt */
    public static final class a implements Iterator<k9x>, gcy {
        public int b = -1;
        public int c;
        public int d;
        public k9x e;
        public int f;

        public a() {
            int g = swe0.g(0, 0, zvl.this.a.length());
            this.c = g;
            this.d = g;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        
            if (r6 < r3) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            int i = this.d;
            if (i < 0) {
                this.b = 0;
                this.e = null;
                return;
            }
            zvl zvlVar = zvl.this;
            int i2 = zvlVar.b;
            if (i2 > 0) {
                int i3 = this.f + 1;
                this.f = i3;
            }
            if (i <= zvlVar.a.length()) {
                Pair<Integer, Integer> invoke = zvlVar.c.invoke(zvlVar.a, Integer.valueOf(this.d));
                if (invoke == null) {
                    this.e = new k9x(this.c, drm0.H(zvlVar.a), 1);
                    this.d = -1;
                } else {
                    int intValue = invoke.d().intValue();
                    int intValue2 = invoke.g().intValue();
                    this.e = swe0.q(this.c, intValue);
                    int i4 = intValue + intValue2;
                    this.c = i4;
                    this.d = i4 + (intValue2 == 0 ? 1 : 0);
                }
                this.b = 1;
            }
            this.e = new k9x(this.c, drm0.H(zvlVar.a), 1);
            this.d = -1;
            this.b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public final k9x next() {
            if (this.b == -1) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            k9x k9xVar = this.e;
            this.e = null;
            this.b = -1;
            return k9xVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public zvl(CharSequence charSequence, int i, wzs wzsVar) {
        this.a = charSequence;
        this.b = i;
        this.c = wzsVar;
    }

    @Override // xsna.uki0
    public final Iterator<k9x> iterator() {
        return new a();
    }
}
