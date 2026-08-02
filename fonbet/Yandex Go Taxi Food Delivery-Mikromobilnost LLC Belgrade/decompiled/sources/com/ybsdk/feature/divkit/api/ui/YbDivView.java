package com.ybsdk.feature.divkit.api.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yandex.div.core.Div2Context;
import com.ybsdk.core.common.domain.entities.BuildFlavor;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.divkit.internal.domain.a;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.DivkitResetConfigSchema;
import defpackage.c231;
import defpackage.c5b1;
import defpackage.c5z;
import defpackage.cnl;
import defpackage.czf;
import defpackage.enl;
import defpackage.ew2;
import defpackage.gmh;
import defpackage.gnl;
import defpackage.gp51;
import defpackage.gwy0;
import defpackage.h9g;
import defpackage.hnl;
import defpackage.i5m;
import defpackage.ij91;
import defpackage.jqr;
import defpackage.k751;
import defpackage.kgx;
import defpackage.kp50;
import defpackage.lob1;
import defpackage.mpk;
import defpackage.n4u0;
import defpackage.n751;
import defpackage.nkp;
import defpackage.np31;
import defpackage.o6;
import defpackage.omk;
import defpackage.oti;
import defpackage.pgi;
import defpackage.pr51;
import defpackage.qhk;
import defpackage.qpi0;
import defpackage.qx21;
import defpackage.rr51;
import defpackage.sxk;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tul;
import defpackage.u1w;
import defpackage.w511;
import defpackage.wlp;
import defpackage.wzk;
import defpackage.x4c;
import defpackage.xx60;
import defpackage.ykn0;
import defpackage.zmk;
import defpackage.zp31;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0014¢\u0006\u0004\b \u0010\u0016J%\u0010%\u001a\u00020\u00122\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00170!j\u0002`#¢\u0006\u0004\b%\u0010&J=\u0010-\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u000e2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010,\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000e¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "Lcom/ybsdk/feature/divkit/api/ui/SafeYbDivView;", "Lcom/yandex/div/core/Div2Context;", "divContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;I)V", "", "findScreenTag", "()Ljava/lang/String;", "", "", "Lc231;", "Lcom/ybsdk/feature/divkit/api/domain/DivPalette;", "palette", "Lzy11;", "updatePalette", "(Ljava/util/Map;)V", "setScreenSizeVariables", "()V", "", "isEnabled", "setSpoilerEnabled", "(Z)V", "setInsetsListener", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "setActionHandler", "(Ltls;)V", "Lrr51;", Constants.KEY_DATA, "Lc5z;", "localVariables", "logId", "shouldResetVariables", "setData", "(Lrr51;Ljava/util/List;Ljava/lang/String;Z)V", "updateLocalVariables", "(Ljava/util/List;)V", "Lcom/yandex/div/core/Div2Context;", "Lqhk;", "divBoundsEnabler", "Lqhk;", "getDivBoundsEnabler", "()Lqhk;", "setDivBoundsEnabler", "(Lqhk;)V", "Lpr51;", "divActionHandler", "Lpr51;", "Lsxk;", "dataMorpher", "Lsxk;", "Landroid/graphics/Paint;", "borderPaint", "Landroid/graphics/Paint;", "isDevBuild", "Z", "Lkotlin/text/Regex;", "logIdsRegexesToResetLocalVariables", "Ljava/util/List;", "Lhnl;", "getThemeVariable", "()Lhnl;", "themeVariable", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YbDivView extends SafeYbDivView {
    private final Paint borderPaint;
    private final sxk dataMorpher;
    private final pr51 divActionHandler;
    public qhk divBoundsEnabler;
    private final Div2Context divContext;
    private boolean isDevBuild;
    private List<Regex> logIdsRegexesToResetLocalVariables;

    public YbDivView(Div2Context div2Context, AttributeSet attributeSet, int i) {
        super(div2Context, attributeSet, i);
        this.divContext = div2Context;
        pr51 pr51Var = new pr51(new YbDivView$divActionHandler$1(0, this, YbDivView.class, "findScreenTag", "findScreenTag()Ljava/lang/String;", 0));
        this.divActionHandler = pr51Var;
        this.dataMorpher = new sxk();
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(kp50.x(4));
        this.borderPaint = paint;
        this.logIdsRegexesToResetLocalVariables = EmptyList.a;
        setActionHandler(pr51Var);
        b.p(this, new o6(12, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String findScreenTag() {
        String b = c5b1.b(this);
        if (b != null) {
            return b;
        }
        x4c.g("There is no screen_tag in view hierarchy", null, null, null, 14);
        return "<no screen tag>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hnl getThemeVariable() {
        boolean f = lob1.f(getContext());
        if (f) {
            return gnl.c;
        }
        if (!f) {
            return gnl.d;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(YbDivView ybDivView, rr51 rr51Var, List list, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        ybDivView.setData(rr51Var, list, str, z);
    }

    private final void setInsetsListener() {
        b.w(this, new gp51(1, this));
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        np31.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 setInsetsListener$lambda$12(YbDivView ybDivView, View view, n751 n751Var) {
        k751 k751Var = n751Var.a;
        u1w h = k751Var.h(519);
        int v = kp50.v(k751Var.g(8).d);
        int i = h.d;
        int v2 = v - kp50.v(i);
        if (v2 < 0) {
            v2 = 0;
        }
        ij91.c(ybDivView.divContext, new cnl(kp50.x(h.b), 3));
        ij91.c(ybDivView.divContext, new cnl(kp50.x(i), 2));
        ij91.c(ybDivView.divContext, new cnl(v2, 1));
        return n751Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenSizeVariables() {
        ij91.c(this.divContext, new cnl(getResources().getDisplayMetrics().widthPixels / getResources().getDisplayMetrics().density, 5));
        ij91.c(this.divContext, new cnl(getResources().getDisplayMetrics().heightPixels / getResources().getDisplayMetrics().density, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpoilerEnabled(boolean isEnabled) {
        enl enlVar;
        Div2Context div2Context = this.divContext;
        if (isEnabled) {
            enlVar = enl.c;
        } else {
            if (isEnabled) {
                w511.b();
                return;
            }
            enlVar = enl.d;
        }
        ij91.c(div2Context, enlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePalette(Map<String, ? extends List<? extends c231>> palette) {
        List<? extends c231> list = palette.get(getThemeVariable().a);
        if (list != null) {
            for (c231 c231Var : list) {
                if (!this.divContext.getDivVariableController().h(c231Var.c())) {
                    this.divContext.getDivVariableController().i(c231Var);
                }
            }
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.SafeYbDivView, com.yandex.div.core.view2.Div2View, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ew2 ew2Var = ((com.ybsdk.persistence.b) ((ykn0) getDivBoundsEnabler()).b).i;
        kgx kgxVar = com.ybsdk.persistence.b.l[6];
        if (ew2Var.a().booleanValue()) {
            float t = kp50.t(12);
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), t, t, this.borderPaint);
        }
    }

    public final qhk getDivBoundsEnabler() {
        qhk qhkVar = this.divBoundsEnabler;
        if (qhkVar != null) {
            return qhkVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6, types: [gwy0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v6, types: [nkp] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.yandex.div.core.view2.Div2View, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        n4u0 themeType;
        mpk divFeatureDependencies;
        super.onAttachedToWindow();
        setInsetsListener();
        int i = 1;
        Fragment u = b.u(this, true);
        int i2 = 3;
        if (u != null) {
            ?? r4 = u;
            while (true) {
                if (r4 == 0) {
                    xx60 activity = u.getActivity();
                    if (!(activity instanceof nkp)) {
                        activity = null;
                    }
                    r4 = (nkp) activity;
                    if (r4 == 0) {
                        r4 = 0;
                    }
                } else if (r4 instanceof nkp) {
                    break;
                } else {
                    r4 = r4.getParentFragment();
                }
            }
            nkp nkpVar = (nkp) r4;
            if (nkpVar != null && (divFeatureDependencies = nkpVar.getDivFeatureDependencies()) != null) {
                h9g h9gVar = (h9g) divFeatureDependencies;
                int i3 = 0;
                this.isDevBuild = h9gVar.n == BuildFlavor.DEV;
                wzk wzkVar = new wzk();
                this.divActionHandler.b = (a) i5m.b(new oti(wzkVar, i5m.b(new pgi(wzkVar, new czf(divFeatureDependencies, i2), new czf(divFeatureDependencies, 2), i5m.b(new gmh(wzkVar, new czf(divFeatureDependencies, i3))))), new czf(divFeatureDependencies, i), 9)).get();
                h9g h9gVar2 = (h9g) divFeatureDependencies;
                this.divRemoteConfig = h9gVar2.i();
                this.divBoundsEnabler = new ykn0(5, (com.ybsdk.persistence.b) h9gVar2.v.h0.get());
                com.ybsdk.rconfig.b bVar = (com.ybsdk.rconfig.b) h9gVar.i().b;
                if (((CommonFeatureFlag) bVar.d(wlp.C0).getData()).isEnabled()) {
                    qx21.c(this.divContext);
                }
                List<String> logIdsRegexesToResetLocalVariables = ((DivkitResetConfigSchema) bVar.d(tul.a).getData()).getLogIdsRegexesToResetLocalVariables();
                ArrayList arrayList = new ArrayList(tcc.n(logIdsRegexesToResetLocalVariables, 10));
                Iterator it = logIdsRegexesToResetLocalVariables.iterator();
                while (it.hasNext()) {
                    arrayList.add(((qpi0) h9gVar.v.S0.get()).a((String) it.next()));
                }
                this.logIdsRegexesToResetLocalVariables = arrayList;
            }
        }
        tje.N(zp31.a(this), null, null, new YbDivView$onAttachedToWindow$2(this, null), 3);
        if (u != null) {
            ?? r0 = u;
            while (true) {
                if (r0 == 0) {
                    xx60 activity2 = u.getActivity();
                    if (!(activity2 instanceof gwy0)) {
                        activity2 = null;
                    }
                    r0 = (gwy0) activity2;
                    if (r0 == 0) {
                        r0 = 0;
                    }
                } else if (r0 instanceof gwy0) {
                    break;
                } else {
                    r0 = r0.getParentFragment();
                }
            }
            gwy0 gwy0Var = (gwy0) r0;
            if (gwy0Var == null || (themeType = gwy0Var.getThemeType()) == null) {
                return;
            }
            e.H(zp31.a(this), new jqr(themeType, new YbDivView$onAttachedToWindow$3$1(this, null), i2));
        }
    }

    public final void setActionHandler(tls handler) {
        this.divActionHandler.c = handler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (r13 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        r9.divContext.reset(1, java.util.Collections.singletonList(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        r0 = super.setData(r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        updateLocalVariables(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setData(final rr51 data, final List<c5z> localVariables, final String logId, final boolean shouldResetVariables) {
        omk omkVar;
        omk omkVar2 = data.a;
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.ybsdk.feature.divkit.api.ui.YbDivView$setData$$inlined$doOnAttach$1
                /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
                
                    if (r5 != false) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
                
                    r2.divContext.reset(1, java.util.Collections.singletonList(r1));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
                
                    r0 = super/*com.ybsdk.feature.divkit.api.ui.SafeYbDivView*\/.setData(r5, r1);
                    r5 = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
                
                    if (r5 == null) goto L31;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
                
                    r2.updateLocalVariables(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
                
                    return;
                 */
                @Override // android.view.View.OnAttachStateChangeListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onViewAttachedToWindow(View view) {
                    omk omkVar3;
                    this.removeOnAttachStateChangeListener(this);
                    this.updatePalette(data.c);
                    if (this.isDevBuild) {
                        sxk sxkVar = this.dataMorpher;
                        omk omkVar4 = data.a;
                        sxkVar.getClass();
                        omkVar3 = sxk.a(omkVar4);
                    } else {
                        omkVar3 = data.a;
                    }
                    String str = logId;
                    if (str == null) {
                        str = data.a.b;
                    }
                    zmk zmkVar = new zmk(str);
                    List list = this.logIdsRegexesToResetLocalVariables;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((Regex) it.next()).h(str)) {
                                break;
                            }
                        }
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
            return;
        }
        updatePalette(data.c);
        if (this.isDevBuild) {
            this.dataMorpher.getClass();
            omkVar = sxk.a(omkVar2);
        } else {
            omkVar = omkVar2;
        }
        if (logId == null) {
            logId = omkVar2.b;
        }
        zmk zmkVar = new zmk(logId);
        List list = this.logIdsRegexesToResetLocalVariables;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Regex) it.next()).h(logId)) {
                    break;
                }
            }
        }
    }

    public final void setDivBoundsEnabler(qhk qhkVar) {
        this.divBoundsEnabler = qhkVar;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.SafeYbDivView, com.yandex.div.core.view2.Div2View
    public void switchToState(long j) {
        switchToState(j, true);
    }

    public final void updateLocalVariables(List<c5z> localVariables) {
        for (c5z c5zVar : localVariables) {
            setVariable(c5zVar.a, c5zVar.b);
        }
    }

    public YbDivView(Div2Context div2Context, AttributeSet attributeSet) {
        this(div2Context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ YbDivView(Div2Context div2Context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public YbDivView(Div2Context div2Context) {
        this(div2Context, null, 0, 6, null);
    }
}
