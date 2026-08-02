package xsna;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.common.collect.ImmutableList;

/* compiled from: GlMatrixTransformation.java */
/* loaded from: classes12.dex */
public interface j0u extends c0u {
    float[] c(long j);

    default int d() {
        return 9729;
    }

    default jxj0 e(int i, int i2) {
        return new jxj0(i, i2);
    }

    @Override // xsna.c0u
    default mml a(Context context, boolean z) throws VideoFrameProcessingException {
        return mml.j(context, ImmutableList.p(this), com.google.common.collect.g.f, z);
    }
}
