package defpackage;

import com.yandex.go.address.models.Address;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class mo0 extends hx4 {
    public static final mo0 a = new mo0();
    public static final asq0 b = d6z.g("com.yandex.go.address.models.Address", new SerialDescriptor[0]);

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        return hx4.c(ncxVar);
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        hx4.d(vcxVar, (Address) obj);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
