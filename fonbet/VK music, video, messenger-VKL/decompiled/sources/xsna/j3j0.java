package xsna;

import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.wall.dto.WallGroupWallStatusDto;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.settings.SettingsPriority;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.local.AudioMaxCountRule;
import com.vk.newsfeed.posting.impl.domain.rules.local.DisableActionButtonWithCoauthorsRule;
import com.vk.newsfeed.posting.impl.domain.rules.local.DisableNextStepOnTextLimitRule;
import com.vk.newsfeed.posting.impl.domain.rules.local.DisableNextStepRule;
import com.vk.newsfeed.posting.impl.domain.rules.local.DisablePrivacyButtonRule;
import com.vk.newsfeed.posting.impl.domain.rules.local.DisableProductsIfNoPhotosRule;
import com.vk.newsfeed.posting.impl.domain.rules.local.PublishOnUploadRule;
import com.vk.newsfeed.posting.impl.presentation.model.CurrentUser;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PostingRules;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.toggle.features.ComFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SettingsRepository.kt */
/* loaded from: classes4.dex */
public final class j3j0 {
    public final PostingPollSettings a;
    public final List<PostingRule> b;
    public final PostingSettings c;
    public final boolean d;

    /* compiled from: SettingsRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[GroupsGroupIsClosedDto.values().length];
            try {
                iArr[GroupsGroupIsClosedDto.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupIsClosedDto.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupsGroupIsClosedDto.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WallGroupWallStatusDto.values().length];
            try {
                iArr2[WallGroupWallStatusDto.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WallGroupWallStatusDto.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WallGroupWallStatusDto.LIMITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WallGroupWallStatusDto.RESTRICTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[GroupsGroupAdminLevelDto.values().length];
            try {
                iArr3[GroupsGroupAdminLevelDto.MODERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[GroupsGroupAdminLevelDto.EDITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[GroupsGroupAdminLevelDto.ADMINISTRATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public j3j0() {
        PostingPollSettings postingPollSettings = new PostingPollSettings(80, 100, 10);
        this.a = postingPollSettings;
        List<PostingRule> l = e43.l(new DisableNextStepRule(), new PublishOnUploadRule(), new DisableProductsIfNoPhotosRule(), new DisableNextStepOnTextLimitRule(), new DisableActionButtonWithCoauthorsRule(), new DisablePrivacyButtonRule(), new AudioMaxCountRule());
        this.b = l;
        PostingRules postingRules = new PostingRules(l);
        SettingsPriority settingsPriority = SettingsPriority.Default;
        EmptyList emptyList = EmptyList.b;
        this.c = new PostingSettings(postingPollSettings, 10, postingRules, settingsPriority, false, null, null, emptyList, null, LoadingState.FINISHED, 4000, false, true, emptyList, null, new CurrentUser("", ""), 30, 1, false, true, true);
        ComFeatures comFeatures = ComFeatures.COM_NEW_POSTING_PRIVACY_UX;
        comFeatures.getClass();
        this.d = com.vk.toggle.b.A.a(comFeatures);
    }

    public static ArrayList a(List list) {
        DonutLevel donutLevel;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DonutLevelDto donutLevelDto = (DonutLevelDto) it.next();
            if (drm0.N(donutLevelDto.getTitle())) {
                donutLevel = null;
            } else {
                int id = donutLevelDto.getId();
                String title = donutLevelDto.getTitle();
                String description = donutLevelDto.getDescription();
                String e = donutLevelDto.e();
                if (e == null) {
                    e = "";
                }
                donutLevel = new DonutLevel(id, title, description, e);
            }
            if (donutLevel != null) {
                arrayList.add(donutLevel);
            }
        }
        return arrayList;
    }
}
