package xsna;

import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: UIBlockProfileTimeCache.kt */
/* loaded from: classes5.dex */
public final class nwp0 {
    public final long a;
    public final io.reactivex.rxjava3.subjects.f<UIBlockProfile> b;
    public final io.reactivex.rxjava3.internal.operators.observable.x1 c;
    public Map<UserId, UIBlockProfile> d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UIBlockProfileTimeCache.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADD;
        public static final a REMOVE;

        static {
            a aVar = new a("ADD", 0);
            ADD = aVar;
            a aVar2 = new a(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1);
            REMOVE = aVar2;
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

    /* compiled from: UIBlockProfileTimeCache.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nwp0(long j) {
        io.reactivex.rxjava3.core.w d = asu0.a.d();
        this.a = j;
        io.reactivex.rxjava3.subjects.f<UIBlockProfile> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = fVar.L(new mau(new owp0(1, this, nwp0.class, "getBlockCacheActionsWithTimer", "getBlockCacheActionsWithTimer(Lcom/vk/catalog2/common/dto/ui/profile/UIBlockProfile;)Lio/reactivex/rxjava3/core/Observable;", 0), 16), false).a0(d);
        hhj0 hhj0Var = new hhj0(new pwp0(2, this, nwp0.class, "applyCacheAction", "applyCacheAction(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;", 0), 3);
        jgp jgpVar = jgp.b;
        io.reactivex.rxjava3.internal.operators.observable.f2 j0 = a0.j0(jgpVar, hhj0Var);
        t6m0 t6m0Var = new t6m0(new pod0(this, 17), 3);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        this.c = new io.reactivex.rxjava3.internal.operators.observable.c0(j0.E(t6m0Var, lVar, kVar, kVar), lVar, new g50(this, 4)).k0();
        this.d = jgpVar;
    }
}
