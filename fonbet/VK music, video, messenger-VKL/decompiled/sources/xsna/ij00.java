package xsna;

import androidx.health.platform.client.proto.ProtoSyntax;
import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes12.dex */
public final class ij00 {
    public static final a b = new a();
    public final c a;

    /* compiled from: ManifestSchemaFactory.java */
    public class a implements ca20 {
        @Override // xsna.ca20
        public final boolean a(Class<?> cls) {
            return false;
        }

        @Override // xsna.ca20
        public final y920 b(Class<?> cls) {
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
    public static class c implements ca20 {
        public ca20[] a;

        @Override // xsna.ca20
        public final boolean a(Class<?> cls) {
            for (ca20 ca20Var : this.a) {
                if (ca20Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.ca20
        public final y920 b(Class<?> cls) {
            for (ca20 ca20Var : this.a) {
                if (ca20Var.a(cls)) {
                    return ca20Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public ij00() {
        ca20 ca20Var;
        s8e0 s8e0Var = s8e0.c;
        try {
            ca20Var = (ca20) Class.forName("androidx.health.platform.client.proto.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            ca20Var = b;
        }
        ca20[] ca20VarArr = {rht.a, ca20Var};
        c cVar = new c();
        cVar.a = ca20VarArr;
        Charset charset = androidx.health.platform.client.proto.b0.a;
        this.a = cVar;
    }
}
