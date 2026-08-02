package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboarding;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingTooltip;
import com.vk.profile.community.creationonboarding.api.models.CommunityData;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskType;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import xsna.c5i;

/* compiled from: CommunityProfileCreationOnboardingFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class mmh {
    public final zqu a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final jnb c;
    public final kf8 d;
    public final doh e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    /* compiled from: CommunityProfileCreationOnboardingFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GroupCreationOnboardingBlock.Step.values().length];
            try {
                iArr[GroupCreationOnboardingBlock.Step.DESIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupCreationOnboardingBlock.Step.SUBSCRIBERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupCreationOnboardingBlock.Step.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupCreationOnboardingBlock.Step.REGULAR_POSTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupCreationOnboardingBlock.Step.POSTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupCreationOnboardingBlock.Step.CLIPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnBoardingTaskType.values().length];
            try {
                iArr2[OnBoardingTaskType.ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public mmh(ynh ynhVar, zqu zquVar, io.reactivex.rxjava3.disposables.b bVar, jnb jnbVar, kf8 kf8Var, doh dohVar) {
        this.a = zquVar;
        this.b = bVar;
        this.c = jnbVar;
        this.d = kf8Var;
        this.e = dohVar;
        sx0 sx0Var = new sx0(ynhVar, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, sx0Var);
        this.g = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(ynhVar, 26));
        this.h = msy.a(lazyThreadSafetyMode, new v6(ynhVar, 23));
        this.i = msy.a(lazyThreadSafetyMode, new bih(ynhVar, 1));
        this.j = msy.a(lazyThreadSafetyMode, new kmh(ynhVar, 0));
        this.k = msy.a(lazyThreadSafetyMode, new lmh(ynhVar, 0));
    }

    public static String a(ExtendedCommunityProfile extendedCommunityProfile, GroupCreationOnboardingBlock.Option.Status status) {
        GroupCreationOnboarding groupCreationOnboarding;
        GroupCreationOnboardingBlock groupCreationOnboardingBlock;
        List<GroupCreationOnboardingBlock.Option> list;
        Object obj;
        if (extendedCommunityProfile != null && (groupCreationOnboarding = extendedCommunityProfile.K2) != null && (groupCreationOnboardingBlock = groupCreationOnboarding.e) != null && (list = groupCreationOnboardingBlock.g) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((GroupCreationOnboardingBlock.Option) obj).d == status) {
                    break;
                }
            }
            GroupCreationOnboardingBlock.Option option = (GroupCreationOnboardingBlock.Option) obj;
            if (option != null) {
                return option.i;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h0h b() {
        return (h0h) this.f.getValue();
    }

    public final String c(UserId userId, GroupCreationOnboarding groupCreationOnboarding, GroupCreationOnboardingTooltip.Type type, GroupCreationOnboardingBlock.Step step, boolean z) {
        GroupCreationOnboardingTooltip groupCreationOnboardingTooltip = groupCreationOnboarding.f;
        boolean z2 = (groupCreationOnboardingTooltip != null ? groupCreationOnboardingTooltip.b : null) == type;
        boolean z3 = groupCreationOnboarding.e.b == step;
        boolean b = b().b(userId, type);
        if (z2 && z3 && !b) {
            if (z) {
                b().f(userId, type);
            }
            GroupCreationOnboardingTooltip groupCreationOnboardingTooltip2 = groupCreationOnboarding.f;
            if (groupCreationOnboardingTooltip2 != null) {
                return groupCreationOnboardingTooltip2.c;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(ExtendedCommunityProfile extendedCommunityProfile, boolean z, boolean z2) {
        String c;
        GroupCreationOnboardingBlock groupCreationOnboardingBlock;
        GroupCreationOnboardingBlock.Step step = null;
        if (z && !z2) {
            extendedCommunityProfile.K2 = null;
            return;
        }
        UserId userId = extendedCommunityProfile.a.c;
        GroupCreationOnboarding groupCreationOnboarding = extendedCommunityProfile.K2;
        if (groupCreationOnboarding != null && (groupCreationOnboardingBlock = groupCreationOnboarding.e) != null) {
            step = groupCreationOnboardingBlock.b;
        }
        if (step == GroupCreationOnboardingBlock.Step.FINISH) {
            GroupCreationOnboardingBlock groupCreationOnboardingBlock2 = groupCreationOnboarding.e;
            String str = groupCreationOnboardingBlock2.c;
            String str2 = groupCreationOnboardingBlock2.d;
            String str3 = groupCreationOnboardingBlock2.e;
            List<GroupCreationOnboardingBlock.Option> list = groupCreationOnboardingBlock2.g;
            ListBuilder e = e43.e();
            for (GroupCreationOnboardingBlock.Option option : list) {
                Long n = arm0.n(option.f);
                if (n != null) {
                    e.add(new CommunityData(option.b, option.g, new UserId(n.longValue())));
                }
            }
            this.d.invoke(new d.j.q.b(str, str2, str3, e.g(), groupCreationOnboarding.e.h));
            b().e(userId);
        } else if (groupCreationOnboarding != null) {
            b().a(userId, groupCreationOnboarding.c);
        } else {
            b().e(userId);
        }
        if (groupCreationOnboarding == null || (c = c(userId, groupCreationOnboarding, GroupCreationOnboardingTooltip.Type.SHARE_POST, GroupCreationOnboardingBlock.Step.SUBSCRIBERS, false)) == null) {
            return;
        }
        ((a5i) this.h.getValue()).b(new c5i.b(userId, c));
    }
}
