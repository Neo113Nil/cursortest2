package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppEmbeddedUrlDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.exceptions.UnsupportedScreenName;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vungle.ads.internal.protos.Sdk;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mq80 implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ LaunchContext c;
    public final /* synthetic */ yp80 d;
    public final /* synthetic */ Uri e;
    public final /* synthetic */ BrowserPerfState f;

    public /* synthetic */ mq80(Context context, Uri uri, LaunchContext launchContext, BrowserPerfState browserPerfState, yp80 yp80Var) {
        this.b = context;
        this.c = launchContext;
        this.d = yp80Var;
        this.e = uri;
        this.f = browserPerfState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (r2.equals("application") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01c2, code lost:
    
        r7 = new xsna.iq20(null, null, null, r20, null, null, r14, r15, 55);
        new xsna.svn();
        com.vk.common.links.c.f(xsna.svn.a(r1), r6, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r2.equals("group") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fd, code lost:
    
        new xsna.peq0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010e, code lost:
    
        if (xsna.epx.f(r4.getQueryParameter("act"), "group_section_admin_tips") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0110, code lost:
    
        new xsna.dr80().b.I6().a(r6, new com.vk.dto.common.id.UserId(-r1.g()), r4.getQueryParameter("tip"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x017e, code lost:
    
        if (r14 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0180, code lost:
    
        r14.onSuccess();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0130, code lost:
    
        r2 = xsna.xwk.e();
        r3 = new com.vk.dto.common.id.UserId(-r1.g());
        r1 = r15.d;
        r5 = r15.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0145, code lost:
    
        if (r5 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0147, code lost:
    
        r5 = r4.getQueryParameter("trackcode");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014d, code lost:
    
        r2.m(r6, r3, new xsna.o0r0.a(false, r1, r5, null, r15.s, null, null, false, false, false, xsna.epx.f(r4.getLastPathSegment(), "notify_settings"), null, null, null, 61417));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (r2.equals("page") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        if (r2.equals("vk_app") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r2.equals(io.appmetrica.analytics.BuildConfig.SDK_BUILD_FLAVOR) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018c, code lost:
    
        if (r2.equals("mini_app") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0197, code lost:
    
        if (r2.equals("community_application") == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        BrowserPerfState browserPerfState;
        UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
        String type = utilsDomainResolvedWithDataDto.getType();
        int hashCode = type.hashCode();
        Context context = this.b;
        LaunchContext launchContext = this.c;
        yp80 yp80Var = this.d;
        Uri uri = this.e;
        BrowserPerfState browserPerfState2 = this.f;
        switch (hashCode) {
            case -2092433926:
                browserPerfState = browserPerfState2;
                break;
            case -1359492551:
                browserPerfState = browserPerfState2;
                break;
            case -977423767:
                break;
            case -814983785:
                browserPerfState = browserPerfState2;
                break;
            case 3433103:
                break;
            case 3599307:
                if (type.equals("user")) {
                    xwk.e().m(context, new UserId(utilsDomainResolvedWithDataDto.g()), new o0r0.a(false, launchContext.d, launchContext.h, null, launchContext.s, null, null, false, false, false, false, null, null, null, 65513));
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                        break;
                    }
                }
                if (!e43.l(null, "null").contains(utilsDomainResolvedWithDataDto.getType())) {
                    if (yp80Var != null) {
                        yp80Var.onError(new UnsupportedScreenName(utilsDomainResolvedWithDataDto.getType()));
                        break;
                    }
                } else if (yp80Var != null) {
                    yp80Var.U();
                    break;
                }
                break;
            case 98629247:
                break;
            case 1554253136:
                browserPerfState = browserPerfState2;
                break;
            case 1826743371:
                if (type.equals("internal_vkui")) {
                    AppsAppDto d = utilsDomainResolvedWithDataDto.d();
                    if (d == null) {
                        if (yp80Var != null) {
                            yp80Var.U();
                            break;
                        }
                    } else {
                        new re3();
                        ApiApplication b = re3.b(d);
                        AppsAppEmbeddedUrlDto e = utilsDomainResolvedWithDataDto.e();
                        com.vk.common.links.c.K(new op20(b, context, new mq20(e != null ? e.f() : null, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), new iq20(null, null, null, browserPerfState2, null, null, yp80Var, null, 183), null, 16));
                        break;
                    }
                }
                if (!e43.l(null, "null").contains(utilsDomainResolvedWithDataDto.getType())) {
                }
                break;
            default:
                if (!e43.l(null, "null").contains(utilsDomainResolvedWithDataDto.getType())) {
                }
                break;
        }
        return s3q0.a;
    }
}
