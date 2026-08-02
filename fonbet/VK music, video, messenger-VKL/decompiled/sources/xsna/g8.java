package xsna;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetRecommendedGroupsResponseDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.e;
import com.vk.core.utils.newtork.d;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Thumb;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.gte;
import xsna.pqc;
import xsna.zze;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g8 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ g8(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        List list = null;
        switch (this.b) {
            case 0:
                vrf0 vrf0Var = (vrf0) j5g.a0(((isf0) obj).a);
                if (vrf0Var != null) {
                    int i = vrf0Var.a;
                    UserId userId = vrf0Var.b;
                    String str2 = vrf0Var.c;
                    String str3 = vrf0Var.d;
                    String str4 = vrf0Var.e;
                    Thumb thumb = vrf0Var.f;
                    if (thumb == null) {
                        thumb = lso0.a;
                    }
                    list = e43.l(AboutVideoItem.u.b, new AboutVideoItem.s(i, userId, str2, str3, str4, thumb, vrf0Var.g, vrf0Var.h, vrf0Var.i, vrf0Var.j, false));
                }
                return list == null ? EmptyList.b : list;
            case 1:
                Pair pair = (Pair) obj;
                b70 b70Var = (b70) pair.d();
                com.vk.core.utils.newtork.d dVar = (com.vk.core.utils.newtork.d) pair.g();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType = L.LogType.i;
                    StringBuilder sb = new StringBuilder("Notified about new action ");
                    sb.append(b70Var);
                    sb.append(" while network is ");
                    L.u(l, logType, new Object[]{"Offline:ActionSynchronizerInteractorImpl", ho8.a(sb, dVar instanceof d.a ? "available" : "lost", JwtParser.SEPARATOR_CHAR)});
                }
                return Boolean.valueOf(dVar instanceof d.a);
            case 2:
                qgi0.r((tgi0) obj, "trackTitle");
                return s3q0.a;
            case 3:
                return e.a.a;
            case 4:
                return ((pr2) obj).a;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                return j5g.S0(c5g.v((List) obj));
            case 7:
                HistoryAttach historyAttach = (HistoryAttach) obj;
                return Boolean.valueOf((historyAttach.g == null || (str = historyAttach.h) == null || str.length() == 0) ? false : true);
            case 8:
                pqc.a.getClass();
                ((vga) pqc.k.getValue()).b(((pqc.a.c) obj).a);
                return s3q0.a;
            case 9:
                return new JSONObject(((Cursor) obj).getString(0));
            case 10:
                return s3q0.a;
            case 11:
                gte.a aVar = (gte.a) obj;
                tho0 tho0Var = aVar.b;
                return Boolean.valueOf(tho0Var.a.c.length() > 0 && !drm0.N(tho0Var.a.c) && hte.a(aVar.d) == null);
            case 12:
                return new qow(((zze.a) obj).h);
            case 13:
                int i2 = CommunityAddressesFragment.E0;
                return mcr0.j(Uri.parse(((Group) obj).e), ImageScreenSize.SIZE_28DP);
            case 14:
                String url = ((MarketGetEditUrlResponseDto) obj).getUrl();
                return url == null ? "" : url;
            case 15:
                qgi0.r((tgi0) obj, "community_top_bar_subscribe_icon");
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                return ((qtd0) obj).h8();
            case 18:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_user_profile, (Context) obj);
            case 19:
                return air.b('\'', "'", (String) obj);
            case 20:
                return DzenArticleState.a((DzenArticleState) obj, null, null, DzenArticleState.LoadingState.LOADING_INITIAL, null, null, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            case 21:
                qgi0.r((tgi0) obj, "clip_edit_cancel");
                return s3q0.a;
            case 22:
                tro0 tro0Var = new tro0(new x5i((Runnable) obj, 14));
                tro0Var.setDaemon(true);
                tro0Var.setName("service-watchdog");
                tro0Var.start();
                return s3q0.a;
            case 23:
                return s3q0.a;
            case 24:
                Context context = (Context) obj;
                tyu0 tyu0Var = new tyu0(context, null, 0);
                tyu0Var.setOrientation(0);
                tyu0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                tyu0Var.addView(t8s.x(context));
                tyu0Var.addView(t8s.x(context));
                return tyu0Var;
            case 25:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 26:
                GroupsGetRecommendedGroupsResponseDto groupsGetRecommendedGroupsResponseDto = (GroupsGetRecommendedGroupsResponseDto) obj;
                String title = groupsGetRecommendedGroupsResponseDto.getTitle();
                String e = groupsGetRecommendedGroupsResponseDto.e();
                List<GroupsSuggestionDto> d = groupsGetRecommendedGroupsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(hru.a((GroupsSuggestionDto) it.next()));
                }
                return new GroupsSuggestions("recommended_groups", title, e, p4g.q(arrayList), null, null);
            case 27:
                return s3q0.a;
            case 28:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.a);
            default:
                VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView((Context) obj, null, 6, 0);
                vkEnhancedImageView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                a1w a1wVar = q1w.a;
                String str5 = (a1wVar != null ? a1wVar : null).r().h.b().b;
                sa30.L(vkEnhancedImageView, str5);
                vkEnhancedImageView.getBackend().C(str5);
                return vkEnhancedImageView;
        }
    }

    public /* synthetic */ g8(hte hteVar) {
        this.b = 11;
    }
}
