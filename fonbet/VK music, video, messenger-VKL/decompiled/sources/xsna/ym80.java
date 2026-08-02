package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.stickers.StickerItem;
import com.vk.log.L;
import com.vk.story.viewer.impl.presentation.stories.message.FastReaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym80 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ym80(ArrayList arrayList, int i) {
        this.b = i;
        this.c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [xsna.x1l0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(this.c.contains((String) ((Pair) obj).d()));
            default:
                List list = (List) obj;
                HashMap hashMap = new HashMap(list.size());
                for (Object obj2 : list) {
                    hashMap.put(Integer.valueOf(((StickerItem) obj2).b), obj2);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList<FastReaction> arrayList2 = this.c;
                for (FastReaction fastReaction : arrayList2) {
                    StickerItem stickerItem = (StickerItem) hashMap.get(Integer.valueOf(fastReaction.j()));
                    if (stickerItem != null) {
                        r5 = stickerItem.c > 0 ? stickerItem : null;
                        if (r5 == null) {
                            r5 = StickerItem.zb(stickerItem, fastReaction.h(), false, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
                        }
                        r5 = new x1l0(r5, fastReaction.i());
                    }
                    if (r5 != null) {
                        arrayList.add(r5);
                    }
                }
                if (arrayList.size() != arrayList2.size()) {
                    L.l("Failed to load all stickers for fast reactions");
                }
                return arrayList;
        }
    }
}
