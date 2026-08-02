package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hga implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hga(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-248626864, intValue, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.PullToRefresh.<anonymous> (CatalogSectionViewImpl.kt:320)");
                    }
                    if (cq.i(0, aVar, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                com.vk.voip.ui.groupcalls.list.primary.tab.b bVar = (com.vk.voip.ui.groupcalls.list.primary.tab.b) this.c;
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                bVar.a();
                break;
        }
        return s3q0.a;
    }
}
