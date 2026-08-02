package defpackage;

import android.app.Activity;
import android.content.Context;
import com.fluttercandies.photo_manager.core.b;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class ihb0 implements tsr, r30 {
    public b a;
    public final t0b0 b = new t0b0();
    public l40 c;
    public hhb0 w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [hhb0, ozc0] */
    public final void a(l40 l40Var) {
        l40 l40Var2 = this.c;
        if (l40Var2 != null) {
            b(l40Var2);
        }
        this.c = l40Var;
        b bVar = this.a;
        if (bVar != null) {
            bVar.a((Activity) ((wrr) l40Var).b);
        }
        final t0b0 t0b0Var = this.b;
        ?? r0 = new ozc0() { // from class: hhb0
            @Override // defpackage.ozc0
            public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                t0b0 t0b0Var2 = t0b0.this;
                ArrayList arrayList = t0b0Var2.d;
                ArrayList arrayList2 = t0b0Var2.f;
                ArrayList arrayList3 = t0b0Var2.e;
                if (i == 3001 || i == 3002) {
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        wfz.l("Returned permissions: " + strArr[i2]);
                        int i3 = iArr[i2];
                        if (i3 == -1) {
                            arrayList3.add(strArr[i2]);
                        } else if (i3 == 0) {
                            arrayList2.add(strArr[i2]);
                        }
                    }
                    wfz.d("dealResult: ");
                    wfz.d("  permissions: " + strArr);
                    wfz.d("  grantResults: " + iArr);
                    wfz.d("  deniedPermissionsList: " + arrayList3);
                    wfz.d("  grantedPermissionsList: " + arrayList2);
                    lya0 lya0Var = t0b0Var2.c;
                    lya0Var.getClass();
                    if (lya0Var instanceof kya0) {
                        t0b0Var2.c.b(t0b0Var2, t0b0Var2.b, arrayList, arrayList3, arrayList2, i);
                    } else {
                        boolean isEmpty = arrayList3.isEmpty();
                        m0b0 m0b0Var = t0b0Var2.g;
                        if (isEmpty) {
                            m0b0Var.f();
                        } else {
                            m0b0Var.i();
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList3.clear();
                }
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                }
                return false;
            }
        };
        this.w = r0;
        wrr wrrVar = (wrr) l40Var;
        wrrVar.b(r0);
        b bVar2 = this.a;
        if (bVar2 != null) {
            wrrVar.a(bVar2.w);
            wrrVar.a(bVar2.x);
            wrrVar.a(bVar2.y);
        }
    }

    public final void b(l40 l40Var) {
        hhb0 hhb0Var = this.w;
        if (hhb0Var != null) {
            ((HashSet) ((wrr) l40Var).w).remove(hhb0Var);
        }
        b bVar = this.a;
        if (bVar != null) {
            wrr wrrVar = (wrr) l40Var;
            wrrVar.k(bVar.w);
            wrrVar.k(bVar.x);
            wrrVar.k(bVar.y);
        }
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        a(l40Var);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        Context context = ssrVar.a;
        tt5 tt5Var = ssrVar.c;
        b bVar = new b(context, tt5Var, this.b);
        new ea20(tt5Var, "com.fluttercandies/photo_manager").b(bVar);
        this.a = bVar;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        l40 l40Var = this.c;
        if (l40Var != null) {
            b(l40Var);
        }
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(null);
        }
        this.c = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(null);
        }
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.a = null;
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        a(l40Var);
    }
}
