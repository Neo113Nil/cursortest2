package xsna;

import android.net.Uri;
import androidx.media3.datasource.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hx40;

/* compiled from: CustomExoDataSource.kt */
/* loaded from: classes3.dex */
public final class dnk implements androidx.media3.datasource.a {
    public final androidx.media3.datasource.a a;
    public final a.C2745a b;

    /* compiled from: CustomExoDataSource.kt */
    public static final class a implements a.InterfaceC0045a {
        public final a.InterfaceC0045a a;
        public final hx40.b b;
        public final mjp0 c;
        public boolean d;

        /* compiled from: CustomExoDataSource.kt */
        /* renamed from: xsna.dnk$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2745a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Integer num) {
                int intValue = num.intValue();
                a aVar = (a) this.receiver;
                if (!aVar.d && intValue > 0) {
                    aVar.d = true;
                    aVar.b.invoke();
                }
                return s3q0.a;
            }
        }

        public a(a.InterfaceC0045a interfaceC0045a, hx40.b bVar, mjp0 mjp0Var) {
            this.a = interfaceC0045a;
            this.b = bVar;
            this.c = mjp0Var;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            return new dnk(this.a.createDataSource(), new C2745a(1, this, a.class, "onBytesRead", "onBytesRead(I)V", 0), this.c);
        }
    }

    public dnk(androidx.media3.datasource.a aVar, a.C2745a c2745a, mjp0 mjp0Var) {
        this.a = aVar;
        this.b = c2745a;
        aVar.addTransferListener(mjp0Var);
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        this.a.addTransferListener(mjp0Var);
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        this.a.close();
    }

    @Override // androidx.media3.datasource.a
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) {
        return this.a.open(evkVar);
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        this.b.invoke(Integer.valueOf(read));
        return read;
    }
}
