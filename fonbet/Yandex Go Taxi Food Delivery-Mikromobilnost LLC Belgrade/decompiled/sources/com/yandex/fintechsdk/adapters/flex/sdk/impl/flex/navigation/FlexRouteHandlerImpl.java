package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation;

import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.y;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview.PreviewLoader;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.DocumentQueryExtractingKt;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.DocumentQueryMappingKt;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import defpackage.bvf0;
import defpackage.cjh;
import defpackage.djh;
import defpackage.eja1;
import defpackage.ejh;
import defpackage.ex0;
import defpackage.flr;
import defpackage.g8e;
import defpackage.gdr;
import defpackage.glr;
import defpackage.hlr;
import defpackage.hrv;
import defpackage.ilr;
import defpackage.irv;
import defpackage.j190;
import defpackage.jl40;
import defpackage.kr;
import defpackage.l190;
import defpackage.omg0;
import defpackage.oyl;
import defpackage.p85;
import defpackage.pey;
import defpackage.pw7;
import defpackage.q370;
import defpackage.rh2;
import defpackage.scc;
import defpackage.sls;
import defpackage.t7j;
import defpackage.tje;
import defpackage.tkr;
import defpackage.u1m;
import defpackage.ug5;
import defpackage.ukr;
import defpackage.uva0;
import defpackage.v40;
import defpackage.vva0;
import defpackage.wzr;
import defpackage.xw8;
import defpackage.ysi0;
import defpackage.ywl;
import defpackage.z22;
import defpackage.zo1;
import defpackage.zu;
import defpackage.zy11;
import flex.feature.navigation.fragments.DocumentEngineDialogFragment;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 s2\u00020\u0001:\u0001sB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010(\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b(\u0010)JG\u0010+\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b+\u0010,J+\u0010-\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b-\u0010.J5\u00101\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u00010/2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b1\u00102Js\u00109\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010*\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001b2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u00108\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b9\u0010:J5\u0010<\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020%2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b<\u0010=J3\u0010?\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020%2\u0006\u0010>\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001dH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bJ\u0010KJ\u001d\u0010N\u001a\u00020\u001b2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001d0LH\u0002¢\u0006\u0004\bN\u0010OJ!\u0010R\u001a\u00020\u001d*\u00020P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001d0LH\u0002¢\u0006\u0004\bR\u0010SJ\u0013\u0010U\u001a\u00020T*\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0011\u0010X\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bX\u0010YJ\u0011\u0010Z\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bZ\u0010YJ+\u0010]\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\\\u001a\u00020[2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020%H\u0003¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u001dH\u0002¢\u0006\u0004\bb\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010fR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010gR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010hR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010dR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010iR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010jR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010dR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010CR\u0014\u0010r\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandlerImpl;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandler;", "Lcjh;", "bottomSheetFragmentFactory", "Lp85;", "Landroid/view/ViewGroup;", "containerProvider", "Ldjh;", "dialogFragmentFactory", "Lgdr;", "firstInteractionEventsListener", "Lukr;", "flexOverlayControllerFactory", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivityProvider", "Lejh;", "fragmentFactory", "Landroidx/fragment/app/FragmentManager;", "fragmentManagerProvider", "Ll190;", "overlayManager", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader;", "previewLoader", "Lcom/yandex/fintechsdk/core/navigation/impl/api/router/a;", "routerProvider", "<init>", "(Lcjh;Lp85;Ldjh;Lgdr;Lukr;Lp85;Lejh;Lp85;Ll190;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader;Lp85;)V", "", "animated", "Lzy11;", FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_POP_TO_ROOT, "(Z)V", "Lu1m;", "query", "Lywl;", "document", "", "", "", "customProps", "forward", "(Lu1m;Lywl;ZLjava/util/Map;)Z", "fullscreen", "overlay", "(Lu1m;Lywl;ZZLjava/util/Map;)Z", "backward", "(ZLjava/util/Map;)Z", "Lkr;", "completionAction", "dismiss", "(ZLkr;Ljava/util/Map;)Z", "closeOnTapOutside", "closeOnSlideDown", "dimBackground", "", "defaultHeight", "shouldLoadByQuery", "showPopup", "(Lu1m;Lywl;ZZZZLjava/lang/Float;ZLjava/util/Map;Lkr;)Z", "tag", "showOverlay", "(Ljava/lang/String;Lywl;Ljava/util/Map;)Z", "withAnimation", "hideOverlay", "(Ljava/lang/String;ZLjava/util/Map;)Z", "", "getBackStackEntryCount", "()I", "Lug5;", "getCurrentFragmentQuery", "()Lug5;", "reloadCurrentDocument", "()V", "action", "dispatchActionOnCurrent", "(Lkr;)Z", "Lkotlin/Function0;", "navigate", "withActivityResumed", "(Lsls;)Z", "Landroidx/lifecycle/Lifecycle;", "block", "runOnDestroy", "(Landroidx/lifecycle/Lifecycle;Lsls;)V", "Landroidx/fragment/app/y;", "hideLastFragment", "(Landroidx/fragment/app/y;)Landroidx/fragment/app/y;", "Lzu;", "getLastActionDispatcherHolder", "()Lzu;", "getPreviousActionDispatcherHolder", "Landroidx/fragment/app/Fragment;", "fragment", "setupFirstInteractionTracking", "(Lywl;Landroidx/fragment/app/Fragment;Lu1m;)V", "screenPath", "addFirstInteractionOverlay", "(Ljava/lang/String;)V", "removeFirstInteractionOverlay", "Lcjh;", "Lp85;", "Ldjh;", "Lgdr;", "Lukr;", "Lejh;", "Ll190;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader;", "Landroid/view/View;", "firstInteractionOverlay", "Landroid/view/View;", "getContainerId", "containerId", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexRouteHandlerImpl implements FlexRouteHandler {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FLEX_CUSTOM_PROPS_CLEAR_STACK = "clearStack";

    @Deprecated
    public static final String FLEX_CUSTOM_PROPS_POP_TO_ROOT = "popToRoot";

    @Deprecated
    public static final String FLEX_CUSTOM_PROPS_REPLACE = "replace";
    private final cjh bottomSheetFragmentFactory;
    private final p85 containerProvider;
    private final djh dialogFragmentFactory;
    private final gdr firstInteractionEventsListener;
    private View firstInteractionOverlay;
    private final ukr flexOverlayControllerFactory;
    private final p85 fragmentActivityProvider;
    private final ejh fragmentFactory;
    private final p85 fragmentManagerProvider;
    private final l190 overlayManager;
    private final PreviewLoader previewLoader;
    private final p85 routerProvider;

    public FlexRouteHandlerImpl(cjh cjhVar, p85 p85Var, djh djhVar, gdr gdrVar, ukr ukrVar, p85 p85Var2, ejh ejhVar, p85 p85Var3, l190 l190Var, PreviewLoader previewLoader, p85 p85Var4) {
        this.bottomSheetFragmentFactory = cjhVar;
        this.containerProvider = p85Var;
        this.dialogFragmentFactory = djhVar;
        this.firstInteractionEventsListener = gdrVar;
        this.flexOverlayControllerFactory = ukrVar;
        this.fragmentActivityProvider = p85Var2;
        this.fragmentFactory = ejhVar;
        this.fragmentManagerProvider = p85Var3;
        this.overlayManager = l190Var;
        this.previewLoader = previewLoader;
        this.routerProvider = p85Var4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFirstInteractionOverlay(String screenPath) {
        removeFirstInteractionOverlay();
        ViewGroup viewGroup = (ViewGroup) this.containerProvider.a();
        if (viewGroup == null) {
            return;
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setImportantForAccessibility(2);
        view.setOnTouchListener(new rh2(2, this, screenPath));
        viewGroup.addView(view);
        this.firstInteractionOverlay = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean addFirstInteractionOverlay$lambda$18(FlexRouteHandlerImpl flexRouteHandlerImpl, String str, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        gdr gdrVar = flexRouteHandlerImpl.firstInteractionEventsListener;
        if (gdrVar != null) {
            uva0 uva0Var = (uva0) gdrVar;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            Ref$LongRef ref$LongRef3 = new Ref$LongRef();
            uva0Var.c.computeIfPresent(str, new pw7(6, new wzr(ref$ObjectRef, ref$LongRef, ref$LongRef2, ref$LongRef3, 29)));
            Long l = (Long) ref$ObjectRef.element;
            if (l != null) {
                long longValue = l.longValue();
                z22 z22Var = uva0Var.a;
                long j = ref$LongRef3.element;
                long j2 = ref$LongRef.element;
                long j3 = ref$LongRef2.element;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("duration_ms", String.valueOf(longValue));
                mapBuilder.put(StateEntry.COLUMN_PATH, str);
                mapBuilder.put("network_request_duration_ms", String.valueOf(j2));
                mapBuilder.put("rendering_duration_ms", String.valueOf(j3));
                mapBuilder.put("decoding_duration_ms", String.valueOf(j));
                ((a) z22Var).a(new vva0("performance_first_interaction", mapBuilder.j()));
                uva0Var.b.a("first_interaction", str);
            }
        }
        flexRouteHandlerImpl.removeFirstInteractionOverlay();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 backward$lambda$4(FlexRouteHandlerImpl flexRouteHandlerImpl) {
        if (flexRouteHandlerImpl.getFragmentManager().K() > 1) {
            flexRouteHandlerImpl.getFragmentManager().Z();
        } else {
            com.yandex.fintechsdk.core.navigation.impl.api.router.a aVar = (com.yandex.fintechsdk.core.navigation.impl.api.router.a) flexRouteHandlerImpl.routerProvider.a();
            if (aVar != null) {
                aVar.a();
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 dismiss$lambda$6(kr krVar, FlexRouteHandlerImpl flexRouteHandlerImpl, boolean z, Map map) {
        zu previousActionDispatcherHolder;
        if (krVar != null && (previousActionDispatcherHolder = flexRouteHandlerImpl.getPreviousActionDispatcherHolder()) != null) {
            previousActionDispatcherHolder.dispatchAction(krVar);
        }
        Fragment fragment = (Fragment) kotlin.collections.a.b0(flexRouteHandlerImpl.getFragmentManager().c.f());
        if (fragment instanceof DialogFragment) {
            DialogFragment dialogFragment = (DialogFragment) fragment;
            Dialog dialog = dialogFragment.getDialog();
            if (dialog instanceof BottomSheetDialog) {
                ((BottomSheetDialog) dialog).setDismissWithAnimation(z);
            }
            dialogFragment.dismiss();
        } else {
            flexRouteHandlerImpl.backward(z, map);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 dispatchActionOnCurrent$lambda$14(FlexRouteHandlerImpl flexRouteHandlerImpl, kr krVar) {
        zu lastActionDispatcherHolder = flexRouteHandlerImpl.getLastActionDispatcherHolder();
        if (lastActionDispatcherHolder != null) {
            lastActionDispatcherHolder.dispatchAction(krVar);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 forward$lambda$2(Map map, FlexRouteHandlerImpl flexRouteHandlerImpl, u1m u1mVar, ywl ywlVar, boolean z) {
        Object obj = map.get(FLEX_CUSTOM_PROPS_CLEAR_STACK);
        Boolean bool = Boolean.TRUE;
        boolean l = jl40.l(obj, bool);
        boolean l2 = jl40.l(map.get(FLEX_CUSTOM_PROPS_REPLACE), bool);
        boolean l3 = jl40.l(map.get(FLEX_CUSTOM_PROPS_POP_TO_ROOT), bool);
        Fragment a = flexRouteHandlerImpl.fragmentFactory.a(u1mVar, ywlVar == null ? flexRouteHandlerImpl.previewLoader.loadPreviewDocument$impl_18_1_0_release() : ywlVar, map);
        if (l) {
            flexRouteHandlerImpl.getFragmentManager().a0(-1, 1);
        } else if (l2) {
            if (flexRouteHandlerImpl.getFragmentManager().K() > 0) {
                flexRouteHandlerImpl.getFragmentManager().Z();
            }
        } else if (l3 && flexRouteHandlerImpl.getFragmentManager().K() > 1) {
            flexRouteHandlerImpl.getFragmentManager().Y(((androidx.fragment.app.a) flexRouteHandlerImpl.getFragmentManager().J(0)).t, 0);
        }
        if (flexRouteHandlerImpl.firstInteractionEventsListener != null) {
            flexRouteHandlerImpl.setupFirstInteractionTracking(ywlVar, a, u1mVar);
        }
        FragmentManager fragmentManager = flexRouteHandlerImpl.getFragmentManager();
        androidx.fragment.app.a h = g8e.h(fragmentManager, fragmentManager);
        h.p = true;
        if (z && !l3 && !l && !l2) {
            h.i(omg0.finsdk_slide_in_to_left, omg0.finsdk_slide_out_to_left, omg0.finsdk_slide_in_to_right, omg0.finsdk_slide_out_to_right);
        }
        h.c(null);
        flexRouteHandlerImpl.hideLastFragment(h);
        h.f(flexRouteHandlerImpl.getContainerId(), a, null, 1);
        h.d();
        return zy11.a;
    }

    private final int getContainerId() {
        return ((ViewGroup) this.containerProvider.b()).getId();
    }

    private final FragmentManager getFragmentManager() {
        return (FragmentManager) this.fragmentManagerProvider.b();
    }

    private final zu getLastActionDispatcherHolder() {
        Object obj;
        List f = getFragmentManager().c.f();
        ListIterator listIterator = f.listIterator(f.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((Fragment) obj) instanceof zu) {
                break;
            }
        }
        if (obj instanceof zu) {
            return (zu) obj;
        }
        return null;
    }

    private final zu getPreviousActionDispatcherHolder() {
        Iterator it = kotlin.collections.a.O0(getFragmentManager().c.f()).iterator();
        Object obj = null;
        while (true) {
            irv irvVar = (irv) it;
            if (!irvVar.c.hasNext()) {
                break;
            }
            Object next = irvVar.next();
            hrv hrvVar = (hrv) next;
            int i = hrvVar.a;
            Fragment fragment = (Fragment) hrvVar.b;
            if (i != scc.f(getFragmentManager().c.f()) && (fragment instanceof zu)) {
                obj = next;
            }
        }
        hrv hrvVar2 = (hrv) obj;
        v40 v40Var = hrvVar2 != null ? (Fragment) hrvVar2.b : null;
        if (v40Var instanceof zu) {
            return (zu) v40Var;
        }
        return null;
    }

    private final y hideLastFragment(y yVar) {
        return !getFragmentManager().c.f().isEmpty() ? yVar.g((Fragment) kotlin.collections.a.Z(getFragmentManager().c.f())) : yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 hideOverlay$lambda$12(FlexRouteHandlerImpl flexRouteHandlerImpl, String str, boolean z) {
        l190 l190Var = flexRouteHandlerImpl.overlayManager;
        tje.N(bvf0.b(), null, null, new FlexRouteHandlerImpl$hideOverlay$1$1(l190Var != null ? l190Var.evictOverlay(str) : null, z, null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 overlay$lambda$3(FlexRouteHandlerImpl flexRouteHandlerImpl, u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        DocumentEngineDialogFragment a = ((oyl) flexRouteHandlerImpl.dialogFragmentFactory).a(u1mVar, ywlVar, z, z2, map);
        FragmentManager fragmentManager = flexRouteHandlerImpl.getFragmentManager();
        fragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.c(null);
        a.show(aVar, (String) null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 popToRoot$lambda$0(FlexRouteHandlerImpl flexRouteHandlerImpl, boolean z) {
        if (flexRouteHandlerImpl.getFragmentManager().K() > 1) {
            int i = ((androidx.fragment.app.a) flexRouteHandlerImpl.getFragmentManager().J(1)).t;
            if (z) {
                flexRouteHandlerImpl.getFragmentManager().X(i, false);
            } else {
                flexRouteHandlerImpl.getFragmentManager().Y(i, 1);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 reloadCurrentDocument$lambda$13(FlexRouteHandlerImpl flexRouteHandlerImpl) {
        zu lastActionDispatcherHolder = flexRouteHandlerImpl.getLastActionDispatcherHolder();
        if (lastActionDispatcherHolder != null) {
            lastActionDispatcherHolder.dispatchAction(ysi0.INSTANCE);
        }
        return zy11.a;
    }

    private final void removeFirstInteractionOverlay() {
        View view = this.firstInteractionOverlay;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        this.firstInteractionOverlay = null;
    }

    private final void runOnDestroy(Lifecycle lifecycle, final sls slsVar) {
        lifecycle.a(new DefaultLifecycleObserver() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl$runOnDestroy$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onCreate(pey peyVar) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(pey owner) {
                sls.this.invoke();
                owner.getLifecycle().d(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onPause(pey peyVar) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onResume(pey peyVar) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onStart(pey peyVar) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onStop(pey peyVar) {
            }
        });
    }

    private final void setupFirstInteractionTracking(ywl document, final Fragment fragment, u1m query) {
        b bVar;
        final String obj;
        q370 q370Var;
        if (query == null || (obj = query.a) == null) {
            Object obj2 = (document == null || (q370Var = document.e) == null) ? null : q370Var.a;
            c cVar = obj2 instanceof c ? (c) obj2 : null;
            if (cVar == null || (bVar = (b) cVar.get("pageName")) == null) {
                return;
            } else {
                obj = bVar.toString();
            }
        }
        getFragmentManager().d0(new FragmentManager.a() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl$setupFirstInteractionTracking$1
            @Override // androidx.fragment.app.FragmentManager.a
            public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
                if (f != Fragment.this) {
                    return;
                }
                fm.r0(this);
            }

            @Override // androidx.fragment.app.FragmentManager.a
            public void onFragmentViewCreated(FragmentManager fm, Fragment f, View view, Bundle savedInstanceState) {
                if (f != Fragment.this) {
                    return;
                }
                fm.r0(this);
                this.addFirstInteractionOverlay(obj);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showOverlay$lambda$11(final FlexRouteHandlerImpl flexRouteHandlerImpl, final String str, ywl ywlVar) {
        tkr overlay;
        l190 l190Var = flexRouteHandlerImpl.overlayManager;
        zy11 zy11Var = zy11.a;
        if (l190Var == null || flexRouteHandlerImpl.flexOverlayControllerFactory == null) {
            return zy11Var;
        }
        tkr create = flexRouteHandlerImpl.flexOverlayControllerFactory.create(new j190() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl$showOverlay$1$overlayListener$1
            @Override // defpackage.j190
            public void onHide() {
                l190 l190Var2;
                l190Var2 = FlexRouteHandlerImpl.this.overlayManager;
                l190Var2.evictOverlay(str);
            }

            @Override // defpackage.j190
            public void onShow() {
            }
        });
        if (flexRouteHandlerImpl.overlayManager.contains(str) && (overlay = flexRouteHandlerImpl.overlayManager.getOverlay(str)) != null) {
            overlay.hideOverlay(true);
        }
        flexRouteHandlerImpl.overlayManager.addOverlay(str, create);
        create.showOverlay(ywlVar);
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPopup$lambda$10(FlexRouteHandlerImpl flexRouteHandlerImpl, u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map, kr krVar) {
        BottomSheetDialogFragment create = flexRouteHandlerImpl.bottomSheetFragmentFactory.create(u1mVar, ywlVar, z, z2, z3, z4, f, z5, map);
        flexRouteHandlerImpl.runOnDestroy(create.getLifecycle(), new flr(krVar, flexRouteHandlerImpl));
        FragmentManager fragmentManager = flexRouteHandlerImpl.getFragmentManager();
        fragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.c(null);
        create.show(aVar, (String) null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPopup$lambda$10$lambda$9$lambda$8(kr krVar, FlexRouteHandlerImpl flexRouteHandlerImpl) {
        zu lastActionDispatcherHolder;
        if (krVar != null && (lastActionDispatcherHolder = flexRouteHandlerImpl.getLastActionDispatcherHolder()) != null) {
            lastActionDispatcherHolder.dispatchAction(krVar);
        }
        return zy11.a;
    }

    private final boolean withActivityResumed(sls navigate) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.fragmentActivityProvider.a();
        if (fragmentActivity == null) {
            return false;
        }
        tje.N(eja1.s(fragmentActivity), null, null, new FlexRouteHandlerImpl$withActivityResumed$1(fragmentActivity, navigate, null), 3);
        return true;
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler
    public /* bridge */ /* synthetic */ boolean attachChildRouteHandler(int i, int i2) {
        return false;
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.o3l0, defpackage.nh5
    public boolean backward(boolean animated, Map<String, ? extends Object> customProps) {
        return withActivityResumed(new hlr(this, 1));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler
    public /* bridge */ /* synthetic */ boolean detachChildRouteHandler() {
        return false;
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.o3l0
    public boolean dismiss(boolean animated, kr completionAction, Map<String, ? extends Object> customProps) {
        return withActivityResumed(new xw8(completionAction, this, animated, customProps, 1));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler
    public boolean dispatchActionOnCurrent(kr action) {
        return withActivityResumed(new flr(this, action));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.o3l0
    public boolean forward(u1m query, ywl document, boolean animated, Map<String, ? extends Object> customProps) {
        return withActivityResumed(new glr(customProps, this, query, document, animated, 0));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.nh5
    public int getBackStackEntryCount() {
        FragmentManager fragmentManager = (FragmentManager) this.fragmentManagerProvider.a();
        if (fragmentManager != null) {
            return fragmentManager.K();
        }
        return 0;
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.nh5
    public ug5 getCurrentFragmentQuery() {
        ViewGroup viewGroup;
        Fragment E;
        Bundle arguments;
        u1m extractDocumentQuery;
        FragmentManager fragmentManager = (FragmentManager) this.fragmentManagerProvider.a();
        if (fragmentManager == null || (viewGroup = (ViewGroup) this.containerProvider.a()) == null || (E = fragmentManager.E(viewGroup.getId())) == null || (arguments = E.getArguments()) == null || (extractDocumentQuery = DocumentQueryExtractingKt.extractDocumentQuery(arguments)) == null) {
            return null;
        }
        return DocumentQueryMappingKt.toBduiQuery(extractDocumentQuery);
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.o3l0, defpackage.nh5
    public boolean hideOverlay(String tag, boolean withAnimation, Map<String, ? extends Object> customProps) {
        return withActivityResumed(new ex0(this, tag, withAnimation, 10));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.o3l0
    public boolean overlay(u1m query, ywl document, boolean animated, boolean fullscreen, Map<String, ? extends Object> customProps) {
        return withActivityResumed(new ilr(this, query, document, fullscreen, animated, customProps));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.nh5
    public void popToRoot(boolean animated) {
        withActivityResumed(new zo1(this, animated, 8));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler
    public void reloadCurrentDocument() {
        withActivityResumed(new hlr(this, 0));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.o3l0
    public boolean showOverlay(String tag, ywl document, Map<String, ? extends Object> customProps) {
        return withActivityResumed(new t7j(10, this, tag, document));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler, defpackage.o3l0
    public boolean showPopup(final u1m query, final ywl document, final boolean fullscreen, final boolean closeOnTapOutside, final boolean closeOnSlideDown, final boolean dimBackground, final Float defaultHeight, final boolean shouldLoadByQuery, final Map<String, ? extends Object> customProps, final kr completionAction) {
        return withActivityResumed(new sls() { // from class: jlr
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 showPopup$lambda$10;
                showPopup$lambda$10 = FlexRouteHandlerImpl.showPopup$lambda$10(FlexRouteHandlerImpl.this, query, document, fullscreen, closeOnTapOutside, closeOnSlideDown, dimBackground, defaultHeight, shouldLoadByQuery, customProps, completionAction);
                return showPopup$lambda$10;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandlerImpl$Companion;", "", "<init>", "()V", "FLEX_CUSTOM_PROPS_CLEAR_STACK", "", "FLEX_CUSTOM_PROPS_REPLACE", "FLEX_CUSTOM_PROPS_POP_TO_ROOT", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
