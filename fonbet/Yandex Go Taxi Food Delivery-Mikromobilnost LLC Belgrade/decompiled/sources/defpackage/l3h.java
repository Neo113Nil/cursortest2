package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.ybsdk.core.analytics.generated.delegates.DeeplinkEvents$DeeplinkOpenHandler;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigationAnimation;
import com.ybsdk.screens.initial.deeplink.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class l3h implements j3h {
    public final tfl0 a;
    public final zgf b;
    public final h3y c;
    public final a3h d;
    public final xjg e;
    public final wwf f;
    public final r0h g;

    public l3h(tfl0 tfl0Var, zgf zgfVar, h3y h3yVar, a3h a3hVar, xjg xjgVar, wwf wwfVar, r0h r0hVar) {
        this.a = tfl0Var;
        this.b = zgfVar;
        this.c = h3yVar;
        this.d = a3hVar;
        this.e = xjgVar;
        this.f = wwfVar;
        this.g = r0hVar;
    }

    public final y0h a(Deeplink deeplink, boolean z) {
        y0h a;
        DeeplinkEvents$DeeplinkOpenHandler deeplinkEvents$DeeplinkOpenHandler;
        wwf wwfVar = this.f;
        Deeplink j = wwfVar.j(deeplink);
        Deeplink fallback = deeplink.getFallback();
        Deeplink j2 = fallback != null ? wwfVar.j(fallback) : null;
        Iterator it = ((Iterable) this.c.get()).iterator();
        do {
            boolean hasNext = it.hasNext();
            x0h x0hVar = x0h.a;
            if (!hasNext) {
                if (j2 != null) {
                    y0h a2 = a(j2, false);
                    if ((a2 instanceof v0h) || (a2 instanceof w0h)) {
                        return a2;
                    }
                }
                if (z) {
                    trp0 trp0Var = trp0.a;
                    String uri = j.getParsedUri().toString();
                    Uri parsedUri = j.getParsedUri();
                    ((a) this.d).getClass();
                    trp0.e(new hqp0(uri, new IllegalArgumentException("Parsing deeplink or fallback is not possible"), "Unable to resolve deeplink", e6b1.e(parsedUri).name()));
                }
                return x0hVar;
            }
            a = ((k3h) it.next()).a(j.getAction());
            boolean z2 = a instanceof v0h;
            if (z2) {
                deeplinkEvents$DeeplinkOpenHandler = DeeplinkEvents$DeeplinkOpenHandler.APP;
            } else if (a instanceof w0h) {
                deeplinkEvents$DeeplinkOpenHandler = DeeplinkEvents$DeeplinkOpenHandler.HOST;
            } else {
                if (!jl40.l(a, x0hVar)) {
                    w511.b();
                    return null;
                }
                deeplinkEvents$DeeplinkOpenHandler = null;
            }
            if (z2) {
                break;
            }
        } while (!(a instanceof w0h));
        this.e.j(j, deeplinkEvents$DeeplinkOpenHandler);
        return a;
    }

    public final List b(Deeplink deeplink) {
        y0h a = a(deeplink, true);
        if (a instanceof v0h) {
            return ((v0h) a).a;
        }
        if (!jl40.l(a, w0h.a) && !jl40.l(a, x0h.a)) {
            w511.b();
        }
        return null;
    }

    public final List c(String str) {
        Deeplink e = w691.e(this.d, Uri.parse(str), true, null, false, 12);
        if (e == null) {
            return null;
        }
        return b(e);
    }

    public final y0h d(Deeplink deeplink) {
        TransitionPolicyType transitionPolicyType;
        if (deeplink == null) {
            return x0h.a;
        }
        y0h a = a(deeplink, true);
        if (a instanceof v0h) {
            List list = ((v0h) a).a;
            if (!list.isEmpty()) {
                if (deeplink.getRenewSession()) {
                    this.g.a.b = null;
                }
                DeeplinkNavigationAnimation navigationAnimation = deeplink.getNavigationAnimation();
                if (jl40.l(navigationAnimation, DeeplinkNavigationAnimation.Default.INSTANCE)) {
                    transitionPolicyType = TransitionPolicyType.DEFAULT;
                } else if (jl40.l(navigationAnimation, DeeplinkNavigationAnimation.None.INSTANCE)) {
                    transitionPolicyType = TransitionPolicyType.NONE;
                } else if (jl40.l(navigationAnimation, DeeplinkNavigationAnimation.PopUp.INSTANCE)) {
                    transitionPolicyType = TransitionPolicyType.POPUP;
                } else if (jl40.l(navigationAnimation, DeeplinkNavigationAnimation.BottomUp.INSTANCE)) {
                    transitionPolicyType = TransitionPolicyType.BOTTOM_UP;
                } else {
                    if (navigationAnimation != null) {
                        w511.b();
                        return null;
                    }
                    transitionPolicyType = null;
                }
                if (transitionPolicyType != null || deeplink.getPinRequired()) {
                    List<Parcelable> list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    for (Parcelable parcelable : list2) {
                        if (parcelable instanceof FragmentScreen) {
                            FragmentScreen fragmentScreen = (FragmentScreen) parcelable;
                            parcelable = FragmentScreen.copy$default(fragmentScreen, null, false, null, transitionPolicyType == null ? fragmentScreen.getTransitionPolicy() : transitionPolicyType, null, deeplink.getPinRequired() ? OpenScreenRequirement.WithBuid.INSTANCE : fragmentScreen.getRequirements(), 23, null);
                        }
                        arrayList.add(parcelable);
                    }
                    list = arrayList;
                }
                DeeplinkNavigation navigation = deeplink.getNavigation();
                boolean l = jl40.l(navigation, DeeplinkNavigation.Replace.INSTANCE);
                tfl0 tfl0Var = this.a;
                if (l) {
                    tfl0Var.m(list);
                    return a;
                }
                if (jl40.l(navigation, DeeplinkNavigation.ReplaceRoot.INSTANCE)) {
                    tfl0Var.i(list);
                    return a;
                }
                if (!jl40.l(navigation, DeeplinkNavigation.Add.INSTANCE)) {
                    if (jl40.l(navigation, DeeplinkNavigation.PopBackTo.INSTANCE)) {
                        tfl0.b(tfl0Var, (Screen) kotlin.collections.a.Z(list), kotlin.collections.a.m0(list, e()), false, 4);
                        return a;
                    }
                    w511.b();
                    return null;
                }
                tfl0Var.getClass();
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new vjc((Screen) it.next()));
                }
                vjc[] vjcVarArr = (vjc[]) arrayList2.toArray(new vjc[0]);
                tfl0Var.a((dlc[]) Arrays.copyOf(vjcVarArr, vjcVarArr.length));
                return a;
            }
        }
        return a;
    }

    public final List e() {
        y0h a = a(((u470) this.b.b).a(), true);
        if (a instanceof v0h) {
            return ((v0h) a).a;
        }
        if (jl40.l(a, w0h.a) || jl40.l(a, x0h.a)) {
            return EmptyList.a;
        }
        w511.b();
        return null;
    }

    public final List f(Deeplink deeplink) {
        List e = e();
        y0h a = a(deeplink, true);
        if (!(a instanceof v0h)) {
            if (jl40.l(a, w0h.a) || jl40.l(a, x0h.a)) {
                return e;
            }
            w511.b();
            return null;
        }
        List list = ((v0h) a).a;
        Screen screen = (Screen) kotlin.collections.a.R(list);
        String screenKey = screen != null ? screen.getScreenKey() : null;
        Screen screen2 = (Screen) kotlin.collections.a.R(e);
        if (!jl40.l(screenKey, screen2 != null ? screen2.getScreenKey() : null) && !(deeplink.getNavigation() instanceof DeeplinkNavigation.ReplaceRoot)) {
            list = kotlin.collections.a.m0(list, e);
        }
        if (!deeplink.getPinRequired()) {
            return list;
        }
        List<Parcelable> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Parcelable parcelable : list2) {
            if (parcelable instanceof FragmentScreen) {
                parcelable = FragmentScreen.copy$default((FragmentScreen) parcelable, null, false, null, null, null, OpenScreenRequirement.WithBuid.INSTANCE, 31, null);
            }
            arrayList.add(parcelable);
        }
        return arrayList;
    }
}
