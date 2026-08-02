package com.yandex.go.taxi.order.cancel.reasons.view.v2;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.bdc;
import defpackage.dzg0;
import defpackage.mzh0;
import defpackage.sls;
import defpackage.tje;
import defpackage.wug0;
import defpackage.wx7;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemCheckComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CancelReasonsV2AdapterFactory$create$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        wx7 wx7Var = (wx7) this.receiver;
        wx7Var.getClass();
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(wx7Var.a, null, 0, 6, null);
        listItemCheckComponent.setBackgroundResource(dzg0.bg_main_ripple);
        listItemCheckComponent.setUseAutoAccessibilityDelegate(false);
        listItemCheckComponent.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        listItemCheckComponent.setTitleTextSizePx(tje.r(wug0.cancel_reason_title_size, listItemCheckComponent.getContext()));
        listItemCheckComponent.setTitleMaxLines(2);
        listItemCheckComponent.setTitleTextColor(new bdc(xng0.textMain));
        listItemCheckComponent.setTitleEllipsizeMode(1);
        listItemCheckComponent.setTitleFontFeatureSettings(listItemCheckComponent.getContext().getString(mzh0.go_default_font_settings));
        listItemCheckComponent.setSubtitleTextSizePx(tje.r(wug0.cancel_reason_subtitle_size, listItemCheckComponent.getContext()));
        listItemCheckComponent.setSubtitleMaxLines(2);
        listItemCheckComponent.setSubtitleTextColor(new bdc(xng0.textMain));
        listItemCheckComponent.setSubTitleEllipsizeMode(1);
        listItemCheckComponent.setSubtitleFontFeatureSettings(listItemCheckComponent.getContext().getString(mzh0.go_default_font_settings));
        return listItemCheckComponent;
    }
}
