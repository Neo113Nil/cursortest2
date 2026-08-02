package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.messaging.internal.net.file.CacheType;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.a;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes15.dex */
public final class oyq {
    public final LinkedHashMap a;

    public oyq(Context context) {
        k4o c = CacheType.c();
        int d = gw00.d(tcc.n(c, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : c) {
            linkedHashMap.put(obj, a.a(new bdp(5, context, (CacheType) obj)));
        }
        this.a = linkedHashMap;
    }

    public final boolean a(String str) {
        File file;
        if (str != null) {
            Iterator it = this.a.values().iterator();
            do {
                if (it.hasNext()) {
                    myq myqVar = (myq) ((i3y) it.next()).getValue();
                    myqVar.getClass();
                    String encode = Uri.encode(str);
                    cyj cyjVar = myqVar.a;
                    if (cyjVar.B != null) {
                        qxj qxjVar = (qxj) cyjVar.C.get(encode);
                        if (qxjVar != null && qxjVar.c) {
                            file = qxjVar.a(0);
                            if (file.exists()) {
                            }
                        }
                        file = null;
                    } else {
                        ny61.r("cache is closed");
                    }
                }
            } while (file == null);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r0.exists() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lyq b(String str) {
        lyq lyqVar;
        CacheType cacheType;
        File file;
        Iterator it = this.a.entrySet().iterator();
        do {
            lyqVar = null;
            if (!it.hasNext()) {
                if (ydz.a.a()) {
                    ydz.a();
                }
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            cacheType = (CacheType) entry.getKey();
            myq myqVar = (myq) ((i3y) entry.getValue()).getValue();
            myqVar.getClass();
            String encode = Uri.encode(str);
            cyj cyjVar = myqVar.a;
            lyq lyqVar2 = new lyq(cyjVar, encode);
            String encode2 = Uri.encode(str);
            if (cyjVar.B == null) {
                ny61.r("cache is closed");
                return null;
            }
            qxj qxjVar = (qxj) cyjVar.C.get(encode2);
            if (qxjVar != null && qxjVar.c) {
                file = qxjVar.a(0);
            }
            file = null;
            if (file != null) {
                lyqVar = lyqVar2;
            }
        } while (lyqVar == null);
        if (ydz.a.a()) {
            Objects.toString(cacheType);
            ydz.a();
        }
        return lyqVar;
    }

    public final myq c(wg10 wg10Var) {
        CacheType cacheType;
        if (ydz.a.a()) {
            ydz.a();
        }
        String str = wg10Var != null ? wg10Var.b : null;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 93166550) {
                if (hashCode != 100313435) {
                    if (hashCode == 112202875 && str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        cacheType = CacheType.RAW;
                    }
                } else if (str.equals("image")) {
                    cacheType = CacheType.IMAGE;
                }
            } else if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                cacheType = (evu0.y(wg10Var.c, "ogg", false) || evu0.y(wg10Var.c, "opus", false)) ? CacheType.VOICE : CacheType.RAW;
            }
            return d(cacheType);
        }
        cacheType = CacheType.RAW;
        return d(cacheType);
    }

    public final myq d(CacheType cacheType) {
        myq myqVar;
        i3y i3yVar = (i3y) this.a.get(cacheType);
        if (i3yVar != null && (myqVar = (myq) i3yVar.getValue()) != null) {
            return myqVar;
        }
        vg10.p("Cache ", cacheType, " is unpredictably missing");
        return null;
    }
}
