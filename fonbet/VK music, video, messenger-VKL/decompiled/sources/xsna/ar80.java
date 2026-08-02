package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.LaunchContext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ar80 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ar80(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.common.links.c.O((Context) this.c, (Uri) this.d, (LaunchContext) this.e, (yp80) this.f);
                break;
            default:
                vcr vcrVar = (vcr) this.c;
                u9 u9Var = (u9) this.d;
                god0 god0Var = (god0) this.e;
                FragmentActivity fragmentActivity = (FragmentActivity) this.f;
                ((nmo) vcrVar).e = (wqd0) obj;
                u9Var.invoke(vcrVar);
                god0Var.a.g(fragmentActivity);
                break;
        }
        return s3q0.a;
    }
}
