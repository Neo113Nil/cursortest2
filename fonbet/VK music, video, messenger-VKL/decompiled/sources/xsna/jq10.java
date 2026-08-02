package xsna;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.vk.media.codec.MediaCodecException;
import com.vk.media.codec.MediaCodecSelectorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.gq10;

/* compiled from: MediaCodecSelector.kt */
/* loaded from: classes3.dex */
public final class jq10 {
    public final f100 a;
    public final gq10 b;
    public final a c;
    public final boolean d;

    /* compiled from: MediaCodecSelector.kt */
    public static final class a {
        public final f100 a;
        public volatile Throwable b;

        public a(f100 f100Var) {
            this.a = f100Var;
        }

        public final MediaCodec a(MediaFormat mediaFormat, String str, Surface surface, boolean z) {
            MediaCodec mediaCodec;
            try {
                mediaCodec = str != null ? MediaCodec.createByCodecName(str) : z ? MediaCodec.createEncoderByType(mediaFormat.getString("mime")) : MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
                try {
                    mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, z ? 1 : 0);
                    return mediaCodec;
                } catch (Throwable th) {
                    th = th;
                    f100 f100Var = this.a;
                    if (f100Var != null) {
                        f100Var.c("MediaCodeSelector", new MediaCodecException(str == null ? "by type" : str, th));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(z ? "encoder" : "decoder");
                    sb.append(' ');
                    if (str == null) {
                        str = "by type";
                    }
                    sb.append(str);
                    String sb2 = sb.toString();
                    f100 f100Var2 = this.a;
                    if (f100Var2 != null) {
                        f100Var2.e("MediaCodeSelector", "Failed to configure " + sb2 + " for MediaFormat=" + mediaFormat);
                    }
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    this.b = th;
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                mediaCodec = null;
            }
        }
    }

    public jq10(f100 f100Var, gq10 gq10Var, a aVar, boolean z) {
        this.a = f100Var;
        this.b = gq10Var;
        this.c = aVar;
        this.d = z;
    }

    public static MediaCodec b(jq10 jq10Var, MediaFormat mediaFormat, Surface surface, int i) throws IllegalStateException {
        if ((i & 2) != 0) {
            surface = null;
        }
        return jq10Var.a(null, mediaFormat, false, surface, false);
    }

