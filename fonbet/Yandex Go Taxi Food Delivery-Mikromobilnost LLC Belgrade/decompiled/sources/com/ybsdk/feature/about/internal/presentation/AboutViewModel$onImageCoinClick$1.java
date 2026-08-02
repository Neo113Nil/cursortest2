package com.ybsdk.feature.about.internal.presentation;

import com.ybsdk.core.utils.text.Text;
import defpackage.a6;
import defpackage.ddf;
import defpackage.dzh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rje;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.yvi0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.about.internal.presentation.AboutViewModel$onImageCoinClick$1", f = "AboutViewModel.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AboutViewModel$onImageCoinClick$1 extends SuspendLambda implements wls {
    long J$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutViewModel$onImageCoinClick$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AboutViewModel$onImageCoinClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AboutViewModel$onImageCoinClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            currentTimeMillis = System.currentTimeMillis();
            b bVar = this.this$0;
            if (bVar.E == 5) {
                if (currentTimeMillis - bVar.F <= 3500) {
                    return zy11Var;
                }
                bVar.E = 0;
            }
            int i2 = bVar.E + 1;
            bVar.E = i2;
            if (i2 == 5) {
                ddf ddfVar = bVar.D;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                obj = ((yvi0) ddfVar.b).u(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j = currentTimeMillis;
            }
            this.this$0.F = currentTimeMillis;
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = this.J$0;
        kotlin.b.b(obj);
        String str = (String) obj;
        if (str != null) {
            b bVar2 = this.this$0;
            rje.b(bVar2.B, str, "Metrical UUID");
            bVar2.Z(new a6(unr0.h(Text.Companion, dzh0.ybsdk_about_uuid_was_copied)));
        }
        currentTimeMillis = j;
        this.this$0.F = currentTimeMillis;
        return zy11Var;
    }
}
