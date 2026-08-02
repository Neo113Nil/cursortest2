package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationAppearanceMetaDto;
import com.vk.api.generated.messages.dto.MessagesEnumerateAppearancesResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DialogAppearanceLoadIdsApiCmd.kt */
/* loaded from: classes2.dex */
public final class v9m extends nx2<List<? extends w9m>> {
    public final boolean b;

    public v9m(boolean z) {
        this.b = z;
    }

    @Override // xsna.nx2
    public final List<? extends w9m> f(l7r0 l7r0Var) {
        List<MessagesConversationAppearanceMetaDto> d = ((MessagesEnumerateAppearancesResponseDto) bz2.l(new tfx("messages.enumerateAppearances", new v11(19), new w11(25)), this.b)).d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(new w9m(((MessagesConversationAppearanceMetaDto) it.next()).getId(), r1.d()));
        }
        return arrayList;
    }
}
