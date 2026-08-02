package xsna;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import java.nio.ByteBuffer;
import one.video.player.live.DebugInfo;

/* compiled from: H264Decoder.java */
/* loaded from: classes8.dex */
public class jsu extends c8l {
    public Surface l;
    public int m;
    public int n;
    public final mes0 o;
    public final isu p;

    public jsu(@Nullable DebugInfo debugInfo) {
        super(true, debugInfo);
        this.o = new mes0();
        if (debugInfo != null) {
            this.p = new isu(debugInfo);
        } else {
            this.p = null;
        }
    }

    @Override // xsna.c8l
    public final MediaCodec c() {
        int b;
        byte[] bArr = this.i;
        byte[] bArr2 = fai.b;
        vi90 vi90Var = new vi90(bArr);
        vi90Var.d(40);
        int a = vi90Var.a(8);
        vi90Var.d(16);
        vi90Var.b();
        if (a == 100 || a == 110 || a == 122 || a == 244 || a == 44 || a == 83 || a == 86 || a == 118 || a == 128 || a == 138) {
            b = vi90Var.b();
            if (b == 3) {
                vi90Var.d(1);
            }
            vi90Var.b();
            vi90Var.b();
            vi90Var.d(1);
            if (vi90Var.a(1) == 1) {
                int i = b != 3 ? 8 : 12;
                int i2 = 0;
                while (i2 < i) {
                    if (vi90Var.a(1) == 1) {
                        int i3 = i2 < 6 ? 16 : 64;
                        int i4 = 8;
                        int i5 = 8;
                        for (int i6 = 0; i6 < i3; i6++) {
                            if (i4 != 0) {
                                i4 = ((vi90Var.c() + i5) + 256) % 256;
                            }
                            if (i4 != 0) {
                                i5 = i4;
                            }
                        }
                    }
                    i2++;
                }
            }
        } else {
            b = 1;
        }
        vi90Var.b();
        long b2 = vi90Var.b();
        if (b2 == 0) {
            vi90Var.b();
        } else if (b2 == 1) {
            vi90Var.d(1);
            vi90Var.c();
            vi90Var.c();
            long b3 = vi90Var.b();
            for (int i7 = 0; i7 < b3; i7++) {
                vi90Var.b();
            }
        }
        vi90Var.b();
        vi90Var.d(1);
        int b4 = vi90Var.b() + 1;
        int b5 = vi90Var.b() + 1;
        int i8 = vi90Var.a(1) == 1 ? 1 : 0;
        int i9 = 2 - i8;
        int i10 = b5 * i9;
        if (i8 == 0) {
            vi90Var.d(1);
        }
        vi90Var.d(1);
        int i11 = b4 * 16;
        int i12 = i10 * 16;
        if (vi90Var.a(1) == 1) {
            int b6 = vi90Var.b();
            int b7 = vi90Var.b();
            int b8 = vi90Var.b();
            int b9 = vi90Var.b();
            if (b != 0) {
                int i13 = b == 3 ? 1 : 2;
                i9 *= b == 1 ? 2 : 1;
                r8 = i13;
            }
            i11 = uf3.a(b6, b7, r8, i11);
            i12 = uf3.a(b8, b9, i9, i12);
        }
        this.m = i11;
        this.n = i12;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i11, i12);
        createVideoFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        createVideoFormat.setByteBuffer("csd-0", fai.l(wrap, 7));
        wrap.rewind();
        createVideoFormat.setByteBuffer("csd-1", fai.l(wrap, 8));
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType("video/avc");
            String name = createDecoderByType.getName();
            Integer.toString(Math.min(i11, i12));
            Integer b10 = this.o.b(name, i11 * i12);
            if (b10 != null) {
                createVideoFormat.setInteger("max-input-size", b10.intValue());
            }
            createDecoderByType.setOnFrameRenderedListener(this.p, null);
            createDecoderByType.configure(createVideoFormat, this.l, (MediaCrypto) null, 0);
            return createDecoderByType;
        } catch (IOException e) {
            Log.e("H264Decoder", e.getMessage(), e);
            DebugInfo debugInfo = this.k;
            if (debugInfo != null) {
                debugInfo.i.incrementAndGet();
            }
            return null;
        }
    }
}
