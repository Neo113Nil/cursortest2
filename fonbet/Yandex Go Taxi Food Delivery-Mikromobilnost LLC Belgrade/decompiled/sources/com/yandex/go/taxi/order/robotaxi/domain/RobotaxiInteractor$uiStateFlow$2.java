package com.yandex.go.taxi.order.robotaxi.domain;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bdc;
import defpackage.g92;
import defpackage.ief;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ovk0;
import defpackage.pkf;
import defpackage.pvk0;
import defpackage.qoh;
import defpackage.qvk0;
import defpackage.rol0;
import defpackage.svk0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvk0;
import defpackage.uvk0;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Luvk0;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.robotaxi.domain.RobotaxiInteractor$uiStateFlow$2", f = "RobotaxiInteractor.kt", l = {62, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RobotaxiInteractor$uiStateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ ief $currencyRules;
    final /* synthetic */ qvk0 $model;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotaxiInteractor$uiStateFlow$2(c cVar, qvk0 qvk0Var, ief iefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$model = qvk0Var;
        this.$currencyRules = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RobotaxiInteractor$uiStateFlow$2 robotaxiInteractor$uiStateFlow$2 = new RobotaxiInteractor$uiStateFlow$2(this.this$0, this.$model, this.$currencyRules, continuation);
        robotaxiInteractor$uiStateFlow$2.L$0 = obj;
        return robotaxiInteractor$uiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RobotaxiInteractor$uiStateFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0165  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        ArrayList arrayList;
        String str;
        tvk0 tvk0Var;
        ArrayList arrayList2;
        CharSequence charSequence;
        tvk0 tvk0Var2;
        String str2;
        String str3;
        uvk0 uvk0Var;
        BitmapDrawable bitmapDrawable;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new RobotaxiInteractor$uiStateFlow$2$title$1(this.this$0, this.$model, null), 3);
            h = tje.h(tseVar, null, null, new RobotaxiInteractor$uiStateFlow$2$bullets$1(this.this$0, this.$model, this.$currencyRules, null), 3);
            c cVar = this.this$0;
            ArrayList<ovk0> arrayList3 = this.$model.d;
            e eVar = cVar.c;
            arrayList = new ArrayList(tcc.n(arrayList3, 10));
            for (ovk0 ovk0Var : arrayList3) {
                kdc v = eVar.v(ovk0Var.b);
                if (v == null) {
                    v = new bdc(xng0.textOnControl);
                }
                kdc a = eVar.a(ovk0Var.c);
                if (a == null) {
                    a = new bdc(xng0.controlMain);
                }
                arrayList.add(new svk0(ovk0Var.a, v, a, ovk0Var.e));
            }
            qvk0 qvk0Var = this.$model;
            pvk0 pvk0Var = qvk0Var.e;
            tvk0 tvk0Var3 = pvk0Var != null ? new tvk0(pvk0Var.a, pvk0Var.b, pvk0Var.c) : null;
            str = qvk0Var.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = arrayList;
            this.L$4 = tvk0Var3;
            this.L$5 = str;
            this.label = 1;
            obj = h2.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj != coroutineSingletons) {
                tvk0Var = tvk0Var3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = (String) this.L$6;
                uvk0Var = (uvk0) this.L$5;
                kotlin.b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    return new g92(2, uvk0.a(uvk0Var, pkf.g(bitmapDrawable, this.$model.f, null)));
                }
                c cVar2 = this.this$0;
                cVar2.getClass();
                return new b(new rol0(new RobotaxiInteractor$loadImageFlow$1(cVar2, str3, null)), uvk0Var);
            }
            CharSequence charSequence2 = (CharSequence) this.L$6;
            String str4 = (String) this.L$5;
            tvk0 tvk0Var4 = (tvk0) this.L$4;
            ?? r7 = (List) this.L$3;
            kotlin.b.b(obj);
            arrayList2 = r7;
            charSequence = charSequence2;
            str2 = str4;
            tvk0Var2 = tvk0Var4;
            uvk0 uvk0Var2 = new uvk0(str2, charSequence, (List) obj, arrayList2, tvk0Var2, null);
            str3 = this.$model.f;
            if (str3 != null) {
                return new g92(2, uvk0Var2);
            }
            e eVar2 = this.this$0.c;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = uvk0Var2;
            this.L$6 = str3;
            this.label = 3;
            obj = e.o(eVar2, str3, null, this, 14);
            if (obj != coroutineSingletons) {
                uvk0Var = uvk0Var2;
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                }
            }
            return coroutineSingletons;
        }
        str = (String) this.L$5;
        tvk0 tvk0Var5 = (tvk0) this.L$4;
        ?? r4 = (List) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        arrayList = r4;
        tvk0Var = tvk0Var5;
        String str5 = str;
        CharSequence charSequence3 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = arrayList;
        this.L$4 = tvk0Var;
        this.L$5 = str5;
        this.L$6 = charSequence3;
        this.label = 2;
        obj = h.k(this);
        if (obj != coroutineSingletons) {
            arrayList2 = arrayList;
            charSequence = charSequence3;
            tvk0Var2 = tvk0Var;
            str2 = str5;
            uvk0 uvk0Var22 = new uvk0(str2, charSequence, (List) obj, arrayList2, tvk0Var2, null);
            str3 = this.$model.f;
            if (str3 != null) {
            }
        }
        return coroutineSingletons;
    }
}
