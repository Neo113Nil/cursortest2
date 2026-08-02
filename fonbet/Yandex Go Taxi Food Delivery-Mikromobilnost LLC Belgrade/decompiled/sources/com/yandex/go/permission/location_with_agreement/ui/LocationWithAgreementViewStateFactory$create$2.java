package com.yandex.go.permission.location_with_agreement.ui;

import android.graphics.Typeface;
import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementExperiment;
import defpackage.bd;
import defpackage.d6z;
import defpackage.j2h0;
import defpackage.jbz;
import defpackage.kdz;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obz;
import defpackage.pbz;
import defpackage.qbz;
import defpackage.qje;
import defpackage.rbz;
import defpackage.sbz;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsbz;", "<anonymous>", "(Ltse;)Lsbz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationWithAgreementViewStateFactory$create$2", f = "LocationWithAgreementViewStateFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LocationWithAgreementViewStateFactory$create$2 extends SuspendLambda implements wls {
    final /* synthetic */ bd $acceptance;
    final /* synthetic */ ExplainingLocationPermissionScreenWithAgreementExperiment $experiment;
    final /* synthetic */ jbz $locationPermissionWithAgreementModalViewDelegate;
    int label;
    final /* synthetic */ kdz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationWithAgreementViewStateFactory$create$2(ExplainingLocationPermissionScreenWithAgreementExperiment explainingLocationPermissionScreenWithAgreementExperiment, jbz jbzVar, kdz kdzVar, bd bdVar, Continuation continuation) {
        super(2, continuation);
        this.$experiment = explainingLocationPermissionScreenWithAgreementExperiment;
        this.$locationPermissionWithAgreementModalViewDelegate = jbzVar;
        this.this$0 = kdzVar;
        this.$acceptance = bdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationWithAgreementViewStateFactory$create$2(this.$experiment, this.$locationPermissionWithAgreementModalViewDelegate, this.this$0, this.$acceptance, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationWithAgreementViewStateFactory$create$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qbz qbzVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ExplainingLocationPermissionScreenWithAgreementExperiment explainingLocationPermissionScreenWithAgreementExperiment = this.$experiment;
        String Y = d6z.Y(explainingLocationPermissionScreenWithAgreementExperiment, explainingLocationPermissionScreenWithAgreementExperiment.d);
        this.$locationPermissionWithAgreementModalViewDelegate.getClass();
        this.$locationPermissionWithAgreementModalViewDelegate.getClass();
        Typeface a = this.$locationPermissionWithAgreementModalViewDelegate.a(this.this$0.a);
        int t = qje.t(this.$experiment.g ? xng0.everFront : xng0.textMain, this.this$0.a);
        ExplainingLocationPermissionScreenWithAgreementExperiment explainingLocationPermissionScreenWithAgreementExperiment2 = this.$experiment;
        boolean z = explainingLocationPermissionScreenWithAgreementExperiment2.g;
        rbz rbzVar = new rbz(Y, 24.0f, 27.0f, a, t, z);
        if (z) {
            qbzVar = null;
        } else {
            kdz kdzVar = this.this$0;
            ExplainingLocationPermissionScreenWithAgreementExperiment.LocationIconDto locationIconDto = explainingLocationPermissionScreenWithAgreementExperiment2.e.a;
            String a2 = ((m7x0) kdzVar.c).a(locationIconDto.a);
            ufu ufuVar = (ufu) kdzVar.b;
            pbz pbzVar = new pbz(ufuVar.e(locationIconDto.c), ufuVar.g(locationIconDto.b), a2);
            ExplainingLocationPermissionScreenWithAgreementExperiment explainingLocationPermissionScreenWithAgreementExperiment3 = this.$experiment;
            String Y2 = d6z.Y(explainingLocationPermissionScreenWithAgreementExperiment3, explainingLocationPermissionScreenWithAgreementExperiment3.e.c);
            ExplainingLocationPermissionScreenWithAgreementExperiment explainingLocationPermissionScreenWithAgreementExperiment4 = this.$experiment;
            qbzVar = new qbz(pbzVar, Y2, d6z.Y(explainingLocationPermissionScreenWithAgreementExperiment4, explainingLocationPermissionScreenWithAgreementExperiment4.e.b));
        }
        ExplainingLocationPermissionScreenWithAgreementExperiment explainingLocationPermissionScreenWithAgreementExperiment5 = this.$experiment;
        String Y3 = d6z.Y(explainingLocationPermissionScreenWithAgreementExperiment5, explainingLocationPermissionScreenWithAgreementExperiment5.f);
        bd bdVar = this.$acceptance;
        String str = bdVar != null ? bdVar.e : null;
        if (str == null) {
            str = "";
        }
        return new sbz(rbzVar, qbzVar, Y3, new obz(str, qje.t(this.$experiment.g ? xng0.everFront : xng0.textMinor, this.this$0.a), qje.t(this.$experiment.g ? xng0.everFront : xng0.textMain, this.this$0.a)), this.$locationPermissionWithAgreementModalViewDelegate.b(this.this$0.e.getThemeType().f()), this.$experiment.g ? new Integer(j2h0.location_permission_with_agreement_background) : null);
    }
}
