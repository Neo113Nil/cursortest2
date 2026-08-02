package com.ybsdk.feature.divkit.internal.ui;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import defpackage.cmi;
import defpackage.czf;
import defpackage.gmh;
import defpackage.h791;
import defpackage.h9g;
import defpackage.i5m;
import defpackage.j3h;
import defpackage.mpk;
import defpackage.nbp0;
import defpackage.nkp;
import defpackage.ny61;
import defpackage.oti;
import defpackage.pgi;
import defpackage.q5z;
import defpackage.tje;
import defpackage.wzk;
import defpackage.xx60;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/DivCustomPlusBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmpk;", "dependencies", "Lzy11;", "createAndAddPlusPlaqueView", "(Lmpk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/View;", "plusPlaqueView", "createClickInterceptorWrapper", "(Landroid/view/View;)Landroid/view/View;", "", "action", "handleAction", "(Ljava/lang/String;)V", "", "actions", "setClickActions", "(Ljava/util/List;)V", "onAttachedToWindow", "()V", "clickActions", "Ljava/util/List;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivCustomPlusBadgeView extends FrameLayout {
    private List<String> clickActions;

    public /* synthetic */ DivCustomPlusBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createAndAddPlusPlaqueView(mpk mpkVar, Continuation<? super zy11> continuation) {
        DivCustomPlusBadgeView$createAndAddPlusPlaqueView$1 divCustomPlusBadgeView$createAndAddPlusPlaqueView$1;
        int i;
        View view;
        if (continuation instanceof DivCustomPlusBadgeView$createAndAddPlusPlaqueView$1) {
            divCustomPlusBadgeView$createAndAddPlusPlaqueView$1 = (DivCustomPlusBadgeView$createAndAddPlusPlaqueView$1) continuation;
            int i2 = divCustomPlusBadgeView$createAndAddPlusPlaqueView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divCustomPlusBadgeView$createAndAddPlusPlaqueView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divCustomPlusBadgeView$createAndAddPlusPlaqueView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divCustomPlusBadgeView$createAndAddPlusPlaqueView$1.label;
                int i3 = 1;
                if (i != 0) {
                    b.b(obj);
                    wzk wzkVar = new wzk();
                    i5m.b(new oti(wzkVar, i5m.b(new pgi(wzkVar, new czf(mpkVar, 3), new czf(mpkVar, 2), i5m.b(new gmh(wzkVar, new czf(mpkVar, 0))))), new czf(mpkVar, i3), 9));
                    q5z.h(((h9g) mpkVar).n());
                    getContext();
                    divCustomPlusBadgeView$createAndAddPlusPlaqueView$1.label = 1;
                    if (coroutineSingletons == null) {
                        return coroutineSingletons;
                    }
                    obj = null;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                view = (View) obj;
                if (view != null) {
                    View createClickInterceptorWrapper = createClickInterceptorWrapper(view);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 21;
                    addView(createClickInterceptorWrapper, layoutParams);
                }
                return zy11.a;
            }
        }
        divCustomPlusBadgeView$createAndAddPlusPlaqueView$1 = new DivCustomPlusBadgeView$createAndAddPlusPlaqueView$1(this, continuation);
        Object obj2 = divCustomPlusBadgeView$createAndAddPlusPlaqueView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divCustomPlusBadgeView$createAndAddPlusPlaqueView$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        view = (View) obj2;
        if (view != null) {
        }
        return zy11.a;
    }

    private final View createClickInterceptorWrapper(View plusPlaqueView) {
        final Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context) { // from class: com.ybsdk.feature.divkit.internal.ui.DivCustomPlusBadgeView$createClickInterceptorWrapper$plusPlaqueViewWrapper$1
            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent ev) {
                return true;
            }
        };
        frameLayout.setOnClickListener(new cmi(7, this));
        frameLayout.addView(plusPlaqueView, new FrameLayout.LayoutParams(-2, -2));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createClickInterceptorWrapper$lambda$2(DivCustomPlusBadgeView divCustomPlusBadgeView, View view) {
        Iterable iterable = divCustomPlusBadgeView.clickActions;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            divCustomPlusBadgeView.handleAction((String) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private final void handleAction(String action) {
        mpk divFeatureDependencies;
        Fragment u = com.ybsdk.core.utils.ext.view.b.u(this, true);
        if (u != null) {
            ?? r0 = u;
            while (true) {
                if (r0 == 0) {
                    xx60 activity = u.getActivity();
                    if (!(activity instanceof nkp)) {
                        activity = null;
                    }
                    nkp nkpVar = (nkp) activity;
                    r0 = nkpVar == null ? 0 : nkpVar;
                } else if (r0 instanceof nkp) {
                    break;
                } else {
                    r0 = r0.getParentFragment();
                }
            }
            nkp nkpVar2 = (nkp) r0;
            if (nkpVar2 == null || (divFeatureDependencies = nkpVar2.getDivFeatureDependencies()) == null) {
                return;
            }
            h791.d((j3h) ((h9g) divFeatureDependencies).E.get(), Uri.parse(action), 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Fragment u;
        mpk divFeatureDependencies;
        super.onAttachedToWindow();
        if (getChildCount() <= 0 && (u = com.ybsdk.core.utils.ext.view.b.u(this, true)) != null) {
            ?? r1 = u;
            while (true) {
                if (r1 == 0) {
                    xx60 activity = u.getActivity();
                    if (!(activity instanceof nkp)) {
                        activity = null;
                    }
                    nkp nkpVar = (nkp) activity;
                    r1 = nkpVar == null ? 0 : nkpVar;
                } else if (r1 instanceof nkp) {
                    break;
                } else {
                    r1 = r1.getParentFragment();
                }
            }
            nkp nkpVar2 = (nkp) r1;
            if (nkpVar2 == null || (divFeatureDependencies = nkpVar2.getDivFeatureDependencies()) == null) {
                return;
            }
            tje.N(((nbp0) ((h9g) divFeatureDependencies).v.u.get()).a, null, null, new DivCustomPlusBadgeView$onAttachedToWindow$1$1(this, divFeatureDependencies, null), 3);
        }
    }

    public final void setClickActions(List<String> actions) {
        this.clickActions = actions;
    }

    public DivCustomPlusBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivCustomPlusBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DivCustomPlusBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
