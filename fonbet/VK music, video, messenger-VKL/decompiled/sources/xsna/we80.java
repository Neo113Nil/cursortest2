package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import java.util.concurrent.ConcurrentHashMap;
import xsna.qg80;

/* compiled from: OnboardingPromoAnalyticsMiddleware.kt */
/* loaded from: classes4.dex */
public final class we80 implements h7f0<OnboardingPromoState, com.vk.onboardingpromo.impl.ui.entity.a, on50, ll50<on50, bwj, dwj>, jl50<OnboardingPromoState>, qf80> {
    public final sl50<OnboardingPromoState, com.vk.onboardingpromo.impl.ui.entity.a, on50, ll50<on50, bwj, dwj>, jl50<OnboardingPromoState>, qf80> b;
    public final ConcurrentHashMap.KeySetView c = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView d = ConcurrentHashMap.newKeySet();
    public final utk0 e = vtk0.a(0L);
    public final boolean f;
    public final String g;

    /* compiled from: OnboardingPromoAnalyticsMiddleware.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonOnboardingStat$TypeOnboardingEvent.EventType.values().length];
            try {
                iArr[CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_50P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_100P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK_CTA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_EXIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public we80(sl50<OnboardingPromoState, com.vk.onboardingpromo.impl.ui.entity.a, on50, ll50<on50, bwj, dwj>, jl50<OnboardingPromoState>, qf80> sl50Var) {
        this.b = sl50Var;
        this.f = ((OnboardingPromoState) getCurrentState()).c.j().size() > 1;
        this.g = ((OnboardingPromoState) getCurrentState()).c.e();
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        Object value;
        int i;
        com.vk.onboardingpromo.impl.ui.entity.a aVar = (com.vk.onboardingpromo.impl.ui.entity.a) lj50Var;
        boolean z = aVar instanceof a.d;
        utk0 utk0Var = this.e;
        if (z) {
            xe80.c(new ve80(a(CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK_CTA), null, this.g, ((OnboardingPromoState) getCurrentState()).d, ((a.d) aVar).c, ((Number) utk0Var.getValue()).longValue(), 66));
            return;
        }
        boolean z2 = aVar instanceof a.b;
        String str = this.g;
        if (z2) {
            xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.SCREEN_BLUR, null, str, ((a.b) aVar).b, 0, ((Number) utk0Var.getValue()).longValue(), 18));
            return;
        }
        if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            xe80.c(new ve80(cVar.d ? a(CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_EXIT) : CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE, null, this.g, ((OnboardingPromoState) getCurrentState()).d, cVar.c, ((Number) utk0Var.getValue()).longValue(), 66));
            return;
        }
        if (aVar instanceof a.C1448a) {
            xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_APP, null, str, ((a.C1448a) aVar).b, 0, ((Number) utk0Var.getValue()).longValue(), 18));
            return;
        }
        if (!(aVar instanceof te80)) {
            if (aVar instanceof se80) {
                xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_ERROR, null, this.g, ((OnboardingPromoState) getCurrentState()).d, 0, 0L, 50));
                return;
            }
            if (aVar instanceof a.f) {
                a.f fVar = (a.f) aVar;
                qg80 qg80Var = fVar.b;
                long j = fVar.c;
                OnboardingPromoState.CurrentSlide currentSlide = new OnboardingPromoState.CurrentSlide(qg80Var, Long.valueOf(j));
                int i2 = fVar.d;
                xe80.c(new ve80(a(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW), null, str, currentSlide, i2, 0L, 34));
                if (i2 != e43.h(((OnboardingPromoState) getCurrentState()).c.j()) || i2 == 0) {
                    return;
                }
                xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_ALL_SCREEN, null, this.g, new OnboardingPromoState.CurrentSlide(fVar.b, Long.valueOf(j)), fVar.d, 0L, 34));
                return;
            }
            return;
        }
        te80 te80Var = (te80) aVar;
        long j2 = te80Var.e;
        do {
            value = utk0Var.getValue();
            ((Number) value).longValue();
            i = te80Var.c;
        } while (!utk0Var.compareAndSet(value, Long.valueOf(j2)));
        qg80 qg80Var2 = te80Var.b;
        VideoFileOld videoFileOld = qg80Var2 instanceof qg80.c ? ((qg80.c) qg80Var2).a : null;
        String a1 = videoFileOld != null ? videoFileOld.a1() : null;
        float f = j2 / te80Var.f;
        boolean z3 = f >= 0.5f;
        boolean z4 = f >= 0.98f;
        if (z3) {
            ConcurrentHashMap.KeySetView keySetView = this.c;
            if (!j5g.P(keySetView, a1)) {
                keySetView.add(a1 == null ? "" : a1);
                xe80.c(new ve80(a(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_50P), null, str, ((OnboardingPromoState) getCurrentState()).d, i, 0L, 34));
            }
        }
        if (z4) {
            ConcurrentHashMap.KeySetView keySetView2 = this.d;
            if (j5g.P(keySetView2, a1)) {
                return;
            }
            if (a1 == null) {
                a1 = "";
            }
            keySetView2.add(a1);
            xe80.c(new ve80(a(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_100P), null, str, ((OnboardingPromoState) getCurrentState()).d, i, 0L, 34));
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    public final CommonOnboardingStat$TypeOnboardingEvent.EventType a(CommonOnboardingStat$TypeOnboardingEvent.EventType eventType) {
        if (this.f) {
            switch (a.$EnumSwitchMapping$0[eventType.ordinal()]) {
                case 1:
                    return CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_N_SCREEN;
                case 2:
                    return CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_50P_N_SCREEN;
                case 3:
                    return CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_100P_N_SCREEN;
                case 4:
                    return CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK_CTA_N_SCREEN;
                case 5:
                    return CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_N_SCREEN;
                case 6:
                    return CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_N_SCREEN;
            }
        }
        return eventType;
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
