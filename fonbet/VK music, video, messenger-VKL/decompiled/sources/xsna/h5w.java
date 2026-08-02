package xsna;

import com.vk.dto.common.Source;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ImItemHistoryGetCmd.kt */
/* loaded from: classes2.dex */
public final class h5w extends le6<d5w> {
    public final i5w b;

    /* compiled from: ImItemHistoryGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h5w(i5w i5wVar) {
        this.b = i5wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d5w e(w2w w2wVar) {
        boolean z;
        int i;
        com.vk.im.engine.models.im_item.a meta;
        int a2;
        String obj;
        i5w i5wVar = this.b;
        int i2 = i5wVar.b;
        boolean z2 = i5wVar.d;
        wy1 wy1Var = i5wVar.a;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        b.d i3 = com.vk.toggle.b.A.i(ImFeatures.CHANNELS_IN_ALL_FOLDER);
        boolean z3 = false;
        if (i3 != null) {
            if (!i3.a) {
                i3 = null;
            }
            if (i3 != null && (obj = i3.c.toString()) != null) {
                z = cqm0.j(obj).optBoolean("clear_data_on_space");
                if (z && (meta = w2wVar.I0().j().getMeta()) != null) {
                    a2 = cq.a(w2wVar);
                    int j = w2wVar.I0().system().j();
                    if (meta.c >= a2 || meta.d < j) {
                        w2wVar.I0().u(new ifg(w2wVar, 23));
                    }
                }
                i = a.$EnumSwitchMapping$0[i5wVar.c.ordinal()];
                if (i != 1) {
                    return e5w.a.a(w2wVar, wy1Var, i2);
                }
                if (i != 2) {
                    if (i == 3) {
                        return k5w.c(w2wVar, wy1Var, i2, z2);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                d5w a3 = e5w.a.a(w2wVar, wy1Var, i2);
                if (a3.a.size() < i2 && a3.g) {
                    z3 = true;
                }
                return (z3 || !a3.c.isEmpty()) ? k5w.c(w2wVar, wy1Var, i2, z2) : a3;
            }
        }
        z = false;
        if (z) {
            a2 = cq.a(w2wVar);
            int j2 = w2wVar.I0().system().j();
            if (meta.c >= a2) {
            }
            w2wVar.I0().u(new ifg(w2wVar, 23));
        }
        i = a.$EnumSwitchMapping$0[i5wVar.c.ordinal()];
        if (i != 1) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5w) && epx.f(this.b, ((h5w) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ImItemHistoryGetCmd(args=" + this.b + ')';
    }
}
