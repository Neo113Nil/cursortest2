package com.yandex.go.safety.center.help;

import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.api.ShareResponse;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nrl0;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.swe0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.help.SafetyCenterHelpPresenter$share$1", f = "SafetyCenterHelpPresenter.kt", l = {241}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterHelpPresenter$share$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $fromCall;
    final /* synthetic */ boolean $needShareLocation;
    final /* synthetic */ List<String> $recipients;
    final /* synthetic */ ShareRequestParam.NotificationType $type;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterHelpPresenter$share$1(e eVar, List list, ShareRequestParam.NotificationType notificationType, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$recipients = list;
        this.$type = notificationType;
        this.$needShareLocation = z;
        this.$fromCall = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterHelpPresenter$share$1(this.this$0, this.$recipients, this.$type, this.$needShareLocation, this.$fromCall, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterHelpPresenter$share$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[LOOP:0: B:33:0x00a9->B:35:0x00af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Throwable th;
        e eVar;
        e eVar2;
        List<String> list;
        j jVar;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e eVar3 = this.this$0;
                List<String> list2 = this.$recipients;
                ShareRequestParam.NotificationType notificationType = this.$type;
                boolean z2 = this.$needShareLocation;
                z = this.$fromCall;
                try {
                    eVar3.G.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    SafetyCenterHelpPresenter$share$1$1$res$1 safetyCenterHelpPresenter$share$1$1$res$1 = new SafetyCenterHelpPresenter$share$1$1$res$1(eVar3, notificationType, z2, list2, null);
                    this.L$0 = eVar3;
                    this.L$1 = list2;
                    this.L$2 = eVar3;
                    this.Z$0 = z;
                    this.label = 1;
                    obj = tje.k0(mdhVar, safetyCenterHelpPresenter$share$1$1$res$1, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eVar2 = eVar3;
                    eVar = eVar2;
                    list = list2;
                } catch (Throwable th2) {
                    th = th2;
                    eVar = eVar3;
                    jVar = eVar.z;
                    jst.e.k(th, "Error with /share executing");
                    if (!z && jVar.h()) {
                        List f = jVar.f();
                        ArrayList arrayList = new ArrayList(tcc.n(f, 10));
                        it = f.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((swe0) it.next()).b);
                        }
                        String e = jVar.e();
                        jVar.m(e != null ? e : "", arrayList);
                    }
                    if (!jVar.h() && eVar.Lg() && z) {
                        ((nrl0) eVar.Dg()).showError(eVar.A.a(SafetyCenterExperiment.L10nKey.ERROR_TRUSTED_CONTACTS_NOTIFICATION_FAILED));
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                eVar = (e) this.L$2;
                list = (List) this.L$1;
                eVar2 = (e) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jVar = eVar.z;
                    jst.e.k(th, "Error with /share executing");
                    if (!z) {
                        List f2 = jVar.f();
                        ArrayList arrayList2 = new ArrayList(tcc.n(f2, 10));
                        it = f2.iterator();
                        while (it.hasNext()) {
                        }
                        String e2 = jVar.e();
                        jVar.m(e2 != null ? e2 : "", arrayList2);
                    }
                    if (!jVar.h()) {
                        ((nrl0) eVar.Dg()).showError(eVar.A.a(SafetyCenterExperiment.L10nKey.ERROR_TRUSTED_CONTACTS_NOTIFICATION_FAILED));
                    }
                    return zy11.a;
                }
            }
            ShareResponse shareResponse = (ShareResponse) obj;
            j jVar2 = eVar2.z;
            jVar2.getClass();
            boolean z3 = shareResponse.a;
            ShareResponse.Message message = shareResponse.b;
            if (z3) {
                String str = message != null ? message.a : null;
                if (str != null && str.length() != 0) {
                    String str2 = message != null ? message.a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    jVar2.m(str2, list);
                }
            }
            return zy11.a;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
