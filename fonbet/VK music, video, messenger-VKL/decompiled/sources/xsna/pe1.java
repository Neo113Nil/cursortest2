package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetAnonUserInfoResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetStaticsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoStaticSectionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoStaticSectionItemsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.UserProfile;
import com.vk.dzenarticle.impl.ui.view.ad.MiddleAdView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.kr5;
import xsna.sza;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pe1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pe1(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        ?? r1;
        List<ShortVideoStaticSectionItemsDto> d;
        Object obj3;
        String string;
        String str;
        ge7 ge7Var;
        ProfileDescription profileDescription;
        ProfileDescription profileDescription2;
        ArrayList arrayList = null;
        r3 = null;
        r3 = null;
        List<BaseImageDto> list = null;
        int i = 1;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "AlbumChooseTags.ALBUMS_EMPTY_BUTTON_CREATE");
                return s3q0.a;
            case 1:
                List<BaseImageDto> d2 = ((ShortVideoGetAnonUserInfoResponseDto) obj).d();
                if (d2 != null) {
                    List<BaseImageDto> list2 = d2;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    for (BaseImageDto baseImageDto : list2) {
                        arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                    }
                }
                return new Image(arrayList);
            case 2:
                km3 km3Var = (km3) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(km3Var.a);
                sb.append(km3Var.b);
                return sb.toString();
            case 3:
                Iterator it = ((ShortVideoGetStaticsResponseDto) obj).d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (epx.f(((ShortVideoStaticSectionDto) obj2).e(), "clipsAppOnboarding")) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ShortVideoStaticSectionDto shortVideoStaticSectionDto = (ShortVideoStaticSectionDto) obj2;
                if (shortVideoStaticSectionDto != null && (d = shortVideoStaticSectionDto.d()) != null) {
                    Iterator it2 = d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (epx.f(((ShortVideoStaticSectionItemsDto) obj3).d(), "dialog_start_interests")) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    ShortVideoStaticSectionItemsDto shortVideoStaticSectionItemsDto = (ShortVideoStaticSectionItemsDto) obj3;
                    if (shortVideoStaticSectionItemsDto != null) {
                        list = shortVideoStaticSectionItemsDto.e();
                    }
                }
                if (list != null) {
                    List<BaseImageDto> list3 = list;
                    r1 = new ArrayList(c5g.u(list3, 10));
                    for (BaseImageDto baseImageDto2 : list3) {
                        r1.add(new ImageSize(baseImageDto2.getUrl(), baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.e(), (char) 0, false, 48, null));
                    }
                } else {
                    r1 = EmptyList.b;
                }
                return new Image((List<ImageSize>) r1);
            case 4:
                qgi0.r((tgi0) obj, "BackBtn");
                return s3q0.a;
            case 5:
                ke7 ke7Var = (ke7) obj;
                List<UserId> list4 = ke7Var.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                for (UserId userId : list4) {
                    if (fkq0.b(userId)) {
                        Group group = ke7Var.f.get(userId);
                        if (group != null) {
                            UserId e = fkq0.e(group.c);
                            kr5.a aVar = new kr5.a(new os9(group, i));
                            aVar.b(R.drawable.user_placeholder);
                            s3q0 s3q0Var = s3q0.a;
                            kr5 a = aVar.a();
                            String str2 = group.d;
                            String str3 = group.z;
                            boolean z = str3 == null || str3.length() == 0;
                            VerifyInfo verifyInfo = group.y;
                            ge7Var = new ge7(e, a, str2, str3, !z, verifyInfo, verifyInfo.Cb());
                            arrayList2.add(ge7Var);
                        }
                        ge7Var = null;
                        arrayList2.add(ge7Var);
                    } else {
                        UserProfile userProfile = ke7Var.e.get(userId);
                        if (userProfile != null) {
                            Bundle bundle = userProfile.s;
                            List<ProfileDescription> list5 = userProfile.E;
                            String str4 = (list5 == null || (profileDescription2 = list5.get(0)) == null) ? null : profileDescription2.e;
                            if (str4 == null || drm0.N(str4)) {
                                String str5 = userProfile.r;
                                if (str5 == null || drm0.N(str5)) {
                                    if (bundle.containsKey("group_activity")) {
                                        string = bundle.getString("group_activity");
                                    }
                                    str = null;
                                } else {
                                    string = userProfile.r;
                                }
                                str = string;
                            } else {
                                List<ProfileDescription> list6 = userProfile.E;
                                if (list6 != null && (profileDescription = list6.get(0)) != null) {
                                    string = profileDescription.e;
                                    str = string;
                                }
                                str = null;
                            }
                            UserId userId2 = userProfile.c;
                            kr5.a aVar2 = new kr5.a(new dqz0(userProfile));
                            aVar2.b(R.drawable.user_placeholder);
                            s3q0 s3q0Var2 = s3q0.a;
                            kr5 a2 = aVar2.a();
                            String str6 = userProfile.e;
                            boolean z2 = str == null || str.length() == 0;
                            VerifyInfo verifyInfo2 = userProfile.B;
                            ge7Var = new ge7(userId2, a2, str6, str, !z2, verifyInfo2, verifyInfo2.Cb());
                            arrayList2.add(ge7Var);
                        }
                        ge7Var = null;
                        arrayList2.add(ge7Var);
                    }
                }
                return j5g.V(arrayList2);
            case 6:
                return new kw7(((tj50.a) obj).a(new md(8), ao8.d));
            case 7:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "delivery_points_search_button");
                return s3q0.a;
            case 9:
                return new sza.d.b(((Integer) obj).intValue());
            case 10:
                return new s930();
            case 11:
                return new q6x();
            case 12:
                return Boolean.valueOf(((TemplatesFlowScreen) obj) != TemplatesFlowScreen.UNDEFINED);
            case 13:
                return io.reactivex.rxjava3.core.q.q(((io.reactivex.rxjava3.core.q) obj).A(6000L, TimeUnit.MILLISECONDS).t0(15L), io.reactivex.rxjava3.core.q.H(new IllegalStateException("run out of attempts")));
            case 14:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(0, 1, 1), new k9x(0, 100, 1))));
            case 15:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((vzh) obj).l);
            case 19:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_attaches_open_dialog);
            case 20:
                Throwable th2 = ((jen) obj).g;
                j03.a.getClass();
                return Boolean.valueOf(j03.a(17101, th2));
            case 21:
                qgi0.r((tgi0) obj, "donut_new_banner_settings_button");
                return s3q0.a;
            case 22:
                qgi0.r((tgi0) obj, "PrivacySettingsForDonutLevelsToolbarCloseButton");
                return s3q0.a;
            case 23:
                MiddleAdView middleAdView = new MiddleAdView((Context) obj, null, 0, 14, 0);
                middleAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return middleAdView;
            case 24:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 25:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    Iterator it3 = Sb.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (e43.l(CatalogDataType.DATA_TYPE_CATALOG_USERS, CatalogDataType.DATA_TYPE_SEARCH_ENTITY_ITEMS).contains(((UIBlock) it3.next()).Cb())) {
                                r4 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(r4);
            case 26:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 27:
                List<UsersUserFullDto> list7 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list7, 10));
                for (UsersUserFullDto usersUserFullDto : list7) {
                    arrayList3.add(new ba7(usersUserFullDto.s1(), usersUserFullDto.r2(), rq.a(usersUserFullDto, new StringBuilder(), ' ')));
                }
                return arrayList3;
            case 28:
                cdu cduVar = (cdu) obj;
                return Boolean.valueOf(!cduVar.c.get(cduVar.b).a.isEmpty());
            default:
                return null;
        }
    }

    public /* synthetic */ pe1(com.vk.feed.blacklist.impl.presentation.blacklist.e eVar) {
        this.b = 5;
    }
}
