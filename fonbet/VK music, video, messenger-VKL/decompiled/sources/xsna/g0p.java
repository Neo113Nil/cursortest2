package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.widget.EditText;
import com.vkontakte.android.R;
import xsna.f0p;

/* compiled from: EditPlaylistContainer.java */
/* loaded from: classes3.dex */
public final class g0p extends rno0 {
    public final /* synthetic */ f0p.d b;

    public g0p(f0p.d dVar) {
        this.b = dVar;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Drawable a;
        f0p.d dVar = this.b;
        f0p f0pVar = f0p.this;
        dVar.m = editable.toString();
        nwk nwkVar = dVar.o;
        if (nwkVar != null) {
            nwkVar.invoke();
        }
        int length = dVar.m.length();
        int i = dVar.p;
        if (length < i || !dVar.r) {
            if (length >= i || dVar.r) {
                boolean z = length >= i;
                dVar.r = z;
                EditText editText = dVar.g;
                if (z) {
                    Context context = f0pVar.getContext();
                    abg0 abg0Var = dhr0.t;
                    int c = abg0Var.c(R.attr.vk_ui_background_negative_tint);
                    int c2 = abg0Var.c(R.attr.vk_ui_background_negative_tint);
                    int c3 = abg0Var.c(R.attr.vk_ui_background_negative);
                    int c4 = abg0Var.c(R.attr.vk_ui_field_border_alpha);
                    int i2 = wvv0.a;
                    a = wvv0.a(context, R.drawable.vkui_bg_edittext, c, c2, c3, c4);
                } else {
                    Context context2 = f0pVar.getContext();
                    abg0 abg0Var2 = dhr0.t;
                    int c5 = abg0Var2.c(R.attr.vk_ui_field_background);
                    int c6 = abg0Var2.c(R.attr.vk_ui_field_background);
                    int c7 = abg0Var2.c(R.attr.vk_ui_background_accent);
                    int c8 = abg0Var2.c(R.attr.vk_ui_field_border_alpha);
                    int i3 = wvv0.a;
                    a = wvv0.a(context2, R.drawable.vkui_bg_edittext, c5, c6, c7, c8);
                }
                editText.setBackground(a);
            }
        }
    }
}
