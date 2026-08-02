package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;

/* compiled from: EducationParameterView.kt */
/* loaded from: classes5.dex */
public final class l8p implements TabLayout.d {
    public final /* synthetic */ k8p b;

    public l8p(k8p k8pVar) {
        this.b = k8pVar;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        k8p k8pVar = this.b;
        if (k8pVar.d) {
            return;
        }
        k8pVar.a.invoke(new a.j(EducationState.InstitutionType.values()[gVar.e]));
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
    }
}
