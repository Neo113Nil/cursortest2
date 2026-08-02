package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import xsna.pum;

/* compiled from: LocalDialogsListDataSource.kt */
/* loaded from: classes18.dex */
public final class kuz implements yuk<xrm, gkx0> {
    public final a1w b;
    public final Object c;

    public kuz(a1w a1wVar, Object obj) {
        this.b = a1wVar;
        this.c = obj;
    }

    @Override // xsna.yuk
    public final io.reactivex.rxjava3.core.x b(int i, String str, Object obj) {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.b.C(this, new lrm(new drm((gkx0) obj, (pum) new pum.a(DialogsFilter.MAIN), i, Source.CACHE, false, this.c, "LocalDialogsListDataSource"))), new pi0(new igh(this, 24), 24)).l(new iu4(new juz(0), 18));
    }
}
