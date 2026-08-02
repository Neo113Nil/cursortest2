package xsna;

import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.data.AdvertisingOrd;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import kotlin.NoWhenBranchMatchedException;
import xsna.sr0;

/* compiled from: AdditionalSettingsReducer.kt */
/* loaded from: classes4.dex */
public final class hs0 extends dm50<ls0, sr0, AdditionalSettingsState> {
    @Override // xsna.dm50
    public final AdditionalSettingsState c(AdditionalSettingsState additionalSettingsState, sr0 sr0Var) {
        AdditionalSettingsState additionalSettingsState2 = additionalSettingsState;
        sr0 sr0Var2 = sr0Var;
        if (sr0Var2 instanceof sr0.e) {
            sr0.e eVar = (sr0.e) sr0Var2;
            return new AdditionalSettingsState.Data(eVar.d, eVar.b, eVar.c, eVar.e, eVar.h, eVar.i, eVar.f, eVar.g, false, eVar.j, eVar.k, eVar.l, eVar.m, eVar.n, eVar.o);
        }
        if (sr0Var2 instanceof sr0.f) {
            return ((sr0.f) sr0Var2).b;
        }
        if (sr0Var2 instanceof sr0.b) {
            if (!(additionalSettingsState2 instanceof AdditionalSettingsState.Data)) {
                return additionalSettingsState2;
            }
            AdditionalSettingsState.Data data = (AdditionalSettingsState.Data) additionalSettingsState2;
            return AdditionalSettingsState.Data.a(data, AdditionalSettingsConfiguration.a(data.g, ((sr0.b) sr0Var2).b, false, false, null, false, 30), false, 32735);
        }
        if (sr0Var2 instanceof sr0.c) {
            if (!(additionalSettingsState2 instanceof AdditionalSettingsState.Data)) {
                return additionalSettingsState2;
            }
            AdditionalSettingsState.Data data2 = (AdditionalSettingsState.Data) additionalSettingsState2;
            return AdditionalSettingsState.Data.a(data2, AdditionalSettingsConfiguration.a(data2.g, false, false, ((sr0.c) sr0Var2).b, null, false, 27), false, 32735);
        }
        if (sr0Var2 instanceof sr0.d) {
            if (!(additionalSettingsState2 instanceof AdditionalSettingsState.Data)) {
                return additionalSettingsState2;
            }
            AdditionalSettingsState.Data data3 = (AdditionalSettingsState.Data) additionalSettingsState2;
            return AdditionalSettingsState.Data.a(data3, AdditionalSettingsConfiguration.a(data3.g, false, ((sr0.d) sr0Var2).b, false, null, false, 29), false, 32735);
        }
        if (sr0Var2 instanceof sr0.a) {
            if (!(additionalSettingsState2 instanceof AdditionalSettingsState.Data)) {
                return additionalSettingsState2;
            }
            AdditionalSettingsState.Data data4 = (AdditionalSettingsState.Data) additionalSettingsState2;
            AdditionalSettingsConfiguration additionalSettingsConfiguration = data4.g;
            sr0.a aVar = (sr0.a) sr0Var2;
            return AdditionalSettingsState.Data.a(data4, AdditionalSettingsConfiguration.a(additionalSettingsConfiguration, false, false, false, AdvertisingOrd.a(additionalSettingsConfiguration.e, aVar.b, Boolean.valueOf(aVar.c), aVar.d), false, 23), false, 32735);
        }
        if (sr0Var2 instanceof sr0.h) {
            return additionalSettingsState2 instanceof AdditionalSettingsState.Data ? AdditionalSettingsState.Data.a((AdditionalSettingsState.Data) additionalSettingsState2, null, ((sr0.h) sr0Var2).b, 32511) : additionalSettingsState2;
        }
        if (!(sr0Var2 instanceof sr0.g)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(additionalSettingsState2 instanceof AdditionalSettingsState.Data)) {
            return additionalSettingsState2;
        }
        ((sr0.g) sr0Var2).getClass();
        return AdditionalSettingsState.Data.a((AdditionalSettingsState.Data) additionalSettingsState2, null, false, 32503);
    }

    @Override // xsna.dm50
    public final ls0 d() {
        return new ls0(e(new com.vk.movika.sdk.base.observable.e0(1)), e(new tr0(0)));
    }

    @Override // xsna.dm50
    public final void h(AdditionalSettingsState additionalSettingsState, ls0 ls0Var) {
        AdditionalSettingsState additionalSettingsState2 = additionalSettingsState;
        ls0 ls0Var2 = ls0Var;
        if (additionalSettingsState2 instanceof AdditionalSettingsState.Init) {
            f(ls0Var2.a, additionalSettingsState2);
        } else {
            if (!(additionalSettingsState2 instanceof AdditionalSettingsState.Data)) {
                throw new NoWhenBranchMatchedException();
            }
            f(ls0Var2.b, additionalSettingsState2);
        }
    }
}
