package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.biometric.auth.api.domain.model.AuthMode;
import java.security.KeyStore;
import javax.crypto.Cipher;
import xsna.e57;
import xsna.j47;

/* compiled from: BiometricsPromptWithCipherDelegate.kt */
/* loaded from: classes15.dex */
public final class y97 {
    public final KeyStore a;

    /* compiled from: BiometricsPromptWithCipherDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthMode.values().length];
            try {
                iArr[AuthMode.ENCRYPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthMode.DECRYPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y97() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        this.a = keyStore;
    }

    public static io.reactivex.rxjava3.disposables.e a(Fragment fragment, t6e0 t6e0Var, Cipher cipher, n47 n47Var, izs izsVar) {
        Context requireContext = fragment.requireContext();
        e57 e57Var = new e57((FragmentActivity) requireContext, requireContext.getMainExecutor(), new m47(n47Var, izsVar));
        try {
            e57.d.a aVar = new e57.d.a();
            aVar.a = t6e0Var.a;
            aVar.b = "";
            aVar.c = "";
            s6e0 s6e0Var = t6e0Var.b;
            aVar.d = s6e0Var.a;
            aVar.e = !s6e0Var.b;
            aVar.f = s6e0Var.c ? 15 : 255;
            e57Var.a(aVar.a(), new e57.c(cipher));
            return new io.reactivex.rxjava3.disposables.a(new w97(e57Var, 0));
        } catch (Exception unused) {
            n47Var.pd(new j47.c());
            return new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        }
    }
}
