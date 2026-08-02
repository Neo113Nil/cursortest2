package xsna;

import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: DonutUserStackContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.DonutUserStackContent$Content$1$1", f = "DonutUserStackContent.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class e4o extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rg50 $count$delegate;
    final /* synthetic */ Ref$ObjectRef<ViewGroup> $viewLayout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4o(Ref$ObjectRef<ViewGroup> ref$ObjectRef, rg50 rg50Var, spj<? super e4o> spjVar) {
        super(2, spjVar);
        this.$viewLayout = ref$ObjectRef;
        this.$count$delegate = rg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e4o(this.$viewLayout, this.$count$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e4o) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0020 -> B:5:0x0023). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.a.a(r8)
            goto L23
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            kotlin.a.a(r8)
        L18:
            r7.label = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = xsna.qsl.b(r3, r7)
            if (r8 != r0) goto L23
            return r0
        L23:
            xsna.rg50 r8 = r7.$count$delegate
            int r8 = r8.getIntValue()
            r1 = 99
            if (r8 != r1) goto L33
            xsna.rg50 r8 = r7.$count$delegate
            r8.C(r2)
            goto L48
        L33:
            xsna.rg50 r8 = r7.$count$delegate
            int r1 = r8.getIntValue()
            int r1 = r1 + r2
            r8.C(r1)
            xsna.rg50 r8 = r7.$count$delegate
            int r8 = r8.getIntValue()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
        L48:
            kotlin.jvm.internal.Ref$ObjectRef<android.view.ViewGroup> r8 = r7.$viewLayout
            T r8 = r8.element
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 == 0) goto L18
            xsna.rg50 r1 = r7.$count$delegate
            int r3 = r8.getChildCount()
            r4 = 0
        L57:
            if (r4 >= r3) goto L18
            android.view.View r5 = r8.getChildAt(r4)
            boolean r6 = r5 instanceof com.vk.community.design.view.donut.DonutUserStackView
            if (r6 == 0) goto L6a
            com.vk.community.design.view.donut.DonutUserStackView r5 = (com.vk.community.design.view.donut.DonutUserStackView) r5
            int r6 = r1.getIntValue()
            r5.setCount(r6)
        L6a:
            int r4 = r4 + 1
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.e4o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
