package xsna;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public final class epf0<ElementKlass, Element extends ElementKlass> extends u4g<Element, Element[], ArrayList<Element>> {
    public final dcy<ElementKlass> b;
    public final rk3 c;

    public epf0(dcy<ElementKlass> dcyVar, KSerializer<Element> kSerializer) {
        super(kSerializer);
        this.b = dcyVar;
        this.c = new rk3(kSerializer.getDescriptor());
    }

    @Override // xsna.rd
    public final Object a() {
        return new ArrayList();
    }

    @Override // xsna.rd
    public final int b(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // xsna.rd
    public final Iterator c(Object obj) {
        return new wk3((Object[]) obj);
    }

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // xsna.rd
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance(((pfc) this.b).a(), arrayList.size()));
    }

    @Override // xsna.u4g
    public final void i(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
