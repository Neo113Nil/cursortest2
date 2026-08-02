package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family;

import defpackage.eu90;
import defpackage.ind0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obp;
import defpackage.pbp;
import defpackage.tse;
import defpackage.wap;
import defpackage.wls;
import defpackage.xvz;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyViewModel$onWebPageOpensNativeSharing$1", f = "FamilyViewModel.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FamilyViewModel$onWebPageOpensNativeSharing$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $mimeType;
    final /* synthetic */ String $text;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyViewModel$onWebPageOpensNativeSharing$1(b bVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$title = str;
        this.$text = str2;
        this.$mimeType = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyViewModel$onWebPageOpensNativeSharing$1(this.this$0, this.$title, this.$text, this.$mimeType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyViewModel$onWebPageOpensNativeSharing$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = this.this$0.A;
            pbp pbpVar = new pbp(this.$title, this.$text, this.$mimeType);
            this.label = 1;
            if (n0Var.emit(pbpVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar = this.this$0;
        wap wapVar = bVar.z;
        if (wapVar != null) {
            ind0 a = bVar.b.a.a();
            obp obpVar = bVar.x;
            String uuid = a.a.toString();
            String str = wapVar.a;
            String str2 = wapVar.c;
            eu90 eu90Var = obpVar.b;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", uuid, "url", str);
            t.put("skipButtonText", str2);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("FamilyInvite.Share.Clicked", t);
        }
        return zy11.a;
    }
}
