package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes12.dex */
public final class g25 implements f25 {
    public final AdditionalSettings a;
    public final vh5 b;
    public final xzd c;
    public final m6v d;
    public final Merchant e;
    public final Payer f;
    public final yxf0 g;
    public final s3a0 h;
    public final fp51 i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;

    public g25(Context context, AdditionalSettings additionalSettings, vh5 vh5Var, xzd xzdVar, m6v m6vVar, Merchant merchant, Payer payer, yxf0 yxf0Var, s3a0 s3a0Var, fp51 fp51Var) {
        String str;
        this.a = additionalSettings;
        this.b = vh5Var;
        this.c = xzdVar;
        this.d = m6vVar;
        this.e = merchant;
        this.f = payer;
        this.g = yxf0Var;
        this.h = s3a0Var;
        this.i = fp51Var;
        String packageName = context.getPackageName();
        this.j = packageName;
        try {
            str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        this.k = str;
        String str2 = Build.VERSION.RELEASE.toString();
        this.l = str2;
        this.m = String.valueOf(Build.VERSION.SDK_INT);
        this.n = "1.16.9";
        String str3 = Build.MANUFACTURER;
        this.o = str3;
        String str4 = Build.MODEL;
        this.p = str4;
        this.q = String.valueOf(Resources.getSystem().getDisplayMetrics().widthPixels);
        this.r = String.valueOf(Resources.getSystem().getDisplayMetrics().heightPixels);
        this.s = b64.k("[^\\x00-\\x7F]", g8e.r(b64.v("fintech-sdk/", "1.16.9", Extension.O_BRAKE_SPACE, str3, " "), str4, "; Android ", str2, Extension.C_BRAKE), "");
        this.t = this.i != null ? "0.232.0" : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        if ((r5 instanceof kotlin.Result.Failure) != false) goto L48;
     */
    @Override // defpackage.f25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MapBuilder getHeaders() {
        Object failure;
        Object b;
        boolean booleanValue;
        String str;
        String str2;
        Object failure2;
        Object b2;
        Object failure3;
        Object b3;
        String expBoxes;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(ExtFunctionsKt.HEADER_USER_AGENT, this.s);
        mapBuilder.put("x-client-app", this.j);
        String str3 = this.k;
        if (str3 != null) {
            mapBuilder.put("x-client-version", str3);
        }
        mapBuilder.put(Header.ServiceToken.getKey(), this.e.getServiceToken());
        AdditionalSettings additionalSettings = this.a;
        String integrationProfileId = additionalSettings.getIntegrationProfileId();
        if (integrationProfileId != null) {
            mapBuilder.put("X-SDK-Integration-Profile-Id", integrationProfileId);
        }
        mapBuilder.put("x-sdk-name", "fintech-sdk");
        mapBuilder.put(Header.SdkVersion.getKey(), this.n);
        mapBuilder.put(Header.SdkPlatform.getKey(), ConstantDeviceInfo.APP_PLATFORM);
        mapBuilder.put("x-sdk-session-id", this.h.a);
        String uid = this.f.getUid();
        if (uid != null) {
            mapBuilder.put("x-uid", uid);
        }
        mapBuilder.put("x-device-manufacturer", this.o);
        mapBuilder.put("x-device-model", this.p);
        mapBuilder.put("x-os-version", this.l);
        mapBuilder.put("x-os-api-version", this.m);
        mapBuilder.put("x-screen-width", this.q);
        mapBuilder.put("x-screen-height", this.r);
        m6v m6vVar = this.d;
        String str4 = m6vVar.c.b;
        if (str4 != null) {
            mapBuilder.put("x-user-uuid", str4);
        }
        String str5 = m6vVar.b.b;
        if (str5 != null) {
            mapBuilder.put("x-device-id", str5);
        }
        Boolean enableDebranding = additionalSettings.getEnableDebranding();
        xzd xzdVar = this.c;
        if (enableDebranding != null) {
            booleanValue = enableDebranding.booleanValue();
        } else {
            PaymentKitConfig a = xzdVar.a();
            if (a == null) {
                failure = Boolean.TRUE;
            } else {
                String str6 = a.getFlags().get("enableDebranding");
                if (str6 == null) {
                    failure = Boolean.TRUE;
                } else {
                    try {
                        rbx rbxVar = sbx.d;
                        rbxVar.getClass();
                        b = rbxVar.b(z96.a, str6);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (b == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    failure = (Boolean) b;
                    Object obj = Boolean.TRUE;
                    if (failure instanceof Result.Failure) {
                        failure = obj;
                    }
                }
            }
            booleanValue = ((Boolean) failure).booleanValue();
        }
        mapBuilder.put("x-debranding", String.valueOf(booleanValue));
        int i = i25.a[this.b.getTheme().ordinal()];
        if (i == 1) {
            str = "light";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "dark";
        }
        mapBuilder.put("x-sdk-theme", str);
        mapBuilder.put("x-sdk-locale", Locale.getDefault().getLanguage());
        yxf0 yxf0Var = this.g;
        PaymentKitConfig a2 = ((xzd) yxf0Var.a).a();
        String str7 = "";
        if (a2 != null && (str2 = a2.getFlags().get("rearrFactors")) != null) {
            try {
                rbx rbxVar2 = sbx.d;
                rbxVar2.getClass();
                b2 = rbxVar2.b(auu0.a, str2);
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            if (b2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            failure2 = (String) b2;
        }
        failure2 = "";
        ((wbz0) ((sue0) yxf0Var.b).b).getClass();
        mapBuilder.put("x-rearr-factors", (String) failure2);
        PaymentKitConfig a3 = xzdVar.a();
        if (a3 == null) {
            failure3 = Boolean.FALSE;
        } else {
            String str8 = a3.getFlags().get("enableSendExpBoxesToFrontback");
            if (str8 == null) {
                failure3 = Boolean.FALSE;
            } else {
                try {
                    rbx rbxVar3 = sbx.d;
                    rbxVar3.getClass();
                    b3 = rbxVar3.b(z96.a, str8);
                } catch (Throwable th3) {
                    failure3 = new Result.Failure(th3);
                }
                if (b3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                failure3 = (Boolean) b3;
                Object obj2 = Boolean.FALSE;
                if (failure3 instanceof Result.Failure) {
                    failure3 = obj2;
                }
            }
        }
        if (((Boolean) failure3).booleanValue()) {
            PaymentKitConfig a4 = xzdVar.a();
            if (a4 != null && (expBoxes = a4.getExpBoxes()) != null) {
                str7 = expBoxes;
            }
            mapBuilder.put("x-exp-boxes", str7);
        }
        if (additionalSettings.getIntegrationInfo() != null) {
            mapBuilder.put("X-Integration-Name", additionalSettings.getIntegrationInfo().getName());
            mapBuilder.put("X-Integration-Version", additionalSettings.getIntegrationInfo().getVersion());
        }
        String key = Header.PassportPartition.getKey();
        String partition = additionalSettings.getPartition();
        if (partition != null) {
            mapBuilder.put(key, partition);
        }
        String key2 = Header.RegionId.getKey();
        String valueOf = String.valueOf(additionalSettings.getRegionId());
        if (valueOf != null) {
            mapBuilder.put(key2, valueOf);
        }
        String str9 = this.t;
        if (str9 != null) {
            mapBuilder.put("X-YBSDK-Version", str9);
        }
        return mapBuilder.j();
    }
}
