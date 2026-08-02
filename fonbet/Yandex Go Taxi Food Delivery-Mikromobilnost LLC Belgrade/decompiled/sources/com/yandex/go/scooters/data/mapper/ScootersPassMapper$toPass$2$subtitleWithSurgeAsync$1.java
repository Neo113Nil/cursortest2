package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import defpackage.ck90;
import defpackage.f3p0;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q3p0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$toPass$2$subtitleWithSurgeAsync$1", f = "ScootersPassMapper.kt", l = {283, 296}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$toPass$2$subtitleWithSurgeAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ ck90 $this_toPass;
    double D$0;
    double D$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$toPass$2$subtitleWithSurgeAsync$1(fef fefVar, ck90 ck90Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$this_toPass = ck90Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$toPass$2$subtitleWithSurgeAsync$1(this.$currencyRules, this.$this_toPass, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$toPass$2$subtitleWithSurgeAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        double doubleValue;
        q3p0 q3p0Var;
        FormattedText formattedText;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Double d = this.$this_toPass.n;
            if (d != null) {
                d dVar = this.this$0;
                doubleValue = d.doubleValue();
                q3p0 q3p0Var2 = dVar.e;
                f3p0 f3p0Var = dVar.i;
                this.L$0 = q3p0Var2;
                this.D$0 = doubleValue;
                this.D$1 = doubleValue;
                this.label = 1;
                Object b = f3p0Var.a.b(this);
                if (b != coroutineSingletons) {
                    q3p0Var = q3p0Var2;
                    obj = b;
                }
            }
            str = null;
            if (str != null || str.length() == 0) {
                formattedText = this.$this_toPass.e;
            } else {
                int size = this.$this_toPass.e.a.size() + 1;
                ck90 ck90Var = this.$this_toPass;
                ListBuilder listBuilder = new ListBuilder(size);
                listBuilder.add(new FormattedText.d(str, FormattedText.VerticalAlignment.CENTER, null, 0, 60));
                listBuilder.addAll(ck90Var.e.a);
                formattedText = new FormattedText(listBuilder.j());
            }
            d dVar2 = this.this$0;
            fef fefVar = this.$currencyRules;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            Object c = dVar2.c(formattedText, fefVar, this);
            return c != coroutineSingletons ? coroutineSingletons : c;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        doubleValue = this.D$1;
        q3p0Var = (q3p0) this.L$0;
        kotlin.b.b(obj);
        ScootersSurgeExperiment scootersSurgeExperiment = (ScootersSurgeExperiment) obj;
        q3p0Var.getClass();
        str = !scootersSurgeExperiment.b ? null : q3p0.a(doubleValue, scootersSurgeExperiment).d;
        if (str != null) {
        }
        formattedText = this.$this_toPass.e;
        d dVar22 = this.this$0;
        fef fefVar2 = this.$currencyRules;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object c2 = dVar22.c(formattedText, fefVar2, this);
        if (c2 != coroutineSingletons) {
        }
    }
}
