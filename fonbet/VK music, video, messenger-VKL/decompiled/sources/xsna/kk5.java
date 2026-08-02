package xsna;

import android.text.Editable;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;

/* compiled from: AutoSuggestStickersPopupWindow.kt */
/* loaded from: classes5.dex */
public final class kk5 extends rno0 {
    public final /* synthetic */ AutoSuggestStickersPopupWindow b;

    public kk5(AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow) {
        this.b = autoSuggestStickersPopupWindow;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = this.b;
        if (autoSuggestStickersPopupWindow.k == null) {
            autoSuggestStickersPopupWindow.E();
        }
        autoSuggestStickersPopupWindow.C.onNext(editable.toString());
    }
}
