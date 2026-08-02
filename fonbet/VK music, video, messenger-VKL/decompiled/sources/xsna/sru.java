package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: GrowthHackingBottomSheet.kt */
/* loaded from: classes6.dex */
public final class sru extends dw20 {
    public zos0 f1;
    public qos0 g1;
    public LinearLayout h1;
    public TextView i1;
    public TextView j1;
    public TextView k1;
    public FrameLayout l1;
    public ImageView m1;
    public boolean n1;

    /* compiled from: GrowthHackingBottomSheet.kt */
    public static final class a extends dw20.b {
        public final zos0 e;
        public final qos0 f;

        public a(Context context, zos0 zos0Var, qos0 qos0Var) {
            super(context, null);
            this.e = zos0Var;
            this.f = qos0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            p0(0);
            m0(cn70.b(8));
            n0(cn70.b(8));
            o0(cn70.b(8));
            sru sruVar = new sru();
            sruVar.g1 = this.f;
            sruVar.f1 = this.e;
            return sruVar;
        }
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        qos0 qos0Var;
        if (!this.n1 && (qos0Var = this.g1) != null) {
            qos0Var.onCancel();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        CharSequence text;
        Integer num;
        String string;
        String string2;
        String str = null;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.watch_in_vk_video_bottomsheet, (ViewGroup) null, false);
        this.h1 = inflate != null ? (LinearLayout) inflate.findViewById(R.id.btn_action) : null;
        this.i1 = inflate != null ? (TextView) inflate.findViewById(R.id.text_title) : null;
        this.j1 = inflate != null ? (TextView) inflate.findViewById(R.id.text_subtitle) : null;
        this.k1 = inflate != null ? (TextView) inflate.findViewById(R.id.market_text) : null;
        this.l1 = inflate != null ? (FrameLayout) inflate.findViewById(R.id.icon_cancel) : null;
        this.m1 = inflate != null ? (ImageView) inflate.findViewById(R.id.market_icon) : null;
        dw20.Rn(this, inflate, 6);
        Context requireContext = requireContext();
        TextView textView = this.i1;
        if (textView != null) {
            zos0 zos0Var = this.f1;
            if (zos0Var == null || (string2 = zos0Var.e) == null) {
                Integer num2 = zos0Var != null ? zos0Var.g : null;
                bpn0 bpn0Var = enj.a;
                string2 = (num2 == null || num2.intValue() == 0) ? null : requireContext.getString(num2.intValue());
                if (string2 == null) {
                    string2 = requireContext.getString(R.string.text_title_open_vk_video_bottomsheet);
                }
            }
            textView.setText(string2);
        }
        TextView textView2 = this.j1;
        if (textView2 != null) {
            zos0 zos0Var2 = this.f1;
            if (zos0Var2 == null || (string = zos0Var2.f) == null) {
                Integer num3 = zos0Var2 != null ? zos0Var2.h : null;
                bpn0 bpn0Var2 = enj.a;
                string = (num3 == null || num3.intValue() == 0) ? null : requireContext.getString(num3.intValue());
                if (string == null) {
                    string = requireContext.getString(R.string.text_subtitle_open_vk_video_bottomsheet);
                }
            }
            textView2.setText(string);
        }
        if (dy2.i("com.vk.vkvideo")) {
            ImageView imageView = this.m1;
            if (imageView != null) {
                f4m.j(imageView);
            }
            TextView textView3 = this.k1;
            if (textView3 != null) {
                textView3.setText(getResources().getString(R.string.watch_in_vk_video_btn));
            }
        } else {
            ImageView imageView2 = this.m1;
            if (imageView2 != null) {
                f4m.j(imageView2);
            }
            zos0 zos0Var3 = this.f1;
            if (zos0Var3 != null && (num = zos0Var3.d) != null) {
                int intValue = num.intValue();
                ImageView imageView3 = this.m1;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(requireContext.getDrawable(intValue));
                }
                ImageView imageView4 = this.m1;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                }
            }
            TextView textView4 = this.k1;
            if (textView4 != null) {
                zos0 zos0Var4 = this.f1;
                if (zos0Var4 == null || (text = zos0Var4.c) == null) {
                    Integer num4 = zos0Var4 != null ? zos0Var4.i : null;
                    bpn0 bpn0Var3 = enj.a;
                    if (num4 != null && num4.intValue() != 0) {
                        str = requireContext.getString(num4.intValue());
                    }
                    text = str != null ? str : getResources().getText(R.string.download_vk_video_btn);
                }
                textView4.setText(text);
            }
        }
        LinearLayout linearLayout = this.h1;
        if (linearLayout != null) {
            jjc.g(linearLayout, new l2i(this, 15));
        }
        FrameLayout frameLayout = this.l1;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new e9i(this, 2));
        }
        qos0 qos0Var = this.g1;
        if (qos0Var != null) {
            qos0Var.a();
        }
        return super.yn(bundle);
    }
}
