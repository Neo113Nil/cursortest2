package defpackage;

import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.StickerPacksBucket;

/* loaded from: classes15.dex */
public final class adu0 implements eo3 {
    public final /* synthetic */ bdu0 a;

    public adu0(bdu0 bdu0Var) {
        this.a = bdu0Var;
    }

    @Override // defpackage.eo3
    public final void j(Bucket bucket) {
        bdu0 bdu0Var = this.a;
        bdu0Var.f = null;
        bdu0Var.b((StickerPacksBucket) bucket);
    }

    @Override // defpackage.eo3
    public final void k() {
        bdu0 bdu0Var = this.a;
        to3 to3Var = bdu0Var.a;
        ykn0 ykn0Var = new ykn0(23, bdu0Var);
        to3Var.getClass();
        bdu0Var.f = to3Var.a(StickerPacksBucket.class, new eo1(13, ykn0Var), new Bucket.GetParams(new StickerPacksBucket(), "sticker_packs"));
    }
}
