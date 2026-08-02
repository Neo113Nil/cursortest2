package xsna;

import com.vk.dto.common.data.PrivacySetting;
import xsna.ned0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kb10 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kb10(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                com.vk.ecomm.design.compose.gallery.a.d((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).intValue();
                ((qkk0) this.d).l(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                return new ned0((ned0.a) obj2, (PrivacySetting) this.d, (String) obj, this.c);
        }
    }
}
