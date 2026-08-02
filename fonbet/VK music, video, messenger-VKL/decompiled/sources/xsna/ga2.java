package xsna;

import android.content.Context;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import xsna.mjp;

/* compiled from: AndroidKeysetManager.java */
/* loaded from: classes.dex */
public final class ga2 {
    public static final /* synthetic */ int b = 0;
    public final ciy a;

    /* compiled from: AndroidKeysetManager.java */
    public static final class a {
        public maj0 a = null;
        public naj0 b = null;
        public String c = null;
        public ha2 d = null;
        public KeyTemplate e = null;
        public ciy f;

        public final synchronized ga2 a() throws GeneralSecurityException, IOException {
            try {
                if (this.c != null) {
                    this.d = c();
                }
                this.f = b();
            } catch (Throwable th) {
                throw th;
            }
            return new ga2(this);
        }

        public final ciy b() throws GeneralSecurityException, IOException {
            try {
                ha2 ha2Var = this.d;
                if (ha2Var != null) {
                    try {
                        com.google.crypto.tink.proto.a aVar = aiy.b(this.a, ha2Var).a;
                        GeneratedMessageLite.a aVar2 = (GeneratedMessageLite.a) aVar.h(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
                        aVar2.m(aVar);
                        return new ciy((a.b) aVar2);
                    } catch (InvalidProtocolBufferException | GeneralSecurityException unused) {
                    }
                }
                com.google.crypto.tink.proto.a aVar3 = f9t.I(this.a).a;
                GeneratedMessageLite.a aVar4 = (GeneratedMessageLite.a) aVar3.h(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
                aVar4.m(aVar3);
                return new ciy((a.b) aVar4);
            } catch (FileNotFoundException unused2) {
                if (this.e == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                a.b w = com.google.crypto.tink.proto.a.w();
                ciy ciyVar = new ciy(w);
                KeyTemplate keyTemplate = this.e;
                synchronized (ciyVar) {
                    dey deyVar = keyTemplate.a;
                    synchronized (ciyVar) {
                        a.c c = ciyVar.c(deyVar);
                        w.l();
                        com.google.crypto.tink.proto.a.r((com.google.crypto.tink.proto.a) w.c, c);
                        int u = t2r0.a(ciyVar.a().a).s().u();
                        synchronized (ciyVar) {
                            for (int i = 0; i < ((com.google.crypto.tink.proto.a) ciyVar.a.c).t(); i++) {
                                a.c s = ((com.google.crypto.tink.proto.a) ciyVar.a.c).s(i);
                                if (s.v() == u) {
                                    if (!s.x().equals(KeyStatusType.ENABLED)) {
                                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + u);
                                    }
                                    a.b bVar = ciyVar.a;
                                    bVar.l();
                                    com.google.crypto.tink.proto.a.q((com.google.crypto.tink.proto.a) bVar.c, u);
                                    if (this.d != null) {
                                        aiy a = ciyVar.a();
                                        naj0 naj0Var = this.b;
                                        ha2 ha2Var2 = this.d;
                                        com.google.crypto.tink.proto.a aVar5 = a.a;
                                        byte[] a2 = ha2Var2.a(aVar5.toByteArray(), new byte[0]);
                                        try {
                                            if (!com.google.crypto.tink.proto.a.x(ha2Var2.b(a2, new byte[0]), com.google.crypto.tink.shaded.protobuf.k.a()).equals(aVar5)) {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                            mjp.b t = mjp.t();
                                            t.o(ByteString.e(0, a2.length, a2));
                                            t.p(t2r0.a(aVar5));
                                            if (!naj0Var.a.putString(naj0Var.b, g2v.b(t.j().toByteArray())).commit()) {
                                                throw new IOException("Failed to write to SharedPreferences");
                                            }
                                        } catch (InvalidProtocolBufferException unused3) {
                                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                                        }
                                    } else {
                                        f9t.O(ciyVar.a(), this.b);
                                    }
                                    return ciyVar;
                                }
                            }
                            throw new GeneralSecurityException("key not found: " + u);
                        }
                    }
                }
            }
        }

        public final ha2 c() throws GeneralSecurityException {
            ia2 ia2Var = new ia2();
            boolean d = ia2Var.d(this.c);
            if (!d) {
                try {
                    ia2.c(this.c);
                } catch (GeneralSecurityException | ProviderException unused) {
                    return null;
                }
            }
            try {
                return ia2Var.a(this.c);
            } catch (GeneralSecurityException | ProviderException e) {
                if (d) {
                    throw new KeyStoreException(zr.a("the master key ", this.c, " exists but is unusable"), e);
                }
                return null;
            }
        }

        public final void d(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.a = new maj0(context, str, str2);
            this.b = new naj0(context, str, str2);
        }
    }

    public ga2(a aVar) throws GeneralSecurityException, IOException {
        ha2 ha2Var = aVar.d;
        this.a = aVar.f;
    }
}
