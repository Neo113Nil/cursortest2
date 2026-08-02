package xsna;

import androidx.datastore.preferences.protobuf.ProtoSyntax;
import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class hj00 {
    public static final a b = new a();
    public final c a;

    /* compiled from: ManifestSchemaFactory.java */
    public class a implements fa20 {
        @Override // xsna.fa20
        public final boolean a(Class<?> cls) {
            return false;
        }

        @Override // xsna.fa20
        public final ba20 b(Class<?> cls) {
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
    public static class c implements fa20 {
        public fa20[] a;

        @Override // xsna.fa20
        public final boolean a(Class<?> cls) {
            for (fa20 fa20Var : this.a) {
                if (fa20Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.fa20
        public final ba20 b(Class<?> cls) {
            for (fa20 fa20Var : this.a) {
                if (fa20Var.a(cls)) {
                    return fa20Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public hj00() {
        fa20 fa20Var;
        v8e0 v8e0Var = v8e0.c;
        try {
            fa20Var = (fa20) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            fa20Var = b;
        }
        fa20[] fa20VarArr = {uht.a, fa20Var};
        c cVar = new c();
        cVar.a = fa20VarArr;
        Charset charset = androidx.datastore.preferences.protobuf.p.a;
        this.a = cVar;
    }
}
