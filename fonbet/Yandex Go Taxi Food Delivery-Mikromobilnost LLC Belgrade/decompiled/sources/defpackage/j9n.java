package defpackage;

import android.os.SystemClock;
import com.yandex.go.splash.data.dto.DynamicSplash;
import com.yandex.go.splash.dynamic.c;
import java.io.File;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes15.dex */
public final /* synthetic */ class j9n implements tls {
    public final /* synthetic */ c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ DynamicSplash c;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;

    public /* synthetic */ j9n(c cVar, String str, DynamicSplash dynamicSplash, String str2, String str3, long j) {
        this.a = cVar;
        this.b = str;
        this.c = dynamicSplash;
        this.w = str2;
        this.x = str3;
        this.y = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        if (new java.io.File(r1 != null ? r1 : "").exists() != false) goto L10;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        c cVar = this.a;
        cne0 cne0Var = cVar.l;
        String str = this.c.a;
        cne0Var.r(b64.j(this.b, str), ((File) obj).getPath());
        if (this.w != null) {
            String l = cVar.l.l(this.x + str, "");
        }
        i d = ((j) cVar.e.a).d("Main.Splash.Loaded");
        d.j((r2 & 1) == 0);
        d.d("id", str);
        d.c(SystemClock.elapsedRealtime() - this.y, "duration");
        d.m();
        return zy11.a;
    }
}
