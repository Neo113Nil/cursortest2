package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.groups.ManagedGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ManagedGroupsGetAllCmd.kt */
/* loaded from: classes2.dex */
public final class oi00 extends le6<List<? extends ManagedGroup>> {
    public final Source b;
    public final boolean c;

    /* compiled from: ManagedGroupsGetAllCmd.kt */
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

    public oi00(int i, Source source) {
        boolean z = (i & 2) == 0;
        this.b = source;
        this.c = z;
    }

    @Override // xsna.le6
    public final List<? extends ManagedGroup> e(w2w w2wVar) {
        List<ManagedGroup> all;
        boolean z = !w2wVar.I0().l().a();
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            all = w2wVar.I0().l().getAll();
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            w2wVar.I0().l().e((List) bz2.c(new ni00(this.c), "ManagedGroupsGetAllApiCmd"));
            all = w2wVar.I0().l().getAll();
        }
        if (!z) {
            return all;
        }
        ArrayList arrayList = new ArrayList(c5g.u(all, 10));
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            arrayList.add(ManagedGroup.a((ManagedGroup) it.next(), true, 0, 447));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi00)) {
            return false;
        }
        oi00 oi00Var = (oi00) obj;
        return this.b == oi00Var.b && this.c == oi00Var.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedGroupsGetAllCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return n23.b(sb, this.c, ", changerTag=null)");
    }
}
