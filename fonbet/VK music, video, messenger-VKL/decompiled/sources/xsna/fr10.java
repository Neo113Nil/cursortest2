package xsna;

import android.util.Size;
import com.ironsource.O6;
import one.video.player.model.FrameSize;
import xsna.cms0;
import xsna.fi20;
import xsna.so4;

/* compiled from: MediaFormatExt.kt */
/* loaded from: classes8.dex */
public final class fr10 {
    public static final so4 a(androidx.media3.common.a aVar) {
        so4.a aVar2 = new so4.a();
        aVar2.a = aVar.a;
        aVar2.b = aVar.n;
        aVar2.c = aVar.k;
        aVar2.d = aVar.j;
        aVar2.e = aVar.G;
        aVar2.f = aVar.F;
        aVar2.g = aVar.b;
        aVar2.h = aVar.d;
        return aVar2.a();
    }

    public static final er10 b(int i, androidx.media3.common.a aVar) {
        return i != 1 ? i != 2 ? c(aVar) : d(aVar) : a(aVar);
    }

    public static final who0 c(androidx.media3.common.a aVar) {
        return new who0(aVar.a, aVar.n, aVar.d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final cms0 d(androidx.media3.common.a aVar) {
        yer0 yer0Var;
        int i = (int) (aVar.u * aVar.A);
        int i2 = aVar.v;
        Size size = aVar.z % 180 == 0 ? new Size(i, i2) : new Size(i2, i);
        cms0.a aVar2 = new cms0.a();
        aVar2.a = aVar.a;
        aVar2.b = aVar.n;
        aVar2.c = aVar.k;
        aVar2.d = aVar.j;
        aVar2.e = size.getWidth();
        aVar2.f = size.getHeight();
        aVar2.g = aVar.y;
        fi20 fi20Var = aVar.l;
        FrameSize frameSize = null;
        if (fi20Var != null) {
            for (fi20.a aVar3 : fi20Var.a) {
                if (aVar3 instanceof yer0) {
                    yer0Var = (yer0) aVar3;
                    break;
                }
            }
        }
        yer0Var = null;
        if (yer0Var != null) {
            String str = yer0Var.a;
            switch (str.hashCode()) {
                case -1096862286:
                    if (str.equals("lowest")) {
                        frameSize = FrameSize._240p;
                        break;
                    }
                    break;
                case -1068855134:
                    if (str.equals("mobile")) {
                        frameSize = FrameSize._144p;
                        break;
                    }
                    break;
                case 3324:
                    if (str.equals("hd")) {
                        frameSize = FrameSize._720p;
                        break;
                    }
                    break;
                case 3665:
                    if (str.equals(O6.z0)) {
                        frameSize = FrameSize._480p;
                        break;
                    }
                    break;
                case 107348:
                    if (str.equals("low")) {
                        frameSize = FrameSize._360p;
                        break;
                    }
                    break;
                case 3154575:
                    if (str.equals("full")) {
                        frameSize = FrameSize._1080p;
                        break;
                    }
                    break;
                case 3481927:
                    if (str.equals("quad")) {
                        frameSize = FrameSize._1440p;
                        break;
                    }
                    break;
                case 111384492:
                    if (str.equals("ultra")) {
                        frameSize = FrameSize._2160p;
                        break;
                    }
                    break;
            }
        }
        aVar2.h = frameSize;
        return aVar2.a();
    }
}
