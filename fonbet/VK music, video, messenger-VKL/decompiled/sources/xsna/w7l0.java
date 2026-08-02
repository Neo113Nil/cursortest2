package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Size;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.hints.Hint;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Map;

/* compiled from: StickerUGCCreatePage.kt */
/* loaded from: classes6.dex */
public final class w7l0 implements wdl0 {
    public final bi80 a;
    public ViewGroup b;
    public com.vk.stickers.keyboard.d c;

    public w7l0(bi80 bi80Var) {
        this.a = bi80Var;
    }

    @Override // xsna.wdl0
    public final View a(Context context) {
        Collection<String> values;
        ViewGroup viewGroup = this.b;
        String str = null;
        if (viewGroup == null) {
            viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sticker_keyboard_ugc_create, (ViewGroup) null);
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
            this.b = viewGroup;
        }
        VKImageView vKImageView = (VKImageView) viewGroup.findViewById(R.id.onboarding_image);
        Hint p = pla.e().b().p("stickers:ugc_keyboard_onboarding");
        if (p != null) {
            Map<String, String> map = p.e;
            if (map != null && (values = map.values()) != null) {
                str = (String) j5g.Z(values);
            }
            vKImageView.o0(str, new Size(cn70.b(265), cn70.b(70)));
        } else {
            vKImageView.setVisibility(8);
        }
        jjc.g(viewGroup.findViewById(R.id.hide_page_text_view), new wug0(this, 7));
        jjc.g(viewGroup.findViewById(R.id.create), new w620(this, 28));
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
