package com.yandex.div.lottie;

import android.net.Uri;
import android.view.View;
import com.airbnb.lottie.LottieDrawable;
import com.yandex.div.core.d;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import defpackage.bpk;
import defpackage.br60;
import defpackage.dpe0;
import defpackage.dpk;
import defpackage.dtz;
import defpackage.eg90;
import defpackage.egk;
import defpackage.epl;
import defpackage.etz;
import defpackage.ftz;
import defpackage.gtz;
import defpackage.hzk;
import defpackage.izk;
import defpackage.jl40;
import defpackage.jzk;
import defpackage.kg21;
import defpackage.kl40;
import defpackage.kzk;
import defpackage.lzk;
import defpackage.mzk;
import defpackage.ope0;
import defpackage.pgh0;
import defpackage.ppe0;
import defpackage.qpe0;
import defpackage.rvo;
import defpackage.seu;
import defpackage.tls;
import defpackage.u2l;
import defpackage.uvo;
import defpackage.wm11;
import defpackage.xrk;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements dpk, uvo {
    public static final u2l y = new u2l(eg90.a);
    public final kl40 a;
    public final seu b;
    public final hzk c;
    public final LinkedHashMap w;
    public final ArrayList x;

    public a(int i) {
        mzk.R1.getClass();
        kzk.Q1.getClass();
        kl40 kl40Var = lzk.b;
        this.a = kl40Var;
        this.b = izk.a;
        this.c = new hzk(kl40Var, jzk.b);
        this.w = new LinkedHashMap();
        this.x = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r8.equals(com.adjust.sdk.Constants.SCHEME) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        r7.toString();
        r6.getClass();
        r7.toString();
        r9.invoke(new defpackage.kg21(r7, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r8.equals("asset") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r9.invoke(new defpackage.kg21(r7, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r8.equals("http") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        if (r8.equals("res") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r8.equals("divkit-asset") == false) goto L45;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(egk egkVar, rvo rvoVar, qpe0 qpe0Var) {
        Object obj;
        JSONObject jSONObject;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "lottie")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar == null || (jSONObject = bpkVar.b) == null) {
                return;
            }
            Expression d = com.yandex.div.internal.parser.a.d(y, jSONObject, "lottie_url", wm11.e, b.e);
            if (d != null) {
                Uri uri = (Uri) d.a(rvoVar);
                final ppe0 l = qpe0Var != null ? ((d) qpe0Var).l("lottie") : null;
                tls tlsVar = new tls() { // from class: com.yandex.div.lottie.DivLottieExtensionHandler$preprocessInternal$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        dpe0 dpe0Var = (dpe0) obj2;
                        ope0 ope0Var = l;
                        if (ope0Var != null) {
                            ((ppe0) ope0Var).a(dpe0Var);
                        }
                        return zy11.a;
                    }
                };
                hzk hzkVar = this.c;
                hzkVar.getClass();
                kzk kzkVar = (kzk) hzkVar.b;
                String scheme = uri.getScheme();
                if (scheme != null) {
                    switch (scheme.hashCode()) {
                        case -1951681592:
                            break;
                        case 112800:
                            break;
                        case 3213448:
                            break;
                        case 93121264:
                            break;
                        case 99617003:
                            break;
                    }
                    return;
                }
                uri.getScheme();
                tlsVar.invoke(new kg21(uri, null));
            }
        }
    }

    @Override // defpackage.dpk
    public final void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        LoadableImageView loadableImageView = view instanceof LoadableImageView ? (LoadableImageView) view : null;
        if (loadableImageView == null || (loadableImageView.getDelegate() instanceof dtz)) {
            return;
        }
        dtz dtzVar = new dtz(loadableImageView);
        LottieDrawable lottieDrawable = dtzVar.b;
        lottieDrawable.enableMergePathsForKitKatAndAbove(true);
        this.a.getClass();
        lottieDrawable.setImagesAssetsFolder("/");
        loadableImageView.setDelegate(dtzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    @Override // defpackage.dpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object obj;
        JSONObject jSONObject;
        gtz gtzVar;
        gtz etzVar;
        List extensions = egkVar.getExtensions();
        seu seuVar = this.b;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "lottie")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null && (jSONObject = bpkVar.b) != null) {
                LoadableImageView loadableImageView = view instanceof LoadableImageView ? (LoadableImageView) view : null;
                if (loadableImageView == null) {
                    seuVar.getClass();
                    return;
                }
                epl delegate = loadableImageView.getDelegate();
                dtz dtzVar = delegate instanceof dtz ? (dtz) delegate : null;
                if (dtzVar == null) {
                    seuVar.getClass();
                    return;
                }
                br60 br60Var = dtzVar.l;
                Expression d = com.yandex.div.internal.parser.a.d(y, jSONObject, "lottie_url", wm11.e, b.e);
                if (d != null) {
                    etzVar = new ftz(((Uri) d.a(rvoVar)).toString());
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("lottie_json");
                    if (optJSONObject == null) {
                        gtzVar = null;
                        if (gtzVar == null && !gtzVar.equals(dtzVar.k)) {
                            dtzVar.c = null;
                            br60Var.clear();
                            dtzVar.b.clearComposition();
                            LoadableImageView loadableImageView2 = dtzVar.a;
                            loadableImageView2.setExternalImage(null);
                            loadableImageView2.setImageTransformer(null);
                            loadableImageView2.setImageDrawable(null);
                            dtzVar.k = gtzVar;
                            br60Var.clear();
                            ScopedOnAttachStateChangeListener scopedOnAttachStateChangeListener = new ScopedOnAttachStateChangeListener(new DivLottieExtensionHandler$bindView$1(this, gtzVar, view, div2View, egkVar, dtzVar, jSONObject, rvoVar, null), loadableImageView);
                            WeakHashMap weakHashMap = androidx.core.view.b.a;
                            if (loadableImageView.isAttachedToWindow()) {
                                scopedOnAttachStateChangeListener.performActionInScope();
                            }
                            loadableImageView.addOnAttachStateChangeListener(scopedOnAttachStateChangeListener);
                            loadableImageView.setTag(pgh0.lottie_on_attach_to_window_listener, scopedOnAttachStateChangeListener);
                            return;
                        }
                        return;
                    }
                    etzVar = new etz(optJSONObject);
                }
                gtzVar = etzVar;
                if (gtzVar == null) {
                    return;
                }
                dtzVar.c = null;
                br60Var.clear();
                dtzVar.b.clearComposition();
                LoadableImageView loadableImageView22 = dtzVar.a;
                loadableImageView22.setExternalImage(null);
                loadableImageView22.setImageTransformer(null);
                loadableImageView22.setImageDrawable(null);
                dtzVar.k = gtzVar;
                br60Var.clear();
                ScopedOnAttachStateChangeListener scopedOnAttachStateChangeListener2 = new ScopedOnAttachStateChangeListener(new DivLottieExtensionHandler$bindView$1(this, gtzVar, view, div2View, egkVar, dtzVar, jSONObject, rvoVar, null), loadableImageView);
                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                if (loadableImageView.isAttachedToWindow()) {
                }
                loadableImageView.addOnAttachStateChangeListener(scopedOnAttachStateChangeListener2);
                loadableImageView.setTag(pgh0.lottie_on_attach_to_window_listener, scopedOnAttachStateChangeListener2);
                return;
            }
        }
        seuVar.getClass();
    }

    @Override // defpackage.uvo
    public final List getSubscriptions() {
        return this.x;
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List list;
        JSONObject jSONObject;
        if ((egkVar instanceof xrk) && (list = ((xrk) egkVar).r) != null) {
            List<bpk> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (bpk bpkVar : list2) {
                if (jl40.l(bpkVar.a, "lottie") && (jSONObject = bpkVar.b) != null && (jSONObject.has("lottie_url") || jSONObject.has("lottie_json"))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void preprocess(egk egkVar, rvo rvoVar) {
        a(egkVar, rvoVar, null);
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        LoadableImageView loadableImageView = view instanceof LoadableImageView ? (LoadableImageView) view : null;
        seu seuVar = this.b;
        if (loadableImageView == null) {
            seuVar.getClass();
            return;
        }
        epl delegate = loadableImageView.getDelegate();
        dtz dtzVar = delegate instanceof dtz ? (dtz) delegate : null;
        if (dtzVar == null) {
            seuVar.getClass();
            return;
        }
        br60 br60Var = dtzVar.l;
        Object tag = loadableImageView.getTag(pgh0.lottie_on_attach_to_window_listener);
        ScopedOnAttachStateChangeListener scopedOnAttachStateChangeListener = tag instanceof ScopedOnAttachStateChangeListener ? (ScopedOnAttachStateChangeListener) tag : null;
        if (scopedOnAttachStateChangeListener != null) {
            scopedOnAttachStateChangeListener.clearScope();
            loadableImageView.removeOnAttachStateChangeListener(scopedOnAttachStateChangeListener);
        }
        dtzVar.c = null;
        br60Var.clear();
        dtzVar.b.clearComposition();
        LoadableImageView loadableImageView2 = dtzVar.a;
        loadableImageView2.setExternalImage(null);
        loadableImageView2.setImageTransformer(null);
        loadableImageView2.setImageDrawable(null);
        dtzVar.k = null;
        br60Var.clear();
        closeAllSubscription();
    }

    @Override // defpackage.dpk
    public final void preprocess(egk egkVar, rvo rvoVar, qpe0 qpe0Var) {
        a(egkVar, rvoVar, qpe0Var);
    }

    public a() {
        this(0);
    }
}
