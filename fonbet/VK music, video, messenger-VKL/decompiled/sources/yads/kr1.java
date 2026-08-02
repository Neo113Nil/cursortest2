package yads;

import java.util.NoSuchElementException;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes10.dex */
public abstract class kr1 {
    public static ji2 a(String str, Exception exc) {
        ai2 ai2Var = exc instanceof TimeoutCancellationException ? ai2.d : exc instanceof IllegalArgumentException ? ai2.e : exc instanceof NoSuchElementException ? ai2.f : ai2.g;
        return ki2.a(str, ai2Var.b(), Integer.valueOf(ai2Var.a()));
    }

    public static ji2 a(String str) {
        ai2 ai2Var = ai2.f;
        return ki2.a(str, ai2Var.b(), Integer.valueOf(ai2Var.a()));
    }

    public static ji2 a() {
        ai2.f.b();
        return ki2.a();
    }
}
