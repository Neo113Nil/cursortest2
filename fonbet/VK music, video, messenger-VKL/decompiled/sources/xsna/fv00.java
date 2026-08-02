package xsna;

import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fv00 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fv00(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                int i3 = iv00.p1;
                ((iv00) obj2).bo(i2, (List) obj);
                break;
            default:
                ((VkHttpCallFactory.a) obj2).e((jkv) obj, i2);
                break;
        }
    }
}
