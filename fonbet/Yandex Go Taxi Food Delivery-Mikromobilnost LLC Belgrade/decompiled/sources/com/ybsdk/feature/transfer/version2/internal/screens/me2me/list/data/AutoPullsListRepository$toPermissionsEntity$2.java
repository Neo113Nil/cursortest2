package com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.AutoPullPermissionDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitGetAutoPullResultDto;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.domain.AutoPullPermissionEntity$Status;
import defpackage.f22;
import defpackage.gwn;
import defpackage.job1;
import defpackage.ks3;
import defpackage.ls3;
import defpackage.m4m0;
import defpackage.mvg;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.tcc;
import defpackage.txg0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetAutoPullResultDto;", "dto", "Lls3;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetAutoPullResultDto;)Lls3;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data.AutoPullsListRepository$toPermissionsEntity$2", f = "AutoPullsListRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoPullsListRepository$toPermissionsEntity$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPullsListRepository$toPermissionsEntity$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoPullsListRepository$toPermissionsEntity$2 autoPullsListRepository$toPermissionsEntity$2 = new AutoPullsListRepository$toPermissionsEntity$2(this.this$0, continuation);
        autoPullsListRepository$toPermissionsEntity$2.L$0 = obj;
        return autoPullsListRepository$toPermissionsEntity$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoPullsListRepository$toPermissionsEntity$2) create((Me2MeDebitGetAutoPullResultDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Me2MeDebitGetAutoPullResultDto me2MeDebitGetAutoPullResultDto = (Me2MeDebitGetAutoPullResultDto) this.L$0;
        List<AutoPullPermissionDto> permissions = me2MeDebitGetAutoPullResultDto.getPermissions();
        a aVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(permissions, 10));
        for (AutoPullPermissionDto autoPullPermissionDto : permissions) {
            aVar.getClass();
            String id = autoPullPermissionDto.getId();
            String title = autoPullPermissionDto.getTitle();
            rbv f = job1.f(qxy0.c(autoPullPermissionDto.getImage(), null), new f22(29));
            if (f == null) {
                f = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
            }
            arrayList.add(new ks3(id, title, f, autoPullPermissionDto.getActionDescription(), AutoPullPermissionEntity$Status.DEFAULT));
        }
        return new ls3(arrayList, m4m0.k(me2MeDebitGetAutoPullResultDto.getHeader()), gwn.a(me2MeDebitGetAutoPullResultDto.getEmptyListInfo()));
    }
}
