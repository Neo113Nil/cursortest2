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
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CancelReasonsV2AdapterFactory$create$1$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        wx7 wx7Var = (wx7) this.receiver;
        wx7Var.getClass();
        ListItemComponent listItemComponent = new ListItemComponent(wx7Var.a, null, 0, 6, null);
        listItemComponent.setBackgroundResource(dzg0.bg_main_ripple);
        listItemComponent.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        listItemComponent.setTitleTextSizePx(tje.r(wug0.cancel_reason_title_size, listItemComponent.getContext()));
        listItemComponent.setTitleMaxLines(2);
        listItemComponent.setTitleTextColor(new bdc(xng0.textMain));
        listItemComponent.setTitleEllipsizeMode(1);
        listItemComponent.setTitleFontFeatureSettings(listItemComponent.getContext().getString(mzh0.go_default_font_settings));
        listItemComponent.setSubtitleTextSizePx(tje.r(wug0.cancel_reason_subtitle_size, listItemComponent.getContext()));
        listItemComponent.setSubtitleMaxLines(2);
        listItemComponent.setSubtitleTextColor(new bdc(xng0.textMain));
        listItemComponent.setSubTitleEllipsizeMode(1);
        listItemComponent.setSubtitleFontFeatureSettings(listItemComponent.getContext().getString(mzh0.go_default_font_settings));
        return listItemComponent;
    }
}
