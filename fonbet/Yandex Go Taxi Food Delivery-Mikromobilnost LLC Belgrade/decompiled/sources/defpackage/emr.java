package defpackage;

import androidx.recyclerview.widget.FlexStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.g1;
import com.yandex.go.flex.screens.common.flexible.layout.manager.FlexibleGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class emr {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int[] g;
    public final /* synthetic */ RecyclerView.e h;

    public emr(FlexibleGridLayoutManager flexibleGridLayoutManager) {
        this.a = 1;
        this.h = flexibleGridLayoutManager;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.g = new int[0];
    }

    public void a() {
        boolean z = this.d;
        d0 d0Var = ((StaggeredGridLayoutManager) this.h).L;
        this.c = z ? d0Var.g() : d0Var.k();
    }

    public void b(int i) {
        boolean z = this.d;
        d0 d0Var = ((StaggeredGridLayoutManager) this.h).L;
        if (z) {
            this.c = d0Var.g() - i;
        } else {
            this.c = d0Var.k() + i;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                this.b = -1;
                this.c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                this.f = false;
                int[] iArr = this.g;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                    break;
                }
                break;
            case 1:
                this.b = -1;
                this.c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                this.f = false;
                this.g = new int[0];
                break;
            default:
                this.b = -1;
                this.c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                this.f = false;
                int[] iArr2 = this.g;
                if (iArr2 != null) {
                    Arrays.fill(iArr2, -1);
                    break;
                }
                break;
        }
    }

    public void d(g1[] g1VarArr) {
        int length = g1VarArr.length;
        int[] iArr = this.g;
        if (iArr == null || iArr.length < length) {
            this.g = new int[((StaggeredGridLayoutManager) this.h).K.length];
        }
        for (int i = 0; i < length; i++) {
            this.g[i] = g1VarArr[i].o(Integer.MIN_VALUE);
        }
    }

    public emr(FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager) {
        this.a = 0;
        this.h = flexStaggeredGridLayoutManager;
        c();
    }

    public emr(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.a = 2;
        this.h = staggeredGridLayoutManager;
        c();
    }
}
