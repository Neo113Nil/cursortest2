package xsna;

import android.graphics.PorterDuffColorFilter;
import androidx.annotation.Nullable;

/* compiled from: LottieValueCallback.java */
/* loaded from: classes12.dex */
public class a900<T> {
    public final p800<T> a;

    @Nullable
    public final PorterDuffColorFilter b;

    public a900() {
        this.a = new p800<>();
        this.b = null;
    }

    @Nullable
    public T a(p800<T> p800Var) {
        return (T) this.b;
    }

    @Nullable
    public final T b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        p800<T> p800Var = this.a;
        p800Var.a = f;
        p800Var.b = f2;
        p800Var.c = t;
        p800Var.d = t2;
        p800Var.e = f3;
        p800Var.f = f4;
        p800Var.g = f5;
        return a(p800Var);
    }

    public a900(@Nullable PorterDuffColorFilter porterDuffColorFilter) {
        this.a = new p800<>();
        this.b = porterDuffColorFilter;
    }
}
