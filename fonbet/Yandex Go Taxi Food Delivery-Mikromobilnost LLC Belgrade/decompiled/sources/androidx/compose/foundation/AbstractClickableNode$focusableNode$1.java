package androidx.compose.foundation;

import defpackage.gy40;
import defpackage.jxe0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements tls {
    public final void i(boolean z) {
        a aVar = (a) this.receiver;
        gy40 gy40Var = aVar.I;
        if (z) {
            aVar.O0();
            return;
        }
        if (aVar.c != null) {
            Object[] objArr = gy40Var.c;
            long[] jArr = gy40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                tje.N(aVar.getCoroutineScope(), null, null, new AbstractClickableNode$onFocusChange$1$1(aVar, (jxe0) objArr[(i << 3) + i3], null), 3);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            jxe0 jxe0Var = aVar.K;
            if (jxe0Var != null) {
                tje.N(aVar.getCoroutineScope(), null, null, new AbstractClickableNode$onFocusChange$2$1(aVar, jxe0Var, null), 3);
            }
        }
        gy40Var.a();
        aVar.K = null;
        aVar.P0();
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
