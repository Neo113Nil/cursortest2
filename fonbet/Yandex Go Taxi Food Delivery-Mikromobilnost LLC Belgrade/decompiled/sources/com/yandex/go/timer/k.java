package com.yandex.go.timer;

import com.yandex.go.timer.api.TimerType;
import defpackage.avj0;
import defpackage.bvu0;
import defpackage.dez0;
import defpackage.dwh0;
import defpackage.evu0;
import defpackage.j73;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.w511;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.v;

/* loaded from: classes8.dex */
public final class k {
    public final zuj0 a;
    public final l b;

    public k(zuj0 zuj0Var, l lVar) {
        this.a = zuj0Var;
        this.b = lVar;
    }

    public static long a(long j, long j2) {
        return (j2 - j) / 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(String str) {
        List W;
        String str2;
        W = evu0.W(str, new String[]{":"}, (r2 & 4) != 0 ? 0 : 2);
        List list = W;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bvu0.l(10, (String) it.next()));
        }
        Integer num = (Integer) kotlin.collections.a.S(scc.f(arrayList) - 2, arrayList);
        zuj0 zuj0Var = this.a;
        String f = num != null ? ((avj0) zuj0Var).f(dwh0.date_format_in_hours, num.intValue()) : null;
        Integer num2 = (Integer) kotlin.collections.a.S(scc.f(arrayList) - 1, arrayList);
        if (num2 != null) {
            int intValue = num2.intValue();
            if ((f != null && !evu0.J(f)) || intValue != 0) {
                str2 = ((avj0) zuj0Var).f(dwh0.date_format_in_minutes, intValue);
                Integer num3 = (Integer) kotlin.collections.a.S(scc.f(arrayList), arrayList);
                List d0 = j73.d0(new CharSequence[]{f, str2, num3 != null ? ((avj0) zuj0Var).f(dwh0.date_format_in_seconds, num3.intValue()) : null});
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : d0) {
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence != null && !evu0.J(charSequence)) {
                        arrayList2.add(obj);
                    }
                }
                return kotlin.collections.a.X(arrayList2, null, null, null, null, 63);
            }
        }
        str2 = null;
        Integer num32 = (Integer) kotlin.collections.a.S(scc.f(arrayList), arrayList);
        if (num32 != null) {
        }
        List d02 = j73.d0(new CharSequence[]{f, str2, num32 != null ? ((avj0) zuj0Var).f(dwh0.date_format_in_seconds, num32.intValue()) : null});
        ArrayList arrayList22 = new ArrayList();
        while (r7.hasNext()) {
        }
        return kotlin.collections.a.X(arrayList22, null, null, null, null, 63);
    }

    public final f c(TimerType timerType, long j) {
        tpr dVar;
        int i = dez0.a[timerType.ordinal()];
        if (i == 1) {
            dVar = new d(new b(this.b.b, this, j));
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            dVar = d(j, false);
        }
        return new f(dVar, this);
    }

    public final j d(long j, boolean z) {
        return new j(com.yandex.go.coroutines.b.d(new v(new h(this.b.b, this, j), new TimerInteractorImpl$getUntilTypeTimerFlow$2(z, null)), new TimerInteractorImpl$getUntilTypeTimerFlow$$inlined$start$1(null, this, j)), z);
    }
}
