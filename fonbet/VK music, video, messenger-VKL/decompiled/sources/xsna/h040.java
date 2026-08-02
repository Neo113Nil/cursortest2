package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MsgTemplateDeleteCmd.kt */
/* loaded from: classes3.dex */
public final class h040 extends me6<s3q0> {
    public final int b;

    /* compiled from: MsgTemplateDeleteCmd.kt */
    @b6l(c = "com.vk.messagetemplates.impl.data.MsgTemplateDeleteCmd", f = "MsgTemplateDeleteCmd.kt", l = {9}, m = "onExecute")
    public static final class a extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h040.this.e(null, this);
        }
    }

    public h040(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // xsna.me6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(w2w w2wVar, spj<? super s3q0> spjVar) {
        a aVar;
        Object obj;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                int i3 = this.b;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ib20 ib20Var = new ib20(i3, w2wVar.Q0());
                    aVar.L$0 = w2wVar;
                    aVar.label = 1;
                    obj = ib20Var.a(aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w2wVar = (w2w) aVar.L$0;
                    kotlin.a.a(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    w2wVar.I0().o().P(i3);
                }
                return s3q0.a;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        obj = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        int i32 = this.b;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h040) && this.b == ((h040) obj).b;
    }

    @Override // xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return h5s.c(this.b, ", awaitNetwork=false)", new StringBuilder("MsgTemplateDeleteCmd(templateId="));
    }
}
