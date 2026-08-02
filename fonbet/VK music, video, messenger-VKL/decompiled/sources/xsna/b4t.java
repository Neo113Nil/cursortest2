package xsna;

import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GalleryFragmentImpl.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class b4t extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ b4t(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((GalleryFragmentImpl) this.receiver).Qg(((Number) obj).intValue(), (Integer) obj2);
                break;
            default:
                ((Number) obj2).intValue();
                ((ivu) this.receiver).c((String) obj);
                break;
        }
        return s3q0.a;
    }

    public b4t(Object obj) {
        super(2, obj, ivu.class, "onHashtagSelected", "onHashtagSelected(Ljava/lang/String;I)V", 0);
    }
}
