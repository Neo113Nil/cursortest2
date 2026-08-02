package xsna;

import com.vk.channels.impl.list.g;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.im.ui.fragments.ImStartGroupCallFragment;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.e820;
import xsna.fl6;
import xsna.gpz;
import xsna.ogb;
import xsna.r5p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k5 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((j5) obj2).invoke(obj);
                return;
            case 1:
                ((j5) obj2).invoke(obj);
                return;
            case 2:
                ((j5) obj2).invoke(obj);
                return;
            case 3:
                ((j5) obj2).invoke(obj);
                return;
            case 4:
                ((fl6.k) obj2).invoke(obj);
                return;
            case 5:
                ((j5) obj2).invoke(obj);
                return;
            case 6:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj2;
                ogb.b bVar2 = (ogb.b) obj;
                if (!(bVar2 instanceof ogb.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.n(new g.b(((ogb.b.a) bVar2).a));
                return;
            case 7:
                ((yu1) obj2).invoke(obj);
                return;
            case 8:
                xyb xybVar = (xyb) obj2;
                gpz.a aVar = (gpz.a) obj;
                xybVar.p.compareAndSet(true, false);
                zyb zybVar = xybVar.q;
                xybVar.q = zyb.a(zybVar, zybVar.a.Ab(aVar.c), false, false, xybVar.q.i.b(aVar.b), aVar.d, null, 1278);
                xybVar.X0();
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    xybVar.a1(azbVar);
                    return;
                }
                return;
            case 9:
                ((j5) obj2).invoke(obj);
                return;
            case 10:
                ((j5) obj2).invoke(obj);
                return;
            case 11:
                ((j5) obj2).invoke(obj);
                return;
            case 12:
                ((j5) obj2).invoke(obj);
                return;
            case 13:
                int i2 = ClipsGridDraftsListFragment.l0;
                ((kz0) obj2).invoke(obj);
                return;
            case 14:
                ((u8) obj2).invoke(obj);
                return;
            case 15:
                ((defpackage.s) obj2).invoke(obj);
                return;
            case 16:
                ((defpackage.s) obj2).invoke(obj);
                return;
            case 17:
                ((ddm) obj2).invoke(obj);
                return;
            case 18:
                ((kp1) obj2).invoke(obj);
                return;
            case 19:
                ((r5p.a) obj2).invoke(obj);
                return;
            case 20:
                ((defpackage.s) obj2).invoke(obj);
                return;
            case 21:
                com.vk.folders.impl.configure.d dVar = (com.vk.folders.impl.configure.d) obj2;
                dVar.q(new cq3(11, (gtm) obj, dVar));
                return;
            case 22:
                ((defpackage.s) obj2).invoke(obj);
                return;
            case 23:
                ((kz0) obj2).invoke(obj);
                return;
            case 24:
                ((qzv) obj2).a((Set) obj);
                return;
            case 25:
                int i3 = ImStartGroupCallFragment.f0;
                ((kz0) obj2).invoke(obj);
                return;
            case 26:
                ((defpackage.s) obj2).invoke(obj);
                return;
            case 27:
                ((e820.e) obj2).invoke(obj);
                return;
            case 28:
                ((p010) obj2).invoke(obj);
                return;
            default:
                ((bv5) obj2).invoke(obj);
                return;
        }
    }
}
