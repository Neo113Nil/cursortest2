package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.api.generated.apps.dto.AppsAchievementBlockButtonDto;
import com.vk.api.generated.apps.dto.AppsAchievementBlockLabelDto;
import com.vk.api.generated.apps.dto.AppsAchievementBlockWhatInsideModalInfoDto;
import com.vk.api.generated.apps.dto.AppsActivityItemDto;
import com.vk.api.generated.apps.dto.AppsCatalogBaseActionDto;
import com.vk.api.generated.apps.dto.AppsCatalogBaseAppLaunchParamsDto;
import com.vk.api.generated.apps.dto.AppsFeaturedSlideDto;
import com.vk.api.generated.apps.dto.AppsFriendsStackDto;
import com.vk.api.generated.apps.dto.AppsGamesCatalogCollectionDto;
import com.vk.api.generated.apps.dto.AppsGamesCatalogPromoBannerDto;
import com.vk.api.generated.apps.dto.AppsMiniappsAchievementInfoDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogGameDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemHeaderDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto;
import com.vk.api.generated.apps.dto.AppsRequestItemDto;
import com.vk.api.generated.apps.dto.AppsWhatInsideModalInfoGiftsDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.donut.dto.DonutBannerDto;
import com.vk.api.generated.donut.dto.DonutGetInfoGroupDonutBlockDto;
import com.vk.api.generated.donut.dto.DonutGetInfoResponseDto;
import com.vk.api.generated.donut.dto.DonutGoalsInfoDto;
import com.vk.api.generated.donut.dto.DonutRegularSupportDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseGamesCatalogSectionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.a;
import com.vk.clips.favorites.impl.ui.folders.renaming.f;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.donut.design.compose.banner.InfoBannerIcon;
import com.vk.donut.design.compose.banner.a;
import com.vk.dto.common.Attachment;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.file_picker.external.e;
import com.vk.games.model.GamesAchievementLabelColor;
import com.vk.games.model.GamesAchievementState;
import com.vk.games.model.GamesAchievementType;
import com.vk.games.model.GamesCatalogActionType;
import com.vk.games.model.GamesCatalogActivityType;
import com.vk.games.model.GamesCatalogSection;
import com.vk.games.model.GamesCatalogUser;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.GamesWhatInsideModalInfoGiftType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.group.vc.GroupProfileView;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.im.ui.fragments.im_calls_action.ImCallAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bat;
import xsna.exn;
import xsna.f0k;
import xsna.gm50;
import xsna.it80;
import xsna.l8t;
import xsna.msg;
import xsna.oks;
import xsna.q3o;
import xsna.t3o;
import xsna.tj50;
import xsna.tra0;
import xsna.u4m;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o1e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ae A[LOOP:4: B:123:0x02a8->B:125:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0685  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        km1 km1Var;
        pwn pwnVar;
        com.vk.donut.design.compose.banner.a bVar;
        gvw gvwVar;
        BaseLinkButtonDto e;
        BaseLinkButtonActionDto e2;
        BaseLinkButtonDto d;
        BaseLinkButtonActionDto e3;
        BaseLinkButtonActionDto e4;
        BaseLinkButtonActionDto e5;
        ArrayList arrayList;
        Object kVar;
        ArrayList arrayList2;
        GamesAchievementType gamesAchievementType;
        GamesAchievementType gamesAchievementType2;
        int i;
        GamesAchievementState gamesAchievementState;
        GamesAchievementState gamesAchievementState2;
        AppsAchievementBlockLabelDto g;
        o8t o8tVar;
        AppsAchievementBlockButtonDto e6;
        n8t n8tVar;
        AppsAchievementBlockWhatInsideModalInfoDto l;
        lgt lgtVar;
        cat catVar;
        GamesCatalogActionType gamesCatalogActionType;
        Object obj2;
        Object obj3;
        GamesCatalogSection.a.C1078a c1078a;
        WebApiApplication d2;
        AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto;
        Pair pair;
        String str;
        String str2;
        sbt sbtVar;
        String str3;
        String str4;
        String str5;
        GamesCatalogSection.h.a aVar;
        int i2 = this.b;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj4;
                int i3 = ClipsEntryPointsFragment.i0;
                a.c cVar = a.c.b;
                clipsEntryPointsFragment.getClass();
                xn50.a.c(clipsEntryPointsFragment, cVar);
                return s3q0.a;
            case 1:
                tj50.a aVar2 = (tj50.a) obj;
                j4e j4eVar = ((com.vk.clips.favorites.impl.ui.folders.renaming.e) obj4).d;
                ai6 ai6Var = new ai6(j4eVar, 2);
                ao8 ao8Var = ao8.d;
                return new f.b(aVar2.a(ai6Var, ao8Var), aVar2.a(new bi6(j4eVar, 2), ao8Var), aVar2.a(new ee8(j4eVar, 3), ao8Var), aVar2.a(new gy(j4eVar, 7), ao8Var));
            case 2:
                int intValue = ((Integer) obj).intValue();
                Iterator it = j5g.O0((ArrayList) m6e.this.g.b).iterator();
                while (it.hasNext()) {
                    ((v0d) it.next()).a(intValue);
                }
                return s3q0.a;
            case 3:
                ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) obj4;
                int i4 = ClipsVideoAttachmentPickerFragment.W;
                a.b bVar2 = a.b.b;
                clipsVideoAttachmentPickerFragment.getClass();
                xn50.a.c(clipsVideoAttachmentPickerFragment, bVar2);
                return s3q0.a;
            case 4:
                uh3 uh3Var = ((msg) ((msg.a) obj4).m).h;
                if (uh3Var == null) {
                    return s3q0.a;
                }
                uh3Var.invoke();
                throw null;
            case 5:
                o4h o4hVar = (o4h) obj4;
                o4hVar.c((e520) obj);
                dw20 dw20Var = o4hVar.a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 6:
                fh5 fh5Var = (fh5) obj;
                fh5Var.w(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_LIVES_BLOCK));
                fh5 fh5Var2 = ((ieh) obj4).I;
                if (fh5Var2 == null) {
                    fh5Var2 = null;
                }
                if (fh5Var2 != null) {
                    yg5 yg5Var = fh5Var.j;
                    if (yg5Var == null) {
                        yg5Var = null;
                    }
                    yg5Var.f0(fh5Var2);
                }
                return s3q0.a;
            case 7:
                com.vk.profile.community.impl.ui.view.a aVar3 = (com.vk.profile.community.impl.ui.view.a) obj4;
                aVar3.f.invoke();
                aVar3.e.q();
                return s3q0.a;
            case 8:
                j5i j5iVar = (j5i) obj4;
                Attachment attachment = j5iVar.D;
                CompactAttachmentStyle compactAttachmentStyle = j5iVar.C;
                if (attachment != null && compactAttachmentStyle != null) {
                    j5iVar.T6(attachment, compactAttachmentStyle);
                }
                return s3q0.a;
            case 9:
                return new zr6(((LayoutInflater) obj4).inflate(R.layout.vkim_contacts_not_found, (ViewGroup) obj, false));
            case 10:
                return CoverChooseState.a((CoverChooseState) obj, null, null, ((f0k.b.c) ((f0k.b) obj4)).b, false, 23);
            case 11:
                ((DebugFileManagerFragment) obj4).Q = ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 12:
                tra0.a.x((tra0.a) obj, (tra0) obj4, 0, 0);
                return s3q0.a;
            case 13:
                u4m u4mVar = (u4m) ((u4m.a) obj4).m;
                if (u4mVar != null && (km1Var = u4mVar.h) != null) {
                    km1Var.invoke();
                }
                return s3q0.a;
            case 14:
                Throwable th = (Throwable) obj;
                xam.y.a(th);
                if (((xam) obj4).u != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 15:
                DialogsFragment dialogsFragment = (DialogsFragment) obj4;
                dialogsFragment.N.b(((jyv) dialogsFragment.r0.getValue()).a((ImCallAction) obj));
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((xrm) obj4).d.b(((Dialog) obj).nc()));
            case 17:
                fum fumVar = (fum) obj4;
                Boolean bool = (Boolean) obj;
                at6 at6Var = fum.t;
                if (at6Var != null) {
                    i0q0.g(at6Var);
                }
                at6 at6Var2 = new at6(3, fumVar, bool);
                fum.t = at6Var2;
                i0q0.d(300L, at6Var2);
                return s3q0.a;
            case 18:
                cyn cynVar = (cyn) obj4;
                it80.a aVar4 = it80.b;
                DonutGetInfoGroupDonutBlockDto d3 = ((DonutGetInfoResponseDto) obj).d();
                if (d3 != null) {
                    ((exn) cynVar.b.getValue()).getClass();
                    DonutRegularSupportDto i5 = d3.i();
                    DonutGoalsInfoDto g2 = d3.g();
                    String title = d3.getTitle();
                    String description = d3.getDescription();
                    String f = d3.f();
                    if (i5 != null && g2 != null) {
                        bVar = new a.c(exn.b(i5), exn.a(g2));
                    } else if (i5 != null) {
                        bVar = new a.b(exn.b(i5));
                    } else if (g2 != null) {
                        bVar = new a.b(exn.a(g2));
                    }
                    DonutBannerDto e7 = d3.e();
                    if (e7 == null) {
                        gvwVar = null;
                    } else {
                        if (exn.a.$EnumSwitchMapping$1[e7.d().ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gvwVar = new gvw(InfoBannerIcon.ERROR, e7.e());
                    }
                    BaseLinkButtonDto d4 = d3.d();
                    String url = (d4 == null || (e5 = d4.e()) == null) ? null : e5.getUrl();
                    BaseLinkButtonDto j = d3.j();
                    String url2 = (j == null || (e4 = j.e()) == null) ? null : e4.getUrl();
                    DonutGoalsInfoDto g3 = d3.g();
                    String url3 = (g3 == null || (d = g3.d()) == null || (e3 = d.e()) == null) ? null : e3.getUrl();
                    DonutRegularSupportDto i6 = d3.i();
                    pwnVar = new pwn(title, description, f, bVar, gvwVar, url, url2, url3, (i6 == null || (e = i6.e()) == null || (e2 = e.e()) == null) ? null : e2.getUrl());
                    aVar4.getClass();
                    return new it80(pwnVar);
                }
                pwnVar = null;
                aVar4.getClass();
                return new it80(pwnVar);
            case 19:
                n3o n3oVar = (n3o) obj4;
                n3oVar.f.b(new t3o.c(h03.a((Throwable) obj) ? R.string.posting_common_network_error : R.string.posting_settings_loading_error));
                n3oVar.T(new q3o.c(false));
                return s3q0.a;
            case 20:
                i0q0.f(new s1m((ftp) obj4, 6));
                return s3q0.a;
            case 21:
                ExternalFilePickerFragment externalFilePickerFragment = (ExternalFilePickerFragment) obj4;
                int i7 = ExternalFilePickerFragment.R;
                gm50.a.a(externalFilePickerFragment, ((e.a) obj).a, new h6g(externalFilePickerFragment, 15));
                return s3q0.a;
            case 22:
                ((Boolean) obj).getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = ((wir) obj4).a;
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((gzs) it2.next()).invoke();
                }
                copyOnWriteArrayList.clear();
                return s3q0.a;
            case 23:
                nup0 nup0Var = (nup0) obj;
                return ((w4s) obj4).b(new nup0(null, nup0Var.b, nup0Var.c, nup0Var.d, nup0Var.e)).getValue();
            case 24:
                ((wh50) obj4).setValue((String) obj);
                return s3q0.a;
            case 25:
                ((gks) obj4).T(new oks.c((els) obj));
                return s3q0.a;
            case 26:
                return new q990((ViewGroup) obj, ((pms) obj4).i);
            case 27:
                het hetVar = (het) obj4;
                AppsMiniappsCatalogItemDto appsMiniappsCatalogItemDto = (AppsMiniappsCatalogItemDto) obj;
                hetVar.getClass();
                dat datVar = hetVar.c;
                AppsMiniappsCatalogItemPayloadDto f2 = appsMiniappsCatalogItemDto.f();
                if (f2 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesCollectionsListDto) {
                    datVar.getClass();
                    List<AppsGamesCatalogCollectionDto> d5 = ((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesCollectionsListDto) f2).d();
                    arrayList = new ArrayList(c5g.u(d5, 10));
                    for (AppsGamesCatalogCollectionDto appsGamesCatalogCollectionDto : d5) {
                        String g4 = appsGamesCatalogCollectionDto.g();
                        if (g4 == null) {
                            g4 = "";
                        }
                        Integer m = arm0.m(10, appsGamesCatalogCollectionDto.getId());
                        int intValue2 = m != null ? m.intValue() : -1;
                        act actVar = datVar.c;
                        AppsMiniappsCatalogItemHeaderDto d6 = appsGamesCatalogCollectionDto.d();
                        ExploreWidgetsBaseGamesCatalogSectionDto f3 = appsGamesCatalogCollectionDto.f();
                        actVar.getClass();
                        wdt a = act.a(d6, f3);
                        List<AppsMiniappsCatalogGameDto> e8 = appsGamesCatalogCollectionDto.e();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<T> it3 = e8.iterator();
                        while (it3.hasNext()) {
                            sbt b = datVar.b.b((AppsMiniappsCatalogGameDto) it3.next(), g4);
                            if (b != null) {
                                arrayList3.add(b);
                            }
                        }
                        ExploreWidgetsBaseGamesCatalogSectionDto f4 = appsGamesCatalogCollectionDto.f();
                        arrayList.add(new GamesCatalogSection.d(intValue2, g4, f4 != null ? f4.f() : null, a, arrayList3));
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return arrayList;
                }
                wet wetVar = hetVar.d;
                bct bctVar = hetVar.b;
                bat batVar = hetVar.a;
                String i8 = appsMiniappsCatalogItemDto.i();
                String str6 = i8 == null ? "" : i8;
                int id = appsMiniappsCatalogItemDto.getId();
                AppsMiniappsCatalogItemPayloadDto f5 = appsMiniappsCatalogItemDto.f();
                if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppsBannersListDto) {
                    AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppsBannersListDto appsMiniappsCatalogItemPayloadAppsBannersListDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppsBannersListDto) f5;
                    batVar.getClass();
                    List<AppsFeaturedSlideDto> e9 = appsMiniappsCatalogItemPayloadAppsBannersListDto.e();
                    if (e9 == null) {
                        e9 = EmptyList.b;
                    }
                    List<AppsFeaturedSlideDto> list = e9;
                    int e10 = on00.e(c5g.u(list, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e10 >= 16 ? e10 : 16);
                    for (Object obj5 : list) {
                        linkedHashMap.put(Integer.valueOf(((AppsFeaturedSlideDto) obj5).d()), obj5);
                    }
                    List<AppsMiniappsCatalogGameDto> d7 = appsMiniappsCatalogItemPayloadAppsBannersListDto.d();
                    ArrayList arrayList4 = new ArrayList();
                    for (AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto2 : d7) {
                        AppsFeaturedSlideDto appsFeaturedSlideDto = (AppsFeaturedSlideDto) linkedHashMap.get(Integer.valueOf(appsMiniappsCatalogGameDto2.getId()));
                        WebApiApplication d8 = batVar.a.a.d(appsMiniappsCatalogGameDto2.getId());
                        if (d8 == null) {
                            sbtVar = null;
                        } else {
                            if (appsFeaturedSlideDto == null || (str = appsFeaturedSlideDto.f()) == null) {
                                str = d8.e;
                            }
                            String str7 = str;
                            if (appsFeaturedSlideDto == null || (str2 = appsFeaturedSlideDto.e()) == null) {
                                str2 = d8.f;
                            }
                            WebApiApplication a2 = WebApiApplication.a(d8, str7, str2, null, null, 0L, -25);
                            String j2 = appsMiniappsCatalogGameDto2.j();
                            String i9 = appsMiniappsCatalogGameDto2.i();
                            String f6 = appsMiniappsCatalogGameDto2.f();
                            AppsFriendsStackDto e11 = appsMiniappsCatalogGameDto2.e();
                            sbtVar = new sbt(a2, j2, i9, str6, f6, e11 != null ? z9t.a(e11) : null, null, appsMiniappsCatalogGameDto2.d(), 64);
                        }
                        if (sbtVar == null) {
                            aVar = null;
                        } else {
                            WebApiApplication webApiApplication = sbtVar.a;
                            if (appsFeaturedSlideDto == null || (str3 = appsFeaturedSlideDto.f()) == null) {
                                str3 = webApiApplication.e;
                            }
                            String str8 = str3;
                            if (appsFeaturedSlideDto == null || (str4 = appsFeaturedSlideDto.e()) == null) {
                                str4 = webApiApplication.f;
                            }
                            aVar = new GamesCatalogSection.h.a(sbtVar, ((appsFeaturedSlideDto == null || (str5 = appsFeaturedSlideDto.getDescription()) == null) && (str5 = webApiApplication.Y) == null && (str5 = webApiApplication.h) == null && (str5 = webApiApplication.l) == null) ? "" : str5, str8, str4, appsFeaturedSlideDto != null ? appsFeaturedSlideDto.g() : null);
                        }
                        if (aVar != null) {
                            arrayList4.add(aVar);
                        }
                    }
                    return new GamesCatalogSection.h(str6, arrayList4, id);
                }
                if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGameBannerDto) {
                    AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGameBannerDto appsMiniappsCatalogItemPayloadGameBannerDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGameBannerDto) f5;
                    batVar.getClass();
                    AppsGamesCatalogPromoBannerDto d9 = appsMiniappsCatalogItemPayloadGameBannerDto.d();
                    List<BaseImageDto> d10 = d9.d();
                    int i10 = bat.a.$EnumSwitchMapping$0[d9.e().d().e().ordinal()];
                    if (i10 != 1 && i10 != 2) {
                        if (i10 == 3) {
                            pair = new Pair(null, appsMiniappsCatalogItemPayloadGameBannerDto.d().e().d().getUrl());
                            sbt sbtVar2 = (sbt) pair.d();
                            String str9 = (String) pair.g();
                            List<BaseImageDto> list2 = d10;
                            ArrayList arrayList5 = new ArrayList(c5g.u(list2, 10));
                            while (r3.hasNext()) {
                            }
                            kVar = new GamesCatalogSection.c(id, str6, sbtVar2, str9, new GamesCatalogSection.c.a(d9.getTitle(), d9.getDescription(), new WebImage(arrayList5), d9.e().getTitle()));
                        }
                        return null;
                    }
                    List<AppsMiniappsCatalogGameDto> e12 = appsMiniappsCatalogItemPayloadGameBannerDto.e();
                    if (e12 != null && (appsMiniappsCatalogGameDto = (AppsMiniappsCatalogGameDto) j5g.a0(e12)) != null) {
                        pair = new Pair(batVar.a.b(appsMiniappsCatalogGameDto, str6), null);
                        sbt sbtVar22 = (sbt) pair.d();
                        String str92 = (String) pair.g();
                        List<BaseImageDto> list22 = d10;
                        ArrayList arrayList52 = new ArrayList(c5g.u(list22, 10));
                        for (BaseImageDto baseImageDto : list22) {
                            arrayList52.add(new WebImageSize(baseImageDto.getUrl(), baseImageDto.getHeight(), baseImageDto.getWidth(), (char) 0, false, baseImageDto.e(), 24, null));
                        }
                        kVar = new GamesCatalogSection.c(id, str6, sbtVar22, str92, new GamesCatalogSection.c.a(d9.getTitle(), d9.getDescription(), new WebImage(arrayList52), d9.e().getTitle()));
                    }
                    return null;
                }
                if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAchievementBannerDto) {
                    AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAchievementBannerDto appsMiniappsCatalogItemPayloadAchievementBannerDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAchievementBannerDto) f5;
                    batVar.getClass();
                    String f7 = appsMiniappsCatalogItemPayloadAchievementBannerDto.f();
                    int e13 = appsMiniappsCatalogItemPayloadAchievementBannerDto.e();
                    List<BaseImageDto> d11 = appsMiniappsCatalogItemPayloadAchievementBannerDto.d();
                    ArrayList arrayList6 = new ArrayList(c5g.u(d11, 10));
                    for (BaseImageDto baseImageDto2 : d11) {
                        arrayList6.add(new WebImageSize(baseImageDto2.getUrl(), baseImageDto2.getHeight(), baseImageDto2.getWidth(), (char) 0, false, baseImageDto2.e(), 24, null));
                    }
                    return new GamesCatalogSection.b(id, str6, new GamesCatalogSection.b.a(f7, e13, new WebImage(arrayList6)));
                }
                if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesHorizontalListDto) {
                    AppsMiniappsCatalogItemHeaderDto e14 = appsMiniappsCatalogItemDto.e();
                    ExploreWidgetsBaseGamesCatalogSectionDto g5 = appsMiniappsCatalogItemDto.g();
                    bctVar.b.getClass();
                    wdt a3 = act.a(e14, g5);
                    List<AppsMiniappsCatalogGameDto> d12 = ((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesHorizontalListDto) f5).d();
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<T> it4 = d12.iterator();
                    while (it4.hasNext()) {
                        sbt b2 = bctVar.a.b((AppsMiniappsCatalogGameDto) it4.next(), str6);
                        if (b2 != null) {
                            arrayList7.add(b2);
                        }
                    }
                    return new GamesCatalogSection.i(id, str6, a3, arrayList7);
                }
                if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesListWithFooterDto) {
                    AppsMiniappsCatalogItemHeaderDto e15 = appsMiniappsCatalogItemDto.e();
                    ExploreWidgetsBaseGamesCatalogSectionDto g6 = appsMiniappsCatalogItemDto.g();
                    bctVar.b.getClass();
                    wdt a4 = act.a(e15, g6);
                    List<AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto> d13 = ((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesListWithFooterDto) f5).d();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator<T> it5 = d13.iterator();
                    while (it5.hasNext()) {
                        sbt b3 = bctVar.a.b(((AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto) it5.next()).d(), str6);
                        if (b3 != null) {
                            arrayList8.add(b3);
                        }
                    }
                    kVar = new GamesCatalogSection.j(id, str6, g6 != null ? g6.f() : null, a4, arrayList8);
                } else {
                    if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadActivitiesListDto) {
                        AppsMiniappsCatalogItemHeaderDto e16 = appsMiniappsCatalogItemDto.e();
                        ExploreWidgetsBaseGamesCatalogSectionDto g7 = appsMiniappsCatalogItemDto.g();
                        AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadActivitiesListDto appsMiniappsCatalogItemPayloadActivitiesListDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadActivitiesListDto) f5;
                        cct cctVar = datVar.a;
                        List<AppsActivityItemDto> e17 = appsMiniappsCatalogItemPayloadActivitiesListDto.e();
                        ArrayList arrayList9 = new ArrayList();
                        for (AppsActivityItemDto appsActivityItemDto : e17) {
                            Iterator<T> it6 = appsMiniappsCatalogItemPayloadActivitiesListDto.d().iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    obj3 = it6.next();
                                    if (appsActivityItemDto.d() == ((AppsMiniappsCatalogGameDto) obj3).getId()) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto3 = (AppsMiniappsCatalogGameDto) obj3;
                            String i11 = appsMiniappsCatalogGameDto3 != null ? appsMiniappsCatalogGameDto3.i() : null;
                            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) cctVar.b.get(appsActivityItemDto.getUserId());
                            if (usersUserFullDto == null) {
                                c1078a = null;
                            } else {
                                sbt sbtVar3 = (appsActivityItemDto.j() == AppsActivityItemDto.TypeDto.STICKERS_ACHIEVEMENT || (d2 = cctVar.d((long) appsActivityItemDto.d())) == null) ? null : new sbt(d2, null, i11, str6, null, null, null, null, 242);
                                GamesCatalogUser a5 = eat.a(usersUserFullDto);
                                GamesCatalogActivityType a6 = dat.a(appsActivityItemDto.j());
                                int e18 = appsActivityItemDto.e();
                                Integer k = appsActivityItemDto.k();
                                Integer g8 = appsActivityItemDto.g();
                                String i12 = appsActivityItemDto.i();
                                List<BaseImageDto> f8 = appsActivityItemDto.f();
                                c1078a = new GamesCatalogSection.a.C1078a(sbtVar3, a5, a6, e18, k, g8, i12, f8 != null ? dat.b(f8) : null);
                            }
                            if (c1078a != null) {
                                arrayList9.add(c1078a);
                            }
                        }
                        datVar.c.getClass();
                        return new GamesCatalogSection.a(id, str6, act.a(e16, g7), arrayList9);
                    }
                    if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadNotificationsListDto) {
                        AppsMiniappsCatalogItemHeaderDto e19 = appsMiniappsCatalogItemDto.e();
                        ExploreWidgetsBaseGamesCatalogSectionDto g9 = appsMiniappsCatalogItemDto.g();
                        AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadNotificationsListDto appsMiniappsCatalogItemPayloadNotificationsListDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadNotificationsListDto) f5;
                        datVar.getClass();
                        List<AppsRequestItemDto> e20 = appsMiniappsCatalogItemPayloadNotificationsListDto.e();
                        ArrayList arrayList10 = new ArrayList();
                        for (AppsRequestItemDto appsRequestItemDto : e20) {
                            Iterator<T> it7 = appsMiniappsCatalogItemPayloadNotificationsListDto.d().iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    obj2 = it7.next();
                                    if (appsRequestItemDto.d() == ((AppsMiniappsCatalogGameDto) obj2).getId()) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto4 = (AppsMiniappsCatalogGameDto) obj2;
                            String i13 = appsMiniappsCatalogGameDto4 != null ? appsMiniappsCatalogGameDto4.i() : null;
                            WebApiApplication d14 = datVar.a.d(appsRequestItemDto.d());
                            GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo b4 = d14 != null ? eat.b(appsRequestItemDto, new sbt(d14, null, i13, str6, null, null, null, null, 242), new dhh(datVar, r13)) : null;
                            if (b4 != null) {
                                arrayList10.add(b4);
                            }
                        }
                        datVar.c.getClass();
                        return new GamesCatalogSection.GamesNotificationSection(id, str6, act.a(e19, g9), arrayList10);
                    }
                    if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesListWithActionDto) {
                        return hetVar.e.a(appsMiniappsCatalogItemDto.e(), appsMiniappsCatalogItemDto.g(), (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesListWithActionDto) f5, str6, id);
                    }
                    if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesVerticalListDto) {
                        AppsMiniappsCatalogItemHeaderDto e21 = appsMiniappsCatalogItemDto.e();
                        ExploreWidgetsBaseGamesCatalogSectionDto g10 = appsMiniappsCatalogItemDto.g();
                        wetVar.getClass();
                        List<AppsMiniappsCatalogGameDto> d15 = ((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesVerticalListDto) f5).d();
                        ArrayList arrayList11 = new ArrayList();
                        Iterator<T> it8 = d15.iterator();
                        while (it8.hasNext()) {
                            sbt b5 = wetVar.b.b((AppsMiniappsCatalogGameDto) it8.next(), str6);
                            if (b5 != null) {
                                arrayList11.add(b5);
                            }
                        }
                        wetVar.a.getClass();
                        kVar = new GamesCatalogSection.l(id, str6, g10 != null ? g10.f() : null, act.a(e21, g10), arrayList11);
                    } else if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto) {
                        AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto appsMiniappsCatalogItemPayloadGamesAchievementsBlockDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesAchievementsBlockDto) f5;
                        if (!uca.a()) {
                            return GamesCatalogSection.m.a;
                        }
                        l8t l8tVar = hetVar.f;
                        AppsMiniappsCatalogItemHeaderDto e22 = appsMiniappsCatalogItemDto.e();
                        ExploreWidgetsBaseGamesCatalogSectionDto g11 = appsMiniappsCatalogItemDto.g();
                        l8tVar.getClass();
                        List<AppsMiniappsCatalogGameDto> e23 = appsMiniappsCatalogItemPayloadGamesAchievementsBlockDto.e();
                        if (e23 != null) {
                            ArrayList arrayList12 = new ArrayList();
                            Iterator<T> it9 = e23.iterator();
                            while (it9.hasNext()) {
                                sbt b6 = l8tVar.a.b((AppsMiniappsCatalogGameDto) it9.next(), str6);
                                if (b6 != null) {
                                    arrayList12.add(b6);
                                }
                            }
                            arrayList2 = arrayList12;
                        } else {
                            arrayList2 = null;
                        }
                        AppsMiniappsAchievementInfoDto d16 = appsMiniappsCatalogItemPayloadGamesAchievementsBlockDto.d();
                        l8tVar.b.getClass();
                        wdt a7 = act.a(e22, g11);
                        String f9 = g11 != null ? g11.f() : null;
                        GamesHeaderSectionInfo gamesHeaderSectionInfo = a7 != null ? a7.a : null;
                        String title2 = d16.getTitle();
                        String k2 = d16.k();
                        Integer i14 = d16.i();
                        AppsMiniappsAchievementInfoDto.AchievementTypeDto d17 = d16.d();
                        int i15 = d17 == null ? -1 : l8t.a.$EnumSwitchMapping$0[d17.ordinal()];
                        if (i15 == 1) {
                            gamesAchievementType = GamesAchievementType.TIMESPENT;
                        } else if (i15 != 2) {
                            gamesAchievementType2 = null;
                            AppsMiniappsAchievementInfoDto.StateDto j3 = d16.j();
                            i = j3 != null ? -1 : l8t.a.$EnumSwitchMapping$1[j3.ordinal()];
                            if (i != 1) {
                                gamesAchievementState = GamesAchievementState.IN_PROGRESS;
                            } else if (i == 2) {
                                gamesAchievementState = GamesAchievementState.READY_TO_OPEN;
                            } else if (i != 3) {
                                gamesAchievementState2 = null;
                                g = d16.g();
                                if (g != null) {
                                    String e24 = g.e();
                                    AppsAchievementBlockLabelDto.ColorDto d18 = g.d();
                                    int i16 = d18 == null ? -1 : l8t.a.$EnumSwitchMapping$2[d18.ordinal()];
                                    o8tVar = new o8t(e24, i16 != 1 ? i16 != 2 ? i16 != 3 ? GamesAchievementLabelColor.ACCENT : GamesAchievementLabelColor.RED : GamesAchievementLabelColor.YELLOW : GamesAchievementLabelColor.GREEN);
                                } else {
                                    o8tVar = null;
                                }
                                List<BaseImageDto> f10 = d16.f();
                                List singletonList = f10 != null ? Collections.singletonList(l8t.a(f10)) : EmptyList.b;
                                e6 = d16.e();
                                if (e6 != null) {
                                    String e25 = e6.e();
                                    String f11 = e6.f();
                                    AppsCatalogBaseActionDto d19 = e6.d();
                                    if (d19 == null) {
                                        catVar = null;
                                    } else {
                                        int i17 = l8t.a.$EnumSwitchMapping$3[d19.e().ordinal()];
                                        if (i17 == 1) {
                                            gamesCatalogActionType = GamesCatalogActionType.OPEN_URL;
                                        } else if (i17 == 2) {
                                            gamesCatalogActionType = GamesCatalogActionType.OPEN_MINI_APP;
                                        } else if (i17 == 3) {
                                            gamesCatalogActionType = GamesCatalogActionType.OPEN_GAME;
                                        } else {
                                            if (i17 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            gamesCatalogActionType = GamesCatalogActionType.OPEN_ACHIEVEMENT_MODAL;
                                        }
                                        AppsCatalogBaseAppLaunchParamsDto d20 = d19.d();
                                        catVar = new cat(gamesCatalogActionType, d20 != null ? new y9t(d20.d(), d20.e()) : null, d19.getUrl());
                                    }
                                    n8tVar = new n8t(e25, f11, catVar);
                                } else {
                                    n8tVar = null;
                                }
                                l = d16.l();
                                if (l != null) {
                                    String title3 = l.getTitle();
                                    List<AppsWhatInsideModalInfoGiftsDto> e26 = l.e();
                                    ArrayList arrayList13 = new ArrayList(c5g.u(e26, 10));
                                    for (AppsWhatInsideModalInfoGiftsDto appsWhatInsideModalInfoGiftsDto : e26) {
                                        List<BaseImageDto> d21 = appsWhatInsideModalInfoGiftsDto.d();
                                        ArrayList arrayList14 = new ArrayList();
                                        for (Object obj6 : d21) {
                                            if (((BaseImageDto) obj6).d() != BaseImageDto.ThemeDto.DARK) {
                                                arrayList14.add(obj6);
                                            }
                                        }
                                        List<BaseImageDto> d22 = appsWhatInsideModalInfoGiftsDto.d();
                                        ArrayList arrayList15 = new ArrayList();
                                        for (Object obj7 : d22) {
                                            if (((BaseImageDto) obj7).d() == BaseImageDto.ThemeDto.DARK) {
                                                arrayList15.add(obj7);
                                            }
                                        }
                                        WebImage a8 = !arrayList14.isEmpty() ? l8t.a(arrayList14) : null;
                                        WebImage a9 = !arrayList15.isEmpty() ? l8t.a(arrayList15) : null;
                                        String e27 = appsWhatInsideModalInfoGiftsDto.e();
                                        AppsWhatInsideModalInfoGiftsDto.TypeDto f12 = appsWhatInsideModalInfoGiftsDto.f();
                                        int i18 = f12 == null ? -1 : l8t.a.$EnumSwitchMapping$4[f12.ordinal()];
                                        arrayList13.add(new mgt(e27, i18 != 1 ? i18 != 2 ? null : GamesWhatInsideModalInfoGiftType.WISH : GamesWhatInsideModalInfoGiftType.VOTES_COUPON, new wpo0(a8, a9)));
                                    }
                                    lgtVar = new lgt(title3, arrayList13, l.d(), l.i(), l.g(), l.f());
                                } else {
                                    lgtVar = null;
                                }
                                kVar = new GamesCatalogSection.f(id, str6, f9, gamesHeaderSectionInfo, new GamesCatalogSection.f.a(title2, k2, i14, gamesAchievementType2, gamesAchievementState2, o8tVar, singletonList, n8tVar, lgtVar), arrayList2);
                            } else {
                                gamesAchievementState = GamesAchievementState.OPEN;
                            }
                            gamesAchievementState2 = gamesAchievementState;
                            g = d16.g();
                            if (g != null) {
                            }
                            List<BaseImageDto> f102 = d16.f();
                            List singletonList2 = f102 != null ? Collections.singletonList(l8t.a(f102)) : EmptyList.b;
                            e6 = d16.e();
                            if (e6 != null) {
                            }
                            l = d16.l();
                            if (l != null) {
                            }
                            kVar = new GamesCatalogSection.f(id, str6, f9, gamesHeaderSectionInfo, new GamesCatalogSection.f.a(title2, k2, i14, gamesAchievementType2, gamesAchievementState2, o8tVar, singletonList2, n8tVar, lgtVar), arrayList2);
                        } else {
                            gamesAchievementType = GamesAchievementType.VOTES;
                        }
                        gamesAchievementType2 = gamesAchievementType;
                        AppsMiniappsAchievementInfoDto.StateDto j32 = d16.j();
                        if (j32 != null) {
                        }
                        if (i != 1) {
                        }
                        gamesAchievementState2 = gamesAchievementState;
                        g = d16.g();
                        if (g != null) {
                        }
                        List<BaseImageDto> f1022 = d16.f();
                        List singletonList22 = f1022 != null ? Collections.singletonList(l8t.a(f1022)) : EmptyList.b;
                        e6 = d16.e();
                        if (e6 != null) {
                        }
                        l = d16.l();
                        if (l != null) {
                        }
                        kVar = new GamesCatalogSection.f(id, str6, f9, gamesHeaderSectionInfo, new GamesCatalogSection.f.a(title2, k2, i14, gamesAchievementType2, gamesAchievementState2, o8tVar, singletonList22, n8tVar, lgtVar), arrayList2);
                    } else if (f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto) {
                        AppsMiniappsCatalogItemHeaderDto e28 = appsMiniappsCatalogItemDto.e();
                        ExploreWidgetsBaseGamesCatalogSectionDto g12 = appsMiniappsCatalogItemDto.g();
                        bctVar.b.getClass();
                        wdt a10 = act.a(e28, g12);
                        List<AppsMiniappsCatalogGameDto> d23 = ((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesBigHorizontalListDto) f5).d();
                        ArrayList arrayList16 = new ArrayList();
                        Iterator<T> it10 = d23.iterator();
                        while (it10.hasNext()) {
                            sbt b7 = bctVar.a.b((AppsMiniappsCatalogGameDto) it10.next(), str6);
                            if (b7 != null) {
                                arrayList16.add(b7);
                            }
                        }
                        kVar = new GamesCatalogSection.g(id, str6, g12 != null ? g12.f() : null, a10, arrayList16);
                    } else {
                        if (!(f5 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesHalfCardsDto)) {
                            return GamesCatalogSection.m.a;
                        }
                        AppsMiniappsCatalogItemHeaderDto e29 = appsMiniappsCatalogItemDto.e();
                        ExploreWidgetsBaseGamesCatalogSectionDto g13 = appsMiniappsCatalogItemDto.g();
                        wetVar.getClass();
                        List<AppsMiniappsCatalogGameDto> d24 = ((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesHalfCardsDto) f5).d();
                        ArrayList arrayList17 = new ArrayList();
                        Iterator<T> it11 = d24.iterator();
                        while (it11.hasNext()) {
                            sbt b8 = wetVar.b.b((AppsMiniappsCatalogGameDto) it11.next(), str6);
                            if (b8 != null) {
                                arrayList17.add(b8);
                            }
                        }
                        wetVar.a.getClass();
                        kVar = new GamesCatalogSection.k(id, str6, g13 != null ? g13.f() : null, act.a(e29, g13), arrayList17);
                    }
                }
                return kVar;
            case 28:
                int i19 = GroupProfileView.K;
                ((GroupProfileView) obj4).getClass();
                return s3q0.a;
            default:
                long a11 = qni0.a();
                hn70 hn70Var = ((com.vk.update.core.a) obj4).l;
                qcy<Object> qcyVar = com.vk.update.core.a.m[0];
                hn70Var.b(a11);
                return s3q0.a;
        }
    }
}
