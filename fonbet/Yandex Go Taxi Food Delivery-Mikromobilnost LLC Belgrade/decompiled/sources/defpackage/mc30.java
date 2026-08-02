package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes6.dex */
public final class mc30 implements si00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dds b;

    public /* synthetic */ mc30(dds ddsVar, int i) {
        this.a = i;
        this.b = ddsVar;
    }

    private final void k(Address address) {
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        int i = this.a;
        dds ddsVar = this.b;
        switch (i) {
            case 0:
                ((uw7) ddsVar).r(new yd0(address, 18));
                break;
            case 1:
                ((lh70) ddsVar).r(new yd0(address, 20));
                break;
        }
    }

    @Override // defpackage.si00
    public final void d() {
        int i = this.a;
        int i2 = 9;
        dds ddsVar = this.b;
        switch (i) {
            case 0:
                ((uw7) ddsVar).r(new ps20(22));
                break;
            case 1:
                ((lh70) ddsVar).r(new qu(i2));
                break;
            default:
                ((gbt0) ddsVar).r(new qu(i2));
                break;
        }
    }
}
