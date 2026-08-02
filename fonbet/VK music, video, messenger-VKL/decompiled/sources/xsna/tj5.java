package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class tj5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ tj5(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((StickerStockItem) obj);
                return s3q0.a;
            case 1:
                ProfileButtons.b bVar = (ProfileButtons.b) obj;
                this.c.invoke(new AuthorHeaderEvent.a.b(bVar.a, bVar.b));
                return s3q0.a;
            default:
                return String.valueOf(this.c.invoke(obj));
        }
    }
}
