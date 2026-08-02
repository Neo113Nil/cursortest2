package androidx.datastore.preferences.protobuf;

import defpackage.au10;
import defpackage.qir;
import defpackage.tom0;
import defpackage.xt10;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a implements xt10 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0008a implements au10, Cloneable {
        @Override // 
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public abstract l clone();
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public int c(tom0 tom0Var) {
        int b = b();
        if (b != -1) {
            return b;
        }
        int e = tom0Var.e(this);
        d(e);
        return e;
    }

    public void d(int i) {
        throw new UnsupportedOperationException();
    }

    public final ByteString e() {
        try {
            int c = ((GeneratedMessageLite) this).c(null);
            ByteString byteString = ByteString.a;
            c cVar = new c(c);
            ((GeneratedMessageLite) this).n(cVar.b());
            return cVar.a();
        } catch (IOException e) {
            qir.s("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }
}
