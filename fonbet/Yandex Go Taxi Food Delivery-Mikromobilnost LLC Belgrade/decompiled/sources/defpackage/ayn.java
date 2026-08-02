package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Layn;", "Lw96;", "Companion", "zxn", "yxn", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ayn extends w96 {
    public static final zxn Companion = new zxn();
    public static final ayn h = new ayn(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ ayn(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z4;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z5;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z6;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ayn(int i) {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
    }

    public ayn() {
        this(0);
    }
}
