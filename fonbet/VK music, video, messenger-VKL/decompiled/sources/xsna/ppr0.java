package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.mvi.MviViewContainer;
import com.vk.stories.design.view.editor.verticalization.VerticalizationLoadingView;
import com.vk.stories.design.view.editor.verticalization.VerticalizationPickerView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.gm50;
import xsna.mk50;

/* compiled from: VerticalizationModeMviView.kt */
/* loaded from: classes16.dex */
public final class ppr0 extends MviViewContainer<npr0, ypr0, mpr0> implements w8i {
    public final Object f;
    public final Object g;
    public a h;
    public b i;
    public zpr0 j;
    public final VerticalizationLoadingView k;
    public final VerticalizationPickerView l;

    /* compiled from: VerticalizationModeMviView.kt */
    public interface a {
        void a();

        void b(Throwable th);

        void c(List<String> list);

        void d(Bitmap bitmap, int i, boolean z);

        void e();

        void f(Throwable th);

        void g(Throwable th);
    }

    /* compiled from: VerticalizationModeMviView.kt */
    public static final class b {
        public final iz8 a;
        public final String b;
        public final Bitmap c;
        public final Bitmap d;
        public Integer e = null;
        public List<String> f = null;

        public b(iz8 iz8Var, String str, Bitmap bitmap, Bitmap bitmap2) {
            this.a = iz8Var;
            this.b = str;
            this.c = bitmap;
            this.d = bitmap2;
        }
    }

    public ppr0(Context context) {
        super(context, null, 0);
        rme0 rme0Var = new rme0(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, rme0Var);
        this.g = msy.a(lazyThreadSafetyMode, new c9m0(this, 9));
        VerticalizationLoadingView verticalizationLoadingView = (VerticalizationLoadingView) findViewById(R.id.loading_view);
        this.k = verticalizationLoadingView;
        VerticalizationPickerView verticalizationPickerView = (VerticalizationPickerView) findViewById(R.id.picker_view);
        this.l = verticalizationPickerView;
        verticalizationLoadingView.setOnClickCancel(new u110(this, 26));
        verticalizationPickerView.setCallback(new opr0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final gpj0 getAuthBridge() {
        return (gpj0) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final vre0 getQueueSyncManager() {
        return (vre0) this.g.getValue();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.layout_story_editor_verticalization_mode_view);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ypr0 ypr0Var = (ypr0) ao50Var;
        getFeature().i.a(new dso0(this, 8), getViewOwner());
        gm50.a.b(this, ypr0Var.a, new n7b0(this, 21));
        gm50.a.b(this, ypr0Var.b, new lzl0(this, 3));
    }

    public final void h() {
        cp2.d(this, 0L, new q44(this, 13), null, 27);
    }

    public final void i() {
        a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
        h();
    }

    @Override // com.vk.mvi.MviViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.b.e(Lifecycle.State.DESTROYED);
    }

    public final void setAnalyticsTracker(zpr0 zpr0Var) {
        this.j = zpr0Var;
    }

    public final void setCallback(a aVar) {
        this.h = aVar;
    }

    public final void setEditorInitialData(b bVar) {
        this.i = bVar;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        b bVar = this.i;
        if (bVar != null) {
            return new npr0(bVar, getAuthBridge(), getQueueSyncManager());
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
