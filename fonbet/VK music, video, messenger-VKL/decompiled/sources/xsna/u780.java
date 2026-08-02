package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioPlayMode;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OnMediaAudioProgressAnalytics.kt */
/* loaded from: classes4.dex */
public final class u780 {
    public Integer a;
    public long b;
    public long c;
    public int d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnMediaAudioProgressAnalytics.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PERCENT_100;
        public static final a PERCENT_25;
        public static final a PERCENT_50;
        public static final a PERCENT_75;
        public static final a PERCENT_95;
        private final int percent;

        static {
            a aVar = new a("PERCENT_25", 0, 25);
            PERCENT_25 = aVar;
            a aVar2 = new a("PERCENT_50", 1, 50);
            PERCENT_50 = aVar2;
            a aVar3 = new a("PERCENT_75", 2, 75);
            PERCENT_75 = aVar3;
            a aVar4 = new a("PERCENT_95", 3, 95);
            PERCENT_95 = aVar4;
            a aVar5 = new a("PERCENT_100", 4, 100);
            PERCENT_100 = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2) {
            this.percent = i2;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int i() {
            return this.percent;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnMediaAudioProgressAnalytics.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b SECONDS_10;
        public static final b SECONDS_3;
        private final long millis;

        static {
            b bVar = new b("SECONDS_3", 0, 3000L);
            SECONDS_3 = bVar;
            b bVar2 = new b("SECONDS_10", 1, 10000L);
            SECONDS_10 = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, long j) {
            this.millis = j;
        }

        public static zrp<b> h() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final long i() {
            return this.millis;
        }
    }

    /* compiled from: OnMediaAudioProgressAnalytics.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.SECONDS_3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SECONDS_10.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.PERCENT_25.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a.PERCENT_50.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.PERCENT_75.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[a.PERCENT_95.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[a.PERCENT_100.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static void a(MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        UiTrackingScreen b2 = UiTracker.j.b();
        new iid0(c2, SchemeStat$TypeAction.a.b(null, b2 != null ? b2.a : null, mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio, 1)).q();
    }

    public static void b(a aVar, MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem, String str) {
        MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype subtype;
        int i = c.$EnumSwitchMapping$1[aVar.ordinal()];
        if (i == 1) {
            subtype = MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype.PERCENT_25;
        } else if (i == 2) {
            subtype = MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype.PERCENT_50;
        } else if (i == 3) {
            subtype = MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype.PERCENT_75;
        } else if (i == 4) {
            subtype = MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype.PERCENT_95;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            subtype = MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype.PERCENT_100;
        }
        a(new MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio(mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, mobileOfficialAppsFeedStat$FeedPostAudioItem, subtype, str));
    }
}
