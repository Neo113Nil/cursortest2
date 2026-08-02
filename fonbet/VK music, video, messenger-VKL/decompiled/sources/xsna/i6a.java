package xsna;

import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import xsna.ttf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i6a implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ i6a(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (hda) this.c.invoke(obj);
            case 1:
                return (ttf.c.a) this.c.invoke(obj);
            case 2:
                return (AuthValidatePhoneCheckResponse) this.c.invoke(obj);
            default:
                return (coa0) this.c.invoke(obj);
        }
    }
}
