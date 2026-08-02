package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.vk.oauth.tinkoff.a;
import com.vk.toggle.anonymous.SakFeatures;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.tinkoff.core.tinkoffId.TinkoffIdAuth;
import ru.tinkoff.core.tinkoffId.TinkoffIdStatusCode;
import ru.tinkoff.core.tinkoffId.TinkoffTokenPayload;
import ru.tinkoff.core.tinkoffId.error.TinkoffRequestException;

/* compiled from: AppSDKAuthProvider.kt */
/* loaded from: classes4.dex */
public final class t83 implements syo0 {
    public final Context a;
    public final htk0<com.vk.oauth.tinkoff.a> b;
    public final gc4 c;
    public final hpj d = zvj.a(dgn0.f().getIo());
    public TinkoffIdAuth e;

    /* compiled from: AppSDKAuthProvider.kt */
    @b6l(c = "com.vk.oauth.tinkoff.internal.authprovider.AppSDKAuthProvider$continueWith$1", f = "AppSDKAuthProvider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ TinkoffIdAuth $auth;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ t83 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TinkoffIdAuth tinkoffIdAuth, Uri uri, t83 t83Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$auth = tinkoffIdAuth;
            this.$uri = uri;
            this.this$0 = t83Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$auth, this.$uri, this.this$0, spjVar);
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
            try {
                this.this$0.b.update(new a.e(((TinkoffTokenPayload) this.$auth.getTinkoffTokenPayload(this.$uri).getResponse()).getAccessToken()));
            } catch (TinkoffRequestException e) {
                this.this$0.b.update(new a.b(e.getMessage()));
            }
            return s3q0.a;
        }
    }

    public t83(Context context, htk0 htk0Var, gc4 gc4Var) {
        this.a = context;
        this.b = htk0Var;
        this.c = gc4Var;
    }

    public static final TinkoffIdAuth c(t83 t83Var) {
        Context context = t83Var.a;
        gc4 gc4Var = t83Var.c;
        return new TinkoffIdAuth(context, gc4Var.c(), gc4Var.d());
    }

    @Override // xsna.syo0
    public final void a(String str) {
        TinkoffIdAuth tinkoffIdAuth = this.e;
        if (tinkoffIdAuth == null) {
            return;
        }
        Uri parse = Uri.parse(str);
        if (tinkoffIdAuth.getStatusCode(parse) == TinkoffIdStatusCode.CANCELLED_BY_USER) {
            this.b.update(a.C1443a.a);
        } else {
            myc0.h(this.d, null, null, new a(tinkoffIdAuth, parse, this, null), 3);
        }
    }

    public final TinkoffIdAuth b() {
        TinkoffIdAuth tinkoffIdAuth = this.e;
        if (tinkoffIdAuth != null) {
            return tinkoffIdAuth;
        }
        TinkoffIdAuth c = c(this);
        this.e = c;
        return c;
    }

    public final boolean d() {
        return b().isTinkoffAppAuthAvailable();
    }

    @Override // xsna.syo0
    @SuppressLint({"NewApi"})
    public final boolean start() {
        Object failure;
        if (!SakFeatures.Type.FEATURE_TINKOFF_APP_TO_APP_TOGGLE.h()) {
            return false;
        }
        try {
            Class.forName("ru.tinkoff.core.tinkoffId.TinkoffIdAuth");
            failure = Boolean.TRUE;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        if (!((Boolean) failure).booleanValue() || !d()) {
            return false;
        }
        Intent createTinkoffAppAuthIntent = b().createTinkoffAppAuthIntent(Uri.parse(this.c.d()));
        createTinkoffAppAuthIntent.addFlags(268435456);
        this.a.startActivity(createTinkoffAppAuthIntent);
        return true;
    }
}
