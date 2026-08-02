package xsna;

import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ jnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((LinksBridgeComponent) this.c.a(fpf0.a(LinksBridgeComponent.class))).p().a();
            default:
                return ((ClassifiedsComponent) this.c.a(fpf0.a(ClassifiedsComponent.class))).dc();
        }
    }
}
