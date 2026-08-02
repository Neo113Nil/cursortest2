package xsna;

import com.vk.update.core.InAppUpdateUi;
import xsna.dyz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hyz implements hz20 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hyz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.hz20
    public final void a(int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = jyz.r1;
                ((jyz) obj).oo().C(dyz.a.b);
                break;
            default:
                ((InAppUpdateUi.DownloadInfo) obj).b.invoke();
                break;
        }
    }
}
