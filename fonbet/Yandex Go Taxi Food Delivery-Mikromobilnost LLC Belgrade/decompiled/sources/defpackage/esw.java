package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.blockstore.restorecredential.internal.b;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class esw extends jm2 {
    public final /* synthetic */ int a;

    public /* synthetic */ esw(int i) {
        this.a = i;
    }

    @Override // defpackage.nm2
    public /* bridge */ /* synthetic */ List a(GoogleSignInOptions googleSignInOptions) {
        switch (this.a) {
            case 8:
                return googleSignInOptions == null ? Collections.EMPTY_LIST : googleSignInOptions.getScopes();
            default:
                return super.a(googleSignInOptions);
        }
    }

    @Override // defpackage.jm2
    public om2 b(Context context, Looper looper, y2c y2cVar, Object obj, t4e t4eVar, yx60 yx60Var) {
        switch (this.a) {
            case 0:
                return new b(context, looper, 381, y2cVar, t4eVar, yx60Var);
            case 1:
            case 2:
            case 3:
            case 5:
            case 8:
            default:
                return super.b(context, looper, y2cVar, obj, t4eVar, yx60Var);
            case 4:
                return new j091(context, looper, 308, y2cVar, t4eVar, yx60Var);
            case 6:
                return new c191(context, looper, y2cVar, t4eVar, yx60Var);
            case 7:
                return new p091(context, looper, y2cVar, t4eVar, yx60Var);
            case 9:
                return new avb1(context, looper, HProv.PP_DELETE_SAVED_PASSWD, y2cVar, t4eVar, yx60Var);
            case 10:
                if (obj == null) {
                    return new z091(context, looper, y2cVar, t4eVar, yx60Var);
                }
                ny61.u();
                return null;
            case 11:
                return new cx91(context, looper, 23, y2cVar, t4eVar, yx60Var);
            case 12:
                return new k491(context, looper, 224, y2cVar, t4eVar, yx60Var, 1);
        }
    }

    @Override // defpackage.jm2
    public om2 c(Context context, Looper looper, y2c y2cVar, Object obj, wst wstVar, xst xstVar) {
        switch (this.a) {
            case 1:
                y2cVar.getClass();
                Integer num = y2cVar.g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new gbs0(context, looper, y2cVar, bundle, wstVar, xstVar);
            case 2:
                return new tz81(context, looper, 39, y2cVar, wstVar, xstVar);
            case 3:
                throw oyr.d(obj);
            case 4:
            case 6:
            case 7:
            default:
                return super.c(context, looper, y2cVar, obj, wstVar, xstVar);
            case 5:
                return new z091(context, looper, y2cVar, (y091) obj, wstVar, xstVar);
            case 8:
                return new a191(context, looper, y2cVar, (GoogleSignInOptions) obj, wstVar, xstVar);
        }
    }
}
