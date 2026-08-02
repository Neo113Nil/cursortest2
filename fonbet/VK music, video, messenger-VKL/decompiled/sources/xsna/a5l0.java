package xsna;

import android.view.View;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.metrics.eventtracking.Event;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.stickers.views.LongtapRecyclerView;
import java.util.List;
import xsna.scl0;

/* compiled from: StickerLongtapListenerImpl.kt */
/* loaded from: classes6.dex */
public final class a5l0 implements LongtapRecyclerView.a {
    public final sxm a;
    public final y5l0 b;
    public final y6l0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public a5l0(i5l0 i5l0Var, y5l0 y5l0Var, y6l0 y6l0Var) {
        this.a = (sxm) i5l0Var;
        this.b = y5l0Var;
        this.c = y6l0Var;
    }

    @Override // com.vk.stickers.views.LongtapRecyclerView.a
    public final void a() {
        this.c.getClass();
    }

    @Override // com.vk.stickers.views.LongtapRecyclerView.a
    public final void b() {
        y6l0 y6l0Var = this.c;
        y6l0Var.a.getClass();
        y6l0Var.b.dismiss();
        scl0.a.a(new scl0.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.i5l0, xsna.sxm] */
    @Override // com.vk.stickers.views.LongtapRecyclerView.a
    public final void c(View view) {
        y5l0 y5l0Var;
        PopupStickerView popupStickerView;
        StickerItem p0 = this.a.p0(view);
        if (p0 == null || (y5l0Var = this.b) == null) {
            return;
        }
        List<StickerItem> b = y5l0Var.b();
        int g = y5l0Var.g(p0);
        y6l0 y6l0Var = this.c;
        w6l0 w6l0Var = y6l0Var.a;
        u390 u390Var = y6l0Var.b;
        if (!u390Var.i.isShowing()) {
            u390Var.e(view);
            w6l0Var.getClass();
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("UI.STICKERS.LONG_TAP_PREVIEW_SHOW");
            bVar.k(aVar.e());
        }
        bbl0 bbl0Var = w6l0Var.c;
        bbl0Var.f = b;
        bbl0Var.notifyDataSetChanged();
        w6l0Var.b.setCurrentItem(g, false);
        if (g < b.size()) {
            StickerItem stickerItem = b.get(g);
            if (stickerItem instanceof StickerItem) {
                StickerItem stickerItem2 = stickerItem;
                if (stickerItem2.z9()) {
                    PopupStickerView popupStickerView2 = w6l0Var.d;
                    if (popupStickerView2 != null) {
                        popupStickerView2.e();
                    }
                    w6l0Var.removeView(w6l0Var.d);
                    PopupStickerView popupStickerView3 = new PopupStickerView(w6l0Var.getContext(), null, 0, 14, 0);
                    w6l0Var.d = popupStickerView3;
                    w6l0Var.addView(popupStickerView3);
                    PopupStickerAnimation popupStickerAnimation = stickerItem2.k;
                    if (popupStickerAnimation != null && (popupStickerView = w6l0Var.d) != null) {
                        PopupStickerView.d(popupStickerView, popupStickerAnimation, true, null, 12);
                    }
                }
            }
            PopupStickerView popupStickerView4 = w6l0Var.d;
            if (popupStickerView4 != null) {
                popupStickerView4.e();
            }
            w6l0Var.removeView(w6l0Var.d);
        }
        scl0.a.a(new scl0.c());
    }
}
