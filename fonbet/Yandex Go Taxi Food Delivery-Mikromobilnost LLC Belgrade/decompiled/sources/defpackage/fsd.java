package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class fsd implements urq0 {
    public final ImmutableList a;
    public long b;

    public fsd(List list, List list2) {
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        d6z.l(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            aVar.a(new esd((urq0) list.get(i), (List) list2.get(i)));
        }
        this.a = aVar.g();
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.urq0
    public final long g() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                break;
            }
            esd esdVar = (esd) immutableList.get(i);
            long g = esdVar.a.g();
            ImmutableList immutableList2 = esdVar.b;
            if ((immutableList2.contains(1) || immutableList2.contains(2) || immutableList2.contains(4)) && g != Long.MIN_VALUE) {
                j = Math.min(j, g);
            }
            if (g != Long.MIN_VALUE) {
                j2 = Math.min(j2, g);
            }
            i++;
        }
        if (j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            this.b = j;
            return j;
        }
        if (j2 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.urq0
    public final void h(long j) {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                return;
            }
            ((esd) immutableList.get(i)).h(j);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.urq0
    public final long i() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                break;
            }
            long i2 = ((esd) immutableList.get(i)).a.i();
            if (i2 != Long.MIN_VALUE) {
                j = Math.min(j, i2);
            }
            i++;
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.urq0
    public final boolean isLoading() {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                return false;
            }
            if (((esd) immutableList.get(i)).a.isLoading()) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        boolean z;
        boolean z2 = false;
        do {
            long i = i();
            if (i == Long.MIN_VALUE) {
                return z2;
            }
            int i2 = 0;
            z = false;
            while (true) {
                ImmutableList immutableList = this.a;
                if (i2 >= immutableList.size()) {
                    break;
                }
                long i3 = ((esd) immutableList.get(i2)).a.i();
                boolean z3 = i3 != Long.MIN_VALUE && i3 <= xzyVar.a;
                if (i3 == i || z3) {
                    z |= ((esd) immutableList.get(i2)).a.n(xzyVar);
                }
                i2++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
