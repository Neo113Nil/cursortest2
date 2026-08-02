package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.iok0;

/* compiled from: VkConfirmationBottomSheetDialog.kt */
/* loaded from: classes17.dex */
public abstract class smu0 extends dw20 {
    public a f1;
    public TextView g1;
    public TextView h1;
    public ViewGroup i1;

    /* compiled from: VkConfirmationBottomSheetDialog.kt */
    public interface a {
        void a();

        void b();

        void onCancel();
    }

    public View Yn(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return null;
    }

    public abstract View Zn(LayoutInflater layoutInflater, FrameLayout frameLayout);

    public abstract String ao();

    public int bo(Context context) {
        return krv0.m(R.attr.vk_ui_text_accent_themed, context);
    }

    public String co() {
        return getString(R.string.vk_bottomsheet_confirmation_cancel);
    }

    public boolean eo() {
        return true;
    }

    public boolean fo() {
        return false;
    }

    public final void go(iok0.d dVar) {
        this.f1 = dVar;
    }

    public boolean ho() {
        return false;
    }

    @Override // xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        a aVar = this.f1;
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        ViewGroup viewGroup;
        LayoutInflater from = LayoutInflater.from(mo2getContext());
        View inflate = from.inflate(ho() ? R.layout.vk_bottom_sheet_confirmation_vertical_buttons : R.layout.vk_bottom_sheet_confirmation, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.content);
        this.g1 = (TextView) inflate.findViewById(R.id.positive_button);
        this.h1 = (TextView) inflate.findViewById(R.id.negative_button);
        this.i1 = (ViewGroup) inflate.findViewById(R.id.buttons_container);
        frameLayout.addView(Zn(from, frameLayout));
        View Yn = Yn(from, frameLayout);
        if (Yn != null) {
            ((LinearLayout) inflate.findViewById(R.id.bottom_content)).addView(Yn);
        }
        if (eo()) {
            TextView textView = this.g1;
            if (textView != null) {
                textView.setText(ao());
            }
        } else {
            TextView textView2 = this.g1;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            inflate.findViewById(R.id.buttons_divider).setVisibility(8);
        }
        if (fo()) {
            TextView textView3 = this.h1;
            if (textView3 != null) {
                textView3.setText(co());
            }
            TextView textView4 = this.h1;
            if (textView4 != null) {
                textView4.setTextColor(bo(inflate.getContext()));
            }
            TextView textView5 = this.h1;
            if (textView5 != null) {
                textView5.setOnClickListener(new c98(this, 14));
            }
        } else {
            TextView textView6 = this.h1;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            inflate.findViewById(R.id.buttons_divider).setVisibility(8);
        }
        if (!eo() && !fo() && (viewGroup = this.i1) != null) {
            viewGroup.setVisibility(8);
        }
        TextView textView7 = this.g1;
        if (textView7 != null) {
            textView7.setOnClickListener(new rbe(this, 8));
        }
        dw20.Rn(this, inflate, 2);
        return super.yn(bundle);
    }
}
