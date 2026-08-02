package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class eni0 extends jcc {
    public final lfx b;
    public final s43 c;

    public eni0(lfx lfxVar, KSerializer kSerializer) {
        super(kSerializer);
        this.b = lfxVar;
        this.c = new s43(kSerializer.getDescriptor(), 0);
    }

    @Override // defpackage.a7
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.a7
    public final int b(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // defpackage.a7
    public final Iterator c(Object obj) {
        return new h8(1, (Object[]) obj);
    }

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.a7
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) ((zzb) this.b).a(), arrayList.size()));
    }

    @Override // defpackage.jcc
    public final void i(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
