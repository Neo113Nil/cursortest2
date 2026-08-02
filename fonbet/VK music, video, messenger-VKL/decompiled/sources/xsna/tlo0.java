package xsna;

import android.content.Context;
import android.content.res.Resources;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: TextSource.kt */
@imi0
/* loaded from: classes17.dex */
public interface tlo0 {
    public static final a Companion = a.a;

    /* compiled from: TextSource.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public static e a(int i, int i2, Object... objArr) {
            return new e(i, i2, rl3.u0(objArr));
        }

        public static f b(int i) {
            return new f(i);
        }

        public static g c(int i, Object... objArr) {
            return new g(i, rl3.u0(objArr));
        }

        public static h d(String str) {
            return new h(str);
        }

        public final KSerializer<tlo0> serializer() {
            return new slh0("com.vk.core.data.textsource.TextSource", fpf0.a(tlo0.class), new dcy[]{fpf0.a(d.class), fpf0.a(e.class), fpf0.a(f.class), fpf0.a(g.class), fpf0.a(h.class)}, new KSerializer[]{d.a.a, e.a.a, f.a.a, g.a.a, h.a.a}, new Annotation[0]);
        }
    }

    /* compiled from: TextSource.kt */
    public static final class b {
        public static CharSequence a(tlo0 tlo0Var, Context context) {
            return tlo0Var.b(context.getResources());
        }

        public static CharSequence b(tlo0 tlo0Var, Resources resources) {
            if (tlo0Var instanceof f) {
                return resources.getString(((f) tlo0Var).a);
            }
            if (tlo0Var instanceof g) {
                g gVar = (g) tlo0Var;
                int i = gVar.a;
                Object[] array = gVar.b.toArray(new Object[0]);
                return resources.getString(i, Arrays.copyOf(array, array.length));
            }
            if (tlo0Var instanceof d) {
                d dVar = (d) tlo0Var;
                int i2 = dVar.a;
                int i3 = dVar.b;
                return resources.getQuantityString(i2, i3, Integer.valueOf(i3));
            }
            if (tlo0Var instanceof h) {
                return ((h) tlo0Var).a;
            }
            if (!(tlo0Var instanceof e)) {
                if (tlo0Var instanceof c) {
                    return "";
                }
                throw new NoWhenBranchMatchedException();
            }
            e eVar = (e) tlo0Var;
            int i4 = eVar.a;
            int i5 = eVar.b;
            Object[] array2 = eVar.c.toArray(new Object[0]);
            return resources.getQuantityString(i4, i5, Arrays.copyOf(array2, array2.length));
        }
    }

    /* compiled from: TextSource.kt */
    public static final class c implements tlo0 {
        public static final c a = new c();

        @Override // xsna.tlo0
        public final CharSequence a(Context context) {
            return b.a(this, context);
        }

        @Override // xsna.tlo0
        public final CharSequence b(Resources resources) {
            return b.b(this, resources);
        }
    }

    /* compiled from: TextSource.kt */
    @imi0
    public static final class d implements tlo0 {
        public static final b Companion = new b();
        public final int a;
        public final int b;

