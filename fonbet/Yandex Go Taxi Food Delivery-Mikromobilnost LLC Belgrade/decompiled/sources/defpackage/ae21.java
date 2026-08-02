package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes10.dex */
public final class ae21 extends u9h {
    public final yd21 a;

    public ae21(yd21 yd21Var) {
        this.a = yd21Var;
    }

    @Override // defpackage.u9h
    public final List a(Context context, xb10 xb10Var, a aVar, boolean z, boolean z2) {
        Object obj;
        ArrayList arrayList = new ArrayList(super.a(context, xb10Var, aVar, z, z2));
        String str = aVar.n;
        if (!arrayList.isEmpty() && str != null) {
            boolean z3 = false;
            if (cvu0.x(str, MediaStreamTrack.VIDEO_TRACK_KIND, false) && cvu0.n(Build.MANUFACTURER).equals("Realme") && cvu0.n(Build.MODEL).equals("RMX3231")) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (!((sb10) obj).i) {
                        break;
                    }
                }
                sb10 sb10Var = (sb10) obj;
                if (sb10Var != null) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 8;
                    codecProfileLevel.level = 512;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = sb10Var.d;
                    if (codecCapabilities != null) {
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
                        if (!j73.y(codecProfileLevelArr, codecProfileLevel)) {
                            int length = codecProfileLevelArr.length + 1;
                            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[length];
                            int i = 0;
                            while (i < length) {
                                codecProfileLevelArr2[i] = (i < 0 || i >= codecProfileLevelArr.length) ? codecProfileLevel : codecProfileLevelArr[i];
                                i++;
                            }
                            codecProfileLevelArr = codecProfileLevelArr2;
                        }
                        codecCapabilities.profileLevels = codecProfileLevelArr;
                    }
                }
            }
            yd21 yd21Var = this.a;
            if (yd21Var.b || (yd21Var.a && cvu0.x(cvu0.n(Build.MODEL), "SM-T", false))) {
                z3 = true;
            }
            if (arrayList.size() > 1) {
                xcc.q(arrayList, new zd21(aVar, z3));
            }
        }
        return arrayList;
    }
}
