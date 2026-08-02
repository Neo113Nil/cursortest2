package xsna;

import androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.random.Random;
import kotlin.random.XorWowRandom;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: CastConfig.kt */
/* loaded from: classes11.dex */
public final class qz9 implements pok0 {
    public static rz9 a;

    public static final XorWowRandom b(long j) {
        return new XorWowRandom((int) j, (int) (j >> 32));
    }

    public static final String c(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final FlowUtil$createFlow$$inlined$map$1 d(RoomDatabase roomDatabase, boolean z, String[] strArr, izs izsVar) {
        androidx.room.e eVar = roomDatabase.g;
        if (eVar == null) {
            eVar = null;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        sqp0 sqp0Var = eVar.c;
        Pair<String[], int[]> g = sqp0Var.g(strArr2);
        String[] d = g.d();
        ksr izg0Var = new izg0(new uqp0(sqp0Var, g.g(), true, d, null));
        androidx.room.g gVar = eVar.j;
        MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1 a2 = gVar != null ? gVar.a(d) : null;
        if (a2 != null) {
            ksr[] ksrVarArr = {izg0Var, a2};
            int i = mtr.a;
            izg0Var = new d1b(rl3.C(ksrVarArr), EmptyCoroutineContext.b, -2, BufferOverflow.SUSPEND);
        }
        return new FlowUtil$createFlow$$inlined$map$1(rsr.h(izg0Var, -1), roomDatabase, z, izsVar);
    }

    public static final long e(Random random, q500 q500Var) {
        if (!q500Var.isEmpty()) {
            return q500Var.e() < Long.MAX_VALUE ? random.o(q500Var.d(), q500Var.e() + 1) : q500Var.d() > Long.MIN_VALUE ? random.o(q500Var.d() - 1, q500Var.e()) + 1 : random.m();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + q500Var);
    }

    public static void f(yuj0 yuj0Var, izs izsVar) {
        yuj0Var.a(new fwj0(ywp.a, izsVar));
    }

    public static final Pair g(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    @Override // xsna.pok0
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }
}
