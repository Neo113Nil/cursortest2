package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationBackgroundMetaDto;
import com.vk.api.generated.messages.dto.MessagesEnumerateBackgroundsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DialogBackgroundsLoadIdsApiCmd.kt */
/* loaded from: classes2.dex */
public final class tam extends nx2<List<? extends uam>> {
    public final boolean b;

    public tam(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tam) && this.b == ((tam) obj).b;
    }

    @Override // xsna.nx2
    public final List<? extends uam> f(l7r0 l7r0Var) {
        List<MessagesConversationBackgroundMetaDto> d = ((MessagesEnumerateBackgroundsResponseDto) bz2.l(new tfx("messages.enumerateBackgrounds", new io.reactivex.rxjava3.subjects.b(27), new io.reactivex.rxjava3.subjects.c(28)), this.b)).d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(new uam(((MessagesConversationBackgroundMetaDto) it.next()).getId(), r1.d()));
        }
        return arrayList;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("DialogBackgroundsLoadIdsApiCmd(isAwaitNetwork="), this.b, ')');
    }
}
