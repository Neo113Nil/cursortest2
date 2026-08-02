package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class eun extends bun {
    public static final int[][] h = {new int[]{0, 2, 3, 4, 5, 6}, new int[]{0, 7, 8, 9, 10, 11}, new int[]{0, 12, 13, 14, 15, 16}, new int[]{0, 17, 18, 19, 20, 21}, new int[]{1, 22, 23, 24, 25, 26}};
    public final /* synthetic */ int b;
    public final Context c;
    public final View d;
    public final List e;
    public final LinearLayout f;
    public final View.OnClickListener g;

    public eun(Context context, View view, List list, LinearLayout linearLayout, View.OnClickListener onClickListener, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = context;
                this.d = view;
                this.e = list;
                this.f = linearLayout;
                this.g = onClickListener;
                d6w e = scc.e(list);
                ArrayList arrayList = new ArrayList(tcc.n(e, 10));
                c6w it = e.iterator();
                while (it.c) {
                    arrayList.add(Integer.valueOf(it.nextInt() + 1));
                }
                this.a = new int[][]{a.I0(arrayList)};
                int g = g();
                int f = f();
                int[][] iArr = new int[g][];
                for (int i2 = 0; i2 < g; i2++) {
                    iArr[i2] = new int[f];
                }
                int i3 = 0;
                for (int i4 = 0; i4 < g; i4++) {
                    for (int i5 = 0; i5 < f; i5++) {
                        int[][] iArr2 = this.a;
                        if (i3 < (iArr2 != null ? iArr2 : null)[0].length) {
                            iArr[i4][i5] = (iArr2 == null ? null : iArr2)[0][i3];
                            i3++;
                        }
                    }
                }
                this.a = iArr;
                break;
            default:
                this.c = context;
                this.d = view;
                this.e = list;
                this.f = linearLayout;
                this.g = onClickListener;
                this.a = h;
                break;
        }
    }

    @Override // defpackage.bun
    public final Context d() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // defpackage.bun
    public final View.OnClickListener e() {
        switch (this.b) {
        }
        return this.g;
    }

    @Override // defpackage.bun
    public final int f() {
        switch (this.b) {
            case 0:
                return h[0].length;
            default:
                int[][] iArr = this.a;
                if (iArr == null) {
                    iArr = null;
                }
                return Math.min(6, iArr[0].length);
        }
    }

    @Override // defpackage.bun
    public final int g() {
        switch (this.b) {
            case 0:
                return 5;
            default:
                int f = f();
                List list = this.e;
                return (list.size() / f) + (list.size() % f == 0 ? 0 : 1);
        }
    }

    @Override // defpackage.bun
    public final LinearLayout h() {
        switch (this.b) {
        }
        return this.f;
    }

    @Override // defpackage.bun
    public final View i() {
        switch (this.b) {
        }
        return this.d;
    }

    @Override // defpackage.bun
    public final List j() {
        switch (this.b) {
        }
        return this.e;
    }
}
