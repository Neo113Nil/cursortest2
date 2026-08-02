package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import xsna.ao50;
import xsna.kj50;
import xsna.vk50;

/* compiled from: ProfileModalBottomSheet.kt */
/* loaded from: classes5.dex */
public abstract class pyd0<F extends vk50<VS, A>, VS extends ao50, A extends kj50> extends tl50<F, VS, A> {
    public static final /* synthetic */ int k1 = 0;
    public boolean i1;
    public final a j1 = new a(this);

    /* compiled from: ProfileModalBottomSheet.kt */
    public static final class a implements fcn {
        public final /* synthetic */ pyd0<F, VS, A> b;

        public a(pyd0<F, VS, A> pyd0Var) {
            this.b = pyd0Var;
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            int i = pyd0.k1;
            pyd0<F, VS, A> pyd0Var = this.b;
            if (!pyd0Var.N0 || pyd0Var.i1) {
                pyd0Var.i1 = true;
                pyd0Var.hide();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* compiled from: ProfileModalBottomSheet.kt */
    public static final class b extends ModalBottomSheetBehavior.d {
        public float a;
        public final /* synthetic */ pyd0<F, VS, A> b;

        public b(pyd0<F, VS, A> pyd0Var) {
            this.b = pyd0Var;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
            this.a = f;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            if (i == 3) {
                float f = this.a;
                pyd0<F, VS, A> pyd0Var = this.b;
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !pyd0Var.i1) {
                    pyd0Var.Qn(false);
                } else {
                    pyd0Var.Qn(true);
                    pyd0Var.dismiss();
                }
            }
        }
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d
    public final void tn() {
        Qn(true);
        super.tn();
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public Dialog yn(Bundle bundle) {
        this.i0 = new b(this);
        return super.yn(bundle);
    }
}
