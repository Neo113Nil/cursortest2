package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewErrorResult;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewResult;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewSuccessResult;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.api.model.createreview.ProgressInfo;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.log.L;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.bzg;
import xsna.czg;
import xsna.gyh;
import xsna.kyg;
import xsna.tyg;

/* compiled from: CommunityCreateReviewFeature.kt */
/* loaded from: classes18.dex */
public final class yyg extends wk50<hzg, fzg, kyg, czg> {
    public final cbb f;
    public final gyh g;
    public final f4z h;
    public final f4z i;

    /* compiled from: CommunityCreateReviewFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadNotification.State.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yyg(ezg ezgVar, cbb cbbVar, gyh gyhVar) {
        super(null, ezgVar);
        this.f = cbbVar;
        this.g = gyhVar;
        this.h = new f4z();
        this.i = new f4z();
    }

    public static CreateCommunityReviewData U(fzg fzgVar) {
        Integer valueOf = Integer.valueOf(fzgVar.i);
        String str = fzgVar.f;
        if (str.length() == 0) {
            str = null;
        }
        List<UploadImageModel> list = fzgVar.j;
        CreateCommunityReviewData createCommunityReviewData = fzgVar.p;
        return new CreateCommunityReviewData(valueOf, str, list, createCommunityReviewData != null ? createCommunityReviewData.e : null);
    }

    @Override // xsna.wk50
    public final void N(fzg fzgVar, kyg kygVar) {
        Integer num;
        Integer num2;
        fzg fzgVar2 = fzgVar;
        kyg kygVar2 = kygVar;
        int i = 0;
        if (kygVar2 instanceof kyg.a) {
            cbb cbbVar = this.f;
            ((yd10) cbbVar.c).getClass();
            a7f0.a.f(this, rsg0.w0(yfb.x(new tfx("market.getCommunityReviewCreateConfig", new eq(19), new com.vk.movika.sdk.base.model.history.b(18)))).l(new l8(new j60(13), 18)), new fre(this, 9), null, 5);
            CreateCommunityReviewData createCommunityReviewData = fzgVar2.c;
            if ((createCommunityReviewData != null ? createCommunityReviewData.e : null) != null) {
                T(czg.e.b);
                Integer num3 = createCommunityReviewData.e;
                if (num3 != null) {
                    a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.p(rsg0.w0(yfb.x(((yd10) cbbVar.c).b(num3.intValue(), null, null))), new uyg(0, createCommunityReviewData, this, fzgVar2)), new wyg(this, createCommunityReviewData, fzgVar2, 0), new m4g(this, 3), 1);
                    return;
                }
                return;
            }
            UserId userId = fzgVar2.d;
            List<UploadImageModel> list = createCommunityReviewData != null ? createCommunityReviewData.d : null;
            if (list == null) {
                list = EmptyList.b;
            }
            if (createCommunityReviewData != null && (num2 = createCommunityReviewData.b) != null) {
                i = num2.intValue();
            }
            CreateCommunityReviewData createCommunityReviewData2 = fzgVar2.c;
            String str = createCommunityReviewData2 != null ? createCommunityReviewData2.c : null;
            if (str == null) {
                str = "";
            }
            czg.c cVar = new czg.c(i, str, X(userId, list), null);
            T(cVar);
            this.g.c(new gyh.c(userId.b, fzgVar2.k, fzgVar2.l, Float.valueOf(cVar.b), cVar.c, fzgVar2.o));
            return;
        }
        if (kygVar2 instanceof kyg.f) {
            T(new czg.a(((kyg.f) kygVar2).b));
            return;
        }
        if (kygVar2 instanceof kyg.g) {
            cbb cbbVar2 = this.f;
            T(czg.f.b);
            boolean c = fzgVar2.c();
            List<UploadImageModel> list2 = fzgVar2.j;
            int i2 = fzgVar2.i;
            String str2 = fzgVar2.f;
            if (!c) {
                UserId userId2 = fzgVar2.d;
                ArrayList arrayList = new ArrayList();
                for (UploadImageModel uploadImageModel : list2) {
                    Integer num4 = uploadImageModel.g;
                    if (num4 == null) {
                        num4 = uploadImageModel.d;
                    }
                    if (num4 != null) {
                        arrayList.add(num4);
                    }
                }
                yd10 yd10Var = (yd10) cbbVar2.c;
                UserId a2 = fkq0.a(userId2);
                yd10Var.getClass();
                tfx tfxVar = new tfx("market.createCommunityReview", new lr(21), new pn(24));
                tfx.n(tfxVar, "community_id", a2, 0L, 0L, 12);
                tfxVar.f(i2, 1, 5, "mark");
                if (str2 != null) {
                    tfx.o(tfxVar, "comment", str2, 0, 2500, 4);
                }
                tfxVar.i("photos", arrayList);
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(tfxVar)), new gn0(new bi0(8, this, fzgVar2), 14)), new du0(9, this, fzgVar2), new o43(12, this, fzgVar2), 1);
                return;
            }
            CreateCommunityReviewData createCommunityReviewData3 = fzgVar2.p;
            if (createCommunityReviewData3 != null && (num = createCommunityReviewData3.e) != null) {
                i = num.intValue();
            }
            int i3 = i;
            ArrayList arrayList2 = new ArrayList();
            for (UploadImageModel uploadImageModel2 : list2) {
                Integer num5 = uploadImageModel2.g;
                if (num5 == null) {
                    num5 = uploadImageModel2.d;
                }
                if (num5 != null) {
                    arrayList2.add(num5);
                }
            }
            ((yd10) cbbVar2.c).getClass();
            tfx tfxVar2 = new tfx("market.updateCommunityReview", new zq(18), new com.vk.movika.sdk.android.defaultplayer.interactive.c(18));
            tfx.l(tfxVar2, "id", i3, 0, 0, 12);
            tfxVar2.f(i2, 1, 5, "mark");
            if (str2 != null) {
                tfx.o(tfxVar2, "comment", str2, 0, 2500, 4);
            }
            tfxVar2.i("photos", arrayList2);
            a7f0.a.f(this, rsg0.w0(yfb.x(tfxVar2)), new com.vk.libvideo.design.view.video.a(9, this, fzgVar2), new zf1(7, this, fzgVar2), 1);
            return;
        }
        if (kygVar2 instanceof kyg.e) {
            float f = ((kyg.e) kygVar2).b;
            this.h.b(tyg.b.a);
            T(new czg.g(f));
            return;
        }
        if (kygVar2 instanceof kyg.c) {
            if ((!fzgVar2.b() || fzgVar2.c()) && !fzgVar2.h()) {
                return;
            }
            this.h.b(new tyg.c(new CreateCommunityReviewResult(null, null, U(fzgVar2), null, 11, null)));
            return;
        }
        if (!(kygVar2 instanceof kyg.d)) {
            if (!(kygVar2 instanceof kyg.b)) {
                if (!(kygVar2 instanceof kyg.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.i.b(new bzg.a(i5s.a(new StringBuilder("https://"), a0a.d, "/terms/review_rules")));
                return;
            } else {
                f4z f4zVar = this.h;
                if ((fzgVar2.b() && !fzgVar2.c()) || fzgVar2.h()) {
                    f4zVar.b(new tyg.c(new CreateCommunityReviewResult(null, null, U(fzgVar2), null, 11, null)));
                }
                f4zVar.b(tyg.d.a);
                return;
            }
        }
        kyg.d dVar = (kyg.d) kygVar2;
        f4z f4zVar2 = this.h;
        if (epx.f(dVar, kyg.d.C3214d.b)) {
            f4zVar2.b(tyg.b.a);
            int i4 = fzgVar2.b;
            List<UploadImageModel> list3 = fzgVar2.j;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    if (((UploadImageModel) it.next()).d() != null && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            this.i.b(new bzg.b(i4 - i));
            return;
        }
        if (dVar instanceof kyg.d.e) {
            kyg.d.e eVar = (kyg.d.e) dVar;
            f4zVar2.b(tyg.b.a);
            List<UploadImageModel> list4 = fzgVar2.j;
            int i5 = eVar.b;
            List<UploadImageModel> list5 = list4;
            ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
            for (UploadImageModel uploadImageModel3 : list5) {
                Integer d = uploadImageModel3.d();
                if (d != null && d.intValue() == i5) {
                    uploadImageModel3 = UploadImageModel.a(uploadImageModel3, null, null, ProgressInfo.Loading.b, 55);
                }
                arrayList3.add(uploadImageModel3);
            }
            T(new czg.i.a(arrayList3));
            com.vk.upload.impl.a.e(eVar.b);
            return;
        }
        if (dVar instanceof kyg.d.f) {
            kyg.d.f fVar = (kyg.d.f) dVar;
            f4zVar2.b(tyg.b.a);
            com.vk.upload.impl.a.b(fVar.b, null);
            List<UploadImageModel> list6 = fzgVar2.j;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list6) {
                Integer d2 = ((UploadImageModel) obj).d();
                int i6 = fVar.b;
                if (d2 == null || d2.intValue() != i6) {
                    arrayList4.add(obj);
                }
            }
            ArrayList arrayList5 = new ArrayList(arrayList4);
            if (arrayList5.size() < 5) {
                final py pyVar = new py(16);
                arrayList5.removeIf(new Predicate() { // from class: xsna.vyg
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((Boolean) py.this.invoke(obj2)).booleanValue();
                    }
                });
            }
            T(new czg.i.a(arrayList5));
            return;
        }
        if (dVar instanceof kyg.d.a) {
            kyg.d.a aVar = (kyg.d.a) dVar;
            List<UploadImageModel> list7 = fzgVar2.j;
            int i7 = aVar.b;
            omf omfVar = new omf(aVar, 2);
            List<UploadImageModel> list8 = list7;
            ArrayList arrayList6 = new ArrayList(c5g.u(list8, 10));
            for (UploadImageModel uploadImageModel4 : list8) {
                Integer d3 = uploadImageModel4.d();
                if (d3 != null && d3.intValue() == i7) {
                    uploadImageModel4 = (UploadImageModel) omfVar.invoke(uploadImageModel4);
                }
                arrayList6.add(uploadImageModel4);
            }
            T(new czg.i.a(arrayList6));
            return;
        }
        if (dVar instanceof kyg.d.c) {
            ArrayList arrayList7 = new ArrayList(fzgVar2.j);
            List<String> list9 = ((kyg.d.c) dVar).b;
            ArrayList arrayList8 = new ArrayList(c5g.u(list9, 10));
            for (String str3 : list9) {
                arrayList8.add(new n5a0(com.vk.upload.impl.a.h(new com.vk.upload.impl.tasks.e(str3, fzgVar2.d), new wze(this, 5)), str3));
            }
            arrayList7.removeIf(new xyg(new la2(15), 0));
            ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
            Iterator it2 = arrayList8.iterator();
            while (it2.hasNext()) {
                n5a0 n5a0Var = (n5a0) it2.next();
                arrayList9.add(new UploadImageModel(Integer.valueOf(n5a0Var.a), n5a0Var.b, null, ProgressInfo.Loading.b, null, null, 52, null));
            }
            arrayList7.addAll(arrayList9);
            T(new czg.i.a(arrayList7));
            return;
        }
        if (dVar instanceof kyg.d.b) {
            List<UploadImageModel> list10 = fzgVar2.j;
            int i8 = ((kyg.d.b) dVar).b;
            List<UploadImageModel> list11 = list10;
            ArrayList arrayList10 = new ArrayList(c5g.u(list11, 10));
            for (UploadImageModel uploadImageModel5 : list11) {
                Integer d4 = uploadImageModel5.d();
                if (d4 != null && d4.intValue() == i8) {
                    uploadImageModel5 = UploadImageModel.a(uploadImageModel5, null, null, ProgressInfo.Error.b, 55);
                }
                arrayList10.add(uploadImageModel5);
            }
            T(new czg.i.a(arrayList10));
            return;
        }
        if (!(dVar instanceof kyg.d.g)) {
            throw new NoWhenBranchMatchedException();
        }
        List<UploadImageModel> list12 = fzgVar2.j;
        int i9 = ((kyg.d.g) dVar).b;
        List<UploadImageModel> list13 = list12;
        ArrayList arrayList11 = new ArrayList(c5g.u(list13, 10));
        for (UploadImageModel uploadImageModel6 : list13) {
            Integer d5 = uploadImageModel6.d();
            if (d5 != null && d5.intValue() == i9) {
                uploadImageModel6 = UploadImageModel.a(uploadImageModel6, null, null, ProgressInfo.Loading.b, 55);
            }
            arrayList11.add(uploadImageModel6);
        }
        T(new czg.i.a(arrayList11));
    }

    public final void V(Throwable th, fzg fzgVar) {
        CreateCommunityReviewResult createCommunityReviewResult;
        L.i(th);
        VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        if (h03.a(th)) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            String string = context.getString(R.string.community_reviews_error_dialog_title);
            Context context2 = e43.a;
            createCommunityReviewResult = new CreateCommunityReviewResult(new CreateCommunityReviewErrorResult(string, (context2 != null ? context2 : null).getString(R.string.community_reviews_error_dialog_description)), null, U(fzgVar), null, 10, null);
        } else {
            String t = (vKApiExecutionException == null || !vKApiExecutionException.x() || drm0.N(vKApiExecutionException.t())) ? null : vKApiExecutionException.t();
            Context context3 = e43.a;
            createCommunityReviewResult = new CreateCommunityReviewResult(new CreateCommunityReviewErrorResult((context3 != null ? context3 : null).getString(R.string.community_review_unable_to_send_review), t), null, U(fzgVar), null, 10, null);
        }
        T(czg.h.b);
        this.h.b(new tyg.a(createCommunityReviewResult));
    }

    public final void W(String str, String str2, String str3) {
        CreateCommunityReviewResult createCommunityReviewResult = new CreateCommunityReviewResult(null, new CreateCommunityReviewSuccessResult(str, str2), null, str3, 5, null);
        T(czg.h.b);
        this.h.b(new tyg.a(createCommunityReviewResult));
    }

    public final ArrayList X(UserId userId, List list) {
        List<UploadImageModel> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (UploadImageModel uploadImageModel : list2) {
            if (uploadImageModel.d != null) {
                uploadImageModel = UploadImageModel.a(uploadImageModel, null, null, ProgressInfo.None.b, 55);
            } else if (uploadImageModel.g == null) {
                String str = uploadImageModel.c;
                if (str == null) {
                    str = "";
                }
                uploadImageModel = UploadImageModel.a(uploadImageModel, Integer.valueOf(com.vk.upload.impl.a.h(new com.vk.upload.impl.tasks.e(str, userId), new wze(this, 5))), null, null, 62);
            }
            arrayList.add(uploadImageModel);
        }
        return arrayList;
    }
}
