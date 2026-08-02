package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class tei0 implements izs {
    public final /* synthetic */ Set b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tei0(Set set, boolean z) {
        this.b = set;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StickerItem[] stickerItemArr = (StickerItem[]) obj;
        ListBuilder listBuilder = new ListBuilder(stickerItemArr.length + 3);
        if (!this.b.isEmpty()) {
            listBuilder.add(new swu(this.c));
        }
        boolean z = false;
        for (StickerItem stickerItem : stickerItemArr) {
            if (stickerItem.j == null) {
                if (!z) {
                    listBuilder.add(new pzo0(R.string.story_stickers_title));
                    z = true;
                }
                listBuilder.add(new ig10(stickerItem));
            }
        }
        boolean z2 = false;
        for (StickerItem stickerItem2 : stickerItemArr) {
            if (stickerItem2.j != null) {
                if (!z2) {
                    listBuilder.add(new pzo0(R.string.story_vmoji_stickers_header));
                    z2 = true;
                }
                listBuilder.add(new ig10(stickerItem2));
            }
        }
        return listBuilder.g();
    }
}
