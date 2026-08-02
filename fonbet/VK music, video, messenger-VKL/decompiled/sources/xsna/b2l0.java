package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.stickers.StickerSuggestion;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: TextView.kt */
/* loaded from: classes6.dex */
public final class b2l0 implements TextWatcher {
    public final /* synthetic */ c2l0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ View e;

    public b2l0(c2l0 c2l0Var, List list, TextView textView, View view) {
        this.b = c2l0Var;
        this.c = list;
        this.d = textView;
        this.e = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null) {
            return;
        }
        this.b.getClass();
        String a = c2l0.a(editable);
        List list = this.c;
        boolean z = list instanceof Collection;
        View view = this.e;
        TextView textView = this.d;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (brm0.s(a, c2l0.a(((StickerSuggestion) it.next()).b))) {
                    textView.setText(R.string.stickers_suggest_add_dialog_error_same);
                    jno0.c(textView, R.attr.vk_ui_background_negative);
                    textView.setVisibility(0);
                    view.setEnabled(false);
                    return;
                }
            }
        }
        if (a.length() < 2) {
            textView.setText(R.string.stickers_suggest_add_dialog_min);
            jno0.c(textView, R.attr.vk_ui_text_secondary);
            textView.setVisibility(0);
            view.setEnabled(false);
            return;
        }
        if (a.length() <= 255) {
            textView.setVisibility(8);
            view.setEnabled(true);
        } else {
            textView.setText(R.string.stickers_suggest_add_dialog_max);
            jno0.c(textView, R.attr.vk_ui_background_negative);
            textView.setVisibility(0);
            view.setEnabled(false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
