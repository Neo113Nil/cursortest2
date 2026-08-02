package xsna;

import android.graphics.Bitmap;
import com.vk.superapp.api.dto.story.WebRenderableSticker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pzl0 implements izs {
    public final /* synthetic */ WebRenderableSticker b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ pzl0(WebRenderableSticker webRenderableSticker, szl0 szl0Var, boolean z, boolean z2) {
        this.b = webRenderableSticker;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        int i = this.c ? 2 : this.d ? 3 : 6;
        WebRenderableSticker webRenderableSticker = this.b;
        vzl0 vzl0Var = new vzl0(bitmap, webRenderableSticker, i);
        boolean z = webRenderableSticker.k;
        z2l0 z2l0Var = vzl0Var.c;
        z2l0Var.q = z;
        z2l0Var.o = webRenderableSticker.l;
        return vzl0Var;
    }
}
