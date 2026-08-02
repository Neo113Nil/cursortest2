package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class prd implements oza0 {
    public final /* synthetic */ int a;
    public final oza0 b;
    public final Object c;

    public prd(oza0 oza0Var) {
        this.a = 0;
        this.b = oza0Var;
        this.c = new ArrayList(EmptyList.a);
    }

    @Override // defpackage.oza0
    public final void d(final List list, final dya0 dya0Var) {
        int i = this.a;
        oza0 oza0Var = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) this.c).iterator();
                if (it.hasNext()) {
                    b64.D(it.next());
                    throw null;
                }
                oza0Var.d(list, dya0Var);
                return;
            case 1:
                ((prd) oza0Var).d(list, new og7(1, dya0Var, this));
                return;
            case 2:
                ((prd) oza0Var).d(list, new dya0() { // from class: df60
                    @Override // defpackage.dya0
                    public final void a(List list2) {
                        Object obj;
                        List<cya0> list3 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        for (cya0 cya0Var : list3) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj = it2.next();
                                    if (jl40.l(((mya0) obj).a, cya0Var)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            mya0 mya0Var = (mya0) obj;
                            if (mya0Var == null) {
                                mya0Var = new mya0(cya0Var, false, 4);
                            }
                            arrayList.add(mya0Var);
                        }
                        x8o x8oVar = (x8o) this.c;
                        String X = a.X(list3, null, null, null, new fd60(1), 31);
                        String X2 = a.X(list2, null, null, null, null, 63);
                        String X3 = a.X(arrayList, null, null, null, null, 63);
                        StringBuilder v = b64.v("normalize: requestPermissionList([", X, "], [", X2, ") = [");
                        v.append(X3);
                        v.append("}]");
                        x8oVar.c("Permissions", v.toString());
                        dya0.this.a(arrayList);
                    }
                });
                return;
            default:
                ((prd) oza0Var).d(list, new og7(2, dya0Var, this));
                return;
        }
    }

    @Override // defpackage.oza0
    public final void e(og7 og7Var) {
        switch (this.a) {
            case 0:
                ai91.d(this, og7Var);
                break;
            case 1:
                ai91.d(this, og7Var);
                break;
            case 2:
                ai91.d(this, og7Var);
                break;
            default:
                ai91.d(this, og7Var);
                break;
        }
    }

    public /* synthetic */ prd(oza0 oza0Var, x8o x8oVar, int i) {
        this.a = i;
        this.b = oza0Var;
        this.c = x8oVar;
    }

    public prd(prd prdVar) {
        this.a = 3;
        this.b = prdVar;
        this.c = new ArrayList();
    }
}
