package xsna;

import android.content.Context;

/* compiled from: CommunityProfileCoverActionSheetDelegate.kt */
/* loaded from: classes5.dex */
public final class hmh {
    public final Context a;
    public final o8 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityProfileCoverActionSheetDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ChangeCover;
        public static final a DeleteCover;
        public static final a OpenLiveCover;

        static {
            a aVar = new a("ChangeCover", 0);
            ChangeCover = aVar;
            a aVar2 = new a("DeleteCover", 1);
            DeleteCover = aVar2;
            a aVar3 = new a("OpenLiveCover", 2);
            OpenLiveCover = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
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
    }

    /* compiled from: CommunityProfileCoverActionSheetDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ChangeCover.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DeleteCover.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.OpenLiveCover.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hmh(Context context, o8 o8Var) {
        this.a = context;
        this.b = o8Var;
    }
}
