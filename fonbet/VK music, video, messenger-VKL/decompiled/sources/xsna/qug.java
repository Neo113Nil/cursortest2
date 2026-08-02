package xsna;

import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgReactionImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityChannelReactionsMappingHelperImpl.kt */
/* loaded from: classes2.dex */
public final class qug implements yab {
    @Override // xsna.yab
    public final void e(MsgFromChannel msgFromChannel) {
        Integer num;
        ItemReactions itemReactions = msgFromChannel.I.p;
        Integer num2 = null;
        if (itemReactions == null) {
            itemReactions = new ItemReactions(new ArrayList(), 0, 0, null);
        }
        Integer num3 = msgFromChannel.J;
        ArrayList<ItemReaction> arrayList = itemReactions.b;
        ArrayList arrayList2 = new ArrayList();
        for (ItemReaction itemReaction : arrayList) {
            int i = itemReaction.b;
            int i2 = itemReaction.b;
            int i3 = (num3 != null && i == num3.intValue()) ? itemReaction.c + 1 : (num3 == null || (num = itemReactions.e) == null || num.intValue() != i2) ? itemReaction.c : itemReaction.c - 1;
            MsgReactionImpl msgReactionImpl = (i3 <= 0 || i2 == 0) ? null : new MsgReactionImpl(i2, EmptyList.b, i3);
            if (msgReactionImpl != null) {
                arrayList2.add(msgReactionImpl);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (num3 != null && num3.intValue() != -1) {
            num2 = num3;
        }
        if (num2 != null) {
            if (!arrayList3.isEmpty()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    if (((MsgReactionImpl) it.next()).b == num2.intValue()) {
                        break;
                    }
                }
            }
            arrayList3.add(new MsgReactionImpl(num2.intValue(), EmptyList.b, 1));
        }
        msgFromChannel.G = arrayList3;
        if (num3 == null) {
            num3 = itemReactions.e;
        }
        msgFromChannel.H = num3;
    }

    @Override // xsna.yab
    public final void a() {
    }

    @Override // xsna.yab
    public final void c() {
    }

    @Override // xsna.yab
    public final List b(ArrayList arrayList) {
        return arrayList;
    }

    @Override // xsna.yab
    public final int d(int i) {
        return i;
    }
}
