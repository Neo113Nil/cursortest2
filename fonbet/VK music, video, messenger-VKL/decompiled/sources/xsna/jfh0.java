package xsna;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: ScrollFeedbackProviderCompat.java */
/* loaded from: classes11.dex */
public final class jfh0 {
    public final c a;

    /* compiled from: ScrollFeedbackProviderCompat.java */
    public static class a implements c {
        public final ScrollFeedbackProvider a;

        public a(NestedScrollView nestedScrollView) {
            this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
        }

        @Override // xsna.jfh0.c
        public final void onScrollLimit(int i, int i2, int i3, boolean z) {
            this.a.onScrollLimit(i, i2, i3, z);
        }

        @Override // xsna.jfh0.c
        public final void onScrollProgress(int i, int i2, int i3, int i4) {
            this.a.onScrollProgress(i, i2, i3, i4);
        }
    }

    /* compiled from: ScrollFeedbackProviderCompat.java */
    public interface c {
        void onScrollLimit(int i, int i2, int i3, boolean z);

        void onScrollProgress(int i, int i2, int i3, int i4);
    }

    public jfh0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new a(nestedScrollView);
        } else {
            this.a = new b();
        }
    }

    public static jfh0 a(NestedScrollView nestedScrollView) {
        return new jfh0(nestedScrollView);
    }

    public final void b(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }

    /* compiled from: ScrollFeedbackProviderCompat.java */
    public static class b implements c {
        @Override // xsna.jfh0.c
        public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        }

        @Override // xsna.jfh0.c
        public final void onScrollProgress(int i, int i2, int i3, int i4) {
        }
    }
}
