package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class aun extends bun {
    public final Context b;
    public final View c;
    public final List d;
    public final LinearLayout e;
    public final View.OnClickListener f;
    public boolean g = true;

    public aun(Context context, View view, List list, LinearLayout linearLayout, View.OnClickListener onClickListener) {
        this.b = context;
        this.c = view;
        this.d = list;
        this.e = linearLayout;
        this.f = onClickListener;
        k();
    }

    @Override // defpackage.bun
    public final void b() {
        Context context = this.b;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        AppCompatImageView appCompatImageView = (AppCompatImageView) View.inflate(context, gth0.emoji_picker_popup_bidirectional, linearLayout).findViewById(f7h0.emoji_picker_popup_bidirectional_icon);
        View view = this.c;
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        this.e.addView(linearLayout);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) linearLayout.findViewById(f7h0.emoji_picker_popup_bidirectional_icon);
        appCompatImageView2.setOnClickListener(new vsn(1, this, appCompatImageView2));
    }

    @Override // defpackage.bun
    public final Context d() {
        return this.b;
    }

    @Override // defpackage.bun
    public final View.OnClickListener e() {
        return this.f;
    }

    @Override // defpackage.bun
    public final int f() {
        return 6;
    }

    @Override // defpackage.bun
    public final int g() {
        return ((this.d.size() / 2) / 6) + 1;
    }

    @Override // defpackage.bun
    public final LinearLayout h() {
        return this.e;
    }

    @Override // defpackage.bun
    public final View i() {
        return this.c;
    }

    @Override // defpackage.bun
    public final List j() {
        return this.d;
    }

    public final void k() {
        int[][] iArr;
        boolean z = this.g;
        List list = this.d;
        if (z) {
            d6w e = scc.e(list);
            ArrayList arrayList = new ArrayList();
            c6w it = e.iterator();
            while (it.c) {
                Object next = it.next();
                if (((Number) next).intValue() % 12 < 6) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) it2.next()).intValue() + 1));
            }
            iArr = new int[][]{a.I0(arrayList2)};
        } else {
            d6w e2 = scc.e(list);
            ArrayList arrayList3 = new ArrayList();
            c6w it3 = e2.iterator();
            while (it3.c) {
                Object next2 = it3.next();
                if (((Number) next2).intValue() % 12 >= 6) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(((Number) it4.next()).intValue() + 1));
            }
            iArr = new int[][]{a.I0(arrayList4)};
        }
        this.a = iArr;
        int g = g() - 1;
        int[][] iArr2 = new int[g][];
        for (int i = 0; i < g; i++) {
            iArr2[i] = new int[6];
        }
        int i2 = 0;
        for (int i3 = 0; i3 < g; i3++) {
            for (int i4 = 0; i4 < 6; i4++) {
                int[][] iArr3 = this.a;
                if (i2 < (iArr3 != null ? iArr3 : null)[0].length) {
                    int[] iArr4 = iArr2[i3];
                    if (iArr3 == null) {
                        iArr3 = null;
                    }
                    iArr4[i4] = iArr3[0][i2];
                    i2++;
                }
            }
        }
        this.a = iArr2;
    }
}
