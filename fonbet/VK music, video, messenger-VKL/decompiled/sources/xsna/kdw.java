package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.market.dto.MarketGetByIdResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.censoredsettings.presentation.obscenetext.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;
import com.vkontakte.android.sdk.SDKInviteDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import xsna.ij20;
import xsna.jbb0;
import xsna.rnq0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kdw implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ kdw(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object[] objArr;
        UserProfile userProfile = null;
        switch (this.b) {
            case 0:
                int i = ImStickerView.p;
                return s3q0.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                ((Integer) obj).getClass();
                mry mryVar = gsy.a;
                return -1;
            case 3:
                qgi0.r((tgi0) obj, "geo_picker_item_title");
                return s3q0.a;
            case 4:
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof t480) {
                    Collection<adm> collection = ((t480) sxpVar).b;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        Iterator<T> it = collection.iterator();
                        while (it.hasNext()) {
                            if (((adm) it.next()).a == DialogsCounters.Type.REQUESTS) {
                                objArr = true;
                                return Boolean.valueOf(((sxpVar instanceof v480) && ((v480) sxpVar).c == DialogsFilter.REQUESTS) || objArr == true);
                            }
                        }
                    }
                }
                objArr = false;
                if (sxpVar instanceof v480) {
                    return Boolean.valueOf(((sxpVar instanceof v480) && ((v480) sxpVar).c == DialogsFilter.REQUESTS) || objArr == true);
                }
                return Boolean.valueOf(((sxpVar instanceof v480) && ((v480) sxpVar).c == DialogsFilter.REQUESTS) || objArr == true);
            case 5:
                return (ij20.a) obj;
            case 6:
                return Boolean.valueOf(((View) obj) instanceof WebView);
            case 7:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 8:
                ArrayList arrayList = new ArrayList();
                inn0 inn0Var = new inn0(((e.a) obj).b, R.id.censored_settings_obscene_filter_switch);
                inn0Var.a.bottom = cn70.b(8);
                inn0Var.b = true;
                arrayList.add(inn0Var);
                xr9 xr9Var = new xr9(R.id.censored_settings_obscene_filter_caption);
                int b = cn70.b(4);
                Rect rect = xr9Var.a;
                rect.top = b;
                rect.bottom = cn70.b(4);
                arrayList.add(xr9Var);
                hq70 hq70Var = new hq70(R.id.censored_settings_obscene_filter_preview);
                int b2 = cn70.b(16);
                Rect rect2 = hq70Var.a;
                rect2.left = b2;
                rect2.right = cn70.b(16);
                arrayList.add(hq70Var);
                return arrayList;
            case 9:
                return (xh80) obj;
            case 10:
                AccountGetUserObjectDto accountGetUserObjectDto = (AccountGetUserObjectDto) j5g.a0((List) obj);
                if (accountGetUserObjectDto != null) {
                    userProfile = new UserProfile();
                    Long i2 = accountGetUserObjectDto.i();
                    userProfile.c = new UserId(i2 != null ? i2.longValue() : -1L);
                    userProfile.d = accountGetUserObjectDto.f();
                    userProfile.f = accountGetUserObjectDto.j();
                    userProfile.e = userProfile.d + ' ' + userProfile.f;
                    userProfile.g = accountGetUserObjectDto.k();
                }
                return userProfile;
            case 11:
                mvi mviVar = (mvi) obj;
                int i3 = ua2.a;
                Context context = (Context) mviVar.y0(AndroidCompositionLocals_androidKt.b);
                azl azlVar = (azl) mviVar.y0(uvi.h);
                b490 b490Var = (b490) mviVar.y0(c490.a);
                if (b490Var == null) {
                    return null;
                }
                return new e82(context, azlVar, b490Var.a, b490Var.b);
            case 12:
                return new yo90((ViewGroup) obj);
            case 13:
                qgi0.r((tgi0) obj, "toolbar_back_button");
                return s3q0.a;
            case 14:
                tj50.a aVar = (tj50.a) obj;
                cd10 cd10Var = new cd10(9);
                ao8 ao8Var = ao8.d;
                return new jbb0.a.C3112a(aVar.a(cd10Var, ao8Var), aVar.a(fbb0.b, ao8Var), aVar.a(new e420(10), ao8Var));
            case 15:
                u0a u0aVar = (u0a) obj;
                if ((u0aVar instanceof y280) && ((y280) u0aVar).a.z.contains("local_block_id")) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 16:
                return rli0.A(rli0.t(rli0.j(rli0.k(new i5g(((wpp) obj).c.values()), MsgFromUser.class), new ev60(6)), new amp(22)));
            case 17:
                return ((kfd0) obj).b;
            case 18:
                return s3q0.a;
            case 19:
                int i4 = SDKInviteDialog.X;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 20:
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) obj;
                Iterator<T> it2 = getStoriesResponse.c.iterator();
                while (it2.hasNext()) {
                    ((StoriesContainer) it2.next()).l = true;
                }
                return new GetStoriesResponse(getStoriesResponse.b, getStoriesResponse.d, getStoriesResponse.c, getStoriesResponse.f, getStoriesResponse.e, getStoriesResponse.g);
            case 21:
                Intent intent = (Intent) obj;
                intent.putExtra("selection_limit", 1);
                intent.putExtra("single_mode", true);
                intent.putExtra("inner_camera_enabled", true);
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((BaseBoolIntDto) obj).i() == BaseBoolIntDto.YES.i());
            case 24:
                return b210.e(((MarketGetByIdResponseDto) obj).d());
            case 25:
                ((ikv0) obj).a();
                return s3q0.a;
            case 26:
                Object d = ((Result) obj).d();
                if (d instanceof Result.Failure) {
                    Throwable a = Result.a(d);
                    return a != null ? new Result(new Result.Failure(a)) : new Result(new Result.Failure(new IllegalStateException()));
                }
                ExtendedProfilesRepository.b bVar = (ExtendedProfilesRepository.b) d;
                return new Result(new rnq0.a(bVar.a, bVar.b, bVar.c, bVar.d));
            case 27:
                Throwable th = (Throwable) obj;
                w1s0 w1s0Var = w1s0.b;
                Context context2 = e43.a;
                Context context3 = context2 != null ? context2 : null;
                if (th != null) {
                    j03.j(context3, th);
                }
                return s3q0.a;
            case 28:
                return ((UIBlockVideo) obj).A().r1();
            default:
                qgi0.r((tgi0) obj, "ad_banner_left_icon");
                return s3q0.a;
        }
    }

    public /* synthetic */ kdw(Object obj, int i) {
        this.b = i;
    }
}
