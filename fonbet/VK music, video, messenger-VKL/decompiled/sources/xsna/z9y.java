package xsna;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import xsna.prm0;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes8.dex */
public final class z9y implements KSerializer<JsonObject> {
    public static final z9y a = new z9y();
    public static final a b = a.b;

    /* compiled from: JsonElementSerializers.kt */
    public static final class a implements SerialDescriptor {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonObject";
        public final /* synthetic */ idz a;

        public a() {
            oqm0 oqm0Var = oqm0.a;
            this.a = new idz("kotlin.collections.LinkedHashMap", oqm0.b, e9y.a.getDescriptor());
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean b() {
            this.a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int c() {
            this.a.getClass();
            return 2;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String d(int i) {
            this.a.getClass();
            return String.valueOf(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List<Annotation> e(int i) {
            return this.a.e(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String f() {
            return c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int g(String str) {
            return this.a.g(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List<Annotation> getAnnotations() {
            this.a.getClass();
            return EmptyList.b;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final gmi0 getKind() {
            this.a.getClass();
            return prm0.c.a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final SerialDescriptor h(int i) {
            return this.a.h(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean i(int i) {
            this.a.i(i);
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean isInline() {
            this.a.getClass();
            return false;
        }
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        kn4.d(decoder);
        return new JsonObject((Map) new jdz(oqm0.a, e9y.a).e(decoder));
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        kn4.e(encoder);
        new jdz(oqm0.a, e9y.a).serialize(encoder, (JsonObject) obj);
    }
}
