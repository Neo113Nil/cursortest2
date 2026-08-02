package com.yandex.div.shimmer;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.aur0;
import defpackage.bpk;
import defpackage.dpk;
import defpackage.egk;
import defpackage.jkk;
import defpackage.jl40;
import defpackage.lcb1;
import defpackage.m810;
import defpackage.oxy;
import defpackage.psk;
import defpackage.qgh0;
import defpackage.rvo;
import defpackage.tcc;
import defpackage.tls;
import defpackage.ttr0;
import defpackage.wi91;
import defpackage.xrk;
import defpackage.ztr0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements dpk {
    public long a;

    public a(int i) {
        this.a = 0L;
    }

    public static ztr0 a(ttr0 ttr0Var, rvo rvoVar) {
        aur0 aur0Var;
        List a = ttr0Var.b().a(rvoVar);
        List a2 = ttr0Var.e().a(rvoVar);
        double doubleValue = ((Number) ttr0Var.a().a(rvoVar)).doubleValue();
        double doubleValue2 = ((Number) ttr0Var.d().a(rvoVar)).doubleValue();
        jkk c = ttr0Var.c();
        if (c != null) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Expression expression = c.c;
            float b = wi91.b(expression != null ? (Long) expression.a(rvoVar) : null, displayMetrics);
            Expression expression2 = c.d;
            float b2 = wi91.b(expression2 != null ? (Long) expression2.a(rvoVar) : null, displayMetrics);
            Expression expression3 = c.a;
            float b3 = wi91.b(expression3 != null ? (Long) expression3.a(rvoVar) : null, displayMetrics);
            Expression expression4 = c.b;
            aur0Var = new aur0(b, b2, b3, wi91.b(expression4 != null ? (Long) expression4.a(rvoVar) : null, displayMetrics));
        } else {
            aur0Var = null;
        }
        int[] I0 = kotlin.collections.a.I0(a);
        List list = a2;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf((float) ((Number) it.next()).doubleValue()));
        }
        return new ztr0(I0, kotlin.collections.a.G0(arrayList), doubleValue, m810.c(doubleValue2 * 1000.0d), aur0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    @Override // defpackage.dpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(Div2View div2View, final rvo rvoVar, View view, egk egkVar) {
        JSONObject jSONObject;
        final ttr0 b;
        oxy oxyVar;
        Object obj;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, ShimmerDivHandler.EXTENSION_ID)) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null) {
                jSONObject = bpkVar.b;
                b = lcb1.b(jSONObject);
                oxyVar = view instanceof oxy ? (oxy) view : null;
                if (oxyVar != null || oxyVar.isImageLoaded() || oxyVar.isImagePreview()) {
                    return;
                }
                if (this.a == 0) {
                    this.a = SystemClock.uptimeMillis();
                }
                final ShimmerDrawable shimmerDrawable = new ShimmerDrawable(a(b, rvoVar), this.a);
                b.b().b(rvoVar, new tls() { // from class: com.yandex.div.shimmer.DivShimmerExtensionHandler$observeTo$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        ShimmerDrawable shimmerDrawable2 = ShimmerDrawable.this;
                        a aVar = this;
                        ttr0 ttr0Var = b;
                        rvo rvoVar2 = rvoVar;
                        aVar.getClass();
                        shimmerDrawable2.setConfig(a.a(ttr0Var, rvoVar2));
                        return zy11.a;
                    }
                });
                b.e().b(rvoVar, new tls() { // from class: com.yandex.div.shimmer.DivShimmerExtensionHandler$observeTo$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        ShimmerDrawable shimmerDrawable2 = ShimmerDrawable.this;
                        a aVar = this;
                        ttr0 ttr0Var = b;
                        rvo rvoVar2 = rvoVar;
                        aVar.getClass();
                        shimmerDrawable2.setConfig(a.a(ttr0Var, rvoVar2));
                        return zy11.a;
                    }
                });
                b.a().c(rvoVar, new tls() { // from class: com.yandex.div.shimmer.DivShimmerExtensionHandler$observeTo$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        ((Number) obj2).doubleValue();
                        ShimmerDrawable shimmerDrawable2 = ShimmerDrawable.this;
                        a aVar = this;
                        ttr0 ttr0Var = b;
                        rvo rvoVar2 = rvoVar;
                        aVar.getClass();
                        shimmerDrawable2.setConfig(a.a(ttr0Var, rvoVar2));
                        return zy11.a;
                    }
                });
                b.d().c(rvoVar, new tls() { // from class: com.yandex.div.shimmer.DivShimmerExtensionHandler$observeTo$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        ((Number) obj2).doubleValue();
                        ShimmerDrawable shimmerDrawable2 = ShimmerDrawable.this;
                        a aVar = this;
                        ttr0 ttr0Var = b;
                        rvo rvoVar2 = rvoVar;
                        aVar.getClass();
                        shimmerDrawable2.setConfig(a.a(ttr0Var, rvoVar2));
                        return zy11.a;
                    }
                });
                oxyVar.setImage(shimmerDrawable);
                view.setTag(qgh0.div_shimmer_drawable, shimmerDrawable);
            }
        }
        jSONObject = null;
        b = lcb1.b(jSONObject);
        if (view instanceof oxy) {
        }
        if (oxyVar != null) {
            return;
        }
        if (this.a == 0) {
        }
        final ShimmerDrawable shimmerDrawable2 = new ShimmerDrawable(a(b, rvoVar), this.a);
        b.b().b(rvoVar, new tls() { // from class: com.yandex.div.shimmer.DivShimmerExtensionHandler$observeTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                ShimmerDrawable shimmerDrawable22 = ShimmerDrawable.this;
                a aVar = this;
                ttr0 ttr0Var = b;
                rvo rvoVar2 = rvoVar;
                aVar.getClass();
                shimmerDrawable22.setConfig(a.a(ttr0Var, rvoVar2));
                return zy11.a;
            }
        });
        b.e().b(rvoVar, new tls() { // from class: com.yandex.div.shimmer.DivShimmerExtensionHandler$observeTo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                ShimmerDrawable shimmerDrawable22 = ShimmerDrawable.this;
                a aVar = this;
                ttr0 ttr0Var = b;
                rvo rvoVar2 = rvoVar;
                aVar.getClass();
                shimmerDrawable22.setConfig(a.a(ttr0Var, rvoVar2));
                return zy11.a;
            }
        });
        b.a().c(rvoVar, new tls() { // from class: com.yandex.div.shimmer.DivShimmerExtensionHandler$observeTo$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                ((Number) obj2).doubleValue();
                ShimmerDrawable shimmerDrawable22 = ShimmerDrawable.this;
                a aVar = this;
                ttr0 ttr0Var = b;
                rvo rvoVar2 = rvoVar;
                aVar.getClass();
                shimmerDrawable22.setConfig(a.a(ttr0Var, rvoVar2));
                return zy11.a;
            }
        });
        b.d().c(rvoVar, new tls() { // from class: com.yandex.div.shimmer.DivShimmerExtensionHandler$observeTo$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                ((Number) obj2).doubleValue();
                ShimmerDrawable shimmerDrawable22 = ShimmerDrawable.this;
                a aVar = this;
                ttr0 ttr0Var = b;
                rvo rvoVar2 = rvoVar;
                aVar.getClass();
                shimmerDrawable22.setConfig(a.a(ttr0Var, rvoVar2));
                return zy11.a;
            }
        });
        oxyVar.setImage(shimmerDrawable2);
        view.setTag(qgh0.div_shimmer_drawable, shimmerDrawable2);
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions;
        if ((!(egkVar instanceof xrk) && !(egkVar instanceof psk)) || (extensions = egkVar.getExtensions()) == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, ShimmerDivHandler.EXTENSION_ID)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object tag = view.getTag(qgh0.div_shimmer_drawable);
        ShimmerDrawable shimmerDrawable = tag instanceof ShimmerDrawable ? (ShimmerDrawable) tag : null;
        if (shimmerDrawable != null) {
            shimmerDrawable.stop();
        }
    }

    public a() {
        this(0);
    }
}
