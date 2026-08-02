package defpackage;

import com.yandex.go.address.models.ZoneAddress;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class bc4 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ bc4(int i, Ref$ObjectRef ref$ObjectRef) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.util.Map] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        switch (i) {
            case 0:
                ZoneAddress zoneAddress = ((d0l0) obj).a;
                ref$ObjectRef.element = zoneAddress != null ? zoneAddress.b : 0;
                break;
            case 1:
                d370 d370Var = (d370) obj;
                ref$ObjectRef.element = b.o((Map) ref$ObjectRef.element, new Pair(d370Var.a, d370Var.b));
                break;
            default:
                ref$ObjectRef.element = obj;
                break;
        }
        return zy11Var;
    }
}
