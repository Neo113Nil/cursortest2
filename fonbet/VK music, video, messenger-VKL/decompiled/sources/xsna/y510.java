package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewResponseDto;
import com.vk.api.generated.market.dto.MarketItemForReviewDto;
import com.vk.api.generated.wall.dto.WallLastPostingInfoResponseDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.log.L;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.b;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.superapp.api.dto.menu.Action;
import com.vk.superapp.api.dto.menu.Animation;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.commons.http.HttpHeader;
import xsna.a990;
import xsna.b750;
import xsna.bi40;
import xsna.e8i0;
import xsna.k840;
import xsna.qo90;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class y510 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ y510(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Animation animation;
        String c;
        String d;
        int i;
        float f;
        String str = "";
        int i2 = 13;
        int i3 = 9;
        switch (this.b) {
            case 0:
                ListBuilder e = e43.e();
                List<MarketItemForReviewDto> e2 = ((MarketGetItemsForReviewResponseDto) obj).e();
                ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
                for (MarketItemForReviewDto marketItemForReviewDto : e2) {
                    UserId d2 = marketItemForReviewDto.d();
                    Integer valueOf = Integer.valueOf(marketItemForReviewDto.f());
                    long e3 = marketItemForReviewDto.e();
                    List<BaseImageDto> i4 = marketItemForReviewDto.i();
                    String title = marketItemForReviewDto.getTitle();
                    String d3 = marketItemForReviewDto.g().d();
                    arrayList.add(new a610(d2, valueOf, e3, i4, title, d3 == null ? "" : d3, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                e.addAll(arrayList);
                return e.g();
            case 1:
                return Boolean.valueOf(((StoryCameraGalleryData) obj).c);
            case 2:
                SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) obj;
                List<Animation> a = superAppAnimationConfig.a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : a) {
                    if (((Animation) obj2).b() == Action.OPEN) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty() && (c = (animation = (Animation) j5g.Y(arrayList2)).c()) != null && c.length() != 0 && (d = animation.d()) != null && d.length() != 0) {
                    return io.reactivex.rxjava3.core.x.k(superAppAnimationConfig);
                }
                k720 k720Var = k720.a;
                return k720.S(arrayList2).l(new np1(new wik(superAppAnimationConfig, 22), 28));
            case 3:
                return b.c.a;
            case 4:
                return j5g.y0((List) obj);
            case 5:
                bi40 bi40Var = (bi40) obj;
                if (bi40Var.equals(bi40.a.a)) {
                    i = R.string.music_talkback_delete_downloaded_playlist;
                } else if (bi40Var.equals(bi40.c.a)) {
                    i = R.string.music_talkback_download_playlist;
                } else if (bi40Var.equals(bi40.d.a)) {
                    i = R.string.music_talkback_pending_downloading_playlist;
                } else {
                    if (!(bi40Var instanceof bi40.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_downloading_playlist;
                }
                return Integer.valueOf(i);
            case 6:
                return b750.b.a;
            case 7:
                new dqu();
                List<GroupsGroupFullDto> d4 = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d4 != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d4));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 8:
                com.vk.voip.ui.sessionrooms.f fVar = (com.vk.voip.ui.sessionrooms.f) obj;
                int i5 = el70.g1;
                return Boolean.valueOf(fVar.b || fVar.d);
            case 9:
                return ((HttpHeader) obj).toString();
            case 10:
                qo90.a aVar = (qo90.a) obj;
                ArrayList arrayList3 = new ArrayList();
                xn90 xn90Var = aVar.b;
                a990<Integer> a990Var = aVar.c;
                int i6 = 0;
                for (Object obj3 : xn90Var.a) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        e43.t();
                        throw null;
                    }
                    VideoFile videoFile = (VideoFile) obj3;
                    String j = pvo0.j(videoFile.b0() * 1000, false, false);
                    if (!epx.f(str, j)) {
                        if (i6 > 0) {
                            arrayList3.add(new go90(cn70.b(8), 2));
                        }
                        arrayList3.add(new fo90(j));
                        str = j;
                    }
                    arrayList3.add(new eo90(videoFile));
                    arrayList3.add(new ho90(cn70.b(6)));
                    i6 = i7;
                }
                a990.a aVar2 = a990Var.c;
                if (!(aVar2 instanceof a990.a.b)) {
                    if (aVar2 instanceof a990.a.c) {
                        arrayList3.add(jo90.b);
                    } else {
                        if (!(aVar2 instanceof a990.a.C2530a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList3.add(new io90(((a990.a.C2530a) aVar2).a));
                    }
                }
                return new ko90(arrayList3, a990Var.d instanceof a990.b.C2531b);
            case 11:
                return s3q0.a;
            case 12:
                return Boolean.valueOf(((l3b0) obj).k);
            case 13:
                return new VKList(k840.a.c().f((List) obj));
            case 14:
                return ((WallLastPostingInfoResponseDto) obj).d();
            case 15:
                return ((PostingState.Editing) obj).i.m;
            case 16:
                return s3q0.a;
            case 17:
                cvk.u(R.string.error_network, false);
                L.i((Throwable) obj);
                return s3q0.a;
            case 18:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 19:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    f = 0.64f;
                } else {
                    if (!booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 20:
                List list = (List) obj;
                Object obj4 = list.get(0);
                int i8 = l5g.l;
                fh9 fh9Var = i2h0.a;
                Boolean bool = Boolean.FALSE;
                epx.f(obj4, bool);
                long j2 = (obj4 != null ? epx.f(obj4, Boolean.FALSE) ? new l5g(l5g.k) : new l5g(f870.c(((Integer) obj4).intValue())) : null).a;
                Object obj5 = list.get(1);
                gno0[] gno0VarArr = fno0.b;
                izs<Object, Object> izsVar = i2h0.x.c;
                epx.f(obj5, bool);
                long j3 = (obj5 != null ? (fno0) izsVar.invoke(obj5) : null).a;
                Object obj6 = list.get(2);
                b6s b6sVar = b6s.c;
                b6s b6sVar2 = (epx.f(obj6, bool) || obj6 == null) ? null : (b6s) ((izs) i2h0.n.c).invoke(obj6);
                Object obj7 = list.get(3);
                u5s u5sVar = (epx.f(obj7, bool) || obj7 == null) ? null : (u5s) ((izs) i2h0.v.c).invoke(obj7);
                Object obj8 = list.get(4);
                v5s v5sVar = (epx.f(obj8, bool) || obj8 == null) ? null : (v5s) ((izs) i2h0.w.c).invoke(obj8);
                Object obj9 = list.get(6);
                String str2 = obj9 != null ? (String) obj9 : null;
                Object obj10 = list.get(7);
                epx.f(obj10, bool);
                long j4 = (obj10 != null ? (fno0) izsVar.invoke(obj10) : null).a;
                Object obj11 = list.get(8);
                et6 et6Var = (epx.f(obj11, bool) || obj11 == null) ? null : (et6) ((izs) i2h0.o.c).invoke(obj11);
                Object obj12 = list.get(9);
                zho0 zho0Var = (epx.f(obj12, bool) || obj12 == null) ? null : (zho0) ((izs) i2h0.l.c).invoke(obj12);
                Object obj13 = list.get(10);
                lwz lwzVar = lwz.d;
                lwz lwzVar2 = (epx.f(obj13, bool) || obj13 == null) ? null : (lwz) ((izs) i2h0.A.c).invoke(obj13);
                Object obj14 = list.get(11);
                epx.f(obj14, bool);
                long j5 = (obj14 != null ? epx.f(obj14, Boolean.FALSE) ? new l5g(l5g.k) : new l5g(f870.c(((Integer) obj14).intValue())) : null).a;
                Object obj15 = list.get(12);
                pdo0 pdo0Var = (epx.f(obj15, bool) || obj15 == null) ? null : (pdo0) ((izs) i2h0.k.c).invoke(obj15);
                Object obj16 = list.get(13);
                v4j0 v4j0Var = v4j0.d;
                return new hik0(j2, j3, b6sVar2, u5sVar, v5sVar, null, str2, j4, et6Var, zho0Var, lwzVar2, j5, pdo0Var, (epx.f(obj16, bool) || obj16 == null) ? null : (v4j0) ((izs) i2h0.q.c).invoke(obj16), 49184);
            case 21:
                qgi0.r((tgi0) obj, "search_filters_top_bar_title");
                return s3q0.a;
            case 22:
                tj50.a aVar3 = (tj50.a) obj;
                n9w n9wVar = new n9w(25);
                ao8 ao8Var = ao8.d;
                return new e8i0.b(aVar3.a(n9wVar, ao8Var), aVar3.a(new y160(i3), ao8Var), aVar3.a(new d230(i2), ao8Var));
            case 23:
                cvk.u(R.string.report_sent_error, false);
                return s3q0.a;
            case 24:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 25:
                int i9 = StickersRecyclerView.w;
                t6g0 t6g0Var = t6g0.b;
                t6g0.d().V(((BaseBoolIntDto) obj).i() == BaseBoolIntDto.YES.i());
                t6g0.d().o0(0L);
                return s3q0.a;
            case 26:
                L.i((Throwable) obj);
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 28:
                com.vk.core.view.components.tabs.d dVar = (com.vk.core.view.components.tabs.d) obj;
                dVar.setStartTextColorRes(R.attr.vk_ui_text_secondary);
                dVar.setEndTextColorRes(R.attr.vk_ui_text_accent_themed);
                dVar.setTitleTextColorful(true);
                return s3q0.a;
            default:
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ y510(Object obj, int i) {
        this.b = i;
    }
}
