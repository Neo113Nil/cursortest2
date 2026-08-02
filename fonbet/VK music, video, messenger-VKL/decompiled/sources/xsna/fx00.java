package xsna;

import android.view.KeyEvent;
import android.widget.TextView;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fx00 implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = MarketEditAlbumCoverFragment.c0;
        if (i != 6) {
            return false;
        }
        mhy.d(textView);
        textView.clearFocus();
        textView.setText(drm0.p0(textView.getText()));
        return true;
    }
}
