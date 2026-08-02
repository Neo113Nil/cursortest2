package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.market.dto.MarketUpdateItemReviewResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.fave.entities.FaveType;
import com.vk.fave.fragments.FavesFragment;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.common.views.fave.FaveAllEmptyState;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import xsna.asl0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ol implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ol(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((AccessibilityEvents.a) obj).b;
            case 1:
                return Boolean.valueOf(((ActionButton) obj).f == ActionButton.Type.DonutGoal);
            case 2:
                CallEffectsDependency.DynamicLibsState dynamicLibsState = (CallEffectsDependency.DynamicLibsState) obj;
                if (!dynamicLibsState.i() && !dynamicLibsState.h()) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 3:
                return ((ri4) obj).b;
            case 4:
                return (BoardComment) ((cbg) obj).a;
            case 5:
                ((ggj) obj).s1();
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((UIBlock) obj) instanceof UIBlockFilter2D);
            case 7:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, Collections.singletonList(b4j.b), null, null, false, 12);
            case 8:
                return PerformanceEventType.CHANNEL_STUB_ATTACH_UPDATE.h();
            case 9:
                return ((VkPaginationList) obj).b;
            case 10:
                return ClipsEntryPointsViewState.d.a;
            case 11:
                return ((rmf) obj).k;
            case 12:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(0, 100, 1)));
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                return new Pair(fkq0.e((UserId) entry.getKey()), tsj.a((Group) entry.getValue()));
            case 14:
                Throwable th = (Throwable) obj;
                int i = CommunityProfileFragment.k0;
                return th instanceof TimeoutException ? io.reactivex.rxjava3.core.x.k(asl0.b.a) : io.reactivex.rxjava3.core.x.i(th);
            case 15:
                return s3q0.a;
            case 16:
                return new tfu(n34.a(((ery) obj).a()));
            case 17:
                return Boolean.valueOf(((k3j) obj).c);
            case 18:
                return Long.valueOf(((Contact) obj).b);
            case 19:
                MarketUpdateItemReviewResponseDto marketUpdateItemReviewResponseDto = (MarketUpdateItemReviewResponseDto) obj;
                return new cak(marketUpdateItemReviewResponseDto.e(), marketUpdateItemReviewResponseDto.d());
            case 20:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_attaches_open_channel);
            case 21:
                return io.reactivex.rxjava3.subjects.d.N0();
            case 22:
                return DzenArticleState.a((DzenArticleState) obj, null, null, DzenArticleState.LoadingState.ERROR_INITIAL_LOAD, null, null, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            case 23:
                kpq kpqVar = (kpq) obj;
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                ur60 ur60Var = kpqVar.h;
                boolean z = ur60Var.f;
                ListLoadingState listLoadingState = ur60Var.e;
                sq60 sq60Var = ur60Var.b;
                boolean z2 = z || (sq60Var.a.isEmpty() && (listLoadingState == ListLoadingState.RELOADING || listLoadingState == ListLoadingState.LOADING));
                boolean z3 = (ur60Var.g && !z2) || (sq60Var.a.isEmpty() && listLoadingState == ListLoadingState.ERROR);
                boolean z4 = sq60Var.a.isEmpty() && !z3 && !z2 && listLoadingState == ListLoadingState.IDLE;
                sq60 sq60Var2 = ur60Var.b;
                ListLoadingState listLoadingState2 = ur60Var.e;
                FaveType faveType = kpqVar.b;
                return new erq(sq60Var2, listLoadingState2, z2, z3, new xnq(faveType != null && z4, faveType == null && z4, kpqVar.c != null ? FaveAllEmptyState.EMPTY_TAG : FaveAllEmptyState.EMPTY));
            case 24:
                int i2 = FavesFragment.j0;
                qgi0.r((tgi0) obj, "fave_toolbar_title_test_tag");
                return s3q0.a;
            case 25:
                Context context = (Context) obj;
                qmu0 qmu0Var = new qmu0(context);
                qmu0Var.a(new nmu0(oq.d(tlo0.Companion, "29"), new tlo0.h("МАР"), e3m.f(R.attr.vk_ui_background_content, context), "Event date"));
                qmu0Var.b(new omu0(new tlo0.h("Санкт-Петербург · 19:00")));
                qmu0Var.c(new pmu0(new tlo0.h("Купить билет"), new nd1(14), R.attr.vk_ui_background_content_inverse, R.attr.vk_ui_text_contrast_themed, false));
                qmu0Var.setBackgroundColor(e3m.f(R.attr.vk_ui_background_secondary, context));
                return qmu0Var;
            case 26:
                return new c0r((ViewGroup) obj);
            case 27:
                return new ium0((ViewGroup) obj);
            case 28:
                return s3q0.a;
            default:
                a6r a6rVar = (a6r) obj;
                if (!(a6rVar instanceof ygw0) && !(a6rVar instanceof ahw0)) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
        }
    }
}
