package xsna;

import com.vk.core.ui.modal.VkModal;
import com.vk.log.L;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ImWriteByPhoneModal.kt */
@b6l(c = "com.vk.im.ui.fragments.contacts.ImWriteByPhoneModal$processPhoneNumber$1", f = "ImWriteByPhoneModal.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class cfw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $phone;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ dfw this$0;

    /* compiled from: ImWriteByPhoneModal.kt */
    @b6l(c = "com.vk.im.ui.fragments.contacts.ImWriteByPhoneModal$processPhoneNumber$1$profile$1", f = "ImWriteByPhoneModal.kt", l = {152}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super qtd0>, Object> {
        final /* synthetic */ s8j $cmd;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ dfw this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dfw dfwVar, s8j s8jVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = dfwVar;
            this.$cmd = s8jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, this.$cmd, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super qtd0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            ezv ezvVar = this.this$0.b;
            s8j s8jVar = this.$cmd;
            this.L$0 = null;
            this.label = 1;
            Object a = ezvVar.a(yvjVar, s8jVar, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfw(dfw dfwVar, String str, spj<? super cfw> spjVar) {
        super(2, spjVar);
        this.this$0 = dfwVar;
        this.$phone = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cfw(this.this$0, this.$phone, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cfw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.b33] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.core.view.components.spinner.c cVar;
        Exception e;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        VkModal vkModal = null;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                com.vk.core.view.components.spinner.c cVar2 = new com.vk.core.view.components.spinner.c(this.this$0.a);
                dfw dfwVar = this.this$0;
                cVar2.setCancelable(true);
                cVar2.setOnCancelListener(new j2f(dfwVar, 2));
                try {
                    s8j s8jVar = new s8j(this.$phone, this.this$0.c.L());
                    this.this$0.g.setEnabled(false);
                    cVar2.show();
                    ovj b = hqu0.b();
                    a aVar = new a(this.this$0, s8jVar, null);
                    this.L$0 = cVar2;
                    this.L$1 = null;
                    this.label = 1;
                    Object k = myc0.k(b, aVar, this);
                    if (k == r0) {
                        return r0;
                    }
                    cVar = cVar2;
                    obj = k;
                } catch (Exception e2) {
                    cVar = cVar2;
                    e = e2;
                    L.i(e);
                    cVar.dismiss();
                    return s3q0.a;
                } catch (Throwable th) {
                    r0 = cVar2;
                    th = th;
                    r0.dismiss();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (com.vk.core.view.components.spinner.c) this.L$0;
                try {
                    kotlin.a.a(obj);
                } catch (Exception e3) {
                    e = e3;
                    L.i(e);
                    cVar.dismiss();
                    return s3q0.a;
                }
            }
            this.this$0.g.setEnabled(true);
            dfw.a(this.this$0, (qtd0) obj);
            VkModal vkModal2 = this.this$0.i;
            if (vkModal2 != null) {
                vkModal = vkModal2;
            }
            vkModal.a();
            cVar.dismiss();
            return s3q0.a;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
