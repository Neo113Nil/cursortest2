package xsna;

import com.vk.music.offline.api.di.StorageTypeComponent;
import kotlin.Lazy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class mal implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mal(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                oal oalVar = (oal) this.c;
                ((Boolean) obj).booleanValue();
                oalVar.e();
                return s3q0.a;
            default:
                StorageTypeComponent storageTypeComponent = (StorageTypeComponent) ((g8m) this.c).a(fpf0.a(StorageTypeComponent.class));
                return new n850(new bpn0(new xsa(storageTypeComponent, 6)), new bpn0(new ib8(storageTypeComponent, 9)), (Lazy) obj, new bpn0(new jb8(storageTypeComponent, 7)));
        }
    }
}
