package com.ybsdk.feature.educations.internal.ui;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.educations.api.domain.EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType;
import defpackage.gpn;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.li91;
import defpackage.lrp0;
import defpackage.lw00;
import defpackage.nah0;
import defpackage.tcc;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.wgr0;
import defpackage.x4c;
import defpackage.xgr0;
import defpackage.xrb1;
import defpackage.xvz;
import defpackage.ygr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u0000 T2\u00020\u0001:\u0004U<HVB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010\u0014J'\u0010'\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u00012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b,\u0010-J7\u00103\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0014¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\fH\u0014¢\u0006\u0004\b;\u0010\u0010J\u0017\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010C\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010D\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010O\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010PR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020<0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lcom/ybsdk/feature/educations/internal/ui/ShadowView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/feature/educations/internal/ui/a;", "glow", "Lzy11;", "prepareGlowPaint", "(Lcom/ybsdk/feature/educations/internal/ui/a;)V", "invalidateView", "()V", "reportIncorrectViewIds", "view", "collectTaggedViews", "(Landroid/view/View;)V", "Landroid/graphics/Canvas;", "canvas", "saveCount", "serverLogic", "(Landroid/graphics/Canvas;I)V", "serverLogicWithGlow", "clientLogic", "clientLogicWithGlow", "", "shouldSkipView", "(Landroid/view/View;)Z", "processAllViews", "(Landroid/view/View;Landroid/graphics/Canvas;)V", "calculateHighlightViewPath", "", "viewId", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "calculateHighlightPathByViewId", "(Landroid/view/View;Ljava/lang/String;Landroid/graphics/Path;)Z", "Llw00;", "margins", "Landroid/graphics/RectF;", "getViewRect", "(Landroid/view/View;Llw00;)Landroid/graphics/RectF;", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lcom/ybsdk/feature/educations/internal/ui/ShadowView$a;", ClidProvider.STATE, "render", "(Lcom/ybsdk/feature/educations/internal/ui/ShadowView$a;)V", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Lwgr0;", "getHighlightViewBounds", "(Ljava/lang/String;)Lwgr0;", "Landroid/graphics/Paint;", "shadowPaint", "Landroid/graphics/Paint;", "clearPaint", "glowPaint", "viewPath", "Landroid/graphics/Path;", "tempPath", "", "Lygr0;", "viewsList", "Ljava/util/List;", "", "shadowScreenPosArray", "[I", "highlightViewScreenPosArray", "viewScreenPosArray", "Lcom/ybsdk/feature/educations/internal/ui/ShadowView$a;", "", "boundsCache", "Ljava/util/Map;", "Companion", "a", "xgr0", "feature-educations_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShadowView extends View {

    @Deprecated
    public static final float BLUR_RADIUS_MULTIPLIER = 1.5f;
    private static final xgr0 Companion = new xgr0();
    private final Map<String, wgr0> boundsCache;
    private final Paint clearPaint;
    private final Paint glowPaint;
    private final int[] highlightViewScreenPosArray;
    private final Paint shadowPaint;
    private final int[] shadowScreenPosArray;
    private a state;
    private final Path tempPath;
    private final Path viewPath;
    private final int[] viewScreenPosArray;
    private final List<ygr0> viewsList;

    public ShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setColor(b.g(ung0.ybColor_textIcon_secondaryStatic, this));
        this.shadowPaint = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint2;
        this.glowPaint = new Paint();
        this.viewPath = new Path();
        this.tempPath = new Path();
        this.viewsList = new ArrayList();
        this.shadowScreenPosArray = new int[2];
        this.highlightViewScreenPosArray = new int[2];
        this.viewScreenPosArray = new int[2];
        this.state = new a(0);
        this.boundsCache = new LinkedHashMap();
    }

    private final boolean calculateHighlightPathByViewId(View view, String viewId, Path path) {
        if (shouldSkipView(view)) {
            return false;
        }
        boolean l = jl40.l(li91.d(view), viewId);
        Path path2 = this.tempPath;
        if (l) {
            path2.reset();
            path2.addRect(getViewRect$default(this, view, null, 2, null), Path.Direction.CW);
            path.op(this.tempPath, Path.Op.UNION);
            return true;
        }
        path2.reset();
        path2.addRect(getViewRect$default(this, view, null, 2, null), Path.Direction.CW);
        path.op(this.tempPath, Path.Op.DIFFERENCE);
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            z = calculateHighlightPathByViewId(viewGroup.getChildAt(i), viewId, path) || z;
        }
        return z;
    }

    private final void calculateHighlightViewPath(View view) {
        Object obj;
        if (shouldSkipView(view)) {
            return;
        }
        Iterator<T> it = this.viewsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ygr0 ygr0Var = (ygr0) obj;
            if (ygr0Var.a.equals(view) && ygr0Var.b == EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType.HIGHLIGHT) {
                break;
            }
        }
        ygr0 ygr0Var2 = (ygr0) obj;
        Path path = this.tempPath;
        if (ygr0Var2 != null) {
            path.reset();
            path.addRoundRect(ygr0Var2.c, ygr0Var2.d, Path.Direction.CW);
            this.viewPath.op(this.tempPath, Path.Op.UNION);
            return;
        }
        path.reset();
        path.addRoundRect(getViewRect$default(this, view, null, 2, null), xrb1.e(view), Path.Direction.CW);
        this.viewPath.op(this.tempPath, Path.Op.DIFFERENCE);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                calculateHighlightViewPath(viewGroup.getChildAt(i));
            }
        }
    }

    private final void clientLogic(Canvas canvas, int saveCount) {
        processAllViews(getRootView(), canvas);
        canvas.restoreToCount(saveCount);
    }

    private final void clientLogicWithGlow(Canvas canvas, int saveCount) {
        this.viewPath.reset();
        calculateHighlightViewPath(getRootView());
        canvas.drawPath(this.viewPath, this.glowPaint);
        canvas.drawPath(this.viewPath, this.clearPaint);
        canvas.restoreToCount(saveCount);
    }

    private final void collectTaggedViews(View view) {
        Object obj;
        if (view == this || view.getVisibility() != 0) {
            return;
        }
        if (view.getMeasuredWidth() > 0 || view.getMeasuredHeight() > 0) {
            String d = li91.d(view);
            if (d != null) {
                Iterator it = this.state.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((gpn) obj).a, d)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                gpn gpnVar = (gpn) obj;
                if (gpnVar != null) {
                    this.viewsList.add(new ygr0(view, gpnVar.b, getViewRect(view, gpnVar.d), gpnVar.c != null ? xrb1.d(r2.intValue()) : xrb1.e(view)));
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    collectTaggedViews(viewGroup.getChildAt(i));
                }
            }
        }
    }

    private final RectF getViewRect(View view, lw00 margins) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        view.getLocationOnScreen(this.highlightViewScreenPosArray);
        int measuredWidth = view.getMeasuredWidth() + this.highlightViewScreenPosArray[0];
        int measuredHeight = (view.getMeasuredHeight() + this.highlightViewScreenPosArray[1]) - this.shadowScreenPosArray[1];
        float f = 0.0f;
        float t = this.highlightViewScreenPosArray[0] - ((margins == null || (num4 = margins.a) == null) ? 0.0f : kp50.t(num4.intValue()));
        float t2 = (this.highlightViewScreenPosArray[1] - this.shadowScreenPosArray[1]) - ((margins == null || (num3 = margins.b) == null) ? 0.0f : kp50.t(num3.intValue()));
        float t3 = measuredWidth + ((margins == null || (num2 = margins.c) == null) ? 0.0f : kp50.t(num2.intValue()));
        float f2 = measuredHeight;
        if (margins != null && (num = margins.d) != null) {
            f = kp50.t(num.intValue());
        }
        return new RectF(t, t2, t3, f2 + f);
    }

    public static /* synthetic */ RectF getViewRect$default(ShadowView shadowView, View view, lw00 lw00Var, int i, Object obj) {
        if ((i & 2) != 0) {
            lw00Var = null;
        }
        return shadowView.getViewRect(view, lw00Var);
    }

    private final void invalidateView() {
        this.viewsList.clear();
        this.boundsCache.clear();
        if (!this.state.b.isEmpty()) {
            getLocationOnScreen(this.shadowScreenPosArray);
            collectTaggedViews(getRootView());
        }
        invalidate();
    }

    private final void prepareGlowPaint(com.ybsdk.feature.educations.internal.ui.a glow) {
        Paint paint = this.glowPaint;
        paint.setColor(glow.a.get(getContext()));
        paint.setMaskFilter(new BlurMaskFilter(glow.b * 1.5f, BlurMaskFilter.Blur.NORMAL));
    }

    private final void processAllViews(View view, Canvas canvas) {
        Object obj;
        if (shouldSkipView(view)) {
            return;
        }
        Iterator<T> it = this.viewsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ygr0 ygr0Var = (ygr0) obj;
            if (ygr0Var.a.equals(view) && ygr0Var.b == EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType.HIGHLIGHT) {
                break;
            }
        }
        ygr0 ygr0Var2 = (ygr0) obj;
        if (ygr0Var2 != null) {
            Path path = this.viewPath;
            path.reset();
            path.addRoundRect(ygr0Var2.c, ygr0Var2.d, Path.Direction.CW);
            canvas.drawPath(this.viewPath, this.clearPaint);
            return;
        }
        view.getLocationOnScreen(this.viewScreenPosArray);
        Path path2 = this.viewPath;
        path2.reset();
        path2.addRoundRect(getViewRect$default(this, view, null, 2, null), xrb1.e(view), Path.Direction.CW);
        canvas.drawPath(this.viewPath, this.clearPaint);
        canvas.drawPath(this.viewPath, this.shadowPaint);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                processAllViews(viewGroup.getChildAt(i), canvas);
            }
        }
    }

    private final void reportIncorrectViewIds() {
        List<ygr0> list = this.viewsList;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(li91.d(((ygr0) it.next()).a));
        }
        List list2 = this.state.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((gpn) it2.next()).a);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!arrayList.contains((String) next)) {
                arrayList3.add(next);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        x4c.g("Education drawRules contains wrong viewIds", null, kotlin.collections.b.i(new Pair("education_id", this.state.a), new Pair("view_ids", kotlin.collections.a.X(arrayList3, Extension.FIX_SPACE, null, null, null, 62))), Collections.singletonList(lrp0.j), 2);
    }

    private final void serverLogic(Canvas canvas, int saveCount) {
        for (ygr0 ygr0Var : this.viewsList) {
            Path path = this.viewPath;
            path.reset();
            path.addRoundRect(ygr0Var.c, ygr0Var.d, Path.Direction.CW);
            canvas.drawPath(this.viewPath, this.clearPaint);
        }
        canvas.restoreToCount(saveCount);
        for (ygr0 ygr0Var2 : this.viewsList) {
            if (ygr0Var2.b == EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType.SHADOW) {
                Path path2 = this.viewPath;
                path2.reset();
                path2.addRoundRect(ygr0Var2.c, ygr0Var2.d, Path.Direction.CW);
                canvas.drawPath(this.viewPath, this.shadowPaint);
            }
        }
    }

    private final void serverLogicWithGlow(Canvas canvas, int saveCount) {
        this.viewPath.reset();
        for (ygr0 ygr0Var : this.viewsList) {
            Path path = this.tempPath;
            path.reset();
            path.addRoundRect(ygr0Var.c, ygr0Var.d, Path.Direction.CW);
            EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType = ygr0Var.b;
            EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType2 = EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType.HIGHLIGHT;
            Path path2 = this.viewPath;
            if (educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType == educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType2) {
                path2.op(this.tempPath, Path.Op.UNION);
            } else {
                path2.op(this.tempPath, Path.Op.DIFFERENCE);
            }
        }
        canvas.drawPath(this.viewPath, this.glowPaint);
        canvas.drawPath(this.viewPath, this.clearPaint);
        canvas.restoreToCount(saveCount);
    }

    private final boolean shouldSkipView(View view) {
        if (view == this || view.getVisibility() != 0 || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return true;
        }
        Object tag = view.getTag(nah0.ybsdk_educations_ignore_shadow_draw_id);
        return (tag instanceof String ? (String) tag : null) != null;
    }

    public final wgr0 getHighlightViewBounds(String viewId) {
        Map<String, wgr0> map = this.boundsCache;
        wgr0 wgr0Var = map.get(viewId);
        if (wgr0Var == null) {
            Path path = new Path();
            if (!calculateHighlightPathByViewId(getRootView(), viewId, path)) {
                return null;
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            wgr0Var = new wgr0(rectF.top, rectF.bottom);
            map.put(viewId, wgr0Var);
        }
        return wgr0Var;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.viewsList.clear();
        this.boundsCache.clear();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.shadowPaint);
        a aVar = this.state;
        boolean z = aVar.c;
        if (z && aVar.e != null) {
            clientLogicWithGlow(canvas, saveLayer);
            return;
        }
        if (z) {
            clientLogic(canvas, saveLayer);
        } else if (aVar.e != null) {
            serverLogicWithGlow(canvas, saveLayer);
        } else {
            serverLogic(canvas, saveLayer);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            invalidateView();
        }
    }

    public final void render(a state) {
        if (state.equals(this.state)) {
            return;
        }
        this.state = state;
        Integer num = state.d;
        if (num != null) {
            this.shadowPaint.setColor(num.intValue());
        }
        com.ybsdk.feature.educations.internal.ui.a aVar = state.e;
        if (aVar != null) {
            prepareGlowPaint(aVar);
        }
        invalidateView();
        reportIncorrectViewIds();
    }

    public static final class a {
        public final String a;
        public final List b;
        public final boolean c;
        public final Integer d;
        public final com.ybsdk.feature.educations.internal.ui.a e;

        public a(String str, List list, boolean z, Integer num, com.ybsdk.feature.educations.internal.ui.a aVar) {
            this.a = str;
            this.b = list;
            this.c = z;
            this.d = num;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && this.c == aVar.c && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            int e = unr0.e(unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            Integer num = this.d;
            int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
            com.ybsdk.feature.educations.internal.ui.a aVar = this.e;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder r = xvz.r("State(educationId=", this.a, ", drawRules=", this.b, ", isClientShadowLogic=");
            r.append(this.c);
            r.append(", shadowColorAttr=");
            r.append(this.d);
            r.append(", glow=");
            r.append(this.e);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(null, EmptyList.a, false, null, null);
        }
    }

    public ShadowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ShadowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ShadowView(Context context) {
        this(context, null, 0, 6, null);
    }
}
