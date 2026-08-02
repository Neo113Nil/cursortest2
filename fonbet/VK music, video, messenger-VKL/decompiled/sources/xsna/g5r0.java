package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.uxpolls.api.models.UxPollsAnswer;
import com.vk.uxpolls.presentation.js.model.UxPollsSetHeight;
import com.vk.uxpolls.presentation.view.PollsWebView;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UxPollsJsInterface.kt */
/* loaded from: classes6.dex */
public class g5r0 implements f5r0, o2y {
    public final /* synthetic */ o2y a;
    public final PollsWebView b;
    public final bpn0 c = new bpn0(new ta50(14));

    /* compiled from: UxPollsJsInterface.kt */
    @b6l(c = "com.vk.uxpolls.presentation.js.UxPollsJsInterfaceImpl$VKWebAppUXPollsCompleted$1", f = "UxPollsJsInterface.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return g5r0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            g5r0.this.i1();
            return s3q0.a;
        }
    }

    /* compiled from: UxPollsJsInterface.kt */
    @b6l(c = "com.vk.uxpolls.presentation.js.UxPollsJsInterfaceImpl$VKWebAppUXPollsInited$1", f = "UxPollsJsInterface.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return g5r0.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            g5r0.this.k1();
            return s3q0.a;
        }
    }

    /* compiled from: UxPollsJsInterface.kt */
    @b6l(c = "com.vk.uxpolls.presentation.js.UxPollsJsInterfaceImpl$VKWebAppUXPollsSendAnswer$1", f = "UxPollsJsInterface.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $json;
        int label;
        final /* synthetic */ g5r0 this$0;

        /* compiled from: UxPollsJsInterface.kt */
        public static final class a extends xtp0<List<? extends UxPollsAnswer>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, spj spjVar, g5r0 g5r0Var) {
            super(2, spjVar);
            this.$json = str;
            this.this$0 = g5r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$json, spjVar, this.this$0);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            Type type = new a().getType();
            this.this$0.j1((List) ((Gson) this.this$0.c.getValue()).fromJson(bay.e(this.$json).h().q("answers").toString(), type));
            return s3q0.a;
        }
    }

    /* compiled from: UxPollsJsInterface.kt */
    @b6l(c = "com.vk.uxpolls.presentation.js.UxPollsJsInterfaceImpl$VKWebAppUXPollsSetHeight$1", f = "UxPollsJsInterface.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $json;
        int label;
        final /* synthetic */ g5r0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, spj spjVar, g5r0 g5r0Var) {
            super(2, spjVar);
            this.this$0 = g5r0Var;
            this.$json = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$json, spjVar, this.this$0);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.this$0.l1((UxPollsSetHeight) ((Gson) this.this$0.c.getValue()).fromJson(this.$json, UxPollsSetHeight.class));
            return s3q0.a;
        }
    }

    public g5r0(PollsWebView pollsWebView, com.vk.uxpolls.presentation.view.a aVar) {
        this.a = aVar;
        this.b = pollsWebView;
    }

    @Override // xsna.f5r0
    @JavascriptInterface
    public void VKWebAppUXPollsCompleted(String str) {
        myc0.h(vwt0.a(this.b), null, null, new a(null), 3);
    }

    @Override // xsna.f5r0
    @JavascriptInterface
    public void VKWebAppUXPollsInited(String str) {
        myc0.h(vwt0.a(this.b), null, null, new b(null), 3);
    }

    @Override // xsna.f5r0
    @JavascriptInterface
    public void VKWebAppUXPollsSendAnswer(String str) {
        if (str == null) {
            return;
        }
        myc0.h(vwt0.a(this.b), null, null, new c(str, null, this), 3);
    }

    @Override // xsna.f5r0
    @JavascriptInterface
    public void VKWebAppUXPollsSetHeight(String str) {
        if (str == null) {
            return;
        }
        myc0.h(vwt0.a(this.b), null, null, new d(str, null, this), 3);
    }

    @Override // xsna.o2y
    public final void i1() {
        this.a.i1();
    }

    @Override // xsna.o2y
    public final void j1(List<UxPollsAnswer> list) {
        this.a.j1(list);
    }

    @Override // xsna.o2y
    public final void k1() {
        this.a.k1();
    }

    public void l1(UxPollsSetHeight uxPollsSetHeight) {
        this.a.l1(uxPollsSetHeight);
    }
}
