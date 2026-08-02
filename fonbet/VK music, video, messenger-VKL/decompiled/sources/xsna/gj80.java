package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.onepasspromo.impl.OnePassPromoFragment;
import com.vk.profile.user.impl.ui.f;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$SubType;
import com.vk.qrcode.c;
import com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView;
import com.vk.stories.design.view.text.TextStyleColorPicker;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.bwq0;
import xsna.cqc0;
import xsna.ipp0;
import xsna.q8o0;
import xsna.se90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gj80 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gj80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v52, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair;
        int i = this.b;
        int i2 = 7;
        ApiApplication apiApplication = null;
        Group group = null;
        Group group2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                OnePassPromoFragment onePassPromoFragment = (OnePassPromoFragment) obj2;
                int i3 = OnePassPromoFragment.R;
                ((ej80) onePassPromoFragment.N.getValue()).b();
                ((ioz) onePassPromoFragment.O.getValue()).a(onePassPromoFragment.kn());
                return s3q0.a;
            case 1:
                ((zak0) ((se90) obj2).g).setValue((se90.b) obj);
                return s3q0.a;
            case 2:
                VkButton vkButton = ((h2a0) obj2).f1;
                (vkButton != null ? vkButton : null).setLoading(true);
                return s3q0.a;
            case 3:
                izs izsVar = (izs) obj;
                Iterator it = ((e2b0) obj2).d.iterator();
                while (it.hasNext()) {
                    izsVar.invoke((com.vk.music.player.e) it.next());
                }
                return null;
            case 4:
                SwitchCompat switchCompat = (SwitchCompat) obj2;
                switchCompat.setOnCheckedChangeListener(null);
                switchCompat.setEnabled(false);
                return s3q0.a;
            case 5:
                cqc0.c cVar = (cqc0.c) obj;
                bwt0.p0(cVar.C, false);
                bwt0.p0(cVar.D, true);
                ((cqc0) obj2).getClass();
                bwt0.p0(cVar.d, false);
                bwt0.p0(cVar.e, false);
                bwt0.p0(cVar.n, false);
                bwt0.p0(cVar.o, false);
                bwt0.p0(cVar.h, false);
                bwt0.p0(cVar.v, false);
                bwt0.p0(cVar.p, false);
                bwt0.p0(cVar.i, false);
                bwt0.p0(cVar.c, false);
                return s3q0.a;
            case 6:
                fa00 fa00Var = (fa00) obj2;
                ay00 ay00Var = (ay00) obj;
                if (ay00Var instanceof MarketEventGoodCreated) {
                    fa00Var.invoke(ay00Var);
                }
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((px6) obj).b.a == ((ox6) obj2).a);
            case 8:
                com.vk.qrcode.c cVar2 = (com.vk.qrcode.c) obj2;
                UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
                int i4 = c.a.$EnumSwitchMapping$0[cVar2.o().ordinal()];
                if (i4 == 1) {
                    pair = new Pair(utilsDomainResolvedWithDataDto.getType(), QRTypes$SubType.LINK_USER);
                } else if (i4 == 2) {
                    GroupsGroupFullDto f = utilsDomainResolvedWithDataDto.f();
                    if (f != null) {
                        new dqu();
                        group2 = dqu.a(f);
                    }
                    pair = new Pair(group2, utilsDomainResolvedWithDataDto.f().L2() == GroupsGroupTypeDto.EVENT ? QRTypes$SubType.LINK_VK_EVENT : QRTypes$SubType.LINK_GROUP);
                } else if (i4 == 3) {
                    GroupsGroupFullDto f2 = utilsDomainResolvedWithDataDto.f();
                    if (f2 != null) {
                        new dqu();
                        group = dqu.a(f2);
                    }
                    pair = new Pair(group, QRTypes$SubType.LINK_VK_EVENT);
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException();
                    }
                    AppsAppDto d = utilsDomainResolvedWithDataDto.d();
                    if (d != null) {
                        new re3();
                        apiApplication = re3.b(d);
                    }
                    pair = new Pair(apiApplication, QRTypes$SubType.LINK_VK_APP);
                }
                Object d2 = pair.d();
                QRTypes$SubType qRTypes$SubType = (QRTypes$SubType) pair.g();
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.g(cVar2.q(), qRTypes$SubType, cVar2.c);
                return d2;
            case 9:
                ((v080) ((woe0) obj2).getActivity()).T0();
                return s3q0.a;
            case 10:
                return new wxh((ViewGroup) obj, 0, new RecyclerView.u(), new tj60((m2g0) obj2, i2), true);
            case 11:
                ((b2e0) obj2).a();
                return s3q0.a;
            case 12:
                ((io.reactivex.rxjava3.core.y) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 13:
                e3j0 e3j0Var = (e3j0) obj2;
                lqs lqsVar = (lqs) obj;
                List<UserProfile> list = lqsVar.a;
                List<UserProfile> list2 = lqsVar.b;
                List<UserProfile> list3 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (UserProfile userProfile : list3) {
                    Serializer.c<ProfileFriendItem> cVar3 = ProfileFriendItem.CREATOR;
                    Serializer.c<ImageList> cVar4 = ImageList.CREATOR;
                    arrayList.add(new ProfileFriendItem(userProfile.c, userProfile.d, userProfile.f, ImageList.a.a(userProfile.g), new ArrayList(), userProfile.Y));
                }
                e3j0Var.l = new VkPaginationList<>(arrayList, lqsVar.a.size(), false, 0, 8, null);
                e3j0Var.k = new VkPaginationList<>(new ArrayList(list2), list2.size(), false, 0, 8, null);
                e3j0Var.x();
                return s3q0.a;
            case 14:
                Object obj3 = ((bmj0) obj2).o;
                ((amj0) (obj3 != null ? obj3 : null)).a();
                return s3q0.a;
            case 15:
                ((jba0) obj2).D();
                return s3q0.a;
            case 16:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                ArrayList l = fl3.l(sQLiteDatabase);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = l.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    String str = (String) next;
                    if (!epx.f(str, "android_metadata") && !epx.f(str, "sqlite_sequence")) {
                        arrayList2.add(next);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it3.next()));
                }
                return s3q0.a;
            case 17:
                ((com.vk.clips.sdk.shared.item.static_ads.b) obj2).T(StaticAdsItemPatch.a.C0683a.b);
                return s3q0.a;
            case 18:
                ((Boolean) obj).getClass();
                ((gql0) obj2).b.a();
                return s3q0.a;
            case 19:
                tgi0 tgi0Var = (tgi0) obj;
                int i5 = StoryMediaPickerFragment.d0;
                qgi0.r(tgi0Var, "toolbar_template");
                qgi0.h(tgi0Var, ((StoryMediaPickerFragment) obj2).getString(R.string.story_catalog_ideas));
                return s3q0.a;
            case 20:
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
                List<GroupsGroupFullDto> e = groupsGetObjectExtendedResponseDto.e();
                dqu dquVar = ((bam0) obj2).c;
                ArrayList arrayList3 = new ArrayList(c5g.u(e, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : e) {
                    dquVar.getClass();
                    arrayList3.add(dqu.a(groupsGroupFullDto));
                }
                return new Pair(arrayList3, Boolean.valueOf(groupsGetObjectExtendedResponseDto.e().size() < groupsGetObjectExtendedResponseDto.getCount()));
            case 21:
                gzm0 gzm0Var = (gzm0) obj2;
                Integer num = (Integer) obj;
                vdx0 vdx0Var = e370.e;
                return (vdx0Var != null ? vdx0Var : null).d().O(r4.o, gzm0Var.d.b, num).U(new oq80(fzm0.b, i2));
            case 22:
                r8o0 r8o0Var = (r8o0) obj2;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(r8o0Var), new com.vk.messagetemplates.impl.details.e());
                g47Var.a(tci.k(r8o0Var));
                g47Var.d(new q8o0.a(r8o0Var));
                return s3q0.a;
            case 23:
                cmo0 cmo0Var = (cmo0) obj2;
                t2l0 t2l0Var = (t2l0) obj;
                ImageView imageView = cmo0Var.q;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setImageBitmap(null);
                ImageView imageView2 = cmo0Var.q;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                bwt0.p0(imageView2, false);
                imo0 imo0Var = cmo0Var.f;
                imo0Var.i = t2l0Var;
                TextStyleColorPicker textStyleColorPicker = cmo0Var.m;
                (textStyleColorPicker != null ? textStyleColorPicker : null).a(imo0Var.g, t2l0Var);
                kmo0 kmo0Var = kmo0.CHOOSE_COLOR;
                cmo0Var.w = kmo0Var;
                cmo0Var.b(kmo0Var);
                cmo0Var.e.playVideo();
                return s3q0.a;
            case 24:
                yp80 yp80Var = (yp80) obj2;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 25:
                Boolean invoke = ((xkp0) obj2).s.invoke((ov70) obj);
                invoke.booleanValue();
                return invoke;
            case 26:
                ipp0 ipp0Var = (ipp0) obj2;
                qcy<Object>[] qcyVarArr = ipp0.m1;
                ipp0.d dVar = (ipp0.d) ipp0Var.h1.getValue();
                return new cn50(up2.d(new defpackage.f0(27, (gzs) obj, dVar), new mpp0(), new tti(new a6(15, ((VideoGrowthComponent) ipp0Var.i1.getValue()).Z7(), dVar))));
            case 27:
                f.e.k1 k1Var = (f.e.k1) obj;
                fpq0 fpq0Var = ((jmq0) obj2).k;
                (fpq0Var != null ? fpq0Var : null).B(k1Var);
                return s3q0.a;
            case 28:
                isq0 isq0Var = (isq0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                int size = wallWithCounters.size();
                isq0Var.x(wallWithCounters, true);
                isq0Var.e(new bwq0.a.m(size));
                return s3q0.a;
            default:
                VerticalizationBannerView.a aVar = ((VerticalizationBannerView) obj2).f;
                if (aVar != null) {
                    aVar.a();
                }
                return s3q0.a;
        }
    }
}
