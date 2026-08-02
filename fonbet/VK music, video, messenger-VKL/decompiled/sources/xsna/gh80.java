package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoActionDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoControlDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoCtaButtonDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoSlideDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoThemedValueDo;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.onboardingpromo.impl.ui.store.delegate.MediaType;
import com.vk.onboardingpromo.impl.ui.view.OnboardingPromoCtaClickTypeVs;
import com.vk.onboardingpromo.impl.ui.view.OnboardingPromoSlideShowTypeVs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.fh80;
import xsna.qg80;

/* compiled from: OnboardingPromoViewStateMapper.kt */
/* loaded from: classes4.dex */
public final class gh80 implements izs<OnboardingPromoState, fh80> {
    public static final gh80 b = new gh80();

    @Override // xsna.izs
    public final fh80 invoke(OnboardingPromoState onboardingPromoState) {
        long j;
        aqo0 aqo0Var;
        Iterator it;
        qg80 bVar;
        OnboardingPromoState onboardingPromoState2 = onboardingPromoState;
        OnboardingPromoDo onboardingPromoDo = onboardingPromoState2.c;
        long g = onboardingPromoDo.g();
        List<OnboardingPromoState.CachedMedia> list = onboardingPromoState2.b;
        boolean z = onboardingPromoState2.e;
        boolean k = onboardingPromoDo.k();
        List<OnboardingPromoSlideDo> j2 = onboardingPromoDo.j();
        ArrayList arrayList = new ArrayList(c5g.u(j2, 10));
        int i = 0;
        for (Iterator it2 = j2.iterator(); it2.hasNext(); it2 = it) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            OnboardingPromoSlideDo onboardingPromoSlideDo = (OnboardingPromoSlideDo) next;
            OnboardingPromoState.CachedMedia cachedMedia = (OnboardingPromoState.CachedMedia) j5g.b0(i, list);
            String f = onboardingPromoSlideDo.f();
            if (cachedMedia == null) {
                bVar = qg80.a.a;
                it = it2;
            } else {
                String str = cachedMedia.d;
                String str2 = cachedMedia.c;
                if (cachedMedia.b.equals(MediaType.VIDEO.h())) {
                    if (dhr0.C().b) {
                        str = str2;
                    }
                    VideoFileOld videoFileOld = new VideoFileOld();
                    videoFileOld.z = false;
                    HashMap hashMap = new HashMap();
                    it = it2;
                    VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                    if (!myc0.f(str)) {
                        str = null;
                    }
                    if (str != null) {
                        VideoUrlStorage.b bVar2 = VideoUrlStorage.c;
                        VideoUrlStorage.d.b(hashMap, videoUrl, str);
                    }
                    videoFileOld.f = new VideoUrlStorage(hashMap);
                    bVar = new qg80.c(videoFileOld);
                } else {
                    it = it2;
                    if (dhr0.C().b) {
                        str = str2;
                    }
                    bVar = new qg80.b(str);
                    arrayList.add(new dh80(bVar, f, onboardingPromoSlideDo.d()));
                    i = i2;
                }
            }
            arrayList.add(new dh80(bVar, f, onboardingPromoSlideDo.d()));
            i = i2;
        }
        OnboardingPromoControlDo f2 = onboardingPromoDo.f();
        long d = f2.d();
        boolean f3 = f2.f();
        boolean g2 = f2.g();
        OnboardingPromoCtaButtonDo e = f2.e();
        long j3 = e.j();
        String i3 = e.i();
        String h = e.g().h();
        OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs = OnboardingPromoSlideShowTypeVs.ALL;
        if (!epx.f(h, onboardingPromoSlideShowTypeVs.h())) {
            onboardingPromoSlideShowTypeVs = OnboardingPromoSlideShowTypeVs.LAST;
        }
        OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs2 = onboardingPromoSlideShowTypeVs;
        OnboardingPromoThemedValueDo e2 = e.e();
        aqo0 aqo0Var2 = e2 != null ? new aqo0(e2.e(), e2.d()) : null;
        OnboardingPromoActionDo d2 = e.d();
        String h2 = d2.e().h();
        OnboardingPromoCtaClickTypeVs onboardingPromoCtaClickTypeVs = OnboardingPromoCtaClickTypeVs.LINK;
        if (!epx.f(h2, onboardingPromoCtaClickTypeVs.h())) {
            onboardingPromoCtaClickTypeVs = epx.f(h2, OnboardingPromoCtaClickTypeVs.CUSTOM.h()) ? OnboardingPromoCtaClickTypeVs.CLOSE : OnboardingPromoCtaClickTypeVs.CLOSE;
        }
        ue80 ue80Var = new ue80(onboardingPromoCtaClickTypeVs, d2.d());
        OnboardingPromoThemedValueDo f4 = e.f();
        if (f4 != null) {
            j = j3;
            aqo0Var = new aqo0(f4.e(), f4.d());
        } else {
            j = j3;
            aqo0Var = null;
        }
        return new fh80.a(new hh80(g, k, arrayList, new ef80(d, f3, g2, new ff80(j, i3, onboardingPromoSlideShowTypeVs2, aqo0Var2, aqo0Var, ue80Var)), z));
    }
}
