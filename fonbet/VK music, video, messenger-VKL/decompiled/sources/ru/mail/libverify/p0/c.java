package ru.mail.libverify.p0;

import android.os.Message;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.bqy;
import xsna.xz3;

/* loaded from: classes9.dex */
public final class c implements MessageBus {
    private final LinkedHashSet<?>[] a = new LinkedHashSet[e.a.length];

    @NonNull
    private final bqy<ru.mail.libverify.g0.d> b;

    public c(@NonNull bqy<ru.mail.libverify.g0.d> bqyVar) {
        this.b = bqyVar;
    }

    @Override // ru.mail.verify.core.utils.components.MessageBus
    /* renamed from: post, reason: merged with bridge method [inline-methods] */
    public final void a(@NonNull Message message) {
        if (!this.b.get().b().a()) {
            this.b.get().b().post(new xz3(6, this, message));
            return;
        }
        int i = message.what;
        if (i < 0 || i >= e.a.length) {
            throw new IllegalArgumentException("Illegal message type");
        }
        LinkedHashSet<?> linkedHashSet = this.a[i];
        if (linkedHashSet == null) {
            return;
        }
        Iterator<?> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((f) it.next()).handleMessage(message);
        }
    }

    @Override // ru.mail.verify.core.utils.components.MessageBus
    public final void register(@NonNull Collection<a> collection, @NonNull f fVar) {
        if (!this.b.get().b().a()) {
            throw new IllegalArgumentException("Components must be registered in the dispatcher thread");
        }
        for (a aVar : collection) {
            LinkedHashSet<?> linkedHashSet = this.a[aVar.ordinal()];
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                this.a[aVar.ordinal()] = linkedHashSet;
            }
            linkedHashSet.add(fVar);
        }
    }
}
