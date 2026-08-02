package xsna;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.states.VkAuthState;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i45 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i45(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Bundle bundle = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VkAuthState vkAuthState = (VkAuthState) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof AuthException.NeedSilentAuthException) {
                    UserId userId = UserId.d;
                    AuthException.NeedSilentAuthException needSilentAuthException = (AuthException.NeedSilentAuthException) th;
                    String g = needSilentAuthException.g();
                    String i2 = needSilentAuthException.i();
                    VkAuthCredentials Ab = vkAuthState.Ab();
                    String e = Ab != null ? Ab.e() : null;
                    try {
                        q55 q55Var = q55.a;
                        bundle = q55.c().a.K;
                    } catch (Throwable unused) {
                    }
                    break;
                } else {
                    break;
                }
            case 1:
                t260 t260Var = (t260) obj2;
                NetworkClient.ClientType clientType = (NetworkClient.ClientType) obj;
                if (t260Var.j.a) {
                    break;
                }
                break;
            case 2:
                ((t5t0) obj2).d.onNext(Boolean.FALSE);
                break;
            default:
                zku0 zku0Var = (zku0) obj2;
                for (AccountGetUserObjectDto accountGetUserObjectDto : (List) obj) {
                    Long i3 = accountGetUserObjectDto.i();
                    long j = o25.a().c().b;
                    if (i3 != null && i3.longValue() == j) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"Current user (" + accountGetUserObjectDto.i() + ") updated in multiaccount, updating avatar."});
                        }
                        String k = accountGetUserObjectDto.k();
                        Serializer.c<Image> cVar = Image.CREATOR;
                        Image a = Image.b.a(k);
                        String a2 = k != null ? js5.a(iah0.f().density > 1.0f ? 100 : 50, k) : null;
                        cn o = o25.a().o();
                        if (!epx.f(o.c, k) || o.j) {
                            zku0Var.a.a(new tr5(a2, a, false));
                        }
                    }
                    bq0 bq0Var = zku0Var.b;
                    Long i4 = accountGetUserObjectDto.i();
                    UserId userId2 = new UserId(i4 != null ? i4.longValue() : 0L);
                    SharedPreferences.Editor edit = ((SharedPreferences) bq0Var.a.getValue()).edit();
                    edit.putBoolean(bq0.a(userId2), false);
                    edit.apply();
                }
                break;
        }
        return s3q0.a;
    }
}
