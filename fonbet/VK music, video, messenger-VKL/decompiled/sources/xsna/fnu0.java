package xsna;

import com.vk.fullscreenbanners.api.dto.FullScreenBanner;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: VkConsumeFullScreenBannerManager.kt */
/* loaded from: classes16.dex */
public final class fnu0 {
    public final FullScreenBanner a;

    /* compiled from: VkConsumeFullScreenBannerManager.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public fnu0(FullScreenBanner fullScreenBanner) {
        this.a = fullScreenBanner;
    }

    public final void a(String str) {
        FullScreenBanner fullScreenBanner = this.a;
        int i = fullScreenBanner.b;
        String str2 = fullScreenBanner.c;
        fm4 fm4Var = new fm4("audio.consumeFullscreenBanner");
        fm4Var.C(i, "id");
        fm4Var.K("reason", str);
        fm4Var.K("track_code", str2);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(fm4Var, null, null, 3);
        new n0m0(14);
        y0.subscribe(new enu0(), new hrt0(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 2));
    }
}
