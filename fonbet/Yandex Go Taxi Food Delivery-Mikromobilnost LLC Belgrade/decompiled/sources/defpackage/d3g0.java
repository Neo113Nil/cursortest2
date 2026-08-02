package defpackage;

import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.settings.api.PushSettingsApi;

/* loaded from: classes14.dex */
public interface d3g0 {
    static c3g0 a(as21 as21Var) {
        return new c3g0(as21Var);
    }

    static PushSettingsApi b(on2 on2Var) {
        on2Var.getClass();
        return (PushSettingsApi) on2Var.a(GoApiName.TaxiV4, PushSettingsApi.class);
    }
}
