package com.yandex.messaging.input.preview;

import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import defpackage.iv21;
import defpackage.kb90;
import defpackage.lb90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oh21;
import defpackage.oyh0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llb90;", "<anonymous>", "(Ltse;)Llb90;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.preview.PanelUrlPreviewModel$Factory$create$5", f = "PanelUrlPreviewModel.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PanelUrlPreviewModel$Factory$create$5 extends SuspendLambda implements wls {
    final /* synthetic */ oh21 $data;
    Object L$0;
    int label;
    final /* synthetic */ kb90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelUrlPreviewModel$Factory$create$5(kb90 kb90Var, oh21 oh21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kb90Var;
        this.$data = oh21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PanelUrlPreviewModel$Factory$create$5(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PanelUrlPreviewModel$Factory$create$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String string = this.this$0.e.getString(oyh0.messaging_user_url_preview_title);
            String str3 = this.$data.x;
            if (str3 == null) {
                str = string;
                str2 = null;
                if (str2 == null && ((iv21) this.this$0.c.get()).c) {
                    LocalizedData a = this.this$0.d.a(this.$data.b);
                    str2 = a == null ? a.getDisplayName() : null;
                }
                if (str2 == null) {
                    str2 = this.$data.c;
                }
                return new lb90(str, str2, null);
            }
            com.yandex.messaging.internal.storage.contacts.a aVar = this.this$0.a;
            this.L$0 = string;
            this.label = 1;
            Object b = aVar.b(str3, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = string;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            b.b(obj);
        }
        str2 = (String) obj;
        if (str2 == null) {
            LocalizedData a2 = this.this$0.d.a(this.$data.b);
            if (a2 == null) {
            }
        }
        if (str2 == null) {
        }
        return new lb90(str, str2, null);
    }
}
