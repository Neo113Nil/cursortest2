package xsna;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class jj00 {
    public static final a b = new a();
    public final b a;

    /* compiled from: ManifestSchemaFactory.java */
    public class a implements da20 {
        @Override // xsna.da20
        public final boolean a(Class<?> cls) {
            return false;
        }

        @Override // xsna.da20
        public final z920 b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    public static class b implements da20 {
        public da20[] a;

        @Override // xsna.da20
        public final boolean a(Class<?> cls) {
            for (da20 da20Var : this.a) {
                if (da20Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.da20
        public final z920 b(Class<?> cls) {
            for (da20 da20Var : this.a) {
                if (da20Var.a(cls)) {
                    return da20Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public jj00() {
        da20 da20Var;
        try {
            da20Var = (da20) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            da20Var = b;
        }
        da20[] da20VarArr = {sht.a, da20Var};
        b bVar = new b();
        bVar.a = da20VarArr;
        Charset charset = com.google.crypto.tink.shaded.protobuf.q.a;
        this.a = bVar;
    }
}
