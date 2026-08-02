package defpackage;

import com.yandex.messaging.internal.LocalMessageRef;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class ex10 {
    public uv10 a;

    public final boolean a(Long l, Long l2, Long l3, LocalMessageRef localMessageRef) {
        boolean z;
        boolean z2;
        if (this.a == null) {
            return false;
        }
        sv10 sv10Var = new sv10(l.longValue(), l2, l3, localMessageRef);
        boolean contains = this.a.b.a.contains(sv10Var);
        uv10 uv10Var = this.a;
        if (contains) {
            swh swhVar = uv10Var.b;
            zq60 zq60Var = uv10Var.c;
            if (!swhVar.a.remove(sv10Var)) {
                sv10Var = null;
            }
            if (sv10Var != null) {
                zq60Var.getClass();
                ArrayList arrayList = zq60Var.a;
                zq60Var.b++;
                int size = arrayList.size();
                int i = 0;
                boolean z3 = false;
                while (true) {
                    int i2 = i;
                    while (i2 < size && arrayList.get(i2) == null) {
                        i2++;
                    }
                    if (i2 < size) {
                        z = true;
                    } else {
                        if (!z3) {
                            zq60.a(zq60Var);
                            z3 = true;
                        }
                        z = false;
                    }
                    if (z) {
                        while (i < size && arrayList.get(i) == null) {
                            i++;
                        }
                        if (i >= size) {
                            if (!z3) {
                                zq60.a(zq60Var);
                            }
                            ny61.p();
                            return false;
                        }
                        ((tv10) arrayList.get(i)).onMessageUnselected(sv10Var.a, sv10Var.d);
                        i++;
                    } else {
                        uv10Var.c();
                        if (!uv10Var.b()) {
                            zq60Var.getClass();
                            zq60Var.b++;
                            ArrayList arrayList2 = zq60Var.a;
                            int size2 = arrayList2.size();
                            int i3 = 0;
                            boolean z4 = false;
                            while (true) {
                                int i4 = i3;
                                while (i4 < size2 && arrayList2.get(i4) == null) {
                                    i4++;
                                }
                                if (i4 < size2) {
                                    z2 = true;
                                } else {
                                    if (!z4) {
                                        zq60.a(zq60Var);
                                        z4 = true;
                                    }
                                    z2 = false;
                                }
                                if (!z2) {
                                    break;
                                }
                                while (i3 < size2 && arrayList2.get(i3) == null) {
                                    i3++;
                                }
                                if (i3 >= size2) {
                                    if (!z4) {
                                        zq60.a(zq60Var);
                                    }
                                    ny61.p();
                                    return false;
                                }
                                ((tv10) arrayList2.get(i3)).onExitSelectionMode();
                                i3++;
                            }
                        }
                    }
                }
            }
        } else {
            uv10Var.d(sv10Var);
        }
        return true;
    }
}
