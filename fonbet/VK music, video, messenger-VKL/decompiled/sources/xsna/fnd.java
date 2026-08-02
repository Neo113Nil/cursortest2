package xsna;

import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.CoauthorType;
import com.vk.clips.coauthors.domain.model.Restriction;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: ClipsCoauthorsSelectorStateMapper.kt */
/* loaded from: classes16.dex */
public final class fnd {

    /* compiled from: ClipsCoauthorsSelectorStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Restriction.Blacklisted.values().length];
            try {
                iArr[Restriction.Blacklisted.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Restriction.Blacklisted.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Restriction.DisabledByPrivacy.values().length];
            try {
                iArr2[Restriction.DisabledByPrivacy.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Restriction.DisabledByPrivacy.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Restriction.DisabledByPrivacy.Community.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CoauthorType.values().length];
            try {
                iArr3[CoauthorType.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CoauthorType.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CoauthorType.Community.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static tlo0 a(int i) {
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        return !com.vk.toggle.b.A.a(clipsFeatures) ? hq.b(tlo0.Companion, R.plurals.clips_coauthors_selected_text, i) : BuildInfo.q() ? tq.h(tlo0.Companion, R.string.clips_coauthors_selected_text_channels) : tq.h(tlo0.Companion, R.string.clips_coauthors_selected_text_authors);
    }

    public static tlo0.f b(ClipsCoauthorsSelectorMviState clipsCoauthorsSelectorMviState) {
        tlo0.a aVar;
        int i;
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        if (com.vk.toggle.b.A.a(clipsFeatures)) {
            return null;
        }
        ClipsCoauthorsSelectorMviState.Consumer j = clipsCoauthorsSelectorMviState.j();
        if (j instanceof ClipsCoauthorsSelectorMviState.Consumer.Posting) {
            aVar = tlo0.Companion;
            i = R.string.posting_coauthors_selection_header_subtitle;
        } else {
            if (!(j instanceof ClipsCoauthorsSelectorMviState.Consumer.Clips)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = tlo0.Companion;
            i = R.string.clips_coauthors_selection_header_subtitle;
        }
        return tq.h(aVar, i);
    }

    public static tlo0.f c() {
        tlo0.a aVar;
        int i;
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        if (com.vk.toggle.b.A.a(clipsFeatures)) {
            aVar = tlo0.Companion;
            i = R.string.clips_coauthors_selection_header_title_redesign;
        } else {
            aVar = tlo0.Companion;
            i = R.string.clips_coauthors_selection_header_title;
        }
        return tq.h(aVar, i);
    }

    public static w0h0 d(Set set, boolean z) {
        Integer num;
        boolean z2 = z || !set.isEmpty();
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        if (com.vk.toggle.b.A.a(clipsFeatures)) {
            Set set2 = set;
            if (!set2.isEmpty()) {
                num = Integer.valueOf(set2.size());
                return new w0h0(z2, num);
            }
        }
        num = null;
        return new w0h0(z2, num);
    }

    public static Set e(Set set) {
        Set<ClipsCoauthorSelectorUserItem> set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        for (ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem : set2) {
            arrayList.add(new tmd(clipsCoauthorSelectorUserItem.b, clipsCoauthorSelectorUserItem.c, clipsCoauthorSelectorUserItem.e, clipsCoauthorSelectorUserItem.d()));
        }
        return j5g.S0(arrayList);
    }
}
