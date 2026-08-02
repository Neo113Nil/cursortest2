package com.ybsdk.feature.resolver.internal.screens.empty;

import com.ybsdk.core.analytics.generated.delegates.ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult;
import com.ybsdk.feature.resolver.api.LinkResolveType;
import com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverParams;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.em3;
import defpackage.gtu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.w511;
import defpackage.wlp;
import defpackage.wls;
import defpackage.wvn;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverViewModel$loadData$3", f = "EmptyLinkResolverViewModel.kt", l = {66, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EmptyLinkResolverViewModel$loadData$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyLinkResolverViewModel$loadData$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EmptyLinkResolverViewModel$loadData$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EmptyLinkResolverViewModel$loadData$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0063, code lost:
    
        if (r10 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
    
        if (r10 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object b;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        String str;
        String shortUrl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (((CommonFeatureFlag) this.this$0.B.a.d(wlp.w).getData()).isEnabled() && (((EmptyLinkResolverParams.Common) this.this$0.C).getLinkResolveType() instanceof LinkResolveType.OnboardingDeeplink)) {
                a aVar = this.this$0;
                com.ybsdk.feature.resolver.internal.interactors.a aVar2 = aVar.G;
                LinkResolveType linkResolveType = ((EmptyLinkResolverParams.Common) aVar.C).getLinkResolveType();
                this.label = 1;
                b = aVar2.b(linkResolveType, this);
            } else {
                a aVar3 = this.this$0;
                com.ybsdk.feature.resolver.internal.interactors.a aVar4 = aVar3.G;
                LinkResolveType linkResolveType2 = ((EmptyLinkResolverParams.Common) aVar3.C).getLinkResolveType();
                this.label = 2;
                a = aVar4.a(linkResolveType2, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            b.b(obj);
            b = ((Result) obj).getValue();
            a aVar5 = this.this$0;
            if (!(b instanceof Result.Failure)) {
                aVar5.c0((List) b);
            }
            a aVar6 = this.this$0;
            Throwable a2 = Result.a(b);
            if (a2 != null) {
                em3.e(aVar6.F.z, a2.getMessage(), null, null, ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult.ERROR, 6);
                pz40 Y = aVar6.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    ((wvn) value).getClass();
                } while (!r0Var.k(value, new wvn(a2)));
            }
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
            a aVar7 = this.this$0;
            if (!(a instanceof Result.Failure)) {
                String str2 = (String) a;
                com.ybsdk.feature.resolver.internal.interactors.a aVar8 = aVar7.G;
                LinkResolveType linkResolveType3 = ((EmptyLinkResolverParams.Common) aVar7.C).getLinkResolveType();
                aVar8.getClass();
                if (linkResolveType3 instanceof LinkResolveType.OnboardingDeeplink) {
                    shortUrl = ((LinkResolveType.OnboardingDeeplink) linkResolveType3).getOnboardingUrl();
                } else if (linkResolveType3 instanceof LinkResolveType.ShortLink) {
                    shortUrl = ((LinkResolveType.ShortLink) linkResolveType3).getShortUrl();
                } else {
                    if (!linkResolveType3.equals(LinkResolveType.LandingFromStartSession.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    str = null;
                    em3.e(aVar7.F.z, null, str, str2, ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult.OK, 1);
                    aVar7.c0(gtu0.d(str2));
                }
                str = shortUrl;
                em3.e(aVar7.F.z, null, str, str2, ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult.OK, 1);
                aVar7.c0(gtu0.d(str2));
            }
            a aVar9 = this.this$0;
            Throwable a3 = Result.a(a);
            if (a3 != null) {
                em3.e(aVar9.F.z, a3.getMessage(), null, null, ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult.ERROR, 6);
                LinkResolveType linkResolveType4 = ((EmptyLinkResolverParams.Common) aVar9.C).getLinkResolveType();
                if (linkResolveType4 instanceof LinkResolveType.LandingFromStartSession) {
                    aVar9.D.e();
                } else {
                    if (!(linkResolveType4 instanceof LinkResolveType.OnboardingDeeplink) && !(linkResolveType4 instanceof LinkResolveType.ShortLink)) {
                        w511.b();
                        return null;
                    }
                    pz40 Y2 = aVar9.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                        ((wvn) value2).getClass();
                    } while (!r0Var2.k(value2, new wvn(a3)));
                }
            }
        }
        return zy11.a;
    }
}
