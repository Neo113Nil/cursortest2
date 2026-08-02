package androidx.compose.ui.node;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.hz40;
import defpackage.iz40;
import defpackage.o3c0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo3c0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "invoke", "(Lo3c0;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
public final class LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 extends Lambda implements tls {
    public static final LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 w = new LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        o3c0 o3c0Var = (o3c0) obj;
        if (o3c0Var.isValidOwnerScope()) {
            LookaheadCapablePlaceable lookaheadCapablePlaceable = o3c0Var.b;
            if (!lookaheadCapablePlaceable.D) {
                tls a = o3c0Var.a.a();
                hz40 hz40Var = lookaheadCapablePlaceable.G;
                if (a != null) {
                    lookaheadCapablePlaceable.E0(o3c0Var, 9223372034707292159L, 0L);
                    lookaheadCapablePlaceable.z = a;
                } else if (hz40Var != null) {
                    Object[] objArr = hz40Var.c;
                    long[] jArr = hz40Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        lookaheadCapablePlaceable.O0((iz40) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                    hz40Var.h();
                }
            }
        }
        return zy11.a;
    }
}
