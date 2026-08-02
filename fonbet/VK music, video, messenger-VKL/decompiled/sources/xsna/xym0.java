package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* compiled from: SubscriptionNotifyInteractor.kt */
/* loaded from: classes2.dex */
public final class xym0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionNotifyInteractor.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C4057a Companion;
        public static final a FRIENDSHIP;
        public static final a NO_FRIENDSHIP;
        public static final a UNKNOWN;

        /* compiled from: SubscriptionNotifyInteractor.kt */
        /* renamed from: xsna.xym0$a$a, reason: collision with other inner class name */
        public static final class C4057a {
        }

        static {
            a aVar = new a("NO_FRIENDSHIP", 0);
            NO_FRIENDSHIP = aVar;
            a aVar2 = new a("FRIENDSHIP", 1);
            FRIENDSHIP = aVar2;
            a aVar3 = new a(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
            Companion = new C4057a();
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: SubscriptionNotifyInteractor.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NO_FRIENDSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FRIENDSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
