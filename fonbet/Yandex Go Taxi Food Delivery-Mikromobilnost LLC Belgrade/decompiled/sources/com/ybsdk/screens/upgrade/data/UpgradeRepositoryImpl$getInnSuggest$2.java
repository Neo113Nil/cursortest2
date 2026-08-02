package com.ybsdk.screens.upgrade.data;

import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdInnRequest;
import defpackage.evu0;
import defpackage.gtu0;
import defpackage.ja21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vqg;
import defpackage.zy11;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/InnResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.upgrade.data.UpgradeRepositoryImpl$getInnSuggest$2", f = "UpgradeRepositoryImpl.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeRepositoryImpl$getInnSuggest$2 extends SuspendLambda implements tls {
    final /* synthetic */ ja21 $form;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeRepositoryImpl$getInnSuggest$2(a aVar, ja21 ja21Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$form = ja21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UpgradeRepositoryImpl$getInnSuggest$2(this.this$0, this.$form, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((UpgradeRepositoryImpl$getInnSuggest$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Api api = this.this$0.a;
            ja21 ja21Var = this.$form;
            String str2 = ja21Var.g;
            String str3 = ja21Var.a;
            String str4 = !evu0.J(str3) ? str3 : null;
            String str5 = ja21Var.b;
            String str6 = !evu0.J(str5) ? str5 : null;
            String str7 = ja21Var.c;
            String str8 = !evu0.J(str7) ? str7 : null;
            Date b = vqg.b(ja21Var.e, YbDateFormat.SHORT_USER_DATE_ONLY);
            if (b != null) {
                String a = vqg.a(b, YbDateFormat.SHORT_SERVER_DATE_ONLY);
                if (!evu0.J(a)) {
                    str = a;
                    String j = gtu0.a.j(ja21Var.d, "");
                    SimplifiedIdInnRequest simplifiedIdInnRequest = new SimplifiedIdInnRequest(str2, str4, str6, str8, evu0.J(j) ? j : null, str);
                    this.label = 1;
                    n = api.n(simplifiedIdInnRequest, this);
                    if (n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            str = null;
            String j2 = gtu0.a.j(ja21Var.d, "");
            SimplifiedIdInnRequest simplifiedIdInnRequest2 = new SimplifiedIdInnRequest(str2, str4, str6, str8, evu0.J(j2) ? j2 : null, str);
            this.label = 1;
            n = api.n(simplifiedIdInnRequest2, this);
            if (n == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            n = ((Result) obj).getValue();
        }
        return new Result(n);
    }
}
