package xsna;

import android.os.SystemClock;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivitiesTarget;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c2r;
import xsna.ea90;
import xsna.mtf0;
import xsna.q4r;
import xsna.s4r;
import xsna.ubx;
import xsna.uch0;
import xsna.wih0;

/* compiled from: ClipsFeedReducer.kt */
/* loaded from: classes17.dex */
public final class s8e extends dm50<e5r, c2r, q4r> {
    public final g5r d;
    public final s4r e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s8e(g5r g5rVar, List list, s4r.b bVar) {
        super(r4);
        km50 km50Var;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            km50Var = q4r.c.b;
        } else {
            gwx gwxVar = new gwx(list);
            s4r s4rVar = bVar == null ? s4r.a.a : bVar;
            PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
            ea90.a.b bVar2 = ea90.a.b.a;
            km50Var = new q4r.a(gwxVar, s4rVar, new ea90(loadedFull, bVar2), new ea90(loadedFull, bVar2), mtf0.a.b, ((FeedItem) j5g.Y(list)).F(), null, ubx.b.a, uch0.a.b, false, null);
        }
        this.d = g5rVar;
        this.e = bVar;
    }

    public static final q4r i(q4r q4rVar, mtf0 mtf0Var) {
        if (q4rVar instanceof q4r.c) {
            return q4rVar;
        }
        if (q4rVar instanceof q4r.d) {
            return q4rVar;
        }
        if (q4rVar instanceof q4r.a) {
            return q4r.a.a((q4r.a) q4rVar, null, null, null, mtf0Var, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
        }
        if (q4rVar instanceof q4r.b) {
            return new q4r.b(((q4r.b) q4rVar).b, mtf0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile] */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r5v26, types: [com.vk.clips.sdk.shared.feed.model.FeedItem] */
    /* JADX WARN: Type inference failed for: r5v27, types: [com.vk.clips.sdk.shared.feed.model.FeedItem$m] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [com.vk.clips.sdk.shared.feed.model.FeedItem$d] */
    /* JADX WARN: Type inference failed for: r5v32, types: [com.vk.clips.sdk.shared.feed.model.FeedItem$d] */
    /* JADX WARN: Type inference failed for: r5v33, types: [com.vk.clips.sdk.shared.feed.model.FeedItem$d] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile] */
    /* JADX WARN: Type inference failed for: r9v51 */
    @Override // xsna.dm50
    public final q4r c(q4r q4rVar, c2r c2rVar) {
        uch0 uch0Var;
        List<SdkCoOwnerItem> P1;
        ea90 ea90Var;
        ea90 ea90Var2;
        ArrayList arrayList;
        String F;
        String F2;
        String str;
        q4r q4rVar2 = q4rVar;
        c2r c2rVar2 = c2rVar;
        boolean z = c2rVar2 instanceof c2r.d;
        String str2 = "";
        mtf0.b bVar = mtf0.b.b;
        mtf0.a aVar = mtf0.a.b;
        if (z) {
            c2r.d dVar = (c2r.d) c2rVar2;
            if (dVar instanceof c2r.d.b) {
                if (q4rVar2 instanceof q4r.c) {
                    return q4r.d.b;
                }
                if (q4rVar2 instanceof q4r.d) {
                    return q4r.d.b;
                }
                if (!(q4rVar2 instanceof q4r.a)) {
                    if (q4rVar2 instanceof q4r.b) {
                        return new q4r.b(((q4r.b) q4rVar2).b, bVar);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c2r.d.b bVar2 = (c2r.d.b) dVar;
                PaginationKey paginationKey = bVar2.d;
                if (paginationKey == null) {
                    paginationKey = PaginationKey.Initial.b;
                }
                PaginationKey paginationKey2 = bVar2.e;
                if (paginationKey2 == null) {
                    paginationKey2 = PaginationKey.LoadedFull.b;
                }
                return q4r.a.a((q4r.a) q4rVar2, null, new ea90(paginationKey2, bVar2.c ? new ea90.a.c(SystemClock.elapsedRealtime()) : ea90.a.b.a), new ea90(paginationKey, bVar2.b ? new ea90.a.c(SystemClock.elapsedRealtime()) : ea90.a.b.a), null, null, null, null, null, null, 2035);
            }
            if (!(dVar instanceof c2r.d.c)) {
                if (dVar instanceof c2r.d.a) {
                    return new q4r.b(((c2r.d.a) dVar).b, aVar);
                }
                throw new NoWhenBranchMatchedException();
            }
            c2r.d.c cVar = (c2r.d.c) dVar;
            List<FeedItem> list = cVar.b;
            gwx gwxVar = new gwx(list);
            s4r s4rVar = this.e;
            if (s4rVar == null) {
                s4rVar = cVar.e;
            }
            s4r s4rVar2 = s4rVar;
            PaginationKey paginationKey3 = cVar.c;
            ea90.a.b bVar3 = ea90.a.b.a;
            ea90 ea90Var3 = new ea90(paginationKey3, bVar3);
            ea90 ea90Var4 = new ea90(cVar.d, bVar3);
            if (q4rVar2 instanceof q4r.a) {
                str2 = ((q4r.a) q4rVar2).g;
            } else {
                FeedItem feedItem = (FeedItem) j5g.a0(list);
                if (feedItem != null && (F2 = feedItem.F()) != null) {
                    str = F2;
                    return new q4r.a(gwxVar, s4rVar2, ea90Var3, ea90Var4, aVar, str, cVar.g, cVar.f, uch0.a.b, true, cVar.h);
                }
            }
            str = str2;
            return new q4r.a(gwxVar, s4rVar2, ea90Var3, ea90Var4, aVar, str, cVar.g, cVar.f, uch0.a.b, true, cVar.h);
        }
        UserId userId = null;
        if (c2rVar2 instanceof c2r.f) {
            c2r.f fVar = (c2r.f) c2rVar2;
            if (q4rVar2 instanceof q4r.a) {
                if (fVar instanceof c2r.f.c) {
                    if (((c2r.f.c) fVar).b) {
                        q4r.a aVar2 = (q4r.a) q4rVar2;
                        return q4r.a.a(aVar2, null, null, ea90.a(aVar2.e, null, new ea90.a.c(SystemClock.elapsedRealtime()), 1), null, null, null, null, null, null, 2039);
                    }
                    q4r.a aVar3 = (q4r.a) q4rVar2;
                    return q4r.a.a(aVar3, null, ea90.a(aVar3.d, null, new ea90.a.c(SystemClock.elapsedRealtime()), 1), null, null, null, null, null, null, null, 2043);
                }
                if (fVar instanceof c2r.f.a) {
                    c2r.f.a aVar4 = (c2r.f.a) fVar;
                    boolean z2 = aVar4.c;
                    Throwable th = aVar4.b;
                    if (z2) {
                        q4r.a aVar5 = (q4r.a) q4rVar2;
                        return q4r.a.a(aVar5, null, null, ea90.a(aVar5.e, null, new ea90.a.C2790a(th), 1), null, null, null, null, null, null, 2039);
                    }
                    q4r.a aVar6 = (q4r.a) q4rVar2;
                    return q4r.a.a(aVar6, null, ea90.a(aVar6.d, null, new ea90.a.C2790a(th), 1), null, null, null, null, null, null, null, 2043);
                }
                if (fVar instanceof c2r.f.b) {
                    c2r.f.b bVar4 = (c2r.f.b) fVar;
                    boolean z3 = bVar4.c;
                    PaginationKey paginationKey4 = bVar4.b;
                    if (z3) {
                        q4r.a aVar7 = (q4r.a) q4rVar2;
                        return q4r.a.a(aVar7, null, null, ea90.a(aVar7.e, paginationKey4, null, 2), null, null, null, null, null, null, 2039);
                    }
                    q4r.a aVar8 = (q4r.a) q4rVar2;
                    return q4r.a.a(aVar8, null, ea90.a(aVar8.d, paginationKey4, null, 2), null, null, null, null, null, null, null, 2043);
                }
                if (!(fVar instanceof c2r.f.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                c2r.f.d dVar2 = (c2r.f.d) fVar;
                ArrayList arrayList2 = dVar2.b;
                PaginationKey paginationKey5 = dVar2.c;
                boolean z4 = dVar2.e;
                if (!z4) {
                    if (z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q4r.a aVar9 = (q4r.a) q4rVar2;
                    return q4r.a.a(aVar9, new gwx(j5g.u0(aVar9.b.a, arrayList2)), new ea90(paginationKey5, ea90.a.b.a), null, null, null, null, null, null, null, 2042);
                }
                q4r.a aVar10 = (q4r.a) q4rVar2;
                gwx gwxVar2 = new gwx(j5g.u0(arrayList2, aVar10.b.a));
                ea90 ea90Var5 = new ea90(paginationKey5, ea90.a.b.a);
                wrr wrrVar = dVar2.d;
                if (wrrVar == null) {
                    wrrVar = aVar10.l;
                }
                return q4r.a.a(aVar10, gwxVar2, null, ea90Var5, null, null, null, null, null, wrrVar, Z3.j);
            }
        } else if (c2rVar2 instanceof c2r.h) {
            c2r.h hVar = (c2r.h) c2rVar2;
            if (q4rVar2 instanceof q4r.a) {
                if (hVar instanceof c2r.h.c) {
                    return i(q4rVar2, bVar);
                }
                if (hVar instanceof c2r.h.a) {
                    return i(q4rVar2, aVar);
                }
                if (!(hVar instanceof c2r.h.d)) {
                    if (epx.f(hVar, c2r.h.b.b)) {
                        return q4r.a.a((q4r.a) q4rVar2, new gwx(EmptyList.b), null, null, null, "", null, null, null, null, 2014);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                q4r.a aVar11 = (q4r.a) q4rVar2;
                s4r s4rVar3 = aVar11.c;
                c2r.h.d dVar3 = (c2r.h.d) hVar;
                List<FeedItem> list2 = dVar3.b;
                gwx gwxVar3 = new gwx(list2);
                PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
                ea90.a.b bVar5 = ea90.a.b.a;
                ea90 ea90Var6 = new ea90(loadedFull, bVar5);
                ea90 ea90Var7 = new ea90(dVar3.c, bVar5);
                FeedItem feedItem2 = (FeedItem) j5g.a0(list2);
                String str3 = (feedItem2 == null || (F = feedItem2.F()) == null) ? "" : F;
                ubx ubxVar = aVar11.i;
                String str4 = dVar3.d;
                if (str4 == null) {
                    str4 = aVar11.h;
                }
                return new q4r.a(gwxVar3, s4rVar3, ea90Var6, ea90Var7, aVar, str3, str4, ubxVar, uch0.a.b, true, dVar3.e);
            }
        } else if (c2rVar2 instanceof c2r.b) {
            c2r.b bVar6 = (c2r.b) c2rVar2;
            if (q4rVar2 instanceof q4r.a) {
                q4r.a aVar12 = (q4r.a) q4rVar2;
                String str5 = aVar12.h;
                String str6 = bVar6.b;
                return q4r.a.a(aVar12, null, null, null, null, str6, epx.f(str5, str6) ? null : str5, null, null, null, 1951);
            }
        } else {
            int i = 10;
            if (c2rVar2 instanceof c2r.e) {
                c2r.e eVar = (c2r.e) c2rVar2;
                if (q4rVar2 instanceof q4r.a) {
                    boolean z5 = eVar instanceof f2r;
                    if (z5) {
                        f2r f2rVar = (f2r) eVar;
                        ea90Var = f2rVar.d;
                        ea90Var2 = f2rVar.c;
                    } else {
                        q4r.a aVar13 = (q4r.a) q4rVar2;
                        ea90Var = aVar13.e;
                        ea90Var2 = aVar13.d;
                    }
                    ea90 ea90Var8 = ea90Var2;
                    ea90 ea90Var9 = ea90Var;
                    if (eVar instanceof d2r) {
                        List<FeedItem> list3 = ((q4r.a) q4rVar2).b.a;
                        arrayList = new ArrayList();
                        for (Object obj : list3) {
                            if (!((d2r) eVar).b.contains(((FeedItem) obj).F())) {
                                arrayList.add(obj);
                            }
                        }
                    } else if (eVar instanceof e2r) {
                        List<FeedItem> list4 = ((q4r.a) q4rVar2).b.a;
                        arrayList = new ArrayList();
                        for (Object obj2 : list4) {
                            if (!epx.f(((FeedItem) obj2).F(), ((e2r) eVar).b)) {
                                arrayList.add(obj2);
                            }
                        }
                    } else if (eVar instanceof g2r) {
                        List<FeedItem> list5 = ((q4r.a) q4rVar2).b.a;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                        for (FeedItem feedItem3 : list5) {
                            String F3 = feedItem3.F();
                            FeedItem feedItem4 = ((g2r) eVar).b;
                            if (epx.f(F3, feedItem4.F())) {
                                feedItem3 = feedItem4;
                            }
                            arrayList3.add(feedItem3);
                        }
                        arrayList = arrayList3;
                    } else if (z5) {
                        arrayList = ((f2r) eVar).b;
                    } else {
                        if (!(eVar instanceof c2r.e.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        q4r.a aVar14 = (q4r.a) q4rVar2;
                        List<FeedItem> list6 = aVar14.b.a;
                        Iterator<FeedItem> it = list6.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (epx.f(it.next().F(), aVar14.g)) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 >= e43.h(list6)) {
                            arrayList = j5g.v0(((c2r.e.a) eVar).b, list6);
                        } else {
                            ArrayList arrayList4 = new ArrayList(list6);
                            arrayList4.add(i2 + 1, ((c2r.e.a) eVar).b);
                            arrayList = arrayList4;
                        }
                    }
                    return q4r.a.a((q4r.a) q4rVar2, new gwx(arrayList), ea90Var8, ea90Var9, null, null, null, null, null, null, 2034);
                }
            } else if (c2rVar2 instanceof c2r.j) {
                c2r.j jVar = (c2r.j) c2rVar2;
                UserId userId2 = jVar.b;
                boolean z6 = jVar.c;
                if (q4rVar2 instanceof q4r.a) {
                    q4r.a aVar15 = (q4r.a) q4rVar2;
                    List<FeedItem> list7 = aVar15.b.a;
                    ArrayList arrayList5 = new ArrayList(c5g.u(list7, 10));
                    Iterator it2 = list7.iterator();
                    while (it2.hasNext()) {
                        ?? r5 = (FeedItem) it2.next();
                        if (r5 instanceof FeedItem.d) {
                            r5 = (FeedItem.d) r5;
                            if (epx.f(dgd.b(r5.k()), userId2)) {
                                SdkVideoFile copy = r5.k().copy();
                                ?? r9 = copy instanceof SdkClipVideoFile ? (SdkClipVideoFile) copy : userId;
                                SdkVideoFile k = r5.k();
                                ?? r10 = k instanceof SdkClipVideoFile ? (SdkClipVideoFile) k : userId;
                                if (r9 != 0 && r10 != 0) {
                                    r9.z5(r10.U6());
                                    r9.ea(r10.L5());
                                    r9.R4(r10.S6());
                                }
                                VideoFileAdapter videoFileAdapter = (VideoFileAdapter) copy;
                                videoFileAdapter.d().k3(z6);
                                Owner s = videoFileAdapter.d().s();
                                if (s != null) {
                                    s.g(4, z6);
                                }
                                r5.W().c(copy);
                                r5.j().k(copy);
                                r5 = r5.e7(copy);
                            } else {
                                SdkVideoFile k2 = r5.k();
                                ?? r8 = k2 instanceof SdkClipVideoFile ? (SdkClipVideoFile) k2 : userId;
                                if (r8 != 0 && (P1 = r8.P1()) != null) {
                                    List<SdkCoOwnerItem> list8 = P1;
                                    if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                                        Iterator it3 = list8.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                break;
                                            }
                                            if (((SdkCoOwnerItem) it3.next()).b.equals(userId2)) {
                                                List<SdkCoOwnerItem> P12 = ((SdkClipVideoFile) r5.k()).P1();
                                                ArrayList arrayList6 = new ArrayList(c5g.u(P12, i));
                                                for (SdkCoOwnerItem sdkCoOwnerItem : P12) {
                                                    if (sdkCoOwnerItem.b.equals(userId2)) {
                                                        sdkCoOwnerItem = new SdkCoOwnerItem(sdkCoOwnerItem.b, SdkOwner.a(sdkCoOwnerItem.c, z6), sdkCoOwnerItem.d, sdkCoOwnerItem.e, sdkCoOwnerItem.f);
                                                    }
                                                    arrayList6.add(sdkCoOwnerItem);
                                                }
                                                r5 = r5.e7(((SdkClipVideoFile) r5.k()).z4(arrayList6));
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (r5 instanceof FeedItem.m) {
                            r5 = (FeedItem.m) r5;
                            SdkOwner sdkOwner = r5.d.d;
                            if (epx.f(sdkOwner != null ? sdkOwner.b : userId, userId2)) {
                                wih0.d.a aVar16 = r5.d;
                                r5 = new FeedItem.m(r5.c, r5.e, r5.b, r5.f, r5.g, r5.h, new wih0.d.a(aVar16.a, aVar16.b, aVar16.c, SdkOwner.a(sdkOwner, z6), aVar16.e, aVar16.f, aVar16.g, aVar16.h, aVar16.i, aVar16.j));
                            }
                        }
                        arrayList5.add(r5);
                        i = 10;
                        userId = null;
                    }
                    return q4r.a.a(aVar15, new gwx(arrayList5), null, null, null, null, null, null, null, null, 2046);
                }
            } else if (c2rVar2 instanceof c2r.i) {
                Set<Integer> set = ((c2r.i) c2rVar2).b;
                if (q4rVar2 instanceof q4r.a) {
                    if (set.isEmpty()) {
                        return q4rVar2;
                    }
                    q4r.a aVar17 = (q4r.a) q4rVar2;
                    gwx gwxVar4 = aVar17.b;
                    if (gwxVar4.a.size() <= 1) {
                        return q4rVar2;
                    }
                    List<FeedItem> list9 = gwxVar4.a;
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : list9) {
                        FeedItem feedItem5 = (FeedItem) obj3;
                        if (feedItem5 instanceof FeedItem.d) {
                            FeedItem.d dVar4 = (FeedItem.d) feedItem5;
                            if (!epx.f(dVar4.k().r1(), aVar17.g) && set.contains(Integer.valueOf(dVar4.k().o0()))) {
                            }
                        }
                        arrayList7.add(obj3);
                    }
                    return q4r.a.a(aVar17, new gwx(arrayList7), null, null, null, null, null, null, null, null, 2046);
                }
            } else if (c2rVar2 instanceof c2r.k) {
                if (q4rVar2 instanceof q4r.a) {
                    q4r.a aVar18 = (q4r.a) q4rVar2;
                    ubx ubxVar2 = aVar18.i;
                    if (ubxVar2 instanceof ubx.a) {
                        return q4r.a.a(aVar18, null, null, null, null, null, null, new ubx.a(null, ((ubx.a) ubxVar2).a), null, null, 1919);
                    }
                }
            } else if (c2rVar2 instanceof c2r.g) {
                c2r.g gVar = (c2r.g) c2rVar2;
                if (q4rVar2 instanceof q4r.a) {
                    if (!(gVar instanceof c2r.g.a)) {
                        if (epx.f(gVar, c2r.g.b.b)) {
                            return q4r.a.a((q4r.a) q4rVar2, null, null, null, null, null, null, null, uch0.a.b, null, 1791);
                        }
                        if (gVar instanceof c2r.g.c) {
                            return q4r.a.a((q4r.a) q4rVar2, null, null, null, null, null, null, null, new vch0(((c2r.g.c) gVar).b), null, 1791);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    q4r.a aVar19 = (q4r.a) q4rVar2;
                    c2r.g.a aVar20 = (c2r.g.a) gVar;
                    if (aVar20 instanceof c2r.g.a.b) {
                        uch0Var = ine0.e;
                    } else {
                        if (!(aVar20 instanceof c2r.g.a.C2635a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uch0Var = sdy.j;
                    }
                    return q4r.a.a(aVar19, null, null, null, null, null, null, null, uch0Var, null, 1791);
                }
            } else if (!(c2rVar2 instanceof c2r.c)) {
                if (!(c2rVar2 instanceof c2r.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c2r.a aVar21 = (c2r.a) c2rVar2;
                if (q4rVar2 instanceof q4r.a) {
                    if (!(aVar21 instanceof c2r.a.C2634a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q4r.a aVar22 = (q4r.a) q4rVar2;
                    List<FeedItem> list10 = aVar22.b.a;
                    ArrayList arrayList8 = new ArrayList(c5g.u(list10, 10));
                    for (hfz hfzVar : list10) {
                        FeedItem.f fVar2 = hfzVar instanceof FeedItem.f ? (FeedItem.f) hfzVar : null;
                        if (fVar2 != null) {
                            SdkClipVideoFile sdkClipVideoFile = fVar2.e;
                            SdkClipActivities sdkClipActivities = ((c2r.a.C2634a) aVar21).b.get(new SdkClipActivitiesTarget(sdkClipVideoFile.I0(), sdkClipVideoFile.o0()));
                            hfzVar = sdkClipActivities != null ? FeedItem.f.a((FeedItem.f) hfzVar, null, null, sdkClipActivities, 1535) : (FeedItem.f) hfzVar;
                        }
                        arrayList8.add(hfzVar);
                    }
                    return q4r.a.a(aVar22, new gwx(arrayList8), null, null, null, null, null, null, null, null, 2046);
                }
            } else if (q4rVar2 instanceof q4r.a) {
                return q4r.a.a((q4r.a) q4rVar2, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
            }
        }
        return q4rVar2;
    }

    @Override // xsna.dm50
    public final e5r d() {
        return new e5r(e(new v5(this, 26)));
    }

    @Override // xsna.dm50
    public final void h(q4r q4rVar, e5r e5rVar) {
        f(e5rVar.a, q4rVar);
    }
}
