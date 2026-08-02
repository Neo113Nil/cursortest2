package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ConfigureRoomParticipantsRenderer.kt */
/* loaded from: classes7.dex */
public final class i1j implements gm50 {
    public final p0j b;
    public final View c;
    public final s0j d;
    public final i4e e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public a r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConfigureRoomParticipantsRenderer.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FAILED;
        public static final a LOADING;
        public static final a OTHER;
        public static final a READY;

        static {
            a aVar = new a("LOADING", 0);
            LOADING = aVar;
            a aVar2 = new a("READY", 1);
            READY = aVar2;
            a aVar3 = new a(SignalingProtocol.HUNGUP_REASON_FAILED, 2);
            FAILED = aVar3;
            a aVar4 = new a(NativeAdContent.ViewTag.OTHER, 3);
            OTHER = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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

    /* compiled from: ConfigureRoomParticipantsRenderer.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i1j(p0j p0jVar, View view, s0j s0jVar, i4e i4eVar) {
        this.b = p0jVar;
        this.c = view;
        this.d = s0jVar;
        this.e = i4eVar;
        m2g m2gVar = new m2g(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, m2gVar);
        this.g = msy.a(lazyThreadSafetyMode, new sx0(this, 25));
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(this, 28));
        this.i = msy.a(lazyThreadSafetyMode, new v6(this, 27));
        this.j = msy.a(lazyThreadSafetyMode, new bih(this, 5));
        this.k = msy.a(lazyThreadSafetyMode, new h1j(this, 0));
        this.l = msy.a(lazyThreadSafetyMode, new wzh(this, 3));
        this.m = msy.a(lazyThreadSafetyMode, new l1i(this, 1));
        this.n = msy.a(lazyThreadSafetyMode, new fbh(this, 6));
        this.o = msy.a(lazyThreadSafetyMode, new dnh(this, 5));
        this.p = msy.a(lazyThreadSafetyMode, new kd(this, 29));
        this.q = msy.a(lazyThreadSafetyMode, new mag(this, 8));
        this.r = a.OTHER;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RecyclerView a() {
        return (RecyclerView) this.m.getValue();
    }

    public final void b(a aVar) {
        if (aVar == this.r) {
            return;
        }
        this.r = aVar;
        int i = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            zmp0.a((ViewGroup) this.c, new biq());
        }
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
