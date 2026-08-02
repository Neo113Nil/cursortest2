package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.GifWithQueryData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qbl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ qbl(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.k((tgi0) obj, this.c);
                return s3q0.a;
            case 1:
                return new GifWithQueryData(this.c, (VKList) obj);
            default:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
        }
    }
}
