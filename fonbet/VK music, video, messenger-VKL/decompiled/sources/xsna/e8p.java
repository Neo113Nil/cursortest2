package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.VKTabLayout;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EducationParameterDialog.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class e8p extends FunctionReferenceImpl implements izs<EducationState.InstitutionType, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(EducationState.InstitutionType institutionType) {
        k8p k8pVar = (k8p) this.receiver;
        k8pVar.d = true;
        VKTabLayout vKTabLayout = k8pVar.c;
        TabLayout.g b = vKTabLayout.b(institutionType.ordinal());
        if (b != null) {
            if (!b.h()) {
                vKTabLayout.c(b, true);
            }
            k8pVar.d = false;
        }
        return s3q0.a;
    }
}
