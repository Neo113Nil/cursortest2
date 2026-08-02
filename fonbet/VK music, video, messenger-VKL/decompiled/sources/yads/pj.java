package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;

/* loaded from: classes10.dex */
public final class pj implements cl1 {
    public final c63 a;
    public final c63 b;

    public pj(final int i) {
        this(new c63() { // from class: xsna.h9z0
            @Override // yads.c63
            public final Object get() {
                return yads.pj.a(i);
            }
        }, new c63() { // from class: xsna.i9z0
            @Override // yads.c63
            public final Object get() {
                return yads.pj.b(i);
            }
        });
    }

    @Override // yads.cl1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qj a(bl1 bl1Var) {
        MediaCodec mediaCodec;
        qj qjVar;
        String str = bl1Var.a.a;
        qj qjVar2 = null;
        try {
            h83.a("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                qjVar = new qj(mediaCodec, (HandlerThread) this.a.get(), (HandlerThread) this.b.get(), false);
            } catch (Exception e) {
                e = e;
            }
            try {
                h83.a();
                qjVar.a(bl1Var.b, bl1Var.d, bl1Var.e);
                return qjVar;
            } catch (Exception e2) {
                e = e2;
                qjVar2 = qjVar;
                if (qjVar2 != null) {
                    qjVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    public pj(c63 c63Var, c63 c63Var2) {
        this.a = c63Var;
        this.b = c63Var2;
    }

    public static HandlerThread a(int i) {
        StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return new HandlerThread(sb.toString());
    }

    public static HandlerThread b(int i) {
        StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return new HandlerThread(sb.toString());
    }
}
