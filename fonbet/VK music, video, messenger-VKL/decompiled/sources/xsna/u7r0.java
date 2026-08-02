package xsna;

import com.vk.superapp.sessionmanagment.impl.di.SessionManagementComponentImpl;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class u7r0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VKApplication c;

    public /* synthetic */ u7r0(VKApplication vKApplication, int i) {
        this.b = i;
        this.c = vKApplication;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                VKApplication.a aVar = VKApplication.c;
                new yx10(this.c).a();
                return s3q0.a;
            default:
                return new SessionManagementComponentImpl.a(this.c, new jnf(13), new knf(18), new lnf(16), new r12(17), new c24(0));
        }
    }
}
