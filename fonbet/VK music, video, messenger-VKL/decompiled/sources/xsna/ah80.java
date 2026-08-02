package xsna;

import com.vk.api.generated.splashscreens.dto.SplashscreensColorObjectDto;
import com.vk.api.generated.splashscreens.dto.SplashscreensControlsCtaButtonActionDto;
import com.vk.api.generated.splashscreens.dto.SplashscreensControlsCtaButtonActionParamDto;
import com.vk.api.generated.splashscreens.dto.SplashscreensControlsCtaButtonDto;
import com.vk.api.generated.splashscreens.dto.SplashscreensControlsDto;
import com.vk.api.generated.splashscreens.dto.SplashscreensSlideDto;
import com.vk.api.generated.splashscreens.dto.SplashscreensSplashscreenDto;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoActionDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoControlDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoCtaButtonDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoCtaClickTypeDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoSlideDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoSlideShowTypeDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoThemedValueDo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: OnboardingPromoRepositoryImpl.kt */
@b6l(c = "com.vk.onboardingpromo.impl.data.OnboardingPromoRepositoryImpl$loadPromoData$2$1", f = "OnboardingPromoRepositoryImpl.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ah80 extends SuspendLambda implements wzs<yvj, spj<? super OnboardingPromoDo>, Object> {
    final /* synthetic */ xg80 $this_runCatching;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah80(xg80 xg80Var, spj<? super ah80> spjVar) {
        super(2, spjVar);
        this.$this_runCatching = xg80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ah80(this.$this_runCatching, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super OnboardingPromoDo> spjVar) {
        return ((ah80) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p;
        pg80 pg80Var;
        SplashscreensControlsCtaButtonDto splashscreensControlsCtaButtonDto;
        OnboardingPromoThemedValueDo onboardingPromoThemedValueDo;
        OnboardingPromoThemedValueDo onboardingPromoThemedValueDo2;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            pg80 pg80Var2 = pg80.a;
            iz2 A = yfb.A(((alk0) this.$this_runCatching.d.getValue()).b());
            fo50.J(A);
            A.j.put("device_id", b6m.b(this.$this_runCatching.a));
            this.L$0 = pg80Var2;
            this.label = 1;
            p = evj.p(A, this);
            if (p == coroutineSingletons) {
                return coroutineSingletons;
            }
            pg80Var = pg80Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg80Var = (pg80) this.L$0;
            kotlin.a.a(obj);
            p = obj;
        }
        SplashscreensSplashscreenDto splashscreensSplashscreenDto = (SplashscreensSplashscreenDto) p;
        pg80Var.getClass();
        long id = splashscreensSplashscreenDto.getId();
        String d = splashscreensSplashscreenDto.d();
        boolean i2 = splashscreensSplashscreenDto.i();
        List<SplashscreensSlideDto> g = splashscreensSplashscreenDto.g();
        ArrayList arrayList = new ArrayList(c5g.u(g, 10));
        for (SplashscreensSlideDto splashscreensSlideDto : g) {
            pg80.a.getClass();
            String type = splashscreensSlideDto.getType();
            OnboardingPromoThemedValueDo onboardingPromoThemedValueDo3 = new OnboardingPromoThemedValueDo(splashscreensSlideDto.e().e(), splashscreensSlideDto.e().d());
            String f = splashscreensSlideDto.f();
            if (f == null) {
                f = "";
            }
            arrayList.add(new OnboardingPromoSlideDo(type, onboardingPromoThemedValueDo3, f, splashscreensSlideDto.d()));
        }
        Long valueOf = splashscreensSplashscreenDto.f() != null ? Long.valueOf(TimeUnit.SECONDS.toMillis(r1.intValue())) : null;
        long currentTimeMillis = System.currentTimeMillis();
        SplashscreensControlsDto e = splashscreensSplashscreenDto.e();
        int d2 = e.d();
        boolean f2 = e.f();
        boolean g2 = e.g();
        SplashscreensControlsCtaButtonDto e2 = e.e();
        int j = e2.j();
        String i3 = e2.i();
        String i4 = e2.g().i();
        OnboardingPromoSlideShowTypeDo onboardingPromoSlideShowTypeDo = OnboardingPromoSlideShowTypeDo.ALL;
        if (!epx.f(i4, onboardingPromoSlideShowTypeDo.h())) {
            onboardingPromoSlideShowTypeDo = OnboardingPromoSlideShowTypeDo.LAST;
        }
        SplashscreensColorObjectDto e3 = e2.e();
        if (e3 != null) {
            splashscreensControlsCtaButtonDto = e2;
            onboardingPromoThemedValueDo = new OnboardingPromoThemedValueDo(e3.e(), e3.d());
        } else {
            splashscreensControlsCtaButtonDto = e2;
            onboardingPromoThemedValueDo = null;
        }
        SplashscreensColorObjectDto f3 = splashscreensControlsCtaButtonDto.f();
        OnboardingPromoThemedValueDo onboardingPromoThemedValueDo4 = f3 != null ? new OnboardingPromoThemedValueDo(f3.e(), f3.d()) : null;
        SplashscreensControlsCtaButtonActionDto d3 = splashscreensControlsCtaButtonDto.d();
        String i5 = d3.e().i();
        OnboardingPromoCtaClickTypeDo onboardingPromoCtaClickTypeDo = OnboardingPromoCtaClickTypeDo.LINK;
        if (!epx.f(i5, onboardingPromoCtaClickTypeDo.h())) {
            onboardingPromoCtaClickTypeDo = OnboardingPromoCtaClickTypeDo.CUSTOM;
            if (!epx.f(i5, onboardingPromoCtaClickTypeDo.h())) {
                onboardingPromoCtaClickTypeDo = OnboardingPromoCtaClickTypeDo.CLOSE;
            }
        }
        OnboardingPromoCtaClickTypeDo onboardingPromoCtaClickTypeDo2 = onboardingPromoCtaClickTypeDo;
        List<SplashscreensControlsCtaButtonActionParamDto> d4 = d3.d();
        if (d4 != null) {
            onboardingPromoThemedValueDo2 = onboardingPromoThemedValueDo4;
            list = e43.l(((SplashscreensControlsCtaButtonActionParamDto) j5g.Y(d4)).d(), ((SplashscreensControlsCtaButtonActionParamDto) j5g.i0(d4)).d());
        } else {
            onboardingPromoThemedValueDo2 = onboardingPromoThemedValueDo4;
            list = null;
        }
        return new OnboardingPromoDo(id, valueOf, currentTimeMillis, d, i2, arrayList, new OnboardingPromoControlDo(d2, f2, g2, new OnboardingPromoCtaButtonDo(j, i3, onboardingPromoSlideShowTypeDo, onboardingPromoThemedValueDo, onboardingPromoThemedValueDo2, new OnboardingPromoActionDo(onboardingPromoCtaClickTypeDo2, list))));
    }
}
