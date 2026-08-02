package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoButtonModel;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoModel;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: UnlockInfoDialog.kt */
/* loaded from: classes7.dex */
public final class q4q0 implements fcn {
    public dw20 b;

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, VmojiProductUnlockInfoModel vmojiProductUnlockInfoModel, izs<? super VmojiProductUnlockInfoButtonModel, s3q0> izsVar) {
        String str = vmojiProductUnlockInfoModel.c;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.vmoji_character_unlock_info_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewGroup.findViewById(R.id.title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.title);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.button);
        View findViewById = viewGroup.findViewById(R.id.dismiss);
        String str2 = vmojiProductUnlockInfoModel.b;
        if (drm0.N(str2)) {
            f4m.j(textView);
        } else {
            textView.setText(str2);
            textView.setVisibility(0);
        }
        if (drm0.N(str)) {
            f4m.j(textView2);
        } else {
            textView2.setText(str);
            textView2.setVisibility(0);
        }
        VmojiProductUnlockInfoButtonModel vmojiProductUnlockInfoButtonModel = vmojiProductUnlockInfoModel.d;
        if (vmojiProductUnlockInfoButtonModel != null) {
            textView3.setText(vmojiProductUnlockInfoButtonModel.b);
            jjc.g(textView3, new c5(izsVar, vmojiProductUnlockInfoButtonModel, this, 6));
            textView3.setVisibility(0);
        } else {
            f4m.j(textView3);
        }
        jjc.g(findViewById, new mga0(this, 24));
        this.b = new dw20.b(context, new tzp0.c(null, false)).D0(viewGroup, false).a0(new dsp0(1, this, context)).I0(q4q0.class.getName());
        if (context instanceof ey50) {
            ((ey50) context).Y().S(this);
        }
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
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
