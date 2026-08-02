package xsna;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;
import xsna.iut0;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class t1u0 {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes13.dex */
    public class a implements u080 {
        public final /* synthetic */ b b;
        public final /* synthetic */ c c;

        public a(b bVar, c cVar) {
            this.b = bVar;
            this.c = cVar;
        }

        @Override // xsna.u080
        public final bqx0 b(View view, bqx0 bqx0Var) {
            c cVar = new c();
            c cVar2 = this.c;
            cVar.a = cVar2.a;
            cVar.b = cVar2.b;
            cVar.c = cVar2.c;
            cVar.d = cVar2.d;
            return this.b.a(view, bqx0Var, cVar);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes13.dex */
    public interface b {
        bqx0 a(View view, bqx0 bqx0Var, c cVar);
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes13.dex */
    public static class c {
        public int a;
        public int b;
        public int c;
        public int d;

        public c(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public static void a(@NonNull View view, @NonNull b bVar) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, new a(bVar, new c(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new v1u0());
        }
    }

    public static float b(int i, @NonNull Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @Nullable
    public static ViewGroup c(@Nullable View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static boolean d(View view) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
