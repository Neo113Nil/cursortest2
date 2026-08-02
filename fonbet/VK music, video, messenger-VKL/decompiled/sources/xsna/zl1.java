package xsna;

import com.vk.dto.photo.PhotoAlbum;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zl1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ zl1(String str, int i) {
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
            case 1:
                int intValue = ((Integer) obj).intValue();
                return intValue == 0 ? this.c : String.valueOf(intValue);
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, this.c);
                return s3q0.a;
            case 3:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            case 4:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT name, value, storage_name FROM meta WHERE storage_name = ?");
                try {
                    V0.D3(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        String l2 = V0.l2(0);
                        String l22 = V0.l2(1);
                        V0.l2(2);
                        arrayList.add(new y0p0(l2, l22));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 5:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "subscribe_button");
                qgi0.s(tgi0Var2, ws2.e(this.c));
                return s3q0.a;
            case 6:
                qgi0.e((tgi0) obj, this.c, new c24(0));
                return s3q0.a;
            case 7:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                qgi0.r((tgi0) obj, this.c);
                return s3q0.a;
        }
    }
}
