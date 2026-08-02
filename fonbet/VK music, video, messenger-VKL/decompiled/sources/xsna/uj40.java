package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.k840;

/* compiled from: MusicErrorView.kt */
/* loaded from: classes3.dex */
public class uj40 extends ee {
    public static final /* synthetic */ int d = 0;

    public uj40(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // xsna.ee
    public final void b() {
        VKImageView vKImageView = (VKImageView) findViewById(R.id.error_image);
        vKImageView.setImageResource(R.drawable.vk_icon_illustration_end_of_subscription_music_144h);
        bwt0.p0(vKImageView, true);
        TextView textView = (TextView) findViewById(R.id.error_text);
        textView.setText(textView.getContext().getString(k840.a.h() ? R.string.music_offline_mode_kids_error_description : R.string.music_offline_mode_error_description));
        bwt0.p0(textView, true);
        TextView textView2 = (TextView) findViewById(R.id.error_retry);
        textView2.setText(textView2.getContext().getString(R.string.music_offline_mode_update_page));
        bwt0.p0(textView2, true);
        VkButton vkButton = (VkButton) findViewById(R.id.error_action_button);
        bwt0.p0(vkButton, true);
        vkButton.setText(R.string.music_offline_mode_open_downloads);
    }

    public void c(ViewGroup viewGroup) {
        viewGroup.addView(LayoutInflater.from(getContext()).inflate(R.layout.vk_catalog_error_with_image_screen, (ViewGroup) null), new FrameLayout.LayoutParams(-1, -2, 17));
    }

    public final void d(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        b();
        ((TextView) findViewById(R.id.error_retry)).setOnClickListener(new tj40(0, gzsVar));
        ((VkButton) findViewById(R.id.error_action_button)).setOnClickListener(new xz5(gzsVar2, 6));
    }

    @Override // xsna.ee
    public void setRetryBtnVisible(boolean z) {
        bwt0.p0(findViewById(R.id.error_retry), z);
    }

    public uj40(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        c(this);
    }

    @Override // xsna.ee
    public void setActionTitle(int i) {
    }

    @Override // xsna.ee
    public void setMessage(CharSequence charSequence) {
    }
}
