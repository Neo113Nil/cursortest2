package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.search.params.api.City;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.a;
import com.vkontakte.android.R;
import xsna.ph;

/* compiled from: CitySearchDatabaseDialog.kt */
/* loaded from: classes5.dex */
public class lfc extends ph<City> {
    public static final /* synthetic */ int o1 = 0;

    /* compiled from: CitySearchDatabaseDialog.kt */
    public static class a extends ph.b {
        public Integer f;
        public Integer g;
        public boolean h;
        public Integer i;

        public a(Context context) {
            super(context);
            this.h = true;
        }

        @Override // xsna.vwh0
        public final void S0(Bundle bundle) {
            Integer num = this.f;
            if (num != null) {
                bundle.putInt("selected_city_id", num.intValue());
            }
            Integer num2 = this.g;
            if (num2 != null) {
                bundle.putInt("selected_country_id", num2.intValue());
            }
            bundle.putBoolean("provide_null_item_key", this.h);
            Integer num3 = this.i;
            if (num3 != null) {
                bundle.putInt("null_item_title_res_id_key", num3.intValue());
            }
        }

        @Override // xsna.vwh0
        public final dw20 T0() {
            return new lfc();
        }
    }

    /* compiled from: CitySearchDatabaseDialog.kt */
    public static final class b extends ph.c {
        public Integer i;
        public Integer j;
        public boolean k;
        public Integer l;

        public b(Context context, boolean z) {
            super(context, z);
            this.k = true;
        }

        @Override // xsna.uwh0
        public final void V0(Bundle bundle) {
            Integer num = this.i;
            if (num != null) {
                bundle.putInt("selected_city_id", num.intValue());
            }
            Integer num2 = this.j;
            if (num2 != null) {
                bundle.putInt("selected_country_id", num2.intValue());
            }
            bundle.putBoolean("provide_null_item_key", this.k);
            Integer num3 = this.l;
            if (num3 != null) {
                bundle.putInt("null_item_title_res_id_key", num3.intValue());
            }
        }

        @Override // xsna.uwh0
        public final dw20 W0() {
            return new lfc();
        }
    }

    @Override // xsna.ph
    public vph0 co() {
        return new vph0(R.string.search_params_city_title);
    }

    @Override // xsna.ph
    public final tph0<City> eo() {
        return new shb(new lec(new kec(new edi(9)), new dz5()), bo8.d(requireArguments(), "selected_country_id"));
    }

    @Override // xsna.ph
    public jph0<City> fo() {
        return new oec(requireContext().getApplicationContext(), requireArguments().getBoolean("provide_null_item_key"), bo8.d(requireArguments(), "null_item_title_res_id_key"));
    }

    @Override // xsna.ph
    public com.vk.search.params.impl.presentation.modal.database.mvi.model.a<City> ho() {
        Integer d = bo8.d(requireArguments(), "selected_city_id");
        if (d == null) {
            return a.c.a;
        }
        final int intValue = d.intValue();
        return new a.b(new ltx() { // from class: xsna.kfc
            @Override // xsna.ltx
            public final boolean accept(Object obj) {
                int i = lfc.o1;
                return ((City) obj).b == intValue;
            }
        });
    }
}
