package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import com.vk.external.miniapp.net.app.WebAppSplashScreen;
import com.vkontakte.android.R;
import one.video.gl.GLESUtils;
import xsna.aqe0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ojg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ojg(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ygg yggVar = (ygg) obj4;
                g1x g1xVar = (g1x) obj3;
                izs izsVar = (izs) obj2;
                Throwable th = (Throwable) obj;
                if (yggVar != null) {
                    izsVar.invoke(yggVar.b(th, g1xVar));
                } else {
                    par0.a.getClass();
                    par0.b("Error " + th + " is not handled properly because CommonApiErrorHandler is not provided");
                    izsVar.invoke(new xjq(th));
                }
                break;
            case 1:
                kjx kjxVar = (kjx) obj4;
                int i3 = aqe0.m1;
                Context context = kjxVar.c.getContext();
                kjxVar.d.getClass();
                aqe0.a aVar = new aqe0.a((NpsFeatureModel) obj3, j2u0.a((FeedbackResult) obj), (QuestionsTexts) obj2, new hoh(kjxVar, 3));
                aqe0.b bVar = new aqe0.b(context, aVar);
                e.a aVar2 = bVar.d;
                aVar2.U = 2;
                aVar2.V = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float f = 24;
                aVar2.X = new Rect(iah0.a(f), 0, iah0.a(f), 0);
                bVar.z0(17).t().s(enj.e(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent, context)).c(new cpo(false, 0, 7)).a0(new rme0(aVar, i2)).n(new bqe0(aVar)).I0(null);
                break;
            case 2:
                bw00 bw00Var = (bw00) obj3;
                Good good = (Good) obj2;
                gmq gmqVar = (gmq) obj;
                if (gmqVar.equals((MarketFavable) obj4)) {
                    d9a d9aVar = bw00Var.d;
                    d9aVar.b(new c9a(d9aVar, good.b, gmqVar.X()));
                }
                break;
            case 3:
                dzf0 dzf0Var = (dzf0) obj4;
                Size size = (Size) obj3;
                s1t s1tVar = (s1t) obj2;
                Size size2 = (Size) obj;
                GLES20.glViewport(0, 0, size2.getWidth(), size2.getHeight());
                GLESUtils.c("glViewport", new int[0]);
                a2t a2tVar = dzf0Var.h;
                d2t d2tVar = dzf0Var.g;
                if (!size.equals(a2tVar.c)) {
                    a2tVar.c = size;
                    a2tVar.c();
                }
                a2t a2tVar2 = dzf0Var.h;
                if (!size2.equals(a2tVar2.d)) {
                    a2tVar2.d = size2;
                    a2tVar2.c();
                }
                dzf0Var.h.a(d2tVar);
                if (s1tVar.d()) {
                    k22 k22Var = dzf0Var.d;
                    SurfaceTexture surfaceTexture = d2tVar.b;
                    k22Var.invoke(Long.valueOf(surfaceTexture != null ? surfaceTexture.getTimestamp() : 0L));
                    if (!dzf0Var.l) {
                        dzf0Var.l = true;
                        dzf0Var.c.invoke();
                    }
                }
                break;
            case 4:
                int intValue = ((Integer) obj).intValue();
                ((androidx.appcompat.app.d) obj4).dismiss();
                ((Tooltip) obj3).e((Tooltip.g) obj2, intValue);
                break;
            default:
                ygn0 ygn0Var = (ygn0) obj;
                ((VKReplacerView) obj4).a(ygn0Var.getView());
                View findViewById = ((ViewGroup) obj3).findViewById(R.id.progress);
                if (((WebAppSplashScreen) obj2).d) {
                    ygn0Var.a();
                    if (findViewById != null) {
                        f4m.j(findViewById);
                    }
                } else if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                break;
        }
        return s3q0.a;
    }
}
