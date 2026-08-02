package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAwayItem;
import com.vk.stat.scheme.SchemeStat$TypeBackgroundItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.el3;
import xsna.iy50;

/* compiled from: UiNotifyManager.kt */
/* loaded from: classes.dex */
public final class uzp0 {
    public static final UiTrackingScreen k = new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD);
    public boolean d;
    public UiTracker.AwayParams e;
    public hy6 i;
    public final fsk0 a = qsk0.a;
    public a b = a.NONE;
    public b c = b.HIDDEN;
    public final el3<j0q0> f = new el3<>(0);
    public final n1q0 g = new n1q0();
    public final fp01 h = new fp01();
    public final CopyOnWriteArrayList<m1q0> j = new CopyOnWriteArrayList<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UiNotifyManager.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a APP_START;
        public static final a LINK;
        public static final a NONE;
        public static final a PUSH;
        public static final a SYSTEM;

        static {
            a aVar = new a("APP_START", 0);
            APP_START = aVar;
            a aVar2 = new a("PUSH", 1);
            PUSH = aVar2;
            a aVar3 = new a("SYSTEM", 2);
            SYSTEM = aVar3;
            a aVar4 = new a("LINK", 3);
            LINK = aVar4;
            a aVar5 = new a("NONE", 4);
            NONE = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UiNotifyManager.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b HIDDEN;
        public static final b SHOWN;
        public static final b WAIT_FOR_VALID_SCREEN;

        static {
            b bVar = new b("WAIT_FOR_VALID_SCREEN", 0);
            WAIT_FOR_VALID_SCREEN = bVar;
            b bVar2 = new b("SHOWN", 1);
            SHOWN = bVar2;
            b bVar3 = new b("HIDDEN", 2);
            HIDDEN = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: UiNotifyManager.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.APP_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UiTracker.AwayParams.Type.values().length];
            try {
                iArr2[UiTracker.AwayParams.Type.EXTERNAL_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UiTracker.AwayParams.Type.EXTERNAL_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UiTracker.AwayParams.Type.VKME.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[UiTracker.AwayParams.Type.VKAPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[UiTracker.AwayParams.Type.NOTIFICATIONS_SETTINGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[UiTracker.AwayParams.Type.VOICE_SEARCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final void a(UiTracker.AwayParams awayParams) {
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen == null) {
            L.G("track away with empty from param!");
            return;
        }
        UiTrackingScreen.Companion companion = UiTrackingScreen.j;
        UiTrackingScreen b2 = UiTrackingScreen.Companion.b(companion);
        b2.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.EXTERNAL_APP, null, null, null, null, null, 62, null);
        switch (c.$EnumSwitchMapping$1[awayParams.b().ordinal()]) {
            case 1:
            case 4:
                break;
            case 2:
                b2.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.BROWSER, 0L, 0L, awayParams.c(), null, null, 48, null);
                break;
            case 3:
                b2.a = MobileOfficialAppsCoreNavStat$EventScreen.IM;
                break;
            case 5:
                b2.a = MobileOfficialAppsCoreNavStat$EventScreen.SYSTEM_NOTIFICATIONS_SETTINGS;
                break;
            case 6:
                b2.a = MobileOfficialAppsCoreNavStat$EventScreen.SYSTEM_VOICE_SEARCH;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (UiTracker.AwayParams.Type.VKAPP == awayParams.b()) {
            uiTrackingScreen = new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.IM);
        }
        iy50 iy50Var = new iy50(this.a);
        iy50Var.K(uiTrackingScreen.f());
        MobileOfficialAppsCoreNavStat$EventScreen a2 = b2.f().a();
        SchemeStat$EventItem c2 = b2.f().c();
        SchemeStat$TypeAwayItem a3 = awayParams.a();
        iy50Var.E(new iy50.a(a2, c2, a3 != null ? e43.a(a3) : null));
        iy50Var.v();
        iy50Var.q();
        b(uiTrackingScreen, UiTrackingScreen.Companion.b(companion));
    }

    public final void b(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
        Iterator<m1q0> it = this.j.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(UiTrackingScreen.b(uiTrackingScreen, null, null, 15), UiTrackingScreen.b(uiTrackingScreen2, null, null, 15));
            } catch (NullPointerException e) {
                L.i(e);
            }
        }
    }

    public final boolean c(UiTrackingScreen uiTrackingScreen) {
        String s;
        UiTrackingScreen a2;
        if (this.d || uiTrackingScreen.e()) {
            return false;
        }
        this.e = null;
        this.h.getClass();
        s = Preference.s("ui_tracking_store", "last_activity_screen", new String());
        try {
            try {
                a2 = new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.valueOf(s));
            } finally {
                Preference.C("ui_tracking_store", "last_activity_screen");
            }
        } catch (Throwable unused) {
            a2 = com.vk.core.ui.tracking.c.a(s);
        }
        long m = Preference.m(0L, "ui_tracking_store", "last_activity_timestamp");
        Preference.C("ui_tracking_store", "last_activity_timestamp");
        Pair pair = new Pair(a2, Long.valueOf(m));
        UiTrackingScreen uiTrackingScreen2 = (UiTrackingScreen) pair.i();
        long longValue = ((Number) pair.j()).longValue();
        boolean e = uiTrackingScreen2.e();
        fsk0 fsk0Var = this.a;
        UiTrackingScreen uiTrackingScreen3 = k;
        if (!e && longValue > 0) {
            iy50 iy50Var = new iy50(fsk0Var);
            iy50Var.K(uiTrackingScreen2.f());
            iy50Var.E(uiTrackingScreen3.f());
            iy50Var.w();
            iy50Var.I(longValue);
            iy50Var.q();
            b(uiTrackingScreen2, uiTrackingScreen3);
        }
        iy50 iy50Var2 = new iy50(fsk0Var);
        iy50Var2.E(uiTrackingScreen.f());
        iy50Var2.K(new iy50.a(uiTrackingScreen3.a));
        int i = c.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            iy50Var2.C();
        } else if (i == 2) {
            iy50Var2.D();
        } else if (i == 3) {
            iy50Var2.B();
        } else {
            if (i != 4) {
                L.G("UiTracker", "Can't handle APP_START event. App is already started");
                return false;
            }
            iy50Var2.A();
        }
        iy50Var2.q();
        b(uiTrackingScreen3, uiTrackingScreen);
        this.d = true;
        this.b = a.APP_START;
        return true;
    }

    public final boolean d(UiTrackingScreen uiTrackingScreen) {
        if (uiTrackingScreen.e()) {
            return false;
        }
        Collection b2 = uiTrackingScreen.f().b();
        if (b2 == null) {
            b2 = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        el3<j0q0> el3Var = this.f;
        el3Var.getClass();
        el3.a aVar = new el3.a();
        while (aVar.hasNext()) {
            SchemeStat$TypeBackgroundItem.b a2 = ((j0q0) aVar.next()).a();
            SchemeStat$TypeBackgroundItem a3 = a2 == null ? null : SchemeStat$TypeBackgroundItem.a.a(false, a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        ArrayList u0 = j5g.u0(arrayList, b2);
        iy50 iy50Var = new iy50(this.a);
        UiTrackingScreen uiTrackingScreen2 = k;
        iy50Var.K(uiTrackingScreen2.f());
        MobileOfficialAppsCoreNavStat$EventScreen a4 = uiTrackingScreen.f().a();
        SchemeStat$EventItem c2 = uiTrackingScreen.f().c();
        x8h0[] x8h0VarArr = (x8h0[]) u0.toArray(new x8h0[0]);
        iy50Var.E(new iy50.a(a4, c2, e43.a(Arrays.copyOf(x8h0VarArr, x8h0VarArr.length))));
        int i = c.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            iy50Var.C();
        } else if (i == 2) {
            iy50Var.D();
        } else if (i == 3) {
            iy50Var.B();
        } else {
            if (i == 4) {
                L.G("UiTracker", "Can't handle SHOW event, app is not started");
                return false;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            iy50Var.z();
        }
        iy50Var.q();
        b(uiTrackingScreen2, uiTrackingScreen);
        return true;
    }
}
