package xsna;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import xsna.prm0;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes8.dex */
public final class n8y implements KSerializer<JsonArray> {
    public static final n8y a = new n8y();
    public static final a b = a.b;

    /* compiled from: JsonElementSerializers.kt */
    public static final class a implements SerialDescriptor {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonArray";
        public final /* synthetic */ xk3 a = new xk3(e9y.a.getDescriptor());

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean b() {
            this.a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int c() {
            this.a.getClass();
            return 1;
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
            return prm0.b.a;
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
        return new JsonArray((List) new yk3(e9y.a).e(decoder));
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        kn4.e(encoder);
        e9y e9yVar = e9y.a;
        xk3 xk3Var = new xk3(e9yVar.getDescriptor());
        int size = jsonArray.size();
        cti F = encoder.F(xk3Var);
        Iterator<JsonElement> it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            F.n(xk3Var, i, e9yVar, it.next());
        }
        F.e(xk3Var);
    }
}
