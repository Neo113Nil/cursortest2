package xsna;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Aa;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.common.recycler.animators.ItemAnimationType;
import com.vk.stat.recycler.Measurement;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.mjw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Aa.c((LevelPlayAdInfo) this.c, (Aa) this.d);
                return;
            case 1:
                com.vk.stat.recycler.b bVar = (com.vk.stat.recycler.b) this.c;
                Measurement measurement = (Measurement) this.d;
                Map<Measurement.Type, Map<Integer, com.vk.stat.recycler.a>> map = bVar.c;
                Measurement.Type type = measurement.b;
                int i = measurement.a;
                Map<Integer, com.vk.stat.recycler.a> map2 = map.get(type);
                if (map2 == null) {
                    map2 = new LinkedHashMap<>();
                    map.put(type, map2);
                }
                Map<Integer, com.vk.stat.recycler.a> map3 = map2;
                Integer valueOf = Integer.valueOf(i);
                com.vk.stat.recycler.a aVar = map3.get(valueOf);
                if (aVar == null) {
                    aVar = new com.vk.stat.recycler.a(i, type, measurement.d);
                    bVar.d.add(aVar);
                    map3.put(valueOf, aVar);
                }
                com.vk.stat.recycler.a aVar2 = aVar;
                ArrayList arrayList = measurement.e ? aVar2.e : aVar2.d;
                if (arrayList.size() < 100) {
                    arrayList.add(measurement);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) this.c;
                jxq jxqVar = (jxq) this.d;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    bsa bsaVar = (bsa) it.next();
                    nbf0 nbf0Var = jxqVar.h;
                    ArrayList arrayList3 = jxqVar.t;
                    nbf0Var.getClass();
                    ?? r8 = jxqVar.v;
                    RecyclerView.e0 e0Var = bsaVar.a;
                    View view = e0Var != null ? e0Var.itemView : null;
                    RecyclerView.e0 e0Var2 = bsaVar.b;
                    View view2 = e0Var2 != null ? e0Var2.itemView : null;
                    if (e0Var != null && view != null) {
                        ViewPropertyAnimator animate = view.animate();
                        aux auxVar = (aux) ((Map) r8.getValue()).get(ItemAnimationType.Change);
                        ViewPropertyAnimator duration = animate.setDuration(auxVar != null ? auxVar.a : jxqVar.f);
                        arrayList3.add(e0Var);
                        duration.translationX(bsaVar.e - bsaVar.c);
                        duration.translationY(bsaVar.f - bsaVar.d);
                        duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new ygl(jxqVar, bsaVar, duration, view, arrayList3)).start();
                    }
                    if (e0Var2 != null && view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList3.add(e0Var2);
                        ViewPropertyAnimator translationY = animate2.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        aux auxVar2 = (aux) ((Map) r8.getValue()).get(ItemAnimationType.Change);
                        translationY.setDuration(auxVar2 != null ? auxVar2.a : jxqVar.f).alpha(1.0f).setListener(new zgl(jxqVar, bsaVar, animate2, view2, arrayList3)).start();
                    }
                }
                arrayList2.clear();
                jxqVar.p.remove(arrayList2);
                return;
            case 3:
                y8c0 y8c0Var = (y8c0) this.c;
                sq60 sq60Var = (sq60) this.d;
                if (y8c0Var.a().c().A0(sq60Var.a)) {
                    return;
                }
                y8c0Var.H.d(sq60Var, (tc60) y8c0Var.a().r.getValue(), (String) ((AtomicReference) y8c0Var.k.getValue()).get());
                return;
            case 4:
                mjw0 mjw0Var = (mjw0) this.c;
                ckj0 ckj0Var = mjw0Var.e;
                ckj0 ckj0Var2 = mjw0Var.f;
                l7s l7sVar = (l7s) this.d;
                com.vk.voip.ui.c.b.getClass();
                String str = null;
                if (com.vk.voip.ui.c.D0.b.a().b) {
                    ckj0Var.w2(null);
                    ckj0Var2.w2(null);
                    return;
                }
                GroupCallViewModel.b.getClass();
                int i2 = mjw0.b.$EnumSwitchMapping$0[GroupCallViewModel.e.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ckj0Var = ckj0Var2;
                }
                nlk nlkVar = nlk.b;
                Collection<CallMemberId> g3 = ckj0Var.g3();
                nlkVar.getClass();
                LinkedHashMap<CallMemberId, Pair<String, Long>> linkedHashMap = nlk.e;
                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                for (Map.Entry<CallMemberId, Pair<String, Long>> entry : linkedHashMap.entrySet()) {
                    CallMemberId key = entry.getKey();
                    Pair<String, Long> value = entry.getValue();
                    if (!j5g.P(g3, key)) {
                        arrayList4.add(value.i());
                    }
                }
                int size = arrayList4.size();
                if (size != 0) {
                    if (size == 1) {
                        str = l7sVar.getString(R.string.voip_current_speaker, arrayList4.get(0));
                    } else if (size != 2) {
                        str = l7sVar.getString(R.string.voip_current_speakers, ((String) arrayList4.get(0)) + ", " + ((String) arrayList4.get(1)) + " +" + (size - 2));
                    } else {
                        str = l7sVar.getString(R.string.voip_current_speakers, ((String) arrayList4.get(0)) + ", " + ((String) arrayList4.get(1)));
                    }
                }
                ckj0Var.w2(str);
                return;
            case 5:
                yads.bu1.a((yads.bu1) this.c, (Throwable) this.d);
                return;
            default:
                ((com.mbridge.msdk.setting.i) this.c).j((String) this.d);
                return;
        }
    }
}
