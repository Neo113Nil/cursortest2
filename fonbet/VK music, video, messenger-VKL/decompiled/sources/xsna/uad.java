package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.brx;
import xsna.orx;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uad implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uad(Object obj, Object obj2, Object obj3, Object obj4, int i) {
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
                return new xad((com.vk.movika.sdk.base.observable.q) this.c, (tb) this.d, (defpackage.i) this.e, (ViewGroup) obj, new ac((vad) this.f, 14));
            default:
                drx drxVar = (drx) this.c;
                UserId userId = (UserId) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                if (((Boolean) obj).booleanValue()) {
                    drxVar.k.b(new brx.d(str2, str));
                    drxVar.T(new orx.c.d(userId));
                } else {
                    tlo0.Companion.getClass();
                    drxVar.Y(new tlo0.f(R.string.error));
                }
                return s3q0.a;
        }
    }
}
