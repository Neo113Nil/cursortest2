package xsna;

import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: UserStackScreenContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.UserStackScreenContent$Content$1$1$1", f = "UserStackScreenContent.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class vzq0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rg50 $count$delegate;
    final /* synthetic */ Ref$ObjectRef<ViewGroup> $userStackViewLayout;
    int label;
    final /* synthetic */ wzq0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzq0(wzq0 wzq0Var, Ref$ObjectRef<ViewGroup> ref$ObjectRef, rg50 rg50Var, spj<? super vzq0> spjVar) {
        super(2, spjVar);
        this.this$0 = wzq0Var;
        this.$userStackViewLayout = ref$ObjectRef;
        this.$count$delegate = rg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vzq0(this.this$0, this.$userStackViewLayout, this.$count$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vzq0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0020 -> B:5:0x0023). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.a.a(r9)
            goto L23
        Ld:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L15:
            kotlin.a.a(r9)
        L18:
            r8.label = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = xsna.qsl.b(r3, r8)
            if (r9 != r0) goto L23
            return r0
        L23:
            xsna.rg50 r9 = r8.$count$delegate
            int r9 = r9.getIntValue()
            r1 = 999(0x3e7, float:1.4E-42)
            if (r9 <= r1) goto L33
            xsna.rg50 r9 = r8.$count$delegate
            r9.C(r2)
            goto L48
        L33:
            xsna.rg50 r9 = r8.$count$delegate
            int r1 = r9.getIntValue()
            int r1 = r1 + r2
            r9.C(r1)
            xsna.rg50 r9 = r8.$count$delegate
            int r9 = r9.getIntValue()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
        L48:
            xsna.wzq0 r9 = r8.this$0
            kotlin.jvm.internal.Ref$ObjectRef<android.view.ViewGroup> r1 = r8.$userStackViewLayout
            T r1 = r1.element
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            xsna.rg50 r3 = r8.$count$delegate
            int r3 = r3.getIntValue()
            r9.getClass()
            if (r1 == 0) goto L18
            int r9 = r1.getChildCount()
            r4 = 0
        L60:
            if (r4 >= r9) goto L18
            android.view.View r5 = r1.getChildAt(r4)
            boolean r6 = r5 instanceof com.vk.core.view.components.userstack.VkUserStack
            if (r6 == 0) goto L7b
            r6 = r5
            com.vk.core.view.components.userstack.VkUserStack r6 = (com.vk.core.view.components.userstack.VkUserStack) r6
            java.lang.Integer r7 = r6.getCounter()
            if (r7 == 0) goto L7b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6.setCounter(r5)
            goto L8e
        L7b:
            boolean r6 = r5 instanceof com.vk.core.view.components.userstack.VkMiniUserStack
            if (r6 == 0) goto L8e
            com.vk.core.view.components.userstack.VkMiniUserStack r5 = (com.vk.core.view.components.userstack.VkMiniUserStack) r5
            java.lang.Integer r6 = r5.getCounter()
            if (r6 == 0) goto L8e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5.setCounter(r6)
        L8e:
            int r4 = r4 + 1
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.vzq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
