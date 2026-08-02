package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import com.vk.fullscreenbanners.api.dto.blocks.button.OpenUrlButtonFullScreenBannerBlock;
import com.vkontakte.android.R;

/* compiled from: OpenUrlButtonBannerHolder.kt */
/* loaded from: classes16.dex */
public final class ps80 extends de implements View.OnClickListener {
    public final fnu0 b;
    public final op5 c;
    public TextView d;
    public OpenUrlButtonFullScreenBannerBlock e;

    public ps80(fnu0 fnu0Var, op5 op5Var) {
        this.b = fnu0Var;
        this.c = op5Var;
    }

    @Override // xsna.de
    public final void R(FullScreenBannerBlock fullScreenBannerBlock) {
        OpenUrlButtonFullScreenBannerBlock openUrlButtonFullScreenBannerBlock = fullScreenBannerBlock instanceof OpenUrlButtonFullScreenBannerBlock ? (OpenUrlButtonFullScreenBannerBlock) fullScreenBannerBlock : null;
        if (openUrlButtonFullScreenBannerBlock == null) {
            return;
        }
        this.e = openUrlButtonFullScreenBannerBlock;
        TextView textView = this.d;
        (textView != null ? textView : null).setText(openUrlButtonFullScreenBannerBlock.e);
    }

    @Override // xsna.de
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fsb_button_vh, viewGroup, false);
        TextView textView = (TextView) inflate;
        this.d = textView;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(this);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OpenUrlButtonFullScreenBannerBlock openUrlButtonFullScreenBannerBlock = this.e;
        if (openUrlButtonFullScreenBannerBlock != null) {
            ActionOpenUrl actionOpenUrl = openUrlButtonFullScreenBannerBlock.f;
            if (!drm0.N(actionOpenUrl.c)) {
                xwk.d().h(view.getContext(), actionOpenUrl, "");
            }
            this.b.a(openUrlButtonFullScreenBannerBlock.g);
            ((io.reactivex.rxjava3.subjects.f) this.c.b).onNext(new nvf());
        }
    }
}
