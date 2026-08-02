package com.yandex.passport.internal.ui.sloth;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.data.models.UserInfoData;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.sloth.webcard.l0;
import com.yandex.passport.internal.ui.sloth.webcard.m0;
import com.yandex.passport.internal.ui.sloth.webcard.n0;
import com.yandex.passport.internal.ui.sloth.webcard.o0;
import com.yandex.passport.internal.ui.sloth.webcard.p0;
import com.yandex.passport.internal.ui.sloth.webcard.q0;
import com.yandex.passport.sloth.data.SlothTheme;
import defpackage.bdc;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.sbx;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.wwg;
import defpackage.xng0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.net.UnknownHostException;
import kotlin.Pair;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.masstransit.ui.zoom.ZoomButtonView;

/* loaded from: classes2.dex */
public abstract class e {
    public static final com.yandex.passport.sloth.command.b a(tls tlsVar) {
        JSONObject jSONObject = new JSONObject();
        tlsVar.invoke(jSONObject);
        return new com.yandex.passport.sloth.command.b(jSONObject);
    }

    public static final com.yandex.passport.sloth.command.t b(Pair... pairArr) {
        return new com.yandex.passport.sloth.command.t(kotlin.collections.b.u(pairArr));
    }

    public static final void c(ZoomButtonView zoomButtonView) {
        zoomButtonView.setLayoutParams(new ViewGroup.MarginLayoutParams(tje.u(48, zoomButtonView.getContext()), tje.u(48, zoomButtonView.getContext())));
        zoomButtonView.setScaleType(ImageView.ScaleType.CENTER);
        zoomButtonView.setBackgroundColor(new bdc(xng0.bgFloating));
    }

    public static void d(Context context) {
        context.getClass();
    }

    public static PassportUidImpl e(Bundle bundle) {
        PassportUidImpl passportUidImpl = (PassportUidImpl) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-uid");
        if (passportUidImpl != null) {
            return passportUidImpl;
        }
        throw new ParcelFormatException("Invalid parcelable PassportUidImpl in the bundle");
    }

    public static final UserInfo f(int i, String str) {
        UserInfoData m294copywiADLzA;
        m294copywiADLzA = r3.m294copywiADLzA((r63 & 1) != 0 ? r3.body : str, (r63 & 2) != 0 ? r3.eTag : null, (r63 & 4) != 0 ? r3.retrievalTime : com.yandex.passport.common.time.a.c(0, i, 0, 11), (r63 & 8) != 0 ? r3.uidValue : 0L, (r63 & 16) != 0 ? r3.displayName : null, (r63 & 32) != 0 ? r3.publicName : null, (r63 & 64) != 0 ? r3.securePhoneNumber : null, (r63 & 128) != 0 ? r3.normalizedDisplayLogin : null, (r63 & 256) != 0 ? r3.primaryAliasType : 0, (r63 & 512) != 0 ? r3.nativeDefaultEmail : null, (r63 & 1024) != 0 ? r3.avatarUrl : null, (r63 & 2048) != 0 ? r3.isAvatarEmpty : false, (r63 & 4096) != 0 ? r3.socialProviderCode : null, (r63 & 8192) != 0 ? r3.hasPassword : false, (r63 & 16384) != 0 ? r3.yandexoidLogin : null, (r63 & 32768) != 0 ? r3.isBetaTester : false, (r63 & 65536) != 0 ? r3.hasPlus : false, (r63 & 131072) != 0 ? r3.hasMusicSubscription : false, (r63 & 262144) != 0 ? r3.firstName : null, (r63 & 524288) != 0 ? r3.lastName : null, (r63 & 1048576) != 0 ? r3.birthday : null, (r63 & 2097152) != 0 ? r3.xTokenIssuedAt : 0, (r63 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? r3.displayLogin : null, (r63 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? r3.publicId : null, (r63 & 16777216) != 0 ? r3.isChild : false, (r63 & SelfTester_JCP.DECRYPT_CFB) != 0 ? r3.machineReadableLogin : null, (r63 & SelfTester_JCP.DECRYPT_CBC) != 0 ? r3.is2faEnabled : false, (r63 & SelfTester_JCP.DECRYPT_CNT) != 0 ? r3.isSms2faEnabled : false, (r63 & SelfTester_JCP.IMITA) != 0 ? r3.isRfc2faEnabled : false, (r63 & 536870912) != 0 ? r3.partitions : null, (r63 & 1073741824) != 0 ? r3.isPictureLoginForbidden : false, (r63 & Integer.MIN_VALUE) != 0 ? r3.isXtokenTrusted : false, (r64 & 1) != 0 ? r3.hasPlusCard : false, (r64 & 2) != 0 ? r3.hasProCard : false, (r64 & 4) != 0 ? r3.hasFamily : false, (r64 & 8) != 0 ? r3.isDriveUser : false, (r64 & 16) != 0 ? r3.isTaxiCompanyBound : false, (r64 & 32) != 0 ? r3.locationId : null, (r64 & 64) != 0 ? r3.filterParameters : null, (r64 & 128) != 0 ? r3.muidValue : null, (r64 & 256) != 0 ? r3.hasMasterToken : false, (r64 & 512) != 0 ? r3.isBrowserAccount : false, (r64 & 1024) != 0 ? ((UserInfoData) tje.a(sbx.d, new com.yandex.passport.internal.core.announcing.f(23)).b(UserInfoData.Companion.serializer(), str)).hasWebAuthNCredential : false);
        return com.yandex.passport.data.mapper.a.a(m294copywiADLzA);
    }

    public static final String g(Uri uri) {
        return uri.getQueryParameter(CA20Status.STATUS_REQUEST_D);
    }

    public static final int h(SlothTheme slothTheme) {
        int i = com.yandex.passport.sloth.data.d.a[slothTheme.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return -1;
                }
                w511.b();
                return 0;
            }
        }
        return i2;
    }

