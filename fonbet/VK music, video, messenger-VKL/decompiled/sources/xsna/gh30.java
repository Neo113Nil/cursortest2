package xsna;

import com.vk.dto.attaches.Attach;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gh30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gh30(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((Attach) obj).xb() == this.c);
            default:
                return Integer.valueOf((((Integer) obj).intValue() / 2) * this.c);
        }
    }
}
