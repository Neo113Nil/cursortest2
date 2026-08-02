package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.d;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.NinePatchDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mfk {
    public final gtk a;

    public mfk(gtk gtkVar) {
        this.a = gtkVar;
    }

    public static void a(List list, rvo rvoVar, uvo uvoVar, tls tlsVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kfk kfkVar = (kfk) it.next();
            if (kfkVar != null) {
                if (kfkVar instanceof jfk) {
                    uvoVar.addSubscription(((jfk) kfkVar).b.a.c(rvoVar, tlsVar));
                } else if (kfkVar instanceof ffk) {
                    rsk rskVar = ((ffk) kfkVar).b;
                    uvoVar.addSubscription(rskVar.a.c(rvoVar, tlsVar));
                    uvoVar.addSubscription(rskVar.e.c(rvoVar, tlsVar));
                    uvoVar.addSubscription(rskVar.b.c(rvoVar, tlsVar));
                    uvoVar.addSubscription(rskVar.c.c(rvoVar, tlsVar));
                    uvoVar.addSubscription(rskVar.f.c(rvoVar, tlsVar));
                    uvoVar.addSubscription(rskVar.g.c(rvoVar, tlsVar));
                    List<qpk> list2 = rskVar.d;
                    if (list2 != null) {
                        for (qpk qpkVar : list2) {
                            if (qpkVar != null && !(qpkVar instanceof ppk) && (qpkVar instanceof opk)) {
                                uvoVar.addSubscription(((opk) qpkVar).c().a.c(rvoVar, tlsVar));
                            }
                        }
                    }
                } else if (kfkVar instanceof gfk) {
                    vyk vykVar = ((gfk) kfkVar).b;
                    uvoVar.addSubscription(vykVar.a.c(rvoVar, tlsVar));
                    pvo pvoVar = vykVar.c;
                    uvoVar.addSubscription(pvoVar != null ? pvoVar.b(rvoVar, tlsVar) : null);
                    List<uyk> list3 = vykVar.b;
                    if (list3 != null) {
                        for (uyk uykVar : list3) {
                            if (uykVar != null) {
                                uvoVar.addSubscription(uykVar.a.c(rvoVar, tlsVar));
                                uvoVar.addSubscription(uykVar.b.c(rvoVar, tlsVar));
                            }
                        }
                    }
                } else if (kfkVar instanceof ifk) {
                    k5l k5lVar = ((ifk) kfkVar).b;
                    pvo pvoVar2 = k5lVar.d;
                    uvoVar.addSubscription(pvoVar2 != null ? pvoVar2.b(rvoVar, tlsVar) : null);
                    y5e.B(uvoVar, k5lVar.a, rvoVar, tlsVar);
                    y5e.B(uvoVar, k5lVar.b, rvoVar, tlsVar);
                    h6l h6lVar = k5lVar.e;
                    if (h6lVar != null) {
                        if (h6lVar instanceof f6l) {
                            f6l f6lVar = (f6l) h6lVar;
                            uvoVar.addSubscription(f6lVar.a().a.c(rvoVar, tlsVar));
                            uvoVar.addSubscription(f6lVar.a().b.c(rvoVar, tlsVar));
                        } else if (h6lVar instanceof g6l) {
                            uvoVar.addSubscription(((g6l) h6lVar).a().a.c(rvoVar, tlsVar));
                        }
                    }
                    List<j5l> list4 = k5lVar.c;
                    if (list4 != null) {
                        for (j5l j5lVar : list4) {
                            if (j5lVar != null) {
                                uvoVar.addSubscription(j5lVar.a.c(rvoVar, tlsVar));
                                uvoVar.addSubscription(j5lVar.b.c(rvoVar, tlsVar));
                            }
                        }
                    }
                } else if (kfkVar instanceof hfk) {
                    d0l d = ((hfk) kfkVar).d();
                    uvoVar.addSubscription(d.a.c(rvoVar, tlsVar));
                    n3k n3kVar = d.b;
                    if (n3kVar != null) {
                        uvoVar.addSubscription(n3kVar.b.c(rvoVar, tlsVar));
                        uvoVar.addSubscription(n3kVar.d.c(rvoVar, tlsVar));
                        uvoVar.addSubscription(n3kVar.c.c(rvoVar, tlsVar));
                        uvoVar.addSubscription(n3kVar.a.c(rvoVar, tlsVar));
                    }
                }
            }
        }
    }

    public static Drawable d(View view) {
        Object tag = view.getTag(ngh0.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    public static xfk e(kfk kfkVar, Div2View div2View, DisplayMetrics displayMetrics, rvo rvoVar) {
        if (kfkVar instanceof gfk) {
            vyk vykVar = ((gfk) kfkVar).b;
            long longValue = ((Number) vykVar.a.a(rvoVar)).longValue();
            long j = longValue >> 31;
            int i = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            kic D0 = cma1.D0(vykVar, rvoVar);
            jl40.p(D0, div2View);
            return new sfk(i, D0);
        }
        if (kfkVar instanceof ifk) {
            k5l k5lVar = ((ifk) kfkVar).b;
            q5i0 F0 = cma1.F0(k5lVar.a, displayMetrics, rvoVar);
            q5i0 F02 = cma1.F0(k5lVar.b, displayMetrics, rvoVar);
            kic E0 = cma1.E0(k5lVar, rvoVar);
            jl40.p(E0, div2View);
            return new vfk(F0, F02, E0, cma1.G0(k5lVar.e, displayMetrics, rvoVar));
        }
        if (kfkVar instanceof ffk) {
            rsk rskVar = ((ffk) kfkVar).b;
            double doubleValue = ((Number) rskVar.a.a(rvoVar)).doubleValue();
            DivAlignmentHorizontal divAlignmentHorizontal = (DivAlignmentHorizontal) rskVar.b.a(rvoVar);
            DivAlignmentVertical divAlignmentVertical = (DivAlignmentVertical) rskVar.c.a(rvoVar);
            Uri uri = (Uri) rskVar.e.a(rvoVar);
            boolean booleanValue = ((Boolean) rskVar.f.a(rvoVar)).booleanValue();
            DivImageScale divImageScale = (DivImageScale) rskVar.g.a(rvoVar);
            List list = rskVar.d;
            return new rfk(doubleValue, divAlignmentHorizontal, divAlignmentVertical, uri, booleanValue, divImageScale, list != null ? uml.n(list, rvoVar) : null);
        }
        if (kfkVar instanceof jfk) {
            return new wfk(((Number) ((jfk) kfkVar).b.a.a(rvoVar)).intValue());
        }
        if (!(kfkVar instanceof hfk)) {
            w511.b();
            return null;
        }
        hfk hfkVar = (hfk) kfkVar;
        Uri uri2 = (Uri) hfkVar.d().a.a(rvoVar);
        long longValue2 = ((Number) hfkVar.d().b.b.a(rvoVar)).longValue();
        long j2 = longValue2 >> 31;
        int i2 = (j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue3 = ((Number) hfkVar.d().b.d.a(rvoVar)).longValue();
        long j3 = longValue3 >> 31;
        int i3 = (j3 == 0 || j3 == -1) ? (int) longValue3 : longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue4 = ((Number) hfkVar.d().b.c.a(rvoVar)).longValue();
        long j4 = longValue4 >> 31;
        int i4 = (j4 == 0 || j4 == -1) ? (int) longValue4 : longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue5 = ((Number) hfkVar.d().b.a.a(rvoVar)).longValue();
        long j5 = longValue5 >> 31;
        return new ufk(uri2, new Rect(i2, i3, i4, (j5 == 0 || j5 == -1) ? (int) longValue5 : longValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE));
    }

    public static void g(View view, Drawable drawable) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(uyg0.native_animation_background) : null) != null) {
            Drawable drawable2 = view.getContext().getDrawable(uyg0.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z = true;
        } else {
            z = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z) {
            ((LayerDrawable) view.getBackground()).setId(((LayerDrawable) view.getBackground()).getNumberOfLayers() - 1, uyg0.native_animation_background);
        }
    }

    public final void b(View view, aw5 aw5Var, Drawable drawable, List list) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rvo rvoVar = aw5Var.b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(e((kfk) it.next(), aw5Var.a, displayMetrics, rvoVar));
        }
        Object tag = view.getTag(ngh0.div_default_background_list_tag);
        List list3 = tag instanceof List ? (List) tag : null;
        Drawable d = d(view);
        if (jl40.l(list3, arrayList) && jl40.l(d, drawable)) {
            return;
        }
        g(view, f(arrayList, aw5Var, view, drawable));
        view.setTag(ngh0.div_default_background_list_tag, arrayList);
        view.setTag(ngh0.div_focused_background_list_tag, null);
        view.setTag(ngh0.div_additional_background_layer_tag, drawable);
    }

    public final void c(View view, aw5 aw5Var, Drawable drawable, List list, List list2) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Div2View div2View = aw5Var.a;
        rvo rvoVar = aw5Var.b;
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(e((kfk) it.next(), div2View, displayMetrics, rvoVar));
        }
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(e((kfk) it2.next(), div2View, displayMetrics, rvoVar));
        }
        Object tag = view.getTag(ngh0.div_default_background_list_tag);
        List list5 = tag instanceof List ? (List) tag : null;
        Object tag2 = view.getTag(ngh0.div_focused_background_list_tag);
        List list6 = tag2 instanceof List ? (List) tag2 : null;
        Drawable d = d(view);
        if (jl40.l(list5, arrayList) && jl40.l(list6, arrayList2) && jl40.l(d, drawable)) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, f(arrayList2, aw5Var, view, drawable));
        if (!list.isEmpty() || drawable != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, f(arrayList, aw5Var, view, drawable));
        }
        g(view, stateListDrawable);
        view.setTag(ngh0.div_default_background_list_tag, arrayList);
        view.setTag(ngh0.div_focused_background_list_tag, arrayList2);
        view.setTag(ngh0.div_additional_background_layer_tag, drawable);
    }

    public final LayerDrawable f(ArrayList arrayList, aw5 aw5Var, View view, Drawable drawable) {
        View view2;
        Drawable radialGradientDrawable;
        ScalingDrawable.AlignmentHorizontal alignmentHorizontal;
        if (drawable != null) {
            drawable.mutate();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xfk xfkVar = (xfk) it.next();
            xfkVar.getClass();
            boolean z = xfkVar instanceof rfk;
            gtk gtkVar = this.a;
            if (z) {
                rfk rfkVar = (rfk) xfkVar;
                ScalingDrawable scalingDrawable = new ScalingDrawable();
                scalingDrawable.setAlpha((int) (rfkVar.a * 255.0d));
                int i = qfk.a[rfkVar.f.ordinal()];
                scalingDrawable.setCustomScaleType(i != 1 ? i != 2 ? i != 3 ? ScalingDrawable.ScaleType.NO_SCALE : ScalingDrawable.ScaleType.STRETCH : ScalingDrawable.ScaleType.FIT : ScalingDrawable.ScaleType.FILL);
                DivAlignmentHorizontal divAlignmentHorizontal = rfkVar.b;
                boolean W = ffx.W(view);
                int i2 = qfk.b[divAlignmentHorizontal.ordinal()];
                if (i2 == 1) {
                    alignmentHorizontal = ScalingDrawable.AlignmentHorizontal.LEFT;
                } else if (i2 == 2) {
                    alignmentHorizontal = ScalingDrawable.AlignmentHorizontal.CENTER;
                } else if (i2 == 3) {
                    alignmentHorizontal = ScalingDrawable.AlignmentHorizontal.RIGHT;
                } else if (i2 == 4) {
                    alignmentHorizontal = W ? ScalingDrawable.AlignmentHorizontal.RIGHT : ScalingDrawable.AlignmentHorizontal.LEFT;
                } else {
                    if (i2 != 5) {
                        w511.b();
                        return null;
                    }
                    alignmentHorizontal = W ? ScalingDrawable.AlignmentHorizontal.LEFT : ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                scalingDrawable.setAlignmentHorizontal(alignmentHorizontal);
                int i3 = qfk.c[rfkVar.c.ordinal()];
                scalingDrawable.setAlignmentVertical(i3 != 1 ? i3 != 2 ? ScalingDrawable.AlignmentVertical.TOP : ScalingDrawable.AlignmentVertical.BOTTOM : ScalingDrawable.AlignmentVertical.CENTER);
                float f = view.getResources().getDisplayMetrics().density;
                scalingDrawable.setAdditionalScale(f);
                String uri = rfkVar.d.toString();
                Div2View div2View = aw5Var.a;
                view2 = view;
                div2View.addLoadReference(gtkVar.loadImage(uri, new d(div2View, rfkVar, scalingDrawable, view2, f)), view2);
                radialGradientDrawable = scalingDrawable;
            } else {
                view2 = view;
                if (xfkVar instanceof ufk) {
                    ufk ufkVar = (ufk) xfkVar;
                    Div2View div2View2 = aw5Var.a;
                    NinePatchDrawable ninePatchDrawable = new NinePatchDrawable();
                    div2View2.addLoadReference(gtkVar.loadImage(ufkVar.a.toString(), new tfk(div2View2, ninePatchDrawable, ufkVar)), view2);
                    radialGradientDrawable = ninePatchDrawable;
                } else if (xfkVar instanceof wfk) {
                    radialGradientDrawable = new ColorDrawable(((wfk) xfkVar).a);
                } else if (xfkVar instanceof sfk) {
                    radialGradientDrawable = new LinearGradientDrawable(r1.a, ((sfk) xfkVar).b);
                } else {
                    if (!(xfkVar instanceof vfk)) {
                        w511.b();
                        return null;
                    }
                    vfk vfkVar = (vfk) xfkVar;
                    radialGradientDrawable = new RadialGradientDrawable(vfkVar.d(), vfkVar.a(), vfkVar.b(), vfkVar.c().a, vfkVar.c().b);
                }
            }
            Drawable mutate = radialGradientDrawable.mutate();
            if (mutate != null) {
                arrayList2.add(mutate);
            }
            view = view2;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (drawable != null) {
            arrayList3.add(drawable);
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        return new LayerDrawable((Drawable[]) arrayList3.toArray(new Drawable[0]));
    }
}
