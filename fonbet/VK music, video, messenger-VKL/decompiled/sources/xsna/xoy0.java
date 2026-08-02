package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xoy0 extends FrameLayout implements View.OnClickListener {
    public final RecyclerView b;
    public final auy0 c;
    public final auy0 d;
    public final m9y0 e;
    public final vaz0 f;
    public final n6z0 g;
    public final ujz0 h;
    public final rvy0 i;
    public final b j;
    public List k;
    public int l;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a extends RecyclerView.t {
        public final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            b bVar = this.b;
            if (bVar == null || i != 0) {
                return;
            }
            xoy0 xoy0Var = xoy0.this;
            ((pbz0) bVar).f(xoy0Var.getVisibleCards(), xoy0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            xoy0.this.g();
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface b {
    }

    public xoy0(Context context, b bVar) {
        super(context);
        this.j = bVar;
        this.l = context.getResources().getConfiguration().orientation;
        ujz0 ujz0Var = new ujz0(context);
        this.h = ujz0Var;
        this.i = new rvy0(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        m9y0 m9y0Var = new m9y0(new woy0(this, bVar));
        this.e = m9y0Var;
        int i = ujz0.g;
        SparseIntArray sparseIntArray = ujz0Var.a;
        n6z0 n6z0Var = new n6z0(sparseIntArray.get(i));
        this.g = n6z0Var;
        vaz0 vaz0Var = new vaz0(sparseIntArray.get(ujz0.n), sparseIntArray.get(i));
        this.f = vaz0Var;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setAdapter(m9y0Var);
        recyclerView.setClipToPadding(false);
        this.b = recyclerView;
        addView(recyclerView);
        auy0 b2 = b(context, f(), 8388629);
        this.c = b2;
        b2.setOnClickListener(this);
        b2.setVisibility(0);
        auy0 b3 = b(context, e(), 8388627);
        this.d = b3;
        b3.setOnClickListener(this);
        b3.setVisibility(0);
        h();
        addView(b2);
        addView(b3);
        if (this.l == 2) {
            recyclerView.removeItemDecoration(vaz0Var);
            recyclerView.addItemDecoration(n6z0Var);
        } else {
            recyclerView.removeItemDecoration(n6z0Var);
            recyclerView.addItemDecoration(vaz0Var);
        }
        recyclerView.addOnScrollListener(new a(bVar));
        c();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public List<wfy0> getVisibleCards() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (this.k != null) {
            RecyclerView.o layoutManager = this.b.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i = linearLayoutManager.s();
                i2 = linearLayoutManager.w();
            } else {
                i = 0;
                i2 = 0;
            }
            if (i <= i2 && i >= 0 && i2 < this.k.size()) {
                while (i <= i2) {
                    arrayList.add((wfy0) this.k.get(i));
                    i++;
                }
            }
        }
        return arrayList;
    }

    public final auy0 b(Context context, Bitmap bitmap, int i) {
        auy0 auy0Var = new auy0(context);
        int i2 = ujz0.D;
        ujz0 ujz0Var = this.h;
        int i3 = ujz0Var.a.get(i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        int i4 = ujz0.g;
        SparseIntArray sparseIntArray = ujz0Var.a;
        int i5 = sparseIntArray.get(i4);
        layoutParams.setMargins(i5, i5, i5, i5);
        layoutParams.gravity = i;
        auy0Var.setLayoutParams(layoutParams);
        auy0Var.a(bitmap, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(this.i.a.get(rvy0.l));
        gradientDrawable.setStroke(sparseIntArray.get(ujz0.e), -1);
        auy0Var.setBackground(gradientDrawable);
        return auy0Var;
    }

    public final void c() {
        FrameLayout.LayoutParams layoutParams;
        int i = this.l;
        ujz0 ujz0Var = this.h;
        RecyclerView recyclerView = this.b;
        if (i == 2) {
            int i2 = ujz0.r;
            int i3 = ujz0Var.a.get(i2);
            recyclerView.setPadding(i3, 0, i3, ujz0Var.a.get(i2));
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 1;
        } else {
            int i4 = ujz0Var.a.get(ujz0.k);
            recyclerView.setPadding(i4, 0, i4, 0);
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.requestLayout();
    }

    public final void d() {
        auy0 auy0Var = this.c;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) auy0Var.getLayoutParams();
        auy0 auy0Var2 = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) auy0Var2.getLayoutParams();
        if (this.l == 2) {
            layoutParams.gravity = 8388629;
            layoutParams2.gravity = 8388627;
        } else {
            layoutParams.gravity = 81;
            layoutParams2.gravity = 49;
        }
        auy0Var.a(f(), false);
        auy0Var.setLayoutParams(layoutParams);
        auy0Var2.a(e(), false);
        auy0Var2.setLayoutParams(layoutParams2);
    }

    public final Bitmap e() {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i = this.h.a.get(ujz0.u);
        if (this.l == 2) {
            Context context = getContext();
            try {
                bitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError unused) {
                gu8.c(null, "BaseResources: Cannot build icon - OOME");
                bitmap2 = null;
            }
            if (bitmap2 == null) {
                return null;
            }
            Path d = rq90.d("M9.01777 12L15.1339 5.88388C15.622 5.39573 15.622 4.60427 15.1339 4.11612C14.6457 3.62796 13.8543 3.62796 13.3661 4.11612L6.36612 11.1161C5.87796 11.6043 5.87796 12.3957 6.36612 12.8839L13.3661 19.8839C13.8543 20.372 14.6457 20.372 15.1339 19.8839C15.622 19.3957 15.622 18.6043 15.1339 18.1161L9.01777 12Z");
            RectF rectF = new RectF();
            d.computeBounds(rectF, true);
            Matrix matrix = new Matrix();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            matrix.postTranslate(-rectF.left, -rectF.top);
            float f = displayMetrics.density;
            matrix.postScale(f, f);
            float f2 = i;
            matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
            d.transform(matrix);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            new Canvas(bitmap2).drawPath(d, paint);
            return bitmap2;
        }
        Context context2 = getContext();
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            gu8.c(null, "BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path d2 = rq90.d("M12 9.01777L5.88388 15.1339C5.39573 15.622 4.60427 15.622 4.11612 15.1339C3.62796 14.6457 3.62796 13.8543 4.11612 13.3661L11.1161 6.36612C11.6043 5.87796 12.3957 5.87796 12.8839 6.36612L19.8839 13.3661C20.372 13.8543 20.372 14.6457 19.8839 15.1339C19.3957 15.622 18.6043 15.622 18.1161 15.1339L12 9.01777Z");
        RectF rectF2 = new RectF();
        d2.computeBounds(rectF2, true);
        Matrix matrix2 = new Matrix();
        DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
        matrix2.postTranslate(-rectF2.left, -rectF2.top);
        float f3 = displayMetrics2.density;
        matrix2.postScale(f3, f3);
        float f4 = i;
        matrix2.postTranslate((f4 - (rectF2.width() * f3)) / 2.0f, (f4 - (rectF2.height() * f3)) / 2.0f);
        d2.transform(matrix2);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        new Canvas(bitmap).drawPath(d2, paint2);
        return bitmap;
    }

    public final Bitmap f() {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i = this.h.a.get(ujz0.u);
        if (this.l == 2) {
            Context context = getContext();
            try {
                bitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError unused) {
                gu8.c(null, "BaseResources: Cannot build icon - OOME");
                bitmap2 = null;
            }
            if (bitmap2 == null) {
                return null;
            }
            Path d = rq90.d("M14.9822 12L8.86612 5.88388C8.37796 5.39573 8.37796 4.60427 8.86612 4.11612C9.35427 3.62796 10.1457 3.62796 10.6339 4.11612L17.6339 11.1161C18.122 11.6043 18.122 12.3957 17.6339 12.8839L10.6339 19.8839C10.1457 20.372 9.35427 20.372 8.86612 19.8839C8.37796 19.3957 8.37796 18.6043 8.86612 18.1161L14.9822 12Z");
            RectF rectF = new RectF();
            d.computeBounds(rectF, true);
            Matrix matrix = new Matrix();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            matrix.postTranslate(-rectF.left, -rectF.top);
            float f = displayMetrics.density;
            matrix.postScale(f, f);
            float f2 = i;
            matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
            d.transform(matrix);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            new Canvas(bitmap2).drawPath(d, paint);
            return bitmap2;
        }
        Context context2 = getContext();
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            gu8.c(null, "BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path d2 = rq90.d("M12 14.9822L5.88388 8.86612C5.39573 8.37796 4.60427 8.37796 4.11612 8.86612C3.62796 9.35427 3.62796 10.1457 4.11612 10.6339L11.1161 17.6339C11.6043 18.122 12.3957 18.122 12.8839 17.6339L19.8839 10.6339C20.372 10.1457 20.372 9.35427 19.8839 8.86612C19.3957 8.37796 18.6043 8.37796 18.1161 8.86612L12 14.9822Z");
        RectF rectF2 = new RectF();
        d2.computeBounds(rectF2, true);
        Matrix matrix2 = new Matrix();
        DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
        matrix2.postTranslate(-rectF2.left, -rectF2.top);
        float f3 = displayMetrics2.density;
        matrix2.postScale(f3, f3);
        float f4 = i;
        matrix2.postTranslate((f4 - (rectF2.width() * f3)) / 2.0f, (f4 - (rectF2.height() * f3)) / 2.0f);
        d2.transform(matrix2);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        new Canvas(bitmap).drawPath(d2, paint2);
        return bitmap;
    }

    public final void g() {
        int i;
        int i2;
        List list = this.k;
        auy0 auy0Var = this.c;
        auy0 auy0Var2 = this.d;
        if (list == null || list.isEmpty()) {
            auy0Var2.setVisibility(8);
            auy0Var.setVisibility(8);
            return;
        }
        RecyclerView.o layoutManager = this.b.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.s();
            i = linearLayoutManager.w();
        } else {
            i = 0;
            i2 = 0;
        }
        auy0Var2.setVisibility(i2 <= 0 ? 8 : 0);
        auy0Var.setVisibility(i != this.e.c.size() + (-1) ? 0 : 8);
    }

    @NonNull
    public auy0 getMoreButton() {
        return this.c;
    }

    public final void h() {
        int i = this.l;
        RecyclerView recyclerView = this.b;
        if (i == 2) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        } else {
            getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(2, 1));
        }
        b bVar = this.j;
        if (bVar != null) {
            ((pbz0) bVar).f(getVisibleCards(), this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.l;
        auy0 auy0Var = this.d;
        m9y0 m9y0Var = this.e;
        auy0 auy0Var2 = this.c;
        RecyclerView recyclerView = this.b;
        if (i == 2) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager == null) {
                return;
            }
            int w = linearLayoutManager.w();
            int s = linearLayoutManager.s();
            if (view == auy0Var2 && w < m9y0Var.c.size() - 1) {
                recyclerView.smoothScrollToPosition(w + 1);
                return;
            } else {
                if (view != auy0Var || s <= 0) {
                    return;
                }
                recyclerView.smoothScrollToPosition(s - 1);
                return;
            }
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        if (gridLayoutManager == null) {
            return;
        }
        int w2 = gridLayoutManager.w();
        int s2 = gridLayoutManager.s();
        int size = m9y0Var.c.size();
        if (view == auy0Var2 && w2 < size - 1) {
            recyclerView.smoothScrollToPosition(w2 + 1);
        } else {
            if (view != auy0Var || s2 <= 0) {
                return;
            }
            recyclerView.smoothScrollToPosition(s2 - 1);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l = configuration.orientation;
        h();
        int i = this.l;
        n6z0 n6z0Var = this.g;
        vaz0 vaz0Var = this.f;
        RecyclerView recyclerView = this.b;
        if (i == 2) {
            recyclerView.removeItemDecoration(vaz0Var);
            recyclerView.addItemDecoration(n6z0Var);
        } else {
            recyclerView.removeItemDecoration(n6z0Var);
            recyclerView.addItemDecoration(vaz0Var);
        }
        d();
        c();
        g();
    }

    public void setData(@NonNull List<wfy0> list) {
        m9y0 m9y0Var = this.e;
        m9y0Var.c = list;
        for (int i = 0; i < m9y0Var.c.size(); i++) {
            m9y0Var.notifyItemChanged(i, list.get(i));
        }
        this.k = list;
    }
}
