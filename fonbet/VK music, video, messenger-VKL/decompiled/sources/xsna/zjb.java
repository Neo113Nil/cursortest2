package xsna;

import com.vk.dto.stickers.StickerRender;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zjb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ zjb(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return bdb.a((bdb) obj, 0, this.c, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -5, 7);
            default:
                String Hb = ((StickerRender) obj).c.Hb(this.c);
                return Hb == null ? "" : Hb;
        }
    }
}
