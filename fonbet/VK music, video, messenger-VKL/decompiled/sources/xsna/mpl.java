package xsna;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import xsna.npl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class mpl implements jxc0 {
    public final /* synthetic */ npl b;
    public final /* synthetic */ npl.d c;

    public /* synthetic */ mpl(npl nplVar, npl.d dVar) {
        this.b = nplVar;
        this.c = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r9.b != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    @Override // xsna.jxc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        npl.f fVar;
        boolean isAvailable;
        boolean isEnabled;
        boolean canBeSpatialized;
        char c;
        androidx.media3.common.a aVar = (androidx.media3.common.a) obj;
        npl nplVar = this.b;
        nplVar.getClass();
        if (this.c.D && ((bool = nplVar.j) == null || !bool.booleanValue())) {
            int i = aVar.F;
            String str = aVar.n;
            if (i != -1 && i > 2) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078296:
                            if (str.equals(MimeTypes.AUDIO_AC3)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504578661:
                            if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            if (Build.VERSION.SDK_INT >= 32) {
                                npl.f fVar2 = nplVar.h;
                                if (fVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 && (fVar = nplVar.h) != null && fVar.b) {
                                Spatializer spatializer = fVar.a;
                                spatializer.getClass();
                                isAvailable = spl.a(spatializer).isAvailable();
                                if (isAvailable) {
                                    Spatializer spatializer2 = nplVar.h.a;
                                    spatializer2.getClass();
                                    isEnabled = spl.a(spatializer2).isEnabled();
                                    if (isEnabled) {
                                        npl.f fVar3 = nplVar.h;
                                        nc4 nc4Var = nplVar.i;
                                        fVar3.getClass();
                                        int i2 = aVar.F;
                                        if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
                                            if (i2 == 16) {
                                                i2 = 12;
                                            }
                                        } else if (Objects.equals(str, "audio/iamf")) {
                                            if (i2 == -1) {
                                                i2 = 6;
                                            }
                                        } else if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
                                            i2 = 24;
                                        }
                                        int t = y2r0.t(i2);
                                        if (t == 0) {
                                            canBeSpatialized = false;
                                        } else {
                                            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t);
                                            int i3 = aVar.G;
                                            if (i3 != -1) {
                                                channelMask.setSampleRate(i3);
                                            }
                                            Spatializer spatializer3 = fVar3.a;
                                            spatializer3.getClass();
                                            canBeSpatialized = spl.a(spatializer3).canBeSpatialized(nc4Var.a(), channelMask.build());
                                        }
                                        if (canBeSpatialized) {
                                        }
                                    }
                                }
                            }
                            return false;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                    Spatializer spatializer4 = fVar.a;
                    spatializer4.getClass();
                    isAvailable = spl.a(spatializer4).isAvailable();
                    if (isAvailable) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
