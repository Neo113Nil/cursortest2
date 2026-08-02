package xsna;

import android.content.Context;
import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.utils.ClipsUnauthorizedException;
import com.vk.common.links.LaunchContext;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.text.Regex;

/* compiled from: ExternalLink.kt */
/* loaded from: classes17.dex */
public final class ueq implements pje {
    public final zof a;

    public ueq(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        return peq0.p(peq0Var, new Regex("/shows/([\\d\\w.]{2,})"), null, null, 14) || peq0.p(peq0Var, new Regex("/clips/([\\d\\w.]{2,})"), null, null, 14);
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        int i = emf.a;
        String group = peq0Var.c.group(1);
        boolean z = peq0Var.t("qr") == 1;
        SearchStatsLoggingInfo searchStatsLoggingInfo = launchContext.s;
        if (yp80Var == null) {
            yp80Var = new a(context);
        }
        dz2 x = yfb.x(po40.s(new po40(), group, UtilsResolveScreenNameWithDataPlatformDto.ANDROID, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        if (!o25.a().b()) {
            x.c = true;
            x.d = true;
        }
        hg1.m(rsg0.y0(x, null, null, 3), context, 0L, false, 62).subscribe(new f50(new dmf(context, z, searchStatsLoggingInfo, yp80Var), 16), new lf1(new kf1(yp80Var, 22), 11));
        return true;
    }

    /* compiled from: ExternalLink.kt */
    public static final class a implements yp80 {
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // xsna.yp80
        public final void onError(Throwable th) {
            if (!(th instanceof ClipsUnauthorizedException) || g620.f().k0().a(this.b)) {
                return;
            }
            h03.b(th);
        }

        @Override // xsna.yp80
        public final void I() {
        }

        @Override // xsna.yp80
        public final void U() {
        }

        @Override // xsna.yp80
        public final void onSuccess() {
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
        }
    }
}
