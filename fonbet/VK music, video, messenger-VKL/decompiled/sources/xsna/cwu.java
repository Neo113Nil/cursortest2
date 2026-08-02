package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import com.vk.fullscreenbanners.api.dto.blocks.common.TitleFullScreenBannerBlock;
import com.vkontakte.android.R;

/* compiled from: HeaderBannerHolder.kt */
/* loaded from: classes16.dex */
public final class cwu extends de {
    public TextView b;

    @Override // xsna.de
    public final void R(FullScreenBannerBlock fullScreenBannerBlock) {
        TitleFullScreenBannerBlock titleFullScreenBannerBlock = fullScreenBannerBlock instanceof TitleFullScreenBannerBlock ? (TitleFullScreenBannerBlock) fullScreenBannerBlock : null;
        if (titleFullScreenBannerBlock == null) {
            return;
        }
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setText(titleFullScreenBannerBlock.d);
        TextView textView2 = this.b;
        (textView2 != null ? textView2 : null).setTextColor(titleFullScreenBannerBlock.e);
    }

    @Override // xsna.de
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fsb_header_vh, viewGroup, false);
        this.b = (TextView) inflate;
        return inflate;
    }
}
