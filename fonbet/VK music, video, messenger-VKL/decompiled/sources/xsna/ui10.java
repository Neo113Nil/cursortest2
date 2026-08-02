package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.content.design.view.camera.a;
import com.vk.core.preference.Preference;
import com.vk.dto.masks.Mask;
import com.vk.lists.ListDataSet;
import com.vk.medianative.MediaNative;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bi10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ui10 implements izs {
    public final /* synthetic */ MasksWrap b;
    public final /* synthetic */ com.vk.lists.c c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ui10(MasksWrap masksWrap, com.vk.lists.c cVar, boolean z) {
        this.b = masksWrap;
        this.c = cVar;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        a.InterfaceC0730a camera1View;
        di10 di10Var;
        a.InterfaceC0730a camera1View2;
        a.InterfaceC0730a camera1View3;
        Mask selectedMask;
        int i = MasksWrap.e0;
        ArrayList arrayList = new ArrayList((ArrayList) obj);
        MasksWrap masksWrap = this.b;
        xg10 xg10Var = masksWrap.N;
        boolean z = xg10Var.E0() == 0;
        this.c.s(null);
        m.d a = androidx.recyclerview.widget.m.a(new MasksWrap.c.b((ListDataSet.ArrayListImpl) xg10Var.y0(), arrayList), true);
        ((ArrayList) xg10Var.y0()).clear();
        ((ArrayList) xg10Var.y0()).addAll(arrayList);
        a.b(xg10Var);
        if (masksWrap.getSelectedMask() != null) {
            Mask mask = xg10Var.f;
            if (mask != null) {
                Integer K0 = xg10Var.K0(mask);
                xg10Var.d.scrollToPosition(K0 != null ? K0.intValue() : 0);
            }
        } else {
            RecyclerView recyclerView = xg10Var.d;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(0);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof bi10.d) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            bi10.d dVar = (bi10.d) obj2;
            Mask selectedMask2 = masksWrap.getSelectedMask();
            if (selectedMask2 != null && dVar.a.d == selectedMask2.d) {
                break;
            }
        }
        bi10.d dVar2 = (bi10.d) obj2;
        if (dVar2 != null && (selectedMask = masksWrap.getSelectedMask()) != null) {
            selectedMask.w = dVar2.a.w;
        }
        Mask selectedMask3 = masksWrap.getSelectedMask();
        if (selectedMask3 != null) {
            int i2 = selectedMask3.d;
            boolean z2 = selectedMask3.u;
            if (z2 && ((camera1View3 = masksWrap.getCamera1View()) == null || !camera1View3.k(i2))) {
                masksWrap.setMaskShouldSelectAfterUpdate(masksWrap.getSelectedMask());
                masksWrap.setSelectedMask(null);
                masksWrap.q(false);
            } else if (z2 && epx.f(masksWrap.getMaskShouldSelectAfterUpdate(), selectedMask3) && (camera1View2 = masksWrap.getCamera1View()) != null && camera1View2.i(i2)) {
                masksWrap.J(true);
            }
        } else {
            Mask maskShouldSelectAfterUpdate = masksWrap.getMaskShouldSelectAfterUpdate();
            if (maskShouldSelectAfterUpdate != null && maskShouldSelectAfterUpdate.u && (camera1View = masksWrap.getCamera1View()) != null && camera1View.k(maskShouldSelectAfterUpdate.d)) {
                masksWrap.B(maskShouldSelectAfterUpdate.h, maskShouldSelectAfterUpdate, false);
            }
        }
        if (z && this.d) {
            boolean d = Preference.d("stories_default", "story_masks", false);
            if (masksWrap.a() && !d && (di10Var = masksWrap.e) != null && di10Var.J() && MediaNative.isGLEffectsLibSupported()) {
                com.vk.content.design.view.camera.a.k();
                di10 masksProvider = masksWrap.getMasksProvider();
                if (masksProvider != null) {
                    masksProvider.z();
                }
            }
        }
        MasksWrap.b onNewDataListener = masksWrap.getOnNewDataListener();
        if (onNewDataListener != null) {
            onNewDataListener.a(arrayList);
        }
        return s3q0.a;
    }
}
