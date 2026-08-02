package defpackage;

import android.util.SparseArray;
import com.yandex.go.benefits_center.benefits.router.d;
import com.yandex.go.profile.ui.ProfileFlexModalView;
import flex.engine.a;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class jn5 implements szl {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jn5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        a aVar;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zn5 zn5Var = (zn5) obj;
                d dVar = (d) obj2;
                if (!(neoVar instanceof w0m)) {
                    if (neoVar instanceof y0m) {
                        tm5 tm5Var = dVar.D;
                        String str = zn5Var.a;
                        tm5Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("open_reason", str);
                        tm5Var.a.a("BenefitsCenter.Promocodes.Loaded", hashMap, 1, new HashMap());
                        break;
                    }
                } else {
                    tm5 tm5Var2 = dVar.D;
                    String str2 = zn5Var.a;
                    tm5Var2.getClass();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("open_reason", str2);
                    tm5Var2.a.a("BenefitsCenter.Promocodes.Error", hashMap2, 1, new HashMap());
                    break;
                }
                break;
            default:
                ProfileFlexModalView profileFlexModalView = (ProfileFlexModalView) obj2;
                if (neoVar instanceof s0m) {
                    profileFlexModalView.restoreHierarchyState((SparseArray) obj);
                    aVar = profileFlexModalView.documentEngine;
                    ((ArrayList) aVar.P.c).remove(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.szl
    public final void dispose() {
        int i = this.a;
    }
}
