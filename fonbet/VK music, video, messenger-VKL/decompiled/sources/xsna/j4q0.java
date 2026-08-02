package xsna;

import android.os.Bundle;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.a;
import com.vkontakte.android.R;
import xsna.ph;

/* compiled from: UniversitySearchDatabaseDialog.kt */
/* loaded from: classes5.dex */
public final class j4q0 extends ph<University> {
    public static final /* synthetic */ int o1 = 0;

    /* compiled from: UniversitySearchDatabaseDialog.kt */
    public static final class a extends ph.b {
        public int f;
        public Integer g;

        @Override // xsna.vwh0
        public final void S0(Bundle bundle) {
            bundle.putInt("cityId", this.f);
            Integer num = this.g;
            if (num != null) {
                bundle.putInt("selectedId", num.intValue());
            }
        }

        @Override // xsna.vwh0
        public final dw20 T0() {
            return new j4q0();
        }
    }

    /* compiled from: UniversitySearchDatabaseDialog.kt */
    public static final class b extends ph.c {
        public int i;
        public Integer j;

        @Override // xsna.uwh0
        public final void V0(Bundle bundle) {
            bundle.putInt("cityId", this.i);
            Integer num = this.j;
            if (num != null) {
                bundle.putInt("selectedId", num.intValue());
            }
        }

        @Override // xsna.uwh0
        public final dw20 W0() {
            return new j4q0();
        }
    }

    @Override // xsna.ph
    public final vph0 co() {
        return new vph0(R.string.search_params_education_institution_title, R.string.search_params_university_search_hint);
    }

    @Override // xsna.ph
    public final tph0<University> eo() {
        return new k4q0(requireArguments().getInt("cityId", 1), new qd50(new mcc0(7), new h4q0()));
    }

    @Override // xsna.ph
    public final jph0<University> fo() {
        return new bsb0(requireContext().getApplicationContext());
    }

    @Override // xsna.ph
    public final com.vk.search.params.impl.presentation.modal.database.mvi.model.a<University> ho() {
        Integer d = bo8.d(requireArguments(), "selectedId");
        if (d == null) {
            return a.c.a;
        }
        final int intValue = d.intValue();
        return new a.b(new ltx() { // from class: xsna.i4q0
            @Override // xsna.ltx
            public final boolean accept(Object obj) {
                int i = j4q0.o1;
                return ((University) obj).c == intValue;
            }
        });
    }
}
