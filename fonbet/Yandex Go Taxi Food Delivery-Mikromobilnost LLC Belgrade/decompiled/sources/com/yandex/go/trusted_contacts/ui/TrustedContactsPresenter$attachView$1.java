package com.yandex.go.trusted_contacts.ui;

import defpackage.a201;
import defpackage.b64;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.rh11;
import defpackage.sh11;
import defpackage.tse0;
import defpackage.uh11;
import defpackage.v770;
import defpackage.vh11;
import defpackage.w511;
import defpackage.wh11;
import defpackage.zls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luh11;", ClidProvider.STATE, "", "isUploading", "Lxh11;", "<anonymous>", "(Luh11;Z)Lxh11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.ui.TrustedContactsPresenter$attachView$1", f = "TrustedContactsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsPresenter$attachView$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ sh11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsPresenter$attachView$1(sh11 sh11Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = sh11Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        TrustedContactsPresenter$attachView$1 trustedContactsPresenter$attachView$1 = new TrustedContactsPresenter$attachView$1(this.this$0, (Continuation) obj3);
        trustedContactsPresenter$attachView$1.L$0 = (uh11) obj;
        trustedContactsPresenter$attachView$1.Z$0 = booleanValue;
        return trustedContactsPresenter$attachView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uh11 uh11Var = (uh11) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a201 a201Var = this.this$0.z;
        if (uh11Var == null || z) {
            return wh11.a;
        }
        int i = rh11.b[uh11Var.d.ordinal()];
        if (i == 1) {
            int i2 = uh11Var.f;
            int i3 = uh11Var.g;
            o7r0 o7r0Var = (o7r0) a201Var.c;
            String str = ((v770) a201Var.b).a;
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            b64.B(i2, hashMap, "trusted_contacts", i3, "trusting_contacts");
            o7r0Var.a.a("TrustedContacts.Shown", hashMap, 1, tse0.r("open_reason", hashMap, str));
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            o7r0 o7r0Var2 = (o7r0) a201Var.c;
            o7r0Var2.getClass();
            o7r0Var2.a.a("TrustedContacts.Delete.Shown", new HashMap(), 1, new HashMap());
        }
        return new vh11(uh11Var);
    }
}
