package xsna;

import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import xsna.npl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class kpl implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ kpl(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((npl.a) Collections.max((List) obj)).compareTo((npl.a) Collections.max((List) obj2));
            default:
                ItemReaction itemReaction = (ItemReaction) obj;
                ItemReaction itemReaction2 = (ItemReaction) obj2;
                kpl kplVar = ItemReactions.j;
                int g = epx.g(itemReaction2.c, itemReaction.c);
                return g == 0 ? epx.g(itemReaction.b, itemReaction2.b) : g;
        }
    }
}
