package com.yandex.messaging.internal.urlpreview.impl;

import android.text.SpannableStringBuilder;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import defpackage.g8e;
import defpackage.iv21;
import defpackage.mh21;
import defpackage.mvg;
import defpackage.nh21;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tse;
import defpackage.v3k0;
import defpackage.wls;
import defpackage.ye0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/text/SpannableStringBuilder;", "<anonymous>", "(Ltse;)Landroid/text/SpannableStringBuilder;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.urlpreview.impl.MessageUrlPreview$processMessageText$2", f = "MessageUrlPreview.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageUrlPreview$processMessageText$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageUrlPreview$processMessageText$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageUrlPreview$processMessageText$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageUrlPreview$processMessageText$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Type inference failed for: r13v10, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:5:0x007e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        c cVar;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            c cVar2 = this.this$0;
            z.element = ((v3k0) cVar2.z).b(2, ((nh21) ((ye0) cVar2.b)).b);
            c cVar3 = this.this$0;
            ref$ObjectRef = z;
            cVar = cVar3;
            it = ((nh21) ((ye0) cVar3.b)).w.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = (String) this.L$4;
            String str2 = (String) this.L$3;
            it = (Iterator) this.L$2;
            cVar = (c) this.L$1;
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            kotlin.b.b(obj);
            String str3 = (String) obj;
            if (str3 == null && ((iv21) cVar.E.get()).c) {
                LocalizedData a = cVar.F.a(str2);
                str3 = a == null ? a.getDisplayName() : null;
            }
            if (str3 != null) {
                str = str3;
            }
            ref$ObjectRef.element = new SpannableStringBuilder(new Regex(g8e.o("@", str2)).j((CharSequence) ref$ObjectRef.element, str));
            if (it.hasNext()) {
                mh21 mh21Var = (mh21) it.next();
                str2 = mh21Var.a;
                String str4 = mh21Var.b;
                String str5 = mh21Var.c;
                com.yandex.messaging.internal.storage.contacts.a aVar = cVar.w;
                this.L$0 = ref$ObjectRef;
                this.L$1 = cVar;
                this.L$2 = it;
                this.L$3 = str2;
                this.L$4 = str5;
                this.label = 1;
                Object b = aVar.b(str4, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str5;
                obj = b;
                String str32 = (String) obj;
                if (str32 == null) {
                    LocalizedData a2 = cVar.F.a(str2);
                    if (a2 == null) {
                    }
                }
                if (str32 != null) {
                }
                ref$ObjectRef.element = new SpannableStringBuilder(new Regex(g8e.o("@", str2)).j((CharSequence) ref$ObjectRef.element, str));
                if (it.hasNext()) {
                    return ref$ObjectRef.element;
                }
            }
        }
    }
}
