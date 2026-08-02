package xsna;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtoSyntax;
import com.unity3d.services.core.fid.Constants;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class kj00 {
    public static final a b = new a();
    public final ea20 a;

    /* compiled from: ManifestSchemaFactory.java */
    public class a implements ea20 {
        @Override // xsna.ea20
        public final boolean a(Class<?> cls) {
            return false;
        }

        @Override // xsna.ea20
        public final aa20 b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            a = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    public static class c implements ea20 {
        public ea20[] a;

        @Override // xsna.ea20
        public final boolean a(Class<?> cls) {
            for (ea20 ea20Var : this.a) {
                if (ea20Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.ea20
        public final aa20 b(Class<?> cls) {
            for (ea20 ea20Var : this.a) {
                if (ea20Var.a(cls)) {
                    return ea20Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public kj00() {
        ea20 ea20Var;
        try {
            ea20Var = (ea20) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            ea20Var = b;
        }
        ea20[] ea20VarArr = {tht.a, ea20Var};
        c cVar = new c();
        cVar.a = ea20VarArr;
        this.a = (ea20) Internal.checkNotNull(cVar, "messageInfoFactory");
    }
}
