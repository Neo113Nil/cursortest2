package xsna;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import com.vk.accountmanager.di.AccountManagerComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.metrics.reporters.AnrAppExitExceptions;
import com.vk.music.offline.core.database.OfflineAudioDatabase;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.superapp.vkworkout.di.VkWorkoutComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.onl;
import xsna.xcr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cp implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x015a, code lost:
    
        r3 = r14.getTraceInputStream();
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        int reason2;
        String str;
        String description;
        int importance;
        long pss;
        long rss;
        int pid;
        String description2;
        InputStream traceInputStream;
        Iterator it;
        boolean z;
        int i = this.b;
        int i2 = 10;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((AccountManagerComponentImpl) obj).c;
            case 1:
                return ((SensorManager) ((wpj) obj).c.getValue()).getDefaultSensor(1);
            case 2:
                onl.a aVar = ((onl) obj).a;
                return xcr0.a(new xcr0.a(aVar.f, aVar.b.getApplicationContext(), aVar.c, aVar.g, aVar.j));
            case 3:
                return ((nx50) obj).F0().Ue();
            case 4:
                return new jlb(OfflineAudioDatabase.j.a(((OfflineAudioComponentImpl) obj).a).C());
            case 5:
                VKApplication vKApplication = (VKApplication) obj;
                VKApplication.a aVar2 = VKApplication.c;
                com.vk.metrics.reporters.a aVar3 = (com.vk.metrics.reporters.a) ow90.c.getValue();
                aVar3.getClass();
                if (gz80.a(30)) {
                    historicalProcessExitReasons = ((ActivityManager) vKApplication.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 5);
                    if (!historicalProcessExitReasons.isEmpty()) {
                        Long[] n = Preference.n("application_exit_info", "processed_timestamps");
                        Long[] n2 = Preference.n("application_exit_info", "processed_reasons");
                        ArrayList o = e43.o(Arrays.copyOf(n, n.length));
                        ArrayList o2 = e43.o(Arrays.copyOf(n2, n2.length));
                        Iterator it2 = historicalProcessExitReasons.iterator();
                        while (it2.hasNext()) {
                            ApplicationExitInfo a = i7s.a(it2.next());
                            reason = a.getReason();
                            if (!com.vk.metrics.reporters.a.b.contains(Integer.valueOf(reason))) {
                                timestamp = a.getTimestamp();
                                int indexOf = o.indexOf(Long.valueOf(timestamp));
                                if (indexOf != -1) {
                                    long j = reason;
                                    if (((Number) o2.get(indexOf)).longValue() != j) {
                                        o2.set(indexOf, Long.valueOf(j));
                                    }
                                } else {
                                    o.add(Long.valueOf(timestamp));
                                    o2.add(Long.valueOf(reason));
                                }
                                reason2 = a.getReason();
                                if (reason2 != 6 || traceInputStream == null) {
                                    str = null;
                                } else {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream, emb.b), 8192);
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        a0a.a(bufferedReader, new ape0(arrayList, 17));
                                        bufferedReader.close();
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it3 = arrayList.iterator();
                                        boolean z2 = false;
                                        while (it3.hasNext()) {
                                            Object next = it3.next();
                                            if (z2) {
                                                arrayList2.add(next);
                                                it = it3;
                                            } else {
                                                it = it3;
                                                if (aVar3.a.f((String) next)) {
                                                    arrayList2.add(next);
                                                    it3 = it;
                                                    z2 = true;
                                                }
                                            }
                                            it3 = it;
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it4 = arrayList2.iterator();
                                        while (it4.hasNext()) {
                                            Object next2 = it4.next();
                                            if (drm0.N((String) next2)) {
                                                str = j5g.g0(arrayList3, "\n", null, null, 0, null, 62);
                                            } else {
                                                arrayList3.add(next2);
                                            }
                                        }
                                        str = j5g.g0(arrayList3, "\n", null, null, 0, null, 62);
                                    } finally {
                                    }
                                }
                                String h = DevNullEventKey.APPLICATION_EXIT_INFO.h();
                                description = a.getDescription();
                                String valueOf = String.valueOf(timestamp);
                                importance = a.getImportance();
                                pss = a.getPss();
                                rss = a.getRss();
                                pid = a.getPid();
                                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, null, null, Integer.valueOf(reason), description, Integer.valueOf(importance), valueOf, Integer.valueOf((int) pss), null, Integer.valueOf((int) rss), null, Integer.valueOf(pid), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2810, 3, null);
                                l5m l5mVar = new l5m(null, null, 3);
                                l5mVar.g = schemeStat$TypeDevNullItem;
                                l5mVar.q();
                                if (str != null && !drm0.N(str)) {
                                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                                    bpn0 bpn0Var = AnrAppExitExceptions.b;
                                    description2 = a.getDescription();
                                    bVar.a(AnrAppExitExceptions.a.a(description2, str));
                                }
                            }
                        }
                        SharedPreferences.Editor edit = Preference.f("application_exit_info").edit();
                        Long[] lArr = (Long[]) o.toArray(new Long[0]);
                        Long[] lArr2 = (Long[]) o2.toArray(new Long[0]);
                        if (!Arrays.equals(n, lArr)) {
                            edit.putString("processed_timestamps", j5g.g0(rl3.o0(10, lArr), StringUtils.COMMA, null, null, 0, null, 62));
                        }
                        if (!Arrays.equals(n2, lArr2)) {
                            edit.putString("processed_reasons", j5g.g0(rl3.o0(10, lArr2), StringUtils.COMMA, null, null, 0, null, 62));
                        }
                        edit.apply();
                    }
                }
                return s3q0.a;
            case 6:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_A_PLUS_MARK_ENABLED;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 7:
                jau0 jau0Var = (jau0) obj;
                qng h2 = com.vk.toggle.d.h();
                shx0 b = com.vk.toggle.d.l0.b();
                if (b == null) {
                    shx0.b.getClass();
                    b = shx0.d;
                }
                ImFeatures imFeatures = ImFeatures.IM_CHANNEL_WS_QUERY_USERAGENT;
                imFeatures.getClass();
                com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                boolean a2 = bVar2.a(imFeatures);
                whx0 b2 = com.vk.toggle.d.m0.b();
                if (b2 == null) {
                    whx0.d.getClass();
                    b2 = whx0.e;
                }
                gau0 gau0Var = new gau0(h2, a2);
                pdh0 pdh0Var = new pdh0(jau0Var);
                eul0 eul0Var = new eul0(7);
                wqf0 wqf0Var = new wqf0(i2);
                int i3 = h2.a;
                Pair<Boolean, Long> pair = b.a;
                if (!b2.a) {
                    b2 = null;
                }
                wwe0 wwe0Var = b2 != null ? new wwe0(b2.b, b2.c) : null;
                CoreFeatures coreFeatures = CoreFeatures.COMMON_WEBSOCKET_API;
                coreFeatures.getClass();
                return new vzp(gau0Var, pdh0Var, eul0Var, wqf0Var, i3, pair, wwe0Var, bVar2.a(coreFeatures));
            default:
                VkWorkoutComponentImpl vkWorkoutComponentImpl = (VkWorkoutComponentImpl) obj;
                return new a2w0(vkWorkoutComponentImpl.a.Wb(), vkWorkoutComponentImpl.Te());
        }
    }
}
