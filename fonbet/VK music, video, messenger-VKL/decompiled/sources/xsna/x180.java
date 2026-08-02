package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.user.api.domain.onboarding.analytics.OnBoardingType;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OnBoardingAnalyticsFactoryImpl.kt */
/* loaded from: classes5.dex */
public final class x180 implements w180, w8i {
    public final Object b;
    public final Object c;

    /* compiled from: OnBoardingAnalyticsFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnBoardingType.values().length];
            try {
                iArr[OnBoardingType.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnBoardingType.PHOTO_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnBoardingType.PASSKEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public x180(UserId userId) {
        jz70 jz70Var = new jz70(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, jz70Var);
        this.c = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.z(10, this, userId));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.w180
    public final v180 a(OnBoardingType onBoardingType) {
        int i = a.$EnumSwitchMapping$0[onBoardingType.ordinal()];
        if (i == 1) {
            return new tyd0(((lyd0) this.b.getValue()).i());
        }
        if (i == 2) {
            return new a8a0(((qfa0) this.c.getValue()).a());
        }
        if (i == 3) {
            return new l2l0();
        }
        throw new NoWhenBranchMatchedException();
    }
}
