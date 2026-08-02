package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.exceptions.UnsupportedScreenName;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vungle.ads.internal.protos.Sdk;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pq80 implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ BrowserPerfState d;
    public final /* synthetic */ yp80 e;
    public final /* synthetic */ LaunchContext f;

    public /* synthetic */ pq80(Context context, Uri uri, LaunchContext launchContext, BrowserPerfState browserPerfState, yp80 yp80Var) {
        this.b = context;
        this.c = uri;
        this.d = browserPerfState;
        this.e = yp80Var;
        this.f = launchContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r4.equals("application") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x018e, code lost:
    
        com.vk.common.links.c.f(r1, r8, r6, new xsna.iq20(null, null, null, r13, null, null, r5, r9, 55));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r4.equals("group") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        new xsna.peq0(r6);
        xsna.g2v.c().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
    
        if (xsna.epx.f(r6.getQueryParameter("act"), "group_section_admin_tips") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
    
        new xsna.er80().b.I6().a(r8, new com.vk.dto.common.id.UserId(-r2), r6.getQueryParameter("tip"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0154, code lost:
    
        if (r5 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0156, code lost:
    
        r5.onSuccess();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        r1 = xsna.xwk.e();
        r4 = new com.vk.dto.common.id.UserId(-r2);
        r12 = r9.d;
        r2 = r9.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012f, code lost:
    
        r2 = r6.getQueryParameter("trackcode");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0135, code lost:
    
        r1.m(r8, r4, new xsna.o0r0.a(false, r12, r2, null, null, null, null, false, false, false, false, null, null, null, 65529));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        if (r4.equals("page") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        if (r4.equals("vk_app") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        if (r4.equals(io.appmetrica.analytics.BuildConfig.SDK_BUILD_FLAVOR) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0161, code lost:
    
        if (r4.equals("mini_app") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016b, code lost:
    
        if (r4.equals("community_application") == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x017d  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        yp80 yp80Var;
        mch0 mch0Var = (mch0) obj;
        long j = mch0Var.b;
        String str = mch0Var.a;
        int hashCode = str.hashCode();
        Context context = this.b;
        Uri uri = this.c;
        BrowserPerfState browserPerfState = this.d;
        yp80 yp80Var2 = this.e;
        LaunchContext launchContext = this.f;
        switch (hashCode) {
            case -2092433926:
                yp80Var = yp80Var2;
                break;
            case -1359492551:
                yp80Var = yp80Var2;
                break;
            case -977423767:
                yp80Var = yp80Var2;
                break;
            case -814983785:
                yp80Var = yp80Var2;
                break;
            case 3433103:
                yp80Var = yp80Var2;
                break;
            case 3599307:
                yp80Var = yp80Var2;
                if (str.equals("user")) {
                    xwk.e().m(context, new UserId(j), new o0r0.a(false, launchContext.d, launchContext.h, null, null, null, null, false, false, false, false, null, null, null, 65529));
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                        break;
                    }
                }
                if (!e43.l(null, "null").contains(str)) {
                    if (yp80Var != null) {
                        yp80Var.U();
                        break;
                    }
                } else if (yp80Var != null) {
                    yp80Var.onError(new UnsupportedScreenName(str));
                    break;
                }
                break;
            case 98629247:
                yp80Var = yp80Var2;
                break;
            case 1554253136:
                yp80Var = yp80Var2;
                break;
            case 1826743371:
                if (str.equals("internal_vkui")) {
                    ApiApplication apiApplication = mch0Var.f;
                    if (apiApplication == null) {
                        if (yp80Var2 != null) {
                            yp80Var2.U();
                            break;
                        }
                    } else {
                        se3 se3Var = mch0Var.g;
                        com.vk.common.links.c.K(new op20(apiApplication, context, new mq20(se3Var != null ? se3Var.a : null, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), new iq20(null, null, null, browserPerfState, null, null, yp80Var2, null, 183), null, 16));
                        break;
                    }
                }
                break;
            default:
                yp80Var = yp80Var2;
                if (!e43.l(null, "null").contains(str)) {
                }
                break;
        }
        return s3q0.a;
    }
}
