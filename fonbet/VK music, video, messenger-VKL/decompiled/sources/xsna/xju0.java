package xsna;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vkontakte.android.R;
import xsna.xju0;

/* compiled from: VkCheckEditTextAdapter.kt */
/* loaded from: classes15.dex */
public final class xju0 extends RecyclerView.Adapter<a> {
    public final VkCheckEditText c;
    public final l090 d;
    public final gqh0 e;
    public final d3j0 f;
    public int g;

    /* compiled from: VkCheckEditTextAdapter.kt */
    public static final class a extends RecyclerView.e0 implements o1x {
        public final i1x l;
        public final l090 m;
        public final gzs<Boolean> n;
        public final gzs<String> o;
        public final AppCompatEditText p;

        public a(ViewGroup viewGroup, VkCheckEditText vkCheckEditText, l090 l090Var, gqh0 gqh0Var, d3j0 d3j0Var) {
            super(tf3.b(viewGroup, R.layout.vk_auth_check_edit_text_input, viewGroup, false));
            this.l = vkCheckEditText;
            this.m = l090Var;
            this.n = gqh0Var;
            this.o = d3j0Var;
            AppCompatEditText appCompatEditText = (AppCompatEditText) this.itemView.findViewById(R.id.code_edit_text);
            this.p = appCompatEditText;
            oa01.a(appCompatEditText, new wgm0(this, 16));
            iut0.q(appCompatEditText, new yju0(this.itemView.getContext(), new wju0(this)));
        }

        @Override // xsna.o1x
        public final int N1() {
            return this.p.getSelectionStart();
        }

        @Override // xsna.o1x
        public final void e1(boolean z) {
            this.p.setBackgroundResource(z ? R.drawable.vk_ui_auth_bg_edittext_error : R.drawable.vk_ui_auth_bg_edittext_stated);
        }

        @Override // xsna.o1x
        public final View getView() {
            return this.p;
        }

        @Override // xsna.o1x
        public final boolean h5() {
            return this.p.requestFocus();
        }

        @Override // xsna.o1x
        public final void l2(String str) {
            this.p.setText(str);
        }

        @Override // xsna.o1x
        public final boolean q0() {
            return this.p.requestFocus();
        }

        @Override // xsna.o1x
        public final void setEnabled(boolean z) {
            this.p.setEnabled(z);
        }

        @Override // xsna.o1x
        public final boolean y0() {
            Editable text = this.p.getText();
            return text != null && myc0.f(text);
        }
    }

    public xju0(VkCheckEditText vkCheckEditText, l090 l090Var, gqh0 gqh0Var, d3j0 d3j0Var) {
        this.c = vkCheckEditText;
        this.d = l090Var;
        this.e = gqh0Var;
        this.f = d3j0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        final a aVar2 = aVar;
        boolean z = i == 0;
        int i2 = this.g;
        AppCompatEditText appCompatEditText = aVar2.p;
        if (z) {
            aVar2.h5();
        }
        appCompatEditText.setOnKeyListener(new View.OnKeyListener() { // from class: xsna.vju0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0 || i3 != 67) {
                    return false;
                }
                xju0.a aVar3 = xju0.a.this;
                aVar3.l.b(aVar3.getLayoutPosition());
                return false;
            }
        });
        pju0 pju0Var = new pju0(aVar2.m, aVar2.l, aVar2.getLayoutPosition(), i2);
        appCompatEditText.setCustomSelectionActionModeCallback(pju0Var);
        if (gz80.a(23)) {
            appCompatEditText.setCustomInsertionActionModeCallback(pju0Var);
        }
        if (iah0.g(appCompatEditText.getContext()).x > 320) {
            float f = 4;
            f4m.u(appCompatEditText, iah0.a(f), 0, iah0.a(f), 0);
        } else {
            float f2 = 3;
            f4m.u(appCompatEditText, iah0.a(f2), 0, iah0.a(f2), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.c, this.d, this.e, this.f);
    }
}
