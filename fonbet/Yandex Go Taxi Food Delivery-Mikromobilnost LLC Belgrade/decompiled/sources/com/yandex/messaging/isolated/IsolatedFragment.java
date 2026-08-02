package com.yandex.messaging.isolated;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import defpackage.d8g;
import defpackage.dwy0;
import defpackage.e1k;
import defpackage.enp0;
import defpackage.fzw;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.kzw;
import defpackage.onp0;
import defpackage.p8g;
import defpackage.q5z;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.rz10;
import defpackage.scc;
import defpackage.tpr;
import defpackage.v320;
import defpackage.vzw;
import defpackage.w511;
import defpackage.wzw;
import defpackage.yhl;
import defpackage.yow;
import defpackage.z8g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 =2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010\"\u001a\u00020!H\u0004¢\u0006\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R/\u00105\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u0006068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/yandex/messaging/isolated/IsolatedFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lv320;", "component", "Lkzw;", "createActivityComponent", "(Lv320;)Lkzw;", "Landroid/app/Activity;", "activity", "Lzy11;", "applyThemeOverlay", "(Landroid/app/Activity;)V", "", "eventName", "addLifecycleEventToLog", "(Ljava/lang/String;)V", "Landroidx/lifecycle/Lifecycle$State;", "toLogString", "(Landroidx/lifecycle/Lifecycle$State;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onStart", "onStop", "onDestroy", "Landroidx/fragment/app/FragmentActivity;", "requireActivityOrReportError", "()Landroidx/fragment/app/FragmentActivity;", "Lenp0;", "sdkComponent$delegate", "Li3y;", "getSdkComponent", "()Lenp0;", "sdkComponent", "", "lifecycleEventsList", "Ljava/util/List;", "Le1k;", "<set-?>", "onlineSubscription$delegate", "Lqp3;", "getOnlineSubscription", "()Le1k;", "setOnlineSubscription", "(Le1k;)V", "onlineSubscription", "Ltpr;", "getActivityComponentFlow", "()Ltpr;", "activityComponentFlow", "getName", "()Ljava/lang/String;", "name", "Companion", "vzw", "messaging-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class IsolatedFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    public static final vzw Companion;
    private static final int MAX_EVENTS_TO_LOG_COUNT = 10;

    /* renamed from: sdkComponent$delegate, reason: from kotlin metadata */
    private final i3y sdkComponent = kotlin.a.a(new yow(7, this));
    private final List<String> lifecycleEventsList = new ArrayList();

    /* renamed from: onlineSubscription$delegate, reason: from kotlin metadata */
    private final qp3 onlineSubscription = new qp3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("onlineSubscription", 0, "getOnlineSubscription()Lcom/yandex/alicekit/core/Disposable;", IsolatedFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{mutablePropertyReference1Impl};
        Companion = new vzw();
    }

    private final void addLifecycleEventToLog(String eventName) {
        this.lifecycleEventsList.add(0, eventName);
        if (this.lifecycleEventsList.size() > 10) {
            List<String> list = this.lifecycleEventsList;
            list.remove(scc.f(list));
        }
    }

    private final void applyThemeOverlay(Activity activity) {
        activity.getTheme().applyStyle(((dwy0) ((z8g) getSdkComponent()).R.get()).b(), true);
        Iterator it = ((dwy0) ((z8g) getSdkComponent()).R.get()).a().iterator();
        while (it.hasNext()) {
            activity.getTheme().applyStyle(((Number) it.next()).intValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kzw createActivityComponent(v320 component) {
        p8g p8gVar = (p8g) component;
        z8g z8gVar = p8gVar.b;
        p8g p8gVar2 = p8gVar.c;
        FragmentActivity requireActivityOrReportError = requireActivityOrReportError();
        requireActivityOrReportError.getClass();
        return new d8g(z8gVar, p8gVar2, requireActivityOrReportError);
    }

    private final e1k getOnlineSubscription() {
        qp3 qp3Var = this.onlineSubscription;
        kgx kgxVar = $$delegatedProperties[0];
        return (e1k) qp3Var.a();
    }

    private final enp0 getSdkComponent() {
        return (enp0) this.sdkComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final enp0 sdkComponent_delegate$lambda$1(IsolatedFragment isolatedFragment) {
        Context context = onp0.a;
        return onp0.a(isolatedFragment.requireContext());
    }

    private final void setOnlineSubscription(e1k e1kVar) {
        qp3 qp3Var = this.onlineSubscription;
        kgx kgxVar = $$delegatedProperties[0];
        qp3Var.b(e1kVar);
    }

    private final String toLogString(Lifecycle.State state) {
        int i = wzw.a[state.ordinal()];
        if (i == 1) {
            return "DESTROYED";
        }
        if (i == 2) {
            return "INITIALIZED";
        }
        if (i == 3) {
            return "CREATED";
        }
        if (i == 4) {
            return "STARTED";
        }
        if (i == 5) {
            return "RESUMED";
        }
        yhl.d(state, "Not a state ");
        return null;
    }

    public final tpr getActivityComponentFlow() {
        return new fzw(1, ((z8g) getSdkComponent()).b().b(), this);
    }

    public abstract String getName();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        addLifecycleEventToLog("onCreate");
        super.onCreate(savedInstanceState);
        rz10 rz10Var = ((z8g) getSdkComponent()).a.k;
        q5z.i(rz10Var);
        if (rz10Var.a.b) {
            applyThemeOverlay(requireActivityOrReportError());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        addLifecycleEventToLog("onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        addLifecycleEventToLog("onDestroyView");
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setOnlineSubscription(new com.yandex.messaging.sync.b((com.yandex.messaging.profile.d) ((z8g) getSdkComponent()).h.get()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        setOnlineSubscription(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        addLifecycleEventToLog("onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    public final FragmentActivity requireActivityOrReportError() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        ((z8g) getSdkComponent()).a().reportEvent("tech_isolation_activity_missed", kotlin.collections.b.i(new Pair("name", getName()), new Pair("has_context", Boolean.valueOf(getContext() != null)), new Pair("lifecycle_state", toLogString(getLifecycle().b())), new Pair("lifecycle_events_from_new_to_old", kotlin.collections.a.X(this.lifecycleEventsList, null, null, null, null, 63))));
        w511.j("Fragment ", this, " not attached to an activity.");
        return null;
    }
}
