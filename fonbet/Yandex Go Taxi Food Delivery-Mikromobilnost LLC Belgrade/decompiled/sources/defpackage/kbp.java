package defpackage;

import com.yandex.go.payments.shared.family.web.nativeapi.FamilyJsNativeApi;
import com.yandex.go.payments.shared.family.web.nativeapi.response.ChooseContactsInfoResponse;
import com.yandex.go.payments.shared.family.web.nativeapi.response.PostcardInfoResponse;

/* loaded from: classes13.dex */
public final /* synthetic */ class kbp implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FamilyJsNativeApi b;

    public /* synthetic */ kbp(FamilyJsNativeApi familyJsNativeApi, int i) {
        this.a = i;
        this.b = familyJsNativeApi;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        FamilyJsNativeApi familyJsNativeApi = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                familyJsNativeApi.callbackResult(str, ChooseContactsInfoResponse.Companion.serializer(), (ChooseContactsInfoResponse) obj2);
                break;
            default:
                familyJsNativeApi.callbackResult(str, PostcardInfoResponse.Companion.serializer(), (PostcardInfoResponse) obj2);
                break;
        }
        return zy11Var;
    }
}
