package xsna;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.design.inspector.DesignInspectorComponent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import dalvik.system.BaseDexClassLoader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.b5x;
import xsna.c63;
import xsna.e5x;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class q5x implements e5x {
    public boolean a;
    public boolean b;
    public boolean c = true;
    public atm0 d = (atm0) j5g.X(btm0.d);
    public final List<? extends c6x> e = e43.l(l5j0.a, pax.a);
    public final zar f = new zar();
    public boolean g;

    /* compiled from: InspectorImpl.kt */
    public static final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            FragmentManager supportFragmentManager;
            c63 c63Var = c63.a;
            c63.c(this);
            b bVar = q5x.this.new b(activity);
            if (j5x.y) {
                return;
            }
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
                return;
            }
            j5x j5xVar = new j5x(bVar);
            j5xVar.u = false;
            j5xVar.v = true;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.r = true;
            aVar.f(0, j5xVar, "InspectorDialogFragment", 1);
            aVar.l();
        }
    }

    /* compiled from: InspectorImpl.kt */
    public static final class b implements izs<Context, View> {
        public final /* synthetic */ Activity c;

        public b(Activity activity) {
            this.c = activity;
        }

        @Override // xsna.izs
        public final View invoke(Context context) {
            h5x h5xVar = new h5x(context);
            h5xVar.setAllStyles(btm0.d);
            q5x q5xVar = q5x.this;
            h5xVar.setInspectorEnabled(q5xVar.a);
            h5xVar.setAreViewsClickable(q5xVar.b);
            h5xVar.setFABVisible(q5xVar.c);
            h5xVar.setCurrentStyleConfig(q5xVar.d);
            Activity activity = this.c;
            h5xVar.setOnChangeHighlight(new r5x(q5xVar, activity));
            h5xVar.setOnChangeViewsAreClickable(new s5x(q5xVar));
            h5xVar.setOnChangeFABVisible(new v5x(q5xVar));
            h5xVar.setOnChangeStyleConfig(new w5x(q5xVar, activity));
            h5xVar.setOnLogStart(new x5x(q5xVar, activity));
            h5xVar.setOnLogDump(new y5x(q5xVar, activity));
            return h5xVar;
        }
    }

    public static final void a(q5x q5xVar, Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        viewGroup.invalidate();
        viewGroup.setVisibility(8);
        new Handler(Looper.getMainLooper()).post(new b3m(viewGroup, 3));
    }

    public static b5x.c e(View view, b5x.c cVar, AttributeSet attributeSet, TypedArray typedArray) {
        int i = 0;
        int resourceId = typedArray.getResourceId(0, -1);
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(resourceId, new int[]{R.attr.textColor});
            try {
                int color = obtainStyledAttributes.getColor(0, -1);
                if (color != -1) {
                    cVar = cVar.b(new jco0(null, null, Integer.valueOf(color), 3));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "textColor");
        if (attributeValue != null && brm0.B(attributeValue, "?", false)) {
            i = Integer.parseInt(brm0.y(attributeValue, "?", ""));
        }
        if (i > 0) {
            return cVar.b(new jco0(Integer.valueOf(i), null, null, 6));
        }
        int resourceId2 = typedArray.getResourceId(1, -1);
        if (resourceId2 != -1) {
            return cVar.b(new jco0(null, Integer.valueOf(resourceId2), null, 5));
        }
        int color2 = typedArray.getColor(1, -1);
        return color2 != -1 ? cVar.b(new jco0(null, null, Integer.valueOf(color2), 3)) : cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        if (r7.equals("androidx.appcompat.widget.LinearLayoutCompat") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = new xsna.x4x(r8, r9, 0);
        r8 = ((com.vk.design.inspector.DesignInspectorComponent) ((xsna.k7m) xsna.m7m.f(r3)).a(xsna.fpf0.a(com.vk.design.inspector.DesignInspectorComponent.class))).n();
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r8 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        ((xsna.q5x) r8).h(r7, "LinearLayout", null, r9);
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r7.equals("androidx.appcompat.widget.AppCompatButton") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r7.equals("LinearLayout") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r7.equals("ImageView") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        r7 = new xsna.w4x(r8, r9, 0);
        r8 = ((com.vk.design.inspector.DesignInspectorComponent) ((xsna.k7m) xsna.m7m.f(r3)).a(xsna.fpf0.a(com.vk.design.inspector.DesignInspectorComponent.class))).n();
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r8 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        ((xsna.q5x) r8).h(r7, "AppCompatImageView", null, r9);
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r7.equals("androidx.appcompat.widget.AppCompatImageView") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if (r7.equals("androidx.appcompat.widget.AppCompatTextView") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011f, code lost:
    
        r7 = new xsna.z4x(r8, r9, 0);
        r8 = ((com.vk.design.inspector.DesignInspectorComponent) ((xsna.k7m) xsna.m7m.f(r3)).a(xsna.fpf0.a(com.vk.design.inspector.DesignInspectorComponent.class))).n();
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0138, code lost:
    
        if (r8 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013a, code lost:
    
        ((xsna.q5x) r8).h(r7, "AppCompatTextView", null, r9);
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011c, code lost:
    
        if (r7.equals("TextView") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r7.equals("Button") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r7 = new xsna.t4x(r8, r9, 0);
        r8 = ((com.vk.design.inspector.DesignInspectorComponent) ((xsna.k7m) xsna.m7m.f(r3)).a(xsna.fpf0.a(com.vk.design.inspector.DesignInspectorComponent.class))).n();
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r8 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        ((xsna.q5x) r8).h(r7, "AppCompatButton", null, r9);
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.widget.CompoundButton, xsna.b5x] */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.appcompat.widget.AppCompatImageView, xsna.b5x] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.widget.LinearLayout, xsna.b5x] */
    /* JADX WARN: Type inference failed for: r7v19, types: [androidx.appcompat.widget.AppCompatButton, xsna.b5x] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.widget.RelativeLayout, xsna.b5x] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.appcompat.widget.AppCompatTextView, xsna.b5x] */
    /* JADX WARN: Type inference failed for: r8v12, types: [xsna.q5x] */
    /* JADX WARN: Type inference failed for: r8v18, types: [xsna.q5x] */
    /* JADX WARN: Type inference failed for: r8v24, types: [xsna.q5x] */
    /* JADX WARN: Type inference failed for: r8v30, types: [xsna.q5x] */
    /* JADX WARN: Type inference failed for: r8v36, types: [xsna.q5x] */
    /* JADX WARN: Type inference failed for: r8v43, types: [xsna.q5x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View b(String str, Context context, AttributeSet attributeSet, Integer num) {
        v4x v4xVar;
        int hashCode = str.hashCode();
        e5x.a.C2780a c2780a = e5x.a.b;
        switch (hashCode) {
            case -979739473:
                if (str.equals("androidx.constraintlayout.widget.ConstraintLayout")) {
                    v4x v4xVar2 = new v4x(context, attributeSet, 0);
                    e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(c2780a)).a(fpf0.a(DesignInspectorComponent.class))).n();
                    v4xVar = v4xVar2;
                    if (n != null) {
                        ((q5x) n).h(v4xVar2, "ConstraintLayout", null, attributeSet);
                        v4xVar = v4xVar2;
                        break;
                    }
                }
                v4xVar = null;
                break;
            case -938935918:
                break;
            case -443652810:
                if (str.equals("RelativeLayout")) {
                    ?? y4xVar = new y4x(context, attributeSet, 0);
                    e5x n2 = ((DesignInspectorComponent) ((k7m) m7m.f(c2780a)).a(fpf0.a(DesignInspectorComponent.class))).n();
                    v4xVar = y4xVar;
                    if (n2 != null) {
                        ((q5x) n2).h(y4xVar, "RelativeLayout", null, attributeSet);
                        v4xVar = y4xVar;
                        break;
                    }
                }
                v4xVar = null;
                break;
            case -136626917:
                break;
            case 174955400:
                if (str.equals("android.widget.CompoundButton")) {
                    ?? u4xVar = new u4x(context, attributeSet, 0);
                    e5x n3 = ((DesignInspectorComponent) ((k7m) m7m.f(c2780a)).a(fpf0.a(DesignInspectorComponent.class))).n();
                    v4xVar = u4xVar;
                    if (n3 != null) {
                        ((q5x) n3).h(u4xVar, "CompoundButton", null, attributeSet);
                        v4xVar = u4xVar;
                        break;
                    }
                }
                v4xVar = null;
                break;
            case 227639319:
                break;
            case 1125864064:
                break;
            case 1127291599:
                break;
            case 1152820507:
                break;
            case 1736760907:
                break;
            case 2001146706:
                break;
            default:
                v4xVar = null;
                break;
        }
        if (v4xVar == null) {
            return null;
        }
        b5x.c designInspectorParams = v4xVar.getDesignInspectorParams();
        v4xVar.setDesignInspectorParams(designInspectorParams != null ? b5x.c.a(designInspectorParams, num, null, 1015) : null);
        return v4xVar;
    }

    public final boolean c(b5x b5xVar, MotionEvent motionEvent) {
        if (this.a && this.b && motionEvent != null && this.d.a.a.d(b5xVar)) {
            return i(b5xVar, motionEvent);
        }
        return false;
    }

    public final void d(Application application) {
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            ((c6x) it.next()).a(new p3h(this, 28));
        }
        int i = ank0.b;
        ClassLoader classLoader = application.getClassLoader();
        try {
            ank0 ank0Var = new ank0(classLoader.getParent(), this);
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            declaredField.set(ank0Var, declaredField.get(classLoader));
            Field declaredField2 = ClassLoader.class.getDeclaredField("parent");
            declaredField2.setAccessible(true);
            declaredField2.set(classLoader, ank0Var);
        } catch (Throwable th) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"LoggerClassLoaderHook", mnh0.A(th)});
            }
        }
        new Handler(Looper.getMainLooper()).post(new nu4(this, 5));
    }

    public final void f(int i, Context context) {
        zar zarVar = this.f;
        if (zarVar.a) {
            String resourceName = context.getResources().getResourceName(i);
            if (zarVar.b.add(resourceName)) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.d, new Object[]{"FileUsageCollector", go9.b("layout: ", resourceName)});
            }
        }
    }

    public final void g(b5x b5xVar, Canvas canvas) {
        if (this.a) {
            this.d.a.a.c(b5xVar, canvas);
        }
    }

    public final void h(b5x b5xVar, String str, String str2, AttributeSet attributeSet) {
        ArrayList arrayList;
        b5x b5xVar2;
        zar zarVar = this.f;
        if (zarVar.a && zarVar.c.add(brm0.y(str, DomExceptionUtils.SEPARATOR, "."))) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"FileUsageCollector", "view: ".concat(str)});
            }
        }
        try {
            Annotation[] annotations = Class.forName(brm0.y(str, DomExceptionUtils.SEPARATOR, ".")).getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            int length = annotations.length;
            int i = 0;
            while (true) {
                String str3 = DeviceInfo.STR_TYPE_UNKNOWN;
                if (i >= length) {
                    break;
                }
                String l2 = fpf0.a(annotations[i].annotationType()).l();
                if (l2 != null) {
                    str3 = l2;
                }
                arrayList2.add(str3);
                i++;
            }
            Annotation[] annotations2 = b5xVar.getClass().getAnnotations();
            ArrayList arrayList3 = new ArrayList(annotations2.length);
            for (Annotation annotation : annotations2) {
                String l3 = fpf0.a(annotation.annotationType()).l();
                if (l3 == null) {
                    l3 = DeviceInfo.STR_TYPE_UNKNOWN;
                }
                arrayList3.add(l3);
            }
            arrayList = j5g.u0(arrayList3, arrayList2);
        } catch (Throwable unused) {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        b5x.c designInspectorParams = b5xVar.getDesignInspectorParams();
        if (designInspectorParams == null) {
            b5xVar2 = b5xVar;
            b5x.c cVar = new b5x.c(str, b5xVar.getClass().getSimpleName(), str2, b5xVar2, arrayList4, 412);
            b5xVar2.setDesignInspectorParams(cVar);
            designInspectorParams = cVar;
        } else {
            b5xVar2 = b5xVar;
        }
        if (attributeSet == null) {
            return;
        }
        View view = (View) b5xVar2;
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance, R.attr.textColor});
        try {
            b5xVar2.setDesignInspectorParams(e((View) b5xVar2, designInspectorParams, attributeSet, obtainStyledAttributes));
            obtainStyledAttributes.recycle();
            if ((b5xVar2 instanceof ViewGroup) && view.getBackground() == null) {
                view.setBackgroundColor(0);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean i(b5x b5xVar, MotionEvent motionEvent) {
        FragmentManager supportFragmentManager;
        if (!this.a || !this.b || motionEvent == null || !this.d.a.a.d(b5xVar)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g = true;
            return true;
        }
        if (action != 1) {
            if (action == 3) {
                this.g = false;
                return true;
            }
        } else if (this.g) {
            b5x.c designInspectorParams = b5xVar.getDesignInspectorParams();
            c63 c63Var = c63.a;
            Activity b2 = c63.b();
            if (b2 != null) {
                n5x n5xVar = new n5x(b2, designInspectorParams, this);
                if (!j5x.y) {
                    AppCompatActivity appCompatActivity = b2 instanceof AppCompatActivity ? (AppCompatActivity) b2 : null;
                    if (appCompatActivity != null && (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) != null) {
                        j5x j5xVar = new j5x(n5xVar);
                        j5xVar.u = false;
                        j5xVar.v = true;
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                        aVar.r = true;
                        aVar.f(0, j5xVar, "InspectorDialogFragment", 1);
                        aVar.l();
                    }
                }
            } else {
                c63.a(new m5x(designInspectorParams, this));
            }
            this.g = false;
        }
        return true;
    }

    public final void j(b5x b5xVar, int i) {
        b5x.c designInspectorParams = b5xVar.getDesignInspectorParams();
        b5xVar.setDesignInspectorParams(designInspectorParams != null ? designInspectorParams.b(new bw5(null, null, Integer.valueOf(i))) : null);
    }

    public final void k(b5x b5xVar, int i) {
        b5x.c designInspectorParams = b5xVar.getDesignInspectorParams();
        b5xVar.setDesignInspectorParams(designInspectorParams != null ? designInspectorParams.b(new jco0(null, null, Integer.valueOf(i), 3)) : null);
    }

    public final void l() {
        FragmentManager supportFragmentManager;
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        if (b2 == null) {
            c63.a(new a());
            return;
        }
        b bVar = new b(b2);
        if (j5x.y) {
            return;
        }
        AppCompatActivity appCompatActivity = b2 instanceof AppCompatActivity ? (AppCompatActivity) b2 : null;
        if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
            return;
        }
        j5x j5xVar = new j5x(bVar);
        j5xVar.u = false;
        j5xVar.v = true;
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.r = true;
        aVar.f(0, j5xVar, "InspectorDialogFragment", 1);
        aVar.l();
    }
}
