package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.PhotoStackView;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VKBaseImageStackController.kt */
/* loaded from: classes17.dex */
public abstract class gar0<V extends View> {
    public final Context a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new a(0, this, gar0.class, "initImageStackView", "initImageStackView()Landroid/view/View;", 0));

    /* compiled from: VKBaseImageStackController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<V> {
        @Override // xsna.gzs
        public final Object invoke() {
            return ((gar0) this.receiver).b();
        }
    }

    public gar0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final V a() {
        return (V) this.b.getValue();
    }

    public abstract PhotoStackView b();
}
