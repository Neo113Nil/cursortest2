package xsna;

import com.vk.dto.photo.PhotoAlbum;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xl1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ xl1(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((PhotoAlbum) obj).b == this.c);
            case 1:
                bdb bdbVar = (bdb) obj;
                vcb vcbVar = bdbVar.i;
                return bdb.a(bdbVar, 0, 0, 0, 0, 0, 0, vcb.b(vcbVar, vjm.e(vcbVar.b, 0, this.c, 1), 0L, 2), null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -129, 7);
            default:
                return Boolean.valueOf(((Integer) obj).intValue() == this.c);
        }
    }
}
