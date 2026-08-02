package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.div.legacy.BackgroundImageDrawable;
import com.yandex.div.legacy.view.ContainerBorderLayout;
import com.yandex.div.legacy.view.ContainerShadowLayout;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.RoundedCornersWithStrokeLayout;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class cee extends ggk {
    public final Context a;
    public final ut31 b;
    public final h2b c;
    public final g3y d;

    public cee(Context context, ut31 ut31Var, h2b h2bVar, g3y g3yVar) {
        this.a = context;
        this.b = ut31Var;
        this.c = h2bVar;
        this.d = g3yVar;
        final int i = 0;
        ut31Var.d("ContainerDivBlockViewBuilder.CONTAINER", new zq31(this) { // from class: bee
            public final /* synthetic */ cee b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i2 = i;
                cee ceeVar = this.b;
                switch (i2) {
                    case 0:
                        return new LinearLayout(ceeVar.a);
                    case 1:
                        return new ContainerShadowLayout(ceeVar.a);
                    default:
                        return new ContainerBorderLayout(ceeVar.a);
                }
            }
        }, 4);
        final int i2 = 1;
        ut31Var.d("ContainerDivBlockViewBuilder.SHADOW_FRAME", new zq31(this) { // from class: bee
            public final /* synthetic */ cee b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i22 = i2;
                cee ceeVar = this.b;
                switch (i22) {
                    case 0:
                        return new LinearLayout(ceeVar.a);
                    case 1:
                        return new ContainerShadowLayout(ceeVar.a);
                    default:
                        return new ContainerBorderLayout(ceeVar.a);
                }
            }
        }, 4);
        final int i3 = 2;
        ut31Var.d("ContainerDivBlockViewBuilder.BORDER_FRAME", new zq31(this) { // from class: bee
            public final /* synthetic */ cee b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i22 = i3;
                cee ceeVar = this.b;
                switch (i22) {
                    case 0:
                        return new LinearLayout(ceeVar.a);
                    case 1:
                        return new ContainerShadowLayout(ceeVar.a);
                    default:
                        return new ContainerBorderLayout(ceeVar.a);
                }
            }
        }, 4);
    }

    public static int c(DivView divView, n0l n0lVar, b5l b5lVar) {
        if (n0lVar != null) {
            return mj91.b(n0lVar, divView.getResources().getDisplayMetrics());
        }
        if (b5lVar == null) {
            z83.j("No size defined");
            return -1;
        }
        String str = b5lVar.a;
        if ("wrap_content".equals(str)) {
            return -2;
        }
        if ("match_parent".equals(str)) {
            return -1;
        }
        z83.j("No predefined size");
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x009e, code lost:
    
        if (r15.equals("top") == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fb A[SYNTHETIC] */
    @Override // defpackage.ggk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(DivView divView, n15 n15Var) {
        boolean z;
        int i;
        ViewGroup viewGroup;
        int i2;
        Object gradientDrawable;
        Object obj;
        LinearLayout.LayoutParams layoutParams;
        View a;
        ArrayList arrayList;
        zjk zjkVar = (zjk) n15Var;
        ut31 ut31Var = this.b;
        LinearLayout linearLayout = (LinearLayout) ut31Var.b("ContainerDivBlockViewBuilder.CONTAINER");
        r9l r9lVar = zjkVar.F;
        String str = zjkVar.B;
        int c = c(divView, r9lVar.a(), zjkVar.F.b());
        r9l r9lVar2 = zjkVar.D;
        int c2 = c(divView, r9lVar2.a(), r9lVar2.b());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(c, c2);
        if (c == -1 || c2 == -1) {
            layoutParams2.weight = 1.0f;
        }
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation("vertical".equals(str) ? 1 : 0);
        String str2 = zjkVar.x;
        str2.getClass();
        char c3 = 2;
        switch (str2.hashCode()) {
            case -1364013995:
                if (str2.equals("center")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 3317767:
                if (str2.equals("left")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 108511772:
                if (str2.equals("right")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                i = 1;
                break;
            case true:
                i = 3;
                break;
            case true:
                i = 5;
                break;
            default:
                z83.j("Unsupported container gravity");
                i = 0;
                break;
        }
        String str3 = zjkVar.y;
        str3.getClass();
        switch (str3.hashCode()) {
            case -1383228885:
                if (str3.equals("bottom")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1364013995:
                if (str3.equals("center")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 115029:
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                i |= 80;
                break;
            case 1:
                i |= 16;
                break;
            case 2:
                i |= 48;
                break;
            default:
                z83.j("Unsupported container gravity");
                break;
        }
        linearLayout.setGravity(i);
        yol yolVar = (yol) this.d.get();
        String e = zjkVar.e();
        yolVar.getClass();
        ArrayList arrayList2 = zjkVar.A;
        xol xolVar = new xol(yolVar, divView, e);
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            yjk yjkVar = (yjk) arrayList2.get(i3);
            String str4 = yjkVar.b;
            String str5 = yjkVar.b;
            n15 n15Var2 = yjkVar.a;
            shk shkVar = "div-buttons-block".equals(str4) ? (shk) n15Var2 : null;
            int i4 = size;
            yol yolVar2 = xolVar.d;
            if (shkVar != null) {
                if (!shkVar.z.isEmpty()) {
                    a = xolVar.a(shkVar, yolVar2.a);
                }
                a = null;
            } else {
                hrk hrkVar = "div-footer-block".equals(str4) ? (hrk) n15Var2 : null;
                if (hrkVar != null) {
                    a = xolVar.a(hrkVar, yolVar2.c);
                } else {
                    ysk yskVar = "div-image-block".equals(str4) ? (ysk) n15Var2 : null;
                    if (yskVar != null) {
                        if (xdb1.d(yskVar.x)) {
                            a = xolVar.a(yskVar, yolVar2.e);
                        }
                        a = null;
                    } else {
                        h8l h8lVar = "div-separator-block".equals(str4) ? (h8l) n15Var2 : null;
                        if (h8lVar != null) {
                            a = xolVar.a(h8lVar, yolVar2.f);
                        } else {
                            idl idlVar = "div-table-block".equals(str4) ? (idl) n15Var2 : null;
                            if (idlVar != null) {
                                a = xolVar.a(idlVar, yolVar2.g);
                            } else {
                                eil eilVar = "div-title-block".equals(str4) ? (eil) n15Var2 : null;
                                if (eilVar != null) {
                                    if (!TextUtils.isEmpty(eilVar.z) || ((arrayList = eilVar.y) != null && !arrayList.isEmpty())) {
                                        a = xolVar.a(eilVar, yolVar2.i);
                                    }
                                    a = null;
                                } else {
                                    ljl ljlVar = "div-traffic-block".equals(str4) ? (ljl) n15Var2 : null;
                                    if (ljlVar != null) {
                                        a = xolVar.b(ljlVar);
                                    } else {
                                        rml rmlVar = "div-universal-block".equals(str4) ? (rml) n15Var2 : null;
                                        if (rmlVar != null) {
                                            a = xolVar.a(rmlVar, yolVar2.k);
                                        } else {
                                            zjk zjkVar2 = "div-container-block".equals(str5) ? (zjk) n15Var2 : null;
                                            if (zjkVar2 != null) {
                                                a = xolVar.a(zjkVar2, yolVar2.b);
                                            } else {
                                                rrk rrkVar = "div-gallery-block".equals(str5) ? (rrk) n15Var2 : null;
                                                if (rrkVar != null) {
                                                    a = xolVar.a(rrkVar, yolVar2.d);
                                                } else {
                                                    z83.j("Unknown div block got ".concat(yjkVar.toString()));
                                                    a = null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            xolVar.c++;
            if (a != null) {
                linearLayout.addView(a);
            }
            i3++;
            size = i4;
        }
        int i5 = 1;
        for (int i6 = 0; i6 < linearLayout.getChildCount(); i6++) {
            View childAt = linearLayout.getChildAt(i6);
            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
            if ("horizontal".equals(str)) {
                layoutParams = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : new LinearLayout.LayoutParams(layoutParams3);
                layoutParams.weight = layoutParams.width == -1 ? 1.0f : layoutParams.weight;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                childAt.setLayoutParams(layoutParams);
            }
        }
        ArrayList<lfk> arrayList3 = zjkVar.z;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            for (lfk lfkVar : arrayList3) {
                if (lfkVar != null) {
                    d4x d4xVar = lfkVar.a;
                    String str6 = lfkVar.b;
                    xal xalVar = "div-solid-background".equals(str6) ? (xal) d4xVar : null;
                    if (xalVar != null) {
                        gradientDrawable = new ColorDrawable(xalVar.a);
                    } else {
                        esk eskVar = "div-gradient-background".equals(str6) ? (esk) d4xVar : null;
                        if (eskVar != null) {
                            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{eskVar.b, eskVar.a});
                        } else {
                            ssk sskVar = "div-image-background".equals(str6) ? (ssk) d4xVar : null;
                            if (sskVar != null) {
                                String uri = sskVar.a.toString();
                                BackgroundImageDrawable backgroundImageDrawable = new BackgroundImageDrawable(divView.getContext());
                                i2 = i5;
                                divView.addLoadReference(this.c.loadImage(uri, new zsk(i2, new tpl(divView, backgroundImageDrawable, 0)), 0), divView);
                                obj = backgroundImageDrawable;
                                if (obj != null) {
                                    arrayList4.add(obj);
                                }
                                i5 = i2;
                            }
                        }
                    }
                    i2 = i5;
                    obj = gradientDrawable;
                    if (obj != null) {
                    }
                    i5 = i2;
                }
                i2 = i5;
                obj = null;
                if (obj != null) {
                }
                i5 = i2;
            }
            if (!arrayList4.isEmpty()) {
                linearLayout.setBackground(new LayerDrawable((Drawable[]) arrayList4.toArray(new Drawable[arrayList4.size()])));
            }
        }
        xjg xjgVar = zjkVar.C;
        if (xjgVar == null) {
            viewGroup = null;
        } else {
            String str7 = (String) xjgVar.c;
            if ("shadow".equals(str7)) {
                viewGroup = (ViewGroup) ut31Var.b("ContainerDivBlockViewBuilder.SHADOW_FRAME");
            } else {
                RoundedCornersWithStrokeLayout roundedCornersWithStrokeLayout = (RoundedCornersWithStrokeLayout) ut31Var.b("ContainerDivBlockViewBuilder.BORDER_FRAME");
                if ("only_round_corners".equals(str7)) {
                    roundedCornersWithStrokeLayout.setStrokeWidth(0);
                    viewGroup = roundedCornersWithStrokeLayout;
                } else {
                    Integer num = (Integer) xjgVar.b;
                    viewGroup = roundedCornersWithStrokeLayout;
                    if (num != null) {
                        roundedCornersWithStrokeLayout.setStrokeColor(num.intValue());
                        viewGroup = roundedCornersWithStrokeLayout;
                    }
                }
            }
        }
        if (viewGroup == null) {
            return linearLayout;
        }
        viewGroup.setLayoutParams(layoutParams2);
        viewGroup.addView(linearLayout);
        return viewGroup;
    }
}
