package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskType;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesInvitationClickItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesNavbarClickItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.cck;
import xsna.el50;
import xsna.ln50;

/* compiled from: CreationOnboardingTasksInlineActor.kt */
/* loaded from: classes5.dex */
public final class wck extends bl50<xck, cck, on50, yvg0, awg0, tck> {
    public final sj50<xck, on50, ll50<on50, yvg0, awg0>, jl50<xck>, tck> c;
    public final UserId d;
    public final zqu e;
    public final ClipboardManager f;

    /* compiled from: CreationOnboardingTasksInlineActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SnackBar.values().length];
            try {
                iArr[SnackBar.STORY_CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackBar.POST_CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnBoardingTaskType.values().length];
            try {
                iArr2[OnBoardingTaskType.COVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OnBoardingTaskType.DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnBoardingTaskType.AVATAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OnBoardingTaskType.POST.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OnBoardingTaskType.STORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OnBoardingTaskType.INVITE_FRIENDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OnBoardingTaskType.COPY.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OnBoardingTaskType.CONTACTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OnBoardingTaskType.ACTION_BUTTON.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OnBoardingTaskType.GOODS.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OnBoardingTaskType.SERVICES.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OnBoardingTaskType.ADS.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public wck(sj50 sj50Var, UserId userId, zqu zquVar, ClipboardManager clipboardManager) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = userId;
        this.e = zquVar;
        this.f = clipboardManager;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<xck, on50, ll50<on50, yvg0, awg0>, jl50<xck>, tck> W() {
        return this.c;
    }

    public final void m() {
        ClipboardManager clipboardManager = this.f;
        if (clipboardManager != null) {
            sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
            clipboardManager.setPrimaryClip(ClipData.newPlainText(((xck) sj50Var.getCurrentState()).f, ((xck) sj50Var.getCurrentState()).f));
            el50.a.b(this, new eph(this, 5));
        }
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        NewsEntry newsEntry;
        cck cckVar = (cck) lj50Var;
        long j = this.d.b;
        boolean z = cckVar instanceof cck.b;
        ln50.a.b bVar = ln50.a.a;
        if (!z) {
            if (cckVar instanceof cck.f) {
                el50.a.b(this, new xcd(this, 12));
                return;
            }
            if (cckVar instanceof cck.c) {
                f(this, new qn50(0), bVar, new wje(this, 11));
                return;
            }
            if (cckVar instanceof cck.a) {
                new wbk();
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), CommonCommunitiesStat$TypeCommunitiesClick.a.a(Math.abs(j), CommonCommunitiesStat$TypeCommunitiesClick.Source.CREATION_ONBOARDING_BLOCK, new CommonCommunitiesStat$TypeCommunitiesInvitationClickItem(CommonCommunitiesStat$TypeCommunitiesInvitationClickItem.Event.SEND_INVITATION)), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                return;
            }
            if (cckVar instanceof cck.g) {
                el50.a.b(this, new ri0(11, this, cckVar));
                return;
            }
            if (cckVar instanceof cck.e) {
                el50.a.b(this, new oh3(13, this, cckVar));
                return;
            }
            if (!(cckVar instanceof cck.d)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = a.$EnumSwitchMapping$0[((cck.d) cckVar).b.ordinal()];
            sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
            tck tckVar = null;
            if (i == 1) {
                StoryEntry storyEntry = ((xck) sj50Var.getCurrentState()).g;
                if (storyEntry != null) {
                    tckVar = new sck(storyEntry);
                }
            } else if (i == 2 && (newsEntry = ((xck) sj50Var.getCurrentState()).h) != null) {
                tckVar = new rck(newsEntry);
            }
            if (tckVar != null) {
                c(tckVar);
                return;
            }
            return;
        }
        int i2 = 10;
        switch (a.$EnumSwitchMapping$1[((cck.b) cckVar).b.e.ordinal()]) {
            case 1:
                c(pck.a);
                return;
            case 2:
                c(nck.a);
                return;
            case 3:
                c(gck.a);
                return;
            case 4:
                lck lckVar = lck.a;
                m();
                f(this, new qn50(0), bVar, new qd1(i2, this, lckVar));
                return;
            case 5:
                mck mckVar = mck.a;
                m();
                f(this, new qn50(0), bVar, new qd1(i2, this, mckVar));
                return;
            case 6:
                c(ock.a);
                return;
            case 7:
                m();
                new wbk();
                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), CommonCommunitiesStat$TypeCommunitiesClick.a.a(Math.abs(j), CommonCommunitiesStat$TypeCommunitiesClick.Source.CREATION_ONBOARDING_BLOCK, new CommonCommunitiesStat$TypeCommunitiesNavbarClickItem(CommonCommunitiesStat$TypeCommunitiesNavbarClickItem.Event.COPY_LINK)), 2);
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(c2, b2, uzp0Var2.a).q();
                return;
            case 8:
                c(ick.a);
                return;
            case 9:
                c(hck.a);
                return;
            case 10:
                c(jck.a);
                return;
            case 11:
                c(kck.a);
                return;
            case 12:
                c(qck.a);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
