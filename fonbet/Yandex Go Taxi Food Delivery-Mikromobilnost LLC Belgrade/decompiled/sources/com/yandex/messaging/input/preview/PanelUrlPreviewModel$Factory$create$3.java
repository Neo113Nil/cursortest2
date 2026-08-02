package com.yandex.messaging.input.preview;

import android.text.SpannableStringBuilder;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import defpackage.g8e;
import defpackage.iv21;
import defpackage.kb90;
import defpackage.kh21;
import defpackage.lb90;
import defpackage.mh21;
import defpackage.mvg;
import defpackage.nh21;
import defpackage.ny61;
import defpackage.ph21;
import defpackage.tse;
import defpackage.v3k0;
import defpackage.wls;
import defpackage.yhl;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llb90;", "<anonymous>", "(Ltse;)Llb90;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.preview.PanelUrlPreviewModel$Factory$create$3", f = "PanelUrlPreviewModel.kt", l = {90, 100}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PanelUrlPreviewModel$Factory$create$3 extends SuspendLambda implements wls {
    final /* synthetic */ nh21 $data;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ kb90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelUrlPreviewModel$Factory$create$3(nh21 nh21Var, kb90 kb90Var, Continuation continuation) {
        super(2, continuation);
        this.$data = nh21Var;
        this.this$0 = kb90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PanelUrlPreviewModel$Factory$create$3(this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PanelUrlPreviewModel$Factory$create$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r14 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004d, code lost:
    
        if (r14 == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f1  */
    /* JADX WARN: Type inference failed for: r14v24, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b1 -> B:6:0x00b4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Ref$ObjectRef ref$ObjectRef;
        kb90 kb90Var;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            nh21 nh21Var = this.$data;
            if (nh21Var instanceof ph21) {
                String str3 = ((ph21) nh21Var).B;
                if (str3 != null) {
                    com.yandex.messaging.internal.storage.contacts.a aVar = this.this$0.a;
                    this.label = 1;
                    obj = aVar.b(str3, this);
                }
                str = ((ph21) this.$data).C;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.element = ((v3k0) this.this$0.b).b(2, this.$data.b);
                List list = this.$data.w;
                str2 = str;
                ref$ObjectRef = ref$ObjectRef2;
                kb90Var = this.this$0;
                it = list.iterator();
                if (!it.hasNext()) {
                }
            } else {
                if (!(nh21Var instanceof kh21)) {
                    yhl.d(nh21Var, "Unsupported type of message ");
                    return null;
                }
                str = ((kh21) nh21Var).A;
                Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
                ref$ObjectRef22.element = ((v3k0) this.this$0.b).b(2, this.$data.b);
                List list2 = this.$data.w;
                str2 = str;
                ref$ObjectRef = ref$ObjectRef22;
                kb90Var = this.this$0;
                it = list2.iterator();
                if (!it.hasNext()) {
                }
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = (String) this.L$5;
            String str5 = (String) this.L$4;
            it = (Iterator) this.L$3;
            kb90Var = (kb90) this.L$2;
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            str2 = (String) this.L$0;
            b.b(obj);
            String str6 = (String) obj;
            if (str6 == null && ((iv21) kb90Var.c.get()).c) {
                LocalizedData a = kb90Var.d.a(str5);
                str6 = a == null ? a.getDisplayName() : null;
            }
            if (str6 != null) {
                str4 = str6;
            }
            ref$ObjectRef.element = new SpannableStringBuilder(new Regex(g8e.o("@", str5)).j((CharSequence) ref$ObjectRef.element, str4));
            if (!it.hasNext()) {
                mh21 mh21Var = (mh21) it.next();
                str5 = mh21Var.a;
                String str7 = mh21Var.b;
                String str8 = mh21Var.c;
                com.yandex.messaging.internal.storage.contacts.a aVar2 = kb90Var.a;
                this.L$0 = str2;
                this.L$1 = ref$ObjectRef;
                this.L$2 = kb90Var;
                this.L$3 = it;
                this.L$4 = str5;
                this.L$5 = str8;
                this.label = 2;
                Object b = aVar2.b(str7, this);
                if (b != coroutineSingletons) {
                    str4 = str8;
                    obj = b;
                    String str62 = (String) obj;
                    if (str62 == null) {
                        LocalizedData a2 = kb90Var.d.a(str5);
                        if (a2 == null) {
                        }
                    }
                    if (str62 != null) {
                    }
                    ref$ObjectRef.element = new SpannableStringBuilder(new Regex(g8e.o("@", str5)).j((CharSequence) ref$ObjectRef.element, str4));
                    if (!it.hasNext()) {
                        return new lb90(str2, ((SpannableStringBuilder) ref$ObjectRef.element).toString(), null);
                    }
                }
                return coroutineSingletons;
            }
        }
        str = (String) obj;
    }
}
