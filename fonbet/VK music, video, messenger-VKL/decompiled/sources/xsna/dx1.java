package xsna;

import com.vk.reefton.dto.ReefContentType;
import one.video.player.model.VideoContentType;
import one.video.statistics.ContentType;

/* compiled from: AnalyticsConfigExt.kt */
/* loaded from: classes3.dex */
public final class dx1 {
    public static final k9x a = new k9x(16000001, 16000598, 1);

    /* compiled from: AnalyticsConfigExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.MP4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoContentType.DASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoContentType.RTMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoContentType.LOCAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final cx1 a(m7q m7qVar) {
        lwe0 lwe0Var;
        int i;
        ContentType contentType;
        ContentType contentType2;
        lt50 lt50Var;
        boolean z;
        dk80 dk80Var;
        boolean z2 = m7qVar.F;
        boolean z3 = m7qVar.D;
        boolean z4 = m7qVar.C || m7qVar.G || z3;
        boolean z5 = m7qVar.E;
        lt50 lt50Var2 = new lt50(z5, z4);
        if (m7qVar.H) {
            k9x k9xVar = a;
            int i2 = k9xVar.b;
            int i3 = k9xVar.c;
            long j = m7qVar.c;
            if (i2 > j || j > i3) {
                lwe0Var = new lwe0(m7qVar.b, j);
                vmf0 vmf0Var = new vmf0(m7qVar.a, m7qVar.e.b.toString(), !z3 ? ReefContentType.LIVE : z5 ? ReefContentType.CLIP : ReefContentType.VIDEO, z2);
                if (m7qVar.y || z2) {
                    sht0 e = jgz.e(m7qVar);
                    boolean z6 = m7qVar.E;
                    boolean z7 = m7qVar.q;
                    String str = m7qVar.g;
                    i = a.$EnumSwitchMapping$0[e.a.ordinal()];
                    if (i != 1) {
                        contentType = ContentType.mp4;
                    } else if (i == 2) {
                        contentType = ContentType.hls;
                    } else if (i == 3) {
                        contentType = ContentType.dash;
                    } else if (i == 4) {
                        contentType = ContentType.rtmp;
                    } else if (i != 5) {
                        contentType2 = null;
                        lt50Var = lt50Var2;
                        z = z2;
                        dk80Var = new dk80(z6, z7, e.c, e.b.getHost(), m7qVar.j, str, contentType2, m7qVar.h, m7qVar.z, m7qVar.d, m7qVar.b, m7qVar.c, m7qVar.n);
                    } else {
                        contentType = ContentType.mp4;
                    }
                    contentType2 = contentType;
                    lt50Var = lt50Var2;
                    z = z2;
                    dk80Var = new dk80(z6, z7, e.c, e.b.getHost(), m7qVar.j, str, contentType2, m7qVar.h, m7qVar.z, m7qVar.d, m7qVar.b, m7qVar.c, m7qVar.n);
                } else {
                    z = z2;
                    lt50Var = lt50Var2;
                    dk80Var = null;
                }
                return new cx1(lt50Var, lwe0Var, dk80Var, vmf0Var, !z ? null : new aqa0(jgz.e(m7qVar).b, m7qVar.w));
            }
        }
        lwe0Var = null;
        vmf0 vmf0Var2 = new vmf0(m7qVar.a, m7qVar.e.b.toString(), !z3 ? ReefContentType.LIVE : z5 ? ReefContentType.CLIP : ReefContentType.VIDEO, z2);
        if (m7qVar.y) {
        }
        sht0 e2 = jgz.e(m7qVar);
        boolean z62 = m7qVar.E;
        boolean z72 = m7qVar.q;
        String str2 = m7qVar.g;
        i = a.$EnumSwitchMapping$0[e2.a.ordinal()];
        if (i != 1) {
        }
        contentType2 = contentType;
        lt50Var = lt50Var2;
        z = z2;
        dk80Var = new dk80(z62, z72, e2.c, e2.b.getHost(), m7qVar.j, str2, contentType2, m7qVar.h, m7qVar.z, m7qVar.d, m7qVar.b, m7qVar.c, m7qVar.n);
        return new cx1(lt50Var, lwe0Var, dk80Var, vmf0Var2, !z ? null : new aqa0(jgz.e(m7qVar).b, m7qVar.w));
    }
}
