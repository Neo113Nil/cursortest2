package defpackage;

import com.yandex.go.address.models.PlainAddress;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes12.dex */
public final class ahc0 extends hx4 {
    public static final ahc0 a = new ahc0();
    public static final asq0 b = d6z.g("com.yandex.go.address.models.PlainAddress", new SerialDescriptor[0]);

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        return hx4.c(ncxVar);
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        hx4.d(vcxVar, (PlainAddress) obj);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
