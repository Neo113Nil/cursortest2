package defpackage;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes.dex */
public final class cjx implements nkw0 {
    public static final cjx c;
    public static final cjx w;
    public static final cjx x;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i = 0;
        c = new cjx("ENABLED", i);
        w = new cjx("DISABLED", i);
        x = new cjx("DESTROYED", i);
    }

    public cjx(String str, wvu wvuVar) {
        this.a = 1;
        this.b = str;
    }

    public static void a(am2 am2Var, ycr0 ycr0Var) {
        String str = ycr0Var.a;
        if (str != null) {
            am2Var.k("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        am2Var.k("X-CRASHLYTICS-API-CLIENT-TYPE", ConstantDeviceInfo.APP_PLATFORM);
        am2Var.k("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.3");
        am2Var.k(GlideBitmapDownloader.ACCEPT_HEADER, "application/json");
        am2Var.k("X-CRASHLYTICS-DEVICE-MODEL", ycr0Var.b);
        String str2 = ycr0Var.c;
        if (str2 != null) {
            am2Var.k("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = ycr0Var.d;
        if (str3 != null) {
            am2Var.k("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = ((z64) ycr0Var.e.c()).a;
        if (str4 != null) {
            am2Var.k("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap b(ycr0 ycr0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", ycr0Var.h);
        hashMap.put("display_version", ycr0Var.g);
        hashMap.put("source", Integer.toString(ycr0Var.i));
        String str = ycr0Var.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // defpackage.nkw0
    public String c() {
        return this.b;
    }

    @Override // defpackage.nkw0
    public void d(mkw0 mkw0Var) {
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ cjx(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
