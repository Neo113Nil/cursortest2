package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.superapp.api.dto.auth.InitPasswordCheckResponse;

/* compiled from: PasswordCheckPresenter.kt */
/* loaded from: classes15.dex */
public final class im90 {
    public final Context a;
    public final hm90 b;
    public final oju0 c;
    public String e;
    public InitPasswordCheckResponse f;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final n1c g = new n1c();
    public final bpn0 h = new bpn0(new m130(this, 13));

    /* compiled from: PasswordCheckPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitPasswordCheckResponse.AccessFactor.values().length];
            try {
                iArr[InitPasswordCheckResponse.AccessFactor.PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitPasswordCheckResponse.AccessFactor.SMS_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public im90(Context context, hm90 hm90Var, oju0 oju0Var) {
        this.a = context;
        this.b = hm90Var;
        this.c = oju0Var;
    }

    public final void a(vgg vggVar, boolean z) {
        Throwable th = vggVar.a;
        boolean z2 = th instanceof VKApiExecutionException;
        hm90 hm90Var = this.b;
        if (!z2) {
            hm90Var.Pf(null, vggVar);
            return;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        int s = vKApiExecutionException.s();
        int C = vKApiExecutionException.C();
        oju0 oju0Var = this.c;
        Context context = this.a;
        if (s == 9) {
            oju0Var.a(wbu0.a(context, th, true).a, z);
            s3q0 s3q0Var = s3q0.a;
        } else if (s != 106 || C == 1164) {
            hm90Var.Pf(Integer.valueOf(s), vggVar);
        } else {
            oju0Var.a(wbu0.a(context, th, true).a, z);
            s3q0 s3q0Var2 = s3q0.a;
        }
    }

    public final void b(PasswordCheckInitStructure passwordCheckInitStructure) {
        this.e = passwordCheckInitStructure.e;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.d.b(mnh0.C(vdx0Var.a().a(this.e, null), (ygg) this.h.getValue(), new zf1(21, this, passwordCheckInitStructure), new ux40(this, 10), new ngl(null, null, null, null, null, null, new cfz(this, 8), null, null, null, 959)));
    }
}
