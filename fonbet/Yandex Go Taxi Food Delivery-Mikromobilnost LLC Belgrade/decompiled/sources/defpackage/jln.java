package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.camera.video.internal.encoder.j;
import coil.memory.MemoryCache$Key;
import com.bumptech.glide.load.engine.b;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.yandex.go.feedback_common.data.model.QuestionInfo;
import com.yandex.go.payments.shared.family.web.c;
import com.yandex.go.taxi.order.feedback.ui.k;
import com.yandex.plus.pay.common.api.model.PlusPayPlatform;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.banners.presentation.fullscreen.a;
import ru.yandex.taxi.order.view.FeedbackView;

/* loaded from: classes13.dex */
public final class jln implements gsn, m5x0, mvu0, iqs, w7p, r1o, vwo, bap, wtq, eg, nis, t070 {
    public final /* synthetic */ int a;
    public final Object b;

    public jln(jdj jdjVar) {
        PayEvgenAnalyticsPlatform payEvgenAnalyticsPlatform;
        this.a = 10;
        int i = mho.a[((PlusPayPlatform) jdjVar.c).ordinal()];
        if (i == 1) {
            payEvgenAnalyticsPlatform = PayEvgenAnalyticsPlatform.Android;
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            payEvgenAnalyticsPlatform = PayEvgenAnalyticsPlatform.AndroidTv;
        }
        this.b = new uxd(payEvgenAnalyticsPlatform);
    }

    @Override // defpackage.mvu0
    public void a(int i) {
    }

    @Override // defpackage.mvu0
    public ki10 b(MemoryCache$Key memoryCache$Key) {
        return null;
    }

    @Override // defpackage.mvu0
    public void c(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        ((w941) this.b).c(memoryCache$Key, bitmap, map, mga1.c(bitmap));
    }

    @Override // defpackage.w7p
    public Object create() {
        o3 o3Var = (o3) this.b;
        return new b((g1o) o3Var.w, (jdj) o3Var.c);
    }

    @Override // defpackage.nis
    public void d() {
        gis gisVar;
        gisVar = ((FullScreenBannerPage) this.b).listener;
        a aVar = ((zhs) gisVar).a.presenter;
        int i = aVar.z;
        if (i > 0) {
            ((eis) aVar.a).goToPage(i - 1);
            return;
        }
        ((n9y0) aVar.h).e(aVar.f, aVar.g, aVar.g(), aVar.z, Long.valueOf(aVar.h()));
    }

    @Override // defpackage.wtq
    public void e(QuestionInfo questionInfo) {
        k presenter = ((FeedbackView) this.b).getPresenter();
        presenter.getClass();
        String str = questionInfo.a;
        String str2 = questionInfo.b;
        boolean l = jl40.l(str, "");
        isq isqVar = presenter.K;
        if (l) {
            isqVar.b = Boolean.valueOf(jl40.l(str2, "yes"));
        } else {
            isqVar.a(Collections.singletonList(questionInfo));
        }
        presenter.C.e.a.a("Complete.FeedbackButtonTapped", kotlin.collections.b.h(new Pair("id", str2)), 1, new HashMap());
        presenter.Ng();
    }

    @Override // defpackage.nis
    public void f() {
        gis gisVar;
        gisVar = ((FullScreenBannerPage) this.b).listener;
        a aVar = ((zhs) gisVar).a.presenter;
        if (aVar.z < aVar.f.l.size() - 1) {
            ((eis) aVar.a).goToPage(aVar.z + 1);
            return;
        }
        ((n9y0) aVar.h).d(aVar.f, aVar.g, aVar.g(), aVar.z, Long.valueOf(aVar.h()));
    }

    @Override // defpackage.vwo
    public ViewGroup.LayoutParams g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    @Override // defpackage.vwo
    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    @Override // defpackage.vwo
    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    @Override // defpackage.vwo
    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    @Override // defpackage.vwo
    public int getWidth() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    public DivEducationsV2View h(Context context, ViewGroup viewGroup) {
        apn apnVar = (apn) this.b;
        DivEducationsV2View divEducationsV2View = new DivEducationsV2View(context, null, 0, (ook) apnVar.a.get(), apnVar.b, 6, null);
        divEducationsV2View.prepareView(viewGroup);
        return divEducationsV2View;
    }

    public void i(String str) {
        c cVar = (c) this.b;
        if (str == null || evu0.J(str)) {
            ((ag41) cVar.Q()).a.g(jf41.d);
        } else {
            ((ag41) cVar.Q()).d(str);
        }
    }

    @Override // defpackage.m5x0
    public int k(int i) {
        return ((int[]) ((rtn) this.b).c.c)[i];
    }

    @Override // defpackage.m5x0
    public int l(int i) {
        return ((ntn[]) ((rtn) this.b).c.b)[i].a;
    }

    @Override // defpackage.r1o
    public Object n(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((j2o) this.b).a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                ((j) obj).b(0, "Unable to acquire InputBuffer.", th);
                break;
            default:
                ((androidx.concurrent.futures.b) obj).d(th);
                break;
        }
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 5:
                czn cznVar = (czn) obj;
                j jVar = (j) obj2;
                cznVar.b(jVar.r.d());
                if (!cznVar.f.get()) {
                    cznVar.h = true;
                    cznVar.c();
                    ni91.a(ni91.g(cznVar.d), new gym(this), jVar.i);
                    break;
                } else {
                    ny61.r("The buffer is submitted or canceled.");
                    break;
                }
            case 24:
                androidx.concurrent.futures.b bVar = (androidx.concurrent.futures.b) obj2;
                try {
                    bVar.b(obj);
                    break;
                } catch (Throwable th) {
                    bVar.d(th);
                    return;
                }
            default:
                ((si3) obj2).invoke(obj);
                break;
        }
    }

    public jln(wwf wwfVar, vs20 vs20Var, wwf wwfVar2) {
        this.a = 19;
        this.b = wwfVar2;
    }

    public /* synthetic */ jln(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
