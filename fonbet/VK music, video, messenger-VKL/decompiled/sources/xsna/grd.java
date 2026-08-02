package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import xsna.dw20;

/* compiled from: ClipsDismissibleBottomSheet.kt */
/* loaded from: classes17.dex */
public class grd extends dw20 {
    public final b f1 = new b();
    public boolean g1;

    /* compiled from: ClipsDismissibleBottomSheet.kt */
    public static class a extends dw20.b {
        public boolean e;

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            grd grdVar = new grd();
            grdVar.g1 = this.e;
            return grdVar;
        }
    }

    /* compiled from: ClipsDismissibleBottomSheet.kt */
    public static final class b implements fcn {
        public b() {
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
            grd.this.hide();
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

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Context mo2getContext;
        ww50 v;
        super.onDismiss(dialogInterface);
        if (!this.g1 || (mo2getContext = mo2getContext()) == null || (v = s200.v(mo2getContext)) == null) {
            return;
        }
        v.H(this.f1);
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Context mo2getContext;
        ww50 v;
        if (this.g1 && (mo2getContext = mo2getContext()) != null && (v = s200.v(mo2getContext)) != null) {
            v.S(this.f1);
        }
        return super.yn(bundle);
    }
}
