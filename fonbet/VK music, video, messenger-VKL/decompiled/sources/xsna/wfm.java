package xsna;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DialogInfoMergeTask.kt */
/* loaded from: classes2.dex */
public final class wfm extends b920 {
    public final Collection<com.vk.im.engine.models.dialogs.a> c;
    public final Integer d;
    public final int e;
    public final boolean f;

    public wfm(Collection collection, Integer num, int i, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        i = (i2 & 4) != 0 ? -1 : i;
        boolean z = (i2 & 8) == 0;
        this.c = collection;
        this.d = num;
        this.e = i;
        this.f = z;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        return this.c.isEmpty() ? EmptyList.b : (List) w2wVar.I0().u(new defpackage.y(8, this, w2wVar));
    }

    public wfm(com.vk.im.engine.models.dialogs.a aVar, Integer num) {
        this(Collections.singletonList(aVar), num, 0, 12);
    }
}
