package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.music.MusicTrack;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.geo.impl.presentation.GeoDataSet;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.avw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class wa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wa(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                int i2 = AbsFollowersListFragment.Y;
                ((CustomSwipeRefreshLayout) obj5).setVisibility(8);
                ((ViewGroup) obj4).setVisibility(8);
                ((ViewGroup) obj3).setVisibility(8);
                ((ViewGroup) obj2).setVisibility(0);
                break;
            case 1:
                c07 c07Var = (c07) obj5;
                MusicTrack musicTrack = (MusicTrack) obj4;
                ms1 ms1Var = (ms1) obj3;
                Activity activity = (Activity) obj2;
                if (c07Var.i.contains(musicTrack.Fb())) {
                    ms1Var.M(activity, musicTrack);
                    c07Var.i.remove(musicTrack.Fb());
                }
                break;
            case 2:
                com.vk.geo.impl.presentation.b bVar = (com.vk.geo.impl.presentation.b) obj5;
                ont ontVar = (ont) obj2;
                GeoDataSet geoDataSet = bVar.s;
                HashSet M0 = j5g.M0(geoDataSet.b().b.values());
                bVar.Y((BoundingBox) obj4, (List) obj3, false);
                dgu dguVar = ontVar.d;
                zk3<StringId, VisibleStyle> zk3Var = ontVar.e;
                if (dguVar == null) {
                    break;
                } else {
                    ArrayList arrayList = dguVar.a;
                    Set g = izi0.g(j5g.S0(geoDataSet.b().b.values()), M0);
                    Set<StringId> keySet = geoDataSet.b().b.keySet();
                    EmptySet emptySet = EmptySet.b;
                    jo00 jo00Var = new jo00(keySet, emptySet, g, emptySet, zk3Var, false, obj);
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"newState = " + jo00Var});
                    }
                    el3 el3Var = new el3(arrayList.size());
                    Map<StringId, akt> d = sni.d(arrayList.size(), 2);
                    zk3 zk3Var2 = new zk3(zk3Var.d);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        akt aktVar = (akt) it.next();
                        LinkedHashMap<StringId, elb0> linkedHashMap = aktVar.c;
                        elb0 elb0Var = aktVar.b;
                        if (!linkedHashMap.isEmpty()) {
                            do00 do00Var = geoDataSet.b().b.get(new StringId(elb0Var.b));
                            if (do00Var != null) {
                                el3Var.add(do00Var);
                                d.put(new StringId(elb0Var.b), akt.b(aktVar));
                                VisibleStyle a = qqm0.a(zk3Var, do00Var.b);
                                if (a != null) {
                                    zk3Var2.put(do00Var, new VisibleStyle(VisibleStyle.G(a.b)));
                                }
                            }
                        }
                    }
                    geoDataSet.b().g = dguVar;
                    geoDataSet.b().a = el3Var;
                    geoDataSet.b().d = d;
                    geoDataSet.b().e = zk3Var;
                    bVar.y = jo00Var;
                    bVar.r = myc0.h(bVar.n, hqu0.a(), null, new kkt(zk3Var2, bVar, null), 2);
                    break;
                }
            case 3:
                avw avwVar = (avw) obj4;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj3;
                yvj yvjVar = (yvj) obj2;
                long longValue = ((Long) obj).longValue();
                mtk0 mtk0Var = (mtk0) ((wh50) obj5).getValue();
                long longValue2 = mtk0Var != null ? ((Number) mtk0Var.getValue()).longValue() : longValue;
                long j = avwVar.c;
                ci50<avw.a<?, ?>> ci50Var = avwVar.a;
                if (j == Long.MIN_VALUE || ref$FloatRef.element != nkn0.h(yvjVar.getCoroutineContext())) {
                    avwVar.c = longValue;
                    avw.a<?, ?>[] aVarArr = ci50Var.b;
                    int i3 = ci50Var.d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        aVarArr[i4].i = true;
                    }
                    ref$FloatRef.element = nkn0.h(yvjVar.getCoroutineContext());
                }
                float f = ref$FloatRef.element;
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    avw.a<?, ?>[] aVarArr2 = ci50Var.b;
                    int i5 = ci50Var.d;
                    for (int i6 = 0; i6 < i5; i6++) {
                        avw.a<?, ?> aVar = aVarArr2[i6];
                        ((zak0) aVar.e).setValue(aVar.g.c);
                        aVar.i = true;
                    }
                } else {
                    long j2 = (long) ((longValue2 - avwVar.c) / f);
                    avw.a<?, ?>[] aVarArr3 = ci50Var.b;
                    int i7 = ci50Var.d;
                    boolean z = true;
                    for (int i8 = 0; i8 < i7; i8++) {
                        avw.a<?, ?> aVar2 = aVarArr3[i8];
                        if (!aVar2.h) {
                            ((zak0) avw.this.b).setValue(Boolean.FALSE);
                            if (aVar2.i) {
                                aVar2.i = false;
                                aVar2.j = j2;
                            }
                            long j3 = j2 - aVar2.j;
                            ((zak0) aVar2.e).setValue(aVar2.g.e(j3));
                            aVar2.h = aVar2.g.c(j3);
                        }
                        if (!aVar2.h) {
                            z = false;
                        }
                    }
                    ((zak0) avwVar.d).setValue(Boolean.valueOf(!z));
                }
                break;
            default:
                br30 br30Var = (br30) obj5;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                wq30 wq30Var = (wq30) obj3;
                AttachGift attachGift = (AttachGift) obj2;
                if (br30Var.d > 0) {
                    ref$ObjectRef.element = null;
                }
                pk30 pk30Var = wq30Var.u;
                if (pk30Var != null) {
                    pk30Var.S(attachGift, (Boolean) ref$ObjectRef.element, br30Var.g);
                }
                break;
        }
        return s3q0.a;
    }
}
