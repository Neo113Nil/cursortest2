package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.stickers.selection.models.EditorSticker;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: StickerHolder.kt */
/* loaded from: classes15.dex */
public final class q4l0 extends RecyclerView.e0 implements View.OnAttachStateChangeListener, View.OnClickListener {
    public final uei0 l;
    public final sfp0 m;
    public final gzs<String> n;
    public final ImStickerView o;
    public StickerItem p;
    public final kcl0 q;
    public io.reactivex.rxjava3.disposables.c r;

    public q4l0(Context context, uei0 uei0Var, sfp0 sfp0Var, gzs<String> gzsVar) {
        super(new ImStickerView(context, null, 6));
        this.l = uei0Var;
        this.m = sfp0Var;
        this.n = gzsVar;
        ImStickerView imStickerView = (ImStickerView) this.itemView;
        this.o = imStickerView;
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        this.q = d;
        imStickerView.setAnimationAllowed(d.K0() && yse0.c.a());
        int a = iah0.a(8);
        imStickerView.setPadding(a, a, a, a);
        imStickerView.setOnClickListener(new uvt0(1000L, this));
        imStickerView.setContentDescription(context.getString(R.string.accessibility_sticker));
        imStickerView.setForeground(xus.a(iah0.a(12), 0, dhr0.Y(R.attr.vk_ui_separator_primary_alpha, context), Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
    }

    public final void V5(StickerItem stickerItem) {
        this.p = stickerItem;
        dhr0 dhr0Var = dhr0.a;
        ImStickerView imStickerView = this.o;
        imStickerView.setDarkTheme(Boolean.valueOf(dhr0Var.c(imStickerView.getContext())));
        StickerItem stickerItem2 = this.p;
        if (stickerItem2 != null) {
            imStickerView.setAlpha(stickerItem2.h ? 1.0f : 0.3f);
            ImStickerView.b(imStickerView, stickerItem, null, 4);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        StickerItem stickerItem;
        String str;
        if (view == null || (context = view.getContext()) == null || (stickerItem = this.p) == null) {
            return;
        }
        boolean z = stickerItem.h;
        int i = stickerItem.b;
        kcl0 kcl0Var = this.q;
        StickerStockItem H = kcl0Var.H(i);
        if (H != null && (!H.h || !z)) {
            zal0 a = g2v.d().a();
            gzs<String> gzsVar = this.n;
            if (gzsVar == null || (str = gzsVar.invoke()) == null) {
                str = "";
            }
            H.O = "story_create_keyboard_".concat(str);
            s3q0 s3q0Var = s3q0.a;
            zal0.m(a, context, H, null, null, 60);
            return;
        }
        if (H == null && !z) {
            io.reactivex.rxjava3.disposables.c cVar = this.r;
            if (cVar != null) {
                cVar.dispose();
            }
            this.r = bug0.d(rsg0.y0(new lil0(i), null, null, 3), context, null, 6).subscribe(new tts(new by5(25, context, this), 29), new l8w(new h3e0(5), 24));
            return;
        }
        this.l.r(new EditorSticker(H != null ? H.b : stickerItem.c, stickerItem.b, kcl0Var.z0(stickerItem, iah0.v() / 3, dhr0.M()), stickerItem.a(dhr0.M()), stickerItem.j));
        i0q0.d(500L, new i(9, this, stickerItem));
        sfp0 sfp0Var = this.m;
        if (sfp0Var != null) {
            sfp0Var.b(getAdapterPosition());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        io.reactivex.rxjava3.disposables.c cVar = this.r;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
