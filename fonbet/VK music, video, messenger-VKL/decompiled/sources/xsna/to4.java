package xsna;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.vk.log.L;
import kotlin.Result;

/* compiled from: AudioFormatExtractor.kt */
/* loaded from: classes3.dex */
public final class to4 {
    public final bpn0 a = new bpn0(new o6(1));

    public static void a(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat.containsKey("sample-rate")) {
            mediaFormat2.setInteger("sample-rate", mediaFormat.getInteger("sample-rate"));
        }
        if (mediaFormat.containsKey("channel-count")) {
            mediaFormat2.setInteger("channel-count", mediaFormat.getInteger("channel-count"));
        }
    }

    public static boolean b(MediaCodec mediaCodec, MediaExtractor mediaExtractor) {
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10L);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        int readSampleData = mediaExtractor.readSampleData(mediaCodec.getInputBuffer(dequeueInputBuffer), 0);
        if (readSampleData < 0) {
            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            return true;
        }
        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), (mediaExtractor.getSampleFlags() & 1) != 0 ? 1 : 0);
        mediaExtractor.advance();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d4 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.Result$Failure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MediaFormat c(MediaExtractor mediaExtractor) {
        long j;
        s3q0 s3q0Var;
        MediaExtractor mediaExtractor2;
        Throwable a;
        s3q0 s3q0Var2;
        MediaExtractor mediaExtractor3;
        Throwable a2;
        Object failure;
        Throwable a3;
        MediaFormat outputFormat;
        Object failure2;
        Throwable a4;
        MediaExtractor mediaExtractor4 = mediaExtractor;
        int sampleTrackIndex = mediaExtractor4.getSampleTrackIndex();
        long sampleTime = mediaExtractor4.getSampleTime();
        MediaFormat trackFormat = mediaExtractor4.getTrackFormat(sampleTrackIndex);
        long j2 = 0;
        MediaCodec mediaCodec = null;
        try {
            if (sampleTrackIndex < 0) {
                j = 0;
                try {
                    throw new IllegalStateException("provided extractor with no selected track");
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    if (mediaCodec != null) {
                    }
                    if (mediaCodec != null) {
                    }
                    if (sampleTime >= j) {
                    }
                    mediaExtractor4.unselectTrack(sampleTrackIndex);
                    mediaExtractor4.selectTrack(sampleTrackIndex);
                    mediaExtractor4.seekTo(sampleTime, 0);
                    s3q0Var2 = s3q0.a;
                    mediaExtractor3 = mediaExtractor4;
                    a2 = Result.a(s3q0Var2);
                    mediaExtractor4 = mediaExtractor3;
                    if (a2 != null) {
                    }
                    p490.k(trackFormat);
                    return trackFormat;
                } catch (Throwable th) {
                    th = th;
                    L.l("AudioFormatExtractor", "failed to extract audio format with decoder: " + th);
                    if (mediaCodec != null) {
                    }
                    if (mediaCodec != null) {
                    }
                    if (sampleTime >= j) {
                    }
                    mediaExtractor4.unselectTrack(sampleTrackIndex);
                    mediaExtractor4.selectTrack(sampleTrackIndex);
                    mediaExtractor4.seekTo(sampleTime, 0);
                    s3q0Var = s3q0.a;
                    mediaExtractor2 = mediaExtractor4;
                    a = Result.a(s3q0Var);
                    mediaExtractor4 = mediaExtractor2;
                    if (a != null) {
                    }
                    p490.k(trackFormat);
                    return trackFormat;
                }
            }
            try {
                MediaCodec b = jq10.b((jq10) this.a.getValue(), trackFormat, null, 6);
                b.start();
                try {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    boolean z = false;
                    try {
                        while (!Thread.currentThread().isInterrupted()) {
                            if (!z) {
                                z = b(b, mediaExtractor4);
                            }
                            int dequeueOutputBuffer = b.dequeueOutputBuffer(bufferInfo, j2);
                            j = j2;
                            if (dequeueOutputBuffer == -2) {
                                try {
                                    outputFormat = b.getOutputFormat();
                                } catch (InterruptedException unused2) {
                                    mediaCodec = b;
                                    Thread.currentThread().interrupt();
                                    if (mediaCodec != null) {
                                        try {
                                            mediaCodec.stop();
                                            s3q0 s3q0Var3 = s3q0.a;
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    if (mediaCodec != null) {
                                        try {
                                            mediaCodec.release();
                                            s3q0 s3q0Var4 = s3q0.a;
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    if (sampleTime >= j) {
                                        try {
                                            if (mediaExtractor4.getSampleFlags() < 0) {
                                            }
                                            mediaExtractor4.seekTo(sampleTime, 0);
                                            s3q0Var2 = s3q0.a;
                                            mediaExtractor3 = mediaExtractor4;
                                        } catch (Throwable th2) {
                                            ?? failure3 = new Result.Failure(th2);
                                            s3q0Var2 = failure3;
                                            mediaExtractor3 = failure3;
                                            a2 = Result.a(s3q0Var2);
                                            mediaExtractor4 = mediaExtractor3;
                                            if (a2 != null) {
                                                L.l("AudioFormatExtractor", ms9.b("FAILED to reset extractor to initial state: ", a2));
                                                mediaExtractor4 = mediaExtractor3;
                                            }
                                            p490.k(trackFormat);
                                            return trackFormat;
                                        }
                                        a2 = Result.a(s3q0Var2);
                                        mediaExtractor4 = mediaExtractor3;
                                        if (a2 != null) {
                                        }
                                        p490.k(trackFormat);
                                        return trackFormat;
                                    }
                                    mediaExtractor4.unselectTrack(sampleTrackIndex);
                                    mediaExtractor4.selectTrack(sampleTrackIndex);
                                    mediaExtractor4.seekTo(sampleTime, 0);
                                    s3q0Var2 = s3q0.a;
                                    mediaExtractor3 = mediaExtractor4;
                                    a2 = Result.a(s3q0Var2);
                                    mediaExtractor4 = mediaExtractor3;
                                    if (a2 != null) {
                                    }
                                    p490.k(trackFormat);
                                    return trackFormat;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mediaCodec = b;
                                    L.l("AudioFormatExtractor", "failed to extract audio format with decoder: " + th);
                                    if (mediaCodec != null) {
                                        try {
                                            mediaCodec.stop();
                                            s3q0 s3q0Var5 = s3q0.a;
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    if (mediaCodec != null) {
                                        try {
                                            mediaCodec.release();
                                            s3q0 s3q0Var6 = s3q0.a;
                                        } catch (Throwable unused6) {
                                        }
                                    }
                                    if (sampleTime >= j) {
                                        try {
                                            if (mediaExtractor4.getSampleFlags() < 0) {
                                            }
                                            mediaExtractor4.seekTo(sampleTime, 0);
                                            s3q0Var = s3q0.a;
                                            mediaExtractor2 = mediaExtractor4;
                                        } catch (Throwable th4) {
                                            ?? failure4 = new Result.Failure(th4);
                                            s3q0Var = failure4;
                                            mediaExtractor2 = failure4;
                                            a = Result.a(s3q0Var);
                                            mediaExtractor4 = mediaExtractor2;
                                            if (a != null) {
                                                L.l("AudioFormatExtractor", ms9.b("FAILED to reset extractor to initial state: ", a));
                                                mediaExtractor4 = mediaExtractor2;
                                            }
                                            p490.k(trackFormat);
                                            return trackFormat;
                                        }
                                        a = Result.a(s3q0Var);
                                        mediaExtractor4 = mediaExtractor2;
                                        if (a != null) {
                                        }
                                        p490.k(trackFormat);
                                        return trackFormat;
                                    }
                                    mediaExtractor4.unselectTrack(sampleTrackIndex);
                                    mediaExtractor4.selectTrack(sampleTrackIndex);
                                    mediaExtractor4.seekTo(sampleTime, 0);
                                    s3q0Var = s3q0.a;
                                    mediaExtractor2 = mediaExtractor4;
                                    a = Result.a(s3q0Var);
                                    mediaExtractor4 = mediaExtractor2;
                                    if (a != null) {
                                    }
                                    p490.k(trackFormat);
                                    return trackFormat;
                                }
                            } else {
                                if (dequeueOutputBuffer >= 0) {
                                    b.releaseOutputBuffer(dequeueOutputBuffer, false);
                                }
                                outputFormat = null;
                            }
                            if (outputFormat == null) {
                                if ((bufferInfo.flags & 4) == 0) {
                                    j2 = j;
                                }
                                break;
                            }
                            a(outputFormat, trackFormat);
                            try {
                                b.stop();
                                s3q0 s3q0Var7 = s3q0.a;
                            } catch (Throwable unused7) {
                            }
                            try {
                                b.release();
                                s3q0 s3q0Var8 = s3q0.a;
                            } catch (Throwable unused8) {
                            }
                            if (sampleTime >= j) {
                                try {
                                    if (mediaExtractor4.getSampleFlags() < 0) {
                                    }
                                    mediaExtractor4.seekTo(sampleTime, 0);
                                    failure2 = s3q0.a;
                                } catch (Throwable th5) {
                                    failure2 = new Result.Failure(th5);
                                }
                                a4 = Result.a(failure2);
                                if (a4 != null) {
                                    L.l("AudioFormatExtractor", ms9.b("FAILED to reset extractor to initial state: ", a4));
                                }
                                return trackFormat;
                            }
                            mediaExtractor4.unselectTrack(sampleTrackIndex);
                            mediaExtractor4.selectTrack(sampleTrackIndex);
                            mediaExtractor4.seekTo(sampleTime, 0);
                            failure2 = s3q0.a;
                            a4 = Result.a(failure2);
                            if (a4 != null) {
                            }
                            return trackFormat;
                        }
                        break;
                        b.stop();
                        s3q0 s3q0Var9 = s3q0.a;
                    } catch (Throwable unused9) {
                    }
                    j = j2;
                    try {
                        b.release();
                        s3q0 s3q0Var10 = s3q0.a;
                    } catch (Throwable unused10) {
                    }
                } catch (InterruptedException unused11) {
                    j = j2;
                } catch (Throwable th6) {
                    th = th6;
                    j = j2;
                }
            } catch (InterruptedException unused12) {
                j = 0;
            } catch (Throwable th7) {
                th = th7;
                j = 0;
            }
            if (sampleTime >= j) {
                try {
                    if (mediaExtractor4.getSampleFlags() < 0) {
                    }
                    mediaExtractor4.seekTo(sampleTime, 0);
                    failure = s3q0.a;
                } catch (Throwable th8) {
                    failure = new Result.Failure(th8);
                }
                a3 = Result.a(failure);
                if (a3 != null) {
                    L.l("AudioFormatExtractor", ms9.b("FAILED to reset extractor to initial state: ", a3));
                }
                p490.k(trackFormat);
                return trackFormat;
            }
            mediaExtractor4.unselectTrack(sampleTrackIndex);
            mediaExtractor4.selectTrack(sampleTrackIndex);
            mediaExtractor4.seekTo(sampleTime, 0);
            failure = s3q0.a;
            a3 = Result.a(failure);
            if (a3 != null) {
            }
            p490.k(trackFormat);
            return trackFormat;
        } finally {
        }
    }
}
