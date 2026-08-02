package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import com.vk.fullscreenbanners.api.dto.blocks.common.TextFullScreenBannerBlock;
import com.vkontakte.android.R;

/* compiled from: TextBannerHolder.kt */
/* loaded from: classes16.dex */
public final class eco0 extends de {
    public TextView b;

    @Override // xsna.de
    public final void R(FullScreenBannerBlock fullScreenBannerBlock) {
        TextFullScreenBannerBlock textFullScreenBannerBlock = fullScreenBannerBlock instanceof TextFullScreenBannerBlock ? (TextFullScreenBannerBlock) fullScreenBannerBlock : null;
        if (textFullScreenBannerBlock == null) {
            return;
        }
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setText(textFullScreenBannerBlock.d);
        TextView textView2 = this.b;
        (textView2 != null ? textView2 : null).setTextColor(textFullScreenBannerBlock.e);
    }

    @Override // xsna.de
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fsb_text_vh, viewGroup, false);
        this.b = (TextView) inflate;
        return inflate;
    }
}
