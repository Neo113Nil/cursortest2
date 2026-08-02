package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.e3m;

/* compiled from: DrawableSource.kt */
@imi0
/* loaded from: classes17.dex */
public final class hko implements dko {
    public static final b Companion = new b();
    public final int a;
    public final int b;

    /* compiled from: DrawableSource.kt */
    @ozl
    public static final /* synthetic */ class a implements vht<hko> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            xfb0 xfb0Var = new xfb0("DrawableSourceThemableRes", aVar, 2);
            xfb0Var.j("resLight", false);
            xfb0Var.j("resDark", false);
            descriptor = xfb0Var;
        }

        @Override // xsna.vht
        public final KSerializer<?>[] childSerializers() {
            n9x n9xVar = n9x.a;
            return new KSerializer[]{n9xVar, n9xVar};
        }

        @Override // xsna.a3m
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ssi d = decoder.d(serialDescriptor);
            boolean z = true;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (z) {
                int m = d.m(serialDescriptor);
                if (m == -1) {
                    z = false;
                } else if (m == 0) {
                    i2 = d.s(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (m != 1) {
                        throw new UnknownFieldException(m);
                    }
                    i3 = d.s(serialDescriptor, 1);
                    i |= 2;
                }
            }
            d.e(serialDescriptor);
            return new hko(i, i2, i3);
        }

        @Override // xsna.mmi0, xsna.a3m
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // xsna.mmi0
        public final void serialize(Encoder encoder, Object obj) {
            hko hkoVar = (hko) obj;
            SerialDescriptor serialDescriptor = descriptor;
            cti d = encoder.d(serialDescriptor);
            d.M(0, hkoVar.a, serialDescriptor);
            d.M(1, hkoVar.b, serialDescriptor);
            d.e(serialDescriptor);
        }

        @Override // xsna.vht
        public final KSerializer<?>[] typeParametersSerializers() {
            return x1o0.c;
        }
    }

    /* compiled from: DrawableSource.kt */
    public static final class b {
        public final KSerializer<hko> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ hko(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            sp.x(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    @Override // xsna.dko
    public final Drawable a(Context context) {
        CharSequence charSequence;
        String obj;
        TypedValue typedValue = new TypedValue();
        String str = "";
        if (context.getTheme().resolveAttribute(R.attr.vk_ui_theme_type, typedValue, true) && (charSequence = typedValue.string) != null && (obj = charSequence.toString()) != null) {
            str = obj;
        }
        int i = str.equals("light") ? this.a : this.b;
        LinkedHashMap linkedHashMap = x1z.a;
        e3m.a aVar = e3m.a;
        return m33.a(i, context);
    }
}