        /* compiled from: TextSource.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<d> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.data.textsource.TextSource.Plurals", aVar, 2);
                xfb0Var.j("resId", false);
                xfb0Var.j("quantity", false);
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
                return new d(i, i2, i3);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                d.M(0, dVar.a, serialDescriptor);
                d.M(1, dVar.b, serialDescriptor);
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: TextSource.kt */
        public static final class b {
            public final KSerializer<d> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ d(int i, int i2, int i3) {
            if (3 != (i & 3)) {
                sp.x(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.a = i2;
            this.b = i3;
        }

        @Override // xsna.tlo0
        public final CharSequence a(Context context) {
            return b.a(this, context);
        }

        @Override // xsna.tlo0
        public final CharSequence b(Resources resources) {
            return b.b(this, resources);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Plurals(resId=");
            sb.append(this.a);
            sb.append(", quantity=");
            return vu5.b(sb, this.b, ')');
        }

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: TextSource.kt */
    @imi0
    public static final class e implements tlo0 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] d = {null, null, msy.a(LazyThreadSafetyMode.PUBLICATION, new xqf0(6))};
        public final int a;
        public final int b;
        public final List<Object> c;

        /* compiled from: TextSource.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<e> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.data.textsource.TextSource.PluralsParams", aVar, 3);
                xfb0Var.j("resId", false);
                xfb0Var.j("quantity", false);
                xfb0Var.j("args", false);
                descriptor = xfb0Var;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = e.d;
                n9x n9xVar = n9x.a;
                return new KSerializer[]{n9xVar, n9xVar, lazyArr[2].getValue()};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = e.d;
                List list = null;
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
                    } else if (m == 1) {
                        i3 = d.s(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        if (m != 2) {
                            throw new UnknownFieldException(m);
                        }
                        list = (List) d.y(serialDescriptor, 2, lazyArr[2].getValue(), list);
                        i |= 4;
                    }
                }
                d.e(serialDescriptor);
                return new e(list, i, i2, i3);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                e eVar = (e) obj;
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = e.d;
                d.M(0, eVar.a, serialDescriptor);
                d.M(1, eVar.b, serialDescriptor);
                d.n(serialDescriptor, 2, lazyArr[2].getValue(), eVar.c);
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: TextSource.kt */
        public static final class b {
            public final KSerializer<e> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ e(List list, int i, int i2, int i3) {
            if (7 != (i & 7)) {
                sp.x(i, 7, a.a.getDescriptor());
                throw null;
            }
            this.a = i2;
            this.b = i3;
            this.c = list;
        }

        @Override // xsna.tlo0
        public final CharSequence a(Context context) {
            return b.a(this, context);
        }

        @Override // xsna.tlo0
        public final CharSequence b(Resources resources) {
            return b.b(this, resources);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PluralsParams(resId=");
            sb.append(this.a);
            sb.append(", quantity=");
            sb.append(this.b);
            sb.append(", args=");
            return ms9.a(')', sb, this.c);
        }

        public e(int i, int i2, List<? extends Object> list) {
            this.a = i;
            this.b = i2;
            this.c = list;
        }
    }

    /* compiled from: TextSource.kt */
    @imi0
    public static final class f implements tlo0 {
        public static final b Companion = new b();
        public final int a;

        /* compiled from: TextSource.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<f> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.data.textsource.TextSource.Resource", aVar, 1);
                xfb0Var.j("resId", false);
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
                return new f(i, i2);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                d.M(0, ((f) obj).a, serialDescriptor);
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: TextSource.kt */
        public static final class b {
            public final KSerializer<f> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ f(int i, int i2) {
            if (1 == (i & 1)) {
                this.a = i2;
            } else {
                sp.x(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        @Override // xsna.tlo0
        public final CharSequence a(Context context) {
            return b.a(this, context);
        }

        @Override // xsna.tlo0
        public final CharSequence b(Resources resources) {
            return b.b(this, resources);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Resource(resId="), this.a, ')');
        }

        public f(int i) {
            this.a = i;
        }
    }

    /* compiled from: TextSource.kt */
    @imi0
    public static final class g implements tlo0 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {null, msy.a(LazyThreadSafetyMode.PUBLICATION, new k5f0(8))};
        public final int a;
        public final List<Object> b;

        /* compiled from: TextSource.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<g> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.data.textsource.TextSource.ResourceParams", aVar, 2);
                xfb0Var.j("resId", false);
                xfb0Var.j("args", false);
                descriptor = xfb0Var;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{n9x.a, g.c[1].getValue()};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = g.c;
                List list = null;
                boolean z = true;
                int i = 0;
                int i2 = 0;
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
                        list = (List) d.y(serialDescriptor, 1, lazyArr[1].getValue(), list);
                        i |= 2;
                    }
                }
                d.e(serialDescriptor);
                return new g(i, i2, list);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                g gVar = (g) obj;
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = g.c;
                d.M(0, gVar.a, serialDescriptor);
                d.n(serialDescriptor, 1, lazyArr[1].getValue(), gVar.b);
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: TextSource.kt */
        public static final class b {
            public final KSerializer<g> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ g(int i, int i2, List list) {
            if (3 != (i & 3)) {
                sp.x(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.a = i2;
            this.b = list;
        }

        @Override // xsna.tlo0
        public final CharSequence a(Context context) {
            return b.a(this, context);
        }

        @Override // xsna.tlo0
        public final CharSequence b(Resources resources) {
            return b.b(this, resources);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResourceParams(resId=");
            sb.append(this.a);
            sb.append(", args=");
            return ms9.a(')', sb, this.b);
        }

        public g(int i, List<? extends Object> list) {
            this.a = i;
            this.b = list;
        }
    }

    /* compiled from: TextSource.kt */
    @vby
    @imi0
    public static final class h implements tlo0 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] b = {msy.a(LazyThreadSafetyMode.PUBLICATION, new t970(11))};
        public final CharSequence a;

        /* compiled from: TextSource.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<h> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                qzw qzwVar = new qzw("com.vk.core.data.textsource.TextSource.SimpleText", aVar);
                qzwVar.j("text", false);
                descriptor = qzwVar;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{h.b[0].getValue()};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                return new h((CharSequence) decoder.C(descriptor).h(new rpj(fpf0.a(CharSequence.class), new tub0(fpf0.a(CharSequence.class), new Annotation[0]), new KSerializer[0])));
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                CharSequence charSequence = ((h) obj).a;
                Encoder i = encoder.i(descriptor);
                if (i == null) {
                    return;
                }
                i.B(new rpj(fpf0.a(CharSequence.class), new tub0(fpf0.a(CharSequence.class), new Annotation[0]), new KSerializer[0]), charSequence);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: TextSource.kt */
        public static final class b {
            public final KSerializer<h> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ h(CharSequence charSequence) {
            this.a = charSequence;
        }

        @Override // xsna.tlo0
        public final CharSequence a(Context context) {
            return b.a(this, context);
        }

        @Override // xsna.tlo0
        public final CharSequence b(Resources resources) {
            return b.b(this, resources);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof h) {
                return epx.f(this.a, ((h) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SimpleText(text=" + ((Object) this.a) + ')';
        }
    }

    CharSequence a(Context context);

    CharSequence b(Resources resources);
}
