package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import xsna.pum;

/* compiled from: FolderDialogsListRemoteDataSource.kt */
/* loaded from: classes18.dex */
public final class pyr implements yuk<xrm, gkx0> {
    public final int b;
    public final Object c;
    public final a1w d;

    public pyr(int i, Object obj, a1w a1wVar) {
        this.b = i;
        this.c = obj;
        this.d = a1wVar;
    }

    @Override // xsna.yuk
    public final io.reactivex.rxjava3.core.x b(int i, String str, Object obj) {
        DialogsFilter dialogsFilter = DialogsFilter.MAIN;
        int i2 = this.b;
        return new io.reactivex.rxjava3.internal.operators.single.d0(this.d.C(this, new lrm(new drm((gkx0) obj, (pum) new pum.b(i2, dialogsFilter), i, Source.NETWORK, false, this.c, na8.a(i2, str, " -> FolderDialogsListRemoteDataSource folderId: ")))), new sf3(this), null).l(new oyr(new hl4(i, 1), 0));
    }
}
