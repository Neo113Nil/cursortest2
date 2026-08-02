package xsna;

import android.content.Context;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.utils.dto.UtilsGuessUserSexResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.UIBlockCustomItemUniqueIdWrapper;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.impl.drafts.DraftsFeedRecyclerPaginatedView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vk.superapp.api.dto.configurations.ShowcaseConfiguration;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.api.dto.menu.UpdateOptions;
import com.vk.superapp.api.dto.widgets.InvalidWidgetInfo;
import com.vk.superapp.core.api.models.VkGender;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.api.StubTiles;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.accept.AcceptCallStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import xsna.erx;
import xsna.gfc;
import xsna.l110;
import xsna.n9n0;
import xsna.r2j;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class nj implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ nj(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 onAcceptCall$lambda$0;
        Object obj2;
        Object obj3;
        AttributeSet attributeSet = null;
        int i = 1;
        switch (this.b) {
            case 0:
                onAcceptCall$lambda$0 = AcceptCallStat.onAcceptCall$lambda$0((CallEventualStatSender) obj);
                return onAcceptCall$lambda$0;
            case 1:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 2:
                tj50.a aVar = (tj50.a) obj;
                bw7 bw7Var = bw7.b;
                ao8 ao8Var = ao8.d;
                return new mw7(aVar.a(bw7Var, ao8Var), aVar.a(cw7.b, ao8Var), aVar.a(dw7.b, ao8Var), aVar.a(ew7.b, ao8Var), aVar.a(fw7.b, ao8Var));
            case 3:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 4:
                qgi0.r((tgi0) obj, "cart_banner_text");
                return s3q0.a;
            case 5:
                return gfc.d.a;
            case 6:
                L.e("ClipsAuthorsInteractorImpl", "author changed author=" + ((chd) obj));
                return s3q0.a;
            case 7:
                return obj.toString();
            case 8:
                wuf wufVar = (wuf) obj;
                int i2 = ClipsWrapperFragment.Q0;
                wufVar.g().setVisibility(8);
                wufVar.m().setVisibility(8);
                return s3q0.a;
            case 9:
                return Boolean.valueOf((((com.vk.photo.editor.features.colorgrading.a) obj).f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : 0) ^ 1);
            case 10:
                L.i((Throwable) obj);
                return s3q0.a;
            case 11:
                return s3q0.a;
            case 12:
                L.i((Throwable) obj);
                return s3q0.a;
            case 13:
                return new g.c(((tj50.a) obj).a(new pl2(19), ao8.d));
            case 14:
                return r2j.e.a;
            case 15:
                L.i((Throwable) obj);
                return s3q0.a;
            case 16:
                qgi0.d((tgi0) obj);
                return s3q0.a;
            case 17:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_folder_dialog_option_remove_from_folder);
            case 18:
                return new b0l0(((b0l0) obj).a());
            case 19:
                int i3 = DraftsFeedRecyclerPaginatedView.a0;
                qgi0.r((tgi0) obj, "drafts_feed_empty_state_placeholder_desc");
                return s3q0.a;
            case 20:
                return d.b.C1771b.a;
            case 21:
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                return fpf0.a(vKApiExecutionException.getClass()).l() + ':' + vKApiExecutionException.getMessage();
            case 22:
                return ((FStack) obj).zb();
            case 23:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) th;
                    if (vKApiExecutionException2.C() != -1) {
                        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                        frf0.f = Integer.valueOf(vKApiExecutionException2.C());
                    }
                }
                return s3q0.a;
            case 24:
                VkGender.a aVar2 = VkGender.Companion;
                String i4 = ((UtilsGuessUserSexResponseDto) obj).d().i();
                aVar2.getClass();
                return VkGender.a.b(i4);
            case 25:
                return Boolean.valueOf(((UIBlock) obj) instanceof UIBlockCustomItemUniqueIdWrapper);
            case 26:
                erx erxVar = (erx) obj;
                return erxVar instanceof erx.c ? ((erx.c) erxVar).d : new uyh0(0);
            case 27:
                return new l110.c();
            case 28:
                q9n0 q9n0Var = (q9n0) obj;
                k720.l = null;
                k720 k720Var = k720.a;
                n9n0 n9n0Var = k720.R;
                if (n9n0Var != null) {
                    q9n0 q9n0Var2 = n9n0Var.a;
                    WidgetObjects widgetObjects = q9n0Var2.d;
                    ArrayList arrayList = q9n0Var.a;
                    WidgetObjects widgetObjects2 = q9n0Var.d;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<SuperAppWidget> arrayList3 = q9n0Var2.a;
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                    for (SuperAppWidget superAppWidget : arrayList3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (epx.f(((SuperAppWidget) obj3).d().b, superAppWidget.d().b)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        SuperAppWidget superAppWidget2 = (SuperAppWidget) obj3;
                        arrayList4.add(Boolean.valueOf(superAppWidget2 == null ? arrayList2.add(superAppWidget) : arrayList2.add(superAppWidget2)));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        SuperAppWidget superAppWidget3 = (SuperAppWidget) obj4;
                        Iterator it2 = arrayList3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (epx.f(((SuperAppWidget) obj2).d().b, superAppWidget3.d().b)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            arrayList5.add(obj4);
                        }
                    }
                    arrayList2.addAll(arrayList5);
                    if (arrayList2.size() > 1) {
                        g5g.L(arrayList2, new ys2(i));
                    }
                    WidgetObjects widgetObjects3 = new WidgetObjects(pn00.n(widgetObjects.b, widgetObjects2.b), pn00.n(widgetObjects.c, widgetObjects2.c), pn00.n(widgetObjects.d, widgetObjects2.d));
                    LinkedHashSet j = izi0.j(q9n0Var2.c, q9n0Var.c);
                    String str = q9n0Var.k;
                    if (str == null) {
                        str = q9n0Var2.k;
                    }
                    String str2 = str;
                    List<InvalidWidgetInfo> list = q9n0Var.b;
                    UpdateOptions updateOptions = q9n0Var2.e;
                    QueueParams queueParams = q9n0Var.f;
                    StubTiles stubTiles = q9n0Var.g;
                    if (stubTiles == null) {
                        stubTiles = q9n0Var2.g;
                    }
                    StubTiles stubTiles2 = stubTiles;
                    Integer num = q9n0Var.h;
                    Integer num2 = q9n0Var.i;
                    String str3 = q9n0Var.j;
                    List<ShowcaseConfiguration> list2 = q9n0Var.l;
                    if (list2 == null) {
                        list2 = q9n0Var2.l;
                    }
                    q9n0 K = k720.K(new q9n0(arrayList2, list, j, widgetObjects3, updateOptions, queueParams, stubTiles2, num, num2, str3, str2, list2));
                    k720.W(K);
                    k720.X(new n9n0(K, n9n0.a.c.a));
                    k720.V(K.b);
                }
                return s3q0.a;
            default:
                return new VkPlaceholder((Context) obj, attributeSet, 6, r4);
        }
    }
}
