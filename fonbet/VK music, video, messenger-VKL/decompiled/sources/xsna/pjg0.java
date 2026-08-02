package xsna;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.common.collect.ImmutableList;

/* compiled from: RgbMatrix.java */
/* loaded from: classes12.dex */
public interface pjg0 extends c0u {
    float[] b();

    @Override // xsna.c0u
    default mml a(Context context, boolean z) throws VideoFrameProcessingException {
        ImmutableList.b bVar = ImmutableList.c;
        return mml.j(context, com.google.common.collect.g.f, ImmutableList.p(this), z);
    }
}
