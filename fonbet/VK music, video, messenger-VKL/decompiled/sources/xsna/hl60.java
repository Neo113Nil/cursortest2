package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.hints.Hint;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;
import xsna.ll60;
import xsna.m8v0;
import xsna.o7p0;

/* compiled from: NewsfeedHintHelper.kt */
/* loaded from: classes4.dex */
public final class hl60 {
    public static dcn d;
    public static final hl60 a = new hl60();
    public static final bpn0 b = new bpn0(new pr6(22));
    public static final bpn0 c = new bpn0(new nd1(25));
    public static final LinkedHashSet e = new LinkedHashSet();
    public static final LinkedHashMap f = new LinkedHashMap();
    public static final LinkedHashSet g = new LinkedHashSet();
    public static final LinkedHashMap h = new LinkedHashMap();
    public static final LinkedHashMap i = new LinkedHashMap();
    public static final a j = new a();
    public static final Object k = msy.a(LazyThreadSafetyMode.NONE, new fn4(26));
    public static final Rect l = new Rect();
    public static final RectF m = new RectF();
    public static final Rect n = new Rect();

    public static boolean a(String str) {
        return d != null || e.size() > 0 || !pla.e().b().a(str) || g.contains(str);
    }

    public static void b() {
        LinkedHashMap linkedHashMap = f;
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Handler handler = (Handler) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            }
            linkedHashMap.clear();
        }
        e.clear();
        LinkedHashMap linkedHashMap2 = h;
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            ((dcn) ((Map.Entry) it2.next()).getValue()).dismiss();
        }
        linkedHashMap2.clear();
    }

    public static void c(int i2) {
        if (i2 == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = h;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            dcn dcnVar = (dcn) ((Map.Entry) it.next()).getValue();
            if (dcnVar instanceof bzo0) {
                ((bzo0) dcnVar).t0();
            }
        }
    }

    public static void d(o7p0 o7p0Var, r7k r7kVar) {
        LinkedHashMap linkedHashMap = i;
        if (r7kVar == null) {
            linkedHashMap.remove(o7p0Var);
        } else {
            linkedHashMap.put(o7p0Var, r7kVar);
        }
    }

    public static boolean g(hl60 hl60Var, Context context, View view, Hint hint, boolean z, izs izsVar, boolean z2, gzs gzsVar, x6v x6vVar, View.OnClickListener onClickListener, ViewGroup viewGroup, int i2) {
        String str;
        String str2;
        x6v x6vVar2 = (i2 & 128) != 0 ? null : x6vVar;
        View.OnClickListener onClickListener2 = (i2 & 256) != 0 ? null : onClickListener;
        ViewGroup viewGroup2 = (i2 & 512) != 0 ? null : viewGroup;
        boolean z3 = (i2 & 1024) != 0;
        String str3 = hint.b;
        if (d == null) {
            LinkedHashSet linkedHashSet = e;
            if (!linkedHashSet.contains(str3) && (((str = hint.c) != null && str.length() != 0) || ((str2 = hint.d) != null && str2.length() != 0))) {
                linkedHashSet.add(str3);
                f.put(str3, bwt0.l(view, 300L, new he2(context, view, gzsVar, hint, izsVar, z2, onClickListener2, viewGroup2, z3, x6vVar2, z), new rop(hint, 24)));
                return true;
            }
        }
        return false;
    }

    public static dcn h(Context context, View view, Hint hint, eqq eqqVar, bv3 bv3Var, ed60 ed60Var) {
        String str;
        dcn i2;
        String str2 = hint.b;
        if (d != null) {
            return null;
        }
        LinkedHashSet linkedHashSet = e;
        if (linkedHashSet.contains(str2)) {
            return null;
        }
        String str3 = hint.c;
        if (((str3 == null || str3.length() == 0) && ((str = hint.d) == null || str.length() == 0)) || (i2 = i(context, view, bv3Var, hint, eqqVar, false, new jl60(ed60Var, hint), null, null, true)) == null) {
            return null;
        }
        linkedHashSet.add(str2);
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dcn i(Context context, View view, gzs gzsVar, Hint hint, izs izsVar, boolean z, x6v x6vVar, View.OnClickListener onClickListener, ViewGroup viewGroup, boolean z2) {
        int color;
        dcn k2;
        dcn dcnVar;
        dcn dcnVar2;
        VkTooltip.TooltipGravity tooltipGravity;
        Hint hint2 = hint;
        Tooltip.f fVar = (Tooltip.f) izsVar.invoke(context);
        if (((Boolean) b.getValue()).booleanValue()) {
            VkTooltip.a aVar = new VkTooltip.a(context);
            String str = hint2.c;
            if (str == null) {
                str = "";
            }
            aVar.b = str;
            String str2 = hint2.d;
            aVar.c = str2 != null ? str2 : "";
            Integer num = fVar.h;
            if (num != null) {
                int intValue = num.intValue();
                tooltipGravity = intValue != 3 ? intValue != 5 ? intValue != 48 ? intValue != 80 ? VkTooltip.TooltipGravity.TOP : VkTooltip.TooltipGravity.BOTTOM : VkTooltip.TooltipGravity.TOP : VkTooltip.TooltipGravity.RIGHT : VkTooltip.TooltipGravity.LEFT;
            }
            tooltipGravity = VkTooltip.TooltipGravity.TOP;
            aVar.f = tooltipGravity;
            aVar.e = VkTooltip.Appearance.Neutral;
            aVar.g = true;
            aVar.h = false;
            aVar.i = false;
            aVar.n = new fl60(hint2, x6vVar);
            RectF rectF = (RectF) gzsVar.invoke();
            dcnVar2 = aVar.a(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        } else {
            String str3 = hint2.c;
            String str4 = hint2.d;
            boolean z3 = fVar.n;
            Integer num2 = fVar.f;
            Integer num3 = fVar.g;
            float f2 = fVar.e;
            Integer num4 = fVar.h;
            Integer num5 = fVar.i;
            gzs<View> gzsVar2 = fVar.o;
            gzs<View> gzsVar3 = fVar.p;
            int i2 = fVar.u;
            WeakReference weakReference = new WeakReference(view);
            int i3 = fVar.b;
            Integer num6 = fVar.c;
            if (num6 != null) {
                color = num6.intValue();
            } else {
                e3m.a aVar2 = e3m.a;
                color = context.getColor(R.color.vk_white);
            }
            bd0 bd0Var = new bd0(x6vVar, 13);
            gl60 gl60Var = new gl60(hint2, x6vVar);
            l7v b2 = pla.e().b();
            String str5 = hint2.b;
            b2.getClass();
            Tooltip tooltip = new Tooltip(context, str3, str4, null, null, null, new b1y(str5), i3, color, null, f2, num4, 0, false, null, 0, z3, gzsVar2, gzsVar3, null, onClickListener, bd0Var, null, gl60Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, num2, num5, true, i2, weakReference, num3, null, null, 55112248, 14);
            if (z) {
                dcnVar = tooltip.n(context, gzsVar, z2, viewGroup);
            } else {
                k2 = tooltip.k(context, (r15 & 2) != 0 ? true : z2, true, (r15 & 8) != 0, true, false, gzsVar, gzsVar);
                dcnVar = k2;
            }
            dcnVar2 = dcnVar;
            if (dcnVar2 == null) {
                return null;
            }
            hint2 = hint;
        }
        x6vVar.a(view, hint2.b);
        view.addOnAttachStateChangeListener(new b(view, dcnVar2));
        d = dcnVar2;
        h.put(hint2.b, dcnVar2);
        return dcnVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        if (r2.height() == r3.getHeight()) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(ArrayList arrayList, RecyclerView recyclerView, bzw bzwVar, ViewGroup viewGroup, int i2) {
        int i3;
        View view;
        Object q520Var = (i2 & 8) != 0 ? new q520(6) : bzwVar;
        ViewGroup viewGroup2 = (i2 & 16) != 0 ? null : viewGroup;
        Context context = recyclerView.getContext();
        if (context == null) {
            return;
        }
        Rect rect = l;
        rect.setEmpty();
        m.setEmpty();
        Rect rect2 = n;
        rect2.setEmpty();
        if (k()) {
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            dl60 dl60Var = (dl60) arrayList.get(i4);
            if (!a(dl60Var.a)) {
                if (rect2.isEmpty()) {
                    recyclerView.getGlobalVisibleRect(rect2);
                }
                int childCount = recyclerView.getChildCount();
                float f2 = Float.MAX_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = recyclerView.getChildAt(i5);
                    if (childAt != null) {
                        RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                        if (findContainingViewHolder != null && dl60Var.b.contains(Integer.valueOf(findContainingViewHolder.getItemViewType())) && ((Boolean) dl60Var.e.invoke(findContainingViewHolder)).booleanValue() && (view = (View) dl60Var.c.invoke(findContainingViewHolder, rect2)) != null && !f4m.g(view)) {
                            view.getGlobalVisibleRect(rect);
                            if (!rect.isEmpty()) {
                            }
                        }
                        view = null;
                        if (view != null) {
                            float centerX = rect.centerX() - rect2.centerX();
                            float centerY = rect.centerY() - rect2.centerY();
                            float sqrt = (float) Math.sqrt((centerY * centerY) + (centerX * centerX));
                            if (sqrt < f2) {
                                view2 = view;
                                f2 = sqrt;
                            }
                        }
                    }
                }
                if (view2 != null) {
                    i3 = i4;
                    a.e(context, view2, dl60Var.a, true, dl60Var.d, new xy0(15, q520Var, view2), null, dl60Var.g, viewGroup2);
                    i4 = i3 + 1;
                }
            }
            i3 = i4;
            i4 = i3 + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean k() {
        View b2;
        if (!((Boolean) c.getValue()).booleanValue()) {
            return false;
        }
        for (o7p0.a aVar : (List) k.getValue()) {
            n7p0 n7p0Var = (n7p0) i.get(aVar);
            if (n7p0Var != null && n7p0Var.c()) {
                if (!epx.f(aVar, o7p0.a.b)) {
                    return false;
                }
                String str = aVar.a;
                if (a(str) || (b2 = n7p0Var.b()) == null) {
                    return false;
                }
                Hint p = pla.e().b().p(str);
                String str2 = p != null ? p.c : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                if (drm0.N(str3)) {
                    return false;
                }
                d = j;
                m1y m1yVar = new m1y(n7p0Var, 16);
                lfa lfaVar = new lfa(10, n7p0Var, str);
                int i2 = m8v0.M;
                m8v0.a.a(b2, str3, m1yVar, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size56, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new o010(lfaVar, 15), new cww(lfaVar, 20), null, null, null, new xj2(str, 2), null, 0, false, null, null, false, null, dhr0.C().b, 5233696);
                return true;
            }
        }
        return false;
    }

    public final boolean e(Context context, View view, String str, boolean z, izs izsVar, gzs gzsVar, x6v x6vVar, ll60.b bVar, ViewGroup viewGroup) {
        Hint p;
        if (d != null || e.contains(str) || (p = pla.e().b().p(str)) == null) {
            return false;
        }
        return g(this, context, view, p, z, izsVar, true, gzsVar, x6vVar, bVar, viewGroup, 1024);
    }

    /* compiled from: NewsfeedHintHelper.kt */
    public static final class a implements dcn {
        @Override // xsna.dcn
        public final void dismiss() {
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ dcn c;

        public b(View view, dcn dcnVar) {
            this.b = view;
            this.c = dcnVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.dismiss();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
