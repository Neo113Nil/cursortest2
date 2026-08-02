package xsna;

import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zsa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ zsa(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(new pu((ikv0) obj, 17));
                return s3q0.a;
            case 1:
                izsVar.invoke(new a.j(((Boolean) obj).booleanValue() ? EducationState.InstitutionType.SCHOOL : EducationState.InstitutionType.UNIVERSITY));
                return s3q0.a;
            default:
                int i2 = VkTabLayout.s0;
                com.vk.core.view.components.tabs.d dVar = (com.vk.core.view.components.tabs.d) izsVar.invoke((TabLayout.g) obj);
                if (dVar.getLayoutParams() == null) {
                    dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                }
                return dVar;
        }
    }
}