    public final MediaCodec a(String str, MediaFormat mediaFormat, boolean z, Surface surface, boolean z2) {
        MediaCodec a2;
        Object obj;
        MediaCodecInfo mediaCodecInfo;
        Object obj2;
        Object obj3;
        MediaCodec a3;
        MediaCodec a4 = str != null ? this.c.a(mediaFormat, str, surface, z) : null;
        List<String> c = c(mediaFormat, z, z2);
        if (a4 != null) {
            f100 f100Var = this.a;
            if (f100Var != null) {
                f100Var.i("MediaCodeSelector", "chosen codec by name=" + a4.getName());
            }
            return a4;
        }
        f100 f100Var2 = this.a;
        if (f100Var2 != null) {
            StringBuilder sb = new StringBuilder("create ");
            String string = mediaFormat.getString("mime");
            sb.append(string != null ? brm0.B(string, "video/", true) : false ? "video" : "audio");
            sb.append(' ');
            sb.append(z ? "encoder" : "decoder");
            sb.append(" for format: ");
            sb.append(mediaFormat);
            f100Var2.i("MediaCodeSelector", sb.toString());
        }
        f100 f100Var3 = this.a;
        if (f100Var3 != null) {
            f100Var3.i("MediaCodeSelector", "available codecs = " + j5g.g0(c, ", ", null, null, 0, null, 62));
        }
        String string2 = mediaFormat.getString("mime");
        if (!(string2 != null ? brm0.B(string2, "video/", true) : false) && !z) {
            Iterator<T> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (epx.f((String) obj3, "c2.android.aac.decoder")) {
                    break;
                }
            }
            String str2 = (String) obj3;
            if (str2 != null && (a3 = this.c.a(mediaFormat, str2, surface, false)) != null) {
                f100 f100Var4 = this.a;
                if (f100Var4 != null) {
                    f100Var4.i("MediaCodeSelector", "chosen c2.android.aac.decoder");
                }
                return a3;
            }
        }
        Iterator<String> it2 = c.iterator();
        while (it2.hasNext()) {
            MediaCodec a5 = this.c.a(mediaFormat, it2.next(), surface, z);
            if (a5 != null) {
                f100 f100Var5 = this.a;
                if (f100Var5 != null) {
                    f100Var5.i("MediaCodeSelector", "chosen codec from available=" + a5.getName());
                }
                return a5;
            }
        }
        Set S0 = j5g.S0(c);
        String string3 = mediaFormat.getString("mime");
        if (this.d) {
            this.b.getClass();
            List a6 = gq10.a(string3, z, z2);
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : a6) {
                if (!S0.contains(((MediaCodecInfo) obj4).getName())) {
                    arrayList.add(obj4);
                }
            }
            if (z2) {
                mediaCodecInfo = null;
            } else {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (gq10.a.b((MediaCodecInfo) obj, string3)) {
                        break;
                    }
                }
                mediaCodecInfo = (MediaCodecInfo) obj;
            }
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) obj2;
                if (gq10.a.c(mediaCodecInfo2, string3)) {
                    if (!epx.f(mediaCodecInfo2.getName(), mediaCodecInfo != null ? mediaCodecInfo.getName() : null)) {
                        break;
                    }
                }
            }
            List I = rl3.I(new MediaCodecInfo[]{mediaCodecInfo, (MediaCodecInfo) obj2});
            if (!I.isEmpty()) {
                Iterator it5 = I.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        a2 = null;
                        break;
                    }
                    MediaCodec a7 = this.c.a(mediaFormat, ((MediaCodecInfo) it5.next()).getName(), surface, z);
                    if (a7 != null) {
                        a2 = a7;
                        break;
                    }
                }
            } else {
                a2 = this.c.a(mediaFormat, null, surface, z);
            }
        } else {
            this.b.getClass();
            List a8 = gq10.a(string3, z, true);
            a aVar = this.c;
            MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) j5g.b0(0, a8);
            a2 = aVar.a(mediaFormat, mediaCodecInfo3 != null ? mediaCodecInfo3.getName() : null, surface, z);
        }
        if (a2 == null) {
            StringBuilder sb2 = new StringBuilder("Failed to init media codec for ");
            sb2.append(string3);
            sb2.append(' ');
            sb2.append(z ? "encoder" : "decoder");
            throw new MediaCodecSelectorException(sb2.toString(), this.c.b);
        }
        f100 f100Var6 = this.a;
        if (f100Var6 != null) {
            f100Var6.d("MediaCodeSelector", "chosen fallback codec=" + a2.getName());
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final List<String> c(MediaFormat mediaFormat, boolean z, boolean z2) {
        boolean z3;
        String string = mediaFormat.getString("mime");
        if (string == null) {
            return EmptyList.b;
        }
        ?? arrayList = new ArrayList();
        this.b.getClass();
        List a2 = gq10.a(string, z, z2);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z3 = this.d;
            if (!hasNext) {
                break;
            }
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            try {
                if (gq10.d(mediaCodecInfo, mediaFormat)) {
                    arrayList.add(mediaCodecInfo);
                } else if (z3) {
                    String string2 = mediaFormat.getString("mime");
                    if (string2 != null ? brm0.B(string2, "video/", true) : false) {
                        d(mediaFormat, mediaCodecInfo, arrayList2);
                    }
                }
            } catch (Exception e) {
                f100 f100Var = this.a;
                if (f100Var != null) {
                    f100Var.e("MediaCodeSelector", "failed to populate codecs", e);
                }
            }
        }
        if (z3) {
            arrayList = j5g.D0(new kq10(string), j5g.u0(arrayList2, arrayList));
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList(c5g.u(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((MediaCodecInfo) it2.next()).getName());
        }
        return arrayList3;
    }

    public final void d(MediaFormat mediaFormat, MediaCodecInfo mediaCodecInfo, ArrayList arrayList) {
        if (mediaFormat.containsKey("width")) {
            if (mediaFormat.containsKey("height")) {
                int integer = mediaFormat.getInteger("width");
                int integer2 = mediaFormat.getInteger("height");
                mediaFormat.setInteger("width", integer2);
                mediaFormat.setInteger("height", integer);
                try {
                    this.b.getClass();
                    if (gq10.d(mediaCodecInfo, mediaFormat)) {
                        arrayList.add(mediaCodecInfo);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    mediaFormat.setInteger("width", integer);
                    mediaFormat.setInteger("height", integer2);
                }
            }
        }
    }

    public /* synthetic */ jq10(f100 f100Var) {
        this(f100Var, new gq10(f100Var), new a(f100Var), true);
    }
}
