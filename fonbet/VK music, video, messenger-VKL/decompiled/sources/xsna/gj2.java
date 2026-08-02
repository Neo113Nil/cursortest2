package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.e3m;

/* compiled from: DrawableSource.kt */
@imi0
/* loaded from: classes17.dex */
public final class gj2 implements dko {
    public static final b Companion = new b();
    public final int a;
    public final wh50 b;

    /* compiled from: DrawableSource.kt */
    @ozl
    public static final /* synthetic */ class a implements vht<gj2> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            xfb0 xfb0Var = new xfb0("AnimatedDrawableSourceRes", aVar, 1);
            xfb0Var.j("res", false);
            descriptor = xfb0Var;
        }

        @Override // xsna.vht
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{n9x.a};
        }

        @Override // xsna.a3m
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ssi d = decoder.d(serialDescriptor);
            boolean z = true;
            int i = 0;
            int i2 = 0;
            while (z) {
                int m = d.m(serialDescriptor);
                if (m == -1) {
                    z = false;
                } else {
                    if (m != 0) {
                        throw new UnknownFieldException(m);
                    }
                    i2 = d.s(serialDescriptor, 0);
                    i = 1;
                }
            }
            d.e(serialDescriptor);
            return new gj2(i, i2);
        }

        @Override // xsna.mmi0, xsna.a3m
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // xsna.mmi0
        public final void serialize(Encoder encoder, Object obj) {
            SerialDescriptor serialDescriptor = descriptor;
            cti d = encoder.d(serialDescriptor);
            d.M(0, ((gj2) obj).a, serialDescriptor);
            d.e(serialDescriptor);
        }

        @Override // xsna.vht
        public final KSerializer<?>[] typeParametersSerializers() {
            return x1o0.c;
        }
    }

    /* compiled from: DrawableSource.kt */
    public static final class b {
        public final KSerializer<gj2> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ gj2(int i, int i2) {
        if (1 != (i & 1)) {
            sp.x(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = androidx.compose.runtime.k.b(Boolean.FALSE);
    }

    @Override // xsna.dko
    public final Drawable a(Context context) {
        e3m.a aVar = e3m.a;
        return m33.a(this.a, context);
    }

    public gj2() {
        this.a = R.drawable.vk_icon_animated_notification_receive_28_60fps;
        this.b = androidx.compose.runtime.k.b(Boolean.FALSE);
    }
}
