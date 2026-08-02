package xsna;

import android.text.SpannableString;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.data.VideoRelatedVideosPagingType;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n6(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                q6 q6Var = (q6) this.d;
                zk10 zk10Var = (zk10) obj;
                long a = q6.a(zk10Var.getValue());
                if (0 > a || a >= this.c) {
                    return zk10Var.getValue();
                }
                String value = zk10Var.getValue();
                SpannableString spannableString = new SpannableString(value);
                spannableString.setSpan(new p6(q6Var, value), 0, spannableString.length(), 0);
                return spannableString;
            case 1:
                zrz zrzVar = (zrz) this.d;
                AtomicBoolean atomicBoolean = zrzVar.q;
                int i = this.c;
                zrz.a aVar = (zrz.a) obj;
                try {
                    if (zrz.e(aVar)) {
                        aVar = zrzVar.g(i, aVar, "loadNext");
                    }
                    return aVar;
                } finally {
                    atomicBoolean.set(false);
                }
            default:
                ((com.vk.video.ui.discovery.minimizable.related_videos.c) this.d).e.invoke(new c.s0.j(this.c, (rbt0) obj, VideoRelatedVideosPagingType.VideoQueue));
                return s3q0.a;
        }
    }
}
