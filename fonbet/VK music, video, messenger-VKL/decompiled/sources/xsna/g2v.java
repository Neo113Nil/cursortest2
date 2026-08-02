package xsna;

/* compiled from: Hex.java */
/* loaded from: classes.dex */
public final class g2v {
    public static bpn0 a;
    public static bpn0 b;
    public static bpn0 c;

    public static byte[] a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static final mxv c() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (mxv) bpn0Var.getValue();
    }

    public static final x8l0 d() {
        bpn0 bpn0Var = c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (x8l0) bpn0Var.getValue();
    }

    public static final void e(i7m i7mVar) {
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent", new xu2(10));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.analytics.js.bridge.api.di.JsAnalyticsDelegateComponent", new kb3(10));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.health.js.bridge.api.di.JsHealthDelegateComponent", new mb3(15));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.location.js.bridge.api.di.JsLocationDelegateComponent", new fr6(14));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.core.js.bridge.api.di.JsCoreDelegateComponent", new mn8(10));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.permission.js.bridge.api.di.JsPermissionDelegateComponent", new s3a(8));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.vibration.js.bridge.api.di.JsVibrationDelegateComponent", new dw9(9));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.dating.sdk.js.bridge.api.di.JsDatingSdkDelegateComponent", new qo(9));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.auth.js.bridge.api.di.JsAuthDelegateComponent", new jvg(9));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.common.js.bridge.api.di.JsCommonDelegateComponent", new aqi(7));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.libverify.js.bridge.api.di.JsLibverifyDelegateComponent", new ib3(12));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.local.storage.js.bridge.api.di.JsLocalStorageDelegateComponent", new q57(11));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.subscriptions.js.bridge.api.di.JsSubscriptionsDelegateComponent", new ox4(7));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.vkclient.js.bridge.api.di.JsVkclientDelegateComponent", new aq0(8));
    }
}
