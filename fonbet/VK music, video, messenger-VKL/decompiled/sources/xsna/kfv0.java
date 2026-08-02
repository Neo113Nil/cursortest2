package xsna;

import android.os.Binder;
import android.os.Build;
import com.vk.core.apps.BuildInfo;
import com.vk.reefton.dto.ReefBuildType;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.TimeUnit;

/* compiled from: VkReefConfig.kt */
/* loaded from: classes5.dex */
public final class kfv0 implements fnf0 {
    public final String a;
    public final gzs<String> b;
    public final boolean c;

    /* compiled from: VkReefConfig.kt */
    public static final class a {
        public final String a;
        public final gzs<String> b;
        public final boolean c;

        public a(String str, gzs gzsVar, boolean z) {
            this.a = str;
            this.b = gzsVar;
            this.c = z;
        }

        public final kfv0 a() {
            return new kfv0(this.a, this.b, this.c);
        }
    }

    public kfv0(String str, gzs gzsVar, boolean z) {
        this.a = str;
        this.b = gzsVar;
        this.c = z;
    }

    @Override // xsna.fnf0
    public final int a() {
        return Build.VERSION.SDK_INT;
    }

    @Override // xsna.fnf0
    public final long b() {
        return TimeUnit.SECONDS.toMillis(60L);
    }

    @Override // xsna.fnf0
    public final boolean c() {
        return this.c;
    }

    @Override // xsna.fnf0
    public final String d() {
        BuildInfo.Client client = BuildInfo.a;
        return String.valueOf(BuildInfo.e);
    }

    @Override // xsna.fnf0
    public final ReefBuildType e() {
        if (BuildInfo.e()) {
            return ReefBuildType.BETA;
        }
        if (BuildInfo.m()) {
            return ReefBuildType.RELEASE;
        }
        if (BuildInfo.h()) {
            return ReefBuildType.DEBUG;
        }
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return ReefBuildType.UNKNOWN;
    }

    @Override // xsna.fnf0
    public final long f() {
        return TimeUnit.SECONDS.toMillis(60L);
    }

    @Override // xsna.fnf0
    public final long g() {
        return TimeUnit.SECONDS.toMillis(30L);
    }

    @Override // xsna.fnf0
    public final String getAppId() {
        return this.a;
    }

    @Override // xsna.fnf0
    public final String getClientId() {
        return this.b.invoke();
    }

    @Override // xsna.fnf0
    public final String getUrl() {
        return null;
    }

    @Override // xsna.fnf0
    public final String h() {
        return m8f0.a();
    }

    @Override // xsna.fnf0
    public final int i() {
        return Binder.getCallingUid();
    }

    @Override // xsna.fnf0
    public final long j() {
        return TimeUnit.MINUTES.toMillis(5L);
    }
}
