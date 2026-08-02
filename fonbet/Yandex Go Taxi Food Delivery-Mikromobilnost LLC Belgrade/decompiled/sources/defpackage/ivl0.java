package defpackage;

import com.yandex.go.safety.center.safetycenter_web.domain.web.SafetyCenterWebJsApi;

/* loaded from: classes13.dex */
public final /* synthetic */ class ivl0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafetyCenterWebJsApi b;
    public final /* synthetic */ String c;

    public /* synthetic */ ivl0(SafetyCenterWebJsApi safetyCenterWebJsApi, String str, int i) {
        this.a = i;
        this.b = safetyCenterWebJsApi;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        SafetyCenterWebJsApi safetyCenterWebJsApi = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                safetyCenterWebJsApi.changeCallbackResult(str, booleanValue);
                break;
            case 1:
                safetyCenterWebJsApi.changeCallbackResult(str, booleanValue);
                break;
            default:
                safetyCenterWebJsApi.changeCallbackResult(str, booleanValue);
                break;
        }
        return zy11Var;
    }
}
