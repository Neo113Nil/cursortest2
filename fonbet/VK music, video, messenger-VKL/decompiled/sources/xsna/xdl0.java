package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Size;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.hints.Hint;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* compiled from: StickersVmojiCreatePage.kt */
/* loaded from: classes6.dex */
public final class xdl0 implements wdl0 {
    public final wmd0 a;
    public ViewGroup b;
    public com.vk.stickers.keyboard.d c;

    public xdl0(wmd0 wmd0Var) {
        this.a = wmd0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r2 == null) goto L26;
     */
    @Override // xsna.wdl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(Context context) {
        String str;
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            s3q0 s3q0Var = null;
            viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sticker_keyboard_vmoji_create, (ViewGroup) null);
            if (((Boolean) this.a.invoke()).booleanValue()) {
                viewGroup.setPadding(0, iah0.a(46), 0, 0);
                viewGroup.setClipToPadding(false);
            }
            if (context instanceof l7s) {
                TypedValue typedValue = new TypedValue();
                if (((l7s) context).getTheme().resolveAttribute(R.attr.vk_ui_write_bar_input_border, typedValue, true)) {
                    viewGroup.setBackgroundColor(typedValue.data);
                } else {
                    krv0.n(R.attr.vk_ui_write_bar_input_border, viewGroup);
                }
            } else {
                krv0.n(R.attr.vk_ui_write_bar_input_border, viewGroup);
            }
            VKImageView vKImageView = (VKImageView) viewGroup.findViewById(R.id.onboarding_image);
            Hint p = pla.e().b().p("keyboard:stickers_vmoji");
            if (p != null) {
                String str2 = dhr0.M() ? "vmoji_kb_onboarding_dark" : "vmoji_kb_onboarding_light";
                Map<String, String> map = p.e;
                if (map != null && (str = map.get(str2)) != null) {
                    vKImageView.o0(str, new Size(IronSourceError.ERROR_NO_INTERNET_CONNECTION, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
                    s3q0Var = s3q0.a;
                }
            }
            vKImageView.setVisibility(8);
            jjc.g(viewGroup.findViewById(R.id.create), new mcj0(this, 2));
            this.b = viewGroup;
        }
        return viewGroup;
    }

    @Override // xsna.wdl0
    public final void onConfigurationChanged(Configuration configuration) {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.dispatchConfigurationChanged(configuration);
        }
    }

    @Override // xsna.wdl0
    public final void b(boolean z) {
    }
}
