package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.core.view.components.text.VkText;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: LiveInfo.kt */
/* loaded from: classes16.dex */
public final class hjz implements vbp0 {
    public final Context a;
    public final LinearLayout b;

    public hjz(Context context, UIBlockTopshelf.TopshelfItem topshelfItem) {
        List<UIBlockTopshelf.TopshelfLiveInfo.Info> d;
        LinearLayout linearLayout;
        UIBlockTopshelf.TopshelfLiveInfo.Icon icon;
        boolean z;
        char c;
        Object obj;
        List<UIBlockTopshelf.TopshelfLiveInfo.Icon> d2;
        this.a = context;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.topshelf_live_info_block);
        boolean z2 = true;
        linearLayout2.setOrientation(1);
        char c2 = 65535;
        linearLayout2.setLayoutParams(new ConstraintLayout.b(-1, -2));
        UIBlockTopshelf.TopshelfLiveInfo topshelfLiveInfo = topshelfItem.d.e;
        if (topshelfLiveInfo != null && (d = topshelfLiveInfo.d()) != null) {
            ArrayList arrayList = new ArrayList();
            for (UIBlockTopshelf.TopshelfLiveInfo.Info info : d) {
                if (info.g() == null && ((d2 = info.d()) == null || d2.isEmpty())) {
                    z = z2;
                    linearLayout = null;
                    c = c2;
                } else {
                    linearLayout = new LinearLayout(this.a);
                    linearLayout.setOrientation(0);
                    List<UIBlockTopshelf.TopshelfLiveInfo.Icon> d3 = info.d();
                    if (d3 != null) {
                        Iterator<T> it = d3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((UIBlockTopshelf.TopshelfLiveInfo.Icon) obj).d() != null) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        icon = (UIBlockTopshelf.TopshelfLiveInfo.Icon) obj;
                    } else {
                        icon = null;
                    }
                    if (icon != null) {
                        VKImageView vKImageView = new VKImageView(linearLayout.getContext(), null, 6, 0);
                        float f = 32;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f));
                        layoutParams.gravity = 16;
                        vKImageView.setLayoutParams(layoutParams);
                        vKImageView.o0(icon.d(), null);
                        linearLayout.addView(vKImageView);
                    }
                    String g = info.g();
                    VkText vkText = new VkText(linearLayout.getContext(), null, 6, 0);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    vkText.setLayoutParams(layoutParams2);
                    vkText.setTextAppearance(vkText.getContext(), R.style.VkUiTypography_Title1);
                    vkText.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, vkText.getContext()));
                    z = true;
                    vkText.setMaxLines(1);
                    vkText.setEllipsize(TextUtils.TruncateAt.END);
                    vkText.setText(g);
                    linearLayout.addView(vkText);
                    if (icon != null) {
                        f4m.s(iah0.a(8), vkText);
                    }
                    c = 65535;
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    f4m.t(iah0.a(8), linearLayout);
                }
                if (linearLayout != null) {
                    arrayList.add(linearLayout);
                }
                z2 = z;
                c2 = c;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linearLayout2.addView((View) it2.next());
            }
        }
        this.b = linearLayout2;
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.b;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}
