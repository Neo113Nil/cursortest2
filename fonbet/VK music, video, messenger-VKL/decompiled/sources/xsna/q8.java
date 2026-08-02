package xsna;

import android.view.View;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Source;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.folders.impl.model.FoldersListLoaderStateEvents;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.voip.ui.call_by_phone.ui.ActionButtonState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.drz;
import xsna.rgw0;
import xsna.vs60;

/* compiled from: AboutVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class q8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return t8.a((t8) this.receiver, (hfz) obj);
            case 1:
                int intValue = ((Number) obj).intValue();
                hn4 hn4Var = (hn4) this.receiver;
                cn4 c = hn4Var.m.c(intValue);
                hn4Var.g.a(new cq3(1, hn4Var, c), false);
                hn4Var.f(c.a);
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                ((com.vk.clips.favorites.impl.ui.folders.picker.b) this.receiver).T((com.vk.clips.favorites.impl.ui.folders.picker.c) obj);
                return s3q0.a;
            case 4:
                ((CommunityProfileFragment) this.receiver).a((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 5:
                xpp xppVar = (xpp) obj;
                com.vk.folders.impl.model.a aVar = (com.vk.folders.impl.model.a) this.receiver;
                aVar.getClass();
                Iterable iterable = (List) xppVar.a();
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                boolean z = xppVar.a;
                io.reactivex.rxjava3.subjects.d<drz.a<Map<Integer, rpm>>> dVar = aVar.d;
                Iterable iterable2 = iterable;
                int e = on00.e(c5g.u(iterable2, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj2 : iterable2) {
                    linkedHashMap.put(Integer.valueOf(((rpm) obj2).a), obj2);
                }
                dVar.onNext(new drz.a<>(linkedHashMap, z));
                aVar.e.onNext(FoldersListLoaderStateEvents.LoaderStateEvent.LoadingFinished);
                if (xppVar.a && aVar.i.compareAndSet(false, true)) {
                    aVar.h.b(io.reactivex.rxjava3.kotlin.c.e(aVar.b.C(aVar, new jqm(Source.NETWORK)).q(aVar.g), new ire(aVar, 16), new pcg(aVar, 21)));
                }
                return s3q0.a;
            case 6:
                View view = (View) obj;
                f910 f910Var = (f910) this.receiver;
                VkContextMenu vkContextMenu = f910Var.n;
                if (vkContextMenu != null) {
                    vkContextMenu.j(false);
                } else if (view != null) {
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    view.getContext();
                    e.b bVar = new e.b(view, null, null, l, 6);
                    bVar.w = R.layout.ds_internal_context_menu_item;
                    bVar.l = (mqu) f910Var.y.getValue();
                    bVar.e = f910Var.c;
                    f910Var.n = bVar.l(false);
                }
                return s3q0.a;
            case 7:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 8:
                ((d070) this.receiver).a.a(new vs60.i.c(new k070((GetStoriesResponse) obj)));
                return s3q0.a;
            case 9:
                L.i((Throwable) obj);
                return s3q0.a;
            case 10:
                L.i((Throwable) obj);
                return s3q0.a;
            case 11:
                rgw0 rgw0Var = (rgw0) obj;
                ((ugw0) this.receiver).getClass();
                if (rgw0Var instanceof rgw0.g) {
                    return new zkj(false, ActionButtonState.CHECK_NUMBER, null, false, false, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                if (rgw0Var instanceof rgw0.d) {
                    rgw0.d dVar2 = (rgw0.d) rgw0Var;
                    return new zkj(dVar2.c, ActionButtonState.CHECK_NUMBER, null, dVar2.d, dVar2.e, false, 76);
                }
                if (rgw0Var instanceof rgw0.h) {
                    return new zkj(true, ActionButtonState.SHARE, ugw0.a(rgw0Var), false, false, false, 116);
                }
                if (rgw0Var instanceof rgw0.c) {
                    return new zkj(true, ActionButtonState.SHARE, ugw0.a(rgw0Var), false, false, false, 116);
                }
                if (rgw0Var instanceof rgw0.i) {
                    return new zkj(true, ActionButtonState.SHARE, ugw0.a(rgw0Var), false, false, true, 52);
                }
                if (rgw0Var instanceof rgw0.a) {
                    return new zkj(false, ActionButtonState.CALL, ugw0.a(rgw0Var), false, false, false, 112);
                }
                if (rgw0Var instanceof rgw0.b) {
                    return new zkj(true, ActionButtonState.CALL, null, false, false, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                if (rgw0Var instanceof rgw0.f) {
                    return new zkj(false, ActionButtonState.LOADING_USER, null, false, false, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                if (!(rgw0Var instanceof rgw0.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionButtonState actionButtonState = ActionButtonState.LOADING_SHARE;
                rgw0 rgw0Var2 = ((rgw0.e) rgw0Var).b;
                return new zkj(false, actionButtonState, ugw0.a(rgw0Var2), false, false, rgw0Var2 instanceof rgw0.i, 52);
            default:
                return ((q73) this.receiver).p((AppsGetResponseDto) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 6:
                super(1, obj, f910.class, "showNewsPopupMenu", "showNewsPopupMenu(Landroid/view/View;)V", 0);
                break;
            case 7:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, d070.class, "bindStoriesResponse", "bindStoriesResponse(Lcom/vk/dto/stories/model/GetStoriesResponse;)V", 0);
                break;
            case 9:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, ugw0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/call_by_phone/feature/VoipCallByPhoneState;)Lcom/vk/voip/ui/call_by_phone/ui/ContentState;", 0);
                break;
            default:
                break;
        }
    }
}
