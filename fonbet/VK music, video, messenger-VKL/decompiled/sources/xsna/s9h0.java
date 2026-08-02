package xsna;

import android.os.Bundle;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.a;
import com.vkontakte.android.R;
import xsna.ph;

/* compiled from: SchoolSearchDatabaseDialog.kt */
/* loaded from: classes5.dex */
public final class s9h0 extends ph<School> {
    public static final /* synthetic */ int o1 = 0;

    /* compiled from: SchoolSearchDatabaseDialog.kt */
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
            return new s9h0();
        }
    }

    /* compiled from: SchoolSearchDatabaseDialog.kt */
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
            return new s9h0();
        }
    }

    @Override // xsna.ph
    public final vph0 co() {
        return new vph0(R.string.search_params_education_institution_title, R.string.search_params_school_search_hint);
    }

    @Override // xsna.ph
    public final tph0<School> eo() {
        int i = requireArguments().getInt("cityId", 0);
        edi ediVar = new edi(9);
        qs9 qs9Var = new qs9();
        qs9Var.b = ediVar;
        return new mbk0(i, new u9h0(qs9Var, new t9h0()));
    }

    @Override // xsna.ph
    public final jph0<School> fo() {
        return new bqz0(requireContext().getApplicationContext());
    }

    @Override // xsna.ph
    public final com.vk.search.params.impl.presentation.modal.database.mvi.model.a<School> ho() {
        Integer d = bo8.d(requireArguments(), "selectedId");
        if (d == null) {
            return a.c.a;
        }
        final int intValue = d.intValue();
        return new a.b(new ltx() { // from class: xsna.r9h0
            @Override // xsna.ltx
            public final boolean accept(Object obj) {
                int i = s9h0.o1;
                return ((School) obj).c == intValue;
            }
        });
    }
}
