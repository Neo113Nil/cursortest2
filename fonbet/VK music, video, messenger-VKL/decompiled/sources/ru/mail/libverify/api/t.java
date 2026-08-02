package ru.mail.libverify.api;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import ru.mail.libverify.n.g;

/* loaded from: classes9.dex */
final class t implements g.b {
    final /* synthetic */ s a;

    public t(s sVar) {
        this.a = sVar;
    }

    @Override // ru.mail.libverify.n.g.b
    public final void a(@NonNull List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.a.a(it.next(), false);
        }
    }

    @Override // ru.mail.libverify.n.g.b
    public final long a() {
        return this.a.g.startTimeStamp;
    }
}
