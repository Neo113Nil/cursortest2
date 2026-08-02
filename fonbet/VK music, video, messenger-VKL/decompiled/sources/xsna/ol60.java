package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedHolderUiDto.kt */
/* loaded from: classes4.dex */
public abstract class ol60 {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ea60 f;
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new m960(this, 1));

    public ol60(int i, int i2, int i3, int i4, ea60 ea60Var) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = ea60Var;
    }

    public int f() {
        return this.d;
    }

    public final int g() {
        return this.b;
    }

    public int h() {
        return this.c;
    }
}
