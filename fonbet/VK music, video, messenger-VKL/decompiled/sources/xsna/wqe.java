package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wqe implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ wqe(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "PlaylistsSmallFoldersCreate");
                qgi0.h(tgi0Var, this.c);
                qgi0.n(tgi0Var, 0);
                break;
            default:
                ((StickerStockItem) obj).O = this.c;
                break;
        }
        return s3q0.a;
    }
}
