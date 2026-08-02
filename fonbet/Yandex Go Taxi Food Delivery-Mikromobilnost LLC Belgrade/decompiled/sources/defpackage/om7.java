package defpackage;

import androidx.camera.camera2.internal.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class om7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jyq0 w;
    public final /* synthetic */ xi21 x;
    public final /* synthetic */ lru0 y;
    public final /* synthetic */ List z;

    public /* synthetic */ om7(l lVar, String str, jyq0 jyq0Var, xi21 xi21Var, lru0 lru0Var, ArrayList arrayList, int i) {
        this.a = i;
        this.b = lVar;
        this.c = str;
        this.w = jyq0Var;
        this.x = xi21Var;
        this.y = lru0Var;
        this.z = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("Use case ");
                String str = this.c;
                sb.append(str);
                sb.append(" UPDATED");
                lVar.w(sb.toString());
                lVar.a.f(str, this.w, this.x, this.y, this.z);
                lVar.M();
                break;
            default:
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str2 = this.c;
                sb2.append(str2);
                sb2.append(" ACTIVE");
                lVar.w(sb2.toString());
                LinkedHashMap linkedHashMap = lVar.a.a;
                ti21 ti21Var = (ti21) linkedHashMap.get(str2);
                jyq0 jyq0Var = this.w;
                xi21 xi21Var = this.x;
                lru0 lru0Var = this.y;
                List list = this.z;
                if (ti21Var == null) {
                    ti21Var = new ti21(jyq0Var, xi21Var, lru0Var, list);
                    linkedHashMap.put(str2, ti21Var);
                }
                ti21Var.f = true;
                lVar.a.f(str2, jyq0Var, xi21Var, lru0Var, list);
                lVar.M();
                break;
        }
    }
}
