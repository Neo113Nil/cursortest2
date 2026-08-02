package xsna;

import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vk.search.params.api.domain.model.education.EducationalInstitution;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.b;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.c;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EducationFeature.kt */
/* loaded from: classes5.dex */
public final class q7p extends wk50<com.vk.search.params.impl.presentation.modal.education.mvi.model.d, EducationState, com.vk.search.params.impl.presentation.modal.education.mvi.model.a, com.vk.search.params.impl.presentation.modal.education.mvi.model.b> {
    public final slk f;
    public final f4z g;

    /* compiled from: EducationFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EducationState.InstitutionType.values().length];
            try {
                iArr[EducationState.InstitutionType.SCHOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EducationState.InstitutionType.UNIVERSITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q7p(a.g gVar, o8p o8pVar, slk slkVar) {
        super(gVar, o8pVar);
        this.f = slkVar;
        this.g = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(EducationState educationState, com.vk.search.params.impl.presentation.modal.education.mvi.model.a aVar) {
        com.vk.search.params.impl.presentation.modal.education.mvi.model.c bVar;
        b.a aVar2;
        EducationState educationState2 = educationState;
        com.vk.search.params.impl.presentation.modal.education.mvi.model.a aVar3 = aVar;
        Integer num = educationState2.h;
        University university = educationState2.f;
        School school = educationState2.e;
        EducationState.InstitutionType institutionType = educationState2.c;
        City city = educationState2.d;
        if (aVar3 instanceof b.c) {
            T((xl50) aVar3);
            return;
        }
        Integer num2 = null;
        if (aVar3 instanceof a.g) {
            a.g gVar = (a.g) aVar3;
            int intValue = ((Number) this.f.invoke()).intValue();
            k9x k9xVar = new k9x(intValue - 50, intValue + 6, 1);
            EducationParam educationParam = gVar.b;
            if (educationParam != null) {
                City city2 = educationParam.c;
                EducationalInstitution educationalInstitution = educationParam.b;
                Integer num3 = educationParam.d;
                if (num3 != null && k9xVar.e(num3.intValue())) {
                    num2 = num3;
                }
                aVar2 = new b.a(k9xVar, city2, educationalInstitution, num2);
            } else {
                aVar2 = new b.a(k9xVar, gVar.c, null, null);
            }
            T(aVar2);
            return;
        }
        boolean z = aVar3 instanceof a.j;
        f4z f4zVar = this.g;
        if (z) {
            EducationState.InstitutionType institutionType2 = ((a.j) aVar3).b;
            if (educationState2.b() == null) {
                T(new b.C1769b(institutionType2));
                return;
            } else {
                if (institutionType != institutionType2) {
                    f4zVar.b(new c.f(institutionType2));
                    return;
                }
                return;
            }
        }
        if (aVar3 instanceof a.i) {
            T(new b.C1769b(((a.i) aVar3).b));
            return;
        }
        if (aVar3.equals(a.C1768a.b)) {
            if (institutionType == EducationState.InstitutionType.SCHOOL) {
                university = school;
            }
            if (university == null) {
                if (city == null) {
                    f4zVar.b(new c.g(null));
                    return;
                }
                return;
            } else {
                if (city == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                f4zVar.b(new c.g(new EducationParam(university, city, num)));
                return;
            }
        }
        boolean equals = aVar3.equals(a.e.b);
        c.d dVar = c.d.a;
        if (equals) {
            EducationState.a aVar4 = educationState2.b;
            if (epx.f(city, aVar4.b) && epx.f(educationState2.b(), aVar4.a) && epx.f(num, aVar4.c)) {
                f4zVar.b(dVar);
                return;
            } else {
                f4zVar.b(c.e.a);
                return;
            }
        }
        if (aVar3.equals(a.f.b)) {
            f4zVar.b(dVar);
            return;
        }
        if (aVar3.equals(a.b.b)) {
            f4zVar.b(new c.a(city));
            return;
        }
        if (!aVar3.equals(a.h.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (city == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[institutionType.ordinal()];
        if (i == 1) {
            bVar = new c.b(school, city);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new c.C1770c(university, city);
        }
        f4zVar.b(bVar);
    }
}
