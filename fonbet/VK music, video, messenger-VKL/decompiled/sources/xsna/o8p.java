package xsna;

import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.education.EducationalInstitution;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EducationReducer.kt */
/* loaded from: classes5.dex */
public final class o8p extends dm50<com.vk.search.params.impl.presentation.modal.education.mvi.model.d, com.vk.search.params.impl.presentation.modal.education.mvi.model.b, EducationState> {
    @Override // xsna.dm50
    public final EducationState c(EducationState educationState, com.vk.search.params.impl.presentation.modal.education.mvi.model.b bVar) {
        EducationState educationState2 = educationState;
        com.vk.search.params.impl.presentation.modal.education.mvi.model.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            b.a aVar = (b.a) bVar2;
            City city = aVar.c;
            EducationalInstitution educationalInstitution = aVar.d;
            Integer num = aVar.e;
            boolean z = educationalInstitution instanceof University;
            return new EducationState(new EducationState.a(educationalInstitution, city, num), z ? EducationState.InstitutionType.UNIVERSITY : EducationState.InstitutionType.SCHOOL, city, educationalInstitution instanceof School ? (School) educationalInstitution : null, z ? (University) educationalInstitution : null, aVar.b, num);
        }
        if (bVar2 instanceof b.C1769b) {
            EducationState.InstitutionType institutionType = educationState2.c;
            EducationState.InstitutionType institutionType2 = ((b.C1769b) bVar2).b;
            if (institutionType != institutionType2) {
                return EducationState.a(educationState2, institutionType2, null, null, null, null, 125);
            }
        } else if (bVar2 instanceof a.c) {
            a.c cVar = (a.c) bVar2;
            if (!epx.f(educationState2.d, cVar.b)) {
                return EducationState.a(educationState2, null, cVar.b, null, null, null, 99);
            }
        } else if (bVar2 instanceof a.k) {
            a.k kVar = (a.k) bVar2;
            if (!epx.f(educationState2.e, kVar.b)) {
                return EducationState.a(educationState2, null, null, kVar.b, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            }
        } else if (bVar2 instanceof a.l) {
            a.l lVar = (a.l) bVar2;
            if (!epx.f(educationState2.f, lVar.b)) {
                return EducationState.a(educationState2, null, null, null, lVar.b, null, 111);
            }
        } else {
            if (!(bVar2 instanceof a.m)) {
                if (bVar2.equals(a.d.b)) {
                    return new EducationState(educationState2.b, educationState2.c, educationState2.g, 92);
                }
                throw new NoWhenBranchMatchedException();
            }
            a.m mVar = (a.m) bVar2;
            if (!epx.f(educationState2.h, mVar.b)) {
                return EducationState.a(educationState2, null, null, null, null, mVar.b, 63);
            }
        }
        return educationState2;
    }

    @Override // xsna.dm50
    public final com.vk.search.params.impl.presentation.modal.education.mvi.model.d d() {
        return new com.vk.search.params.impl.presentation.modal.education.mvi.model.d(e(new nj(20)), e(new md(28)));
    }

    @Override // xsna.dm50
    public final void h(EducationState educationState, com.vk.search.params.impl.presentation.modal.education.mvi.model.d dVar) {
        f(dVar.b, educationState);
    }
}
