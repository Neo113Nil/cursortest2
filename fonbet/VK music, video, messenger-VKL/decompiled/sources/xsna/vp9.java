package xsna;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: CancelLongRequestsController.kt */
/* loaded from: classes8.dex */
public final class vp9 {
    public final uv20 a;
    public final tju b;
    public final cww c;
    public final int d;
    public final int e;
    public final pp9 f;
    public final op9 g;
    public final int h;
    public final bpn0 i;
    public final double j;
    public a k;

    /* compiled from: CancelLongRequestsController.kt */
    public static final class a {
        public final long a;
        public final int b;
        public final long c;
        public final long d;

        public a(int i, long j, long j2, long j3) {
            this.a = j;
            this.b = i;
            this.c = j2;
            this.d = j3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + bh10.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder a = eq0.a(this.b, "CancelStateHolder(loadTaskId=", ", newSelectedIndex=", this.a);
            tj0.d(a, ", bufferLevelWhenCancelActivatedMs=", this.c, ", elapsedMsWhenCancelWasActivated=");
            return efz.b(this.d, ")", a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CancelLongRequestsController.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b BY_BITRATE;
        public static final b BY_PERCENT;
        public static final a Companion;
        private static final b DEFAULT;
        private final String strVal;

        /* compiled from: CancelLongRequestsController.kt */
        public static final class a {
        }

        static {
            b bVar = new b("BY_PERCENT", 0, "by_percent");
            BY_PERCENT = bVar;
            b bVar2 = new b("BY_BITRATE", 1, "by_bitrate");
            BY_BITRATE = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
            Companion = new a();
            DEFAULT = bVar2;
        }

        public b(String str, int i, String str2) {
            this.strVal = str2;
        }

        public static zrp<b> j() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: CancelLongRequestsController.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BY_PERCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.BY_BITRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vp9(hw3 hw3Var, uv20 uv20Var, tju tjuVar, cww cwwVar, int i, int i2) {
        this.a = uv20Var;
        this.b = tjuVar;
        this.c = cwwVar;
        this.d = i;
        this.e = i2;
        pp9 pp9Var = (pp9) hw3Var.a;
        this.f = pp9Var;
        this.g = (op9) hw3Var.b;
        this.h = i2 - 1;
        this.i = new bpn0(new vv0(5));
        this.j = pp9Var.e;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final String a() {
        int i = this.d;
        return i == 2 ? SignalingProtocol.MEDIA_OPTION_VIDEO : i == 1 ? SignalingProtocol.MEDIA_OPTION_AUDIO : "UNKNOWM";
    }

    public final void b(gzs<String> gzsVar) {
        if (((Boolean) this.i.getValue()).booleanValue()) {
            gzsVar.invoke();
        }
    }

    public final float c(ccc cccVar) {
        float f;
        float f2;
        long j = cccVar.i.b;
        if (j == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        long j2 = cccVar.b.h;
        if (j2 <= 0) {
            f = this.f.f;
            f2 = 2;
        } else {
            f = j;
            f2 = j2;
        }
        return f / f2;
    }
}
