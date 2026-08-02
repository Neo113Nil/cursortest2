package xsna;

import android.content.Context;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.auth.main.AuthStatSender;
import com.vk.superapp.api.dto.restore.VkRestoreInstantAuth;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: VkLoginConfirmationPresenter.kt */
/* loaded from: classes15.dex */
public final class a3v0 extends p66<v2v0> implements u2v0 {
    public final Context x;
    public final int y;
    public final io.reactivex.rxjava3.disposables.b z = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: VkLoginConfirmationPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkLoginConfirmationStatusType.values().length];
            try {
                iArr[VkLoginConfirmationStatusType.ERROR_DENY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkLoginConfirmationStatusType.ERROR_ALLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkRestoreInstantAuth.Status.values().length];
            try {
                iArr2[VkRestoreInstantAuth.Status.ALREADY_ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VkRestoreInstantAuth.Status.ALREADY_DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkRestoreInstantAuth.Status.WAIT_CONFIRMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public a3v0(Context context, int i) {
        this.x = context;
        this.y = i;
    }

    @Override // xsna.u2v0
    public final void R() {
        this.z.b(mnh0.C(new io.reactivex.rxjava3.internal.operators.single.n(y0(false), new hmq0(new q8i0(this, 27), 5)), this.s, new cus0(this, 5), new rtg0(this, 23), null));
    }

    @Override // xsna.u2v0
    public final void T(VkLoginConfirmationStatusType vkLoginConfirmationStatusType) {
        int i = a.$EnumSwitchMapping$0[vkLoginConfirmationStatusType.ordinal()];
        if (i == 1) {
            v2v0 v2v0Var = (v2v0) this.a;
            if (v2v0Var != null) {
                v2v0Var.u4();
            }
            R();
            return;
        }
        if (i != 2) {
            v2v0 v2v0Var2 = (v2v0) this.a;
            if (v2v0Var2 != null) {
                v2v0Var2.e();
                return;
            }
            return;
        }
        v2v0 v2v0Var3 = (v2v0) this.a;
        if (v2v0Var3 != null) {
            v2v0Var3.u4();
        }
        Z();
    }

    @Override // xsna.u2v0
    public final void Z() {
        this.z.b(mnh0.C(new io.reactivex.rxjava3.internal.operators.single.n(y0(true), new z2v0(new fvq0(this, 13), 0)), this.s, new r0r0(this, 13), new fuc0(this, 27), null));
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.u2v0
    public final void o() {
        z0();
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(v2v0 v2v0Var) {
        v2v0 v2v0Var2 = v2v0Var;
        super.y0(v2v0Var2);
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        if (wdx0Var.k()) {
            z0();
        } else {
            v2v0Var2.e();
        }
    }

    public final io.reactivex.rxjava3.internal.operators.single.j y0(boolean z) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.single.y b = vdx0Var.p().b(this.y, z);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        return new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.n(b, new fsq0(new qyi0(ref$LongRef, 24), 4)), new kxa0(new mmm0(ref$LongRef, 20), 15)), new ek5(this, 5));
    }

    public final void z0() {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.z.b(mnh0.C(new io.reactivex.rxjava3.internal.operators.single.n(vdx0Var.p().a(this.y), new miq0(new j6l0(this, 26), 3)), this.s, new xvl0(this, 18), new mdk0(this, 19), new ngl(null, null, null, new wii0(this, 15), null, null, null, null, null, null, 1015)));
    }
}
