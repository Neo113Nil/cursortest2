package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.callbacks.tracker.UndoRedoEventSubtype;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.editor.state.model.a;
import com.vk.clips.editor.state.model.e;
import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeUndoRedo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bzd;
import xsna.fzd;
import xsna.wzd;

/* compiled from: ClipsEditorStateControllerImpl.kt */
/* loaded from: classes16.dex */
public final class szd implements rzd {
    public final Context a;
    public final ufc b;
    public final bzd.f c;
    public final txd d;
    public final g2f e;
    public final ryd f;
    public final ayd g;
    public final ClipsDraftComponent h;
    public final boolean i;
    public io.reactivex.rxjava3.disposables.c k;
    public final tzd j = new tzd();
    public final LinkedList<com.vk.clips.editor.state.model.d> l = new LinkedList<>();
    public final LinkedList<com.vk.clips.editor.state.model.d> m = new LinkedList<>();
    public final HashSet<String> n = new HashSet<>();
    public com.vk.clips.editor.state.model.d o = com.vk.clips.editor.state.model.d.c;

    public szd(Context context, ufc ufcVar, bzd.f fVar, txd txdVar, g2f g2fVar, ryd rydVar, ayd aydVar, ClipsDraftComponent clipsDraftComponent, boolean z) {
        this.a = context;
        this.b = ufcVar;
        this.c = fVar;
        this.d = txdVar;
        this.e = g2fVar;
        this.f = rydVar;
        this.g = aydVar;
        this.h = clipsDraftComponent;
        this.i = z;
    }

    @Override // xsna.rzd
    public final ufc a() {
        return this.b;
    }

    @Override // xsna.rzd
    public final com.vk.clips.editor.state.model.a b() {
        com.vk.clips.editor.state.model.d last = this.m.getLast();
        if (last != null) {
            return last.a;
        }
        return null;
    }

