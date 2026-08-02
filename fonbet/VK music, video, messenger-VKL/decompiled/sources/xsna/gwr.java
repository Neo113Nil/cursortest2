package xsna;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.focus.CustomDestinationResult;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ixr;
import xsna.q630;

/* compiled from: FocusOwnerImpl.kt */
/* loaded from: classes11.dex */
public final class gwr implements fwr {
    public final p52 a;
    public final p52 b;
    public final tvr d;
    public zg50 f;
    public dxr h;
    public final dxr c = new dxr(null, 2, 14);
    public final hwr e = new hwr(this);
    public final fh50<uvr> g = new fh50<>(1);

    /* compiled from: FocusOwnerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    public static final class b extends Lambda implements izs<dxr, Boolean> {
        final /* synthetic */ izs<dxr, Boolean> $onFound;
        final /* synthetic */ dxr $source;
        final /* synthetic */ gwr this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(dxr dxrVar, gwr gwrVar, izs<? super dxr, Boolean> izsVar) {
            super(1);
            this.$source = dxrVar;
            this.this$0 = gwrVar;
            this.$onFound = izsVar;
        }

        @Override // xsna.izs
        public final Boolean invoke(dxr dxrVar) {
            boolean booleanValue;
            dxr dxrVar2 = dxrVar;
            if (epx.f(dxrVar2, this.$source)) {
                booleanValue = false;
            } else {
                if (epx.f(dxrVar2, this.this$0.c)) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                booleanValue = this.$onFound.invoke(dxrVar2).booleanValue();
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    public static final class c extends Lambda implements izs<dxr, Boolean> {
        final /* synthetic */ int $focusDirection;
        final /* synthetic */ Ref$ObjectRef<Boolean> $requestFocusSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref$ObjectRef<Boolean> ref$ObjectRef, int i) {
            super(1);
            this.$requestFocusSuccess = ref$ObjectRef;
            this.$focusDirection = i;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
        @Override // xsna.izs
        public final Boolean invoke(dxr dxrVar) {
            this.$requestFocusSuccess.element = Boolean.valueOf(dxrVar.v1(this.$focusDirection));
            return this.$requestFocusSuccess.element;
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    public static final class d extends Lambda implements izs<dxr, Boolean> {
        final /* synthetic */ int $focusDirection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(1);
            this.$focusDirection = i;
        }

        @Override // xsna.izs
        public final Boolean invoke(dxr dxrVar) {
            return Boolean.valueOf(dxrVar.v1(this.$focusDirection));
        }
    }

    public gwr(p52 p52Var, p52 p52Var2) {
        this.a = p52Var;
        this.b = p52Var2;
        this.d = new tvr(this, p52Var2);
    }

    public final void A() {
        p52 p52Var = this.a;
        if (p52Var.isFocused() || p52Var.hasFocus()) {
            p52Var.clearFocus();
        } else if (p52Var.hasFocus()) {
            View findFocus = p52Var.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            p52Var.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0329, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        r34 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        r6 = r3.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r3.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        if (((r3.a[r6 >> 3] >> ((r6 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        r6 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r6 <= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (java.lang.Long.compareUnsigned(r3.d * 32, r6 * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        r6 = r3.a;
        r7 = r3.c;
        r10 = r3.b;
        r11 = (r7 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        if (r14 >= r11) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        r8 = r6[r14] & (-9187201950435737472L);
        r6[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        r15 = r4;
        r35 = r5;
        r21 = 128;
        r4 = r6.length;
        r5 = r4 - 1;
        r4 = r4 - 2;
        r6[r4] = (r6[r4] & 72057594037927935L) | (-72057594037927936L);
        r6[r5] = r6[0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0120, code lost:
    
        if (r4 == r7) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0122, code lost:
    
        r5 = r4 >> 3;
        r11 = (r4 & 7) << 3;
        r8 = (r6[r5] >> r11) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012f, code lost:
    
        if (r8 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0136, code lost:
    
        if (r8 == 254) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0139, code lost:
    
        r8 = java.lang.Long.hashCode(r10[r4]) * (-862048943);
        r9 = (r8 ^ (r8 << 16)) >>> 7;
        r14 = r3.b(r9);
        r9 = r9 & r7;
        r38 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015a, code lost:
    
        if ((((r14 - r9) & r7) / 8) != (((r4 - r9) & r7) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015c, code lost:
    
        r6[r5] = ((~(255 << r11)) & r6[r5]) | ((r8 & 127) << r11);
        r6[r6.length - 1] = (r6[0] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017a, code lost:
    
        r15 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017d, code lost:
    
        r23 = r4;
        r4 = r14 >> 3;
        r30 = r6[r4];
        r5 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018f, code lost:
    
        if (((r30 >> r5) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0191, code lost:
    
        r6[r4] = (r30 & (~(255 << r5))) | ((r8 & 127) << r5);
        r6[r5] = (r6[r5] & (~(255 << r11))) | (128 << r11);
        r10[r14] = r10[r23];
        r10[r23] = 0;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01cf, code lost:
    
        r6[r6.length - 1] = (r6[0] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b5, code lost:
    
        r6[r4] = ((r8 & 127) << r5) | (r30 & (~(255 << r5)));
        r4 = r10[r14];
        r10[r14] = r10[r23];
        r10[r23] = r4;
        r4 = r23 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01dd, code lost:
    
        r3.e = xsna.h5h0.a(r3.c) - r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0261, code lost:
    
        r11 = r3.b(r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0268, code lost:
    
        r3.d++;
        r4 = r3.e;
        r5 = r3.a;
        r6 = r11 >> 3;
        r7 = r5[r6];
        r9 = (r11 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0280, code lost:
    
        if (((r7 >> r9) & 255) != r21) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0282, code lost:
    
        r20 = r34 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0284, code lost:
    
        r3.e = r4 - r20;
        r4 = r3.c;
        r7 = (r7 & (~(255 << r9))) | (r12 << r9);
        r5[r6] = r7;
        r5[(((r11 - 7) & r4) + (r4 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ec, code lost:
    
        r35 = r5;
        r21 = 128;
        r4 = xsna.h5h0.c(r3.c);
        r5 = r3.a;
        r6 = r3.b;
        r7 = r3.c;
        r3.c(r4);
        r4 = r3.a;
        r8 = r3.b;
        r9 = r3.c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0207, code lost:
    
        if (r10 >= r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0216, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0218, code lost:
    
        r14 = r6[r10];
        r11 = java.lang.Long.hashCode(r14) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r16 = r4;
        r4 = r3.b(r11 >>> 7);
        r17 = r5;
        r4 = r11 & 127;
        r11 = r4 >> 3;
        r18 = (r4 & 7) << 3;
        r4 = (r16[r11] & (~(255 << r18))) | (r4 << r18);
        r16[r11] = r4;
        r16[(((r4 - 7) & r9) + (r9 & 7)) >> 3] = r4;
        r8[r4] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x025a, code lost:
    
        r10 = r10 + 1;
        r4 = r16;
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0256, code lost:
    
        r16 = r4;
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0267, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0327, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(KeyEvent keyEvent) {
        int i;
        boolean z;
        int i2;
        long u = zq70.u(keyEvent);
        int w = zq70.w(keyEvent);
        int i3 = 8;
        int i4 = 0;
        boolean z2 = true;
        if (w == 2) {
            zg50 zg50Var = this.f;
            if (zg50Var == null) {
                zg50Var = new zg50(3);
                this.f = zg50Var;
            }
            int hashCode = Long.hashCode(u) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 >>> 7;
            int i7 = i5 & 127;
            int i8 = zg50Var.c;
            int i9 = i6 & i8;
            int i10 = 0;
            loop0: while (true) {
                long[] jArr = zg50Var.a;
                int i11 = i9 >> 3;
                int i12 = (i9 & 7) << 3;
                long j = (jArr[i11] >>> i12) | ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63));
                long j2 = i7;
                long j3 = j ^ (j2 * 72340172838076673L);
                long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i2 = (i9 + (Long.numberOfTrailingZeros(j4) >> 3)) & i8;
                    z = z2;
                    if (zg50Var.b[i2] == u) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    z2 = z ? 1 : 0;
                }
                i10 += 8;
                i9 = (i9 + i10) & i8;
                z2 = z ? 1 : 0;
                i3 = i3;
            }
            zg50Var.b[i2] = u;
            return z;
        }
        if (w != 1) {
            return true;
        }
        zg50 zg50Var2 = this.f;
        if (zg50Var2 == null || !zg50Var2.a(u)) {
            return false;
        }
        zg50 zg50Var3 = this.f;
        if (zg50Var3 != null) {
            int hashCode2 = Long.hashCode(u) * (-862048943);
            int i13 = hashCode2 ^ (hashCode2 << 16);
            int i14 = i13 & 127;
            int i15 = zg50Var3.c;
            int i16 = i13 >>> 7;
            loop5: while (true) {
                int i17 = i16 & i15;
                long[] jArr2 = zg50Var3.a;
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                long j5 = ((jArr2[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr2[i18] >>> i19);
                long j6 = (i14 * 72340172838076673L) ^ j5;
                long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j7 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j7) >> 3) + i17) & i15;
                    if (zg50Var3.b[i] == u) {
                        break loop5;
                    }
                    j7 &= j7 - 1;
                }
                i4 += 8;
                i16 = i17 + i4;
            }
            if (i >= 0) {
                zg50Var3.d--;
                long[] jArr3 = zg50Var3.a;
                int i20 = zg50Var3.c;
                int i21 = i >> 3;
                int i22 = (i & 7) << 3;
                long j8 = (jArr3[i21] & (~(255 << i22))) | (254 << i22);
                jArr3[i21] = j8;
                jArr3[(((i - 7) & i20) + (i20 & 7)) >> 3] = j8;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r14v11, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r14v12, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r14v13, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    @Override // xsna.fwr
    public final boolean a(KeyEvent keyEvent) {
        lek0 lek0Var;
        u470 u470Var;
        boolean z;
        ytl ytlVar;
        u470 u470Var2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        dxr a2 = ixr.a(this.c);
        if (a2 != null) {
            if (!a2.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = a2.b;
            LayoutNode f = itl.f(a2);
            loop0: while (true) {
                if (f == null) {
                    ytlVar = 0;
                    break;
                }
                if ((f.G.f.e & 131072) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & 131072) != 0) {
                            ?? r8 = 0;
                            ytlVar = cVar;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof lek0) {
                                    break loop0;
                                }
                                if ((ytlVar.d & 131072) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar2 = ytlVar.q;
                                    int i = 0;
                                    ytlVar = ytlVar;
                                    r8 = r8;
                                    while (cVar2 != null) {
                                        if ((cVar2.d & 131072) != 0) {
                                            i++;
                                            r8 = r8;
                                            if (i == 1) {
                                                s3q0 s3q0Var = s3q0.a;
                                                ytlVar = cVar2;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r8.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r8.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.g;
                                        ytlVar = ytlVar;
                                        r8 = r8;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ytlVar = itl.b(r8);
                            }
                        }
                        cVar = cVar.f;
                    }
                }
                f = f.I();
                cVar = (f == null || (u470Var2 = f.G) == null) ? null : u470Var2.e;
            }
            lek0Var = (lek0) ytlVar;
        } else {
            lek0Var = null;
        }
        if (lek0Var != null) {
            if (!lek0Var.z().o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar3 = lek0Var.z().f;
            LayoutNode f2 = itl.f(lek0Var);
            ArrayList arrayList = null;
            while (f2 != null) {
                if ((f2.G.f.e & 131072) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.d & 131072) != 0) {
                            q630.c cVar4 = cVar3;
                            ci50 ci50Var = null;
                            while (cVar4 != null) {
                                if (cVar4 instanceof lek0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar4);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (cVar4.d & 131072) != 0 && (cVar4 instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar5 = ((ytl) cVar4).q; cVar5 != null; cVar5 = cVar5.g) {
                                        if ((cVar5.d & 131072) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                s3q0 s3q0Var2 = s3q0.a;
                                                cVar4 = cVar5;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar4 != null) {
                                                    ci50Var.b(cVar4);
                                                    cVar4 = null;
                                                }
                                                ci50Var.b(cVar5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar4 = itl.b(ci50Var);
                            }
                        }
                        cVar3 = cVar3.f;
                    }
                }
                f2 = f2.I();
                cVar3 = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
            }
            if (arrayList != null) {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = size - 1;
                        if (((lek0) arrayList.get(size)).F()) {
                            break;
                        }
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                }
                s3q0 s3q0Var3 = s3q0.a;
            }
            ytl z2 = lek0Var.z();
            ?? r1 = 0;
            while (true) {
                if (z2 != 0) {
                    if (z2 instanceof lek0) {
                        if (((lek0) z2).F()) {
                            break;
                        }
                    } else if ((z2.d & 131072) != 0 && (z2 instanceof ytl)) {
                        q630.c cVar6 = z2.q;
                        int i4 = 0;
                        r1 = r1;
                        z2 = z2;
                        while (cVar6 != null) {
                            if ((cVar6.d & 131072) != 0) {
                                i4++;
                                r1 = r1;
                                if (i4 == 1) {
                                    s3q0 s3q0Var4 = s3q0.a;
                                    z2 = cVar6;
                                } else {
                                    if (r1 == 0) {
                                        r1 = new ci50(new q630.c[16]);
                                    }
                                    if (z2 != 0) {
                                        r1.b(z2);
                                        z2 = 0;
                                    }
                                    r1.b(cVar6);
                                }
                            }
                            cVar6 = cVar6.g;
                            r1 = r1;
                            z2 = z2;
                        }
                        if (i4 == 1) {
                        }
                    }
                    z2 = itl.b(r1);
                } else {
                    ytl z3 = lek0Var.z();
                    ?? r12 = 0;
                    while (true) {
                        if (z3 != 0) {
                            if (z3 instanceof lek0) {
                                if (((lek0) z3).Q1()) {
                                    break;
                                }
                            } else if ((z3.d & 131072) != 0 && (z3 instanceof ytl)) {
                                q630.c cVar7 = z3.q;
                                int i5 = 0;
                                r12 = r12;
                                z3 = z3;
                                while (cVar7 != null) {
                                    if ((cVar7.d & 131072) != 0) {
                                        i5++;
                                        r12 = r12;
                                        if (i5 == 1) {
                                            s3q0 s3q0Var5 = s3q0.a;
                                            z3 = cVar7;
                                        } else {
                                            if (r12 == 0) {
                                                r12 = new ci50(new q630.c[16]);
                                            }
                                            if (z3 != 0) {
                                                r12.b(z3);
                                                z3 = 0;
                                            }
                                            r12.b(cVar7);
                                        }
                                    }
                                    cVar7 = cVar7.g;
                                    r12 = r12;
                                    z3 = z3;
                                }
                                if (i5 == 1) {
                                }
                            }
                            z3 = itl.b(r12);
                        } else {
                            if (arrayList != null) {
                                int size2 = arrayList.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    if (!((lek0) arrayList.get(i6)).Q1()) {
                                    }
                                }
                                s3q0 s3q0Var6 = s3q0.a;
                            }
                            s3q0 s3q0Var7 = s3q0.a;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.fwr
    public final dxr b() {
        dxr dxrVar = this.h;
        if (dxrVar == null || !dxrVar.o) {
            return null;
        }
        return dxrVar;
    }

    @Override // xsna.fwr
    public final hwr c() {
        return this.e;
    }

    @Override // xsna.fwr
    public final boolean d() {
        return false;
    }

    @Override // xsna.fwr
    public final boolean e(int i) {
        if (!n(i, false, false)) {
            return false;
        }
        Boolean s = s(i, null, new d(i));
        boolean booleanValue = s != null ? s.booleanValue() : false;
        if (!booleanValue) {
            A();
        }
        return booleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // xsna.fwr
    public final boolean f(fa2 fa2Var) {
        puw puwVar;
        int size;
        int size2;
        u470 u470Var;
        boolean z;
        ytl ytlVar;
        u470 u470Var2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
            return false;
        }
        dxr b2 = b();
        if (b2 != null) {
            if (!b2.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = b2.b;
            LayoutNode f = itl.f(b2);
            loop0: while (true) {
                if (f == null) {
                    ytlVar = 0;
                    break;
                }
                if ((f.G.f.e & 2097152) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & 2097152) != 0) {
                            ?? r9 = 0;
                            ytlVar = cVar;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof puw) {
                                    break loop0;
                                }
                                if ((ytlVar.d & 2097152) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar2 = ytlVar.q;
                                    int i = 0;
                                    ytlVar = ytlVar;
                                    r9 = r9;
                                    while (cVar2 != null) {
                                        if ((cVar2.d & 2097152) != 0) {
                                            i++;
                                            r9 = r9;
                                            if (i == 1) {
                                                ytlVar = cVar2;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r9.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r9.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.g;
                                        ytlVar = ytlVar;
                                        r9 = r9;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ytlVar = itl.b(r9);
                            }
                        }
                        cVar = cVar.f;
                    }
                }
                f = f.I();
                cVar = (f == null || (u470Var2 = f.G) == null) ? null : u470Var2.e;
            }
            puwVar = (puw) ytlVar;
        } else {
            puwVar = null;
        }
        if (puwVar != null) {
            if (!puwVar.z().o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar3 = puwVar.z().f;
            LayoutNode f2 = itl.f(puwVar);
            ArrayList arrayList = null;
            while (f2 != null) {
                if ((f2.G.f.e & 2097152) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.d & 2097152) != 0) {
                            q630.c cVar4 = cVar3;
                            ci50 ci50Var = null;
                            while (cVar4 != null) {
                                if (cVar4 instanceof puw) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar4);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (cVar4.d & 2097152) != 0 && (cVar4 instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar5 = ((ytl) cVar4).q; cVar5 != null; cVar5 = cVar5.g) {
                                        if ((cVar5.d & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar4 = cVar5;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar4 != null) {
                                                    ci50Var.b(cVar4);
                                                    cVar4 = null;
                                                }
                                                ci50Var.b(cVar5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar4 = itl.b(ci50Var);
                            }
                        }
                        cVar3 = cVar3.f;
                    }
                }
                f2 = f2.I();
                cVar3 = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    ((puw) arrayList.get(size2)).E1(fa2Var, PointerEventPass.Initial);
                    if (i3 < 0) {
                        break;
                    }
                    size2 = i3;
                }
            }
            puwVar.E1(fa2Var, PointerEventPass.Initial);
            puwVar.E1(fa2Var, PointerEventPass.Main);
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((puw) arrayList.get(i4)).E1(fa2Var, PointerEventPass.Main);
                }
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((puw) arrayList.get(size)).E1(fa2Var, PointerEventPass.Final);
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            puwVar.E1(fa2Var, PointerEventPass.Final);
        }
        ArrayList arrayList2 = fa2Var.a;
        int size4 = arrayList2.size();
        for (int i6 = 0; i6 < size4; i6++) {
            if (((nuw) arrayList2.get(i6)).i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
    @Override // xsna.fwr
    public final boolean g(int i, boolean z) {
        dxr b2 = b();
        p52 p52Var = this.a;
        if (b2 == null || !b2.p || !p52Var.T(i)) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = Boolean.FALSE;
            dxr b3 = b();
            Boolean s = s(i, p52Var.getEmbeddedViewFocusRect(), new c(ref$ObjectRef, i));
            if (!epx.f(s, Boolean.TRUE) || b3 == b()) {
                if (s != null && ref$ObjectRef.element != 0) {
                    if (!s.booleanValue() || !((Boolean) ref$ObjectRef.element).booleanValue()) {
                        if ((i == 1 || i == 2) && z && n(i, false, false)) {
                            Boolean s2 = s(i, null, new iwr(i));
                            if (s2 != null ? s2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // xsna.vvr
    public final boolean h(int i) {
        return g(i, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0170 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0033, B:18:0x0039, B:19:0x003f, B:21:0x0047, B:23:0x004c, B:25:0x0052, B:29:0x0058, B:34:0x0170, B:36:0x0176, B:37:0x0179, B:39:0x0184, B:42:0x0190, B:46:0x019a, B:49:0x01a0, B:50:0x01a5, B:52:0x01ad, B:54:0x01b3, B:56:0x01b7, B:58:0x01bf, B:60:0x01c5, B:62:0x01c9, B:66:0x01cf, B:68:0x01d8, B:69:0x01dc, B:64:0x01df, B:75:0x01e5, B:86:0x01ea, B:89:0x01ed, B:91:0x01f3, B:98:0x01f7, B:103:0x01fe, B:105:0x0206, B:113:0x021d, B:114:0x021f, B:116:0x0224, B:150:0x0228, B:145:0x026c, B:118:0x0234, B:120:0x023a, B:122:0x023e, B:124:0x0246, B:126:0x024c, B:128:0x0250, B:132:0x0256, B:134:0x025f, B:135:0x0263, B:130:0x0266, B:156:0x0271, B:160:0x0281, B:162:0x0286, B:196:0x028a, B:191:0x02ce, B:164:0x0296, B:166:0x029c, B:168:0x02a0, B:170:0x02a8, B:172:0x02ae, B:174:0x02b2, B:178:0x02b8, B:180:0x02c1, B:181:0x02c5, B:176:0x02c8, B:203:0x02d5, B:205:0x02dc, B:212:0x02ef, B:213:0x02f1, B:220:0x0060, B:222:0x0066, B:223:0x0069, B:225:0x0071, B:228:0x007d, B:232:0x0087, B:267:0x00dc, B:269:0x00e0, B:234:0x008c, B:236:0x0092, B:238:0x0096, B:240:0x009e, B:242:0x00a4, B:244:0x00a8, B:248:0x00ae, B:250:0x00b7, B:251:0x00bb, B:246:0x00be, B:257:0x00c4, B:271:0x00c9, B:274:0x00cc, B:276:0x00d2, B:283:0x00d6, B:288:0x00e6, B:290:0x00ec, B:291:0x00ef, B:293:0x00f9, B:296:0x0105, B:300:0x010f, B:335:0x0164, B:337:0x0168, B:302:0x0114, B:304:0x011a, B:306:0x011e, B:308:0x0126, B:310:0x012c, B:312:0x0130, B:316:0x0136, B:318:0x013f, B:319:0x0143, B:314:0x0146, B:325:0x014c, B:340:0x0151, B:343:0x0154, B:345:0x015a, B:352:0x015e), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r0v24, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v9, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r15v5, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r15v9, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v35, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    @Override // xsna.fwr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(KeyEvent keyEvent, gzs<Boolean> gzsVar) {
        Object obj;
        q630.c z;
        u470 u470Var;
        Object obj2;
        u470 u470Var2;
        u470 u470Var3;
        boolean z2;
        dxr dxrVar = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!B(keyEvent)) {
                return false;
            }
            dxr a2 = ixr.a(dxrVar);
            if (a2 != null) {
                if (!a2.b.o) {
                    uzw.b("visitLocalDescendants called on an unattached node");
                }
                q630.c cVar = a2.b;
                if ((cVar.e & 9216) != 0) {
                    z = null;
                    for (q630.c cVar2 = cVar.g; cVar2 != null; cVar2 = cVar2.g) {
                        int i = cVar2.d;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            z = cVar2;
                        }
                    }
                } else {
                    z = null;
                }
            }
            if (a2 != null) {
                if (!a2.b.o) {
                    uzw.b("visitAncestors called on an unattached node");
                }
                q630.c cVar3 = a2.b;
                LayoutNode f = itl.f(a2);
                loop11: while (true) {
                    if (f == null) {
                        obj2 = null;
                        break;
                    }
                    if ((f.G.f.e & 8192) != 0) {
                        while (cVar3 != null) {
                            if ((cVar3.d & 8192) != 0) {
                                ci50 ci50Var = null;
                                q630.c cVar4 = cVar3;
                                while (cVar4 != null) {
                                    if (cVar4 instanceof ndy) {
                                        obj2 = cVar4;
                                        break loop11;
                                    }
                                    if ((cVar4.d & 8192) != 0 && (cVar4 instanceof ytl)) {
                                        q630.c cVar5 = ((ytl) cVar4).q;
                                        int i2 = 0;
                                        cVar4 = cVar4;
                                        ci50Var = ci50Var;
                                        while (cVar5 != null) {
                                            if ((cVar5.d & 8192) != 0) {
                                                i2++;
                                                ci50Var = ci50Var;
                                                if (i2 == 1) {
                                                    s3q0 s3q0Var = s3q0.a;
                                                    cVar4 = cVar5;
                                                } else {
                                                    if (ci50Var == null) {
                                                        ci50Var = new ci50(new q630.c[16]);
                                                    }
                                                    if (cVar4 != null) {
                                                        ci50Var.b(cVar4);
                                                        cVar4 = null;
                                                    }
                                                    ci50Var.b(cVar5);
                                                }
                                            }
                                            cVar5 = cVar5.g;
                                            cVar4 = cVar4;
                                            ci50Var = ci50Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cVar4 = itl.b(ci50Var);
                                }
                            }
                            cVar3 = cVar3.f;
                        }
                    }
                    f = f.I();
                    cVar3 = (f == null || (u470Var2 = f.G) == null) ? null : u470Var2.e;
                }
                ndy ndyVar = (ndy) obj2;
                if (ndyVar != null) {
                    z = ndyVar.z();
                    if (z != null) {
                        if (!z.b.o) {
                            uzw.b("visitAncestors called on an unattached node");
                        }
                        q630.c cVar6 = z.b.f;
                        LayoutNode f2 = itl.f(z);
                        ArrayList arrayList = null;
                        while (f2 != null) {
                            if ((f2.G.f.e & 8192) != 0) {
                                while (cVar6 != null) {
                                    if ((cVar6.d & 8192) != 0) {
                                        q630.c cVar7 = cVar6;
                                        ci50 ci50Var2 = null;
                                        while (cVar7 != null) {
                                            if (cVar7 instanceof ndy) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(cVar7);
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            if (z2 && (cVar7.d & 8192) != 0 && (cVar7 instanceof ytl)) {
                                                int i3 = 0;
                                                for (q630.c cVar8 = ((ytl) cVar7).q; cVar8 != null; cVar8 = cVar8.g) {
                                                    if ((cVar8.d & 8192) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            s3q0 s3q0Var2 = s3q0.a;
                                                            cVar7 = cVar8;
                                                        } else {
                                                            if (ci50Var2 == null) {
                                                                ci50Var2 = new ci50(new q630.c[16]);
                                                            }
                                                            if (cVar7 != null) {
                                                                ci50Var2.b(cVar7);
                                                                cVar7 = null;
                                                            }
                                                            ci50Var2.b(cVar8);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            cVar7 = itl.b(ci50Var2);
                                        }
                                    }
                                    cVar6 = cVar6.f;
                                }
                            }
                            f2 = f2.I();
                            cVar6 = (f2 == null || (u470Var3 = f2.G) == null) ? null : u470Var3.e;
                        }
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            if (size >= 0) {
                                while (true) {
                                    int i4 = size - 1;
                                    if (((ndy) arrayList.get(size)).T(keyEvent)) {
                                        return true;
                                    }
                                    if (i4 < 0) {
                                        break;
                                    }
                                    size = i4;
                                }
                            }
                            s3q0 s3q0Var3 = s3q0.a;
                        }
                        ytl ytlVar = z.b;
                        ?? r1 = 0;
                        while (ytlVar != 0) {
                            if (ytlVar instanceof ndy) {
                                if (((ndy) ytlVar).T(keyEvent)) {
                                    return true;
                                }
                            } else if ((ytlVar.d & 8192) != 0 && (ytlVar instanceof ytl)) {
                                q630.c cVar9 = ytlVar.q;
                                int i5 = 0;
                                ytlVar = ytlVar;
                                r1 = r1;
                                while (cVar9 != null) {
                                    if ((cVar9.d & 8192) != 0) {
                                        i5++;
                                        r1 = r1;
                                        if (i5 == 1) {
                                            s3q0 s3q0Var4 = s3q0.a;
                                            ytlVar = cVar9;
                                        } else {
                                            if (r1 == 0) {
                                                r1 = new ci50(new q630.c[16]);
                                            }
                                            if (ytlVar != 0) {
                                                r1.b(ytlVar);
                                                ytlVar = 0;
                                            }
                                            r1.b(cVar9);
                                        }
                                    }
                                    cVar9 = cVar9.g;
                                    ytlVar = ytlVar;
                                    r1 = r1;
                                }
                                if (i5 == 1) {
                                }
                            }
                            ytlVar = itl.b(r1);
                        }
                        if (gzsVar.invoke().booleanValue()) {
                            return true;
                        }
                        ytl ytlVar2 = z.b;
                        ?? r0 = 0;
                        while (ytlVar2 != 0) {
                            if (ytlVar2 instanceof ndy) {
                                if (((ndy) ytlVar2).J1(keyEvent)) {
                                    return true;
                                }
                            } else if ((ytlVar2.d & 8192) != 0 && (ytlVar2 instanceof ytl)) {
                                q630.c cVar10 = ytlVar2.q;
                                int i6 = 0;
                                r0 = r0;
                                ytlVar2 = ytlVar2;
                                while (cVar10 != null) {
                                    if ((cVar10.d & 8192) != 0) {
                                        i6++;
                                        r0 = r0;
                                        if (i6 == 1) {
                                            s3q0 s3q0Var5 = s3q0.a;
                                            ytlVar2 = cVar10;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new ci50(new q630.c[16]);
                                            }
                                            if (ytlVar2 != 0) {
                                                r0.b(ytlVar2);
                                                ytlVar2 = 0;
                                            }
                                            r0.b(cVar10);
                                        }
                                    }
                                    cVar10 = cVar10.g;
                                    r0 = r0;
                                    ytlVar2 = ytlVar2;
                                }
                                if (i6 == 1) {
                                }
                            }
                            ytlVar2 = itl.b(r0);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (((ndy) arrayList.get(i7)).J1(keyEvent)) {
                                    return true;
                                }
                            }
                            s3q0 s3q0Var6 = s3q0.a;
                        }
                        s3q0 s3q0Var7 = s3q0.a;
                    }
                    return false;
                }
            }
            if (!dxrVar.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar11 = dxrVar.b.f;
            LayoutNode f3 = itl.f(dxrVar);
            loop15: while (true) {
                if (f3 == null) {
                    obj = null;
                    break;
                }
                if ((f3.G.f.e & 8192) != 0) {
                    while (cVar11 != null) {
                        if ((cVar11.d & 8192) != 0) {
                            q630.c cVar12 = cVar11;
                            ci50 ci50Var3 = null;
                            while (cVar12 != null) {
                                if (cVar12 instanceof ndy) {
                                    obj = cVar12;
                                    break loop15;
                                }
                                if ((cVar12.d & 8192) != 0 && (cVar12 instanceof ytl)) {
                                    q630.c cVar13 = ((ytl) cVar12).q;
                                    int i8 = 0;
                                    cVar12 = cVar12;
                                    ci50Var3 = ci50Var3;
                                    while (cVar13 != null) {
                                        if ((cVar13.d & 8192) != 0) {
                                            i8++;
                                            ci50Var3 = ci50Var3;
                                            if (i8 == 1) {
                                                s3q0 s3q0Var8 = s3q0.a;
                                                cVar12 = cVar13;
                                            } else {
                                                if (ci50Var3 == null) {
                                                    ci50Var3 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar12 != null) {
                                                    ci50Var3.b(cVar12);
                                                    cVar12 = null;
                                                }
                                                ci50Var3.b(cVar13);
                                            }
                                        }
                                        cVar13 = cVar13.g;
                                        cVar12 = cVar12;
                                        ci50Var3 = ci50Var3;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                cVar12 = itl.b(ci50Var3);
                            }
                        }
                        cVar11 = cVar11.f;
                    }
                }
                f3 = f3.I();
                cVar11 = (f3 == null || (u470Var = f3.G) == null) ? null : u470Var.e;
            }
            ndy ndyVar2 = (ndy) obj;
            z = ndyVar2 != null ? ndyVar2.z() : null;
            if (z != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.fwr
    public final void k(dxr dxrVar) {
        dxr dxrVar2 = this.h;
        this.h = dxrVar;
        fh50<uvr> fh50Var = this.g;
        Object[] objArr = fh50Var.a;
        int i = fh50Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((uvr) objArr[i2]).r(dxrVar2, dxrVar);
        }
    }

    @Override // xsna.fwr
    public final void l(dxr dxrVar) {
        tvr tvrVar = this.d;
        if (tvrVar.c.e(dxrVar)) {
            tvrVar.a();
        }
    }

    @Override // xsna.fwr
    public final boolean m() {
        return this.a.Y();
    }

    @Override // xsna.fwr
    public final boolean n(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            z(z);
        } else {
            int i2 = a.$EnumSwitchMapping$0[gxr.c(this.c, i).ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z3 = false;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z(z);
            }
        }
        if (z3 && z2) {
            A();
        }
        return z3;
    }

    @Override // xsna.fwr
    public final void o(lvr lvrVar) {
        tvr tvrVar = this.d;
        if (tvrVar.d.e(lvrVar)) {
            tvrVar.a();
        }
    }

    @Override // xsna.fwr
    public final fh50<uvr> p() {
        return this.g;
    }

    @Override // xsna.fwr
    public final void q() {
        this.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // xsna.fwr
    public final void r() {
        puw puwVar;
        u470 u470Var;
        boolean z;
        ytl ytlVar;
        u470 u470Var2;
        dxr b2 = b();
        if (b2 != null) {
            if (!b2.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = b2.b;
            LayoutNode f = itl.f(b2);
            loop0: while (true) {
                if (f == null) {
                    ytlVar = 0;
                    break;
                }
                if ((f.G.f.e & 2097152) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & 2097152) != 0) {
                            ?? r9 = 0;
                            ytlVar = cVar;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof puw) {
                                    break loop0;
                                }
                                if ((ytlVar.d & 2097152) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar2 = ytlVar.q;
                                    int i = 0;
                                    ytlVar = ytlVar;
                                    r9 = r9;
                                    while (cVar2 != null) {
                                        if ((cVar2.d & 2097152) != 0) {
                                            i++;
                                            r9 = r9;
                                            if (i == 1) {
                                                ytlVar = cVar2;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r9.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r9.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.g;
                                        ytlVar = ytlVar;
                                        r9 = r9;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ytlVar = itl.b(r9);
                            }
                        }
                        cVar = cVar.f;
                    }
                }
                f = f.I();
                cVar = (f == null || (u470Var2 = f.G) == null) ? null : u470Var2.e;
            }
            puwVar = (puw) ytlVar;
        } else {
            puwVar = null;
        }
        if (puwVar != null) {
            if (!puwVar.z().o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar3 = puwVar.z().f;
            LayoutNode f2 = itl.f(puwVar);
            ArrayList arrayList = null;
            while (f2 != null) {
                if ((f2.G.f.e & 2097152) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.d & 2097152) != 0) {
                            q630.c cVar4 = cVar3;
                            ci50 ci50Var = null;
                            while (cVar4 != null) {
                                if (cVar4 instanceof puw) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar4);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (cVar4.d & 2097152) != 0 && (cVar4 instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar5 = ((ytl) cVar4).q; cVar5 != null; cVar5 = cVar5.g) {
                                        if ((cVar5.d & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar4 = cVar5;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar4 != null) {
                                                    ci50Var.b(cVar4);
                                                    cVar4 = null;
                                                }
                                                ci50Var.b(cVar5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar4 = itl.b(ci50Var);
                            }
                        }
                        cVar3 = cVar3.f;
                    }
                }
                f2 = f2.I();
                cVar3 = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
            }
            puwVar.J0();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((puw) arrayList.get(i3)).J0();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x012f, code lost:
    
        continue;
     */
    @Override // xsna.fwr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean s(int i, zhf0 zhf0Var, izs<? super dxr, Boolean> izsVar) {
        boolean a2;
        dxr dxrVar;
        u470 u470Var;
        rwr rwrVar;
        rwr rwrVar2;
        dxr dxrVar2 = this.c;
        dxr a3 = ixr.a(dxrVar2);
        int i2 = 4;
        p52 p52Var = this.b;
        boolean z = false;
        if (a3 != null) {
            LayoutDirection layoutDirection = p52Var.getLayoutDirection();
            mwr k2 = a3.k2();
            if (i == 1) {
                rwrVar = k2.b;
            } else if (i == 2) {
                rwrVar = k2.c;
            } else if (i == 5) {
                rwrVar = k2.d;
            } else if (i == 6) {
                rwrVar = k2.e;
            } else if (i == 3) {
                int i3 = ixr.a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                if (i3 == 1) {
                    rwrVar2 = k2.h;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rwrVar2 = k2.i;
                }
                if (rwrVar2 == rwr.b) {
                    rwrVar2 = null;
                }
                if (rwrVar2 == null) {
                    rwrVar = k2.f;
                }
                rwrVar = rwrVar2;
            } else if (i == 4) {
                int i4 = ixr.a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                if (i4 == 1) {
                    rwrVar2 = k2.i;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rwrVar2 = k2.h;
                }
                if (rwrVar2 == rwr.b) {
                    rwrVar2 = null;
                }
                if (rwrVar2 == null) {
                    rwrVar = k2.g;
                }
                rwrVar = rwrVar2;
            } else {
                if (i != 7 && i != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                np9 np9Var = new np9(i);
                fwr focusOwner = itl.g(a3).getFocusOwner();
                dxr b2 = focusOwner.b();
                if (i == 7) {
                    k2.j.invoke(np9Var);
                } else {
                    k2.k.invoke(np9Var);
                }
                rwrVar = np9Var.b ? rwr.c : b2 != focusOwner.b() ? rwr.d : rwr.b;
            }
            rwr rwrVar3 = rwr.c;
            if (!epx.f(rwrVar, rwrVar3)) {
                if (epx.f(rwrVar, rwr.d)) {
                    dxr a4 = ixr.a(dxrVar2);
                    if (a4 != null) {
                        return izsVar.invoke(a4);
                    }
                } else {
                    rwr rwrVar4 = rwr.b;
                    if (!epx.f(rwrVar, rwrVar4)) {
                        if (rwrVar == rwrVar4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (rwrVar == rwrVar3) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        ci50<uwr> ci50Var = rwrVar.a;
                        int i5 = ci50Var.d;
                        if (i5 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            uwr[] uwrVarArr = ci50Var.b;
                            boolean z2 = false;
                            for (int i6 = 0; i6 < i5; i6++) {
                                uwr uwrVar = uwrVarArr[i6];
                                if (!uwrVar.z().o) {
                                    uzw.b("visitChildren called on an unattached node");
                                }
                                ci50 ci50Var2 = new ci50(new q630.c[16]);
                                q630.c cVar = uwrVar.z().g;
                                if (cVar == null) {
                                    itl.a(ci50Var2, uwrVar.z());
                                } else {
                                    ci50Var2.b(cVar);
                                }
                                while (true) {
                                    int i7 = ci50Var2.d;
                                    if (i7 != 0) {
                                        q630.c cVar2 = (q630.c) ci50Var2.k(i7 - 1);
                                        if ((cVar2.e & 1024) == 0) {
                                            itl.a(ci50Var2, cVar2);
                                        } else {
                                            while (true) {
                                                if (cVar2 == null) {
                                                    break;
                                                }
                                                if ((cVar2.d & 1024) != 0) {
                                                    ci50 ci50Var3 = null;
                                                    while (cVar2 != null) {
                                                        if (cVar2 instanceof dxr) {
                                                            if (izsVar.invoke((dxr) cVar2).booleanValue()) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        } else if ((cVar2.d & 1024) != 0 && (cVar2 instanceof ytl)) {
                                                            int i8 = 0;
                                                            for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                                                if ((cVar3.d & 1024) != 0) {
                                                                    i8++;
                                                                    if (i8 == 1) {
                                                                        cVar2 = cVar3;
                                                                    } else {
                                                                        if (ci50Var3 == null) {
                                                                            ci50Var3 = new ci50(new q630.c[16]);
                                                                        }
                                                                        if (cVar2 != null) {
                                                                            ci50Var3.b(cVar2);
                                                                            cVar2 = null;
                                                                        }
                                                                        ci50Var3.b(cVar3);
                                                                    }
                                                                }
                                                            }
                                                            if (i8 == 1) {
                                                            }
                                                        }
                                                        cVar2 = itl.b(ci50Var3);
                                                    }
                                                } else {
                                                    cVar2 = cVar2.g;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z = z2;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
            return null;
        }
        a3 = null;
        LayoutDirection layoutDirection2 = p52Var.getLayoutDirection();
        b bVar = new b(a3, this, izsVar);
        if (i == 1 || i == 2) {
            if (i == 1) {
                a2 = mi80.b(dxrVar2, bVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a2 = mi80.a(dxrVar2, bVar);
            }
            return Boolean.valueOf(a2);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return gtp0.k(dxrVar2, i, zhf0Var, bVar);
        }
        if (i == 7) {
            int i9 = ixr.a.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 3;
            }
            dxr a5 = ixr.a(dxrVar2);
            if (a5 != null) {
                return gtp0.k(a5, i2, zhf0Var, bVar);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) ivr.a(i))).toString());
        }
        dxr a6 = ixr.a(dxrVar2);
        if (a6 != null) {
            if (!a6.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar4 = a6.b.f;
            LayoutNode f = itl.f(a6);
            loop5: while (f != null) {
                if ((f.G.f.e & 1024) != 0) {
                    while (cVar4 != null) {
                        if ((cVar4.d & 1024) != 0) {
                            q630.c cVar5 = cVar4;
                            ci50 ci50Var4 = null;
                            while (cVar5 != null) {
                                if (cVar5 instanceof dxr) {
                                    dxr dxrVar3 = (dxr) cVar5;
                                    if (dxrVar3.k2().a) {
                                        dxrVar = dxrVar3;
                                        break loop5;
                                    }
                                } else if ((cVar5.d & 1024) != 0 && (cVar5 instanceof ytl)) {
                                    int i10 = 0;
                                    for (q630.c cVar6 = ((ytl) cVar5).q; cVar6 != null; cVar6 = cVar6.g) {
                                        if ((cVar6.d & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar5 = cVar6;
                                            } else {
                                                if (ci50Var4 == null) {
                                                    ci50Var4 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar5 != null) {
                                                    ci50Var4.b(cVar5);
                                                    cVar5 = null;
                                                }
                                                ci50Var4.b(cVar6);
                                            }
                                        }
                                    }
                                    if (i10 != 1) {
                                        cVar5 = itl.b(ci50Var4);
                                    }
                                }
                                cVar5 = itl.b(ci50Var4);
                            }
                        }
                        cVar4 = cVar4.f;
                    }
                }
                f = f.I();
                cVar4 = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
            }
        }
        dxrVar = null;
        if (dxrVar != null && !dxrVar.equals(dxrVar2)) {
            z = ((Boolean) bVar.invoke(dxrVar)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r13v11, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r13v15, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r13v16, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    @Override // xsna.fwr
    public final boolean t(smg0 smg0Var, r52 r52Var) {
        rmg0 rmg0Var;
        u470 u470Var;
        boolean z;
        ytl ytlVar;
        u470 u470Var2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        dxr a2 = ixr.a(this.c);
        if (a2 != null) {
            if (!a2.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = a2.b;
            LayoutNode f = itl.f(a2);
            loop0: while (true) {
                if (f == null) {
                    ytlVar = 0;
                    break;
                }
                if ((f.G.f.e & 16384) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & 16384) != 0) {
                            ?? r7 = 0;
                            ytlVar = cVar;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof rmg0) {
                                    break loop0;
                                }
                                if ((ytlVar.d & 16384) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar2 = ytlVar.q;
                                    int i = 0;
                                    ytlVar = ytlVar;
                                    r7 = r7;
                                    while (cVar2 != null) {
                                        if ((cVar2.d & 16384) != 0) {
                                            i++;
                                            r7 = r7;
                                            if (i == 1) {
                                                s3q0 s3q0Var = s3q0.a;
                                                ytlVar = cVar2;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r7.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r7.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.g;
                                        ytlVar = ytlVar;
                                        r7 = r7;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ytlVar = itl.b(r7);
                            }
                        }
                        cVar = cVar.f;
                    }
                }
                f = f.I();
                cVar = (f == null || (u470Var2 = f.G) == null) ? null : u470Var2.e;
            }
            rmg0Var = (rmg0) ytlVar;
        } else {
            rmg0Var = null;
        }
        if (rmg0Var != null) {
            if (!rmg0Var.z().o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar3 = rmg0Var.z().f;
            LayoutNode f2 = itl.f(rmg0Var);
            ArrayList arrayList = null;
            while (f2 != null) {
                if ((f2.G.f.e & 16384) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.d & 16384) != 0) {
                            q630.c cVar4 = cVar3;
                            ci50 ci50Var = null;
                            while (cVar4 != null) {
                                if (cVar4 instanceof rmg0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar4);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (cVar4.d & 16384) != 0 && (cVar4 instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar5 = ((ytl) cVar4).q; cVar5 != null; cVar5 = cVar5.g) {
                                        if ((cVar5.d & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                s3q0 s3q0Var2 = s3q0.a;
                                                cVar4 = cVar5;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar4 != null) {
                                                    ci50Var.b(cVar4);
                                                    cVar4 = null;
                                                }
                                                ci50Var.b(cVar5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar4 = itl.b(ci50Var);
                            }
                        }
                        cVar3 = cVar3.f;
                    }
                }
                f2 = f2.I();
                cVar3 = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
            }
            if (arrayList != null) {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = size - 1;
                        ((rmg0) arrayList.get(size)).getClass();
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                }
                s3q0 s3q0Var3 = s3q0.a;
            }
            ytl z2 = rmg0Var.z();
            ?? r1 = 0;
            while (z2 != 0) {
                if (z2 instanceof rmg0) {
                } else if ((z2.d & 16384) != 0 && (z2 instanceof ytl)) {
                    q630.c cVar6 = z2.q;
                    int i4 = 0;
                    r1 = r1;
                    z2 = z2;
                    while (cVar6 != null) {
                        if ((cVar6.d & 16384) != 0) {
                            i4++;
                            r1 = r1;
                            if (i4 == 1) {
                                s3q0 s3q0Var4 = s3q0.a;
                                z2 = cVar6;
                            } else {
                                if (r1 == 0) {
                                    r1 = new ci50(new q630.c[16]);
                                }
                                if (z2 != 0) {
                                    r1.b(z2);
                                    z2 = 0;
                                }
                                r1.b(cVar6);
                            }
                        }
                        cVar6 = cVar6.g;
                        r1 = r1;
                        z2 = z2;
                    }
                    if (i4 == 1) {
                    }
                }
                z2 = itl.b(r1);
            }
            if (((Boolean) r52Var.invoke()).booleanValue()) {
                return true;
            }
            ytl z3 = rmg0Var.z();
            ?? r14 = 0;
            while (z3 != 0) {
                if (z3 instanceof rmg0) {
                } else if ((z3.d & 16384) != 0 && (z3 instanceof ytl)) {
                    q630.c cVar7 = z3.q;
                    int i5 = 0;
                    z3 = z3;
                    r14 = r14;
                    while (cVar7 != null) {
                        if ((cVar7.d & 16384) != 0) {
                            i5++;
                            r14 = r14;
                            if (i5 == 1) {
                                s3q0 s3q0Var5 = s3q0.a;
                                z3 = cVar7;
                            } else {
                                if (r14 == 0) {
                                    r14 = new ci50(new q630.c[16]);
                                }
                                if (z3 != 0) {
                                    r14.b(z3);
                                    z3 = 0;
                                }
                                r14.b(cVar7);
                            }
                        }
                        cVar7 = cVar7.g;
                        z3 = z3;
                        r14 = r14;
                    }
                    if (i5 == 1) {
                    }
                }
                z3 = itl.b(r14);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((rmg0) arrayList.get(i6)).getClass();
                }
                s3q0 s3q0Var6 = s3q0.a;
            }
            s3q0 s3q0Var7 = s3q0.a;
        }
        return false;
    }

    @Override // xsna.fwr
    public final boolean u() {
        dxr dxrVar = this.c;
        if (dxrVar.o) {
            if (!dxrVar.b.o) {
                uzw.b("visitSubtreeIf called on an unattached node");
            }
            ci50 ci50Var = new ci50(new q630.c[16]);
            q630.c cVar = dxrVar.b;
            q630.c cVar2 = cVar.g;
            if (cVar2 == null) {
                itl.a(ci50Var, cVar);
            } else {
                ci50Var.b(cVar2);
            }
            while (true) {
                int i = ci50Var.d;
                if (i == 0) {
                    break;
                }
                q630.c cVar3 = (q630.c) ci50Var.k(i - 1);
                if ((cVar3.e & 1024) != 0) {
                    for (q630.c cVar4 = cVar3; cVar4 != null && cVar4.o; cVar4 = cVar4.g) {
                        if ((cVar4.d & 1024) != 0) {
                            q630.c cVar5 = cVar4;
                            ci50 ci50Var2 = null;
                            while (cVar5 != null) {
                                if (cVar5 instanceof dxr) {
                                    dxr dxrVar2 = (dxr) cVar5;
                                    if (dxrVar2.o && dxrVar2.k2().a) {
                                        return true;
                                    }
                                } else if ((cVar5.d & 1024) != 0 && (cVar5 instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar6 = ((ytl) cVar5).q; cVar6 != null; cVar6 = cVar6.g) {
                                        if ((cVar6.d & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar5 = cVar6;
                                            } else {
                                                if (ci50Var2 == null) {
                                                    ci50Var2 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar5 != null) {
                                                    ci50Var2.b(cVar5);
                                                    cVar5 = null;
                                                }
                                                ci50Var2.b(cVar6);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar5 = itl.b(ci50Var2);
                            }
                        }
                    }
                }
                itl.a(ci50Var, cVar3);
            }
        }
        return false;
    }

    @Override // xsna.fwr
    public final boolean v() {
        dxr dxrVar = this.c;
        if (dxrVar.o) {
            if (!dxrVar.b.o) {
                uzw.b("visitSubtreeIf called on an unattached node");
            }
            ci50 ci50Var = new ci50(new q630.c[16]);
            q630.c cVar = dxrVar.b;
            q630.c cVar2 = cVar.g;
            if (cVar2 == null) {
                itl.a(ci50Var, cVar);
            } else {
                ci50Var.b(cVar2);
            }
            while (true) {
                int i = ci50Var.d;
                if (i == 0) {
                    break;
                }
                q630.c cVar3 = (q630.c) ci50Var.k(i - 1);
                if ((cVar3.e & 1024) != 0) {
                    for (q630.c cVar4 = cVar3; cVar4 != null && cVar4.o; cVar4 = cVar4.g) {
                        if ((cVar4.d & 1024) != 0) {
                            q630.c cVar5 = cVar4;
                            ci50 ci50Var2 = null;
                            while (cVar5 != null) {
                                if (cVar5 instanceof dxr) {
                                    dxr dxrVar2 = (dxr) cVar5;
                                    if (dxrVar2.o) {
                                        mwr k2 = dxrVar2.k2();
                                        if (dxrVar2.o && !dxrVar2.p && k2.a) {
                                            return true;
                                        }
                                    }
                                } else if ((cVar5.d & 1024) != 0 && (cVar5 instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar6 = ((ytl) cVar5).q; cVar6 != null; cVar6 = cVar6.g) {
                                        if ((cVar6.d & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar5 = cVar6;
                                            } else {
                                                if (ci50Var2 == null) {
                                                    ci50Var2 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar5 != null) {
                                                    ci50Var2.b(cVar5);
                                                    cVar5 = null;
                                                }
                                                ci50Var2.b(cVar6);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar5 = itl.b(ci50Var2);
                            }
                        }
                    }
                }
                itl.a(ci50Var, cVar3);
            }
        }
        return false;
    }

    @Override // xsna.fwr
    public final zhf0 w() {
        dxr a2 = ixr.a(this.c);
        if (a2 != null) {
            return ixr.b(a2);
        }
        return null;
    }

    @Override // xsna.fwr
    public final void x() {
        gxr.a(this.c, true);
        if (b() != null) {
            dxr b2 = b();
            k(null);
            if (b2 != null) {
                b2.j2(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
        }
    }

    @Override // xsna.vvr
    public final void y(boolean z) {
        n(8, z, true);
    }

    public final boolean z(boolean z) {
        u470 u470Var;
        if (b() != null) {
            dxr b2 = b();
            k(null);
            if (b2 != null) {
                b2.j2(FocusStateImpl.Active, FocusStateImpl.Inactive);
                if (!b2.b.o) {
                    uzw.b("visitAncestors called on an unattached node");
                }
                q630.c cVar = b2.b.f;
                LayoutNode f = itl.f(b2);
                while (f != null) {
                    if ((f.G.f.e & 1024) != 0) {
                        while (cVar != null) {
                            if ((cVar.d & 1024) != 0) {
                                ci50 ci50Var = null;
                                q630.c cVar2 = cVar;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof dxr) {
                                        ((dxr) cVar2).j2(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                    } else if ((cVar2.d & 1024) != 0 && (cVar2 instanceof ytl)) {
                                        int i = 0;
                                        for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                            if ((cVar3.d & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    cVar2 = cVar3;
                                                } else {
                                                    if (ci50Var == null) {
                                                        ci50Var = new ci50(new q630.c[16]);
                                                    }
                                                    if (cVar2 != null) {
                                                        ci50Var.b(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    ci50Var.b(cVar3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    cVar2 = itl.b(ci50Var);
                                }
                            }
                            cVar = cVar.f;
                        }
                    }
                    f = f.I();
                    cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
                }
            }
        }
        return true;
    }

    @Override // xsna.fwr
    public final void j() {
    }
}
