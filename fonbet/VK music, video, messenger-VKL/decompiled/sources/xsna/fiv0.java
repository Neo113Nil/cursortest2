package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.chromium.net.NetError;
import xsna.cri;
import xsna.dt1;
import xsna.o2d0;
import xsna.q630;
import xsna.tlh0;

/* compiled from: VkSearch.kt */
/* loaded from: classes17.dex */
public final class fiv0 {

    /* compiled from: VkSearch.kt */
    @b6l(c = "com.vk.core.compose.component.search.VkSearchKt$VkSearch$3$1", f = "VkSearch.kt", l = {146}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ gzs<s3q0> $onSearchClicked;
        int label;

        /* compiled from: VkSearch.kt */
        /* renamed from: xsna.fiv0$a$a, reason: collision with other inner class name */
        public static final class C2877a<T> implements lsr {
            public final /* synthetic */ gzs<s3q0> b;

            public C2877a(gzs<s3q0> gzsVar) {
                this.b = gzsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                gzs<s3q0> gzsVar;
                if ((((vax) obj) instanceof o2d0.b) && (gzsVar = this.b) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sg50 sg50Var, gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$interactionSource = sg50Var;
            this.$onSearchClicked = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$interactionSource, this.$onSearchClicked, spjVar);
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
                C2877a c2877a = new C2877a(this.$onSearchClicked);
                this.label = 1;
                b.getClass();
                if (caj0.k(b, c2877a, this) == coroutineSingletons) {
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

    /* JADX WARN: Removed duplicated region for block: B:125:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final tho0 tho0Var, final izs<? super tho0, s3q0> izsVar, final q630 q630Var, ozy ozyVar, final tlh0.b bVar, tlh0 tlh0Var, sg50 sg50Var, gzs<s3q0> gzsVar, izs<? super tho0, s3q0> izsVar2, gzs<s3q0> gzsVar2, boolean z, SemanticsConfiguration semanticsConfiguration, boolean z2, boolean z3, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        izs<? super tho0, s3q0> izsVar3;
        ozy ozyVar2;
        int i5;
        tlh0 tlh0Var2;
        int i6;
        sg50 sg50Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final izs<? super tho0, s3q0> izsVar4;
        final boolean z4;
        final boolean z5;
        final sg50 sg50Var3;
        final ozy ozyVar3;
        androidx.compose.runtime.a aVar2;
        final tlh0 tlh0Var3;
        final gzs<s3q0> gzsVar3;
        final gzs<s3q0> gzsVar4;
        final SemanticsConfiguration semanticsConfiguration2;
        final boolean z6;
        androidx.compose.runtime.f s;
        sg50 sg50Var4;
        izs<? super tho0, s3q0> izsVar5;
        boolean z7;
        int i19;
        boolean z8;
        boolean z9;
        gzs<s3q0> gzsVar5;
        ozy ozyVar4;
        SemanticsConfiguration semanticsConfiguration3;
        int i20;
        gzs<s3q0> gzsVar6;
        boolean z10;
        gzs<s3q0> gzsVar7;
        boolean z11;
        int i21;
        androidx.compose.runtime.a M = aVar.M(-1554051473);
        if ((i & 6) == 0) {
            i4 = (M.J(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.J(tho0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            izsVar3 = izsVar;
            i4 |= M.y(izsVar3) ? 256 : 128;
        } else {
            izsVar3 = izsVar;
        }
        if ((i & 3072) == 0) {
            i4 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i22 = i3 & 16;
        if (i22 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            ozyVar2 = ozyVar;
            i4 |= M.J(ozyVar2) ? 16384 : 8192;
            if ((i & 196608) == 0) {
                i4 |= M.J(bVar) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                tlh0Var2 = tlh0Var;
            } else {
                tlh0Var2 = tlh0Var;
                if ((i & 1572864) == 0) {
                    i4 |= M.J(tlh0Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
                sg50Var2 = sg50Var;
            } else {
                sg50Var2 = sg50Var;
                if ((i & 12582912) == 0) {
                    i4 |= M.J(sg50Var2) ? 8388608 : 4194304;
                }
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= M.y(gzsVar) ? 67108864 : 33554432;
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i9 = i8;
                i4 |= M.y(izsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else if ((i2 & 6) == 0) {
                    i11 = i10;
                    i12 = i2 | (M.y(gzsVar2) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0 && M.l(z)) {
                        i21 = 32;
                        i12 |= i21;
                    }
                    i21 = 16;
                    i12 |= i21;
                }
                int i23 = i12;
                i13 = i3 & 4096;
                if (i13 != 0) {
                    i14 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    i14 = i23 | (M.J(semanticsConfiguration) ? 256 : 128);
                } else {
                    i14 = i23;
                }
                i15 = i3 & 8192;
                if (i15 != 0) {
                    i16 = i14 | 3072;
                } else {
                    int i24 = i14;
                    if ((i2 & 3072) == 0) {
                        i16 = i24 | (M.l(z2) ? 2048 : 1024);
                    } else {
                        i16 = i24;
                    }
                }
                i17 = i3 & 16384;
                if (i17 != 0) {
                    i18 = i16 | 24576;
                } else {
                    int i25 = i16;
                    if ((i2 & 24576) == 0) {
                        i25 |= M.l(z3) ? 16384 : 8192;
                    }
                    i18 = i25;
                }
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
                    M.V();
                    int i26 = i & 1;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    int i27 = i18;
                    if (i26 == 0 || M.i()) {
                        if (i22 != 0) {
                            ozyVar2 = null;
                        }
                        if (i5 != 0) {
                            tlh0Var2 = null;
                        }
                        if (i6 != 0) {
                            Object x = M.x();
                            if (x == c0012a) {
                                x = ir.h(M);
                            }
                            sg50Var4 = (sg50) x;
                        } else {
                            sg50Var4 = sg50Var2;
                        }
                        gzs<s3q0> gzsVar8 = i7 != 0 ? null : gzsVar;
                        izsVar5 = i9 != 0 ? null : izsVar2;
                        gzs<s3q0> gzsVar9 = i11 != 0 ? null : gzsVar2;
                        if ((i3 & 2048) != 0) {
                            z7 = gzsVar9 != null;
                            i19 = i27 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            z7 = z;
                            i19 = i27;
                        }
                        SemanticsConfiguration semanticsConfiguration4 = i13 != 0 ? null : semanticsConfiguration;
                        z8 = i15 != 0 ? false : z2;
                        z9 = z7;
                        gzsVar5 = gzsVar8;
                        ozyVar4 = ozyVar2;
                        semanticsConfiguration3 = semanticsConfiguration4;
                        i20 = i19;
                        sg50Var3 = sg50Var4;
                        gzsVar6 = gzsVar9;
                        z10 = i17 != 0 ? false : z3;
                    } else {
                        M.h();
                        if ((i3 & 2048) != 0) {
                            gzsVar5 = gzsVar;
                            z9 = z;
                            z8 = z2;
                            z10 = z3;
                            i20 = i27 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            sg50Var3 = sg50Var2;
                            ozyVar4 = ozyVar2;
                            izsVar5 = izsVar2;
                            gzsVar6 = gzsVar2;
                        } else {
                            gzsVar5 = gzsVar;
                            gzsVar6 = gzsVar2;
                            z9 = z;
                            z8 = z2;
                            z10 = z3;
                            sg50Var3 = sg50Var2;
                            ozyVar4 = ozyVar2;
                            i20 = i27;
                            izsVar5 = izsVar2;
                        }
                        semanticsConfiguration3 = semanticsConfiguration;
                    }
                    M.S();
                    izs<? super tho0, s3q0> izsVar6 = izsVar5;
                    if (androidx.compose.runtime.b.d()) {
                        gzsVar7 = gzsVar5;
                        androidx.compose.runtime.b.f(-1554051473, i4, i20, "com.vk.core.compose.component.search.VkSearch (VkSearch.kt:124)");
                    } else {
                        gzsVar7 = gzsVar5;
                    }
                    q630 q630Var2 = q630.a.a;
                    if (!z9 || gzsVar6 == null) {
                        z11 = z10;
                        M.K(-1293622501);
                        M.j();
                    } else {
                        M.K(-1294084711);
                        z11 = z10;
                        boolean z12 = ((i4 & 14) == 4) | ((i4 & 458752) == 131072);
                        Object x2 = M.x();
                        if (z12 || x2 == c0012a) {
                            x2 = new o6i0(9, str, bVar);
                            M.R(x2);
                        }
                        q630Var2 = egi0.a(q630Var2, (izs) x2);
                        M.j();
                    }
                    boolean z13 = ((29360128 & i4) == 8388608) | ((i20 & 14) == 4);
                    Object x3 = M.x();
                    if (z13 || x3 == c0012a) {
                        x3 = new a(sg50Var3, gzsVar6, null);
                        M.R(x3);
                    }
                    bap.g(sg50Var3, (wzs) x3, M, (i4 >> 21) & 14);
                    q630 f = txj0.f(q630Var, 1.0f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar3);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a2, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    if (ozyVar4 == null) {
                        M.K(-154466979);
                        M.j();
                    } else {
                        M.K(1934679844);
                        ozyVar4.a(((i4 >> 9) & 112) | 6, M);
                        M.j();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    q630 b = com.vk.core.compose.component.semantics.b.b(q630Var2, semanticsConfiguration3);
                    int i28 = i4 << 3;
                    int i29 = ((i4 >> 3) & 14) | (i28 & 112) | (i20 & 7168) | ((i20 << 9) & 57344) | (i4 & 458752) | (3670016 & i4) | (i28 & 234881024) | (1879048192 & i4);
                    int i30 = ((i20 >> 9) & 112) | ((i4 >> 24) & 14) | (i4 & 896);
                    boolean z14 = z8;
                    gzs<s3q0> gzsVar10 = gzsVar6;
                    gzs<s3q0> gzsVar11 = gzsVar7;
                    ozy ozyVar5 = ozyVar4;
                    SemanticsConfiguration semanticsConfiguration5 = semanticsConfiguration3;
                    tlh0 tlh0Var4 = tlh0Var2;
                    boolean z15 = z11;
                    boolean z16 = z9;
                    jiv0.d(tho0Var, str, b, z14, z16, bVar, tlh0Var4, null, sg50Var3, izsVar6, gzsVar11, z15, izsVar3, M, i29, i30, 128);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    izsVar4 = izsVar6;
                    gzsVar3 = gzsVar11;
                    z5 = z14;
                    z4 = z16;
                    tlh0Var3 = tlh0Var4;
                    z6 = z15;
                    aVar2 = M;
                    gzsVar4 = gzsVar10;
                    ozyVar3 = ozyVar5;
                    semanticsConfiguration2 = semanticsConfiguration5;
                } else {
                    M.h();
                    izsVar4 = izsVar2;
                    z4 = z;
                    z5 = z2;
                    sg50Var3 = sg50Var2;
                    ozyVar3 = ozyVar2;
                    aVar2 = M;
                    tlh0Var3 = tlh0Var2;
                    gzsVar3 = gzsVar;
                    gzsVar4 = gzsVar2;
                    semanticsConfiguration2 = semanticsConfiguration;
                    z6 = z3;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.eiv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            int I2 = ne7.I(i2);
                            fiv0.a(str, tho0Var, izsVar, q630Var, ozyVar3, bVar, tlh0Var3, sg50Var3, gzsVar3, izsVar4, gzsVar4, z4, semanticsConfiguration2, z5, z6, (androidx.compose.runtime.a) obj, I, I2, i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i232 = i12;
            i13 = i3 & 4096;
            if (i13 != 0) {
            }
            i15 = i3 & 8192;
            if (i15 != 0) {
            }
            i17 = i3 & 16384;
            if (i17 != 0) {
            }
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        ozyVar2 = ozyVar;
        if ((i & 196608) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2322 = i12;
        i13 = i3 & 4096;
        if (i13 != 0) {
        }
        i15 = i3 & 8192;
        if (i15 != 0) {
        }
        i17 = i3 & 16384;
        if (i17 != 0) {
        }
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
