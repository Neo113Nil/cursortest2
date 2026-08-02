package xsna;

import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.newsfeed.impl.items.posting.item.modals.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yrj0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yrj0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((d.b) this.d).a((spg0) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                x0o0 x0o0Var = (x0o0) this.d;
                Photo photo = (Photo) this.e;
                x0o0Var.o.b(hg1.m(rsg0.y0(yfb.x(x0o0Var.g.c(Tag.ContentType.PHOTO.h(), photo.e, photo.c, (String) this.f, photo.v, Float.valueOf((float) ((Double) obj).doubleValue()), Float.valueOf((float) ((Double) obj2).doubleValue()))), null, null, 3), x0o0Var.a, 0L, false, 62).subscribe(new k130(new v0o0(photo, x0o0Var, this.c), 24), new iyl0(y0o0.b, 1)));
                break;
            default:
                ((Integer) obj2).intValue();
                ((gcd0) this.d).e((String) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
