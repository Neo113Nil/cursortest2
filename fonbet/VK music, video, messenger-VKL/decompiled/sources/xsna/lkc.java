package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.dto.stories.model.clickable.ClickablePackSticker;
import com.vk.stickers.bridge.GiftData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lkc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lkc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                qkc qkcVar = (qkc) this.c;
                ClickablePackSticker clickablePackSticker = (ClickablePackSticker) this.d;
                qkcVar.m(clickablePackSticker);
                zal0 a = g2v.d().a();
                Context h = e3m.h(view.getContext());
                if (h == null) {
                    h = view.getContext();
                }
                zal0.H(a, h, clickablePackSticker.f, GiftData.d, null, "STORY_VIEWER", null, 104);
                break;
            case 1:
                lfr lfrVar = (lfr) this.c;
                ngr ngrVar = (ngr) this.d;
                lfrVar.e.invoke(((CatalogFilterData) lfrVar.c.c(ngrVar.getAdapterPosition())).b);
                break;
            case 2:
                FutureDateTimePickerView.b((com.google.android.material.timepicker.b) this.c, (FutureDateTimePickerView) this.d);
                break;
            default:
                ghw ghwVar = (ghw) this.c;
                ehw ehwVar = (ehw) this.d;
                ghwVar.m.Z1(new uai0(ehwVar.a, ehwVar.b));
                break;
        }
    }
}
