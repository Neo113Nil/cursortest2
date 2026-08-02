package xsna;

import com.vk.voip.ui.sessionrooms.SessionRoomsObserver;
import com.vk.voip.ui.sessionrooms.f;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.wwi0;

/* compiled from: SessionRoomsViewModel.kt */
/* loaded from: classes11.dex */
public final class kxi0 {
    public final io.reactivex.rxjava3.subjects.d<a> a = io.reactivex.rxjava3.subjects.d.O0(a.MAIN_CALL);
    public final io.reactivex.rxjava3.subjects.d<Collection<f.a.b>> b = io.reactivex.rxjava3.subjects.d.O0(EmptyList.b);
    public final io.reactivex.rxjava3.subjects.d<com.vk.voip.ui.sessionrooms.f> c = io.reactivex.rxjava3.subjects.d.O0(new com.vk.voip.ui.sessionrooms.f(null, false, false, null, false, false, false, 383));
    public final io.reactivex.rxjava3.subjects.d<com.vk.voip.ui.sessionrooms.f> d = io.reactivex.rxjava3.subjects.d.O0(new com.vk.voip.ui.sessionrooms.f(null, false, false, null, false, true, false, 383));
    public final io.reactivex.rxjava3.subjects.d<com.vk.voip.ui.sessionrooms.f> e = io.reactivex.rxjava3.subjects.d.O0(new com.vk.voip.ui.sessionrooms.f(null, false, false, null, false, false, false, 383));
    public final io.reactivex.rxjava3.subjects.d<com.vk.voip.ui.sessionrooms.f> f = io.reactivex.rxjava3.subjects.d.O0(new com.vk.voip.ui.sessionrooms.f(null, false, false, null, false, true, false, 383));
    public final io.reactivex.rxjava3.subjects.d<izs<f.a.b, Boolean>> g = io.reactivex.rxjava3.subjects.d.O0(new gxi0(0));
    public final io.reactivex.rxjava3.subjects.d<wwi0.a> h = io.reactivex.rxjava3.subjects.d.O0(new wwi0.a(0));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionRoomsViewModel.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADMIN_TRANSITION;
        public static final a MAIN_CALL;
        public static final a MAIN_CALL_ADMIN;
        public static final a ROOM;
        public static final a ROOM_ADMIN;
        public static final a TRANSITION;

        static {
            a aVar = new a("MAIN_CALL", 0);
            MAIN_CALL = aVar;
            a aVar2 = new a("MAIN_CALL_ADMIN", 1);
            MAIN_CALL_ADMIN = aVar2;
            a aVar3 = new a("ROOM", 2);
            ROOM = aVar3;
            a aVar4 = new a("ROOM_ADMIN", 3);
            ROOM_ADMIN = aVar4;
            a aVar5 = new a("TRANSITION", 4);
            TRANSITION = aVar5;
            a aVar6 = new a("ADMIN_TRANSITION", 5);
            ADMIN_TRANSITION = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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

    /* compiled from: SessionRoomsViewModel.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MAIN_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.MAIN_CALL_ADMIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ROOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.ROOM_ADMIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.ADMIN_TRANSITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.TRANSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SessionRoomsObserver.ObserveRoomsScope.values().length];
            try {
                iArr2[SessionRoomsObserver.ObserveRoomsScope.AVAILABLE_FOR_TRANSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SessionRoomsObserver.ObserveRoomsScope.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final io.reactivex.rxjava3.core.q<Collection<f.a.b>> a(SessionRoomsObserver.ObserveRoomsScope observeRoomsScope) {
        int i = b.$EnumSwitchMapping$1[observeRoomsScope.ordinal()];
        io.reactivex.rxjava3.subjects.d<Collection<f.a.b>> dVar = this.b;
        if (i == 1) {
            return io.reactivex.rxjava3.core.q.l(this.a, dVar, this.g, new qu50(new qci(6), 9));
        }
        if (i == 2) {
            return dVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
