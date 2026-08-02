package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import xsna.pum;

/* compiled from: FolderDialogsListLocalDataSource.kt */
/* loaded from: classes18.dex */
public final class nyr implements yuk<xrm, gkx0> {
    public final int b;
    public final a1w c;
    public final Object d;

    public nyr(int i, Object obj, a1w a1wVar) {
        this.b = i;
        this.c = a1wVar;
        this.d = obj;
    }

    @Override // xsna.yuk
    public final io.reactivex.rxjava3.core.x b(int i, String str, Object obj) {
        Source source = Source.CACHE;
        return this.c.C(this, new lrm(new drm((gkx0) obj, (pum) new pum.b(this.b, DialogsFilter.MAIN), i, source, false, this.d, str.concat(" -> FolderDialogsListLocalDataSource")))).l(new ai3(new tuq(2), 19));
    }
}
