package xsna;

import com.vk.auth.modal.qrwithcode.b;
import com.vk.channels.impl.channel_screen.UnreadCounterDataSourceImpl;
import com.vk.profile.community.impl.ui.profile.d;
import xsna.r070;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h53 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h53(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                    break;
                }
                break;
            case 1:
                ((hph) this.c).f.invoke(new d.a(false));
                break;
            case 2:
                ((dv60) this.c).a(r070.g.a.b);
                break;
            case 3:
                com.vk.auth.modal.qrwithcode.a aVar = (com.vk.auth.modal.qrwithcode.a) this.c;
                if (aVar.k instanceof b.d) {
                    aVar.e(aVar.f(), true);
                    break;
                }
                break;
            case 4:
                ((b2e0) this.c).a();
                break;
            case 5:
                ((uic) this.c).clear();
                break;
            default:
                UnreadCounterDataSourceImpl unreadCounterDataSourceImpl = (UnreadCounterDataSourceImpl) this.c;
                if (unreadCounterDataSourceImpl.c) {
                    enj.s(unreadCounterDataSourceImpl.a, unreadCounterDataSourceImpl.d);
                }
                unreadCounterDataSourceImpl.c = false;
                break;
        }
    }
}
