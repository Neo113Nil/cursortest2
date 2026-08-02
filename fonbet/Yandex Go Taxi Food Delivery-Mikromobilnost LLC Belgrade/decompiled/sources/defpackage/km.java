package defpackage;

/* loaded from: classes9.dex */
public final /* synthetic */ class km implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ dne0 b;

    public /* synthetic */ km(dne0 dne0Var, int i) {
        this.a = i;
        this.b = dne0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        dne0 dne0Var = this.b;
        switch (i) {
            case 0:
                return dne0Var.a("upgrade_account_status");
            case 1:
                return dne0Var.a("device_performance_class_prefs");
            case 2:
                return dne0Var.a("com.yandex.go.multimodal_route.multimodal_original_address_repository");
            case 3:
                return dne0Var.a("com.yandex.go.multimodal_route.store");
            case 4:
                return dne0Var.a("com.yandex.go.navigator");
            default:
                return dne0Var.a("UserPhotoUploadingModalViewStatePrefs");
        }
    }
}
