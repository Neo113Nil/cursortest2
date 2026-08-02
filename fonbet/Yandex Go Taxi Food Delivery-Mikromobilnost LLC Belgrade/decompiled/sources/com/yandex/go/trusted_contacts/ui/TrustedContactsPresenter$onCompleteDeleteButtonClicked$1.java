package com.yandex.go.trusted_contacts.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.sh11;
import defpackage.tse;
import defpackage.wls;
import defpackage.zg11;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.ui.TrustedContactsPresenter$onCompleteDeleteButtonClicked$1", f = "TrustedContactsPresenter.kt", l = {HProv.PP_PASSWD_TERM, HProv.PP_SAME_MEDIA, HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsPresenter$onCompleteDeleteButtonClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ sh11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsPresenter$onCompleteDeleteButtonClicked$1(sh11 sh11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sh11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrustedContactsPresenter$onCompleteDeleteButtonClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsPresenter$onCompleteDeleteButtonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r9.a.c(r8) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r4 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            o7r0 o7r0Var = (o7r0) this.this$0.z.c;
            o7r0Var.getClass();
            o7r0Var.a.a("TrustedContacts.Delete.ActionButtonTapped", new HashMap(), 1, new HashMap());
            sh11 sh11Var = this.this$0;
            this.label = 1;
            sh11Var.B.emit(Boolean.TRUE, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                sh11 sh11Var2 = this.this$0;
                this.label = 3;
                sh11Var2.B.emit(Boolean.FALSE, this);
                return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
        }
        zg11 zg11Var = this.this$0.y;
        this.label = 2;
    }
}
