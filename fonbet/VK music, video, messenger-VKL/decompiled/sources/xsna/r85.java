package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import xsna.q630;
import xsna.sx40;
import xsna.u7n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r85 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r85(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object remove;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                d95.b((rv5) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((qo7) this.d).a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                tho0 tho0Var = (tho0) this.d;
                String str = (String) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1240757871, intValue, -1, "com.vk.clips.design.compose.description.subcomposeTextArea.<anonymous> (ClipsEditDescriptionView.kt:134)");
                    }
                    q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "clip_description_text_area");
                    InputSelect$State inputSelect$State = InputSelect$State.NoBorder;
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new vr0(13);
                        aVar.R(x);
                    }
                    hqv0.d(tho0Var, (izs) x, E, str, inputSelect$State, 0, 0, true, true, 0L, 0L, null, null, null, null, null, null, null, null, false, aVar, 113271216, 0, 1048160);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((soj) this.d).g((znj) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((zsl) this.d).b((d5f) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((po40) this.d).b((izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                wma0.a(ne7.I(1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 7:
                izs izsVar2 = (izs) this.d;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.c;
                int i = ((zux) obj).a;
                int i2 = ((zux) obj2).a;
                izsVar2.invoke(new sx40.k(i, i2));
                if (i != i2 && (remove = snapshotStateList.remove(i)) != null) {
                    snapshotStateList.add(i2, remove);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                s4d0.c((agw) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                eld0 eld0Var = (eld0) this.d;
                dld0 dld0Var = (dld0) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-81779152, intValue2, -1, "com.vk.ecomm.market.good.good2.presentation.gallery.ProductCardGalleryViewHolder.onBind.<anonymous> (ProductCardGalleryViewHolder.kt:36)");
                    }
                    if (eld0Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(995324565, new rig(7, eld0Var, dld0Var), aVar2), aVar2, 24576, 15);
                        boolean y = aVar2.y(dld0Var) | aVar2.J(eld0Var);
                        Object x2 = aVar2.x();
                        if (y || x2 == a.C0011a.a) {
                            x2 = new ig1(27, dld0Var, eld0Var);
                            aVar2.R(x2);
                        }
                        bap.i((gzs) x2, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                p8o0.a((com.vk.messagetemplates.impl.details.f) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 11:
                j3q0 j3q0Var = (j3q0) this.d;
                Context context = (Context) this.c;
                int intValue3 = ((Integer) obj).intValue();
                WebAction webAction = (WebAction) obj2;
                UniversalWidget universalWidget = j3q0Var.b;
                if (universalWidget == null) {
                    universalWidget = null;
                }
                j3q0Var.o().u0(context, new u7n0.a(universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType.FOOTER, intValue3, 8), webAction);
                break;
            case 12:
                jgt0 jgt0Var = (jgt0) this.d;
                jai jaiVar = (jai) this.c;
                ((Integer) obj2).getClass();
                jgt0Var.c(ne7.I(55), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            default:
                ((Integer) obj2).getClass();
                x8u0.o((b78) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ r85(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
    }
}
