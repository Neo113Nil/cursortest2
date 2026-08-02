package xsna;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: SealedSerializer.kt */
/* loaded from: classes8.dex */
public final class slh0<T> extends dh<T> {
    public final rfc a;
    public final List<? extends Annotation> b;
    public final Object c;
    public final Map<dcy<? extends T>, KSerializer<? extends T>> d;
    public final LinkedHashMap e;

    public slh0() {
        throw null;
    }

    public slh0(String str, rfc rfcVar, dcy[] dcyVarArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this.a = rfcVar;
        this.b = EmptyList.b;
        this.c = msy.a(LazyThreadSafetyMode.PUBLICATION, new com.vk.movika.sdk.base.ui.p(18, str, this));
        if (dcyVarArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + rfcVar.l() + " should be marked @Serializable");
        }
        int min = Math.min(dcyVarArr.length, kSerializerArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(dcyVarArr[i], kSerializerArr[i]));
        }
        Map<dcy<? extends T>, KSerializer<? extends T>> s = pn00.s(arrayList);
        this.d = s;
        Set<Map.Entry<dcy<? extends T>, KSerializer<? extends T>>> entrySet = s.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String f = ((KSerializer) entry.getValue()).getDescriptor().f();
            Object obj = linkedHashMap.get(f);
            if (obj == null) {
                linkedHashMap.containsKey(f);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.a + "' have the same serial name '" + f + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(f, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        this.b = Arrays.asList(annotationArr);
    }

    @Override // xsna.dh
    public final a3m<T> a(ssi ssiVar, String str) {
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : super.a(ssiVar, str);
    }

    @Override // xsna.dh
    public final mmi0<T> b(Encoder encoder, T t) {
        KSerializer<? extends T> kSerializer = this.d.get(fpf0.a(t.getClass()));
        KSerializer<? extends T> b = kSerializer != null ? kSerializer : super.b(encoder, t);
        if (b != null) {
            return b;
        }
        return null;
    }

    @Override // xsna.dh
    public final dcy<T> c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }
}
