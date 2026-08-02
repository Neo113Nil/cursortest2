package xsna;

import android.content.Context;
import android.database.Cursor;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.avatarchange.AvatarChangeCropFragment;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsSheetState;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.f5h0;
import xsna.tlo0;
import xsna.z2d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ot implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ot(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "addingClipGroupSubtitle");
                return s3q0.a;
            case 1:
                List list = (List) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", list.size() + " actions to be synced."});
                }
                return list;
            case 2:
                return ((af1) obj).itemView;
            case 3:
                AnimatedCounterView animatedCounterView = (AnimatedCounterView) obj;
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                animatedCounterView.requestLayout();
                animatedCounterView.invalidate();
                return s3q0.a;
            case 4:
                L.g("AttachmentEditorViewer", (Throwable) obj);
                cvk.u(R.string.vk_photo_download_error, false);
                return s3q0.a;
            case 5:
                return ((PageLoadingState) obj).Bb();
            case 6:
                int i = AvatarChangeCropFragment.a0;
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                List list2 = (List) obj;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.i, new Object[]{"[Blockstore] get ETs from blockstore, size = " + list2.size()});
                }
                return s3q0.a;
            case 8:
                return ((BookingCalendarScreenState) obj).d;
            case 9:
                sxp sxpVar = (sxp) obj;
                if (!(sxpVar instanceof p680) && !(sxpVar instanceof OnCacheInvalidateEvent)) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 11:
                L.i((Throwable) obj);
                return s3q0.a;
            case 12:
                return ((z2d.a) obj).b.g;
            case 13:
                return (ClipsDraftVk) ClipsDraftVk.d.a(new JSONObject(((Cursor) obj).getString(0)));
            case 14:
                return new v6s(R.layout.clips_favorites_footer_loading, (ViewGroup) obj);
            case 15:
                List b = nog.b((UIBlockList) obj);
                return Boolean.valueOf(b != null && (b.isEmpty() ^ true));
            case 16:
                ojt ojtVar = (ojt) obj;
                ojtVar.l = f5h0.o.a;
                ojtVar.m = new PointF(1.0f, 0.5f);
                return s3q0.a;
            case 17:
                qgi0.r((tgi0) obj, "COMMUNITY_DESCRIPTION_INFO_ITEM");
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((DeliveryPointsSheetState) obj) != DeliveryPointsSheetState.Hidden);
            case 19:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_leave_channel);
            case 20:
                return arm0.m(10, (String) obj);
            case 21:
                return DzenArticleState.a((DzenArticleState) obj, null, null, DzenArticleState.LoadingState.LOADING_INITIAL, null, null, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            case 22:
                int i2 = FastScroller.v;
                return ((ViewPropertyAnimator) obj).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L);
            case 23:
                Context context = (Context) obj;
                qmu0 qmu0Var = new qmu0(context);
                qmu0Var.b(new omu0(oq.d(tlo0.Companion, "Очень длинный текст, чтобы не помещался в одну строку")));
                qmu0Var.c(new pmu0(new tlo0.h("100 ₽/мес"), new xu0(15), R.attr.vk_ui_background_content_inverse, R.attr.vk_ui_text_contrast_themed, false));
                qmu0Var.setBackgroundColor(e3m.f(R.attr.vk_ui_background_secondary, context));
                return qmu0Var;
            case 24:
                return ((dcr) obj).a();
            case 25:
                return ((hbt) obj).h;
            case 26:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 27:
                qcy<Object>[] qcyVarArr2 = GeoPostsFragment.q0;
                qgi0.r((tgi0) obj, "toolbar_back_tag");
                return s3q0.a;
            case 28:
                return Boolean.valueOf(!((Map) obj).isEmpty());
            default:
                int intValue = ((Integer) obj).intValue();
                String[] strArr = new String[intValue];
                for (int i3 = 0; i3 < intValue; i3++) {
                    strArr[i3] = null;
                }
                return strArr;
        }
    }

    public /* synthetic */ ot(nog nogVar) {
        this.b = 15;
    }
}
