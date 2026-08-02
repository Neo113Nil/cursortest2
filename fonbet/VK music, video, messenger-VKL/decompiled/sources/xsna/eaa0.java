package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.daa0;

/* compiled from: PhotoListAdapter.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class eaa0 extends FunctionReferenceImpl implements yzs<Photo, Integer, Integer, String> {
    @Override // xsna.yzs
    public final String invoke(Photo photo, Integer num, Integer num2) {
        ImageSize Ab;
        Photo photo2 = photo;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        daa0.a aVar = (daa0.a) this.receiver;
        int i = daa0.a.q;
        aVar.getClass();
        if (photo2 == null || (Ab = photo2.Ab(intValue, intValue2)) == null) {
            return null;
        }
        return Ab.d.d;
    }
}
