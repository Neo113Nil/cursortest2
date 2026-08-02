package xsna;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Range;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: EncoderMediaFormatAdjuster.kt */
/* loaded from: classes3.dex */
public final class djp {
    public final gq10 a = new gq10(new bv10());

    /* compiled from: EncoderMediaFormatAdjuster.kt */
    public static final class a implements Comparable<a> {
        public final Integer b;
        public final Integer c;
        public final Integer d;

        public a(Integer num, Integer num2, Integer num3) {
            this.b = num;
            this.c = num2;
            this.d = num3;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            int a = b.a(this.d, aVar2.d);
            if (a != 0) {
                return a;
            }
            int a2 = b.a(this.c, aVar2.c);
            if (a2 != 0) {
                return a2;
            }
            int a3 = b.a(this.b, aVar2.b);
            if (a3 != 0) {
                return a3;
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            Integer num = this.b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.c;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.d;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormatHolder(bitrate=");
            sb.append(this.b);
            sb.append(", sampleRate=");
            sb.append(this.c);
            sb.append(", channelCount=");
            return uqi.b(sb, this.d, ')');
        }
    }

    /* compiled from: EncoderMediaFormatAdjuster.kt */
    public static final class b {
        public static final int a(Integer num, Integer num2) {
            return epx.g(num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0);
        }
    }

    /* compiled from: EncoderMediaFormatAdjuster.kt */
    public static final class c implements Comparable<c> {
        public final Integer b;
        public final Integer c;
        public final Integer d;
        public final Integer e;

        public c(Integer num, Integer num2, Integer num3, Integer num4) {
            this.b = num;
            this.c = num2;
            this.d = num3;
            this.e = num4;
        }

        public final void a(MediaFormat mediaFormat) {
            Integer num = this.d;
            if (num != null) {
                mediaFormat.setInteger("width", num.intValue());
            }
            Integer num2 = this.e;
            if (num2 != null) {
                mediaFormat.setInteger("height", num2.intValue());
            }
            Integer num3 = this.c;
            if (num3 != null) {
                mediaFormat.setInteger("frame-rate", num3.intValue());
            }
            Integer num4 = this.b;
            if (num4 != null) {
                mediaFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, num4.intValue());
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            int a = b.a(this.b, cVar2.b);
            if (a != 0) {
                return a;
            }
            int a2 = b.a(this.c, cVar2.c);
            if (a2 != 0) {
                return a2;
            }
            int a3 = b.a(this.d, cVar2.d);
            if (a3 != 0) {
                return a3;
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            Integer num = this.b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.c;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.d;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.e;
            return hashCode3 + (num4 != null ? num4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoFormatHolder(bitrate=");
            sb.append(this.b);
            sb.append(", fps=");
            sb.append(this.c);
            sb.append(", width=");
            sb.append(this.d);
            sb.append(", height=");
            return uqi.b(sb, this.e, ')');
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
    
        r6 = r2.getMaxInputChannelCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
    
        if (r3.intValue() <= r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0107, code lost:
    
        r3 = java.lang.Integer.valueOf(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MediaFormat mediaFormat) {
        List list;
        List list2;
        String string;
        if (b(mediaFormat).isEmpty()) {
            try {
                String str = "";
                if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                    str = string;
                }
                this.a.getClass();
                ArrayList c2 = gq10.c(str);
                ArrayList arrayList = new ArrayList();
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = ((MediaCodecInfo.CodecCapabilities) it.next()).getAudioCapabilities();
                    if (audioCapabilities != null) {
                        arrayList.add(audioCapabilities);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = (MediaCodecInfo.AudioCapabilities) it2.next();
                    Object obj = null;
                    Integer valueOf = mediaFormat.containsKey("sample-rate") ? Integer.valueOf(mediaFormat.getInteger("sample-rate")) : null;
                    Integer valueOf2 = mediaFormat.containsKey(BadConnectionSignaling.KEY_BAD_NET_BITRATE) ? Integer.valueOf(mediaFormat.getInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE)) : null;
                    Integer valueOf3 = mediaFormat.containsKey("channel-count") ? Integer.valueOf(mediaFormat.getInteger("channel-count")) : null;
                    int[] supportedSampleRates = audioCapabilities2.getSupportedSampleRates();
                    if (supportedSampleRates != null) {
                        Integer[] B = jw5.B(supportedSampleRates);
                        Integer[] numArr = B;
                        if (numArr.length > 1) {
                            Arrays.sort(numArr);
                        }
                        list = Arrays.asList(B);
                    } else {
                        list = null;
                    }
                    if (valueOf != null && (list2 = list) != null && !list2.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next = it3.next();
                            if (((Number) next).intValue() == valueOf.intValue()) {
                                obj = next;
                                break;
                            }
                        }
                        Integer num = (Integer) obj;
                        valueOf = Integer.valueOf(num != null ? num.intValue() : ((Number) j5g.i0(list)).intValue());
                    }
                    Range<Integer> bitrateRange = audioCapabilities2.getBitrateRange();
                    if (valueOf2 != null && bitrateRange != null) {
                        valueOf2 = bitrateRange.clamp(valueOf2);
                    }
                    arrayList2.add(new a(valueOf2, valueOf, valueOf3));
                }
                a aVar = (a) j5g.l0(arrayList2);
                if (aVar != null) {
                    Integer num2 = aVar.c;
                    if (num2 != null) {
                        mediaFormat.setInteger("sample-rate", num2.intValue());
                    }
                    Integer num3 = aVar.d;
                    if (num3 != null) {
                        mediaFormat.setInteger("channel-count", num3.intValue());
                    }
                    Integer num4 = aVar.b;
                    if (num4 != null) {
                        mediaFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, num4.intValue());
                    }
                }
            } catch (Exception e) {
                L.g("EncoderMediaFormatAdjuster", e);
            }
        }
    }

    public final List b(MediaFormat mediaFormat) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        String string = mediaFormat.getString("mime");
        if (string == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getClass();
        for (MediaCodecInfo mediaCodecInfo : gq10.a(string, true, false)) {
            try {
                if (rl3.G(mediaCodecInfo.getSupportedTypes(), string) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string)) != null && capabilitiesForType.isFormatSupported(mediaFormat)) {
                    arrayList.add(mediaCodecInfo.getName());
                }
            } catch (Exception e) {
                L.g("EncoderMediaFormatAdjuster", e);
            }
        }
        return arrayList;
    }
}