    public static final String i(SlothTheme slothTheme) {
        int i = com.yandex.passport.sloth.data.d.a[slothTheme.ordinal()];
        if (i == 1) {
            return "light";
        }
        if (i == 2) {
            return "dark";
        }
        if (i == 3) {
            int i2 = com.yandex.passport.common.util.a.b().getResources().getConfiguration().uiMode & 48;
            return i(i2 != 16 ? i2 != 32 ? SlothTheme.LIGHT : SlothTheme.DARK : SlothTheme.LIGHT);
        }
        w511.b();
        return null;
    }

    public static final boolean j(Throwable th) {
        if (th instanceof UnknownHostException) {
            return true;
        }
        IOException iOException = th instanceof IOException ? (IOException) th : null;
        return (iOException != null ? iOException.getCause() : null) instanceof UnknownHostException;
    }

    public static boolean k() {
        boolean z;
        try {
            Class.forName("com.yandex.passport.internal.util.MinifyUtilUnusedHelper");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        return !z;
    }

    public static final String l(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, str.length() / 2));
        int length = str.length() - sb.length();
        for (int i = 0; i < length; i++) {
            sb.append('*');
        }
        return sb.toString();
    }

    public static String m(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            return readString;
        }
        ny61.r("String is required here");
        return null;
    }

    public static final void n(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final void o(Exception exc) {
        com.yandex.passport.internal.analytics.t analyticsTrackerWrapper;
        Log.e("throwIfDebug", "throwIfDebug: isInPassportProcess=" + com.yandex.passport.internal.util.p.m(), exc);
        if (com.yandex.passport.internal.util.p.m()) {
            try {
                PassportProcessGlobalComponent passportProcessGlobalComponent = com.yandex.passport.internal.di.a.a;
                if (passportProcessGlobalComponent == null || (analyticsTrackerWrapper = passportProcessGlobalComponent.getAnalyticsTrackerWrapper()) == null) {
                    Log.e("throwIfDebug", "throwIfDebug: something very wrong just happened");
                } else {
                    analyticsTrackerWrapper.c(exc);
                }
            } catch (Exception e) {
                Log.e("throwIfDebug", "throwIfDebug: something very wrong just happened", e);
            }
        }
    }

    public static final ActivityResult p(q0 q0Var) {
        if (q0Var.equals(l0.c)) {
            return com.yandex.passport.internal.ui.c.b(17121);
        }
        if (q0Var.equals(l0.b)) {
            return com.yandex.passport.internal.ui.c.b(-1);
        }
        if (q0Var.equals(l0.a)) {
            return com.yandex.passport.internal.ui.c.b(666);
        }
        if (q0Var instanceof o0) {
            o0 o0Var = (o0) q0Var;
            return com.yandex.passport.internal.ui.c.a(42, wwg.g(new Pair("passport-result-url", o0Var.a), new Pair("passport-result-purpose", o0Var.b)));
        }
        if (q0Var instanceof n0) {
            return com.yandex.passport.internal.ui.c.a(13, wwg.g(new Pair(Constants.KEY_EXCEPTION, ((n0) q0Var).a)));
        }
        if (q0Var instanceof p0) {
            Uid uid = ((p0) q0Var).a;
            return com.yandex.passport.internal.ui.c.a(392, wwg.g(new Pair("passport-result-environment", Integer.valueOf(uid.getEnvironment().getInteger())), new Pair("passport-result-uid", Long.valueOf(uid.getValue()))));
        }
        if (q0Var instanceof m0) {
            return com.yandex.passport.internal.ui.c.a(43, wwg.g(new Pair("passport-result-url", ((m0) q0Var).a)));
        }
        w511.b();
        return null;
    }

    public static Bundle q(PassportUidImpl passportUidImpl) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("passport-uid", passportUidImpl);
        return bundle;
    }

    public static Bundle r(Uid uid) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("passport-uid", uid);
        return bundle;
    }
}
