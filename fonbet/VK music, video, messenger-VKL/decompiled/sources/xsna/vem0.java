package xsna;

import android.graphics.Bitmap;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.stats.tabs.StoryStatisticsTab;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.aem0;
import xsna.bhm0;
import xsna.hg1;
import xsna.nfm0;
import xsna.tlo0;

/* compiled from: StoryStatisticsFeature.kt */
/* loaded from: classes6.dex */
public final class vem0 extends wk50<khm0, chm0, aem0, nfm0> {
    public final anm0 f;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint g;
    public boolean h;
    public final f4z i;

    /* compiled from: StoryStatisticsFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StoryStatisticsTab.values().length];
            try {
                iArr[StoryStatisticsTab.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryStatisticsTab.VIEWERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryStatisticsTab.STICKERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StoryPrivacyType.values().length];
            try {
                iArr2[StoryPrivacyType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[StoryPrivacyType.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StoryPrivacyType.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vem0(int i, Bitmap bitmap, boolean z, List<? extends StoryEntry> list, jfm0 jfm0Var, int i2, anm0 anm0Var, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        super(r11, new igm0(new chm0(false, false, i, list, r5, r6, r7, (StoryPrivacyType) (z ? null : r1), z, i2)));
        Object obj;
        aem0.c cVar = aem0.c.b;
        List<? extends StoryEntry> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (StoryEntry storyEntry : list2) {
            Pair pair = new Pair(Integer.valueOf(storyEntry.c), Integer.valueOf(storyEntry.j));
            linkedHashMap.put(pair.i(), pair.j());
        }
        Pair pair2 = new Pair(Integer.valueOf(i), bitmap);
        EmptySet emptySet = EmptySet.b;
        Iterator<E> it = StoryPrivacyType.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String j = ((StoryPrivacyType) obj).j();
            StoryEntry storyEntry2 = (StoryEntry) j5g.b0(i, list);
            if (epx.f(j, storyEntry2 != null ? storyEntry2.x0 : null)) {
                break;
            }
        }
        this.f = anm0Var;
        this.g = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.i = new f4z();
        io.reactivex.rxjava3.subjects.f<oem0> fVar = jfm0Var.o().a;
        hg1.x3 x3Var = new hg1.x3();
        fVar.getClass();
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, x3Var).subscribe(new ux00(new fv90(this, 27), 22)));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(chm0 chm0Var, aem0 aem0Var) {
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType;
        int i;
        tlo0.f h;
        StoryEntry b;
        chm0 chm0Var2 = chm0Var;
        aem0 aem0Var2 = aem0Var;
        StoryPrivacyType storyPrivacyType = chm0Var2.i;
        int i2 = chm0Var2.d;
        if (aem0Var2 instanceof aem0.c) {
            return;
        }
        if (aem0Var2 instanceof aem0.g) {
            T(new nfm0.e(((aem0.g) aem0Var2).b));
            return;
        }
        if (aem0Var2 instanceof aem0.i) {
            T(new nfm0.b(((aem0.i) aem0Var2).b));
            return;
        }
        boolean z = aem0Var2 instanceof aem0.h;
        f4z f4zVar = this.i;
        if (z) {
            int i3 = ((aem0.h) aem0Var2).b;
            if (i3 == i2) {
                f4zVar.b(bhm0.a.a);
                return;
            } else {
                f4zVar.b(new bhm0.d(i3));
                return;
            }
        }
        if (aem0Var2 instanceof aem0.j) {
            if (!this.h) {
                anm0.d(this.f, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.SWITCH_STORIES_CAROUSEL, MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK, this.g, chm0Var2.b(), null, 48);
                this.h = true;
            }
            boolean z2 = ((aem0.j) aem0Var2).b;
            T(new nfm0.d(!z2));
            if (z2 || (b = chm0Var2.b()) == null) {
                return;
            }
            f4zVar.b(new bhm0.g(b));
            return;
        }
        if (aem0Var2 instanceof aem0.a) {
            int i4 = ((aem0.a) aem0Var2).b;
            if (i2 != i4) {
                T(new nfm0.a(i4));
                f4zVar.b(new bhm0.f(i4));
                return;
            }
            return;
        }
        if (aem0Var2 instanceof aem0.b) {
            f4zVar.b(bhm0.a.a);
            return;
        }
        if (aem0Var2 instanceof aem0.e) {
            anm0.d(this.f, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.GO_TO_SETTINGS, MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK, this.g, chm0Var2.b(), null, 48);
            f4zVar.b(bhm0.c.a);
            return;
        }
        if (aem0Var2 instanceof aem0.d) {
            anm0.d(this.f, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_ON_PRIVACY, MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK, this.g, chm0Var2.b(), null, 48);
            StoryEntry b2 = chm0Var2.b();
            if (b2 != null) {
                f4zVar.b(new bhm0.b(storyPrivacyType, b2.c));
                return;
            }
            return;
        }
        if (!(aem0Var2 instanceof aem0.k)) {
            if (!(aem0Var2 instanceof aem0.f)) {
                throw new NoWhenBranchMatchedException();
            }
            StoryStatisticsTab.a aVar = StoryStatisticsTab.Companion;
            int i5 = ((aem0.f) aem0Var2).b;
            aVar.getClass();
            StoryStatisticsTab a2 = StoryStatisticsTab.a.a(i5);
            int i6 = a2 == null ? -1 : a.$EnumSwitchMapping$0[a2.ordinal()];
            if (i6 == 1) {
                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.OPEN_ADVANCED_STATISTIC;
            } else if (i6 == 2) {
                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.OPEN_VIEWS_STATISTIC;
            } else if (i6 != 3) {
                return;
            } else {
                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.OPEN_STICKERS_STATISTIC;
            }
            anm0.d(this.f, eventType, MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK, this.g, chm0Var2.b(), null, 48);
            T(new nfm0.c(i5));
            return;
        }
        StoryPrivacyType storyPrivacyType2 = ((aem0.k) aem0Var2).b;
        if (storyPrivacyType != storyPrivacyType2) {
            StoryEntry b3 = chm0Var2.b();
            if (b3 != null) {
                b3.x0 = storyPrivacyType2.j();
                int i7 = a.$EnumSwitchMapping$1[storyPrivacyType2.ordinal()];
                if (i7 == 1) {
                    b3.p = false;
                    b3.w0 = false;
                    b3.K = false;
                } else if (i7 == 2) {
                    b3.p = false;
                    b3.w0 = false;
                    b3.K = true;
                } else if (i7 == 3) {
                    b3.p = false;
                    b3.w0 = true;
                    b3.K = true;
                }
            }
            int i8 = a.$EnumSwitchMapping$1[storyPrivacyType2.ordinal()];
            if (i8 == 1) {
                i = R.string.story_privacy_all;
            } else if (i8 == 2) {
                i = R.string.story_privacy_friends;
            } else {
                if (i8 != 3) {
                    h = null;
                    if (h != null) {
                        f4zVar.b(new bhm0.e(h));
                    }
                    f4zVar.b(new bhm0.h(i2));
                    T(new nfm0.g(storyPrivacyType2));
                }
                i = R.string.story_privacy_best_friends;
            }
            h = tq.h(tlo0.Companion, i);
            if (h != null) {
            }
            f4zVar.b(new bhm0.h(i2));
            T(new nfm0.g(storyPrivacyType2));
        }
    }
}
