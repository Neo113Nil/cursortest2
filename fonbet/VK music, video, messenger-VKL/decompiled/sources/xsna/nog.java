package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPreview;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionUpdateNonActiveGroups;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunitiesExternalEventHandlerDelegate.kt */
/* loaded from: classes.dex */
public final class nog extends l5a {
    public final io.reactivex.rxjava3.disposables.b c;

    public nog(q3a q3aVar) {
        super(q3aVar);
        this.c = new io.reactivex.rxjava3.disposables.b();
    }

    public static List b(UIBlockList uIBlockList) {
        List<UIBlockAction> Pb;
        ArrayList<UIBlock> Sb = uIBlockList.Sb();
        ArrayList arrayList = new ArrayList();
        for (Object obj : Sb) {
            if (obj instanceof UIBlockPreview) {
                arrayList.add(obj);
            }
        }
        UIBlockPreview uIBlockPreview = (UIBlockPreview) j5g.a0(arrayList);
        if (uIBlockPreview == null || (Pb = uIBlockPreview.Pb()) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : Pb) {
            if (obj2 instanceof UIBlockActionUpdateNonActiveGroups) {
                arrayList2.add(obj2);
            }
        }
        UIBlockActionUpdateNonActiveGroups uIBlockActionUpdateNonActiveGroups = (UIBlockActionUpdateNonActiveGroups) j5g.a0(arrayList2);
        if (uIBlockActionUpdateNonActiveGroups != null) {
            return uIBlockActionUpdateNonActiveGroups.Rb();
        }
        return null;
    }

    @Override // xsna.l5a
    public final void a() {
        this.c.b(o1e0.a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new gd9(new c67(this, 1), 1)));
    }
}
