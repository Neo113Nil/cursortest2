package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.ac2;
import defpackage.ask0;
import defpackage.bsk0;
import defpackage.ohh0;
import defpackage.rzo;
import defpackage.scc;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001d¨\u0006&"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "Lzy11;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Lask0;", "Landroidx/compose/material/ripple/RippleHostView;", "getRippleHostView", "(Lask0;)Landroidx/compose/material/ripple/RippleHostView;", "disposeRippleIfNeeded", "(Lask0;)V", "MaxRippleHosts", CA20Status.STATUS_USER_I, "", "rippleHosts", "Ljava/util/List;", "unusedRippleHosts", "Lbsk0;", "rippleHostMap", "Lbsk0;", "nextHostIndex", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RippleContainer extends ViewGroup {
    public static final int $stable = 8;
    private final int MaxRippleHosts;
    private int nextHostIndex;
    private final bsk0 rippleHostMap;
    private final List<RippleHostView> rippleHosts;
    private final List<RippleHostView> unusedRippleHosts;

    public RippleContainer(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new bsk0();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(ohh0.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(ask0 ask0Var) {
        ac2 ac2Var = (ac2) ask0Var;
        ac2Var.E = null;
        rzo.D(ac2Var);
        RippleHostView rippleHostView = (RippleHostView) this.rippleHostMap.a.get(ask0Var);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            bsk0 bsk0Var = this.rippleHostMap;
            LinkedHashMap linkedHashMap = bsk0Var.a;
            RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(ask0Var);
            if (rippleHostView2 != null) {
            }
            linkedHashMap.remove(ask0Var);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }

    public final RippleHostView getRippleHostView(ask0 ask0Var) {
        RippleHostView rippleHostView = (RippleHostView) this.rippleHostMap.a.get(ask0Var);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        RippleHostView rippleHostView2 = (RippleHostView) ycc.y(this.unusedRippleHosts);
        if (rippleHostView2 == null) {
            if (this.nextHostIndex > scc.f(this.rippleHosts)) {
                rippleHostView2 = new RippleHostView(getContext());
                addView(rippleHostView2);
                this.rippleHosts.add(rippleHostView2);
            } else {
                rippleHostView2 = this.rippleHosts.get(this.nextHostIndex);
                ask0 ask0Var2 = (ask0) this.rippleHostMap.b.get(rippleHostView2);
                if (ask0Var2 != null) {
                    ac2 ac2Var = (ac2) ask0Var2;
                    ac2Var.E = null;
                    rzo.D(ac2Var);
                    bsk0 bsk0Var = this.rippleHostMap;
                    LinkedHashMap linkedHashMap = bsk0Var.a;
                    RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap.get(ask0Var2);
                    if (rippleHostView3 != null) {
                    }
                    linkedHashMap.remove(ask0Var2);
                    rippleHostView2.disposeRipple();
                }
            }
            int i = this.nextHostIndex;
            if (i < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        bsk0 bsk0Var2 = this.rippleHostMap;
        bsk0Var2.a.put(ask0Var, rippleHostView2);
        bsk0Var2.b.put(rippleHostView2, ask0Var);
        return rippleHostView2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
