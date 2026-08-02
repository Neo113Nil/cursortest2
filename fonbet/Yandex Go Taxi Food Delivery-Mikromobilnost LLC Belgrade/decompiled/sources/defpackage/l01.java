package defpackage;

import com.yandex.go.address.address_map_picker.experiment.AddressMapPickerExperiment;

/* loaded from: classes12.dex */
public final class l01 {
    public final rz0 a;

    public l01(rz0 rz0Var) {
        this.a = rz0Var;
    }

    public final boolean a(yz0 yz0Var) {
        AddressMapPickerExperiment addressMapPickerExperiment = (AddressMapPickerExperiment) this.a.b.b();
        return addressMapPickerExperiment.b && addressMapPickerExperiment.c.contains(yz0Var);
    }
}
