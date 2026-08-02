package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.im.ui.components.common.BanDuration;
import java.util.Date;
import java.util.Optional;
import kotlin.collections.EmptyList;
import xsna.dbe0;
import xsna.hmd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class byb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ byb(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(Integer.valueOf(((BanDuration) obj).h()));
                return s3q0.a;
            case 1:
                this.c.invoke((hmd0.a) obj);
                return s3q0.a;
            case 2:
                this.c.invoke(new dbe0.j.c((Date) obj));
                return s3q0.a;
            default:
                VideoFile videoFile = (VideoFile) ((Optional) obj).orElse(null);
                return videoFile != null ? io.reactivex.rxjava3.core.q.n((Iterable) this.c.invoke(videoFile), new awi0(new k990(27), 8)) : io.reactivex.rxjava3.core.q.T(EmptyList.b);
        }
    }
}
