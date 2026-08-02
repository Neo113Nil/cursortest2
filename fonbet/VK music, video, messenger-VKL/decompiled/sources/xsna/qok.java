package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: CustomTarget.java */
/* loaded from: classes12.dex */
public abstract class qok<T> implements u3o0<T> {
    public final int b;
    public final int c;

    @Nullable
    public f7g0 d;

    public qok() {
        if (!s2r0.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
    }

    @Override // xsna.u3o0
    @Nullable
    public final f7g0 b() {
        return this.d;
    }

    @Override // xsna.u3o0
    public final void e(@NonNull svj0 svj0Var) {
        svj0Var.k(this.b, this.c);
    }

    @Override // xsna.u3o0
    public final void h(@Nullable f7g0 f7g0Var) {
        this.d = f7g0Var;
    }

    @Override // xsna.u3o0
    public final void a() {
    }

    @Override // xsna.c5z
    public final void onDestroy() {
    }

    @Override // xsna.c5z
    public final void onStart() {
    }

    @Override // xsna.c5z
    public final void onStop() {
    }
}
