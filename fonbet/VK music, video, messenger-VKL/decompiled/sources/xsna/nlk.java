package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.log.L;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.members.VoipDataProvider;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.il90;

/* compiled from: CurrentSpeakerController.kt */
/* loaded from: classes7.dex */
public final class nlk implements il90 {
    public static final nlk b;
    public static final io.reactivex.rxjava3.subjects.f<List<CallMember>> c;
    public static final Handler d;
    public static final LinkedHashMap<CallMemberId, Pair<String, Long>> e;
    public static final ArrayList f;
    public static final jqt g;

    /* compiled from: CurrentSpeakerController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<List<? extends CallMember>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends CallMember> list) {
            nlk nlkVar = (nlk) this.receiver;
            nlk nlkVar2 = nlk.b;
            nlkVar.getClass();
            nlk.e(list);
            return s3q0.a;
        }
    }

    /* compiled from: CurrentSpeakerController.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    static {
        nlk nlkVar = new nlk();
        b = nlkVar;
        io.reactivex.rxjava3.subjects.f<List<CallMember>> fVar = new io.reactivex.rxjava3.subjects.f<>();
        c = fVar;
        d = new Handler(Looper.getMainLooper());
        e = new LinkedHashMap<>();
        f = new ArrayList(1);
        com.vk.voip.ui.c.b.getClass();
        g = new jqt(com.vk.voip.ui.c.j, new sm(17));
        io.reactivex.rxjava3.internal.operators.observable.t2 w0 = fVar.w0(300L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.y(w0.a0(asu0.i()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0Var.d()).subscribe(new sv(new a(1, nlkVar, nlk.class, "onNewAudioLevels", "onNewAudioLevels(Ljava/util/List;)V", 0), 24));
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3);
        sb.append(str);
        if (!drm0.N(str2)) {
            sb.append(' ');
            sb.append(str2.charAt(0));
            sb.append(JwtParser.SEPARATOR_CHAR);
        }
        return sb.toString();
    }

    public static void c() {
        Iterator it = f.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static void e(List list) {
        LinkedHashMap<CallMemberId, Pair<String, Long>> linkedHashMap;
        boolean z;
        jqt jqtVar = g;
        if (jqtVar.a.c()) {
            jqtVar.c = list;
            return;
        }
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.w0()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedHashMap = e;
                if (!hasNext) {
                    break;
                }
                CallMember callMember = (CallMember) it.next();
                boolean z2 = callMember.m;
                CallMemberId callMemberId = callMember.a;
                if (z2 && !linkedHashMap.containsKey(callMemberId)) {
                    arrayList.add(callMemberId);
                } else if (!callMember.m && linkedHashMap.containsKey(callMemberId)) {
                    arrayList2.add(callMemberId);
                }
            }
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((CallMember) it2.next()).a);
            }
            Set S0 = j5g.S0(arrayList3);
            for (CallMemberId callMemberId2 : linkedHashMap.keySet()) {
                if (!S0.contains(callMemberId2)) {
                    arrayList2.add(callMemberId2);
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!arrayList2.isEmpty()) {
                final LongSparseArray longSparseArray = new LongSparseArray(arrayList2.size());
                Iterator it3 = arrayList2.iterator();
                loop3: while (true) {
                    z = false;
                    while (it3.hasNext()) {
                        CallMemberId callMemberId3 = (CallMemberId) it3.next();
                        Pair<String, Long> pair = linkedHashMap.get(callMemberId3);
                        if (pair != null) {
                            long longValue = pair.j().longValue();
                            if (elapsedRealtime - longValue < 700) {
                                ArrayList arrayList4 = (ArrayList) longSparseArray.get(longValue);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    longSparseArray.put(longValue, arrayList4);
                                }
                                arrayList4.add(callMemberId3);
                            } else if (linkedHashMap.remove(callMemberId3) != null || z) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    c();
                }
                if (longSparseArray.size() != 0) {
                    int size = longSparseArray.size();
                    for (final int i = 0; i < size; i++) {
                        d.postDelayed(new Runnable() { // from class: xsna.mlk
                            @Override // java.lang.Runnable
                            public final void run() {
                                Iterator it4 = ((Iterable) longSparseArray.valueAt(i)).iterator();
                                while (it4.hasNext()) {
                                    nlk.e.remove((CallMemberId) it4.next());
                                }
                                nlk.b.getClass();
                                nlk.c();
                            }
                        }, (longSparseArray.keyAt(i) + IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED) - elapsedRealtime);
                    }
                }
            }
            com.vk.voip.ui.c.b.getClass();
            VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
            if (voipDataProvider == null) {
                voipDataProvider = null;
            }
            io.reactivex.rxjava3.kotlin.c.e(voipDataProvider.j(arrayList), new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), new lz0(arrayList, 26));
        }
    }

    public final void a() {
        e.clear();
        f.clear();
        g.c = null;
    }

    @Override // xsna.il90
    public final void d(il90.a aVar) {
        c.onNext(aVar.c);
    }

    @Override // xsna.il90
    public final void h(il90.c cVar) {
        c.onNext(cVar.d);
    }

    @Override // xsna.il90
    public final void s(il90.d dVar) {
        c.onNext(dVar.c);
    }

    @Override // xsna.il90
    public final void t(il90.e eVar) {
        c.onNext(eVar.b);
    }

    @Override // xsna.il90
    public final void x(il90.b bVar) {
        c.onNext(bVar.c);
    }
}
