package defpackage;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class hbp implements lxx {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ hbp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lxx
    public final Object e(owx owxVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ci11 ci11Var = (ci11) owxVar.d(ci11.e);
                ei11 ei11Var = ((di11) this.b).a;
                boolean z = ci11Var.b;
                List list = ci11Var.c;
                ei11Var.a.edit().putBoolean(BackendConfig.Restrictions.ENABLED, z).putStringSet("certificates", a.N0(list)).apply();
                ei11Var.b = new eid(z, list);
                break;
            default:
                tv11 tv11Var = (tv11) this.b;
                UltimaModeResponse ultimaModeResponse = owxVar.C;
                tv11Var.a.a.l(ultimaModeResponse);
                com.yandex.go.ultima_mode.preferences.a aVar = tv11Var.b;
                boolean z2 = ultimaModeResponse.a;
                String str = ultimaModeResponse.b;
                aVar.getClass();
                Object a = aVar.a(new gy4(aVar, str, z2), (ContinuationImpl) continuation);
                if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return zy11.a;
    }

    @Override // defpackage.j35
    public final String getName() {
        switch (this.a) {
            case 0:
                return "FAMILY_INVITES";
            case 1:
                return "GPS_TRACKING";
            case 2:
                return "TRUSTED_SSL_CERTIFICATES";
            default:
                return "ULTIMA_MODE";
        }
    }
}
