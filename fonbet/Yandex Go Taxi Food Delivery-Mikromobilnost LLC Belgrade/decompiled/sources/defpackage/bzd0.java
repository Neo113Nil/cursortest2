package defpackage;

import com.yandex.xplat.common.c;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* loaded from: classes2.dex */
public final class bzd0 implements g2e0, b1k0 {
    public final /* synthetic */ int a;
    public long b;

    public bzd0(String str, String str2) {
        long millis;
        this.a = 2;
        Date b = yuu.b(str);
        if (b != null) {
            Date b2 = yuu.b(str2 == null ? "" : str2);
            millis = b2 == null ? -2L : b.getTime() - b2.getTime();
        } else {
            Long m = bvu0.m(10, str);
            millis = m != null ? TimeUnit.SECONDS.toMillis(m.longValue()) : -1L;
        }
        this.b = millis;
    }

    @Override // defpackage.g2e0
    public long a(int i) {
        return c.a(Integer.valueOf(i)) * this.b;
    }

    public Object b(SuspendLambda suspendLambda) {
        Object j = a.j(this.b, suspendLambda);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : zy11.a;
    }

    @Override // defpackage.b1k0
    public long d() {
        switch (this.a) {
        }
        return this.b;
    }

    public bzd0(o450 o450Var) {
        this.a = 4;
        this.b = c.a(0);
    }

    public /* synthetic */ bzd0(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
