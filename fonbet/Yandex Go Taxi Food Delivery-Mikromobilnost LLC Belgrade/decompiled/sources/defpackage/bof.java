package defpackage;

import com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes2.dex */
public final /* synthetic */ class bof implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CvvConfirmFragment b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ bof(CvvConfirmFragment cvvConfirmFragment, Ref$ObjectRef ref$ObjectRef) {
        this.b = cvvConfirmFragment;
        this.c = ref$ObjectRef;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$2;
        zy11 onViewCreated$lambda$5;
        int i = this.a;
        Ref$ObjectRef ref$ObjectRef = this.c;
        CvvConfirmFragment cvvConfirmFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$2 = CvvConfirmFragment.onViewCreated$lambda$2(ref$ObjectRef, cvvConfirmFragment, (qwl) obj);
                return onViewCreated$lambda$2;
            default:
                onViewCreated$lambda$5 = CvvConfirmFragment.onViewCreated$lambda$5(cvvConfirmFragment, ref$ObjectRef, (hof) obj);
                return onViewCreated$lambda$5;
        }
    }

    public /* synthetic */ bof(Ref$ObjectRef ref$ObjectRef, CvvConfirmFragment cvvConfirmFragment) {
        this.c = ref$ObjectRef;
        this.b = cvvConfirmFragment;
    }
}
