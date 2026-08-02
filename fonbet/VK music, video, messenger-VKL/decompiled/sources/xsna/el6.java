package xsna;

import android.content.DialogInterface;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicCatalogShowAllListVh;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class el6 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ el6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((rul) obj2).getState().onNext((xxd0) obj);
                break;
            case 1:
                ((op1) obj2).invoke(obj);
                break;
            case 2:
                ((j57) obj2).invoke(obj);
                break;
            case 3:
                int i2 = BonusCatalogFragment.f0;
                ((ci7) obj2).invoke(obj);
                break;
            case 4:
                ((op1) obj2).invoke(obj);
                break;
            case 5:
                ((jh9) obj2).invoke(obj);
                break;
            case 6:
                ((op1) obj2).invoke(obj);
                break;
            case 7:
                ((ci7) obj2).invoke(obj);
                break;
            case 8:
                ((com.vk.ecomm.catalog.impl.geo.d) obj2).invoke(obj);
                break;
            case 9:
                ((ci7) obj2).invoke(obj);
                break;
            case 10:
                ((op1) obj2).invoke(obj);
                break;
            case 11:
                qcy<Object>[] qcyVarArr = ClipsMusicCatalogShowAllListVh.x;
                ((op1) obj2).invoke(obj);
                break;
            case 12:
                ((umg) obj2).invoke(obj);
                break;
            case 13:
                ((ci7) obj2).invoke(obj);
                break;
            case 14:
                ((srg) obj2).invoke(obj);
                break;
            case 15:
                ((srg) obj2).invoke(obj);
                break;
            case 16:
                ((srg) obj2).invoke(obj);
                break;
            case 17:
                ((srg) obj2).invoke(obj);
                break;
            case 18:
                ((u9) obj2).invoke(obj);
                break;
            case 19:
                ((d50) obj2).invoke(obj);
                break;
            case 20:
                psm psmVar = (psm) obj2;
                psmVar.A = di6.k(psmVar, new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.p(psmVar.m.C(psmVar, new g2l(j5g.O0((Set) obj))).q(asu0.a.c())), io.reactivex.rxjava3.internal.functions.a.g).g(new ek5(psmVar, 2)).q(psmVar.q), null, null, 3);
                break;
            case 21:
                ((nu2) obj2).invoke(obj);
                break;
            case 22:
                ((k0j) obj2).invoke(obj);
                break;
            case 23:
                ((zqh) obj2).invoke(obj);
                break;
            case 24:
                ((izs) obj2).invoke(obj);
                break;
            case 25:
                ((bee) obj2).invoke(obj);
                break;
            case 26:
                ((srg) obj2).invoke(obj);
                break;
            case 27:
                int i3 = GroupCallGridContainerView.i;
                ((srg) obj2).invoke(obj);
                break;
            case 28:
                int i4 = HighlightEditFragment.h0;
                ((u9) obj2).invoke(obj);
                break;
            default:
                com.vk.core.view.components.spinner.c cVar = (com.vk.core.view.components.spinner.c) obj2;
                final io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                cVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.sax
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        io.reactivex.rxjava3.disposables.c.this.dispose();
                    }
                });
                cVar.show();
                break;
        }
    }
}
