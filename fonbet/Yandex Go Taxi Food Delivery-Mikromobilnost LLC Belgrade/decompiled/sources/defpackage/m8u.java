package defpackage;

import java.util.Collection;
import java.util.HashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes4.dex */
public final class m8u extends mcc {
    public final l8u b;

    public m8u(KSerializer kSerializer) {
        super(kSerializer);
        this.b = new l8u(kSerializer.getDescriptor());
    }

    @Override // defpackage.a7
    public final Object a() {
        return new HashSet();
    }

    @Override // defpackage.a7
    public final int b(Object obj) {
        return ((HashSet) obj).size();
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new HashSet((Collection) null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.a7
    public final Object h(Object obj) {
        return (HashSet) obj;
    }

    @Override // defpackage.jcc
    public final void i(int i, Object obj, Object obj2) {
        ((HashSet) obj).add(obj2);
    }
}
