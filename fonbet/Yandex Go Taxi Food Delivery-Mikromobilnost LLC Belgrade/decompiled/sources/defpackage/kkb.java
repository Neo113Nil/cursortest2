package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.pay.api.model.SimOperatorInfo;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Result;
import kotlin.a;
import ru.CryptoPro.JCP.ProviderParameters;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes8.dex */
public final class kkb implements p8w {
    public final Context a;
    public final p5z b;
    public final x75 c;
    public final p5h d;
    public final PlusSdkBrandType e;
    public final i3y f;
    public final i3y g;
    public final DecimalFormat h = new DecimalFormat(ProviderParameters.DEFAULT_PRODUCT_VER, DecimalFormatSymbols.getInstance(Locale.ENGLISH));

    public kkb(Context context, p5z p5zVar, x75 x75Var, p5h p5hVar, PlusSdkBrandType plusSdkBrandType) {
        this.a = context;
        this.b = p5zVar;
        this.c = x75Var;
        this.d = p5hVar;
        this.e = plusSdkBrandType;
        final int i = 0;
        this.f = a.a(new sls(this) { // from class: hkb
            public final /* synthetic */ kkb b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                kkb kkbVar = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = kkbVar.a;
                        SimOperatorInfo a = kkbVar.d.a();
                        StringBuilder sb = new StringBuilder(250);
                        sb.append("os=Android; os_version=");
                        sb.append(kkb.a(Build.VERSION.RELEASE));
                        sb.append("; manufacturer=");
                        sb.append(kkb.a(Build.MANUFACTURER));
                        sb.append("; model=");
                        sb.append(kkb.a(Build.MODEL));
                        sb.append("; clid=");
                        i3y i3yVar = kkbVar.g;
                        ((ikb) i3yVar.getValue()).getClass();
                        sb.append("");
                        sb.append("; device_id=");
                        sb.append(((ikb) i3yVar.getValue()).b);
                        sb.append("; uuid=");
                        sb.append(((ikb) i3yVar.getValue()).a);
                        sb.append("; display_size=");
                        sb.append(kkbVar.h.format(Float.valueOf(vng.r(context2))));
                        sb.append("; dpi=");
                        sb.append(context2.getResources().getDisplayMetrics().densityDpi);
                        String mcc = a.getMcc();
                        if (evu0.J(mcc)) {
                            mcc = null;
                        }
                        if (mcc != null) {
                            sb.append("; mcc=".concat(mcc));
                        }
                        String mnc = a.getMnc();
                        String str = evu0.J(mnc) ? null : mnc;
                        if (str != null) {
                            sb.append("; mnc=".concat(str));
                        }
                        return sb.toString();
                    default:
                        x75 x75Var2 = kkbVar.c;
                        String b = x75Var2.b();
                        if (b == null) {
                            b = "";
                        }
                        String a2 = x75Var2.a();
                        return new ikb(b, a2 != null ? a2 : "");
                }
            }
        });
        final int i2 = 1;
        this.g = a.a(new sls(this) { // from class: hkb
            public final /* synthetic */ kkb b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                kkb kkbVar = this.b;
                switch (i22) {
                    case 0:
                        Context context2 = kkbVar.a;
                        SimOperatorInfo a = kkbVar.d.a();
                        StringBuilder sb = new StringBuilder(250);
                        sb.append("os=Android; os_version=");
                        sb.append(kkb.a(Build.VERSION.RELEASE));
                        sb.append("; manufacturer=");
                        sb.append(kkb.a(Build.MANUFACTURER));
                        sb.append("; model=");
                        sb.append(kkb.a(Build.MODEL));
                        sb.append("; clid=");
                        i3y i3yVar = kkbVar.g;
                        ((ikb) i3yVar.getValue()).getClass();
                        sb.append("");
                        sb.append("; device_id=");
                        sb.append(((ikb) i3yVar.getValue()).b);
                        sb.append("; uuid=");
                        sb.append(((ikb) i3yVar.getValue()).a);
                        sb.append("; display_size=");
                        sb.append(kkbVar.h.format(Float.valueOf(vng.r(context2))));
                        sb.append("; dpi=");
                        sb.append(context2.getResources().getDisplayMetrics().densityDpi);
                        String mcc = a.getMcc();
                        if (evu0.J(mcc)) {
                            mcc = null;
                        }
                        if (mcc != null) {
                            sb.append("; mcc=".concat(mcc));
                        }
                        String mnc = a.getMnc();
                        String str = evu0.J(mnc) ? null : mnc;
                        if (str != null) {
                            sb.append("; mnc=".concat(str));
                        }
                        return sb.toString();
                    default:
                        x75 x75Var2 = kkbVar.c;
                        String b = x75Var2.b();
                        if (b == null) {
                            b = "";
                        }
                        String a2 = x75Var2.a();
                        return new ikb(b, a2 != null ? a2 : "");
                }
            }
        });
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                sb.append(charAt);
            } else {
                Locale locale = Locale.US;
                sb.append(String.format(locale, "\\U%04X", Arrays.copyOf(new Object[]{Integer.valueOf(charAt)}, 1)).toLowerCase(locale));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1  */
    @Override // defpackage.p8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kvj0 intercept(m8w m8wVar) {
        String str;
        String failure;
        Integer valueOf;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        SimOperatorInfo a = this.d.a();
        t4j0 b = d5j0Var.b();
        b.d(GlideBitmapDownloader.ACCEPT_HEADER, "application/json");
        b.d("Accept-Language", q5z.v(this.b));
        b.d("X-Yandex-Plus-App-Distribution", "");
        b.d("X-Yandex-Plus-Device", (String) this.f.getValue());
        b.d("X-Yandex-Plus-OperatorData", "mcc=" + a.getMcc() + ";mnc=" + a.getMnc());
        b.d("X-Yandex-Plus-Subservice", "PlusPaySDK");
        int i = jkb.a[this.e.ordinal()];
        if (i == 1) {
            str = "yandex";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "yango";
        }
        b.d("X-Yandex-Plus-Brand", str);
        try {
            UiModeManager uiModeManager = (UiModeManager) this.a.getSystemService(UiModeManager.class);
            valueOf = uiModeManager != null ? Integer.valueOf(uiModeManager.getCurrentModeType()) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            failure = "MOBILE_ANDROID";
            b.d("X-Yandex-Plus-Checkout-Platform", (String) (Result.a(failure) == null ? failure : "UNKNOWN"));
            return zci0Var.b(new d5j0(b));
        }
        if (valueOf.intValue() == 4) {
            failure = "ANDROID_TV";
            b.d("X-Yandex-Plus-Checkout-Platform", (String) (Result.a(failure) == null ? failure : "UNKNOWN"));
            return zci0Var.b(new d5j0(b));
        }
        if (valueOf != null) {
            if (valueOf.intValue() == 6) {
                failure = "ANDROID_WEAR";
                b.d("X-Yandex-Plus-Checkout-Platform", (String) (Result.a(failure) == null ? failure : "UNKNOWN"));
                return zci0Var.b(new d5j0(b));
            }
        }
        failure = valueOf == null ? "UNKNOWN" : "OTHER";
        b.d("X-Yandex-Plus-Checkout-Platform", (String) (Result.a(failure) == null ? failure : "UNKNOWN"));
        return zci0Var.b(new d5j0(b));
    }
}
