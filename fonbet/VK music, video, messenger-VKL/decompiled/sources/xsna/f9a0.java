package xsna;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: PhotoFlowViewHolder.kt */
/* loaded from: classes4.dex */
public final class f9a0 extends vif0<y7a0> implements otx0 {
    public final View n;
    public final s5a0 o;
    public final eha0 p;
    public final VKImageView q;
    public final ImageView r;
    public final AppCompatCheckBox s;
    public final uh40 t;
    public final ijc u;

    public f9a0(View view, s5a0 s5a0Var, eha0 eha0Var) {
        super(view);
        this.n = view;
        this.o = s5a0Var;
        this.p = eha0Var;
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.iv_photo);
        this.q = vKImageView;
        this.r = (ImageView) view.findViewById(R.id.iv_pin);
        this.s = (AppCompatCheckBox) view.findViewById(R.id.checkbox_photo);
        this.t = new uh40(this, 8);
        cqv cqvVar = new cqv(this, 29);
        bpn0 bpn0Var = jjc.a;
        this.u = new ijc(400L, cqvVar);
        vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
    }

    @Override // xsna.jsx0
    public final boolean H4() {
        return true;
    }

    @Override // xsna.otx0
    public final Rect X1(Rect rect) {
        this.n.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // xsna.vif0
    public final void i6(y7a0 y7a0Var) {
        y7a0 y7a0Var2 = y7a0Var;
        bwt0.S(this.q, new hn0(21, this, y7a0Var2.a));
        q6(y7a0Var2);
    }

    @Override // xsna.vif0
    public final void j6(y7a0 y7a0Var, Object obj) {
        y7a0 y7a0Var2 = y7a0Var;
        if (obj instanceof jdg0) {
            bwt0.S(this.q, new hn0(21, this, y7a0Var2.a));
        }
        q6(y7a0Var2);
    }

    public final void q6(y7a0 y7a0Var) {
        Boolean bool = y7a0Var.b;
        boolean z = y7a0Var.c;
        VKImageView vKImageView = this.q;
        ym.a(vKImageView, bool, z);
        ImageView imageView = this.r;
        AppCompatCheckBox appCompatCheckBox = this.s;
        if (bool == null) {
            imageView.setVisibility(z ? 0 : 8);
            appCompatCheckBox.setVisibility(8);
            appCompatCheckBox.setChecked(false);
            appCompatCheckBox.jumpDrawablesToCurrentState();
        } else {
            imageView.setVisibility(8);
            appCompatCheckBox.setVisibility(0);
            appCompatCheckBox.setChecked(bool.booleanValue());
        }
        if (this.o.a() && bool == null) {
            bwt0.k0(vKImageView, this.t);
            vKImageView.setHapticFeedbackEnabled(true);
        } else {
            vKImageView.setOnLongClickListener(null);
            vKImageView.setHapticFeedbackEnabled(false);
        }
        if (bool == null) {
            vKImageView.setOnClickListener(this.u);
        } else {
            vKImageView.setOnClickListener(null);
        }
        vKImageView.setClickable(bool == null);
    }
}
