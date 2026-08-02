package sg.bigo.ads.y;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import sg.bigo.ads.an.p;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.adview.h;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes9.dex */
public final class a {
    public static final int a = 1662622472;
    private static int b = 5;

    /* renamed from: sg.bigo.ads.y.a$a, reason: collision with other inner class name */
    public interface InterfaceC2508a {
        boolean a();
    }

    @NonNull
    public static List<View> b(@Nullable List<View> list) {
        int intValue;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (View view : list) {
                if (view != null) {
                    Object tag = view.getTag();
                    if ((tag instanceof Integer) && ((intValue = ((Integer) tag).intValue()) == 7 || intValue == 2 || intValue == 6 || intValue == 10 || intValue == 26 || intValue == 8 || intValue == 5 || intValue == 9)) {
                        arrayList.add(view);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void b(final View view, final View view2, final int i, final h hVar, @Nullable final InterfaceC2508a interfaceC2508a) {
        final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        final int[] iArr = {0, 0};
        final boolean[] zArr = {true};
        a(view, view2, new View.OnTouchListener() { // from class: sg.bigo.ads.y.a.4
            /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
            
                if (r13 != false) goto L28;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                boolean z;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    int[] iArr2 = iArr;
                    iArr2[0] = x;
                    iArr2[1] = y;
                    zArr[0] = true;
                    if (view3 instanceof MediaView) {
                        ((MediaView) view3).a(x, y);
                        int unused = a.b = ((Integer) view3.getTag()).intValue();
                    }
                } else if (actionMasked == 2) {
                    if (!a.a(view2, x, y, scaledTouchSlop)) {
                        zArr[0] = false;
                    }
                } else if (actionMasked == 1) {
                    if (zArr[0]) {
                        if (Math.abs(x - iArr[0]) >= scaledTouchSlop || Math.abs(y - iArr[1]) >= scaledTouchSlop) {
                            InterfaceC2508a interfaceC2508a2 = interfaceC2508a;
                            z = interfaceC2508a2 != null && interfaceC2508a2.a();
                        } else {
                            z = false;
                        }
                        if (a.a(view3, x, y)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.b));
                        }
                        Object tag = (!z || interfaceC2508a == null) ? view2.getTag() : 30;
                        Objects.toString(tag);
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr3 = iArr;
                        a.b(view4, view3, view5, x, y, iArr3[0], iArr3[1], i, hVar, tag);
                    }
                } else if (actionMasked == 3) {
                    zArr[0] = false;
                }
                return true;
            }
        });
    }

    public static List<sg.bigo.ads.cv.a> a(List<b.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b.c cVar : list) {
                if (cVar != null) {
                    sg.bigo.ads.cv.a aVar = new sg.bigo.ads.cv.a();
                    aVar.b = cVar.b();
                    aVar.a = cVar.a();
                    aVar.c = cVar.c();
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r10 instanceof java.lang.Integer) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(View view, View view2, View view3, int i, int i2, int i3, int i4, int i5, h hVar, Object obj) {
        while ((view2.getParent() instanceof ViewGroup) && view2 != view && !(view2 instanceof NativeAdView)) {
            i += view2.getLeft();
            i3 += view2.getLeft();
            i2 += view2.getTop();
            i4 += view2.getTop();
            view2 = (View) view2.getParent();
        }
        obj = view3.getTag();
        hVar.a(i, i2, i3, i4, i5, obj instanceof Integer ? ((Integer) obj).intValue() : 0);
    }

    @NonNull
    public static p a(b bVar) {
        n bd = ((sg.bigo.ads.cp.a) bVar.f()).bd();
        if (bd != null) {
            p pVar = new p(bd.a, bd.b);
            if (pVar.a()) {
                return pVar;
            }
        }
        if (bVar instanceof c) {
            sg.bigo.ads.dh.p pVar2 = ((c) bVar).J;
            if (pVar2 != null) {
                p pVar3 = new p(pVar2.x, pVar2.w);
                if (pVar3.a()) {
                    return pVar3;
                }
            }
        } else {
            o.a[] aF = ((sg.bigo.ads.cp.a) bVar.f()).aF();
            if (!l.a(aF)) {
                return new p(aF[0].a(), aF[0].b());
            }
        }
        return new p(-1, -1);
    }

    @Nullable
    public static b a(@NonNull g gVar) {
        int a2;
        int Q = gVar.a.Q();
        int x = gVar.a.x();
        int y = gVar.a.y();
        sg.bigo.ads.ai.o e = gVar.a.e();
        if (e != null && 2 == Q) {
            boolean z = y == 3 || y == 4;
            boolean z2 = x == 1 || x == 2;
            if (z && z2 && (3 == (a2 = e.a("multi_ads.multi_ads_type")) || 2 == a2)) {
                return new sg.bigo.ads.aa.b(gVar, a2);
            }
        }
        if (y != 1) {
            if (y == 2) {
                if (x == 1) {
                    return new sg.bigo.ads.z.a(gVar);
                }
                if (x == 2) {
                    return new sg.bigo.ads.z.b(gVar);
                }
                return null;
            }
            if (y != 3 && y != 4 && y != 12 && y != 20) {
                switch (y) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        if (x == 5) {
                            return new sg.bigo.ads.z.c(gVar);
                        }
                        return null;
                    default:
                        if (x == 1) {
                            return new b(gVar);
                        }
                        if (x == 2) {
                            return new c(gVar);
                        }
                        if (x != 5) {
                            return null;
                        }
                        return new sg.bigo.ads.z.c(gVar);
                }
            }
        }
        if (x == 1) {
            return new sg.bigo.ads.z.d(gVar);
        }
        if (x == 2) {
            return new sg.bigo.ads.z.e(gVar);
        }
        return null;
    }

