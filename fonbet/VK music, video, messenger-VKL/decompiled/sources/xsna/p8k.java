package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.communites.ReviewsDialogType;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import com.vk.ecomm.reviews.api.model.createreview.ProgressInfo;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.ecomm.reviews.impl.marketitem.createreview.domain.model.CreateMarketItemReviewRequest;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewData;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.r8k;
import xsna.s8k;
import xsna.tlo0;
import xsna.y7k;
import xsna.z7k;

/* compiled from: CreateMarketItemReviewFeature.kt */
/* loaded from: classes18.dex */
public final class p8k extends wk50<g9k, c9k, z7k, s8k> {
    public final CreateMarketItemReviewArguments f;
    public final iq6 g;
    public final u310 h;
    public final mzp0 i;
    public final f4z j;
    public final f4z k;
    public final q110 l;

    /* compiled from: CreateMarketItemReviewFeature.kt */
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

    public p8k(CreateMarketItemReviewArguments createMarketItemReviewArguments, iq6 iq6Var, u310 u310Var, mzp0 mzp0Var, x8k x8kVar) {
        super(null, x8kVar);
        this.f = createMarketItemReviewArguments;
        this.g = iq6Var;
        this.h = u310Var;
        this.i = mzp0Var;
        this.j = new f4z();
        this.k = new f4z();
        this.l = new q110(createMarketItemReviewArguments != null ? createMarketItemReviewArguments.f : null, createMarketItemReviewArguments != null ? createMarketItemReviewArguments.g : null, createMarketItemReviewArguments != null ? createMarketItemReviewArguments.h : null, null, null, null, null, null, 248);
    }

    public static final void U(p8k p8kVar, Throwable th) {
        mzp0 mzp0Var = p8kVar.i;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        if (h03.a(th)) {
            p8kVar.T(new t8k(tq.h(tlo0.Companion, R.string.market_item_review_initial_state_loading_internet_error_title), new tlo0.f(R.string.market_item_review_initial_state_loading_internet_error_description)));
        } else {
            p8kVar.T(new t8k(tq.h(tlo0.Companion, R.string.market_item_review_initial_state_loading_error_title), new tlo0.f(R.string.market_item_review_initial_state_loading_error_description)));
        }
    }

