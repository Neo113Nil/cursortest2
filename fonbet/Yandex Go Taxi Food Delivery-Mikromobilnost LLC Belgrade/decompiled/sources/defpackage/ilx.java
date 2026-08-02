package defpackage;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class ilx extends GeneratedMessageLite implements yt10 {
    private static final ilx DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private nqw key_ = gvf0.w;
    private int primaryKeyId_;

    static {
        ilx ilxVar = new ilx();
        DEFAULT_INSTANCE = ilxVar;
        GeneratedMessageLite.t(ilx.class, ilxVar);
    }

    public static flx D() {
        return (flx) DEFAULT_INSTANCE.h();
    }

    public static ilx E(ByteArrayInputStream byteArrayInputStream, oyo oyoVar) {
        GeneratedMessageLite s = GeneratedMessageLite.s(DEFAULT_INSTANCE, new e(byteArrayInputStream), oyoVar);
        GeneratedMessageLite.g(s);
        return (ilx) s;
    }

    public static ilx F(byte[] bArr, oyo oyoVar) {
        ilx ilxVar = DEFAULT_INSTANCE;
        int length = bArr.length;
        GeneratedMessageLite q = ilxVar.q();
        try {
            cvf0 cvf0Var = cvf0.c;
            cvf0Var.getClass();
            rom0 a = cvf0Var.a(q.getClass());
            a.h(q, bArr, 0, length, new w43(oyoVar));
            a.c(q);
            GeneratedMessageLite.g(q);
            return (ilx) q;
        } catch (InvalidProtocolBufferException e) {
            InvalidProtocolBufferException invalidProtocolBufferException = e;
            if (invalidProtocolBufferException.a()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException(invalidProtocolBufferException);
            }
            invalidProtocolBufferException.k(q);
            throw invalidProtocolBufferException;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException2.k(q);
            throw invalidProtocolBufferException2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException3 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException3.k(q);
            throw invalidProtocolBufferException3;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException l = InvalidProtocolBufferException.l();
            l.k(q);
            throw l;
        }
    }

    public static void x(ilx ilxVar, int i) {
        ilxVar.primaryKeyId_ = i;
    }

    public static void y(ilx ilxVar, hlx hlxVar) {
        ilxVar.getClass();
        nqw nqwVar = ilxVar.key_;
        if (!((o9) nqwVar).a) {
            int size = nqwVar.size();
            ilxVar.key_ = nqwVar.w(size == 0 ? 10 : size * 2);
        }
        ilxVar.key_.add(hlxVar);
    }

    public final int A() {
        return this.key_.size();
    }

    public final List B() {
        return this.key_;
    }

    public final int C() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (elx.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ilx();
            case 2:
                return new flx(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", hlx.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (ilx.class) {
                    try {
                        nf90Var = PARSER;
                        if (nf90Var == null) {
                            nf90Var = new nxs(DEFAULT_INSTANCE);
                            PARSER = nf90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nf90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.vt10
    public final /* bridge */ /* synthetic */ k newBuilderForType() {
        return newBuilderForType();
    }

    public final hlx z(int i) {
        return (hlx) this.key_.get(i);
    }
}
