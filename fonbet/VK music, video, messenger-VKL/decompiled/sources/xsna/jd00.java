package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeErrorShownItem;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* compiled from: MainApiError.kt */
/* loaded from: classes15.dex */
public final class jd00 extends vgg {
    public final ehg b;
    public final g1x c;
    public final z46 d;
    public final ApiErrorViewType e;

    public jd00(Throwable th, ehg ehgVar, g1x g1xVar, z46 z46Var) {
        super(th);
        this.b = ehgVar;
        this.c = g1xVar;
        this.d = z46Var;
        this.e = (ApiErrorViewType) ((wz2) z46Var.c).b;
    }

    @Override // xsna.vgg
    public final ApiErrorViewType b() {
        return this.e;
    }

    @Override // xsna.vgg
    public final void c() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ehg ehgVar = this.b;
        g1x g1xVar = this.c;
        z46 z46Var = this.d;
        ApiErrorViewType P = z46Var.P(ehgVar, g1xVar);
        if (e43.l(ApiErrorViewType.CUSTOM, ApiErrorViewType.SKIP).contains(P)) {
            return;
        }
        wz2 wz2Var = (wz2) z46Var.c;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
        String str7 = (String) wz2Var.a;
        boolean z = wz2Var instanceof cfv0;
        String str8 = StringUtils.UNDEFINED;
        if (z) {
            List c0 = drm0.c0(str7, new String[]{"."}, 0, 6);
            String str9 = (String) j5g.b0(0, c0);
            if (str9 == null) {
                str9 = StringUtils.UNDEFINED;
            }
            String str10 = (String) j5g.b0(1, c0);
            if (str10 == null) {
                str10 = StringUtils.UNDEFINED;
            }
            cfv0 cfv0Var = (cfv0) wz2Var;
            String str11 = cfv0Var.c;
            String str12 = cfv0Var.f;
            if (str12 != null) {
                str8 = str12;
            }
            String valueOf = String.valueOf(cfv0Var.d);
            str6 = str10;
            str = str9;
            str5 = str8;
            str4 = String.valueOf(cfv0Var.e);
            str2 = str11;
            str3 = valueOf;
        } else if (wz2Var instanceof fp70) {
            fp70 fp70Var = (fp70) wz2Var;
            String str13 = fp70Var.d;
            str = str7;
            str5 = fp70Var.c;
            str3 = null;
            str4 = null;
            str6 = StringUtils.UNDEFINED;
            str2 = str13;
        } else {
            str = str7;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = StringUtils.UNDEFINED;
            str6 = str5;
        }
        SchemeStatSak$TypeErrorShownItem schemeStatSak$TypeErrorShownItem = new SchemeStatSak$TypeErrorShownItem(str, xgg.a(P), str5, str6, xgg.a((ApiErrorViewType) wz2Var.b), str2, P != ApiErrorViewType.INPUT ? str2 : null, str3, str4, null, 512, null);
        wgg wggVar = new wgg(true);
        SchemeStatSak$TypeAction a = SchemeStatSak$TypeAction.a.a(schemeStatSak$TypeErrorShownItem);
        wggVar.f = schemeStatSak$EventScreen;
        wggVar.g = a;
        wggVar.q();
    }
}
