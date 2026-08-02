package com.yandex.go.preorder.suggested.menu.presenter;

import com.yandex.go.coroutines.h;
import com.yandex.go.preorder.suggested.menu.analytics.SuggestMenuLegacyAnalytics$EntryPoint;
import com.yandex.go.preorder.suggested.menu.analytics.SuggestMenuLegacyAnalytics$PointType;
import com.yandex.go.preorder.suggested.menu.analytics.SuggestMenuLegacyAnalytics$Prefix;
import com.yandex.go.preorder.suggested.menu.experiment.SuggestMenuExperiment;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.b6v0;
import defpackage.hwo0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.qke;
import defpackage.qu;
import defpackage.sb2;
import defpackage.sho;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.suggested.menu.presenter.SuggestMenuPresenter$attachView$1", f = "SuggestMenuPresenter.kt", l = {141, 147, 150}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SuggestMenuPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestMenuPresenter$attachView$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestMenuPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestMenuPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        if (r14 != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0032, code lost:
    
        if (r14 == r0) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SuggestMenuLegacyAnalytics$PointType suggestMenuLegacyAnalytics$PointType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0.J;
            this.label = 1;
            obj = hVar.a(this);
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
                if (((SuggestMenuExperiment) obj).e) {
                    qke.E(this.this$0.A, HapticController$Effect.CLICK_MEDIUM, false, 8);
                }
                b bVar = this.this$0;
                this.label = 3;
                return b.Mg(bVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
        }
        if (!((SuggestMenuExperiment) obj).b) {
            b bVar2 = this.this$0;
            if (bVar2.y.e != EntryPoint.SUPER_APP_HEADER) {
                ((com.yandex.go.preorder.suggested.menu.router.a) bVar2.x.b).r(new qu(9));
                return zy11Var;
            }
        }
        b bVar3 = this.this$0;
        hwo0 hwo0Var = bVar3.z;
        PointType pointType = bVar3.y.b;
        hwo0Var.getClass();
        int i2 = pointType == null ? -1 : b6v0.b[pointType.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                suggestMenuLegacyAnalytics$PointType = SuggestMenuLegacyAnalytics$PointType.Destination;
            }
            h hVar2 = this.this$0.J;
            this.label = 2;
            obj = hVar2.a(this);
        } else {
            suggestMenuLegacyAnalytics$PointType = SuggestMenuLegacyAnalytics$PointType.Source;
        }
        o7r0 o7r0Var = (o7r0) hwo0Var.w;
        SuggestMenuLegacyAnalytics$Prefix suggestMenuLegacyAnalytics$Prefix = (SuggestMenuLegacyAnalytics$Prefix) hwo0Var.x;
        for (SuggestMenuLegacyAnalytics$EntryPoint suggestMenuLegacyAnalytics$EntryPoint : SuggestMenuLegacyAnalytics$EntryPoint.a()) {
            if (jl40.l(suggestMenuLegacyAnalytics$EntryPoint.getEventValue(), ((EntryPoint) hwo0Var.b).getValue())) {
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(AppSettingsContract$Setting.COLUMN_PREFIX, suggestMenuLegacyAnalytics$Prefix.getEventValue());
                hashMap.put("pointType", suggestMenuLegacyAnalytics$PointType.getEventValue());
                hashMap.put("entry_point", suggestMenuLegacyAnalytics$EntryPoint.getEventValue());
                HashMap hashMap2 = new HashMap();
                Regex regex = sho.a;
                o7r0Var.a.a(sb2.q("${prefix}.Shown", hashMap), hashMap, 1, hashMap2);
                h hVar22 = this.this$0.J;
                this.label = 2;
                obj = hVar22.a(this);
            }
        }
        w511.i("Collection contains no element matching the predicate.");
        return null;
    }
}
