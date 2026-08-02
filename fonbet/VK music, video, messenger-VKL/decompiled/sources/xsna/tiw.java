package xsna;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.siw;

/* compiled from: ImageFormatChecker.kt */
/* loaded from: classes.dex */
public final class tiw {
    public static final Object d = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new jbw(1));
    public int a;
    public List<? extends siw.a> b;
    public final ggl c = new ggl();

    /* compiled from: ImageFormatChecker.kt */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public static siw a(InputStream inputStream) throws IOException {
            int L;
            tiw tiwVar = (tiw) tiw.d.getValue();
            int i = tiwVar.a;
            byte[] bArr = new byte[i];
            if (inputStream.markSupported()) {
                try {
                    inputStream.mark(i);
                    L = s200.L(inputStream, bArr, i);
                } finally {
                    inputStream.reset();
                }
            } else {
                L = s200.L(inputStream, bArr, i);
            }
            siw a = tiwVar.c.a(L, bArr);
            boolean equals = a.equals(hgl.m);
            siw siwVar = siw.c;
            if (equals) {
                a = siwVar;
            }
            if (a != siwVar) {
                return a;
            }
            List<? extends siw.a> list = tiwVar.b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    siw a2 = ((siw.a) it.next()).a(L, bArr);
                    if (a2 != siwVar) {
                        return a2;
                    }
                }
            }
            return siwVar;
        }
    }

    public tiw() {
        a();
    }

    public final void a() {
        this.a = this.c.a;
        List<? extends siw.a> list = this.b;
        if (list != null) {
            Iterator<? extends siw.a> it = list.iterator();
            while (it.hasNext()) {
                this.a = Math.max(this.a, it.next().b());
            }
        }
    }
}
