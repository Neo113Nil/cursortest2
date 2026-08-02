package xsna;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.zzfk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.C4498pe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dz9;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class lvf0 implements dz9.d {
    public static final o100 l = new o100("RemoteMediaClient", null);
    public final zyz0 c;
    public final h001 d;
    public final pv10 e;

    @Nullable
    public ho01 f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final Object a = new Object();
    public final zzfk b = new zzfk(Looper.getMainLooper());

    /* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
    @Deprecated
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
    public interface c extends qdg0 {
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
    public interface d {
        void onProgressUpdated(long j, long j2);
    }

    static {
        String str = zyz0.w;
    }

    public lvf0(zyz0 zyz0Var) {
        h001 h001Var = new h001(this);
        this.d = h001Var;
        this.c = zyz0Var;
        zyz0Var.h = new c301(this);
        zyz0Var.c = h001Var;
        this.e = new pv10(this);
    }

    @NonNull
    public static r001 G() {
        r001 r001Var = new r001(null);
        r001Var.setResult(new n001(r001Var, new Status(17, (String) null)));
        return r001Var;
    }

    public static final void J(w201 w201Var) {
        try {
            w201Var.c();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            w201Var.setResult(new q201(w201Var, new Status(C4498pe.g)));
        }
    }

    public final void A() {
        ho01 ho01Var = this.f;
        if (ho01Var == null) {
            return;
        }
        exc0.e("Must be called from the main thread.");
        String str = this.c.b;
        a401 a401Var = (a401) ho01Var;
        o0a.b(str);
        HashMap hashMap = a401Var.s;
        synchronized (hashMap) {
            hashMap.put(str, this);
        }
        f5o0.a a2 = f5o0.a();
        a2.a = new nv70(a401Var, str, this);
        a2.e = 8413;
        a401Var.doWrite(a2.a());
        exc0.e("Must be called from the main thread.");
        if (H()) {
            J(new mq01(this));
        } else {
            G();
        }
    }

    public final boolean B() {
        exc0.e("Must be called from the main thread.");
        MediaStatus h = h();
        return h != null && h.f == 5;
    }

    public final boolean C() {
        exc0.e("Must be called from the main thread.");
        if (!m()) {
            return true;
        }
        MediaStatus h = h();
        return (h == null || (2 & h.i) == 0 || h.v == null) ? false : true;
    }

    public final int D() {
        MediaQueueItem f;
        if (g() != null && k()) {
            if (l()) {
                return 6;
            }
            if (p()) {
                return 3;
            }
            if (o()) {
                return 2;
            }
            if (n() && (f = f()) != null && f.b != null) {
                return 6;
            }
        }
        return 0;
    }

    public final boolean E() {
        if (!k()) {
            return false;
        }
        MediaStatus h = h();
        exc0.i(h);
        if ((128 & h.i) == 0 && h.q == 0) {
            Integer num = (Integer) h.y.get(h.d);
            if (num == null || num.intValue() <= 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean F() {
        if (!k()) {
            return false;
        }
        MediaStatus h = h();
        exc0.i(h);
        if ((64 & h.i) == 0 && h.q == 0) {
            Integer num = (Integer) h.y.get(h.d);
            if (num == null || num.intValue() >= h.r.size() - 1) {
                return false;
            }
        }
        return true;
    }

    public final boolean H() {
        return this.f != null;
    }

    public final void I(Set set) {
        MediaInfo mediaInfo;
        HashSet hashSet = new HashSet(set);
        if (p() || o() || l() || B()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((d) it.next()).onProgressUpdated(d(), j());
            }
        } else {
            if (!n()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).onProgressUpdated(0L, 0L);
                }
                return;
            }
            MediaQueueItem f = f();
            if (f == null || (mediaInfo = f.b) == null) {
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).onProgressUpdated(0L, mediaInfo.f);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0389, code lost:
    
        if (r4 != false) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ef A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030c A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031c A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0327 A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0331 A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0338 A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033f A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0346 A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0382 A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0017, B:11:0x0096, B:16:0x00a5, B:17:0x00b2, B:19:0x00b8, B:21:0x00cd, B:22:0x00d7, B:24:0x00dd, B:27:0x00e7, B:29:0x00f4, B:31:0x0109, B:43:0x0147, B:45:0x015c, B:46:0x017a, B:48:0x0180, B:51:0x018a, B:52:0x0194, B:54:0x019a, B:58:0x01a4, B:59:0x01ae, B:61:0x01b4, B:64:0x01be, B:65:0x01c8, B:67:0x01ce, B:70:0x01d8, B:71:0x01e2, B:73:0x01e8, B:88:0x01f2, B:90:0x01ff, B:92:0x0209, B:93:0x0213, B:95:0x0219, B:100:0x0223, B:101:0x0227, B:103:0x022d, B:105:0x023d, B:107:0x0241, B:108:0x024e, B:110:0x0254, B:114:0x025e, B:115:0x026a, B:117:0x0270, B:120:0x0280, B:122:0x028a, B:124:0x0294, B:125:0x02a0, B:127:0x02a6, B:130:0x02b6, B:132:0x02c3, B:134:0x02d4, B:139:0x02ef, B:142:0x02f4, B:143:0x0308, B:145:0x030c, B:146:0x0318, B:148:0x031c, B:149:0x0323, B:151:0x0327, B:152:0x032d, B:154:0x0331, B:155:0x0334, B:157:0x0338, B:158:0x033b, B:160:0x033f, B:161:0x0342, B:163:0x0346, B:165:0x0350, B:166:0x0358, B:168:0x035e, B:170:0x0368, B:171:0x036e, B:173:0x0374, B:175:0x037e, B:177:0x0382, B:178:0x038b, B:179:0x039d, B:180:0x03a1, B:182:0x03a7, B:187:0x02f9, B:188:0x02dd, B:190:0x02e5, B:194:0x038f), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0317  */
    @Override // xsna.dz9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NonNull String str) {
        char c2;
        int i;
        int i2;
        boolean z;
        MediaStatus mediaStatus;
        int[] h;
        char c3;
        zyz0 zyz0Var = this.c;
        yzz0 yzz0Var = zyz0Var.j;
        List list = zyz0Var.d;
        o100 o100Var = zyz0Var.a;
        o100Var.a("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1L);
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean c4 = yzz0Var.c(optLong);
                        yzz0 yzz0Var2 = zyz0Var.n;
                        if (yzz0Var2.b()) {
                            if (yzz0Var2.c(optLong)) {
                            }
                            i = 1;
                            if (!c4 && (mediaStatus = zyz0Var.f) != null) {
                                i2 = mediaStatus.k(jSONObject2, i);
                                if ((i2 & 1) != 0) {
                                    zyz0Var.e = SystemClock.elapsedRealtime();
                                    zyz0Var.i = -1;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if ((i2 & 2) != 0) {
                                    zyz0Var.e = SystemClock.elapsedRealtime();
                                    z = true;
                                }
                                if ((i2 & 128) != 0) {
                                    zyz0Var.e = SystemClock.elapsedRealtime();
                                }
                                if ((i2 & 4) != 0) {
                                    zyz0Var.j();
                                }
                                if ((i2 & 8) != 0) {
                                    zyz0Var.k();
                                }
                                if ((i2 & 16) != 0) {
                                    zyz0Var.l();
                                }
                                if ((i2 & 32) != 0) {
                                    zyz0Var.e = SystemClock.elapsedRealtime();
                                    c301 c301Var = zyz0Var.h;
                                    if (c301Var != null) {
                                        lvf0 lvf0Var = c301Var.a;
                                        Iterator it = lvf0Var.h.iterator();
                                        while (it.hasNext()) {
                                            ((b) it.next()).c();
                                        }
                                        Iterator it2 = lvf0Var.i.iterator();
                                        while (it2.hasNext()) {
                                            ((a) it2.next()).a();
                                        }
                                    }
                                }
                                if ((i2 & 64) != 0) {
                                    zyz0Var.e = SystemClock.elapsedRealtime();
                                }
                                zyz0Var.i();
                            }
                            zyz0Var.f = new MediaStatus(jSONObject2);
                            zyz0Var.e = SystemClock.elapsedRealtime();
                            i2 = 127;
                            if ((i2 & 1) != 0) {
                            }
                            if ((i2 & 2) != 0) {
                            }
                            if ((i2 & 128) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                            if ((i2 & 8) != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if ((i2 & 64) != 0) {
                            }
                            zyz0Var.i();
                        }
                        yzz0 yzz0Var3 = zyz0Var.o;
                        if (!yzz0Var3.b() || yzz0Var3.c(optLong)) {
                            i = 0;
                            if (!c4) {
                                i2 = mediaStatus.k(jSONObject2, i);
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((i2 & 4) != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                zyz0Var.i();
                            }
                            zyz0Var.f = new MediaStatus(jSONObject2);
                            zyz0Var.e = SystemClock.elapsedRealtime();
                            i2 = 127;
                            if ((i2 & 1) != 0) {
                            }
                            if ((i2 & 2) != 0) {
                            }
                            if ((i2 & 128) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                            if ((i2 & 8) != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if ((i2 & 64) != 0) {
                            }
                            zyz0Var.i();
                        } else {
                            i = 1;
                            if (!c4) {
                            }
                            zyz0Var.f = new MediaStatus(jSONObject2);
                            zyz0Var.e = SystemClock.elapsedRealtime();
                            i2 = 127;
                            if ((i2 & 1) != 0) {
                            }
                            if ((i2 & 2) != 0) {
                            }
                            if ((i2 & 128) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                            if ((i2 & 8) != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if ((i2 & 64) != 0) {
                            }
                            zyz0Var.i();
                        }
                    } else {
                        zyz0Var.f = null;
                        zyz0Var.i();
                        zyz0Var.j();
                        zyz0Var.k();
                        zyz0Var.l();
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((yzz0) it3.next()).d(optLong, 0, null);
                    }
                    break;
                case 1:
                    o100Var.c("received unexpected error: Invalid Player State.", new Object[0]);
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((yzz0) it4.next()).d(optLong, C4498pe.g, zyz0.n(jSONObject));
                    }
                    break;
                case 2:
                    yzz0Var.d(optLong, C4498pe.g, zyz0.n(jSONObject));
                    break;
                case 3:
                    yzz0Var.d(optLong, 2101, zyz0.n(jSONObject));
                    break;
                case 4:
                    o100Var.c("received unexpected error: Invalid Request.", new Object[0]);
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        ((yzz0) it5.next()).d(optLong, 2001, zyz0.n(jSONObject));
                    }
                    break;
                case 5:
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        ((yzz0) it6.next()).d(optLong, C4498pe.g, zyz0.n(jSONObject));
                    }
                    if (zyz0Var.h != null) {
                        MediaError.b(jSONObject);
                        Iterator it7 = zyz0Var.h.a.i.iterator();
                        while (it7.hasNext()) {
                            ((a) it7.next()).getClass();
                        }
                        break;
                    }
                    break;
                case 6:
                    zyz0Var.s.d(optLong, 0, null);
                    zyz0Var.g("QUEUE_ITEM_IDS", jSONObject);
                    if (zyz0Var.h != null && (h = zyz0.h(jSONObject.getJSONArray("itemIds"))) != null) {
                        Iterator it8 = zyz0Var.h.a.i.iterator();
                        while (it8.hasNext()) {
                            ((a) it8.next()).g(h);
                        }
                        break;
                    }
                    break;
                case 7:
                    zyz0Var.u.d(optLong, 0, null);
                    zyz0Var.g("QUEUE_CHANGE", jSONObject);
                    if (zyz0Var.h != null) {
                        String string2 = jSONObject.getString("changeType");
                        int[] h2 = zyz0.h(jSONObject.getJSONArray("itemIds"));
                        int optInt = jSONObject.optInt("insertBefore", 0);
                        if (h2 != null) {
                            switch (string2.hashCode()) {
                                case -2130463047:
                                    if (string2.equals("INSERT")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1881281404:
                                    if (string2.equals(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE)) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1785516855:
                                    if (string2.equals(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE)) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1122976047:
                                    if (string2.equals("ITEMS_CHANGE")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            if (c3 == 0) {
                                Iterator it9 = zyz0Var.h.a.i.iterator();
                                while (it9.hasNext()) {
                                    ((a) it9.next()).h(optInt, h2);
                                }
                                break;
                            } else if (c3 == 1) {
                                Iterator it10 = zyz0Var.h.a.i.iterator();
                                while (it10.hasNext()) {
                                    ((a) it10.next()).i(h2);
                                }
                                break;
                            } else if (c3 == 2) {
                                Iterator it11 = zyz0Var.h.a.i.iterator();
                                while (it11.hasNext()) {
                                    ((a) it11.next()).j(h2);
                                }
                                break;
                            } else if (c3 == 3) {
                                int[] h3 = zyz0.h(jSONObject.getJSONArray("itemIds"));
                                exc0.j(h3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                if (optJSONArray != null) {
                                    ArrayList e = o0a.e(h3);
                                    int optInt2 = jSONObject.optInt("insertBefore", 0);
                                    int[] h4 = zyz0.h(optJSONArray);
                                    exc0.i(h4);
                                    ArrayList e2 = o0a.e(h4);
                                    Iterator it12 = zyz0Var.h.a.i.iterator();
                                    while (it12.hasNext()) {
                                        ((a) it12.next()).l(optInt2, e, e2);
                                    }
                                    break;
                                } else {
                                    Iterator it13 = zyz0Var.h.a.i.iterator();
                                    while (it13.hasNext()) {
                                        ((a) it13.next()).g(h3);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case '\b':
                    zyz0Var.t.d(optLong, 0, null);
                    zyz0Var.g("QUEUE_ITEMS", jSONObject);
                    if (zyz0Var.h == null) {
                        break;
                    } else {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[jSONArray2.length()];
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            mediaQueueItemArr[i3] = new MediaQueueItem.a(jSONArray2.getJSONObject(i3)).a();
                        }
                        Iterator it14 = zyz0Var.h.a.i.iterator();
                        while (it14.hasNext()) {
                            ((a) it14.next()).k(mediaQueueItemArr);
                        }
                        break;
                    }
            }
        } catch (JSONException e3) {
            o100Var.c("Message is malformed (%s); ignoring: %s", e3.getMessage(), str);
        }
    }

    public final void b(@NonNull d dVar, long j) {
        exc0.e("Must be called from the main thread.");
        if (dVar != null) {
            ConcurrentHashMap concurrentHashMap = this.j;
            if (concurrentHashMap.containsKey(dVar)) {
                return;
            }
            Long valueOf = Long.valueOf(j);
            ConcurrentHashMap concurrentHashMap2 = this.k;
            k301 k301Var = (k301) concurrentHashMap2.get(valueOf);
            if (k301Var == null) {
                k301Var = new k301(this, j);
                concurrentHashMap2.put(valueOf, k301Var);
            }
            k301Var.a.add(dVar);
            concurrentHashMap.put(dVar, k301Var);
            if (k()) {
                lvf0 lvf0Var = k301Var.e;
                zzfk zzfkVar = lvf0Var.b;
                g301 g301Var = k301Var.c;
                zzfkVar.removeCallbacks(g301Var);
                k301Var.d = true;
                lvf0Var.b.postDelayed(g301Var, k301Var.b);
            }
        }
    }

    public final long c() {
        long j;
        MediaStatus mediaStatus;
        AdBreakStatus adBreakStatus;
        synchronized (this.a) {
            exc0.e("Must be called from the main thread.");
            zyz0 zyz0Var = this.c;
            j = 0;
            if (zyz0Var.e != 0 && (mediaStatus = zyz0Var.f) != null && (adBreakStatus = mediaStatus.t) != null) {
                double d2 = mediaStatus.e;
                double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                if (d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    d2 = 1.0d;
                }
                if (mediaStatus.f == 2) {
                    d3 = d2;
                }
                j = zyz0Var.f(d3, adBreakStatus.c, 0L);
            }
        }
        return j;
    }

    public final long d() {
        long o;
        synchronized (this.a) {
            exc0.e("Must be called from the main thread.");
            o = this.c.o();
        }
        return o;
    }

    public final int e() {
        int i;
        synchronized (this.a) {
            try {
                exc0.e("Must be called from the main thread.");
                MediaStatus h = h();
                i = h != null ? h.g : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Nullable
    public final MediaQueueItem f() {
        exc0.e("Must be called from the main thread.");
        MediaStatus h = h();
        if (h == null) {
            return null;
        }
        return h.j(h.m);
    }

    @Nullable
    public final MediaInfo g() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            exc0.e("Must be called from the main thread.");
            MediaStatus mediaStatus = this.c.f;
            mediaInfo = mediaStatus == null ? null : mediaStatus.b;
        }
        return mediaInfo;
    }

    @Nullable
    public final MediaStatus h() {
        MediaStatus mediaStatus;
        synchronized (this.a) {
            exc0.e("Must be called from the main thread.");
            mediaStatus = this.c.f;
        }
        return mediaStatus;
    }

    public final int i() {
        int i;
        synchronized (this.a) {
            try {
                exc0.e("Must be called from the main thread.");
                MediaStatus h = h();
                i = h != null ? h.f : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final long j() {
        long j;
        synchronized (this.a) {
            exc0.e("Must be called from the main thread.");
            MediaStatus mediaStatus = this.c.f;
            MediaInfo mediaInfo = mediaStatus == null ? null : mediaStatus.b;
            j = mediaInfo != null ? mediaInfo.f : 0L;
        }
        return j;
    }

    public final boolean k() {
        exc0.e("Must be called from the main thread.");
        return l() || B() || p() || o() || n();
    }

    public final boolean l() {
        exc0.e("Must be called from the main thread.");
        MediaStatus h = h();
        return h != null && h.f == 4;
    }

    public final boolean m() {
        exc0.e("Must be called from the main thread.");
        MediaInfo g = g();
        return g != null && g.c == 2;
    }

    public final boolean n() {
        exc0.e("Must be called from the main thread.");
        MediaStatus h = h();
        return (h == null || h.m == 0) ? false : true;
    }

    public final boolean o() {
        exc0.e("Must be called from the main thread.");
        MediaStatus h = h();
        if (h == null) {
            return false;
        }
        if (h.f != 3) {
            return m() && e() == 2;
        }
        return true;
    }

    public final boolean p() {
        exc0.e("Must be called from the main thread.");
        MediaStatus h = h();
        return h != null && h.f == 2;
    }

    public final boolean q() {
        exc0.e("Must be called from the main thread.");
        MediaStatus h = h();
        return h != null && h.s;
    }

    @NonNull
    public final void r() {
        exc0.e("Must be called from the main thread.");
        if (H()) {
            J(new vvz0(this));
        } else {
            G();
        }
    }

    @NonNull
    public final void s() {
        exc0.e("Must be called from the main thread.");
        if (H()) {
            J(new mvz0(this));
        } else {
            G();
        }
    }

    public final void t(@NonNull a aVar) {
        exc0.e("Must be called from the main thread.");
        if (aVar != null) {
            this.i.add(aVar);
        }
    }

    public final void u(@NonNull d dVar) {
        exc0.e("Must be called from the main thread.");
        k301 k301Var = (k301) this.j.remove(dVar);
        if (k301Var != null) {
            HashSet hashSet = k301Var.a;
            hashSet.remove(dVar);
            if (hashSet.isEmpty()) {
                this.k.remove(Long.valueOf(k301Var.b));
                k301Var.e.b.removeCallbacks(k301Var.c);
                k301Var.d = false;
            }
        }
    }

    @NonNull
    public final BasePendingResult v(@NonNull ay10 ay10Var) {
        exc0.e("Must be called from the main thread.");
        if (!H()) {
            return G();
        }
        hzz0 hzz0Var = new hzz0(this, ay10Var);
        J(hzz0Var);
        return hzz0Var;
    }

    @NonNull
    @Deprecated
    public final void w(long j) {
        v(new ay10(j, false));
    }

    public final void x() {
        exc0.e("Must be called from the main thread.");
        int i = i();
        if (i == 4 || i == 2) {
            exc0.e("Must be called from the main thread.");
            if (H()) {
                J(new lyz0(this));
                return;
            } else {
                G();
                return;
            }
        }
        exc0.e("Must be called from the main thread.");
        if (H()) {
            J(new yyz0(this));
        } else {
            G();
        }
    }

    public final void y(@NonNull a aVar) {
        exc0.e("Must be called from the main thread.");
        if (aVar != null) {
            this.i.remove(aVar);
        }
    }

    public final void z(@Nullable a401 a401Var) {
        dz9.d dVar;
        ho01 ho01Var = this.f;
        if (ho01Var == a401Var) {
            return;
        }
        if (ho01Var != null) {
            zyz0 zyz0Var = this.c;
            List list = zyz0Var.d;
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((yzz0) it.next()).e(2002);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zyz0Var.m();
            this.e.a();
            exc0.e("Must be called from the main thread.");
            String str = this.c.b;
            a401 a401Var2 = (a401) ho01Var;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            HashMap hashMap = a401Var2.s;
            synchronized (hashMap) {
                dVar = (dz9.d) hashMap.remove(str);
            }
            f5o0.a a2 = f5o0.a();
            a2.a = new o36(a401Var2, dVar, str);
            a2.e = 8414;
            a401Var2.doWrite(a2.a());
            this.d.a = null;
            this.b.removeCallbacksAndMessages(null);
        }
        this.f = a401Var;
        if (a401Var != null) {
            this.d.a = a401Var;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
    /* loaded from: classes.dex */
    public static abstract class a {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public void m() {
        }

        public void g(@NonNull int[] iArr) {
        }

        public void i(@NonNull int[] iArr) {
        }

        public void j(@NonNull int[] iArr) {
        }

        public void k(@NonNull MediaQueueItem[] mediaQueueItemArr) {
        }

        public void h(int i, @NonNull int[] iArr) {
        }

        public void l(int i, @NonNull ArrayList arrayList, @NonNull ArrayList arrayList2) {
        }

        public void f(@NonNull String str, long j, int i, long j2, long j3) {
        }
    }
}
