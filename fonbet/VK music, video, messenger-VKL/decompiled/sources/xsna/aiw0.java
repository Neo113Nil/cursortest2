package xsna;

import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import xsna.amw0;
import xsna.mox0;
import xsna.mpw0;
import xsna.spw0;
import xsna.tj50;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class aiw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aiw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = VoipCallServiceFragment.Y;
                sp.g(((VoipCallServiceFragment.c) obj2).a, 0);
                return s3q0.a;
            case 1:
                return mjw0.b((mjw0) obj2);
            case 2:
                ((vlw0) obj2).T(new amw0.b.C2554b(true));
                return s3q0.a;
            case 3:
                kpw0 kpw0Var = (kpw0) obj2;
                Throwable th = (Throwable) obj;
                kpw0Var.g.b(new mpw0.a(th));
                kpw0Var.T(new spw0.d.a(th));
                return s3q0.a;
            case 4:
                int i3 = VoipScheduledCallSettingsFragment.T;
                ((sxm) ((VoipScheduledCallSettingsFragment) obj2).Q.getValue()).setItems(((byw0) obj).a);
                return s3q0.a;
            case 5:
                u6x0 u6x0Var = (u6x0) obj;
                return ((w0x0) obj2).k ? new z0x0.a.b(String.valueOf(u6x0Var.b.size()), u6x0Var.b, u6x0Var.c) : new z0x0.a.b((String) u6x0Var.a, u6x0Var.b, u6x0Var.c);
            case 6:
                return new mox0.a(((tj50.a) obj).a(new ljw0((kox0) obj2, 4), ao8.d));
            default:
                awt0.r((am) obj, ((f3y0) obj2).j.getContext());
                return s3q0.a;
        }
    }
}
