package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.alicekit.core.json.schema.HtmlString;
import com.yandex.div.legacy.Alignment;
import com.yandex.div.legacy.view.DivView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class i57 extends xok {
    public final Context a;
    public final ut31 b;
    public final h2b c;
    public final pzf d;

    public i57(Context context, ut31 ut31Var, h2b h2bVar, pzf pzfVar) {
        this.a = context;
        this.b = ut31Var;
        this.c = h2bVar;
        this.d = pzfVar;
        final int i = 0;
        ut31Var.d("ButtonsDivBlockViewBuilder.TEXT_BUTTON", new zq31(this) { // from class: d57
            public final /* synthetic */ i57 b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i2 = i;
                i57 i57Var = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = i57Var.a;
                        TextView textView = new TextView(context2, null, gng0.legacyButtonTextStyle);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, context2.getResources().getDimensionPixelSize(atg0.div_button_height)));
                        return textView;
                    case 1:
                        Context context3 = i57Var.a;
                        ImageView imageView = new ImageView(context3, null, gng0.legacyButtonImageStyle);
                        int dimensionPixelSize = context3.getResources().getDimensionPixelSize(atg0.div_button_height);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        return imageView;
                    default:
                        FrameLayout frameLayout = new FrameLayout(i57Var.a);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 17;
                        frameLayout.setLayoutParams(layoutParams);
                        return frameLayout;
                }
            }
        }, 8);
        final int i2 = 1;
        ut31Var.d("ButtonsDivBlockViewBuilder.IMAGE_BUTTON", new zq31(this) { // from class: d57
            public final /* synthetic */ i57 b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i22 = i2;
                i57 i57Var = this.b;
                switch (i22) {
                    case 0:
                        Context context2 = i57Var.a;
                        TextView textView = new TextView(context2, null, gng0.legacyButtonTextStyle);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, context2.getResources().getDimensionPixelSize(atg0.div_button_height)));
                        return textView;
                    case 1:
                        Context context3 = i57Var.a;
                        ImageView imageView = new ImageView(context3, null, gng0.legacyButtonImageStyle);
                        int dimensionPixelSize = context3.getResources().getDimensionPixelSize(atg0.div_button_height);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        return imageView;
                    default:
                        FrameLayout frameLayout = new FrameLayout(i57Var.a);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 17;
                        frameLayout.setLayoutParams(layoutParams);
                        return frameLayout;
                }
            }
        }, 8);
        final int i3 = 2;
        ut31Var.d("ButtonsDivBlockViewBuilder.BUTTON_WRAPPER", new zq31(this) { // from class: d57
            public final /* synthetic */ i57 b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i22 = i3;
                i57 i57Var = this.b;
                switch (i22) {
                    case 0:
                        Context context2 = i57Var.a;
                        TextView textView = new TextView(context2, null, gng0.legacyButtonTextStyle);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, context2.getResources().getDimensionPixelSize(atg0.div_button_height)));
                        return textView;
                    case 1:
                        Context context3 = i57Var.a;
                        ImageView imageView = new ImageView(context3, null, gng0.legacyButtonImageStyle);
                        int dimensionPixelSize = context3.getResources().getDimensionPixelSize(atg0.div_button_height);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                        return imageView;
                    default:
                        FrameLayout frameLayout = new FrameLayout(i57Var.a);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 17;
                        frameLayout.setLayoutParams(layoutParams);
                        return frameLayout;
                }
            }
        }, 8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [i57] */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.View, com.yandex.div.legacy.view.DivView] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // defpackage.ggk
    public final View a(DivView divView, n15 n15Var) {
        ?? arrayList;
        char c;
        Alignment alignment;
        shk shkVar = (shk) n15Var;
        ArrayList arrayList2 = shkVar.z;
        if (arrayList2.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                rhk rhkVar = (rhk) it.next();
                if (xdb1.d(rhkVar.c) || xdb1.e(rhkVar.w)) {
                    arrayList.add(rhkVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String str = shkVar.x;
        boolean z = false;
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    alignment = Alignment.CENTER;
                    break;
                case 1:
                    alignment = Alignment.LEFT;
                    break;
                case 2:
                    alignment = Alignment.RIGHT;
                    break;
                default:
                    z83.j("Unknown alignment: ".concat(str));
                    alignment = Alignment.LEFT;
                    break;
            }
        } else {
            alignment = Alignment.LEFT;
        }
        if (arrayList.size() != 1) {
            Context context = divView.getContext();
            RecyclerView recyclerView = new RecyclerView(context);
            recyclerView.setId(ogh0.div_buttons);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.b2(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.addItemDecoration(new f57(context.getResources()));
            recyclerView.setAdapter(new h57(this, divView, arrayList));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = e57.a[alignment.ordinal()];
            if (i == 1) {
                layoutParams.gravity = 8388611;
            } else if (i == 2) {
                layoutParams.gravity = 1;
                layoutParams.width = -2;
            } else if (i != 3) {
                z83.j("Unknown value");
            } else {
                layoutParams.gravity = 8388613;
                layoutParams.width = -2;
            }
            layoutParams.gravity |= 16;
            recyclerView.setLayoutParams(layoutParams);
            return recyclerView;
        }
        rhk rhkVar2 = (rhk) arrayList2.get(0);
        HtmlString htmlString = rhkVar2.w;
        ctk ctkVar = rhkVar2.c;
        if (!xdb1.e(htmlString) && xdb1.d(ctkVar)) {
            z = true;
        }
        ut31 ut31Var = this.b;
        View b = ut31Var.b(z ? "ButtonsDivBlockViewBuilder.IMAGE_BUTTON" : "ButtonsDivBlockViewBuilder.TEXT_BUTTON");
        if (shkVar.y) {
            FrameLayout frameLayout = (FrameLayout) ut31Var.b("ButtonsDivBlockViewBuilder.BUTTON_WRAPPER");
            h(divView, b, rhkVar2);
            g(divView, frameLayout, rhkVar2);
            b.setBackground(null);
            ((FrameLayout.LayoutParams) b.getLayoutParams()).gravity = 1;
            frameLayout.addView(b);
            b = frameLayout;
        } else {
            h(divView, b, rhkVar2);
            g(divView, b, rhkVar2);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b.getLayoutParams();
            int i2 = e57.a[alignment.ordinal()];
            if (i2 == 1) {
                layoutParams2.gravity = 8388611;
            } else if (i2 == 2) {
                layoutParams2.gravity = 1;
            } else if (i2 != 3) {
                z83.j("Unknown value");
            } else {
                layoutParams2.gravity = 8388613;
            }
        }
        Resources resources = b.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(atg0.div_horizontal_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(atg0.div_button_text_vertical_padding);
        FrameLayout frameLayout2 = new FrameLayout(b.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = dimensionPixelOffset;
        layoutParams3.rightMargin = dimensionPixelOffset;
        layoutParams3.topMargin = dimensionPixelOffset2;
        layoutParams3.bottomMargin = dimensionPixelOffset2;
        frameLayout2.setLayoutParams(layoutParams3);
        frameLayout2.addView(b);
        divView.setActionHandlerForView(frameLayout2, rhkVar2.a);
        return frameLayout2;
    }

    public final void g(DivView divView, View view, rhk rhkVar) {
        Drawable drawable = this.a.getDrawable(fzg0.button_background);
        if (drawable == null) {
            drawable = null;
        } else {
            drawable.setTint(rhkVar.b);
        }
        view.setBackground(drawable);
        divView.setActionHandlerForView(view, rhkVar.a);
    }

    public final void h(DivView divView, View view, rhk rhkVar) {
        HtmlString htmlString = rhkVar.w;
        ctk ctkVar = rhkVar.c;
        boolean z = !xdb1.e(htmlString) && xdb1.d(ctkVar);
        HtmlString htmlString2 = rhkVar.w;
        if (z) {
            ImageView imageView = (ImageView) view;
            divView.addLoadReference(this.c.loadImage(ctkVar.a.toString(), imageView), imageView);
            return;
        }
        TextView textView = (TextView) view;
        this.d.d("text_m").a(textView);
        textView.setTextAlignment(1);
        if (xdb1.f(htmlString2, ctkVar)) {
            textView.setText(htmlString2);
            return;
        }
        if (xdb1.e(htmlString2) && xdb1.d(ctkVar)) {
            ctk ctkVar2 = rhkVar.c;
            int i = atg0.div_button_text_horizontal_image_padding;
            int i2 = atg0.div_button_text_horizontal_padding;
            int i3 = atg0.div_button_image_size;
            xok.c(divView, this.c, textView, htmlString2, ctkVar2, i, i2, i3, i3);
        }
    }
}
