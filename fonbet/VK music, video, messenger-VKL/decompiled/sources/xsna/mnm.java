package xsna;

import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.receivers.InstantJobCancelReceiver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mnm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ mnm(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ehw ehwVar;
        int i = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, this.c, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -65, 2097151);
            case 1:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, this.c, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -257, 2097151);
            case 2:
                int i3 = InstantJobCancelReceiver.a;
                Integer num = ((InstantJob) obj).b;
                return Boolean.valueOf(num != null && num.intValue() == i2);
            default:
                xp10 xp10Var = (xp10) obj;
                dhw dhwVar = xp10Var instanceof dhw ? (dhw) xp10Var : null;
                return Boolean.valueOf((dhwVar == null || (ehwVar = dhwVar.a) == null || ehwVar.a != i2) ? false : true);
        }
    }
}
