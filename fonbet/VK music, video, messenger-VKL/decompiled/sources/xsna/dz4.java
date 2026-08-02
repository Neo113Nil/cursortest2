package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.PipelineException;
import com.vk.media.pipeline.audio.AudioPcm;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.media.pipeline.codec.CodecFeeder;
import com.vk.media.pipeline.model.effect.AudioEffect;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.audioeffects.AudioEffects;
import xsna.qy4;

/* compiled from: AudioTrackDecoder.kt */
/* loaded from: classes3.dex */
public final class dz4 {
    public final n3q0 a;
    public final f8l<qm4> b;
    public final SparseArray<kz4> c;
    public final j8l<qm4> d;
    public final j630 e;
    public final a f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final HashMap<Integer, yx4> h;
    public final tz4 i;

    /* compiled from: AudioTrackDecoder.kt */
    public interface a {
        void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
    }

    /* compiled from: AudioTrackDecoder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodedSampleStatus.values().length];
            try {
                iArr[DecodedSampleStatus.RENDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecodedSampleStatus.CONSUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecodedSampleStatus.END_OF_STREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DecodedSampleStatus.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DecodedSampleStatus.END_OF_MEDIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AudioTrackDecoder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements yzs<CodecDrainer<qm4>, ByteBuffer, MediaCodec.BufferInfo, CodecDrainer.DrainStatus> {
        @Override // xsna.yzs
        public final CodecDrainer.DrainStatus invoke(CodecDrainer<qm4> codecDrainer, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            CodecDrainer<qm4> codecDrainer2 = codecDrainer;
            ByteBuffer byteBuffer2 = byteBuffer;
            MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
            dz4 dz4Var = (dz4) this.receiver;
            dz4Var.getClass();
            try {
                DecodedSampleStatus c = dz4Var.c(codecDrainer2, byteBuffer2, bufferInfo2);
                CodecDrainer.c(codecDrainer2, null, 3);
                return (codecDrainer2.b() || c == DecodedSampleStatus.CONSUMED) ? CodecDrainer.DrainStatus.STOP : CodecDrainer.DrainStatus.CONTINUE;
            } catch (Throwable th) {
                CodecDrainer.c(codecDrainer2, null, 3);
                throw th;
            }
        }
    }

    /* compiled from: AudioTrackDecoder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<CodecDrainer<qm4>, MediaFormat, CodecDrainer.DrainStatus> {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.wzs
        public final CodecDrainer.DrainStatus invoke(CodecDrainer<qm4> codecDrainer, MediaFormat mediaFormat) {
            AudioEffect audioEffect;
            float[] fArr;
            CodecDrainer<qm4> codecDrainer2 = codecDrainer;
            MediaFormat mediaFormat2 = mediaFormat;
            dz4 dz4Var = (dz4) this.receiver;
            f100 f100Var = dz4Var.a.c;
            if (f100Var != null) {
                f100Var.v("AudioTrackDecoder", "obtained audio decoder output format=" + mediaFormat2);
            }
            gr10 gr10Var = new gr10(mediaFormat2);
            int intValue = gr10Var.o.intValue();
            int intValue2 = gr10Var.p.intValue();
            Integer num = (Integer) gr10Var.r.getValue();
            AudioPcm audioPcm = new AudioPcm(intValue, intValue2, (num != null && num.intValue() == 4) ? AudioPcm.EncodingType.PCM_FLOAT : AudioPcm.EncodingType.PCM_16BIT);
            LinkedHashMap linkedHashMap = dz4Var.g;
            int i = codecDrainer2.a;
            qm4 qm4Var = codecDrainer2.b;
            xx4 xx4Var = (xx4) linkedHashMap.get(Integer.valueOf(i));
            if (xx4Var == null) {
                if (f100Var != null) {
                    f100Var.e("AudioTrackDecoder", "Failed to get source for sourceId: " + i);
                }
                throw new PipelineException(lhg.a(i, "Can't get source for sourceId: "));
            }
            kz4 kz4Var = dz4Var.c.get(i);
            if (kz4Var == null) {
                if (f100Var != null) {
                    f100Var.e("AudioTrackDecoder", "Failed to get info for sourceId: " + i);
                }
                throw new PipelineException(lhg.a(i, "Can't get info for sourceId: "));
            }
            if (kz4Var.e == AudioEffect.DEFAULT && qm4Var.d.equals("c2.android.aac.decoder")) {
                xx4Var.a(audioPcm);
            }
            bz4 a = dz4Var.i.a(i);
            n3q0 n3q0Var = a.c;
            AudioPcm audioPcm2 = n3q0Var.a;
            kz4 kz4Var2 = a.b;
            a.g = new iz4(audioPcm, kz4Var2.c, kz4Var2.d, audioPcm2);
            d80 d80Var = n3q0Var.b;
            if (d80Var != null) {
                int i2 = a.a;
                int i3 = audioPcm2.b;
                int i4 = audioPcm2.a;
                gn4 gn4Var = (gn4) ((SparseArray) d80Var.b).get(i2);
                if (gn4Var != null && (audioEffect = gn4Var.d) != AudioEffect.DEFAULT) {
                    String name = audioEffect.name();
                    int i5 = 7;
                    switch (name.hashCode()) {
                        case 1142617:
                            if (name.equals("SQUIRREL")) {
                                fArr = new float[]{1.46f, 16.0f, 4.0f};
                                i5 = 1;
                                break;
                            }
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                        case 2122277:
                            if (name.equals("ECHO")) {
                                fArr = new float[]{490.0f, -60.0f, 2540.0f, 1.0f};
                                i5 = 5;
                                break;
                            }
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                            break;
                        case 2140564:
                            if (name.equals("EVIL")) {
                                fArr = new float[]{40.0f, -57.0f, 16000.0f, 0.5f};
                                break;
                            }
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                            break;
                        case 2209849:
                            if (name.equals("HALL")) {
                                fArr = new float[]{150.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.3f, 0.5f};
                                i5 = 2;
                                break;
                            }
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                            break;
                        case 67809701:
                            if (name.equals("GIANT")) {
                                fArr = new float[]{0.68f, 16.0f, 4.0f};
                                i5 = 1;
                                break;
                            }
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                        case 78148170:
                            if (name.equals("ROBOT")) {
                                fArr = new float[]{15.0f, -48.0f, 16000.0f, 0.5f};
                                i5 = 5;
                                break;
                            }
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                            break;
                        case 141183724:
                            if (name.equals("CATHEDRAL")) {
                                fArr = new float[]{150.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.9f, 0.5f, 1.0f, 0.7f, 1.0f, 0.5f};
                                i5 = 2;
                                break;
                            }
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                            break;
                        case 379125775:
                            if (name.equals("BALLOON")) {
                                fArr = new float[]{1.87f, 16.0f, 4.0f};
                                i5 = 1;
                                break;
                            }
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                        default:
                            fArr = new float[]{1.0f, 32.0f, 4.0f};
                            i5 = 1;
                            break;
                    }
                    AudioEffects audioEffects = (AudioEffects) gn4Var.a.getValue();
                    audioEffects.setChannels(i3);
                    audioEffects.setSampleRate(i4);
                    audioEffects.addEffect(i5, fArr, true);
                }
            }
            dz4Var.d.c(qm4Var);
            return CodecDrainer.DrainStatus.CONTINUE;
        }
    }

    /* compiled from: AudioTrackDecoder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<CodecDrainer<qm4>, CodecDrainer.DrainStatus> {
        @Override // xsna.izs
        public final CodecDrainer.DrainStatus invoke(CodecDrainer<qm4> codecDrainer) {
            CodecDrainer<qm4> codecDrainer2 = codecDrainer;
            dz4 dz4Var = (dz4) this.receiver;
            dz4Var.getClass();
            if (!codecDrainer2.b()) {
                f8l<D>.a<qm4> aVar = dz4Var.b.e.get(codecDrainer2.a);
                if ((aVar != null ? aVar.b : null).e.a.e) {
                    f100 f100Var = dz4Var.a.c;
                    if (f100Var != null) {
                        f100Var.v("AudioTrackDecoder", "spinning to await audio decoder EOS...");
                    }
                    return CodecDrainer.DrainStatus.CONTINUE;
                }
            }
            return CodecDrainer.DrainStatus.STOP;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dz4(n3q0 n3q0Var, f8l<qm4> f8lVar, SparseArray<kz4> sparseArray, j8l<? super qm4> j8lVar, j630 j630Var, a aVar) {
        this.a = n3q0Var;
        this.b = f8lVar;
        this.c = sparseArray;
        this.d = j8lVar;
        this.e = j630Var;
        this.f = aVar;
        this.h = j630Var != null ? new HashMap<>() : null;
        this.i = new tz4(sparseArray, n3q0Var);
    }

    public final void a(CodecDrainer<qm4> codecDrainer) {
        c cVar = new c(3, this, dz4.class, "onDecoderOutputBuffer", "onDecoderOutputBuffer(Lcom/vk/media/pipeline/codec/CodecDrainer;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0);
        codecDrainer.a(new e(1, this, dz4.class, "onDecoderOutputAbsent", "onDecoderOutputAbsent(Lcom/vk/media/pipeline/codec/CodecDrainer;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0), new d(2, this, dz4.class, "onDecoderOutputFormat", "onDecoderOutputFormat(Lcom/vk/media/pipeline/codec/CodecDrainer;Landroid/media/MediaFormat;)Lcom/vk/media/pipeline/codec/CodecDrainer$DrainStatus;", 0), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.vk.media.pipeline.codec.CodecFeeder<D extends xsna.hzf>] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.vk.media.pipeline.codec.CodecFeeder<D extends xsna.hzf>] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, xsna.n40] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, xsna.dz4] */
    public final void b(List list, qy4[] qy4VarArr) {
        List list2 = list;
        Iterator it = list2.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            f8l<qm4> f8lVar = this.b;
            if (!hasNext) {
                SparseArray<f8l<D>.a<qm4>> sparseArray = f8lVar.e;
                int length = qy4VarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    qy4 qy4Var = qy4VarArr[i2];
                    xx4 xx4Var = (xx4) list2.get(i2);
                    if (!(qy4Var instanceof qy4.a)) {
                        if (qy4Var instanceof qy4.b) {
                            tll tllVar = ((qy4.b) qy4Var).a;
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            int i3 = tllVar.c;
                            long j = tllVar.b;
                            k0h0.a.getClass();
                            bufferInfo.set(0, i3, j, tllVar.f ? 1 : 0);
                            this.g.put(Integer.valueOf(xx4Var.m()), xx4Var);
                            f8l<D>.a<qm4> aVar = sparseArray.get(xx4Var.m());
                            CodecFeeder codecFeeder = aVar != null ? aVar.b : r10;
                            if (codecFeeder == null) {
                                codecFeeder = f8lVar.a(xx4Var).b;
                            }
                            codecFeeder.a(tllVar, bufferInfo, new ez4(4, this, dz4.class, "onDecoderInputBuffer", "onDecoderInputBuffer(Lcom/vk/media/pipeline/codec/CodecFeeder;Lcom/vk/media/pipeline/mediasource/SampleSource$Sample;Landroid/media/MediaCodec$BufferInfo;Ljava/nio/ByteBuffer;)Lcom/vk/media/pipeline/codec/CodecFeeder$FeedStatus;", 0), new wd3(1, this, xx4Var));
                        } else {
                            if (!(qy4Var instanceof qy4.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f8l<D>.a<qm4> aVar2 = sparseArray.get(xx4Var.m());
                            CodecDrainer codecDrainer = aVar2 != null ? aVar2.c : null;
                            if (codecDrainer != null && !codecDrainer.b()) {
                                ?? n40Var = new n40((Object) this, 5);
                                f8l<D>.a<qm4> aVar3 = sparseArray.get(xx4Var.m());
                                if (aVar3 != null) {
                                    CodecDrainer codecDrainer2 = aVar3.c;
                                    if (!codecDrainer2.b()) {
                                        aVar3.b.b(new gb(12, n40Var, aVar3));
                                    }
                                    if (!codecDrainer2.b()) {
                                        n40Var.invoke(codecDrainer2);
                                    }
                                }
                            }
                            int m = xx4Var.m();
                            long j2 = ((qy4.c) qy4Var).a;
                            tz4 tz4Var = this.i;
                            tz4Var.a(m).e += j2;
                            tll c2 = tz4Var.c();
                            if (c2 != null) {
                                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                bufferInfo2.set(0, c2.c, c2.b, c2.d);
                                d(c2.a, bufferInfo2);
                            }
                        }
                    }
                    i2++;
                    list2 = list;
                    r10 = null;
                }
                return;
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            xx4 xx4Var2 = (xx4) next;
            if (qy4VarArr[i] instanceof qy4.b) {
                f8l<D>.a<qm4> aVar4 = f8lVar.e.get(xx4Var2.m());
                r10 = aVar4 != null ? aVar4.c : null;
                if (r10 == null) {
                    r10 = f8lVar.a(xx4Var2).c;
                }
                a(r10);
            }
            i = i4;
        }
    }

    public final DecodedSampleStatus c(CodecDrainer<qm4> codecDrainer, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        tll tllVar;
        HashMap<Integer, Integer> hashMap;
        f100 f100Var;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3 = null;
        if (bufferInfo.size == 0 || (bufferInfo.flags & 4) != 0) {
            tllVar = null;
        } else {
            int i = codecDrainer.a;
            xx4 xx4Var = (xx4) this.g.get(Integer.valueOf(i));
            if (xx4Var == null) {
                f100 f100Var2 = this.a.c;
                if (f100Var2 != null) {
                    f100Var2.e("AudioTrackDecoder", "Failed to get source for sourceId: " + i);
                }
            } else {
                HashMap<Integer, yx4> hashMap2 = this.h;
                if (hashMap2 != null) {
                    int i2 = bufferInfo.size;
                    Integer valueOf = Integer.valueOf(i);
                    yx4 yx4Var = hashMap2.get(valueOf);
                    if (yx4Var == null) {
                        int m = xx4Var.m();
                        MediaFormat format = xx4Var.getFormat();
                        yx4Var = new yx4(m, format != null ? format.getString("mime") : null, xx4Var.c(), xx4Var.h());
                        hashMap2.put(valueOf, yx4Var);
                    }
                    HashMap<Integer, Integer> hashMap3 = yx4Var.e;
                    Integer valueOf2 = Integer.valueOf(i2);
                    Integer num = hashMap3.get(valueOf2);
                    if (num == null) {
                        num = 0;
                        hashMap3.put(valueOf2, num);
                    }
                    int intValue = num.intValue();
                    yx4 yx4Var2 = hashMap2.get(Integer.valueOf(i));
                    if (yx4Var2 != null && (hashMap = yx4Var2.e) != null) {
                        hashMap.put(Integer.valueOf(i2), Integer.valueOf(intValue + 1));
                    }
                }
            }
            int i3 = codecDrainer.a;
            long j = bufferInfo.presentationTimeUs;
            tz4 tz4Var = this.i;
            bz4 a2 = tz4Var.a(i3);
            n3q0 n3q0Var = a2.c;
            if (byteBuffer.remaining() != 0) {
                iz4 iz4Var = a2.g;
                if (iz4Var != null) {
                    ArrayList<qt4> arrayList = iz4Var.a;
                    if (arrayList.isEmpty()) {
                        byteBuffer2 = byteBuffer;
                    } else {
                        Iterator<qt4> it = arrayList.iterator();
                        byteBuffer2 = byteBuffer;
                        while (it.hasNext()) {
                            qt4 next = it.next();
                            next.queueInput(byteBuffer2);
                            byteBuffer2 = next.getOutput();
                        }
                    }
                    if (byteBuffer2 != null) {
                        byteBuffer = byteBuffer2;
                    }
                }
                d80 d80Var = n3q0Var.b;
                AudioPcm audioPcm = n3q0Var.a;
                if (d80Var != null) {
                    gn4 gn4Var = (gn4) ((SparseArray) d80Var.b).get(a2.a);
                    if (gn4Var != null) {
                        bpn0 bpn0Var = gn4Var.a;
                        if (bpn0Var.isInitialized()) {
                            int remaining = byteBuffer.remaining();
                            int position = byteBuffer.position();
                            if (remaining > gn4Var.b.length) {
                                byte[] bArr = new byte[remaining];
                                gn4Var.b = bArr;
                                gn4Var.c = ByteBuffer.wrap(bArr);
                            }
                            byteBuffer.get(gn4Var.b, 0, remaining);
                            AudioEffects audioEffects = (AudioEffects) bpn0Var.getValue();
                            audioEffects.putSamples(gn4Var.b, remaining);
                            audioEffects.receiveSamples(gn4Var.b, remaining);
                            byteBuffer.position(position);
                            gn4Var.c.position(0);
                            gn4Var.c.limit(remaining);
                            gn4Var.c.put(gn4Var.b, 0, remaining);
                            gn4Var.c.position(0);
                            byteBuffer = gn4Var.c;
                        }
                    }
                }
                long b2 = audioPcm.b(byteBuffer.remaining());
                kz4 kz4Var = a2.b;
                long j2 = kz4Var.i;
                if (j < j2) {
                    byteBuffer.position(Integer.min(byteBuffer.limit(), byteBuffer.position() + audioPcm.c(j2 - j)));
                } else {
                    long j3 = b2 + j;
                    long j4 = kz4Var.j;
                    if (j3 > j4) {
                        byteBuffer.limit(Math.max(byteBuffer.position(), byteBuffer.limit() - audioPcm.c(j3 - j4)));
                    }
                }
                if (byteBuffer.remaining() == 0 && (f100Var = n3q0Var.c) != null) {
                    StringBuilder sb = new StringBuilder("trimmed whole buffer, might be an error. onlineStartMcs=");
                    sb.append(a2.d);
                    sb.append(", onlineEndMcs=");
                    sb.append(a2.e);
                    f100Var.e("AudioTrackConverter", xy6.a(j, ", pts=", sb));
                }
                a2.e = (audioPcm.f * byteBuffer.remaining()) + a2.e;
                a2.f.a(byteBuffer);
            }
            tllVar = tz4Var.c();
        }
        if (tllVar != null) {
            byteBuffer3 = tllVar.a;
            bufferInfo.offset = byteBuffer3.position();
            bufferInfo.size = tllVar.c;
            bufferInfo.presentationTimeUs = tllVar.b;
        }
        return byteBuffer3 == null ? DecodedSampleStatus.SKIP : d(byteBuffer3, bufferInfo);
    }

    public final DecodedSampleStatus d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        DecodedSampleStatus a2 = this.d.a(bufferInfo);
        f100 f100Var = this.a.c;
        int i = b.$EnumSwitchMapping$0[a2.ordinal()];
        if (i == 1 || i == 2) {
            this.f.a(byteBuffer, bufferInfo);
            return a2;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (f100Var != null) {
                    f100Var.d("AudioTrackDecoder", "audio decoder end of media reached, buffer=" + k3r0.b(bufferInfo));
                    return a2;
                }
            }
        } else if (f100Var != null) {
            f100Var.d("AudioTrackDecoder", "audio decoder EOS reached, buffer=" + k3r0.b(bufferInfo));
        }
        return a2;
    }

    public final void e(boolean z, oz4 oz4Var) {
        HashMap<Integer, yx4> hashMap;
        f8l<qm4> f8lVar = this.b;
        if (!f8lVar.b() && z) {
            f100 f100Var = this.a.c;
            if (f100Var != null) {
                f100Var.d("AudioTrackDecoder", "send EOS to audio track decoders ...");
            }
            f8lVar.e(new l00(this, 4));
        }
        tz4 tz4Var = this.i;
        if (z) {
            do {
                if (oz4Var != null) {
                    oz4Var.invoke();
                }
                tll c2 = tz4Var.c();
                if (c2 != null) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    bufferInfo.set(0, c2.c, c2.b, c2.d);
                    d(c2.a, bufferInfo);
                }
                if (tz4Var.b() <= 0) {
                    break;
                }
            } while (!Thread.currentThread().isInterrupted());
        }
        f8lVar.d();
        SparseArray<bz4> sparseArray = tz4Var.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            bz4 valueAt = sparseArray.valueAt(i);
            d80 d80Var = valueAt.c.b;
            if (d80Var != null) {
                int i2 = valueAt.a;
                SparseArray sparseArray2 = (SparseArray) d80Var.b;
                gn4 gn4Var = (gn4) sparseArray2.get(i2);
                if (gn4Var != null) {
                    bpn0 bpn0Var = gn4Var.a;
                    if (bpn0Var.isInitialized()) {
                        ((AudioEffects) bpn0Var.getValue()).release();
                    }
                }
                sparseArray2.remove(i2);
            }
        }
        sparseArray.clear();
        int i3 = tz4Var.h;
        String valueOf = i3 == 0 ? "INF" : String.valueOf(tz4Var.i / i3);
        f100 f100Var2 = tz4Var.b.c;
        if (f100Var2 != null) {
            f100Var2.i("AudioTracksUnifier", "average unifier's mixing=" + valueOf);
        }
        j630 j630Var = this.e;
        if (j630Var == null || (hashMap = this.h) == null) {
            return;
        }
        ((mwa0) j630Var.c).c.f(hashMap);
    }
}
