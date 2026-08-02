package xsna;

import com.vk.dto.photo.PhotoAlbum;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ yl1(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                photoAlbum.k = this.c;
                return photoAlbum;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c);
                qgi0.r(tgi0Var, "TEST_TAG_IMAGE");
                return s3q0.a;
        }
    }
}
