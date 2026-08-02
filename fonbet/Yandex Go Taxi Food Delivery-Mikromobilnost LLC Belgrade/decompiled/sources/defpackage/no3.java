package defpackage;

import com.yandex.messaging.core.net.entities.StickerPacksData;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class no3 extends w920 {
    public final /* synthetic */ to3 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ go3 c;

    public no3(to3 to3Var, ArrayList arrayList, go3 go3Var) {
        this.a = to3Var;
        this.b = arrayList;
        this.c = go3Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        return ouu.b(this.a.b, "stickers/packs", StickerPacksData.PackData[].class, kvj0Var);
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        this.c.D((StickerPacksData.PackData[]) obj);
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        return this.a.c.a("stickers/packs", this.b);
    }
}
