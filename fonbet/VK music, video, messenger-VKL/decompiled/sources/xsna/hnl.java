package xsna;

import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hnl implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ hnl(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (VkAuthValidateAccountResponse) this.c.invoke(obj);
            default:
                return (ArrayList) this.c.invoke(obj);
        }
    }
}
