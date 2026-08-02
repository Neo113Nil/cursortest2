package xsna;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.hints.Hint;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* compiled from: VmojiCreateView.kt */
/* loaded from: classes15.dex */
public final class j8w0 extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j8w0(Context context, uei0 uei0Var) {
        super(context, null, 0);
        String str;
        s3q0 s3q0Var = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.story_vmoji_create, (ViewGroup) this, false);
        jjc.g(inflate.findViewById(R.id.create), new fvq0(uei0Var, 16));
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.onboarding_image);
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
        addView(inflate);
    }
}
