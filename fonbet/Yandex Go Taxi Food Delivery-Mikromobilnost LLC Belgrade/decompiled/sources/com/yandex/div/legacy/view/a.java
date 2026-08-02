package com.yandex.div.legacy.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.alicekit.core.json.schema.HtmlString;
import com.yandex.div.legacy.util.Position;
import com.yandex.div.legacy.view.FitTableLayout;
import com.yandex.div.legacy.view.RatioImageView;
import com.yandex.div.legacy.view.a;
import com.yandex.div.legacy.widget.SeparatorView;
import defpackage.atg0;
import defpackage.ctk;
import defpackage.cty0;
import defpackage.d4x;
import defpackage.ddl;
import defpackage.edl;
import defpackage.fdl;
import defpackage.g8a1;
import defpackage.gdl;
import defpackage.ggk;
import defpackage.h2b;
import defpackage.hdl;
import defpackage.idl;
import defpackage.mj91;
import defpackage.n15;
import defpackage.pzf;
import defpackage.ut31;
import defpackage.x3k;
import defpackage.xdb1;
import defpackage.z83;
import defpackage.zq31;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class a extends ggk {
    public final Context a;
    public final ut31 b;
    public final h2b c;
    public final pzf d;
    public final int e = atg0.div_table_padding_xs;

    public a(Context context, ut31 ut31Var, h2b h2bVar, pzf pzfVar) {
        this.a = context;
        this.b = ut31Var;
        this.c = h2bVar;
        this.d = pzfVar;
        final int i = 0;
        final int i2 = 4;
        ut31Var.d("DivTableBlockViewBuilder.TABLE", new zq31(this) { // from class: jdl
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i3 = i;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        return new FitTableLayout(aVar.a);
                    case 1:
                        return new AppCompatTextView(aVar.a);
                    case 2:
                        return new RatioImageView(aVar.a);
                    case 3:
                        Context context2 = aVar.a;
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(17);
                        ImageView imageView = new ImageView(context2);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(atg0.div_table_image_size_m);
                        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                        appCompatTextView.setIncludeFontPadding(false);
                        appCompatTextView.setMaxLines(1);
                        linearLayout.addView(imageView);
                        linearLayout.addView(appCompatTextView);
                        return linearLayout;
                    default:
                        return new SeparatorView(aVar.a);
                }
            }
        }, 4);
        final int i3 = 1;
        ut31Var.d("DivTableBlockViewBuilder.TEXT", new zq31(this) { // from class: jdl
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i32 = i3;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        return new FitTableLayout(aVar.a);
                    case 1:
                        return new AppCompatTextView(aVar.a);
                    case 2:
                        return new RatioImageView(aVar.a);
                    case 3:
                        Context context2 = aVar.a;
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(17);
                        ImageView imageView = new ImageView(context2);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(atg0.div_table_image_size_m);
                        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                        appCompatTextView.setIncludeFontPadding(false);
                        appCompatTextView.setMaxLines(1);
                        linearLayout.addView(imageView);
                        linearLayout.addView(appCompatTextView);
                        return linearLayout;
                    default:
                        return new SeparatorView(aVar.a);
                }
            }
        }, 8);
        final int i4 = 2;
        ut31Var.d("DivTableBlockViewBuilder.IMAGE", new zq31(this) { // from class: jdl
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i32 = i4;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        return new FitTableLayout(aVar.a);
                    case 1:
                        return new AppCompatTextView(aVar.a);
                    case 2:
                        return new RatioImageView(aVar.a);
                    case 3:
                        Context context2 = aVar.a;
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(17);
                        ImageView imageView = new ImageView(context2);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(atg0.div_table_image_size_m);
                        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                        appCompatTextView.setIncludeFontPadding(false);
                        appCompatTextView.setMaxLines(1);
                        linearLayout.addView(imageView);
                        linearLayout.addView(appCompatTextView);
                        return linearLayout;
                    default:
                        return new SeparatorView(aVar.a);
                }
            }
        }, 8);
        final int i5 = 3;
        ut31Var.d("DivTableBlockViewBuilder.TEXT_AND_IMAGE", new zq31(this) { // from class: jdl
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i32 = i5;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        return new FitTableLayout(aVar.a);
                    case 1:
                        return new AppCompatTextView(aVar.a);
                    case 2:
                        return new RatioImageView(aVar.a);
                    case 3:
                        Context context2 = aVar.a;
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(17);
                        ImageView imageView = new ImageView(context2);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(atg0.div_table_image_size_m);
                        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                        appCompatTextView.setIncludeFontPadding(false);
                        appCompatTextView.setMaxLines(1);
                        linearLayout.addView(imageView);
                        linearLayout.addView(appCompatTextView);
                        return linearLayout;
                    default:
                        return new SeparatorView(aVar.a);
                }
            }
        }, 8);
        ut31Var.d("DivTableBlockViewBuilder.SEPARATOR", new zq31(this) { // from class: jdl
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i32 = i2;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        return new FitTableLayout(aVar.a);
                    case 1:
                        return new AppCompatTextView(aVar.a);
                    case 2:
                        return new RatioImageView(aVar.a);
                    case 3:
                        Context context2 = aVar.a;
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(17);
                        ImageView imageView = new ImageView(context2);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(atg0.div_table_image_size_m);
                        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                        appCompatTextView.setIncludeFontPadding(false);
                        appCompatTextView.setMaxLines(1);
                        linearLayout.addView(imageView);
                        linearLayout.addView(appCompatTextView);
                        return linearLayout;
                    default:
                        return new SeparatorView(aVar.a);
                }
            }
        }, 8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int c(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case 108:
                if (str.equals("l")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 109:
                if (str.equals("m")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case HProv.PP_CACHE_SIZE /* 115 */:
                if (str.equals("s")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3828:
                if (str.equals("xl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3835:
                if (str.equals("xs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 119148:
                if (str.equals("xxl")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 119155:
                if (str.equals("xxs")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3735208:
                if (str.equals("zero")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x030e  */
    /* JADX WARN: Type inference failed for: r13v7, types: [h2b] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.yandex.div.legacy.view.DivView] */
    /* JADX WARN: Type inference failed for: r3v43, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // defpackage.ggk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(DivView divView, n15 n15Var) {
        String str;
        String str2;
        ArrayList arrayList;
        d4x d4xVar;
        int i;
        char c;
        int i2;
        int i3;
        FitTableLayout fitTableLayout;
        int i4;
        edl edlVar;
        String str3;
        ArrayList arrayList2;
        int i5;
        int i6;
        LinearLayout.LayoutParams layoutParams;
        TextView textView;
        View view;
        String str4;
        String str5;
        FitTableLayout.LayoutParams layoutParams2;
        x3k x3kVar;
        int i7;
        int i8;
        idl idlVar = (idl) n15Var;
        ArrayList arrayList3 = idlVar.y;
        ArrayList arrayList4 = idlVar.x;
        Iterator it = arrayList3.iterator();
        int i9 = -1;
        int i10 = 0;
        while (true) {
            str = "separator_element";
            str2 = "row_element";
            if (it.hasNext()) {
                edl edlVar2 = (edl) it.next();
                String str6 = edlVar2.b;
                String str7 = edlVar2.b;
                d4x d4xVar2 = edlVar2.a;
                gdl gdlVar = "row_element".equals(str6) ? (gdl) d4xVar2 : null;
                hdl hdlVar = "separator_element".equals(str7) ? (hdl) d4xVar2 : null;
                if (gdlVar != null) {
                    ArrayList arrayList5 = gdlVar.b;
                    if (i9 == -1) {
                        i9 = arrayList5.size();
                    } else if (i9 != arrayList5.size()) {
                        z83.j("Found cells size inconsistency!");
                        break;
                    }
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        fdl fdlVar = (fdl) it2.next();
                        if (xdb1.e(fdlVar.y) || xdb1.d(fdlVar.c)) {
                            i10++;
                            break;
                        }
                    }
                } else if (hdlVar == null) {
                    z83.j("Unknown row type: " + str7);
                    break;
                }
            } else if (i9 != -1 && arrayList4 != null && arrayList4.size() != i9) {
                z83.j("Columns data doesn't matches cells size!");
            } else if (i10 == 0) {
                z83.j("No single data row was added!");
            }
        }
        i9 = -1;
        if (i9 <= 0) {
            return null;
        }
        ut31 ut31Var = this.b;
        FitTableLayout fitTableLayout2 = (FitTableLayout) ut31Var.b("DivTableBlockViewBuilder.TABLE");
        fitTableLayout2.setColumnCount(i9);
        g8a1.h(atg0.div_horizontal_padding, 2, fitTableLayout2);
        g8a1.h(atg0.div_horizontal_padding, 4, fitTableLayout2);
        fitTableLayout2.removeAllViews();
        int columnCount = fitTableLayout2.getColumnCount();
        ArrayList arrayList6 = idlVar.y;
        int size = arrayList6.size();
        ArrayList arrayList7 = new ArrayList();
        int i11 = 0;
        while (i11 < size) {
            edl edlVar3 = (edl) arrayList6.get(i11);
            String str8 = edlVar3.b;
            d4x d4xVar3 = edlVar3.a;
            gdl gdlVar2 = str2.equals(str8) ? (gdl) d4xVar3 : null;
            if (gdlVar2 != null) {
                ArrayList arrayList8 = gdlVar2.b;
                arrayList = arrayList6;
                d4xVar = d4xVar3;
                int i12 = 0;
                while (i12 < arrayList8.size()) {
                    ddl ddlVar = arrayList4 == null ? null : (ddl) arrayList4.get(i12);
                    int i13 = i12;
                    fdl fdlVar2 = (fdl) arrayList8.get(i12);
                    ArrayList arrayList9 = arrayList4;
                    HtmlString htmlString = fdlVar2.y;
                    ArrayList arrayList10 = arrayList8;
                    ctk ctkVar = fdlVar2.c;
                    boolean f = xdb1.f(htmlString, ctkVar);
                    String str9 = str2;
                    pzf pzfVar = this.d;
                    if (f) {
                        cty0 d = pzfVar.d(fdlVar2.z);
                        TextView textView2 = (TextView) ut31Var.b("DivTableBlockViewBuilder.TEXT");
                        i2 = size;
                        textView2.setMaxLines(1);
                        textView2.setIncludeFontPadding(false);
                        textView2.setText(htmlString);
                        d.a(textView2);
                        fitTableLayout = fitTableLayout2;
                        i4 = columnCount;
                        edlVar = edlVar3;
                        str3 = str;
                        arrayList2 = arrayList7;
                        i3 = i11;
                        textView = textView2;
                    } else {
                        i2 = size;
                        boolean e = xdb1.e(htmlString);
                        ?? r13 = this.c;
                        i3 = i11;
                        Context context = this.a;
                        if (e && xdb1.d(ctkVar)) {
                            fitTableLayout = fitTableLayout2;
                            ?? r3 = (LinearLayout) ut31Var.b("DivTableBlockViewBuilder.TEXT_AND_IMAGE");
                            i4 = columnCount;
                            ImageView imageView = (ImageView) r3.getChildAt(0);
                            str3 = str;
                            TextView textView3 = (TextView) r3.getChildAt(1);
                            edlVar = edlVar3;
                            arrayList2 = arrayList7;
                            if (mj91.a(fdlVar2.w) == Position.LEFT) {
                                layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                            } else {
                                r3.removeView(textView3);
                                r3.addView(textView3, 0);
                                layoutParams = (LinearLayout.LayoutParams) textView3.getLayoutParams();
                            }
                            layoutParams.rightMargin = context.getResources().getDimensionPixelSize(atg0.div_compound_drawable_padding);
                            textView3.setText(htmlString);
                            ((cty0) pzfVar.i).a(textView3);
                            divView.addLoadReference(r13.loadImage(ctkVar.a.toString(), imageView), imageView);
                            textView = r3;
                        } else {
                            fitTableLayout = fitTableLayout2;
                            i4 = columnCount;
                            edlVar = edlVar3;
                            str3 = str;
                            arrayList2 = arrayList7;
                            if (xdb1.e(htmlString) || !xdb1.d(ctkVar)) {
                                i5 = 0;
                                Space space = new Space(context);
                                space.setLayoutParams(new FitTableLayout.LayoutParams());
                                view = space;
                            } else {
                                String str10 = fdlVar2.x;
                                if (str10 == null) {
                                    i6 = atg0.div_table_image_size_m;
                                } else {
                                    int hashCode = str10.hashCode();
                                    if (hashCode != 108) {
                                        if (hashCode != 109) {
                                            if (hashCode != 115) {
                                                if (hashCode != 3828) {
                                                    if (hashCode != 3835) {
                                                        if (hashCode == 119148 && str10.equals("xxl")) {
                                                            i6 = atg0.div_table_image_size_xxl;
                                                        }
                                                    } else if (str10.equals("xs")) {
                                                        i6 = atg0.div_table_image_size_xs;
                                                    }
                                                } else if (str10.equals("xl")) {
                                                    i6 = atg0.div_table_image_size_xl;
                                                }
                                            } else if (str10.equals("s")) {
                                                i6 = atg0.div_table_image_size_s;
                                            }
                                        }
                                        i6 = atg0.div_table_image_size_m;
                                    } else {
                                        if (str10.equals("l")) {
                                            i6 = atg0.div_table_image_size_l;
                                        }
                                        i6 = atg0.div_table_image_size_m;
                                    }
                                }
                                RatioImageView ratioImageView = (RatioImageView) ut31Var.b("DivTableBlockViewBuilder.IMAGE");
                                i5 = 0;
                                ratioImageView.setApplyOn(0);
                                ratioImageView.setRatio(Float.valueOf(mj91.c(ctkVar)));
                                int dimensionPixelSize = context.getResources().getDimensionPixelSize(i6);
                                FitTableLayout.LayoutParams layoutParams3 = new FitTableLayout.LayoutParams();
                                ((ViewGroup.MarginLayoutParams) layoutParams3).height = dimensionPixelSize;
                                ratioImageView.setLayoutParams(layoutParams3);
                                divView.addLoadReference(r13.loadImage(ctkVar.a.toString(), ratioImageView), ratioImageView);
                                view = ratioImageView;
                            }
                            str4 = fdlVar2.A;
                            int i14 = 16;
                            if (str4 != null) {
                                switch (str4.hashCode()) {
                                    case -1383228885:
                                        if (str4.equals("bottom")) {
                                            i8 = i5;
                                            break;
                                        }
                                        i8 = -1;
                                        break;
                                    case -1364013995:
                                        if (str4.equals("center")) {
                                            i8 = 1;
                                            break;
                                        }
                                        i8 = -1;
                                        break;
                                    case 115029:
                                        if (str4.equals("top")) {
                                            i8 = 2;
                                            break;
                                        }
                                        i8 = -1;
                                        break;
                                    default:
                                        i8 = -1;
                                        break;
                                }
                                switch (i8) {
                                    case 0:
                                        i14 = 80;
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        i14 = 48;
                                        break;
                                    default:
                                        z83.j("Unknown vertical alignment: ".concat(str4));
                                        break;
                                }
                            }
                            str5 = fdlVar2.b;
                            int i15 = 3;
                            if (str5 != null) {
                                switch (str5.hashCode()) {
                                    case -1364013995:
                                        if (str5.equals("center")) {
                                            i7 = i5;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case 3317767:
                                        if (str5.equals("left")) {
                                            i7 = 1;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    case 108511772:
                                        if (str5.equals("right")) {
                                            i7 = 2;
                                            break;
                                        }
                                        i7 = -1;
                                        break;
                                    default:
                                        i7 = -1;
                                        break;
                                }
                                switch (i7) {
                                    case 0:
                                        i15 = 1;
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        i15 = 5;
                                        break;
                                    default:
                                        z83.j("Unknown alignment: ".concat(str5));
                                        break;
                                }
                            }
                            int i16 = i14 | i15;
                            int i17 = ddlVar != null ? i5 : ddlVar.c;
                            layoutParams2 = (FitTableLayout.LayoutParams) view.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new FitTableLayout.LayoutParams();
                            }
                            layoutParams2.gravity = i16;
                            layoutParams2.weight = i17;
                            view.setLayoutParams(layoutParams2);
                            x3kVar = fdlVar2.a;
                            if (x3kVar != null) {
                                divView.setActionHandlerForView(view, x3kVar);
                            }
                            int i18 = this.e;
                            int c2 = ddlVar == null ? c(ddlVar.a) : i18;
                            if (ddlVar == null) {
                                i18 = c(ddlVar.b);
                            }
                            FitTableLayout.LayoutParams layoutParams4 = (FitTableLayout.LayoutParams) view.getLayoutParams();
                            Resources resources = view.getResources();
                            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = resources.getDimensionPixelSize(c2);
                            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = resources.getDimensionPixelSize(i18);
                            int c3 = c(gdlVar2.c);
                            int c4 = c(gdlVar2.a);
                            FitTableLayout.LayoutParams layoutParams5 = (FitTableLayout.LayoutParams) view.getLayoutParams();
                            Resources resources2 = view.getResources();
                            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = resources2.getDimensionPixelSize(c3);
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = resources2.getDimensionPixelSize(c4);
                            ArrayList arrayList11 = arrayList2;
                            arrayList11.add(view);
                            arrayList7 = arrayList11;
                            i12 = i13 + 1;
                            arrayList4 = arrayList9;
                            arrayList8 = arrayList10;
                            size = i2;
                            str2 = str9;
                            edlVar3 = edlVar;
                            fitTableLayout2 = fitTableLayout;
                            i11 = i3;
                            columnCount = i4;
                            str = str3;
                        }
                    }
                    i5 = 0;
                    view = textView;
                    str4 = fdlVar2.A;
                    int i142 = 16;
                    if (str4 != null) {
                    }
                    str5 = fdlVar2.b;
                    int i152 = 3;
                    if (str5 != null) {
                    }
                    int i162 = i142 | i152;
                    if (ddlVar != null) {
                    }
                    layoutParams2 = (FitTableLayout.LayoutParams) view.getLayoutParams();
                    if (layoutParams2 == null) {
                    }
                    layoutParams2.gravity = i162;
                    layoutParams2.weight = i17;
                    view.setLayoutParams(layoutParams2);
                    x3kVar = fdlVar2.a;
                    if (x3kVar != null) {
                    }
                    int i182 = this.e;
                    if (ddlVar == null) {
                    }
                    if (ddlVar == null) {
                    }
                    FitTableLayout.LayoutParams layoutParams42 = (FitTableLayout.LayoutParams) view.getLayoutParams();
                    Resources resources3 = view.getResources();
                    ((ViewGroup.MarginLayoutParams) layoutParams42).leftMargin = resources3.getDimensionPixelSize(c2);
                    ((ViewGroup.MarginLayoutParams) layoutParams42).rightMargin = resources3.getDimensionPixelSize(i182);
                    int c32 = c(gdlVar2.c);
                    int c42 = c(gdlVar2.a);
                    FitTableLayout.LayoutParams layoutParams52 = (FitTableLayout.LayoutParams) view.getLayoutParams();
                    Resources resources22 = view.getResources();
                    ((ViewGroup.MarginLayoutParams) layoutParams52).topMargin = resources22.getDimensionPixelSize(c32);
                    ((ViewGroup.MarginLayoutParams) layoutParams52).bottomMargin = resources22.getDimensionPixelSize(c42);
                    ArrayList arrayList112 = arrayList2;
                    arrayList112.add(view);
                    arrayList7 = arrayList112;
                    i12 = i13 + 1;
                    arrayList4 = arrayList9;
                    arrayList8 = arrayList10;
                    size = i2;
                    str2 = str9;
                    edlVar3 = edlVar;
                    fitTableLayout2 = fitTableLayout;
                    i11 = i3;
                    columnCount = i4;
                    str = str3;
                }
            } else {
                arrayList = arrayList6;
                d4xVar = d4xVar3;
            }
            FitTableLayout fitTableLayout3 = fitTableLayout2;
            ArrayList arrayList12 = arrayList4;
            int i19 = columnCount;
            String str11 = str;
            String str12 = str2;
            int i20 = size;
            ArrayList arrayList13 = arrayList7;
            int i21 = i11;
            hdl hdlVar2 = str11.equals(edlVar3.b) ? (hdl) d4xVar : null;
            if (hdlVar2 != null) {
                SeparatorView separatorView = (SeparatorView) ut31Var.b("DivTableBlockViewBuilder.SEPARATOR");
                separatorView.setDividerHeightResource(atg0.div_separator_delimiter_height);
                separatorView.setDividerColor(hdlVar2.a);
                g8a1.h(atg0.div_table_padding_xxs, 8, separatorView);
                c = 65535;
                FitTableLayout.LayoutParams layoutParams6 = new FitTableLayout.LayoutParams(-1, -2);
                i = i19;
                layoutParams6.span = i;
                separatorView.setLayoutParams(layoutParams6);
                arrayList13.add(separatorView);
            } else {
                i = i19;
                c = 65535;
            }
            i11 = i21 + 1;
            arrayList7 = arrayList13;
            str = str11;
            columnCount = i;
            arrayList6 = arrayList;
            arrayList4 = arrayList12;
            size = i20;
            str2 = str12;
            fitTableLayout2 = fitTableLayout3;
        }
        FitTableLayout fitTableLayout4 = fitTableLayout2;
        Iterator it3 = arrayList7.iterator();
        while (it3.hasNext()) {
            fitTableLayout4.addView((View) it3.next());
        }
        return fitTableLayout4;
    }
}
