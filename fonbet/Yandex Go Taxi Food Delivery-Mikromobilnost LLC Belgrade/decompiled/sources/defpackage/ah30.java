package defpackage;

import androidx.compose.foundation.lazy.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes6.dex */
public final class ah30 implements vpr {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public ah30(int i, oz40 oz40Var, m3u0 m3u0Var, b bVar) {
        this.c = m3u0Var;
        this.w = oz40Var;
        this.x = bVar;
        this.b = i;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                int i3 = ((dtr0) obj).a;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj4;
                if (ref$BooleanRef2.element) {
                    if (i3 != -2) {
                        z = i3 != i2;
                    }
                    ((tls) obj2).invoke(new sh30(z, ref$BooleanRef.element));
                    ref$BooleanRef.element = false;
                } else {
                    ref$BooleanRef2.element = true;
                }
                return zy11Var;
            default:
                return (!((Boolean) ((m3u0) obj4).getValue()).booleanValue() && ((Boolean) ((oz40) obj3).getValue()).booleanValue()) ? ((b) obj2).l(i2, (int) ((Number) obj).floatValue(), continuation) : zy11Var;
        }
    }

    public ah30(Ref$BooleanRef ref$BooleanRef, int i, tls tlsVar, Ref$BooleanRef ref$BooleanRef2) {
        this.c = ref$BooleanRef;
        this.b = i;
        this.x = tlsVar;
        this.w = ref$BooleanRef2;
    }
}
