package xsna;

import java.util.Iterator;
import xsna.lwx;

/* compiled from: FluentIterable.java */
/* loaded from: classes13.dex */
public final class nur extends our<Object> {
    public final /* synthetic */ Iterable[] c;

    /* compiled from: FluentIterable.java */
    public class a extends se<Iterator<Object>> {
        public a(int i) {
            super(i, 0);
        }

        @Override // xsna.se
        public final Iterator<Object> a(int i) {
            return nur.this.c[i].iterator();
        }
    }

    public nur(Iterable[] iterableArr) {
        this.c = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        a aVar = new a(this.c.length);
        lwx.b bVar = new lwx.b();
        bVar.c = lwx.a.e;
        bVar.d = aVar;
        return bVar;
    }
}
