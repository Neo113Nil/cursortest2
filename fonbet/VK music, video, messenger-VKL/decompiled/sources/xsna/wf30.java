package xsna;

import androidx.media3.muxer.MuxerException;
import com.google.common.collect.ImmutableList;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import xsna.fi20;

/* compiled from: Mp4Muxer.java */
/* loaded from: classes12.dex */
public final class wf30 implements dj50 {
    public static final com.google.common.collect.g h;
    public static final com.google.common.collect.g i;
    public final o9r b;
    public final ki20 c;
    public final cg30 d;
    public final ArrayList e;
    public final ArrayList f;
    public int g;

    static {
        ImmutableList.b bVar = ImmutableList.c;
        Object[] objArr = {MimeTypes.VIDEO_AV1, com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H263, "video/avc", "video/hevc", com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V, com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9, "video/apv", "video/dolby-vision"};
        ne7.l(objArr);
        h = ImmutableList.l(8, objArr);
        i = ImmutableList.t("audio/mp4a-latm", com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AMR_NB, com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AMR_WB, com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS, com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS, com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_RAW);
    }

    public wf30(o9r o9rVar) {
        this.b = o9rVar;
        ki20 ki20Var = new ki20();
        this.c = ki20Var;
        this.d = new cg30(o9rVar, ki20Var);
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    @Override // xsna.dj50
    public final int N0(androidx.media3.common.a aVar) throws MuxerException {
        int i2 = this.g;
        this.g = i2 + 1;
        cg30 cg30Var = this.d;
        cg30Var.getClass();
        tep0 tep0Var = new tep0(i2, aVar);
        ArrayList arrayList = cg30Var.c;
        arrayList.add(tep0Var);
        Collections.sort(arrayList, new rhq(1));
        this.e.add(tep0Var);
        return i2;
    }

    @Override // xsna.dj50
    public final void X1(fi20.a aVar) {
        fxc0.q(hj50.a(aVar), "Unsupported metadata");
        this.c.a(aVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        MuxerException muxerException;
        try {
            byte[] bArr = new byte[8];
            for (int i2 = 7; i2 >= 0; i2--) {
                bArr[i2] = (byte) 0;
            }
            fxc0.p(bArr.length == 8);
            this.d.b();
            muxerException = null;
        } catch (IOException e) {
            muxerException = new MuxerException("Failed to finish writing data", e);
        }
        try {
            this.b.close();
        } catch (IOException e2) {
            if (muxerException == null) {
                muxerException = new MuxerException("Failed to close output stream", e2);
            } else {
                ahn.o("Mp4Muxer", "Failed to close output stream", e2);
            }
        }
        if (muxerException != null) {
            throw muxerException;
        }
    }

    @Override // xsna.dj50
    public final void f(int i2, ByteBuffer byteBuffer, dm8 dm8Var) throws MuxerException {
        ArrayList arrayList = this.e;
        fxc0.q(i2 < arrayList.size(), "Track id is invalid");
        byteBuffer.getClass();
        int i3 = dm8Var.b;
        fxc0.p(byteBuffer.remaining() == i3);
        tep0 tep0Var = (tep0) arrayList.get(i2);
        try {
            if (this.f.contains(tep0Var)) {
                throw null;
            }
            this.d.h(tep0Var, byteBuffer, dm8Var);
        } catch (IOException e) {
            throw new MuxerException("Failed to write sample for presentationTimeUs=" + dm8Var.a + ", size=" + i3, e);
        }
    }
}
