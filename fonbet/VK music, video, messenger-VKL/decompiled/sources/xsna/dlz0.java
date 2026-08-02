package xsna;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class dlz0 extends ilz0 {
    public final HashMap c;
    public final /* synthetic */ jlz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlz0(jlz0 jlz0Var, HashMap hashMap) {
        super(jlz0Var);
        this.d = jlz0Var;
        this.c = hashMap;
    }

    @Override // xsna.ilz0
    public final void a() {
        znz0 znz0Var;
        jlz0 jlz0Var = this.d;
        com.google.android.gms.common.a aVar = jlz0Var.d;
        amz0 amz0Var = jlz0Var.a;
        Context context = jlz0Var.c;
        npz0 npz0Var = new npz0(aVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = this.c;
        for (a.f fVar : hashMap.keySet()) {
            if (!fVar.requiresGooglePlayServices() || ((alz0) hashMap.get(fVar)).c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = 0;
        int i2 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                i2 = npz0Var.a(context, (a.f) arrayList.get(i));
                i++;
                if (i2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                i2 = npz0Var.a(context, (a.f) arrayList2.get(i));
                i++;
                if (i2 == 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            blz0 blz0Var = new blz0(this, jlz0Var, new ConnectionResult(i2, null));
            zlz0 zlz0Var = amz0Var.g;
            zlz0Var.sendMessage(zlz0Var.obtainMessage(1, blz0Var));
            return;
        }
        if (jlz0Var.m && (znz0Var = jlz0Var.k) != null) {
            znz0Var.l();
        }
        for (a.f fVar2 : hashMap.keySet()) {
            rd6.c cVar = (rd6.c) hashMap.get(fVar2);
            if (!fVar2.requiresGooglePlayServices() || npz0Var.a(context, fVar2) == 0) {
                fVar2.connect(cVar);
            } else {
                clz0 clz0Var = new clz0(this, jlz0Var, cVar);
                zlz0 zlz0Var2 = amz0Var.g;
                zlz0Var2.sendMessage(zlz0Var2.obtainMessage(1, clz0Var));
            }
        }
    }
}
