package xsna;

import com.vkontakte.android.R;

/* compiled from: UserProfileLegoRelationsContextMenu.kt */
/* loaded from: classes5.dex */
public final class frq0 {
    public static final int a = cn70.b(10);

    /* compiled from: UserProfileLegoRelationsContextMenu.kt */
    public static final class a {
        public final int hashCode() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserProfileLegoRelationsContextMenu.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b HideNews;
        public static final b ShowNews;
        public static final b Unfollow;
        public static final b Unfriend;
        private final int titleRes;

        static {
            b bVar = new b("Unfriend", 0, R.string.user_profile_delete_friend);
            Unfriend = bVar;
            b bVar2 = new b("Unfollow", 1, R.string.user_profile_unfollow);
            Unfollow = bVar2;
            b bVar3 = new b("HideNews", 2, R.string.user_profile_hide_user_news);
            HideNews = bVar3;
            b bVar4 = new b("ShowNews", 3, R.string.user_profile_show_user_news);
            ShowNews = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, int i2) {
            this.titleRes = i2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int h() {
            return this.titleRes;
        }
    }

    /* compiled from: UserProfileLegoRelationsContextMenu.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Unfriend.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Unfollow.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.HideNews.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.ShowNews.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
