package com.yandex.messaging.internal.urlpreview.impl;

import com.yandex.images.FadingDrawable;
import defpackage.ad7;
import defpackage.g020;
import defpackage.hb4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oh21;
import defpackage.op21;
import defpackage.sf11;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.urlpreview.impl.UserUrlPreview$show$4", f = "UserUrlPreview.kt", l = {HProv.PP_CACHE_SIZE, HProv.PP_PASSWD_TERM, HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UserUrlPreview$show$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserUrlPreview$show$4(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserUrlPreview$show$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserUrlPreview$show$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b1, code lost:
    
        if (r11.collect(r1, r10) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r11 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        if (r11 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            oh21 oh21Var = (oh21) ((ye0) dVar.b);
            String str2 = oh21Var.x;
            if (str2 != null) {
                com.yandex.messaging.internal.storage.contacts.a aVar = dVar.x;
                this.label = 1;
                obj = aVar.b(str2, this);
            } else {
                str = oh21Var.c;
                String str3 = str;
                this.this$0.I.setText(str3);
                d dVar2 = this.this$0;
                oh21 oh21Var2 = (oh21) ((ye0) dVar2.b);
                String str4 = oh21Var2.w;
                g020 g020Var = new g020(com.yandex.messaging.internal.images.b.f(str4), dVar2.F, str3, oh21Var2.b, hb4.a);
                com.yandex.messaging.internal.avatar.a aVar2 = this.this$0.A;
                this.label = 2;
                obj = aVar2.b(g020Var, this);
            }
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ad7 ad7Var = (ad7) obj;
            FadingDrawable.setBitmap(this.this$0.H, ad7Var.a, false, ad7Var.d);
            d dVar3 = this.this$0;
            tpr a = dVar3.D.a(new op21(((oh21) ((ye0) dVar3.b)).b));
            sf11 sf11Var = new sf11(17, this.this$0);
            this.label = 3;
        }
        str = (String) obj;
        if (str == null) {
            str = ((oh21) ((ye0) this.this$0.b)).c;
        }
        String str32 = str;
        this.this$0.I.setText(str32);
        d dVar22 = this.this$0;
        oh21 oh21Var22 = (oh21) ((ye0) dVar22.b);
        String str42 = oh21Var22.w;
        g020 g020Var2 = new g020(com.yandex.messaging.internal.images.b.f(str42), dVar22.F, str32, oh21Var22.b, hb4.a);
        com.yandex.messaging.internal.avatar.a aVar22 = this.this$0.A;
        this.label = 2;
        obj = aVar22.b(g020Var2, this);
    }
}
