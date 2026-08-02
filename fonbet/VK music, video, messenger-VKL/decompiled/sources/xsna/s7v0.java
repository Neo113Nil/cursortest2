package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.api.generated.onboarding.dto.OnboardingInteractElementTypeDto;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.e8v0;

/* compiled from: VkOnboardingClientImpl.kt */
/* loaded from: classes4.dex */
public final class s7v0 implements q7v0 {
    public final hpt0 a;
    public volatile ArrayList b;
    public final ArrayList c = new ArrayList();
    public final AtomicReference<VkOnboardingCampaign> d = new AtomicReference<>(null);
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: VkOnboardingClientImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOnboardingType.values().length];
            try {
                iArr[VkOnboardingType.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOnboardingType.Tooltip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkOnboardingType.Fullscreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkOnboardingType.Toast.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkOnboardingType.Highlighter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s7v0(hpt0 hpt0Var) {
        this.a = hpt0Var;
    }

    @Override // xsna.q7v0
    public final void a(VkOnboardingCampaign vkOnboardingCampaign, VkOnboardingType vkOnboardingType, e8v0 e8v0Var) {
        OnboardingInteractElementTypeDto onboardingInteractElementTypeDto;
        if (vkOnboardingCampaign.d && !e8v0Var.equals(e8v0.m.b)) {
            b(vkOnboardingCampaign, true);
            vkOnboardingCampaign.d = false;
        }
        String str = vkOnboardingCampaign.b;
        int i = a.$EnumSwitchMapping$0[vkOnboardingType.ordinal()];
        if (i == 1) {
            onboardingInteractElementTypeDto = OnboardingInteractElementTypeDto.BANNER;
        } else if (i == 2) {
            onboardingInteractElementTypeDto = OnboardingInteractElementTypeDto.TOOLTIP;
        } else if (i == 3) {
            onboardingInteractElementTypeDto = OnboardingInteractElementTypeDto.FULLSCREEN;
        } else if (i == 4) {
            onboardingInteractElementTypeDto = OnboardingInteractElementTypeDto.TOAST;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            onboardingInteractElementTypeDto = OnboardingInteractElementTypeDto.ANIMATION;
        }
        String str2 = e8v0Var.a;
        int i2 = vkOnboardingCampaign.c;
        tfx tfxVar = new tfx("onboarding.interact", new u11(28), new v11(21));
        tfx.o(tfxVar, "campaign_name", str, 0, 0, 12);
        tfx.o(tfxVar, "element_type", onboardingInteractElementTypeDto.i(), 0, 0, 12);
        tfx.o(tfxVar, NotificationCompat.CATEGORY_EVENT, str2, 0, 0, 12);
        tfx.l(tfxVar, "ab_group", i2, 0, 0, 12);
        itg0.k(rsg0.W(yfb.x(tfxVar), 7), null, null, 3);
    }

    @Override // xsna.q7v0
    public final boolean b(VkOnboardingCampaign vkOnboardingCampaign, boolean z) {
        boolean z2 = true;
        if (!z && vkOnboardingCampaign.d) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return true;
            }
            L.u(l, L.LogType.d, new Object[]{"VkOnboardingSdk", "did not occupied due to campaign.hasActiveBanner=true"});
            return true;
        }
        while (true) {
            AtomicReference<VkOnboardingCampaign> atomicReference = this.d;
            if (atomicReference.compareAndSet(null, vkOnboardingCampaign)) {
                break;
            }
            if (atomicReference.get() != null) {
                z2 = false;
                break;
            }
        }
        if (z2) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"VkOnboardingSdk", "did occupied by ".concat(vkOnboardingCampaign.b)});
            }
        }
        return z2;
    }

    @Override // xsna.q7v0
    public final void c(gzs<s3q0> gzsVar) {
        if (isReady()) {
            gzsVar.invoke();
            return;
        }
        synchronized (this.c) {
            try {
                if (isReady()) {
                    gzsVar.invoke();
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    this.c.add(gzsVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.q7v0
    public final boolean d(VkOnboardingCampaign vkOnboardingCampaign) {
        L l = L.a;
        l.getClass();
        boolean m = L.m(LoggerOutputTarget.NONE);
        AtomicReference<VkOnboardingCampaign> atomicReference = this.d;
        if (!m) {
            L.u(l, L.LogType.d, new Object[]{"VkOnboardingSdk", "canShowCampaign: campaign=" + vkOnboardingCampaign + "; occupiedBy=" + atomicReference.get()});
        }
        return atomicReference.get() == null || vkOnboardingCampaign.d;
    }

    @Override // xsna.q7v0
    public final VkOnboardingCampaign e(String str) {
        ArrayList arrayList = this.b;
        Object obj = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((VkOnboardingCampaign) next).b.equals(str)) {
                obj = next;
                break;
            }
        }
        return (VkOnboardingCampaign) obj;
    }

    @Override // xsna.q7v0
    public final void init() {
        if (this.e.compareAndSet(false, true)) {
            int i = 1;
            itg0.h(rsg0.W(yfb.x(new tfx("onboarding.get", new bt(23), new ct(20))), 7), new gqq0(new awi0(this, 10), this.a), new e15(i, new p7v0() { // from class: xsna.r7v0
                @Override // xsna.p7v0
                public final void a(Throwable th) {
                    L.i(th);
                    s7v0.this.e.compareAndSet(true, false);
                }
            }, p7v0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 11));
        }
    }

    @Override // xsna.q7v0
    public final boolean isReady() {
        return this.b != null;
    }
}
