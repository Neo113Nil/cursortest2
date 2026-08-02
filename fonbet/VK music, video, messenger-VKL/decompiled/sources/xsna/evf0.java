package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import xsna.pum;

/* compiled from: RemoteDialogsListDataSource.kt */
/* loaded from: classes18.dex */
public final class evf0 implements yuk<xrm, gkx0> {
    public final a1w b;
    public final Object c;

    public evf0(a1w a1wVar, Object obj) {
        this.b = a1wVar;
        this.c = obj;
    }

    @Override // xsna.yuk
    public final io.reactivex.rxjava3.core.x b(int i, String str, Object obj) {
        return this.b.C(this, new lrm(new drm((gkx0) obj, (pum) new pum.a(DialogsFilter.MAIN), i, Source.NETWORK, false, this.c, str.concat(" -> RemoteDialogsListDataSource")))).l(new x34(new w34(i, 2), 27));
    }
}
