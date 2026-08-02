package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsValidationErrorVersion;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j14 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ j14(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r5 == null) goto L17;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        r0 r0Var;
        Object value;
        Object obj2;
        Object obj3;
        CharSequence a;
        CharSequence a2;
        h5a0 h5a0Var;
        pz3 pz3Var;
        Object obj4;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = null;
        Object obj5 = null;
        r3 = null;
        h5a0 h5a0Var2 = null;
        str = null;
        b bVar = this.b;
        switch (i) {
            case 0:
                Object value2 = ((Result) obj).getValue();
                if (!(value2 instanceof Result.Failure)) {
                    h031 h031Var = (h031) value2;
                    l04 l04Var = bVar.I;
                    qz3 qz3Var = (qz3) ((j04) bVar.X()).a.a();
                    AutoTopupType d = qz3Var != null ? k2b1.d(qz3Var, ((j04) bVar.X()).k) : null;
                    Context context = l04Var.b;
                    ArrayList arrayList = h031Var.c;
                    if (!arrayList.isEmpty()) {
                        z94 z94Var = l04Var.a.e;
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((g031) obj2).c == AutoTopupInputType.AMOUNT) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        g031 g031Var = (g031) obj2;
                        String obj6 = (g031Var == null || (a2 = d.a(context, g031Var.b)) == null) ? null : a2.toString();
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (((g031) obj3).c == AutoTopupInputType.THRESHOLD) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        g031 g031Var2 = (g031) obj3;
                        if (g031Var2 != null && (a = d.a(context, g031Var2.b)) != null) {
                            str = a.toString();
                        }
                        z94.k(z94Var, null, obj6, str, rsa1.c(d), AutotopupEvents$AutoTopupSettingsValidationErrorVersion.V1, 1);
                    }
                    pz40 Y = bVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, h031Var, null, null, null, null, null, null, null, null, null, 262015)));
                }
                return zy11Var;
            case 1:
                String str2 = (String) obj;
                qz3 qz3Var2 = (qz3) ((j04) bVar.X()).a.a();
                if (qz3Var2 != null) {
                    Iterator it3 = qz3Var2.f.a.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = it3.next();
                            if (jl40.l(((h5a0) obj4).getId(), str2)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    h5a0Var = (h5a0) obj4;
                    break;
                }
                qz3 qz3Var3 = (qz3) ((j04) bVar.X()).a.a();
                if (qz3Var3 != null && (pz3Var = qz3Var3.g) != null) {
                    Iterator it4 = pz3Var.c.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            if (jl40.l(((h5a0) next).getId(), str2)) {
                                obj5 = next;
                            }
                        }
                    }
                    h5a0Var2 = (h5a0) obj5;
                }
                if (h5a0Var2 != null) {
                    h5a0Var = h5a0Var2;
                    bVar.a1(h5a0Var);
                    bVar.r0();
                }
                return zy11Var;
            default:
                return j04.a((j04) obj, null, false, null, null, null, null, null, null, new iu3(((j04) bVar.X()).f), null, null, null, null, null, null, null, 261631);
        }
    }
}
