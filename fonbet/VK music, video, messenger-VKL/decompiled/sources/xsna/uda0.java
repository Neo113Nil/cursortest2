package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PhotoViewHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class uda0 extends FunctionReferenceImpl implements yzs<Photo, Integer, Integer, String> {
    @Override // xsna.yzs
    public final String invoke(Photo photo, Integer num, Integer num2) {
        ImageSize Ab;
        Photo photo2 = photo;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        vda0 vda0Var = (vda0) this.receiver;
        int i = vda0.r;
        vda0Var.getClass();
        if (photo2 == null || (Ab = photo2.Ab(intValue, intValue2)) == null) {
            return null;
        }
        return Ab.d.d;
    }
}
