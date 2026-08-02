package xsna;

import com.vk.dto.photo.Photo;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zqp implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Photo c;

    public /* synthetic */ zqp(int i, Photo photo) {
        this.b = i;
        this.c = photo;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f(((PhotoAttachment) obj).l.e, this.c.e));
            case 1:
                Photo photo = this.c;
                photo.x = (List) obj;
                photo.m = true;
                return s3q0.a;
            default:
                return Boolean.valueOf(epx.f(((PhotoAttachment) obj).l.e, this.c.e));
        }
    }
}
