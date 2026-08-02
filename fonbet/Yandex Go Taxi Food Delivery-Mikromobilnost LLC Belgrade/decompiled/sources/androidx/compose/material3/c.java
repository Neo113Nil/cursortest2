package androidx.compose.material3;

import defpackage.aur;
import defpackage.g8w;
import defpackage.ixe0;
import defpackage.jxe0;
import defpackage.kxe0;
import defpackage.ltu;
import defpackage.mtu;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.ztr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class c implements vpr {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ d c;

    public c(ArrayList arrayList, tse tseVar, d dVar) {
        this.a = arrayList;
        this.b = tseVar;
        this.c = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        g8w g8wVar = (g8w) obj;
        boolean z = g8wVar instanceof ltu;
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(g8wVar);
        } else if (g8wVar instanceof mtu) {
            arrayList.remove(((mtu) g8wVar).a);
        } else if (g8wVar instanceof ztr) {
            arrayList.add(g8wVar);
        } else if (g8wVar instanceof aur) {
            arrayList.remove(((aur) g8wVar).a);
        } else if (g8wVar instanceof jxe0) {
            arrayList.add(g8wVar);
        } else if (g8wVar instanceof kxe0) {
            arrayList.remove(((kxe0) g8wVar).a);
        } else if (g8wVar instanceof ixe0) {
            arrayList.remove(((ixe0) g8wVar).a);
        }
        tje.N(this.b, null, null, new FloatingActionButtonElevation$animateElevation$2$1$1$1(this.c, (g8w) kotlin.collections.a.b0(arrayList), null), 3);
        return zy11.a;
    }
}