    @Override // xsna.wk50
    public final void N(c9k c9kVar, z7k z7kVar) {
        c9k c9kVar2 = c9kVar;
        z7k z7kVar2 = z7kVar;
        if (z7kVar2 instanceof z7k.b) {
            mzp0 mzp0Var = this.i;
            iq6 iq6Var = this.g;
            CreateMarketItemReviewArguments createMarketItemReviewArguments = this.f;
            if (createMarketItemReviewArguments == null) {
                return;
            }
            T(u8k.b);
            ((yd10) ((xla) iq6Var.b).b).getClass();
            a7f0.a.f(this, rsg0.w0(yfb.x(new tfx("market.getItemReviewCreateConfig", new mr(24), new sn(27)))).l(new nu0(new go1(iq6Var, 29), 16)), new u6k(this, 1), null, 5);
            Integer num = createMarketItemReviewArguments.i;
            if (num == null) {
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                a7f0.a.f(this, ((xla) iq6Var.b).d(createMarketItemReviewArguments.b, createMarketItemReviewArguments.c), new mp3(8, this, createMarketItemReviewArguments), new ee8(1, this, p8k.class, "handleErrorLoadReview", "handleErrorLoadReview(Ljava/lang/Throwable;)V", 0, 6), 1);
                return;
            }
            int intValue = num.intValue();
            if (mzp0Var != null) {
                mzp0Var.a();
            }
            long j = createMarketItemReviewArguments.b;
            UserId userId = createMarketItemReviewArguments.c;
            xla xlaVar = (xla) iq6Var.b;
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(xlaVar.d(j, userId), rsg0.w0(yfb.x(xd10.x((yd10) xlaVar.b, intValue, j, userId, 24))).l(new t34(y8k.b, 11)), new h8(new zdi(1), 14)), new j20(11, this, createMarketItemReviewArguments), new bi6(1, this, p8k.class, "handleErrorLoadReview", "handleErrorLoadReview(Ljava/lang/Throwable;)V", 0, 5), 1);
            return;
        }
        if (z7kVar2 instanceof z7k.g) {
            T(new s8k.f(((z7k.g) z7kVar2).b));
            return;
        }
        if (z7kVar2 instanceof z7k.e) {
            T(new s8k.c(((z7k.e) z7kVar2).b));
            return;
        }
        if (z7kVar2 instanceof z7k.d) {
            T(new s8k.b(((z7k.d) z7kVar2).b));
            return;
        }
        if (z7kVar2 instanceof z7k.h) {
            float f = ((z7k.h) z7kVar2).b;
            this.j.b(y7k.a.a);
            T(new s8k.g(f));
            return;
        }
        if (z7kVar2 instanceof z7k.i) {
            iq6 iq6Var2 = this.g;
            u310 u310Var = this.h;
            float f2 = c9kVar2.r;
            List<UploadImageModel> list = c9kVar2.x;
            Long l = c9kVar2.m;
            CreateMarketItemReviewData createMarketItemReviewData = c9kVar2.A;
            Float valueOf = Float.valueOf(f2);
            CreateMarketItemReviewArguments createMarketItemReviewArguments2 = this.f;
            u310Var.f(valueOf, createMarketItemReviewArguments2 != null ? createMarketItemReviewArguments2.e : null, this.l, Integer.valueOf(c9kVar2.d.length()), Integer.valueOf(c9kVar2.g.length()), Integer.valueOf(c9kVar2.j.length()));
            if (!c9kVar2.c()) {
                UserId userId2 = c9kVar2.o;
                long longValue = l != null ? l.longValue() : 0L;
                String str = c9kVar2.j;
                String str2 = c9kVar2.g;
                String str3 = c9kVar2.d;
                int i = (int) f2;
                ArrayList arrayList = new ArrayList();
                for (UploadImageModel uploadImageModel : list) {
                    Integer num2 = uploadImageModel.g;
                    if (num2 == null) {
                        num2 = uploadImageModel.d;
                    }
                    if (num2 != null) {
                        arrayList.add(num2);
                    }
                }
                CreateMarketItemReviewRequest createMarketItemReviewRequest = new CreateMarketItemReviewRequest(userId2, longValue, i, str3, str2, str, arrayList);
                yd10 yd10Var = (yd10) ((xla) iq6Var2.b).b;
                UserId userId3 = createMarketItemReviewRequest.b;
                long j2 = createMarketItemReviewRequest.c;
                int i2 = createMarketItemReviewRequest.d;
                String str4 = createMarketItemReviewRequest.e;
                String str5 = createMarketItemReviewRequest.f;
                String str6 = createMarketItemReviewRequest.g;
                List<Integer> list2 = createMarketItemReviewRequest.h;
                yd10Var.getClass();
                tfx tfxVar = new tfx("market.createItemReview", new tq(17), new uq(18));
                tfx.n(tfxVar, "owner_id", userId3, 0L, 0L, 12);
                tfx.m(tfxVar, "item_id", j2, 1L, 8);
                tfxVar.f(i2, 1, 5, "mark");
                if (str4 != null) {
                    tfx.o(tfxVar, "pros", str4, 0, 2500, 4);
                }
                if (str5 != null) {
                    tfx.o(tfxVar, "cons", str5, 0, 2500, 4);
                }
                if (str6 != null) {
                    tfx.o(tfxVar, "comment", str6, 0, 5000, 4);
                }
                tfxVar.i("photos", list2);
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(tfxVar)).l(new mm6(new d37(9), 14)), new c60(new mmf(this, 15), 19)), new d60(2)), new com.vk.movika.sdk.base.ui.s0(9, this, c9kVar2), new ut6(11, this, c9kVar2), 1);
                return;
            }
            if (createMarketItemReviewData == null || createMarketItemReviewData.g == null) {
                return;
            }
            UserId userId4 = c9kVar2.o;
            long longValue2 = l != null ? l.longValue() : 0L;
            String str7 = c9kVar2.j;
            String str8 = c9kVar2.g;
            String str9 = c9kVar2.d;
            int i3 = (int) f2;
            ArrayList arrayList2 = new ArrayList();
            for (UploadImageModel uploadImageModel2 : list) {
                Integer num3 = uploadImageModel2.g;
                if (num3 == null) {
                    num3 = uploadImageModel2.d;
                }
                if (num3 != null) {
                    arrayList2.add(num3);
                }
            }
            CreateMarketItemReviewRequest createMarketItemReviewRequest2 = new CreateMarketItemReviewRequest(userId4, longValue2, i3, str9, str8, str7, arrayList2);
            int intValue2 = createMarketItemReviewData.g.intValue();
            yd10 yd10Var2 = (yd10) ((xla) iq6Var2.b).b;
            UserId userId5 = createMarketItemReviewRequest2.b;
            long j3 = createMarketItemReviewRequest2.c;
            int i4 = createMarketItemReviewRequest2.d;
            String str10 = createMarketItemReviewRequest2.e;
            String str11 = createMarketItemReviewRequest2.f;
            String str12 = createMarketItemReviewRequest2.g;
            List<Integer> list3 = createMarketItemReviewRequest2.h;
            yd10Var2.getClass();
            tfx tfxVar2 = new tfx("market.updateItemReview", new cr(17), new io.reactivex.rxjava3.internal.operators.observable.n0(26));
            tfx.l(tfxVar2, "id", intValue2, 0, 0, 12);
            tfx.m(tfxVar2, "item_id", j3, 0L, 8);
            tfx.n(tfxVar2, "owner_id", userId5, 0L, 0L, 12);
            tfxVar2.f(i4, 1, 5, "mark");
            if (str10 != null) {
                tfx.o(tfxVar2, "pros", str10, 0, 2500, 4);
            }
            if (str11 != null) {
                tfx.o(tfxVar2, "cons", str11, 0, 2500, 4);
            }
            if (str12 != null) {
                tfx.o(tfxVar2, "comment", str12, 0, 5000, 4);
            }
            tfxVar2.i("photos", list3);
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(tfxVar2)).l(new yi2(new ol(19), 13)), new kl6(new dkg(this, 10), 11)), new o8k(0)), new ij8(7, this, c9kVar2), new com.vk.im.engine.commands.messages.a(17, this, c9kVar2), 1);
            return;
        }
        if (z7kVar2 instanceof z7k.k) {
            Long l2 = c9kVar2.m;
            Float valueOf2 = Float.valueOf(c9kVar2.r);
            boolean z = c9kVar2.s;
            CreateMarketItemReviewData createMarketItemReviewData2 = c9kVar2.A;
            this.j.b(new y7k.b(l2, valueOf2, z, createMarketItemReviewData2 != null ? createMarketItemReviewData2.g : null));
            return;
        }
        if (z7kVar2 instanceof z7k.l) {
            a8k a8kVar = c9kVar2.c;
            if (a8kVar != null) {
                this.k.b(new r8k.a(a8kVar.d));
                return;
            }
            return;
        }
        if (z7kVar2 instanceof z7k.j) {
            T(new s8k.a(((z7k.j) z7kVar2).b));
            return;
        }
        if (!(z7kVar2 instanceof z7k.f)) {
            if (z7kVar2.equals(z7k.c.b)) {
                if ((!c9kVar2.b() || c9kVar2.c()) && !c9kVar2.h()) {
                    Long l3 = c9kVar2.m;
                    Float valueOf3 = Float.valueOf(c9kVar2.r);
                    boolean z2 = c9kVar2.s;
                    CreateMarketItemReviewData createMarketItemReviewData3 = c9kVar2.A;
                    this.j.b(new y7k.b(l3, valueOf3, z2, createMarketItemReviewData3 != null ? createMarketItemReviewData3.g : null));
                    return;
                }
                u310 u310Var2 = this.h;
                Long l4 = c9kVar2.m;
                long j4 = c9kVar2.o.b;
                CreateMarketItemReviewArguments createMarketItemReviewArguments3 = this.f;
                u310Var2.i(l4, j4, createMarketItemReviewArguments3 != null ? createMarketItemReviewArguments3.e : null, this.l);
                this.k.b(new r8k.c(tq.h(tlo0.Companion, R.string.market_item_confirm_title), new tlo0.f(R.string.market_item_confirm_description), ReviewsDialogType.CONFIRM, 12));
                return;
            }
            if (z7kVar2 instanceof z7k.m) {
                this.k.b(new r8k.a(i5s.a(new StringBuilder("https://"), a0a.d, "/terms/review_rules")));
                return;
            }
            if (!(z7kVar2 instanceof z7k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z7k.a aVar = (z7k.a) z7kVar2;
            q110 q110Var = this.l;
            CreateMarketItemReviewArguments createMarketItemReviewArguments4 = this.f;
            u310 u310Var3 = this.h;
            if (aVar.equals(z7k.a.C4161a.b)) {
                u310Var3.n(createMarketItemReviewArguments4 != null ? createMarketItemReviewArguments4.e : null, q110Var);
                return;
            }
            if (aVar.equals(z7k.a.b.b)) {
                u310Var3.b(createMarketItemReviewArguments4 != null ? createMarketItemReviewArguments4.e : null, q110Var);
                return;
            } else {
                if (!aVar.equals(z7k.a.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                u310Var3.k(createMarketItemReviewArguments4 != null ? createMarketItemReviewArguments4.e : null, q110Var);
                this.j.b(new y7k.b(c9kVar2.m, Float.valueOf(c9kVar2.r), c9kVar2.s, null));
                return;
            }
        }
        z7k.f fVar = (z7k.f) z7kVar2;
        f4z f4zVar = this.j;
        if (epx.f(fVar, z7k.f.d.b)) {
            f4zVar.b(y7k.a.a);
            this.k.b(new r8k.b(c9kVar2.b - c9kVar2.x.size()));
            return;
        }
        if (fVar instanceof z7k.f.e) {
            z7k.f.e eVar = (z7k.f.e) fVar;
            f4zVar.b(y7k.a.a);
            List<UploadImageModel> list4 = c9kVar2.x;
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
            T(new s8k.j.a(arrayList3));
            com.vk.upload.impl.a.e(eVar.b);
            return;
        }
        if (fVar instanceof z7k.f.C4162f) {
            z7k.f.C4162f c4162f = (z7k.f.C4162f) fVar;
            f4zVar.b(y7k.a.a);
            com.vk.upload.impl.a.b(c4162f.b, null);
            List<UploadImageModel> list6 = c9kVar2.x;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list6) {
                Integer d2 = ((UploadImageModel) obj).d();
                int i6 = c4162f.b;
                if (d2 == null || d2.intValue() != i6) {
                    arrayList4.add(obj);
                }
            }
            T(new s8k.j.a(new ArrayList(arrayList4)));
            return;
        }
        if (fVar instanceof z7k.f.c) {
            ArrayList arrayList5 = new ArrayList(c9kVar2.x);
            List<String> list7 = ((z7k.f.c) fVar).b;
            ArrayList arrayList6 = new ArrayList(c5g.u(list7, 10));
            for (String str13 : list7) {
                arrayList6.add(new n5a0(com.vk.upload.impl.a.h(new com.vk.upload.impl.tasks.n(str13, c9kVar2.o), new jm0(this, 24)), str13));
            }
            arrayList5.removeIf(new d86(new com.vk.movika.sdk.base.utils.b(20), 1));
            ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                n5a0 n5a0Var = (n5a0) it.next();
                arrayList7.add(new UploadImageModel(Integer.valueOf(n5a0Var.a), n5a0Var.b, null, ProgressInfo.Loading.b, null, null, 52, null));
            }
            arrayList5.addAll(arrayList7);
            T(new s8k.j.a(arrayList5));
            return;
        }
        if (fVar instanceof z7k.f.a) {
            List<UploadImageModel> list8 = c9kVar2.x;
            int i7 = ((z7k.f.a) fVar).b;
            k0j k0jVar = new k0j(fVar, 4);
            List<UploadImageModel> list9 = list8;
            ArrayList arrayList8 = new ArrayList(c5g.u(list9, 10));
            for (UploadImageModel uploadImageModel4 : list9) {
                Integer d3 = uploadImageModel4.d();
                if (d3 != null && d3.intValue() == i7) {
                    uploadImageModel4 = (UploadImageModel) k0jVar.invoke(uploadImageModel4);
                }
                arrayList8.add(uploadImageModel4);
            }
            T(new s8k.j.a(arrayList8));
            return;
        }
        if (fVar instanceof z7k.f.b) {
            List<UploadImageModel> list10 = c9kVar2.x;
            int i8 = ((z7k.f.b) fVar).b;
            List<UploadImageModel> list11 = list10;
            ArrayList arrayList9 = new ArrayList(c5g.u(list11, 10));
            for (UploadImageModel uploadImageModel5 : list11) {
                Integer d4 = uploadImageModel5.d();
                if (d4 != null && d4.intValue() == i8) {
                    uploadImageModel5 = UploadImageModel.a(uploadImageModel5, null, null, ProgressInfo.Error.b, 55);
                }
                arrayList9.add(uploadImageModel5);
            }
            T(new s8k.j.a(arrayList9));
            return;
        }
        if (!(fVar instanceof z7k.f.g)) {
            throw new NoWhenBranchMatchedException();
        }
        List<UploadImageModel> list12 = c9kVar2.x;
        int i9 = ((z7k.f.g) fVar).b;
        List<UploadImageModel> list13 = list12;
        ArrayList arrayList10 = new ArrayList(c5g.u(list13, 10));
        for (UploadImageModel uploadImageModel6 : list13) {
            Integer d5 = uploadImageModel6.d();
            if (d5 != null && d5.intValue() == i9) {
                uploadImageModel6 = UploadImageModel.a(uploadImageModel6, null, null, ProgressInfo.Loading.b, 55);
            }
            arrayList10.add(uploadImageModel6);
        }
        T(new s8k.j.a(arrayList10));
    }

    public final wj50<r8k> V() {
        return this.k;
    }

    public final wj50<y7k> W() {
        return this.j;
    }

    public final void X(Throwable th, c9k c9kVar) {
        T(s8k.h.b);
        boolean z = th instanceof VKApiExecutionException;
        f4z f4zVar = this.k;
        if (!z) {
            f4zVar.b(new r8k.c(tq.h(tlo0.Companion, R.string.create_market_item_error_title), new tlo0.f(R.string.create_market_item_error_description), null, 252));
            return;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        int C = vKApiExecutionException.C();
        CreateMarketItemReviewArguments createMarketItemReviewArguments = this.f;
        if (C == 1210) {
            this.h.l(c9kVar.m, c9kVar.o.b, createMarketItemReviewArguments != null ? createMarketItemReviewArguments.e : null, this.l);
        } else if (C != 1214) {
            this.h.h(c9kVar.m, c9kVar.o.b, createMarketItemReviewArguments != null ? createMarketItemReviewArguments.e : null, this.l);
        } else {
            this.h.m(c9kVar.m, c9kVar.o.b, createMarketItemReviewArguments != null ? createMarketItemReviewArguments.e : null, this.l);
        }
        f4zVar.b(new r8k.c(tq.h(tlo0.Companion, R.string.create_market_item_error_title), h03.a(th) ? tq.h(tlo0.Companion, R.string.create_market_item_review_internet_connection_error_description) : (!vKApiExecutionException.x() || drm0.N(vKApiExecutionException.t())) ? tq.h(tlo0.Companion, R.string.create_market_item_error_description) : oq.d(tlo0.Companion, vKApiExecutionException.t()), null, 252));
    }

    public final void Y(c9k c9kVar, cak cakVar) {
        Long l = c9kVar.m;
        long j = c9kVar.o.b;
        CreateMarketItemReviewArguments createMarketItemReviewArguments = this.f;
        this.h.c(l, j, createMarketItemReviewArguments != null ? createMarketItemReviewArguments.e : null, this.l);
        T(new s8k.i(cakVar.a, cakVar.b));
    }
}
