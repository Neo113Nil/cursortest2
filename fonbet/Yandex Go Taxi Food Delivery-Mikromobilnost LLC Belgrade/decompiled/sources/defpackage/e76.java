package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSInvalidStateException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicColorMatrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class e76 implements dpk {
    public final Application a;
    public RenderScript b;
    public ScriptIntrinsicBlur c;
    public ScriptIntrinsicColorMatrix w;

    public e76(Application application) {
        this.a = application;
    }

    public static void a(ViewGroup viewGroup, ArrayList arrayList) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, arrayList);
            } else if (childAt instanceof oxy) {
                arrayList.add(childAt);
            }
        }
    }

    @Override // defpackage.dpk
    public final void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, c76] */
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, final View view, final egk egkVar) {
        if (this.b == null) {
            RenderScript create = RenderScript.create(this.a);
            this.b = create;
            this.c = ScriptIntrinsicBlur.create(create, Element.RGBA_8888(create));
            this.w = ScriptIntrinsicColorMatrix.create(this.b);
        }
        final ViewGroup viewGroup = (ViewGroup) view.getParent();
        final ArrayList arrayList = new ArrayList();
        a(viewGroup, arrayList);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        ref$ObjectRef3.element = new ViewTreeObserver.OnPreDrawListener() { // from class: c76
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r7v4, types: [T, d76] */
            /* JADX WARN: Type inference failed for: r7v5 */
            /* JADX WARN: Type inference failed for: r7v6 */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                bpk bpkVar;
                ?? r7;
                JSONObject jSONObject;
                Object obj;
                e76 e76Var = this;
                Application application = e76Var.a;
                ArrayList arrayList2 = arrayList;
                ?? arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Boolean.valueOf(((oxy) it.next()).isImageLoaded()));
                }
                Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                if (jl40.l(ref$ObjectRef4.element, arrayList3)) {
                    return true;
                }
                Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                d76 d76Var = (d76) ref$ObjectRef5.element;
                View view2 = view;
                ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                List extensions = egkVar.getExtensions();
                if (extensions != null) {
                    Iterator it2 = extensions.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (jl40.l(((bpk) obj).a, "blur")) {
                            break;
                        }
                    }
                    bpkVar = (bpk) obj;
                } else {
                    bpkVar = null;
                }
                String J = (bpkVar == null || (jSONObject = bpkVar.b) == null) ? null : cvw.J("style", jSONObject);
                Bitmap bitmap = d76Var != null ? d76Var.b : null;
                boolean z = (bitmap != null && view2.getWidth() == bitmap.getWidth() && view2.getHeight() == bitmap.getHeight()) ? false : true;
                if (d76Var == null || (z && view2.isLaidOut())) {
                    if (d76Var != null) {
                        d76Var.a.recycle();
                        d76Var.b.recycle();
                    }
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                    Bitmap createBitmap2 = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), config);
                    Canvas canvas = new Canvas();
                    d76 d76Var2 = new d76(createBitmap, createBitmap2, canvas);
                    canvas.setBitmap(createBitmap);
                    view2.setBackground(new BitmapDrawable(view2.getResources(), createBitmap2));
                    r7 = d76Var2;
                } else {
                    d76Var.a.eraseColor(0);
                    r7 = d76Var;
                }
                Canvas canvas2 = r7.c;
                int indexOfChild = viewGroup2.indexOfChild(view2);
                for (int i = 0; i < indexOfChild; i++) {
                    View childAt = viewGroup2.getChildAt(i);
                    if (childAt.isAttachedToWindow()) {
                        float left = childAt.getLeft() - view2.getLeft();
                        float top = childAt.getTop() - view2.getTop();
                        canvas2.translate(left, top);
                        childAt.draw(canvas2);
                        canvas2.translate(-left, -top);
                    }
                }
                Bitmap bitmap2 = r7.a;
                Bitmap bitmap3 = r7.b;
                try {
                    Allocation createFromBitmap = Allocation.createFromBitmap(e76Var.b, bitmap2);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(e76Var.b, bitmap3);
                    ScriptIntrinsicBlur scriptIntrinsicBlur = e76Var.c;
                    if (scriptIntrinsicBlur != null) {
                        scriptIntrinsicBlur.setRadius(25.0f);
                        scriptIntrinsicBlur.setInput(createFromBitmap);
                        scriptIntrinsicBlur.forEach(createFromBitmap2);
                    }
                    createFromBitmap2.copyTo(bitmap3);
                } catch (RSInvalidStateException unused) {
                    RenderScript create2 = RenderScript.create(application);
                    e76Var.b = create2;
                    e76Var.c = ScriptIntrinsicBlur.create(create2, Element.RGBA_8888(create2));
                    e76Var.w = ScriptIntrinsicColorMatrix.create(e76Var.b);
                    Allocation createFromBitmap3 = Allocation.createFromBitmap(e76Var.b, bitmap2);
                    Allocation createFromBitmap4 = Allocation.createFromBitmap(e76Var.b, bitmap3);
                    ScriptIntrinsicBlur scriptIntrinsicBlur2 = e76Var.c;
                    if (scriptIntrinsicBlur2 != null) {
                        scriptIntrinsicBlur2.setRadius(25.0f);
                        scriptIntrinsicBlur2.setInput(createFromBitmap3);
                        scriptIntrinsicBlur2.forEach(createFromBitmap4);
                    }
                    createFromBitmap4.copyTo(bitmap3);
                }
                if (jl40.l(J, "dark")) {
                    lu5 lu5Var = new lu5(9, e76Var, bitmap3);
                    try {
                        lu5Var.invoke();
                    } catch (RSInvalidStateException unused2) {
                        RenderScript create3 = RenderScript.create(application);
                        e76Var.b = create3;
                        e76Var.c = ScriptIntrinsicBlur.create(create3, Element.RGBA_8888(create3));
                        e76Var.w = ScriptIntrinsicColorMatrix.create(e76Var.b);
                        lu5Var.invoke();
                    }
                } else {
                    jl40.l(J, "light");
                }
                ref$ObjectRef5.element = r7;
                ref$ObjectRef4.element = arrayList3;
                if (!arrayList3.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        if (!((Boolean) it3.next()).booleanValue()) {
                            return true;
                        }
                    }
                }
                viewGroup.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) ref$ObjectRef3.element);
                return true;
            }
        };
        viewGroup.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) ref$ObjectRef3.element);
        view.setTag(och0.view_pre_draw_observer_tag, (ViewTreeObserver.OnPreDrawListener) ref$ObjectRef3.element);
    }

    @Override // defpackage.dpk
    public final void loadMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, "blur")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void preprocess(egk egkVar, rvo rvoVar) {
    }

    @Override // defpackage.dpk
    public final void releaseMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object tag = view.getTag(och0.view_pre_draw_observer_tag);
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = tag instanceof ViewTreeObserver.OnPreDrawListener ? (ViewTreeObserver.OnPreDrawListener) tag : null;
        if (onPreDrawListener == null) {
            return;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
    }
}
