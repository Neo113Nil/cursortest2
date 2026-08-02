package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.log.L;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.superapp.vkpay.checkout.feature.verification.biometric.core.BiometricProcessor$AuthMode;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import xsna.bbv0;
import xsna.e57;

/* compiled from: BiometricPromptProcessor.kt */
/* loaded from: classes6.dex */
public final class m57 {
    public final Context a;

    /* compiled from: BiometricPromptProcessor.kt */
    public static final class a {
        public final e57.b a;

        public a(e57.b bVar) {
            this.a = bVar;
        }
    }

    /* compiled from: BiometricPromptProcessor.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BiometricProcessor$AuthMode.values().length];
            try {
                iArr[BiometricProcessor$AuthMode.DECRYPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BiometricProcessor$AuthMode.ENCRYPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m57(Context context) {
        this.a = context;
    }

    public static void a(Fragment fragment, d57 d57Var, Cipher cipher, o47 o47Var) {
        Executor mainExecutor = fragment.requireContext().getMainExecutor();
        c cVar = new c(d57Var);
        e57 e57Var = new e57();
        if (mainExecutor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        FragmentActivity activity = fragment.getActivity();
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        o57 c2 = e57.c(activity);
        if (c2 != null) {
            fragment.getLifecycle().addObserver(new e57.e(c2));
        }
        e57Var.a = childFragmentManager;
        if (c2 != null) {
            c2.b = mainExecutor;
            c2.c = cVar;
        }
        e57.d.a aVar = new e57.d.a();
        aVar.a = o47Var.a;
        aVar.b = o47Var.b;
        aVar.d = o47Var.c;
        e57Var.a(aVar.a(), new e57.c(cipher));
    }

    public final void b(Fragment fragment, d57<e57.c, ? super a> d57Var, o47 o47Var, BiometricProcessor$AuthMode biometricProcessor$AuthMode) {
        int i = b.$EnumSwitchMapping$0[biometricProcessor$AuthMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, wjk.a());
            a(fragment, d57Var, cipher, o47Var);
            return;
        }
        bbv0.g.getClass();
        VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
        if (vkPayCheckoutConfig == null) {
            throw new IllegalStateException("Config must not be null");
        }
        new io.reactivex.rxjava3.internal.operators.single.v(new al9(new d2p0(this.a, vkPayCheckoutConfig.c.getUserId()), 2)).q(new io.reactivex.rxjava3.internal.schedulers.f()).m(io.reactivex.rxjava3.android.schedulers.a.b()).l(new ai3(new z90(this), 3)).subscribe(new mf1(new v63(this, fragment, d57Var, o47Var, 1), 4), new j50(new ym1(L.a, 3), 6));
    }

    /* compiled from: BiometricPromptProcessor.kt */
    public static final class c extends e57.a {
        public final /* synthetic */ d57<e57.c, a> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(d57<e57.c, ? super a> d57Var) {
            this.a = d57Var;
        }

        @Override // xsna.e57.a
        public final void a(int i, CharSequence charSequence) {
            this.a.a();
        }

        @Override // xsna.e57.a
        public final void c(e57.b bVar) {
            this.a.b(new a(bVar));
        }

        @Override // xsna.e57.a
        public final void b() {
        }
    }
}
