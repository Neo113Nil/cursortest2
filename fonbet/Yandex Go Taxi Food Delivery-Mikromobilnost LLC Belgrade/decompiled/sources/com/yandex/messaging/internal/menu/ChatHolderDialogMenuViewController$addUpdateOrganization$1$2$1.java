package com.yandex.messaging.internal.menu;

import android.widget.Toast;
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import com.yandex.messaging.domain.chat.h;
import defpackage.f3b;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o721;
import defpackage.oyh0;
import defpackage.rfa;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.menu.ChatHolderDialogMenuViewController$addUpdateOrganization$1$2$1", f = "ChatHolderDialogMenuViewController.kt", l = {327}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatHolderDialogMenuViewController$addUpdateOrganization$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ f3b $data;
    final /* synthetic */ long $orgId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHolderDialogMenuViewController$addUpdateOrganization$1$2$1(c cVar, f3b f3bVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$data = f3bVar;
        this.$orgId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatHolderDialogMenuViewController$addUpdateOrganization$1$2$1(this.this$0, this.$data, this.$orgId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatHolderDialogMenuViewController$addUpdateOrganization$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0.k;
            o721 o721Var = new o721(this.$data.a, this.$orgId);
            this.label = 1;
            obj = hVar.a(o721Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        UpdateOrganizationResult updateOrganizationResult = (UpdateOrganizationResult) obj;
        if (updateOrganizationResult instanceof UpdateOrganizationResult.Success) {
            Toast.makeText(this.this$0.a, oyh0.chat_organization_updated, 0).show();
        } else {
            boolean z = updateOrganizationResult instanceof UpdateOrganizationResult.UserError;
            c cVar = this.this$0;
            if (z) {
                Toast.makeText(this.this$0.a, cVar.a.getResources().getString(oyh0.chat_organization_update_forbidden, j73.L(((UpdateOrganizationResult.UserError) updateOrganizationResult).getUsers(), Extension.FIX_SPACE, null, new rfa(10), 30)), 0).show();
            } else if (updateOrganizationResult instanceof UpdateOrganizationResult.OrganizationMismatchError) {
                Toast.makeText(this.this$0.a, cVar.a.getResources().getString(oyh0.toast_can_not_move_chat_organization_mismatch), 0).show();
            } else {
                Toast.makeText(cVar.a, oyh0.backend_error, 0).show();
            }
        }
        return zy11.a;
    }
}
