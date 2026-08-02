package com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Ljtj0;", "Lx9v0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1", f = "CitySuggestDialogModalViewFactory.kt", l = {101, 102}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $query;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1 citySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1 = new CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1(this.this$0, this.$query, continuation);
        citySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1.L$0 = obj;
        return citySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r0.emit((defpackage.jtj0) r12, r11) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r12 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = this.$query;
            this.L$0 = vprVar;
            this.label = 1;
            aVar.c.e.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequest$2(aVar.c, str, aVar.d, aVar, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
