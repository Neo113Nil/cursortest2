package xsna;

import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.channels.api.CommentsHistory;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed.editor.actions.DeleteSource;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.ffz;
import xsna.iwa;
import xsna.jv60;
import xsna.ln50;
import xsna.mwa;
import xsna.nw2;
import xsna.qn60;
import xsna.qr60;
import xsna.xh60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fh4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d7  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        CommentsHistory commentsHistory;
        boolean z;
        Object bVar;
        int i;
        ffz.a aVar;
        boolean z2;
        int i2;
        ArrayList a;
        int i3 = 1;
        switch (this.b) {
            case 0:
                hh4 hh4Var = (hh4) this.d;
                ((qh4) hh4Var.c.getValue()).F(this.c, ((b25) hh4Var.b.getValue()).c(), true);
                return s3q0.a;
            case 1:
                int i4 = 0;
                mwa mwaVar = (mwa) this.d;
                int i5 = this.c;
                iwa.a aVar2 = (iwa.a) obj;
                mwa.a a2 = mwaVar.a();
                CommentsHistory commentsHistory2 = a2.b;
                CommentsHistory commentsHistory3 = aVar2.a;
                List<hag> list = commentsHistory2.a;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((hag) next).a != i5) {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                    }
                }
                Integer valueOf = i4 == -1 ? null : Integer.valueOf(i4);
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    hag hagVar = (hag) j5g.b0(intValue, list);
                    if (hagVar != null) {
                        CommentsHistory commentsHistory4 = hagVar.f;
                        hag a3 = hag.a(hagVar, CommentsHistory.a(commentsHistory4, rbg.b(commentsHistory4.a, commentsHistory3.a), commentsHistory3.b, commentsHistory3.c, commentsHistory3.e, commentsHistory3.f, commentsHistory3.g, 8), false, null, false, 32735);
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.set(intValue, a3);
                        commentsHistory = CommentsHistory.a(commentsHistory2, arrayList, 0, 0, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                        return mwa.a.a(a2, commentsHistory, a2.c.Ib(aVar2.b), 1);
                    }
                }
                commentsHistory = commentsHistory2;
                return mwa.a.a(a2, commentsHistory, a2.c.Ib(aVar2.b), 1);
            case 2:
                return ((qob) ((hoz) this.d).c).e((MarketReviewCommentsDto) obj, this.c, false, false);
            case 3:
                uj60 uj60Var = (uj60) this.d;
                int i6 = this.c;
                lu60 lu60Var = (lu60) obj;
                uj60Var.f.k.o();
                uj60Var.f.k.n();
                am60 Aa = ((NewsFeedComponent) uj60Var.i.getValue()).Aa();
                List<NewsEntry> a4 = lu60Var.a();
                String b = lu60Var.b();
                Boolean c = lu60Var.c();
                Boolean bool = Boolean.TRUE;
                Aa.b(i6, b, epx.f(c, bool), a4);
                zz60 zz60Var = uj60Var.f;
                if (i6 == 0) {
                    ce60 ce60Var = ce60.b;
                    Boolean valueOf2 = Boolean.valueOf(epx.f(lu60Var.c(), bool));
                    ce60Var.getClass();
                    ce60.n(valueOf2);
                }
                if (lu60Var.a().isEmpty()) {
                    zz60Var.k.d(NewsDebuggerPoint.EmptyResponse);
                } else {
                    if (((qz60) uj60Var.b.getCurrentState()).h.a.indexOfKey(i6) < 0) {
                        z = true;
                        if (i6 != 0 && epx.f(lu60Var.c(), bool)) {
                            ts60 ts60Var = uj60Var.f.k;
                            NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
                            ts60Var.T();
                            zz60 zz60Var2 = uj60Var.f;
                            nn50<State, TaskId, OutTask, Patch, Event> nn50Var = uj60Var.b;
                            if (((qz60) nn50Var.getCurrentState()).h.d && epx.f(uj60Var.f.b.d, "append")) {
                                zz60Var2.k.d(NewsDebuggerPoint.AppendFreshTopNews);
                                uj60Var.e(new jv60.a.C3147a(false));
                                qn60 qn60Var = uj60Var.m;
                                qz60 qz60Var = (qz60) nn50Var.getCurrentState();
                                List<NewsEntry> a5 = lu60Var.a();
                                int i7 = (int) ((zz60Var2.f.a >> 32) & 65535);
                                ur60 ur60Var = qz60Var.b;
                                if (i7 >= ur60Var.b.a.size()) {
                                    uj60Var.v(i6, lu60Var);
                                } else {
                                    ol60 ol60Var = (ol60) j5g.b0(i7, ur60Var.b.a);
                                    z1c0 z1c0Var = ol60Var instanceof z1c0 ? (z1c0) ol60Var : null;
                                    NewsEntry newsEntry = z1c0Var != null ? z1c0Var.h.b : null;
                                    ArrayList o = e43.o(new om0(a5, ur60Var.c, newsEntry != null ? qn60Var.b.c.indexOf(newsEntry) : -1, uj60Var.n, (NewsfeedDeduplicator) uj60Var.g.getValue()), new qxf0(a5, DeleteSource.REMOTE));
                                    if (((Boolean) uj60Var.k.getValue()).booleanValue()) {
                                        o.add(new vxf0());
                                        o.add(new txf0());
                                    }
                                    qn60.b[] bVarArr = (qn60.b[]) o.toArray(new qn60.b[0]);
                                    Object f = qn60Var.f((qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                                    if (!(f instanceof Result.Failure)) {
                                        qn60.c cVar = (qn60.c) f;
                                        uj60Var.e(new kv60(new qr60.a.f(cVar.a, cVar.b, lu60Var.b())));
                                    }
                                }
                            } else {
                                uj60Var.v(i6, lu60Var);
                            }
                        } else if (z) {
                            ts60 ts60Var2 = uj60Var.f.k;
                            NewsDebuggerPoint newsDebuggerPoint2 = NewsDebuggerPoint.ChangeList;
                            ts60Var2.T();
                            List<NewsEntry> a6 = lu60Var.a();
                            List O0 = j5g.O0(uj60Var.m.c());
                            Object k0 = j5g.k0(a6);
                            if (k0 == null) {
                                bVar = ffz.a.a;
                            } else {
                                int indexOf = O0.indexOf(k0);
                                if (indexOf == -1) {
                                    bVar = ffz.a.a;
                                } else {
                                    int h = e43.h(a6);
                                    int i8 = -1;
                                    for (int i9 = h; -1 < i9; i9--) {
                                        int i10 = indexOf - (h - i9);
                                        if (i10 < 0) {
                                            bVar = i8 != 0 ? ffz.c.a : new ffz.b(i8);
                                        } else if (epx.f(a6.get(i9), O0.get(i10))) {
                                            i8 = i9;
                                        } else {
                                            bVar = ffz.a.a;
                                        }
                                    }
                                    if (i8 != 0) {
                                    }
                                }
                            }
                            bVar.getClass();
                            ffz.a aVar3 = ffz.a.a;
                            if (bVar.equals(aVar3)) {
                                i = -1;
                            } else if (bVar instanceof ffz.b) {
                                i = ((ffz.b) bVar).a;
                            } else {
                                if (!bVar.equals(ffz.c.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = 0;
                            }
                            NewsEntry newsEntry2 = (NewsEntry) j5g.b0(i, a6);
                            int i11 = (int) ((uj60Var.f.f.a >> 16) & 65535);
                            short s = (short) (r13 & 65535);
                            qz60 qz60Var2 = (qz60) uj60Var.b.getCurrentState();
                            int size = qz60Var2.b.b.a.size();
                            boolean z3 = i11 > 0 || uj60Var.f.f.b;
                            boolean d = uj60Var.m.d(a6);
                            boolean z4 = z3;
                            boolean z5 = !d;
                            zz60 zz60Var3 = uj60Var.f;
                            int i12 = (int) ((zz60Var3.f.a >> 48) & 65535);
                            wn60 wn60Var = zz60Var3.j.get();
                            byte b2 = wn60Var.a;
                            if ((b2 & 1) == 0 || !wn60.b(b2)) {
                                aVar = aVar3;
                                z2 = false;
                            } else {
                                aVar = aVar3;
                                z2 = true;
                            }
                            boolean z6 = (wn60Var.a & 8) != 0;
                            if (bVar instanceof ffz.b) {
                                ffz.b bVar2 = (ffz.b) bVar;
                                uj60Var.w(uj60Var.s(a6.subList(bVar2.a, a6.size())));
                                Serializable b3 = uj60Var.m.b(new nw2.a(ProfilesRecommendations.class));
                                if (b3 instanceof Result.Failure) {
                                    b3 = null;
                                }
                                Set set = (Set) b3;
                                boolean z7 = set != null && (set.isEmpty() ^ true);
                                List<NewsEntry> subList = a6.subList(0, bVar2.a);
                                if (z7) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : subList) {
                                        if (!(((NewsEntry) obj2) instanceof ProfilesRecommendations)) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    subList = arrayList2;
                                }
                                Object f2 = uj60Var.m.f(new wle0(subList, qz60Var2.b.c, uj60Var.n));
                                if (f2 instanceof Result.Failure) {
                                    f2 = null;
                                }
                                qn60.c cVar2 = (qn60.c) f2;
                                if (cVar2 != null) {
                                    ArrayList arrayList3 = cVar2.a;
                                    if (!arrayList3.isEmpty()) {
                                        uj60Var.e(new kv60(new qr60.a.d(false)));
                                    }
                                    uj60Var.e(new kv60(new qr60.a.c(arrayList3, cVar2.b, false, null, 28)));
                                    if (i11 > 0) {
                                        uj60Var.c(new xh60.b.d((arrayList3.size() - size) + i11, s));
                                    } else {
                                        uj60Var.c(new xh60.e(vp60.a));
                                    }
                                    if (newsEntry2 != null) {
                                        qn60 qn60Var2 = uj60Var.m;
                                        synchronized (qn60Var2) {
                                            List<ol60> d2 = qn60Var2.b.b.d(newsEntry2);
                                            a = d2 != null ? i7o0.a(d2) : null;
                                        }
                                        i2 = arrayList3.indexOf(a != null ? (ol60) j5g.i0(a) : null);
                                    } else {
                                        i2 = -1;
                                    }
                                    uj60Var.c(new xh60.b.C4002b(i2));
                                    String str = com.vk.newsfeed.common.util.k.a;
                                    com.vk.newsfeed.common.util.k.e("prepend", i12, z2, z6, false, i6, z5);
                                }
                            } else {
                                boolean z8 = z6;
                                if (!bVar.equals(aVar)) {
                                    if (!bVar.equals(ffz.c.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    uj60Var.w(uj60Var.s(a6));
                                    String str2 = com.vk.newsfeed.common.util.k.a;
                                    com.vk.newsfeed.common.util.k.e("update", i12, z2, z8, false, i6, z5);
                                } else if (!z4) {
                                    String str3 = com.vk.newsfeed.common.util.k.a;
                                    com.vk.newsfeed.common.util.k.k(i12, i6, z2, z8, false, z5);
                                    uj60Var.t(i6, lu60Var);
                                    uj60Var.c(new xh60.e(vp60.a));
                                    uj60Var.c(new xh60.b.a(false));
                                } else if (d) {
                                    uj60Var.w(uj60Var.s(a6));
                                    String str4 = com.vk.newsfeed.common.util.k.a;
                                    com.vk.newsfeed.common.util.k.e("update", i12, z2, z8, false, i6, z5);
                                } else {
                                    uj60Var.e(new jv60.a.d(i6, lu60Var));
                                    uj60Var.c(new xh60.b.a(true));
                                    String str5 = com.vk.newsfeed.common.util.k.a;
                                    com.vk.newsfeed.common.util.k.e("save", i12, z2, z8, false, i6, true);
                                }
                            }
                        }
                        return s3q0.a;
                    }
                    zz60Var.k.d(NewsDebuggerPoint.HasFreshDisplayFreshButton);
                    uj60Var.e(new jv60.a.d(i6, lu60Var));
                    uj60Var.c(new xh60.b.a(true));
                }
                z = false;
                if (i6 != 0) {
                }
                if (z) {
                }
                return s3q0.a;
            default:
                ts70 ts70Var = (ts70) this.d;
                int i13 = this.c;
                el50 el50Var = (el50) obj;
                el50Var.f(el50Var, new rn50("init"), ln50.a.a, new fwa(ts70Var, i13, el50Var, i3));
                el50Var.f(el50Var, new rn50("download_progress"), ln50.a.a, new wif(i13, el50Var));
                return s3q0.a;
        }
    }
}
