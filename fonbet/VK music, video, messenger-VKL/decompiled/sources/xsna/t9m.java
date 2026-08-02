package xsna;

import com.vk.dto.common.Source;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DialogAppearanceGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class t9m extends le6<List<? extends x9m>> {
    public final List<String> b;
    public final Source c;
    public final boolean d;

    /* compiled from: DialogAppearanceGetByIdCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.ACTUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public t9m(List<String> list, Source source, boolean z) {
        this.b = list;
        this.c = source;
        this.d = z;
    }

    @Override // xsna.le6
    public final List<? extends x9m> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        boolean z = this.d;
        List<String> list = this.b;
        if (i != 1) {
            if (i == 2) {
                return w2wVar.I0().t().d(list);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d370.D(w2wVar, list, z);
            return w2wVar.I0().t().d(list);
        }
        z9m t = w2wVar.I0().t();
        if (t.d(list).size() == list.size() && t.f()) {
            return w2wVar.I0().t().d(list);
        }
        d370.D(w2wVar, list, z);
        return w2wVar.I0().t().d(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9m)) {
            return false;
        }
        t9m t9mVar = (t9m) obj;
        return epx.f(this.b, t9mVar.b) && this.c == t9mVar.c && this.d == t9mVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAppearanceGetByIdCmd(ids=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
