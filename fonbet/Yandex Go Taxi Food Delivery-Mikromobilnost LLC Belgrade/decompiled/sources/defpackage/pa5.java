package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.yandex.images.SourcePolicy;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.images.b;

/* loaded from: classes15.dex */
public abstract class pa5 extends l25 {
    public final int H2;
    public final int N2;
    public String T2;

    public pa5(boolean z, View view, jwf jwfVar) {
        super(z, view, jwfVar);
        this.H2 = view.getResources().getDimensionPixelSize(gvg0.emoji_sticker_image_height);
        this.N2 = view.getContext().getResources().getDimensionPixelSize(gvg0.timeline_sticker_size);
        this.x2.setOnClickListener(new tf(20, this));
        this.x2.setOnLongClickListener(new ly4(1, this));
        this.x2.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // defpackage.l25, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        StickerMessageData stickerMessageData = (StickerMessageData) yabVar.R();
        this.T2 = stickerMessageData.setId;
        String f = b.f(stickerMessageData.id);
        yn50 yn50Var = (yn50) ((xav) this.K0.getValue()).load(f);
        xn50 xn50Var = yn50Var.b;
        int i = this.H2;
        xn50Var.i = i;
        xn50Var.j = i;
        SourcePolicy sourcePolicy = SourcePolicy.SKIP_DISK_CACHE;
        int i2 = xn50Var.h | sourcePolicy.index;
        xn50Var.h = i2;
        xn50Var.k = ScaleMode.FIT_CENTER;
        com.yandex.images.b bVar = yn50Var.a;
        SourcePolicy.Companion.getClass();
        ad7 d = bVar.b.d(xn50Var, (sourcePolicy.index & i2) != 0);
        Bitmap bitmap = d != null ? d.a : null;
        BitmapDrawable bitmapDrawable = bitmap != null ? new BitmapDrawable(this.a.getResources(), bitmap) : null;
        Boolean bool = Boolean.TRUE;
        int i3 = this.N2;
        this.C2.d(new kt10(f, i3, i3, false, 0L, bitmapDrawable, null, bool), false);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean b0() {
        return true;
    }
}
