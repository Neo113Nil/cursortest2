package xsna;

import android.app.Activity;
import android.content.Intent;
import android.util.Base64;
import android.view.Surface;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hor implements gzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hor(defpackage.b0 b0Var, Activity activity, String str, String str2, ifx0 ifx0Var) {
        this.c = str;
        this.d = activity;
        this.e = str2;
        this.f = b0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        byte[] decode;
        switch (this.b) {
            case 0:
                ror rorVar = (ror) this.c;
                List<s0u0> list = (List) this.d;
                lpr lprVar = (lpr) this.f;
                List list2 = (List) this.e;
                lpr f = rorVar.f(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    f.c.get(i).a = list.get(i).a;
                }
                rorVar.h(lprVar, f, new gzj(list2, 1), new cwg(rorVar, 17));
                break;
            case 1:
                ufs ufsVar = (ufs) this.c;
                Surface surface = (Surface) this.d;
                m0g0 m0g0Var = (m0g0) this.e;
                p1t p1tVar = (p1t) this.f;
                s1t s1tVar = ufsVar.l;
                if (s1tVar != null) {
                    s1tVar.b();
                }
                ufsVar.l = surface != null ? new s1t(m0g0Var, p1tVar, surface) : null;
                ufsVar.d();
                break;
            default:
                String str = (String) this.c;
                Activity activity = (Activity) this.d;
                String str2 = (String) this.e;
                defpackage.b0 b0Var = (defpackage.b0) this.f;
                try {
                    String str3 = (String) j5g.i0(drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6));
                    try {
                        decode = Base64.decode(str3, 0);
                    } catch (IllegalArgumentException unused) {
                        decode = Base64.decode(str3, 10);
                    }
                    File file = new File(activity.getExternalCacheDir(), System.currentTimeMillis() + ".png");
                    com.vk.core.files.a.O(file, decode);
                    activity.startActivity(Intent.createChooser(ifx0.c(com.vk.core.files.a.N(file), str2), activity.getString(R.string.vk_apps_share)));
                    b0Var.invoke(Boolean.TRUE);
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(activity.getString(R.string.share_unsupported), e));
                    enj.q(R.string.share_unsupported, 0, activity);
                    b0Var.invoke(Boolean.FALSE);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hor(ror rorVar, List list, lpr lprVar, List list2) {
        this.c = rorVar;
        this.d = list;
        this.f = lprVar;
        this.e = list2;
    }

    public /* synthetic */ hor(ufs ufsVar, Surface surface, m0g0 m0g0Var, p1t p1tVar) {
        this.c = ufsVar;
        this.d = surface;
        this.e = m0g0Var;
        this.f = p1tVar;
    }
}
