package xsna;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class lq10 implements Comparator {
    public final /* synthetic */ MediaCodecUtil.c b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MediaCodecUtil.c cVar = this.b;
        return cVar.a(obj2) - cVar.a(obj);
    }
}