    public static void a(@NonNull final View view, @NonNull final View view2, final int i, @Nullable final h hVar, int i2) {
        if (hVar == null) {
            view2.setOnTouchListener(null);
            return;
        }
        if (i2 == 2) {
            final int[] iArr = {0, 0};
            a(view, view2, new View.OnTouchListener() { // from class: sg.bigo.ads.y.a.3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        if (view3 instanceof MediaView) {
                            ((MediaView) view3).a(x, y);
                            int unused = a.b = ((Integer) view3.getTag()).intValue();
                        }
                        int[] iArr2 = iArr;
                        iArr2[0] = x;
                        iArr2[1] = y;
                    }
                    if (actionMasked == 1) {
                        if (a.a(view3, x, y)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.b));
                        }
                        Objects.toString(view2.getTag());
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr3 = iArr;
                        a.b(view4, view3, view5, x, y, iArr3[0], iArr3[1], i, hVar, null);
                    }
                    return true;
                }
            });
        } else if (i2 == 3) {
            b(view, view2, i, hVar, null);
        } else {
            final int[] iArr2 = {0, 0};
            a(view, view2, new View.OnTouchListener() { // from class: sg.bigo.ads.y.a.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        if (view3 instanceof MediaView) {
                            ((MediaView) view3).a(x, y);
                            int unused = a.b = ((Integer) view3.getTag()).intValue();
                        }
                        int[] iArr3 = iArr2;
                        iArr3[0] = x;
                        iArr3[1] = y;
                    }
                    if (actionMasked == 1) {
                        if (view3 instanceof sg.bigo.ads.api.a) {
                            if (!((sg.bigo.ads.api.a) view3).a(x, y)) {
                                return false;
                            }
                        } else if (view3 == view || view3.getTag() == 1) {
                            if (!v.a(view3, x, y)) {
                                return false;
                            }
                        } else if ("internal_ad_component_view".equals(view3.getTag(a.a)) && !v.a(view3, x, y)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.b));
                        }
                        Objects.toString(view2.getTag());
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr4 = iArr2;
                        a.b(view4, view3, view5, x, y, iArr4[0], iArr4[1], i, hVar, null);
                    }
                    return true;
                }
            });
        }
    }

    public static void a(@NonNull View view, @NonNull View view2, int i, @Nullable h hVar, InterfaceC2508a interfaceC2508a) {
        b(view, view2, i, hVar, interfaceC2508a);
    }

    private static void a(final View view, final View view2, final View.OnTouchListener onTouchListener) {
        view2.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.y.a.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (motionEvent.getActionMasked() == 0 && view != null) {
                    Object parent = view2.getParent();
                    if ((parent instanceof View) && v.b(((View) parent).findViewWithTag(4), rawX, rawY)) {
                        return false;
                    }
                }
                return onTouchListener.onTouch(view3, motionEvent);
            }
        });
    }

    public static void a(View view, Object obj) {
        if (view != null) {
            view.setTag(obj);
            view.setTag(a, "internal_ad_component_view");
        }
    }

    public static /* synthetic */ boolean a(View view, int i, int i2) {
        return view instanceof MediaView ? !((MediaView) view).a(i, i2) : !v.a(view, i, i2);
    }

    public static /* synthetic */ boolean a(View view, int i, int i2, int i3) {
        int i4 = -i3;
        return i >= i4 && i2 >= i4 && i < (view.getRight() - view.getLeft()) + i3 && i2 < (view.getBottom() - view.getTop()) + i3;
    }
}
