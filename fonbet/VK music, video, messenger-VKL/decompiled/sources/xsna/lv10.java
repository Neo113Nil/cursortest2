package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.os.Trace;
import com.vk.media.pipeline.audio.AudioPcm;
import com.vk.media.pipeline.codec.CodecFeeder;
import com.vk.media.pipeline.session.transform.task.transcode.WrongPipelineStateException;
import com.vk.media.pipeline.utils.exception.ReleaseAlertTranscodeException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.v6e0;

/* compiled from: MediaProcessor.kt */
/* loaded from: classes3.dex */
public final class lv10 {
    public final csp a;
    public final ju4 b;
    public final ncl c;
    public final fj50 d;
    public final foo e;
    public final a f;
    public final ArrayList<gjp0> g;
    public gjp0 h;

    /* compiled from: MediaProcessor.kt */
    public static final class a {
        public final foo a;
        public final ejp0 b;
        public float c;
        public long d;
        public long e;
        public long f;

        public a(foo fooVar, ejp0 ejp0Var) {
            this.a = fooVar;
            this.b = ejp0Var;
        }

        public final void a(gjp0 gjp0Var) {
            this.d += this.e;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
            boolean z = gjp0Var instanceof jz4;
            ejp0 ejp0Var = this.b;
            if (z || (gjp0Var instanceof dtj)) {
                ejp0Var.e = elapsedRealtime;
            } else if ((gjp0Var instanceof plt0) || (gjp0Var instanceof htj)) {
                ejp0Var.d = elapsedRealtime;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kotlin.Lazy] */
    public lv10(csp cspVar, ju4 ju4Var, ncl nclVar, djp0 djp0Var, s98 s98Var, nfq nfqVar, jkp0 jkp0Var) {
        gjp0 dtjVar;
        in4 in4Var;
        long j;
        AudioPcm.EncodingType encodingType;
        this.a = cspVar;
        this.b = ju4Var;
        this.c = nclVar;
        this.d = new fj50(djp0Var.a, cspVar.d);
        Iterator<T> it = s98Var.a.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((c7s0) it.next()).getLayout().d();
        }
        foo fooVar = new foo(jkp0Var, j2);
        this.e = fooVar;
        a aVar = new a(fooVar, (ejp0) this.b.a);
        this.f = aVar;
        f100 f100Var = this.a.d;
        if (f100Var != null) {
            f100Var.d("MediaProcessor", "create media processor");
        }
        ArrayList<gjp0> arrayList = new ArrayList<>(1);
        this.g = arrayList;
        fj50 fj50Var = this.d;
        csp cspVar2 = this.a;
        f100 f100Var2 = cspVar2.d;
        e020 e020Var = new e020(fj50Var, aVar, f100Var2);
        ncl nclVar2 = this.c;
        v6e0 v6e0Var = djp0Var.b;
        boolean z = v6e0Var instanceof v6e0.a;
        rfp0 rfp0Var = new rfp0(s98Var, nclVar2, z ? (v6e0.a) v6e0Var : null, new f020(e020Var, f100Var2), e020Var);
        arrayList.add(z ? new plt0(cspVar2, rfp0Var, nfqVar.b, this.b) : new htj(cspVar2, rfp0Var));
        v6e0 v6e0Var2 = djp0Var.c;
        if (v6e0Var2 != null) {
            fj50 fj50Var2 = this.d;
            csp cspVar3 = this.a;
            f100 f100Var3 = cspVar3.d;
            e020 e020Var2 = new e020(fj50Var2, aVar, f100Var3);
            ncl nclVar3 = this.c;
            boolean z2 = v6e0Var2 instanceof v6e0.a;
            rfp0 rfp0Var2 = new rfp0(s98Var, nclVar3, z2 ? (v6e0.a) v6e0Var2 : null, new f020(e020Var2, f100Var3), e020Var2);
            if (z2) {
                v6e0.a aVar2 = (v6e0.a) v6e0Var2;
                long currentTimeMillis = System.currentTimeMillis();
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                in4 e = nclVar3.e(aVar2.a, aVar2.b);
                final kfp0 kfp0Var = new kfp0(cspVar3, e, "MediaProcessor");
                ?? r14 = kfp0Var.e;
                kfp0Var.d = new kv10(ref$ObjectRef);
                try {
                    kfp0Var.a();
                    if (ref$ObjectRef.element == 0) {
                        int intValue = ((gr10) r14.getValue()).o.intValue();
                        in4Var = e;
                        try {
                            int intValue2 = ((gr10) r14.getValue()).p.intValue();
                            Integer num = (Integer) ((gr10) r14.getValue()).r.getValue();
                            j = currentTimeMillis;
                            if (num != null && num.intValue() == 4) {
                                encodingType = AudioPcm.EncodingType.PCM_FLOAT;
                                final AudioPcm audioPcm = new AudioPcm(intValue, intValue2, encodingType);
                                kfp0Var.f.a(ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder()), new MediaCodec.BufferInfo(), new zzs() { // from class: xsna.jv10
                                    @Override // xsna.zzs
                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                        CodecFeeder codecFeeder = (CodecFeeder) obj;
                                        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj3;
                                        ByteBuffer a2 = codecFeeder.e.a();
                                        bufferInfo.offset = a2.position();
                                        int remaining = a2.remaining();
                                        bufferInfo.size = remaining;
                                        a2.put(new byte[remaining]);
                                        codecFeeder.c(bufferInfo);
                                        bufferInfo.presentationTimeUs = AudioPcm.this.b(bufferInfo.size) + bufferInfo.presentationTimeUs;
                                        kfp0Var.a();
                                        return ref$ObjectRef.element != 0 ? CodecFeeder.FeedStatus.STOP : CodecFeeder.FeedStatus.CONTINUE;
                                    }
                                }, new f0z(kfp0Var, 6));
                            }
                            encodingType = AudioPcm.EncodingType.PCM_16BIT;
                            final AudioPcm audioPcm2 = new AudioPcm(intValue, intValue2, encodingType);
                            kfp0Var.f.a(ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder()), new MediaCodec.BufferInfo(), new zzs() { // from class: xsna.jv10
                                @Override // xsna.zzs
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    CodecFeeder codecFeeder = (CodecFeeder) obj;
                                    MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj3;
                                    ByteBuffer a2 = codecFeeder.e.a();
                                    bufferInfo.offset = a2.position();
                                    int remaining = a2.remaining();
                                    bufferInfo.size = remaining;
                                    a2.put(new byte[remaining]);
                                    codecFeeder.c(bufferInfo);
                                    bufferInfo.presentationTimeUs = AudioPcm.this.b(bufferInfo.size) + bufferInfo.presentationTimeUs;
                                    kfp0Var.a();
                                    return ref$ObjectRef.element != 0 ? CodecFeeder.FeedStatus.STOP : CodecFeeder.FeedStatus.CONTINUE;
                                }
                            }, new f0z(kfp0Var, 6));
                        } catch (Throwable th) {
                            th = th;
                            in4Var.c();
                            throw th;
                        }
                    } else {
                        in4Var = e;
                        j = currentTimeMillis;
                    }
                    cspVar3.a("Obtaining audio encoder output format was canceled");
                    long currentTimeMillis2 = System.currentTimeMillis() - j;
                    f100 f100Var4 = cspVar3.d;
                    if (f100Var4 != null) {
                        f100Var4.v("MediaProcessor", "Obtaining audio encoder output format took " + currentTimeMillis2 + " ms");
                    }
                    MediaFormat mediaFormat = (MediaFormat) ref$ObjectRef.element;
                    in4Var.c();
                    e020Var2.c(mediaFormat);
                    dtjVar = new jz4(this.a, rfp0Var2, nfqVar.a);
                } catch (Throwable th2) {
                    th = th2;
                    in4Var = e;
                }
            } else {
                if (!(v6e0Var2 instanceof v6e0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                e020Var2.c(((v6e0.b) v6e0Var2).a);
                dtjVar = new dtj(this.a, rfp0Var2);
            }
            arrayList.add(dtjVar);
        }
        aVar.c = 1.0f / arrayList.size();
    }

    public final gjp0 a() {
        MediaFormat mediaFormat;
        Integer num;
        gjp0 gjp0Var = this.h;
        if (gjp0Var != null && gjp0Var.a()) {
            return gjp0Var;
        }
        this.h = null;
        a aVar = this.f;
        csp cspVar = this.a;
        if (gjp0Var != null) {
            f100 f100Var = cspVar.d;
            if (f100Var != null) {
                f100Var.v("MediaProcessor", "remove current media handler=".concat(gjp0Var.c));
            }
            gjp0Var.b();
            aVar.a(gjp0Var);
        }
        while (true) {
            ArrayList<gjp0> arrayList = this.g;
            if (arrayList.isEmpty()) {
                break;
            }
            gjp0 remove = arrayList.remove(0);
            boolean a2 = remove.a();
            String str = remove.c;
            if (a2) {
                long j = 0;
                aVar.e = 0L;
                aVar.f = SystemClock.elapsedRealtime();
                this.h = remove;
                f100 f100Var2 = remove.b;
                if (f100Var2 != null) {
                    f100Var2.i(str, "started processing");
                }
                remove.d = System.currentTimeMillis();
                rfp0 rfp0Var = remove.a;
                v6e0.a aVar2 = rfp0Var.c;
                if (aVar2 != null && (mediaFormat = aVar2.b) != null) {
                    f020 f020Var = rfp0Var.d;
                    gr10 gr10Var = new gr10(mediaFormat);
                    boolean z = gr10Var.d;
                    boolean z2 = gr10Var.c;
                    if (z) {
                        Long a3 = gr10Var.a();
                        if (a3 != null) {
                            j = a3.longValue();
                        }
                    } else {
                        if (!z2) {
                            throw new IllegalStateException("Unsupported format=" + mediaFormat);
                        }
                        Long h = gr10Var.h();
                        if (h != null) {
                            j = h.longValue();
                        }
                    }
                    f020Var.d = j;
                    int i = Integer.MIN_VALUE;
                    if (z2 && (num = gr10Var.k) != null) {
                        i = num.intValue();
                    }
                    f020Var.j = i;
                    f100 f100Var3 = f020Var.b;
                    if (f100Var3 != null) {
                        f100Var3.v("MediaTrackTimeline", "frame duration=" + f020Var.d + ", format=" + mediaFormat);
                    }
                }
            } else {
                f100 f100Var4 = cspVar.d;
                if (f100Var4 != null) {
                    f100Var4.w("MediaProcessor", "found dummy media handler=".concat(str));
                }
                remove.b();
            }
        }
        f100 f100Var5 = cspVar.d;
        if (f100Var5 != null) {
            StringBuilder sb = new StringBuilder("the next media handler=");
            gjp0 gjp0Var2 = this.h;
            sb.append(gjp0Var2 != null ? gjp0Var2.c : null);
            f100Var5.v("MediaProcessor", sb.toString());
        }
        return this.h;
    }

    public final void b() {
        f100 f100Var;
        csp cspVar = this.a;
        f100 f100Var2 = cspVar.d;
        if (f100Var2 != null) {
            f100Var2.v("MediaProcessor", "release media processor");
        }
        if (this.h != null && (f100Var = cspVar.d) != null) {
            StringBuilder sb = new StringBuilder("Unexpected active media track handler=");
            gjp0 gjp0Var = this.h;
            sb.append(gjp0Var != null ? gjp0Var.c : null);
            f100Var.c("MediaProcessor", new WrongPipelineStateException(sb.toString()));
        }
        ArrayList<gjp0> arrayList = this.g;
        Iterator<gjp0> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        arrayList.clear();
        fj50 fj50Var = this.d;
        f100 f100Var3 = fj50Var.a;
        try {
            fj50Var.a();
        } catch (Throwable th) {
            if (f100Var3 != null) {
                f100Var3.e("Muxer", "seems stop was not called", th);
            }
        }
        try {
            Trace.beginSection("mediaMuxer.release");
            fj50Var.b.release();
            Trace.endSection();
        } catch (Throwable th2) {
            if (f100Var3 != null) {
                f100Var3.e("Muxer", "failed to release media muxer", th2);
            }
        }
        fj50Var.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (r9.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:7:0x0016, B:10:0x001e, B:15:0x0030, B:17:0x003e, B:19:0x0048, B:21:0x004e, B:23:0x0055, B:25:0x0059, B:31:0x006a, B:32:0x0071, B:34:0x0060, B:37:0x0072, B:38:0x0079, B:65:0x0025), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Object[] objArr;
        ReleaseAlertTranscodeException releaseAlertTranscodeException;
        fj50 fj50Var;
        a aVar = this.f;
        long currentTimeMillis = System.currentTimeMillis();
        csp cspVar = this.a;
        f100 f100Var = cspVar.d;
        f100 f100Var2 = cspVar.d;
        if (f100Var != null) {
            f100Var.d("MediaProcessor", "start media processing");
        }
        while (true) {
            gjp0 gjp0Var = null;
            releaseAlertTranscodeException = null;
            try {
                gjp0 gjp0Var2 = this.h;
                boolean z = false;
                ArrayList<gjp0> arrayList = this.g;
                if ((gjp0Var2 == null || !gjp0Var2.a()) && arrayList.isEmpty()) {
                    objArr = false;
                    if (objArr != false && !((Boolean) cspVar.c.get()).booleanValue()) {
                        if (!Thread.currentThread().isInterrupted()) {
                            throw new InterruptedException("MediaProcessor processing was interrupted");
                        }
                        gjp0 a2 = a();
                        if (a2 != null) {
                            a2.c();
                        } else {
                            gjp0 gjp0Var3 = this.h;
                            if (gjp0Var3 != null) {
                                if (gjp0Var3.a()) {
                                    z = true;
                                    if (z) {
                                        throw new IllegalStateException("MediaProcessor hasData");
                                    }
                                }
                            }
                        }
                    }
                }
                objArr = true;
                if (objArr != false) {
                    if (!Thread.currentThread().isInterrupted()) {
                    }
                }
            } finally {
                try {
                    gjp0 gjp0Var4 = this.h;
                    if (gjp0Var4 != null) {
                        gjp0Var4.b();
                        aVar.a(gjp0Var4);
                    }
                    this.h = null;
                } catch (Throwable th) {
                    new ReleaseAlertTranscodeException(th);
                }
            }
        }
        try {
            fj50Var = this.d;
        } catch (Throwable th2) {
            if (releaseAlertTranscodeException != null && f100Var2 != null) {
                f100Var2.c("MediaProcessor", new ReleaseAlertTranscodeException(th2));
            }
        }
        if (!fj50Var.e) {
            throw new IllegalStateException("Media muxer was not started!");
        }
        fj50Var.a();
        if (releaseAlertTranscodeException != null) {
            throw releaseAlertTranscodeException;
        }
        this.e.b.a(100, Long.MIN_VALUE);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (f100Var2 != null) {
            f100Var2.d("MediaProcessor", qlb0.a(currentTimeMillis2, "media processing took ", " ms"));
        }
    }
}
