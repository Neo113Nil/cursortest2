package com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggest;
import defpackage.g050;
import defpackage.gtj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Ljtj0;", "Lx9v0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1", f = "CitySuggestDialogModalViewFactory.kt", l = {177, HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $position;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1(a aVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$position = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1 citySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1 = new CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1(this.this$0, this.$position, continuation);
        citySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1.L$0 = obj;
        return citySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        g050 g050Var;
        PlainAddress plainAddress;
        PlainAddress plainAddress2;
        int i;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                b.b(obj);
                PlainAddress plainAddress3 = PlainAddress.a;
                aVar = this.this$0;
                g050Var = aVar.a;
                int i3 = this.$position;
                this.L$0 = vprVar;
                this.L$1 = plainAddress3;
                this.L$2 = g050Var;
                this.L$3 = aVar;
                this.L$4 = plainAddress3;
                this.I$0 = i3;
                this.label = 1;
                if (g050Var.a(this) != coroutineSingletons) {
                    plainAddress = plainAddress3;
                    plainAddress2 = plainAddress;
                    i = i3;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            i = this.I$0;
            plainAddress = (PlainAddress) this.L$4;
            aVar = (a) this.L$3;
            g050Var = (g050) this.L$2;
            PlainAddress plainAddress4 = (PlainAddress) this.L$1;
            b.b(obj);
            plainAddress2 = plainAddress4;
            CitySuggest citySuggest = (CitySuggest) aVar.b.b(i);
            g050Var.d(null);
            plainAddress.b2(citySuggest);
            gtj0 gtj0Var = new gtj0(new pv0(plainAddress2, null, null, null, null, null, null, null, 766));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
