package xsna;

import androidx.compose.runtime.a;
import java.util.ArrayList;
import xsna.q630;
import xsna.wve;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class mm8 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mm8(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                nm8 nm8Var = (nm8) this.d;
                x8i0 x8i0Var = (x8i0) this.e;
                con0 con0Var = tm8.l;
                Object obj4 = this.c;
                if (obj4 != con0Var) {
                    fvr.g(nm8Var.c, obj4, x8i0Var.getContext());
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.c;
                wve.a aVar = (wve.a) this.d;
                Object obj5 = (izs) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1606263461, intValue, -1, "com.vk.clips.playlists.folders.list.ui.SelectionDropdown.<anonymous> (ClipPlaylistTargetSelector.kt:104)");
                    }
                    float f = 12;
                    q630.a aVar3 = q630.a.a;
                    f9t.e(txj0.h(aVar3, f), aVar2, 6);
                    aVar2.K(1725929314);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        wve.a aVar4 = (wve.a) arrayList.get(i);
                        boolean f2 = epx.f(aVar4.a, aVar.a);
                        boolean J = aVar2.J(obj5) | aVar2.J(aVar4);
                        Object x = aVar2.x();
                        if (J || x == a.C0011a.a) {
                            x = new com.vk.movika.sdk.base.ui.s(3, obj5, aVar4);
                            aVar2.R(x);
                        }
                        w9d.c(aVar4, f2, (gzs) x, null, aVar2, 0);
                        if (i != e43.h(new wow(arrayList))) {
                            aVar2.K(-1643448243);
                            ck70.b(aVar3, 2, aVar2, 6);
                        } else {
                            aVar2.K(-1648115851);
                            aVar2.j();
                        }
                    }
                    aVar2.j();
                    f9t.e(txj0.h(aVar3, f), aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
