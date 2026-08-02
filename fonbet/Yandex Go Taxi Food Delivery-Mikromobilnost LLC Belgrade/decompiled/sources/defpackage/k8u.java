package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class k8u extends a7 {
    public final KSerializer a;
    public final KSerializer b;
    public final /* synthetic */ int c;
    public final i8u d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k8u(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.c = i;
        switch (i) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                this.d = new i8u("kotlin.collections.LinkedHashMap", kSerializer.getDescriptor(), kSerializer2.getDescriptor());
                break;
            default:
                this.d = new i8u(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
                break;
        }
    }

    @Override // defpackage.a7
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.a7
    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                size = ((HashMap) obj).size();
                break;
            default:
                size = ((LinkedHashMap) obj).size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.a7
    public final Iterator c(Object obj) {
        switch (this.c) {
        }
        return ((Map) obj).entrySet().iterator();
    }

    @Override // defpackage.a7
    public final int d(Object obj) {
        switch (this.c) {
        }
        return ((Map) obj).size();
    }

    @Override // defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        Map map = (Map) obj;
        Object A = sjdVar.A(getDescriptor(), i, this.a, null);
        int v = sjdVar.v(getDescriptor());
        if (v != i + 1) {
            w511.f(oyr.h(i, v, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean containsKey = map.containsKey(A);
        KSerializer kSerializer = this.b;
        map.put(A, (!containsKey || (kSerializer.getDescriptor().getKind() instanceof h2f0)) ? sjdVar.A(getDescriptor(), v, kSerializer, null) : sjdVar.A(getDescriptor(), v, kSerializer, b.g(A, map)));
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        switch (this.c) {
            case 0:
                return new HashMap((Map) null);
            default:
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        switch (this.c) {
        }
        return this.d;
    }

    @Override // defpackage.a7
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                return (HashMap) obj;
            default:
                return (LinkedHashMap) obj;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d(obj);
        SerialDescriptor descriptor = getDescriptor();
        yjd r = encoder.r(descriptor);
        Iterator c = c(obj);
        int i = 0;
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            r.e(getDescriptor(), i, this.a, key);
            i += 2;
            r.e(getDescriptor(), i2, this.b, value);
        }
        r.c(descriptor);
    }

    public k8u(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }
}