    @Override // xsna.rzd
    public final void c(com.vk.clips.editor.state.model.a aVar, List<? extends wzd> list) {
        Object obj;
        Object obj2;
        Object obj3;
        erm0.E0(3, UUID.randomUUID().toString());
        com.vk.clips.editor.state.model.a aVar2 = this.o.a;
        ArrayList e = e(aVar, list);
        List<? extends wzd> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof wzd.a) {
                    break;
                }
            }
        }
        if (!(obj instanceof wzd.a)) {
            obj = null;
        }
        wzd.a aVar3 = (wzd.a) obj;
        if (aVar3 != null) {
            if (epx.f(aVar2, aVar)) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it2.next();
                        if (obj3 instanceof wzd.b) {
                            break;
                        }
                    }
                }
                if (!(obj3 instanceof wzd.b)) {
                    obj3 = null;
                }
                if (((wzd.b) obj3) == null && !aVar3.a) {
                    return;
                }
            }
            LinkedList<com.vk.clips.editor.state.model.d> linkedList = this.m;
            com.vk.clips.editor.state.model.d dVar = (com.vk.clips.editor.state.model.d) j5g.k0(linkedList);
            if (dVar != null) {
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof wzd.b) {
                            break;
                        }
                    }
                }
                if (!(obj2 instanceof wzd.b)) {
                    obj2 = null;
                }
                wzd.b bVar = (wzd.b) obj2;
                com.vk.clips.editor.state.model.b bVar2 = bVar != null ? bVar.a : null;
                if (bVar2 != null) {
                    ArrayList d = l4p.d(dVar.a.f, bVar2.a, bVar2);
                    linkedList.removeLast();
                    linkedList.addLast(new com.vk.clips.editor.state.model.d(com.vk.clips.editor.state.model.a.c(dVar.a, null, null, null, null, d, null, 95), dVar.b));
                }
            }
            linkedList.addLast(new com.vk.clips.editor.state.model.d(this.o.a, e));
            this.l.clear();
            e(this.o.a, EmptyList.b);
        }
    }

    public final void d(boolean z) {
        Object obj;
        qzd j;
        LinkedList<com.vk.clips.editor.state.model.d> linkedList = this.m;
        if (linkedList.size() > 1) {
            com.vk.clips.editor.state.model.d removeLast = linkedList.removeLast();
            this.l.addFirst(removeLast);
            e(linkedList.getLast().a, removeLast.b);
            Iterator<T> it = removeLast.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (obj instanceof wzd.a) {
                        break;
                    }
                }
            }
            if (!(obj instanceof wzd.a)) {
                obj = null;
            }
            wzd.a aVar = (wzd.a) obj;
            luc lucVar = aVar != null ? aVar.b : null;
            if (lucVar == null || !z) {
                return;
            }
            bzd bzdVar = bzd.this;
            Integer b = lucVar.b();
            if (b != null) {
                String s = wlb0.s(b.intValue(), bzdVar.c.getCtx());
                s0e s0eVar = bzdVar.h.l;
                s0e s0eVar2 = s0eVar != null ? s0eVar : null;
                s0eVar2.h().setText(s);
                if (f4m.h(s0eVar2.h())) {
                    s0eVar2.h().clearAnimation();
                    d3m.e(s0eVar2.h(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 3000L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                } else {
                    d3m.c(s0eVar2.h(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new pu5(s0eVar2, 2), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            UndoRedoEventSubtype c = lucVar.c();
            if (c == null || (j = bzdVar.j()) == null) {
                return;
            }
            j.a(new MobileOfficialAppsClipsStat$TypeUndoRedo(MobileOfficialAppsClipsStat$TypeUndoRedo.EventType.UNDO, MobileOfficialAppsClipsStat$TypeUndoRedo.EventSubtype.valueOf(c.name())));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x038f, code lost:
    
        if (xsna.epx.f(r10, r14) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x046c, code lost:
    
        if (xsna.epx.f(r10, r14) != false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x071c A[LOOP:17: B:231:0x0716->B:233:0x071c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0750 A[LOOP:18: B:236:0x074a->B:238:0x0750, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0692 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList e(com.vk.clips.editor.state.model.a aVar, List list) {
        tzd tzdVar;
        boolean z;
        List<List<com.vk.clips.editor.state.model.b>> list2;
        yzd yzdVar;
        Iterator it;
        Object obj;
        wzd.c cVar;
        Long l;
        yzd yzdVar2;
        com.vk.clips.editor.state.model.a aVar2;
        s0e s0eVar;
        int i;
        yzd yzdVar3;
        Iterator it2;
        Object obj2;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it3;
        t0e t0eVar;
        Float f;
        int d;
        Float valueOf;
        Float f2;
        ArrayList arrayList3;
        List<com.vk.clips.editor.state.model.c> list3;
        ClipsEditorAudioItem clipsEditorAudioItem;
        kyd kydVar;
        Iterator it4;
        Iterator it5;
        bzd bzdVar = bzd.this;
        ArrayList arrayList4 = new ArrayList();
        List<List<ClipsEditorAudioItem>> list4 = aVar.e;
        List<List<com.vk.clips.editor.state.model.b>> list5 = aVar.f;
        List<com.vk.clips.editor.state.model.c> list6 = aVar.c;
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it6 = list4.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            tzdVar = this.j;
            if (!hasNext) {
                break;
            }
            List list7 = (List) it6.next();
            ArrayList arrayList6 = new ArrayList();
            Iterator it7 = list7.iterator();
            while (it7.hasNext()) {
                ClipsEditorAudioItem a = tzdVar.a((ClipsEditorAudioItem) it7.next(), list6);
                if (a != null) {
                    arrayList6.add(a);
                }
            }
            ArrayList arrayList7 = !arrayList6.isEmpty() ? arrayList6 : null;
            if (arrayList7 != null) {
                arrayList5.add(arrayList7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            List list8 = (List) it8.next();
            if (list8.size() <= 1) {
                arrayList8.add(list8);
            } else {
                ArrayList arrayList9 = new ArrayList(list8);
                while (true) {
                    Iterator it9 = arrayList9.iterator();
                    int i2 = 0;
                    while (it9.hasNext()) {
                        int i3 = i2 + 1;
                        kydVar = (kyd) it9.next();
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it10 = arrayList9.iterator();
                        while (it10.hasNext()) {
                            Object next = it10.next();
                            Iterator it11 = it8;
                            Iterator it12 = it9;
                            if (!epx.f(((kyd) next).m(), kydVar.m())) {
                                arrayList10.add(next);
                            }
                            it9 = it12;
                            it8 = it11;
                        }
                        it4 = it8;
                        Iterator it13 = it9;
                        if (!arrayList10.isEmpty()) {
                            Iterator it14 = arrayList10.iterator();
                            while (it14.hasNext()) {
                                kyd kydVar2 = (kyd) it14.next();
                                if (kydVar2.getDurationMs() + ((e.b) kydVar2.getOffset()).a > ((e.b) kydVar.getOffset()).a) {
                                    it5 = it14;
                                    if (((e.b) kydVar2.getOffset()).a < kydVar.getDurationMs() + ((e.b) kydVar.getOffset()).a) {
                                        break;
                                    }
                                } else {
                                    it5 = it14;
                                }
                                it14 = it5;
                            }
                        }
                        i2 = i3;
                        it9 = it13;
                        it8 = it4;
                    }
                    arrayList8.add(Collections.singletonList(kydVar));
                    arrayList9.remove(i2);
                    it8 = it4;
                }
                arrayList8.add(arrayList9);
            }
        }
        ClipsEditorAudioItem a2 = tzdVar.a(aVar.d, list6);
        ArrayList arrayList11 = new ArrayList();
        Iterator<T> it15 = list5.iterator();
        while (it15.hasNext()) {
            List<com.vk.clips.editor.state.model.b> list9 = (List) it15.next();
            ArrayList arrayList12 = new ArrayList();
            for (com.vk.clips.editor.state.model.b bVar : list9) {
                Iterator<T> it16 = list6.iterator();
                long j = 0;
                while (it16.hasNext()) {
                    j = ((com.vk.clips.editor.state.model.c) it16.next()).getDurationMs() + j;
                }
                ArrayList arrayList13 = arrayList12;
                long min = Math.min(bVar.a(), j);
                if (min - bVar.getOffset().a < bzd.z) {
                    arrayList3 = arrayList8;
                    list3 = list6;
                    clipsEditorAudioItem = a2;
                    bVar = null;
                } else if (bVar.a() != min) {
                    nov copy = bVar.b.copy();
                    arrayList3 = arrayList8;
                    list3 = list6;
                    clipsEditorAudioItem = a2;
                    copy.getCommons().p(new q500(bVar.getOffset().a, min));
                    s3q0 s3q0Var = s3q0.a;
                    bVar = new com.vk.clips.editor.state.model.b(bVar.a, copy);
                } else {
                    arrayList3 = arrayList8;
                    list3 = list6;
                    clipsEditorAudioItem = a2;
                }
                if (bVar != null) {
                    arrayList13.add(bVar);
                }
                arrayList12 = arrayList13;
                arrayList8 = arrayList3;
                list6 = list3;
                a2 = clipsEditorAudioItem;
            }
            ArrayList arrayList14 = arrayList8;
            List<com.vk.clips.editor.state.model.c> list10 = list6;
            ClipsEditorAudioItem clipsEditorAudioItem2 = a2;
            ArrayList arrayList15 = arrayList12;
            if (arrayList15.isEmpty()) {
                arrayList15 = null;
            }
            if (arrayList15 != null) {
                arrayList11.add(arrayList15);
            }
            arrayList8 = arrayList14;
            list6 = list10;
            a2 = clipsEditorAudioItem2;
        }
        ArrayList arrayList16 = arrayList8;
        List<com.vk.clips.editor.state.model.c> list11 = list6;
        ClipsEditorAudioItem clipsEditorAudioItem3 = a2;
        ufc ufcVar = this.b;
        if (!ufcVar.b(list5, arrayList11)) {
            arrayList4.add(new wzd.b(null));
        }
        yzd yzdVar4 = aVar.b;
        boolean z3 = this.m.size() > 1;
        boolean z4 = this.l.size() > 0;
        List<com.vk.clips.editor.state.model.c> list12 = list11;
        if (!(list12 instanceof Collection) || !list12.isEmpty()) {
            Iterator<T> it17 = list12.iterator();
            while (it17.hasNext()) {
                ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem = ((com.vk.clips.editor.state.model.c) it17.next()).r;
                if (clipsEditorVideoVolumeItem.b != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !clipsEditorVideoVolumeItem.c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        Pair pair = new Pair(com.vk.clips.editor.state.model.a.c(aVar, yzd.a(yzdVar4, false, z3, z4, z, false, 17), null, clipsEditorAudioItem3, arrayList16, arrayList11, null, 69), arrayList4);
        com.vk.clips.editor.state.model.a aVar3 = (com.vk.clips.editor.state.model.a) pair.d();
        ArrayList u0 = j5g.u0((List) pair.g(), list);
        com.vk.clips.editor.state.model.a aVar4 = this.o.a;
        com.vk.clips.editor.state.model.d dVar = new com.vk.clips.editor.state.model.d(aVar3, this.o.b);
        List<com.vk.clips.editor.state.model.c> list13 = aVar3.c;
        List<List<com.vk.clips.editor.state.model.b>> list14 = aVar3.f;
        yzd yzdVar5 = aVar3.b;
        this.o = dVar;
        List<com.vk.clips.editor.state.model.c> list15 = aVar4.c;
        yzd yzdVar6 = aVar4.b;
        ClipsEditorAudioItem clipsEditorAudioItem4 = aVar4.d;
        List<List<ClipsEditorAudioItem>> list16 = aVar4.e;
        int size = list15.size();
        ClipsEditorAudioItem clipsEditorAudioItem5 = aVar3.d;
        List<List<ClipsEditorAudioItem>> list17 = aVar3.e;
        if (size == list13.size()) {
            ArrayList X0 = j5g.X0(list15, list13);
            if (!X0.isEmpty()) {
                Iterator it18 = X0.iterator();
                while (it18.hasNext()) {
                    Pair pair2 = (Pair) it18.next();
                    Iterator it19 = it18;
                    com.vk.clips.editor.state.model.c cVar2 = (com.vk.clips.editor.state.model.c) pair2.i();
                    com.vk.clips.editor.state.model.c cVar3 = (com.vk.clips.editor.state.model.c) pair2.j();
                    list2 = list14;
                    if (epx.f(cVar2.a, cVar3.a)) {
                        yzdVar = yzdVar5;
                        if (cVar2.b != cVar3.b || cVar2.c != cVar3.c || !epx.f(cVar2.h, cVar3.h) || cVar2.b() != cVar3.b() || !epx.f(cVar2.j, cVar3.j) || cVar2.s != cVar3.s || !epx.f(cVar2.k, cVar3.k) || cVar2.m != cVar3.m || !epx.f(cVar2.r, cVar3.r)) {
                            break;
                        }
                        it18 = it19;
                        yzdVar5 = yzdVar;
                        list14 = list2;
                    }
                }
            }
            list2 = list14;
            yzdVar = yzdVar5;
            com.vk.clips.editor.state.model.a aVar5 = com.vk.clips.editor.state.model.a.h;
            if (a.C0580a.a(list16).equals(a.C0580a.a(list17))) {
            }
            it = u0.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof wzd.c) {
                    break;
                }
            }
            if (!(obj instanceof wzd.c)) {
                obj = null;
            }
            cVar = (wzd.c) obj;
            c9d c9dVar = bzdVar.n;
            if (cVar != null || cVar.b) {
                l = null;
            } else {
                cVar.b = true;
                l = cVar.a.invoke(aVar3);
            }
            c9dVar.c(aVar3, Long.valueOf(swe0.i(l == null ? l.longValue() : c9dVar.n(), 0L, aVar3.e())), true);
            if (list15.size() != list13.size()) {
                ArrayList X02 = j5g.X0(list15, list13);
                if (!X02.isEmpty()) {
                    Iterator it20 = X02.iterator();
                    while (it20.hasNext()) {
                        Pair pair3 = (Pair) it20.next();
                        com.vk.clips.editor.state.model.c cVar4 = (com.vk.clips.editor.state.model.c) pair3.i();
                        com.vk.clips.editor.state.model.c cVar5 = (com.vk.clips.editor.state.model.c) pair3.j();
                        yzdVar2 = yzdVar;
                        aVar2 = aVar3;
                        if (!epx.f(cVar4.a, cVar5.a) || cVar4.b != cVar5.b || cVar4.c != cVar5.c || cVar4.b() != cVar5.b() || !epx.f(cVar4.j, cVar5.j) || cVar4.s != cVar5.s) {
                            break;
                        }
                        yzdVar = yzdVar2;
                        aVar3 = aVar2;
                    }
                }
                yzdVar2 = yzdVar;
                aVar2 = aVar3;
                if (epx.f(list16, list17)) {
                }
            } else {
                yzdVar2 = yzdVar;
                aVar2 = aVar3;
            }
            bzdVar.h.V(true);
            if (aVar2.e() == aVar4.e()) {
                Iterator<T> it21 = list13.iterator();
                long j2 = 0;
                while (it21.hasNext()) {
                    j2 += ((com.vk.clips.editor.state.model.c) it21.next()).b();
                }
                Iterator<T> it22 = aVar4.c.iterator();
                long j3 = 0;
                while (it22.hasNext()) {
                    j3 = ((com.vk.clips.editor.state.model.c) it22.next()).b() + j3;
                }
                if (j2 == j3) {
                    i = 0;
                    if (list13.size() == list15.size()) {
                        int size2 = list13.size();
                        for (int i4 = i; i4 < size2; i4++) {
                            if (epx.f(list13.get(i4).k, list15.get(i4).k)) {
                            }
                        }
                        yzdVar3 = yzdVar2;
                        if (!epx.f(yzdVar3, yzdVar6)) {
                            s0e s0eVar2 = bzdVar.h.l;
                            if (s0eVar2 == null) {
                                s0eVar2 = null;
                            }
                            s0eVar2.d();
                        }
                        if (yzdVar3.d == yzdVar6.d || yzdVar3.e != yzdVar6.e) {
                            bzdVar.n.c(bzdVar.g(), null, true);
                        }
                        if (aVar2.g.b != aVar4.g.b) {
                            t0e t0eVar2 = bzdVar.c;
                            float width = t0eVar2.getStickersInteractor().getWidth();
                            szd szdVar = bzdVar.p;
                            int i5 = (int) (width / szdVar.o.a.g.b);
                            List<com.vk.clips.editor.state.model.c> list18 = bzdVar.g().c;
                            ArrayList arrayList17 = new ArrayList(c5g.u(list18, 10));
                            for (com.vk.clips.editor.state.model.c cVar6 : list18) {
                                VideoTransform videoTransform = cVar6.k;
                                if (videoTransform == null) {
                                    t0eVar = t0eVar2;
                                } else {
                                    float f3 = videoTransform.e;
                                    int d2 = cVar6.d();
                                    Float f4 = videoTransform.f;
                                    t0eVar = t0eVar2;
                                    Float f5 = videoTransform.g;
                                    if (f3 == 0.5625f) {
                                        d = cVar6.c();
                                        f = f5;
                                    } else {
                                        f = f5;
                                        d = (int) (cVar6.d() / f3);
                                    }
                                    float f6 = d2 / width;
                                    float f7 = d / i5;
                                    if (Math.abs(f6 - 1.0f) < Math.abs(f7 - 1.0f)) {
                                        f6 = f7;
                                    }
                                    if (f == null) {
                                        valueOf = f4 != null ? Float.valueOf(f4.floatValue() / f6) : null;
                                        f2 = f4;
                                    } else {
                                        valueOf = Float.valueOf(f.floatValue() / f6);
                                        f2 = f;
                                    }
                                    cVar6 = com.vk.clips.editor.state.model.c.a(cVar6, null, 0L, 0L, null, null, null, new VideoTransform(videoTransform.b, videoTransform.c, videoTransform.d, videoTransform.e, valueOf, f2), null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 523263);
                                }
                                arrayList17.add(cVar6);
                                t0eVar2 = t0eVar;
                            }
                            t0e t0eVar3 = t0eVar2;
                            szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, arrayList17, null, null, null, null, 123), j5g.V(EmptyList.b));
                            s0e s0eVar3 = bzdVar.h.l;
                            if (s0eVar3 == null) {
                                s0eVar3 = null;
                            }
                            s0eVar3.o();
                            t0eVar3.getAnimationDelegate().e(bzdVar.g().g.b);
                            c9d c9dVar2 = bzdVar.n;
                            c9dVar2.c.addOnLayoutChangeListener(new d9d(c9dVar2, bzdVar.g()));
                        }
                        it2 = u0.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (obj2 instanceof wzd.b) {
                                break;
                            }
                        }
                        if (!(obj2 instanceof wzd.b)) {
                            obj2 = null;
                        }
                        if (((wzd.b) obj2) == null) {
                            ArrayList v = c5g.v(list2);
                            ArrayList arrayList18 = new ArrayList(c5g.u(v, 10));
                            Iterator it23 = v.iterator();
                            while (it23.hasNext()) {
                                arrayList18.add(((com.vk.clips.editor.state.model.b) it23.next()).b);
                            }
                            nal0 nal0Var = (nal0) ufcVar.b;
                            Iterator it24 = ufcVar.c(nal0Var.d().b).iterator();
                            while (it24.hasNext()) {
                                nal0Var.g((nov) it24.next());
                            }
                            nal0Var.l(ufcVar.c(arrayList18));
                            nal0Var.invalidate();
                            if (!ufcVar.b(list2, aVar4.f)) {
                                bzdVar.h.V(true);
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        List<com.vk.clips.editor.state.model.c> list19 = list13;
                        arrayList = new ArrayList(c5g.u(list19, 10));
                        for (com.vk.clips.editor.state.model.c cVar7 : list19) {
                            arrayList.add(new fzd.a(cVar7.a.getPath(), cVar7.b, cVar7.h.b));
                        }
                        ArrayList f8 = aVar4.f();
                        arrayList2 = new ArrayList(c5g.u(f8, 10));
                        it3 = f8.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((fzd) it3.next()).c);
                        }
                        if (!epx.f(j5g.S0(arrayList2), j5g.S0(arrayList))) {
                            bwd bwdVar = bzdVar.q;
                            hg1.f(bwdVar.i);
                            io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new qnb(bwdVar, 1));
                            e2e e2eVar = bwdVar.f;
                            bwdVar.i = s0Var.r0(e2eVar.i.e().c()).a0(e2eVar.i.e().d()).subscribe(new l50(new vs(bwdVar, 20), 11), new tp0(new gv3(8), 10));
                        }
                        if (!this.i) {
                            this.d.b(sxd.a(aVar4), sxd.a(aVar2), z2);
                        }
                        this.n.addAll(y000.a(list13));
                        return u0;
                    }
                    q0e q0eVar = bzdVar.h;
                    q0eVar.W(q0eVar.T().g(), (int) q0eVar.T().getStickerRotation(), q0eVar.T().j());
                    yzdVar3 = yzdVar2;
                    if (!epx.f(yzdVar3, yzdVar6)) {
                    }
                    if (yzdVar3.d == yzdVar6.d) {
                    }
                    bzdVar.n.c(bzdVar.g(), null, true);
                    if (aVar2.g.b != aVar4.g.b) {
                    }
                    it2 = u0.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                        }
                    }
                    if (!(obj2 instanceof wzd.b)) {
                    }
                    if (((wzd.b) obj2) == null) {
                    }
                    List<com.vk.clips.editor.state.model.c> list192 = list13;
                    arrayList = new ArrayList(c5g.u(list192, 10));
                    while (r0.hasNext()) {
                    }
                    ArrayList f82 = aVar4.f();
                    arrayList2 = new ArrayList(c5g.u(f82, 10));
                    it3 = f82.iterator();
                    while (it3.hasNext()) {
                    }
                    if (!epx.f(j5g.S0(arrayList2), j5g.S0(arrayList))) {
                    }
                    if (!this.i) {
                    }
                    this.n.addAll(y000.a(list13));
                    return u0;
                }
            }
            s0eVar = bzdVar.h.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.d();
            i = 0;
            bzdVar.q.d(false);
            if (list13.size() == list15.size()) {
            }
            q0e q0eVar2 = bzdVar.h;
            q0eVar2.W(q0eVar2.T().g(), (int) q0eVar2.T().getStickerRotation(), q0eVar2.T().j());
            yzdVar3 = yzdVar2;
            if (!epx.f(yzdVar3, yzdVar6)) {
            }
            if (yzdVar3.d == yzdVar6.d) {
            }
            bzdVar.n.c(bzdVar.g(), null, true);
            if (aVar2.g.b != aVar4.g.b) {
            }
            it2 = u0.iterator();
            while (true) {
                if (it2.hasNext()) {
                }
            }
            if (!(obj2 instanceof wzd.b)) {
            }
            if (((wzd.b) obj2) == null) {
            }
            List<com.vk.clips.editor.state.model.c> list1922 = list13;
            arrayList = new ArrayList(c5g.u(list1922, 10));
            while (r0.hasNext()) {
            }
            ArrayList f822 = aVar4.f();
            arrayList2 = new ArrayList(c5g.u(f822, 10));
            it3 = f822.iterator();
            while (it3.hasNext()) {
            }
            if (!epx.f(j5g.S0(arrayList2), j5g.S0(arrayList))) {
            }
            if (!this.i) {
            }
            this.n.addAll(y000.a(list13));
            return u0;
        }
        list2 = list14;
        yzdVar = yzdVar5;
        it = u0.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (!(obj instanceof wzd.c)) {
        }
        cVar = (wzd.c) obj;
        c9d c9dVar3 = bzdVar.n;
        if (cVar != null) {
        }
        l = null;
        c9dVar3.c(aVar3, Long.valueOf(swe0.i(l == null ? l.longValue() : c9dVar3.n(), 0L, aVar3.e())), true);
        if (list15.size() != list13.size()) {
        }
        bzdVar.h.V(true);
        if (aVar2.e() == aVar4.e()) {
        }
        s0eVar = bzdVar.h.l;
        if (s0eVar == null) {
        }
        s0eVar.d();
        i = 0;
        bzdVar.q.d(false);
        if (list13.size() == list15.size()) {
        }
        q0e q0eVar22 = bzdVar.h;
        q0eVar22.W(q0eVar22.T().g(), (int) q0eVar22.T().getStickerRotation(), q0eVar22.T().j());
        yzdVar3 = yzdVar2;
        if (!epx.f(yzdVar3, yzdVar6)) {
        }
        if (yzdVar3.d == yzdVar6.d) {
        }
        bzdVar.n.c(bzdVar.g(), null, true);
        if (aVar2.g.b != aVar4.g.b) {
        }
        it2 = u0.iterator();
        while (true) {
            if (it2.hasNext()) {
            }
        }
        if (!(obj2 instanceof wzd.b)) {
        }
        if (((wzd.b) obj2) == null) {
        }
        List<com.vk.clips.editor.state.model.c> list19222 = list13;
        arrayList = new ArrayList(c5g.u(list19222, 10));
        while (r0.hasNext()) {
        }
        ArrayList f8222 = aVar4.f();
        arrayList2 = new ArrayList(c5g.u(f8222, 10));
        it3 = f8222.iterator();
        while (it3.hasNext()) {
        }
        if (!epx.f(j5g.S0(arrayList2), j5g.S0(arrayList))) {
        }
        if (!this.i) {
        }
        this.n.addAll(y000.a(list13));
        return u0;
    }

    @Override // xsna.rzd
    public final com.vk.clips.editor.state.model.a getState() {
        return this.o.a;
    }
}
