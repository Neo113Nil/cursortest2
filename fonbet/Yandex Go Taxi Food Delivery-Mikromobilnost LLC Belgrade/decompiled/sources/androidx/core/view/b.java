package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.messaging.input.ChatInputEditText;
import defpackage.d6z;
import defpackage.h070;
import defpackage.i070;
import defpackage.j6h0;
import defpackage.lp31;
import defpackage.mge;
import defpackage.mh;
import defpackage.mp31;
import defpackage.n751;
import defpackage.np31;
import defpackage.o3b;
import defpackage.ph;
import defpackage.pi;
import defpackage.q651;
import defpackage.r651;
import defpackage.r751;
import defpackage.rp31;
import defpackage.s651;
import defpackage.sp31;
import defpackage.tp31;
import defpackage.u651;
import defpackage.vih0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b {
    public static WeakHashMap a;
    public static final int[] b = {vih0.accessibility_custom_action_0, vih0.accessibility_custom_action_1, vih0.accessibility_custom_action_2, vih0.accessibility_custom_action_3, vih0.accessibility_custom_action_4, vih0.accessibility_custom_action_5, vih0.accessibility_custom_action_6, vih0.accessibility_custom_action_7, vih0.accessibility_custom_action_8, vih0.accessibility_custom_action_9, vih0.accessibility_custom_action_10, vih0.accessibility_custom_action_11, vih0.accessibility_custom_action_12, vih0.accessibility_custom_action_13, vih0.accessibility_custom_action_14, vih0.accessibility_custom_action_15, vih0.accessibility_custom_action_16, vih0.accessibility_custom_action_17, vih0.accessibility_custom_action_18, vih0.accessibility_custom_action_19, vih0.accessibility_custom_action_20, vih0.accessibility_custom_action_21, vih0.accessibility_custom_action_22, vih0.accessibility_custom_action_23, vih0.accessibility_custom_action_24, vih0.accessibility_custom_action_25, vih0.accessibility_custom_action_26, vih0.accessibility_custom_action_27, vih0.accessibility_custom_action_28, vih0.accessibility_custom_action_29, vih0.accessibility_custom_action_30, vih0.accessibility_custom_action_31};
    public static final lp31 c = new lp31();
    public static final ViewCompat$AccessibilityPaneVisibilityManager d = new ViewCompat$AccessibilityPaneVisibilityManager();

    public static int a(View view, String str, pi piVar) {
        int i;
        ArrayList g = g(view);
        int i2 = 0;
        while (true) {
            if (i2 >= g.size()) {
                int i3 = -1;
                for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                    int i5 = b[i4];
                    boolean z = true;
                    for (int i6 = 0; i6 < g.size(); i6++) {
                        z &= ((ph) g.get(i6)).a() != i5;
                    }
                    if (z) {
                        i3 = i5;
                    }
                }
                i = i3;
            } else {
                if (TextUtils.equals(str, ((AccessibilityNodeInfo.AccessibilityAction) ((ph) g.get(i2)).a).getLabel())) {
                    i = ((ph) g.get(i2)).a();
                    break;
                }
                i2++;
            }
        }
        if (i != -1) {
            ph phVar = new ph(null, i, str, piVar, null);
            e(view);
            n(phVar.a(), view);
            g(view).add(phVar);
            j(0, view);
        }
        return i;
    }

    public static void b(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        ((View) view.getParent()).setTag(j6h0.view_tree_disjoint_parent, viewGroup);
    }

    public static d c(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        d dVar = (d) a.get(view);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(view);
        a.put(view, dVar2);
        return dVar2;
    }

    public static n751 d(View view, n751 n751Var) {
        WindowInsets g = n751Var.g();
        if (g != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? tp31.a(view, g) : np31.a(view, g);
            if (!a2.equals(g)) {
                return n751.h(view, a2);
            }
        }
        return n751Var;
    }

    public static void e(View view) {
        AccessibilityDelegateCompat f = f(view);
        if (f == null) {
            f = new AccessibilityDelegateCompat();
        }
        p(view, f);
    }

    public static AccessibilityDelegateCompat f(View view) {
        View.AccessibilityDelegate a2 = sp31.a(view);
        if (a2 == null) {
            return null;
        }
        return a2 instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) a2).mCompat : new AccessibilityDelegateCompat(a2);
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(vih0.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(vih0.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? a.a(appCompatEditText) : (String[]) appCompatEditText.getTag(vih0.tag_on_receive_content_mime_types);
    }

    public static r751 i(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return tp31.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new r751(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void j(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = rp31.a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(rp31.a(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(rp31.a(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static n751 k(View view, n751 n751Var) {
        WindowInsets g = n751Var.g();
        if (g != null) {
            WindowInsets b2 = np31.b(view, g);
            if (!b2.equals(g)) {
                return n751.h(view, b2);
            }
        }
        return n751Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mge l(View view, mge mgeVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(mgeVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return a.b(view, mgeVar);
        }
        h070 h070Var = (h070) view.getTag(vih0.tag_on_receive_content_listener);
        i070 i070Var = c;
        if (h070Var == null) {
            if (view instanceof i070) {
                i070Var = (i070) view;
            }
            return i070Var.onReceiveContent(mgeVar);
        }
        mge a2 = h070Var.a(view, mgeVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof i070) {
            i070Var = (i070) view;
        }
        return i070Var.onReceiveContent(a2);
    }

    public static void m(int i, View view) {
        n(i, view);
        j(0, view);
    }

    public static void n(int i, View view) {
        ArrayList g = g(view);
        for (int i2 = 0; i2 < g.size(); i2++) {
            if (((ph) g.get(i2)).a() == i) {
                g.remove(i2);
                return;
            }
        }
    }

    public static void o(View view, ph phVar, CharSequence charSequence, pi piVar) {
        if (piVar == null && charSequence == null) {
            m(phVar.a(), view);
            return;
        }
        ph phVar2 = new ph(null, phVar.b, charSequence, piVar, phVar.c);
        e(view);
        n(phVar2.a(), view);
        g(view).add(phVar2);
        j(0, view);
    }

    public static void p(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (sp31.a(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    public static void q(View view, boolean z) {
        new mp31(vih0.tag_accessibility_heading, Boolean.class, 0, 28, 3).e(view, Boolean.valueOf(z));
    }

    public static void r(View view, CharSequence charSequence) {
        new mp31(vih0.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).e(view, charSequence);
        ViewCompat$AccessibilityPaneVisibilityManager viewCompat$AccessibilityPaneVisibilityManager = d;
        if (charSequence != null) {
            viewCompat$AccessibilityPaneVisibilityManager.addAccessibilityPane(view);
        } else {
            viewCompat$AccessibilityPaneVisibilityManager.removeAccessibilityPane(view);
        }
    }

    public static void s(ChatInputEditText chatInputEditText, String[] strArr, o3b o3bVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            a.c(chatInputEditText, strArr, o3bVar);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        if (o3bVar != null) {
            d6z.m("When the listener is set, MIME types must also be set", strArr != null);
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z = true;
                    break;
                }
                i++;
            }
            d6z.m("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
        }
        chatInputEditText.setTag(vih0.tag_on_receive_content_mime_types, strArr);
        chatInputEditText.setTag(vih0.tag_on_receive_content_listener, o3bVar);
    }

    public static void t(View view, CharSequence charSequence) {
        new mp31(vih0.tag_state_description, CharSequence.class, 64, 30, 2).e(view, charSequence);
    }

    public static void u(View view, final e eVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(eVar != null ? new WindowInsetsAnimation$Callback(eVar) { // from class: androidx.core.view.WindowInsetsAnimationCompat$Impl30$ProxyCallback
                private final HashMap<WindowInsetsAnimation, u651> mAnimations;
                private final e mCompat;
                private List<u651> mRORunningAnimations;
                private ArrayList<u651> mTmpRunningAnimations;

                {
                    super(eVar.getDispatchMode());
                    this.mAnimations = new HashMap<>();
                    this.mCompat = eVar;
                }

                private u651 getWindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
                    u651 u651Var = this.mAnimations.get(windowInsetsAnimation);
                    if (u651Var == null) {
                        u651Var = new u651(0, null, 0L);
                        if (Build.VERSION.SDK_INT >= 30) {
                            u651Var.a = new s651(windowInsetsAnimation);
                        }
                        this.mAnimations.put(windowInsetsAnimation, u651Var);
                    }
                    return u651Var;
                }

                public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                    this.mCompat.onEnd(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                    this.mAnimations.remove(windowInsetsAnimation);
                }

                public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                    this.mCompat.onPrepare(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                }

                public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                    float fraction;
                    ArrayList<u651> arrayList = this.mTmpRunningAnimations;
                    if (arrayList == null) {
                        ArrayList<u651> arrayList2 = new ArrayList<>(list.size());
                        this.mTmpRunningAnimations = arrayList2;
                        this.mRORunningAnimations = Collections.unmodifiableList(arrayList2);
                    } else {
                        arrayList.clear();
                    }
                    for (int size = list.size() - 1; size >= 0; size--) {
                        WindowInsetsAnimation h = r651.h(list.get(size));
                        u651 windowInsetsAnimationCompat = getWindowInsetsAnimationCompat(h);
                        fraction = h.getFraction();
                        windowInsetsAnimationCompat.a.e(fraction);
                        this.mTmpRunningAnimations.add(windowInsetsAnimationCompat);
                    }
                    return this.mCompat.onProgress(n751.h(null, windowInsets), this.mRORunningAnimations).g();
                }

                public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                    q651 onStart = this.mCompat.onStart(getWindowInsetsAnimationCompat(windowInsetsAnimation), new q651(bounds));
                    onStart.getClass();
                    mh.s();
                    return r651.f(onStart.a.e(), onStart.b.e());
                }
            } : null);
        } else {
            f.l(view, eVar);
        }
    }
}
