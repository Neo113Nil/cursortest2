package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityProfileDetailsDialogViewDelegate.kt */
/* loaded from: classes5.dex */
public final class tmh {
    public final Context a;
    public final znh b;
    public final ynh c;
    public final uoh d;
    public final Object e;
    public final zvw f;
    public dw20 g;
    public io.reactivex.rxjava3.disposables.c h;
    public final Object i;
    public v1h j;
    public g1i k;

    /* compiled from: CommunityProfileDetailsDialogViewDelegate.kt */
    public interface a {
        void a();
    }

    /* compiled from: CommunityProfileDetailsDialogViewDelegate.kt */
    public final class b extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* compiled from: CommunityProfileDetailsDialogViewDelegate.kt */
    public final class c implements fcn {
        public c() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            dw20 dw20Var = tmh.this.g;
            if (dw20Var != null) {
                dw20Var.hide();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    public tmh(Context context, znh znhVar, ynh ynhVar, uoh uohVar) {
        this.a = context;
        this.b = znhVar;
        this.c = ynhVar;
        this.d = uohVar;
        jg0 jg0Var = new jg0(9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, jg0Var);
        this.f = new zvw(null);
        this.i = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.d(this, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Context a() {
        return (Context) this.i.getValue();
    }
}
