package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import kotlin.text.Regex;

/* compiled from: TextView.kt */
/* loaded from: classes18.dex */
public final class hx00 implements TextWatcher {
    public final /* synthetic */ MarketEditAlbumCoverFragment b;

    public hx00(MarketEditAlbumCoverFragment marketEditAlbumCoverFragment) {
        this.b = marketEditAlbumCoverFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        if (editable == null || (str = drm0.t0(new Regex("\\s+").g(editable, " ")).toString()) == null) {
            str = "";
        }
        boolean N = drm0.N(str);
        MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = this.b;
        if (N) {
            if (editable != null) {
                editable.clear();
            }
            str = null;
        } else if (str.equals(String.valueOf(editable))) {
            str = String.valueOf(editable);
        } else {
            EditText editText = marketEditAlbumCoverFragment.U;
            if (editText == null) {
                editText = null;
            }
            int selectionEnd = editText.getSelectionEnd();
            EditText editText2 = marketEditAlbumCoverFragment.U;
            if (editText2 == null) {
                editText2 = null;
            }
            editText2.setText(str);
            EditText editText3 = marketEditAlbumCoverFragment.U;
            if (editText3 == null) {
                editText3 = null;
            }
            editText3.setSelection(Math.min(Math.max(0, selectionEnd - 1), str.length()));
        }
        TextView textView = marketEditAlbumCoverFragment.Z;
        TextView textView2 = textView != null ? textView : null;
        if (str == null || (str2 = Integer.valueOf(str.length()).toString()) == null) {
            str2 = "0";
        }
        textView2.setText(str2);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
