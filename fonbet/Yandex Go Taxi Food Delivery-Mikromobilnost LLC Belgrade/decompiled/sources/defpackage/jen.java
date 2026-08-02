package defpackage;

import ru.yandex.taxi.eatskit.internal.nativeapi.EatsNativeApi;

/* loaded from: classes5.dex */
public final /* synthetic */ class jen implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ EatsNativeApi b;

    public /* synthetic */ jen(EatsNativeApi eatsNativeApi, int i) {
        this.a = i;
        this.b = eatsNativeApi;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 requestReload$lambda$0;
        zy11 requestHideAddress$lambda$0;
        zy11 requestShowAddress$lambda$0;
        int i = this.a;
        EatsNativeApi eatsNativeApi = this.b;
        switch (i) {
            case 0:
                requestReload$lambda$0 = EatsNativeApi.requestReload$lambda$0(eatsNativeApi);
                return requestReload$lambda$0;
            case 1:
                requestHideAddress$lambda$0 = EatsNativeApi.requestHideAddress$lambda$0(eatsNativeApi);
                return requestHideAddress$lambda$0;
            default:
                requestShowAddress$lambda$0 = EatsNativeApi.requestShowAddress$lambda$0(eatsNativeApi);
                return requestShowAddress$lambda$0;
        }
    }
}
