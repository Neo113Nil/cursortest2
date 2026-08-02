package xsna;

import android.content.Context;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.hcd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gcd implements wut0, Optional.Action {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gcd(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onVerifyingSmsCode$28((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }

    @Override // xsna.wut0
    public vut0 create(Context context) {
        return new hcd.a((Context) this.b, (dcd) this.c);
    }
}
