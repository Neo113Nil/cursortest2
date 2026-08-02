package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import kotlin.text.Regex;
import xsna.xn50;
import xsna.zw00;

/* compiled from: TextView.kt */
/* loaded from: classes18.dex */
public final class gx00 implements TextWatcher {
    public final /* synthetic */ MarketEditAlbumCoverFragment b;

    public gx00(MarketEditAlbumCoverFragment marketEditAlbumCoverFragment) {
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
            zw00.a.d dVar = new zw00.a.d(null, 0);
            marketEditAlbumCoverFragment.getClass();
            xn50.a.c(marketEditAlbumCoverFragment, dVar);
            str = null;
        } else if (str.equals(String.valueOf(editable))) {
            String valueOf = String.valueOf(editable);
            EditText editText = marketEditAlbumCoverFragment.R;
            if (editText == null) {
                editText = null;
            }
            zw00.a.d dVar2 = new zw00.a.d(valueOf, editText.getSelectionEnd());
            marketEditAlbumCoverFragment.getClass();
            xn50.a.c(marketEditAlbumCoverFragment, dVar2);
            str = String.valueOf(editable);
        } else {
            EditText editText2 = marketEditAlbumCoverFragment.R;
            if (editText2 == null) {
                editText2 = null;
            }
            int min = Math.min(Math.max(0, editText2.getSelectionEnd() - 1), str.length());
            EditText editText3 = marketEditAlbumCoverFragment.R;
            if (editText3 == null) {
                editText3 = null;
            }
            editText3.setText(str);
            EditText editText4 = marketEditAlbumCoverFragment.R;
            if (editText4 == null) {
                editText4 = null;
            }
            editText4.setSelection(min);
            zw00.a.d dVar3 = new zw00.a.d(str, min);
            marketEditAlbumCoverFragment.getClass();
            xn50.a.c(marketEditAlbumCoverFragment, dVar3);
        }
        TextView textView = marketEditAlbumCoverFragment.W;
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
