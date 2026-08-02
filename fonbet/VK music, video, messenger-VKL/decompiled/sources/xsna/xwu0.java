package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.PasswordCredential;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oou0;

/* compiled from: VkGoogleCredentialsManager.kt */
/* loaded from: classes.dex */
public final class xwu0 implements oou0 {
    public final bpn0 a;

    /* compiled from: VkGoogleCredentialsManager.kt */
    public final class a implements oou0.a {
        public final androidx.lifecycle.j a;
        public final WeakReference<Activity> b;
        public final Object c = msy.a(LazyThreadSafetyMode.NONE, new y0f(16));

        /* compiled from: VkGoogleCredentialsManager.kt */
        @b6l(c = "com.vk.auth.credentials.VkGoogleCredentialsManager$Loader$showCredentialsSelector$1", f = "VkGoogleCredentialsManager.kt", l = {123}, m = "invokeSuspend")
        /* renamed from: xsna.xwu0$a$a, reason: collision with other inner class name */
        public static final class C4050a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ izs<Throwable, s3q0> $failListener;
            final /* synthetic */ GetCredentialRequest $request;
            final /* synthetic */ izs<VkAuthCredentials, s3q0> $successListener;
            int label;
            final /* synthetic */ xwu0 this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4050a(izs<? super Throwable, s3q0> izsVar, xwu0 xwu0Var, GetCredentialRequest getCredentialRequest, izs<? super VkAuthCredentials, s3q0> izsVar2, spj<? super C4050a> spjVar) {
                super(2, spjVar);
                this.$failListener = izsVar;
                this.this$1 = xwu0Var;
                this.$request = getCredentialRequest;
                this.$successListener = izsVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return a.this.new C4050a(this.$failListener, this.this$1, this.$request, this.$successListener, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C4050a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.a.a(obj);
                        Activity activity = a.this.b.get();
                        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                            this.$failListener.invoke(new IllegalStateException("Activity is destroyed"));
                            return s3q0.a;
                        }
                        CredentialManager credentialManager = (CredentialManager) this.this$1.a.getValue();
                        GetCredentialRequest getCredentialRequest = this.$request;
                        this.label = 1;
                        obj = credentialManager.getCredential(activity, getCredentialRequest, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    Credential credential = ((GetCredentialResponse) obj).getCredential();
                    if (credential instanceof PasswordCredential) {
                        this.$successListener.invoke(new VkAuthCredentials(((PasswordCredential) credential).getId(), ((PasswordCredential) credential).getPassword()));
                    } else {
                        ((tdk) a.this.c.getValue()).a();
                        this.$failListener.invoke(new IllegalStateException("Unsupported credential type: " + credential.getClass()));
                    }
                } catch (GetCredentialException e) {
                    if (e instanceof GetCredentialCancellationException) {
                        ((tdk) a.this.c.getValue()).a();
                        par0 par0Var = par0.a;
                        String str = "Smart lock: cancellation (" + e.getMessage() + ')';
                        par0Var.getClass();
                        par0.a(str);
                    } else {
                        par0 par0Var2 = par0.a;
                        String str2 = "Smart lock: credential load failed (" + e.getMessage() + ')';
                        par0Var2.getClass();
                        par0.a(str2);
                    }
                    this.$failListener.invoke(e);
                }
                return s3q0.a;
            }
        }

        public a(Activity activity, androidx.lifecycle.j jVar) {
            this.a = jVar;
            this.b = new WeakReference<>(activity);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.oou0.a
        public final void a(izs<? super Throwable, s3q0> izsVar, izs<? super VkAuthCredentials, s3q0> izsVar2) {
            Activity activity = this.b.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                izsVar.invoke(new IllegalStateException("Activity is destroyed"));
                return;
            }
            ((tdk) this.c.getValue()).d();
            myc0.h(this.a, null, null, new C4050a(izsVar, xwu0.this, new GetCredentialRequest.Builder().addCredentialOption(new GetPasswordOption(null, false, null, 7, null)).build(), izsVar2, null), 3);
        }
    }

    /* compiled from: VkGoogleCredentialsManager.kt */
    public final class b implements oou0.b {
        public final Context a;
        public final androidx.lifecycle.j b;

        public b(Context context, androidx.lifecycle.j jVar) {
            this.a = context;
            this.b = jVar;
        }

        @Override // xsna.oou0.b
        public final void a(VkAuthCredentials vkAuthCredentials, gzs gzsVar, izs izsVar) {
            String str;
            String e = vkAuthCredentials.e();
            if (drm0.N(e)) {
                izsVar.invoke(new IllegalArgumentException("Username should not be blank"));
                return;
            }
            String d = vkAuthCredentials.d();
            if (d == null) {
                str = null;
            } else {
                if (drm0.N(d)) {
                    izsVar.invoke(new IllegalArgumentException("Password should not be blank"));
                    return;
                }
                str = d;
            }
            if (str == null) {
                izsVar.invoke(new IllegalArgumentException("Password should not be null"));
            } else {
                myc0.h(this.b, null, null, new ywu0(xwu0.this, this, e, str, gzsVar, izsVar, null), 3);
            }
        }
    }

    public xwu0(Context context) {
        this.a = new bpn0(new ya3(context, 1));
    }

    @Override // xsna.oou0
    public final a a(FragmentActivity fragmentActivity, androidx.lifecycle.j jVar) {
        return new a(fragmentActivity, jVar);
    }

    @Override // xsna.oou0
    public final b b(Context context, androidx.lifecycle.j jVar) {
        return new b(context, jVar);
    }
}
