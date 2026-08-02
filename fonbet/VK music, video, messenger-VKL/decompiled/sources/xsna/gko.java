package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.e3m;

/* compiled from: DrawableSource.kt */
@vby
@imi0
/* loaded from: classes17.dex */
public final class gko implements dko {
    public static final b Companion = new b();
    public final int a;

    /* compiled from: DrawableSource.kt */
    @ozl
    public static final /* synthetic */ class a implements vht<gko> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            qzw qzwVar = new qzw("DrawableSourceRes", aVar);
            qzwVar.j("res", false);
            descriptor = qzwVar;
        }

        @Override // xsna.vht
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{n9x.a};
        }

        @Override // xsna.a3m
        public final Object deserialize(Decoder decoder) {
            return new gko(decoder.C(descriptor).B());
        }

        @Override // xsna.mmi0, xsna.a3m
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // xsna.mmi0
        public final void serialize(Encoder encoder, Object obj) {
            int i = ((gko) obj).a;
            Encoder i2 = encoder.i(descriptor);
            if (i2 == null) {
                return;
            }
            i2.o(i);
        }

        @Override // xsna.vht
        public final KSerializer<?>[] typeParametersSerializers() {
            return x1o0.c;
        }
    }

    /* compiled from: DrawableSource.kt */
    public static final class b {
        public final KSerializer<gko> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ gko(int i) {
        this.a = i;
    }

    public static Drawable b(int i, Context context) {
        LinkedHashMap linkedHashMap = x1z.a;
        e3m.a aVar = e3m.a;
        return m33.a(i, context);
    }

    public static final /* synthetic */ gko c(int i) {
        return new gko(i);
    }

    @Override // xsna.dko
    public final Drawable a(Context context) {
        return b(this.a, context);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gko) {
            return this.a == ((gko) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("DrawableSourceRes(res=", this.a, ')');
    }
}
