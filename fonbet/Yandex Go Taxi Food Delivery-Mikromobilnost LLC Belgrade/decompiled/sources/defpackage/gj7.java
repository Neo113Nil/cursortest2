package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class gj7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba20 b;

    public /* synthetic */ gj7(ba20 ba20Var, int i) {
        this.a = i;
        this.b = ba20Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ba20 ba20Var = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th instanceof SecurityException) {
                    ba20Var.error("FOREGROUND_SERVICE_MICROPHONE_PERMISSION_DENIED", "FOREGROUND_SERVICE_MICROPHONE permission is required", null);
                    break;
                } else {
                    ba20Var.error("SERVICE_START_FAILED", "Failed to start foreground service: " + th.getMessage(), null);
                    break;
                }
            default:
                Set<lem> set = (Set) obj;
                ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                for (lem lemVar : set) {
                    arrayList.add(b.h(new Pair("id", lemVar.a), new Pair("type", lemVar.b.getValue())));
                }
                ba20Var.success(arrayList);
                break;
        }
        return zy11Var;
    }
}
