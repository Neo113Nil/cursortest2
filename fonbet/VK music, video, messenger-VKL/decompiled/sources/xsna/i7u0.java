package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vkontakte.android.R;
import xsna.eeu0;
import xsna.h7u0;

/* compiled from: VkAlertDialog.kt */
/* loaded from: classes17.dex */
public class i7u0 extends eeu0 {
    public static final /* synthetic */ int o = 0;

    /* compiled from: VkAlertDialog.kt */
    public static class a extends eeu0.a {
        public final amm j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, int i, j7u0 j7u0Var, h7u0.a.C2976a c2976a) {
            super(new lpj(context, h6v0.a.a() ? R.style.VkAlertDialogNewTheme : R.style.VkAlertDialogOldTheme), i == 0 ? R.style.Theme_AppCompat_Empty : i);
            int i2 = i7u0.o;
            amm ammVar = (amm) c2976a.invoke(j7u0Var);
            this.j = ammVar;
            this.h = ammVar.b(null);
            this.i = ammVar.a(null);
        }

        public a E(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            super.b(charSequenceArr, onClickListener);
            return this;
        }

        public a F(int i) {
            super.q(i);
            return this;
        }

        public a G(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            super.e(charSequenceArr, zArr, onMultiChoiceClickListener);
            return this;
        }

        public a H(int i, DialogInterface.OnClickListener onClickListener) {
            super.setNegativeButton(i, this.j.c(onClickListener));
            return this;
        }

        public a I(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.f(charSequence, this.j.c(onClickListener));
            return this;
        }

        public a J(int i, DialogInterface.OnClickListener onClickListener) {
            super.v(i, onClickListener);
            return this;
        }

        public a K(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.g(charSequence, onClickListener);
            return this;
        }

        public a L(DialogInterface.OnDismissListener onDismissListener) {
            this.i = this.j.a(onDismissListener);
            return this;
        }

        public a M(int i, DialogInterface.OnClickListener onClickListener) {
            super.setPositiveButton(i, this.j.d(onClickListener));
            return this;
        }

        public a N(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.j(charSequence, this.j.d(onClickListener));
            return this;
        }

        public a O(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            super.k(charSequenceArr, i, onClickListener);
            return this;
        }

        public a P(int i) {
            super.B(i);
            return this;
        }

        public a Q(CharSequence charSequence) {
            super.setTitle(charSequence);
            return this;
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final androidx.appcompat.app.d create() {
            androidx.appcompat.app.d create = super.create();
            this.j.create();
            return create;
        }
    }
}
