package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewErrorResult;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewResult;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewSuccessResult;
import com.vk.ecomm.reviews.api.model.communityreviews.ReviewSavedData;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.b0i;
import xsna.dzh;
import xsna.mxh;
import xsna.oxh;
import xsna.rxh;
import xsna.tlo0;
import xsna.ywh;

/* compiled from: CommunityReviewsViewEventsToActionsMapper.kt */
/* loaded from: classes18.dex */
public final class c0i {
    public static com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[] a(zzh zzhVar) {
        Parcelable parcelable;
        Object parcelable2;
        if (!(zzhVar instanceof dzh)) {
            if (zzhVar instanceof oxh) {
                if (((oxh) zzhVar) instanceof oxh.a) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.z.b};
                }
                throw new NoWhenBranchMatchedException();
            }
            if (zzhVar instanceof b0i) {
                b0i b0iVar = (b0i) zzhVar;
                if (b0iVar instanceof b0i.c) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.s.b};
                }
                if (b0iVar instanceof b0i.b) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.m.b};
                }
                if (epx.f(b0iVar, b0i.d.a)) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.w.b};
                }
                if (b0iVar instanceof b0i.a) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.j(true)};
                }
                throw new NoWhenBranchMatchedException();
            }
            if (zzhVar instanceof mxh) {
                mxh mxhVar = (mxh) zzhVar;
                if (mxhVar instanceof mxh.b) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.n.j(null)};
                }
                if (mxhVar instanceof mxh.a) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.v(((mxh.a) mxhVar).a)};
                }
                throw new NoWhenBranchMatchedException();
            }
            if (zzhVar instanceof rxh) {
                rxh rxhVar = (rxh) zzhVar;
                if (rxhVar instanceof rxh.j) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.n.j(((rxh.j) rxhVar).a)};
                }
                if (rxhVar instanceof rxh.i) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.n.i(((rxh.i) rxhVar).a)};
                }
                if (rxhVar instanceof rxh.f) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.r.d.b};
                }
                if (rxhVar instanceof rxh.a) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.h(((rxh.a) rxhVar).a)};
                }
                if (rxhVar instanceof rxh.d) {
                    rxh.d dVar = (rxh.d) rxhVar;
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.n.h(dVar.a, dVar.b)};
                }
                if (rxhVar instanceof rxh.c) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.i.b};
                }
                if (rxhVar instanceof rxh.e) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.p.b};
                }
                if (rxhVar instanceof rxh.g) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.r.e.b};
                }
                if (rxhVar instanceof rxh.h) {
                    rxh.h hVar = (rxh.h) rxhVar;
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.a(hVar.a, null, hVar.b)};
                }
                if (rxhVar instanceof rxh.b) {
                    return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.o.b};
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(zzhVar instanceof ywh)) {
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[0];
            }
            ywh ywhVar = (ywh) zzhVar;
            if (ywhVar instanceof ywh.e) {
                ywh.e eVar = (ywh.e) ywhVar;
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.j(eVar.a, eVar.b)};
            }
            if (ywhVar instanceof ywh.a) {
                ywh.a aVar = (ywh.a) ywhVar;
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.a(aVar.b, aVar.a, aVar.c)};
            }
            if (ywhVar instanceof ywh.d) {
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.i(((ywh.d) ywhVar).a)};
            }
            if (ywhVar instanceof ywh.b) {
                ywh.b bVar = (ywh.b) ywhVar;
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.d(bVar.a, bVar.b)};
            }
            if (ywhVar instanceof zwh) {
                zwh zwhVar = (zwh) ywhVar;
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.k.a(zwhVar.a, zwhVar.b)};
            }
            if (ywhVar instanceof cxh) {
                cxh cxhVar = (cxh) ywhVar;
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.k.d(cxhVar.a, cxhVar.b)};
            }
            if (ywhVar instanceof axh) {
                axh axhVar = (axh) ywhVar;
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.k.b(axhVar.a, axhVar.b)};
            }
            if (ywhVar instanceof bxh) {
                bxh bxhVar = (bxh) ywhVar;
                return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.k.C1017c(bxhVar.a, bxhVar.b)};
            }
            if (!(ywhVar instanceof ywh.c)) {
                throw new NoWhenBranchMatchedException();
            }
            ywh.c cVar = (ywh.c) ywhVar;
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.g(cVar.a, cVar.b)};
        }
        dzh dzhVar = (dzh) zzhVar;
        if (dzhVar instanceof dzh.e) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.b.C1011b.b};
        }
        if (dzhVar instanceof dzh.a) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.a.b, c.b.a.b};
        }
        if (dzhVar instanceof dzh.j) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.o.b};
        }
        if (dzhVar instanceof dzh.f) {
            Bundle bundle = ((dzh.f) dzhVar).a;
            String l = fpf0.a(CreateCommunityReviewResult.class).l();
            if (l == null) {
                l = "";
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable(l, CreateCommunityReviewResult.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable(l);
                if (!(parcelable3 instanceof CreateCommunityReviewResult)) {
                    parcelable3 = null;
                }
                parcelable = (CreateCommunityReviewResult) parcelable3;
            }
            CreateCommunityReviewResult createCommunityReviewResult = (CreateCommunityReviewResult) parcelable;
            ReviewSavedData reviewSavedData = createCommunityReviewResult != null ? createCommunityReviewResult.d : null;
            CreateCommunityReviewData createCommunityReviewData = reviewSavedData instanceof CreateCommunityReviewData ? (CreateCommunityReviewData) reviewSavedData : null;
            if ((createCommunityReviewResult != null ? createCommunityReviewResult.c : null) == null) {
                if ((createCommunityReviewResult != null ? createCommunityReviewResult.b : null) == null) {
                    return createCommunityReviewData != null ? new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.C1012c(createCommunityReviewData), c.n.a.b} : new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[0];
                }
                CreateCommunityReviewErrorResult createCommunityReviewErrorResult = createCommunityReviewResult.b;
                ListBuilder e = e43.e();
                e.add(new c.C1012c(createCommunityReviewData));
                tlo0.h d = oq.d(tlo0.Companion, createCommunityReviewErrorResult.b);
                String str = createCommunityReviewErrorResult.c;
                e.add(new c.n.b(d, str != null ? new tlo0.h(str) : null));
                return (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]) e.g().toArray(new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[0]);
            }
            CreateCommunityReviewSuccessResult createCommunityReviewSuccessResult = createCommunityReviewResult.c;
            String str2 = createCommunityReviewResult.e;
            ListBuilder e2 = e43.e();
            e2.add(c.s.b);
            e2.add(new c.C1012c(null));
            if (createCommunityReviewSuccessResult.b.length() <= 0 || createCommunityReviewSuccessResult.c.length() <= 0) {
                e2.add(c.x.b);
            } else {
                e2.add(new c.n.C1013c(createCommunityReviewSuccessResult, str2));
            }
            return (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]) e2.g().toArray(new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[0]);
        }
        if (dzhVar instanceof dzh.b) {
            ListBuilder e3 = e43.e();
            e3.add(new c.C1012c(null));
            if (((dzh.b) dzhVar).a) {
                e3.add(c.s.b);
            }
            return (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]) e3.g().toArray(new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[0]);
        }
        if (dzhVar instanceof dzh.o) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.n.g.b};
        }
        if (dzhVar instanceof dzh.i) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.s.b};
        }
        if (dzhVar instanceof dzh.d) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.e(((dzh.d) dzhVar).a)};
        }
        if (dzhVar instanceof dzh.c) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.n.f(((dzh.c) dzhVar).a)};
        }
        if (dzhVar instanceof dzh.k) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.l(((dzh.k) dzhVar).a)};
        }
        if (dzhVar instanceof dzh.g) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.f(((dzh.g) dzhVar).a)};
        }
        if (dzhVar instanceof dzh.m) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.q(((dzh.m) dzhVar).a)};
        }
        if (dzhVar instanceof dzh.h) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.g(((dzh.h) dzhVar).a)};
        }
        if (dzhVar instanceof dzh.l) {
            dzh.l lVar = (dzh.l) dzhVar;
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.u.a(lVar.a, null, lVar.b)};
        }
        if (!(dzhVar instanceof dzh.n)) {
            throw new NoWhenBranchMatchedException();
        }
        dzh.n nVar = (dzh.n) dzhVar;
        if (epx.f(nVar, dzh.n.j.a)) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.r.n.b};
        }
        if (epx.f(nVar, dzh.n.k.a)) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.r.o.b};
        }
        if (epx.f(nVar, dzh.n.c.a)) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.r.C1014c.b};
        }
        if (epx.f(nVar, dzh.n.b.a)) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.r.b.b};
        }
        if (epx.f(nVar, dzh.n.a.a)) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{c.r.a.b};
        }
        if (nVar instanceof dzh.n.d) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.r.k(((dzh.n.d) nVar).a)};
        }
        if (nVar instanceof dzh.n.e) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.r.m(((dzh.n.e) nVar).a)};
        }
        if (nVar instanceof dzh.n.i) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.r.p(((dzh.n.i) nVar).a)};
        }
        if (nVar instanceof dzh.n.f) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.r.h(((dzh.n.f) nVar).a)};
        }
        if (nVar instanceof dzh.n.g) {
            dzh.n.g gVar = (dzh.n.g) nVar;
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.r.l(gVar.a, gVar.b)};
        }
        if (nVar instanceof dzh.n.h) {
            return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[]{new c.r.q(((dzh.n.h) nVar).a)};
        }
        throw new NoWhenBranchMatchedException();
    }
}
