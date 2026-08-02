package xsna;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;
import xsna.ogo;
import xsna.q630;

/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class m0k0 {
    public static final m0k0 a = new m0k0();

    /* compiled from: Slider.kt */
    @b6l(c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", f = "Slider.kt", l = {1216}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ SnapshotStateList<vax> $interactions;
        int label;

        /* compiled from: Slider.kt */
        /* renamed from: xsna.m0k0$a$a, reason: collision with other inner class name */
        public static final class C3315a<T> implements lsr {
            public final /* synthetic */ SnapshotStateList<vax> b;

            public C3315a(SnapshotStateList<vax> snapshotStateList) {
                this.b = snapshotStateList;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                vax vaxVar = (vax) obj;
                boolean z = vaxVar instanceof o2d0.b;
                SnapshotStateList<vax> snapshotStateList = this.b;
                if (z) {
                    snapshotStateList.add(vaxVar);
                } else if (vaxVar instanceof o2d0.c) {
                    snapshotStateList.remove(((o2d0.c) vaxVar).a);
                } else if (vaxVar instanceof o2d0.a) {
                    snapshotStateList.remove(((o2d0.a) vaxVar).a);
                } else if (vaxVar instanceof ogo.b) {
                    snapshotStateList.add(vaxVar);
                } else if (vaxVar instanceof ogo.c) {
                    snapshotStateList.remove(((ogo.c) vaxVar).a);
                } else if (vaxVar instanceof ogo.a) {
                    snapshotStateList.remove(((ogo.a) vaxVar).a);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sg50 sg50Var, SnapshotStateList<vax> snapshotStateList, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$interactionSource = sg50Var;
            this.$interactions = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$interactionSource, this.$interactions, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                caj0 b = this.$interactionSource.b();
                C3315a c3315a = new C3315a(this.$interactions);
                this.label = 1;
                b.getClass();
                if (caj0.k(b, c3315a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    static {
        float f = h1k0.o;
        androidx.compose.ui.graphics.b.a();
    }

    public static i0k0 b(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1107)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
        }
        t7g t7gVar = (t7g) aVar.r(u7g.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        i0k0 d = d(t7gVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return d;
    }

    public static i0k0 c(long j, long j2, long j3, androidx.compose.runtime.a aVar, int i) {
        long j4 = l5g.k;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(885588574, i, 6, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1149)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
        }
        t7g t7gVar = (t7g) aVar.r(u7g.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        i0k0 d = d(t7gVar);
        long j5 = j != 16 ? j : d.a;
        long j6 = j2 != 16 ? j2 : d.b;
        long j7 = j4 != 16 ? j4 : d.c;
        long j8 = j3 != 16 ? j3 : d.d;
        long j9 = j4 != 16 ? j4 : d.e;
        long j10 = j4 != 16 ? j4 : d.f;
        long j11 = j4 != 16 ? j4 : d.g;
        long j12 = j4 != 16 ? j4 : d.h;
        long j13 = j4 != 16 ? j4 : d.i;
        if (j4 == 16) {
            j4 = d.j;
        }
        i0k0 i0k0Var = new i0k0(j5, j6, j7, j8, j9, j10, j11, j12, j13, j4);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return i0k0Var;
    }

    public static i0k0 d(t7g t7gVar) {
        i0k0 i0k0Var = t7gVar.Z;
        if (i0k0Var != null) {
            return i0k0Var;
        }
        long b = u7g.b(t7gVar, h1k0.i);
        ColorSchemeKeyTokens colorSchemeKeyTokens = h1k0.b;
        long b2 = u7g.b(t7gVar, colorSchemeKeyTokens);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = h1k0.m;
        long b3 = u7g.b(t7gVar, colorSchemeKeyTokens2);
        long b4 = u7g.b(t7gVar, colorSchemeKeyTokens2);
        long b5 = u7g.b(t7gVar, colorSchemeKeyTokens);
        long i = f870.i(l5g.c(14, u7g.b(t7gVar, h1k0.e), h1k0.f), t7gVar.p);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = h1k0.c;
        long b6 = u7g.b(t7gVar, colorSchemeKeyTokens3);
        float f = h1k0.d;
        long c = l5g.c(14, b6, f);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = h1k0.g;
        long b7 = u7g.b(t7gVar, colorSchemeKeyTokens4);
        float f2 = h1k0.h;
        i0k0 i0k0Var2 = new i0k0(b, b2, b3, b4, b5, i, c, l5g.c(14, b7, f2), l5g.c(14, u7g.b(t7gVar, colorSchemeKeyTokens4), f2), l5g.c(14, u7g.b(t7gVar, colorSchemeKeyTokens3), f));
        t7gVar.Z = i0k0Var2;
        return i0k0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final sg50 sg50Var, q630 q630Var, final i0k0 i0k0Var, boolean z, long j, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        boolean z2;
        int i6;
        long j2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-290277409);
        if ((i & 6) == 0) {
            i3 = (M.J(sg50Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i3 | (!M.J(i0k0Var) ? 256 : 128);
            i5 = i2 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= M.l(z2) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    j2 = j;
                    i4 |= M.p(j2) ? 16384 : 8192;
                    if (M.t(i4 & 1, (i4 & 74899) == 74898)) {
                        M.h();
                    } else {
                        M.V();
                        if ((i & 1) == 0 || M.i()) {
                            if (i7 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if (i6 != 0) {
                                j2 = x0k0.c;
                            }
                        } else {
                            M.h();
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-290277409, i4, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                        }
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = new SnapshotStateList();
                            M.R(x);
                        }
                        SnapshotStateList snapshotStateList = (SnapshotStateList) x;
                        int i8 = i4 & 14;
                        boolean z3 = i8 == 4;
                        Object x2 = M.x();
                        if (z3 || x2 == c0012a) {
                            x2 = new a(sg50Var, snapshotStateList, null);
                            M.R(x2);
                        }
                        bap.g(sg50Var, (wzs) x2, M, i8);
                        f9t.e(hr80.m(pgv.a(txj0.r(!snapshotStateList.isEmpty() ? (Float.floatToRawIntBits(uco.c(j2) / 2) << 32) | (Float.floatToRawIntBits(uco.b(j2)) & 4294967295L) : j2, q630Var2), sg50Var), z2 ? i0k0Var.a : i0k0Var.f, p6j0.a(h1k0.k, M)), M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                    final q630 q630Var3 = q630Var2;
                    final boolean z4 = z2;
                    final long j3 = j2;
                    s = M.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.l0k0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                m0k0.this.a(sg50Var, q630Var3, i0k0Var, z4, j3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                j2 = j;
                if (M.t(i4 & 1, (i4 & 74899) == 74898)) {
                }
                final q630 q630Var32 = q630Var2;
                final boolean z42 = z2;
                final long j32 = j2;
                s = M.s();
                if (s == null) {
                }
            }
            z2 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            j2 = j;
            if (M.t(i4 & 1, (i4 & 74899) == 74898)) {
            }
            final q630 q630Var322 = q630Var2;
            final boolean z422 = z2;
            final long j322 = j2;
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i3 | (!M.J(i0k0Var) ? 256 : 128);
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        j2 = j;
        if (M.t(i4 & 1, (i4 & 74899) == 74898)) {
        }
        final q630 q630Var3222 = q630Var2;
        final boolean z4222 = z2;
        final long j3222 = j2;
        s = M.s();
        if (s == null) {
        }
    }
}
