package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class i5h {
    public final y8z0 a;
    public ImmutableList b = ImmutableList.p();
    public ImmutableMap c = ImmutableMap.f();
    public sf10 d;
    public sf10 e;
    public sf10 f;

    public i5h(y8z0 y8z0Var) {
        this.a = y8z0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sf10 b(zxc0 zxc0Var, ImmutableList immutableList, sf10 sf10Var, y8z0 y8z0Var) {
        a9z0 currentTimeline = zxc0Var.getCurrentTimeline();
        int currentPeriodIndex = zxc0Var.getCurrentPeriodIndex();
        Object m = currentTimeline.q() ? null : currentTimeline.m(currentPeriodIndex);
        int b = (zxc0Var.isPlayingAd() || currentTimeline.q()) ? -1 : currentTimeline.g(currentPeriodIndex, y8z0Var, false).b(tw21.W(zxc0Var.getCurrentPosition()) - y8z0Var.e);
        for (int i = 0; i < immutableList.size(); i++) {
            sf10 sf10Var2 = (sf10) immutableList.get(i);
            if (c(sf10Var2, m, zxc0Var.isPlayingAd(), zxc0Var.getCurrentAdGroupIndex(), zxc0Var.getCurrentAdIndexInAdGroup(), b)) {
                return sf10Var2;
            }
        }
        if (immutableList.isEmpty() && sf10Var != null && c(sf10Var, m, zxc0Var.isPlayingAd(), zxc0Var.getCurrentAdGroupIndex(), zxc0Var.getCurrentAdIndexInAdGroup(), b)) {
            return sf10Var;
        }
        return null;
    }

    public static boolean c(sf10 sf10Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = sf10Var.a;
        int i4 = sf10Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && sf10Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && sf10Var.e == i3;
    }

    public final void a(ImmutableMap.a aVar, sf10 sf10Var, a9z0 a9z0Var) {
        if (sf10Var == null) {
            return;
        }
        if (a9z0Var.b(sf10Var.a) != -1) {
            aVar.b(sf10Var, a9z0Var);
            return;
        }
        a9z0 a9z0Var2 = (a9z0) this.c.get(sf10Var);
        if (a9z0Var2 != null) {
            aVar.b(sf10Var, a9z0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(a9z0 a9z0Var) {
        ImmutableList immutableList;
        ImmutableMap.a aVar = new ImmutableMap.a();
        if (this.b.isEmpty()) {
            a(aVar, this.e, a9z0Var);
            if (!Objects.equals(this.f, this.e)) {
                a(aVar, this.f, a9z0Var);
            }
            if (!Objects.equals(this.d, this.e) && !Objects.equals(this.d, this.f)) {
                a(aVar, this.d, a9z0Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = this.b.size();
                immutableList = this.b;
                if (i >= size) {
                    break;
                }
                a(aVar, (sf10) immutableList.get(i), a9z0Var);
                i++;
            }
            if (!immutableList.contains(this.d)) {
                a(aVar, this.d, a9z0Var);
            }
        }
        this.c = aVar.a();
    }
}
