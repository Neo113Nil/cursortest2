package xsna;

import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WebAppNotificationBridge.kt */
/* loaded from: classes11.dex */
public final class zex0 {
    public final p870 a;
    public final bpn0 b = new bpn0(new rwe(18));
    public final bpn0 c = new bpn0(new hb8(17));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebAppNotificationBridge.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NEWS_FEED;
        public static final a STORY;

        static {
            a aVar = new a("STORY", 0);
            STORY = aVar;
            a aVar2 = new a("NEWS_FEED", 1);
            NEWS_FEED = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
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

    /* compiled from: WebAppNotificationBridge.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NEWS_FEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.STORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zex0(p870 p870Var) {
        this.a = p870Var;
    }

    public final p870 a(a aVar) {
        int i = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1) {
            ce60.b.getClass();
            return p870.f();
        }
        if (i == 2) {
            return this.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final HashMap<Object, bd70<?>> b(a aVar) {
        int i = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1) {
            return (HashMap) this.c.getValue();
        }
        if (i == 2) {
            return (HashMap) this.b.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void c() {
        t6g0 t6g0Var = t6g0.b;
        t6g0.b().a();
    }
}
