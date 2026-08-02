package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dhr0;

/* compiled from: PinnedDialogsDividerDecoration.kt */
/* loaded from: classes18.dex */
public final class koa0 extends RecyclerView.n implements dhr0.e {
    public final DialogsListAdapter b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Paint h;
    public final Rect i;
    public a j;

    /* compiled from: PinnedDialogsDividerDecoration.kt */
    public final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            i(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            if (i2 > i) {
                i(i, 1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i(int i, int i2) {
            boolean m;
            k9x q = swe0.q(i, i2 + i);
            DialogsListAdapter dialogsListAdapter = koa0.this.b;
            boolean z = false;
            int i3 = 0;
            xtw xtwVar = null;
            for (Object obj : rli0.y(f2k0.c(new i5g(dialogsListAdapter.h.f), 2, 1), 10)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                xtw xtwVar2 = new xtw(i3, obj);
                List list = (List) obj;
                Object Y = j5g.Y(list);
                zfm zfmVar = Y instanceof zfm ? (zfm) Y : null;
                if (zfmVar != null) {
                    Object b0 = j5g.b0(1, list);
                    pgm pgmVar = b0 instanceof pgm ? (pgm) b0 : null;
                    if (pgmVar != null) {
                        m = koa0.m(zfmVar, pgmVar);
                        if (!m) {
                            xtwVar = xtwVar2;
                        }
                        i3 = i4;
                    }
                }
                m = false;
                if (!m) {
                }
                i3 = i4;
            }
            Integer valueOf = xtwVar != null ? Integer.valueOf(xtwVar.a) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                int i5 = q.b;
                if (intValue <= q.c && i5 <= intValue) {
                    z = true;
                }
                if (z || intValue != i5 - 1) {
                    return;
                }
                dialogsListAdapter.notifyItemChanged(intValue, s3q0.a);
            }
        }
    }

    public koa0(DialogsListAdapter dialogsListAdapter) {
        this.b = dialogsListAdapter;
        int a2 = iah0.a(0.5f);
        this.c = a2 < 1 ? 1 : a2;
        float f = 16;
        this.d = iah0.a(f);
        this.e = iah0.a(f);
        float f2 = 8;
        this.f = iah0.a(f2);
        this.g = iah0.a(f2);
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary));
        paint.setAntiAlias(false);
        paint.setDither(false);
        this.h = paint;
        this.i = new Rect();
        dhr0.f(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (((xsna.zfm) r4).j.Q() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m(zfm zfmVar, pgm pgmVar) {
        boolean z = true;
        if (!(pgmVar instanceof og20) && !(pgmVar instanceof jo8)) {
            if (!(pgmVar instanceof zfm)) {
                if (!(pgmVar instanceof em20)) {
                    if (!(pgmVar instanceof kvw) && !(pgmVar instanceof mp20) && !(pgmVar instanceof s990) && !(pgmVar instanceof o7p) && !(pgmVar instanceof l5e0) && !(pgmVar instanceof xls)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
            }
        }
        return zfmVar.j.Q() & z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (l(recyclerView.getChildAdapterPosition(view))) {
            rect.set(0, 0, 0, this.c + this.f + this.g);
        }
    }

    public final boolean l(int i) {
        List<hfz> list = this.b.h.f;
        Object b0 = j5g.b0(i + 1, list);
        pgm pgmVar = b0 instanceof pgm ? (pgm) b0 : null;
        if (pgmVar == null) {
            return false;
        }
        Object b02 = j5g.b0(i, list);
        zfm zfmVar = b02 instanceof zfm ? (zfm) b02 : null;
        if (zfmVar == null) {
            return false;
        }
        return m(zfmVar, pgmVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (l(recyclerView.getChildAdapterPosition(childAt))) {
                int left = recyclerView.getLeft() + this.d;
                Rect rect = this.i;
                rect.left = left;
                rect.top = childAt.getBottom() + this.f;
                rect.right = recyclerView.getRight() - this.e;
                rect.bottom = rect.top + this.c;
                canvas.drawRect(rect, this.h);
            }
        }
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        this.h.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary));
    }
}
