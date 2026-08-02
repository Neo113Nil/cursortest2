package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.instantjobs.InstantJob;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e0s implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ e0s(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                return gq.b(this.c, "(", ", '", (String) obj, "')");
            case 1:
                InstantJob instantJob = (InstantJob) obj;
                if (instantJob instanceof sp6) {
                    if (this.c == ((sp6) instantJob).d) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((Attach) obj).xb() == this.c);
        }
    }
}
