package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ExternalNpsPollBottomSheet.kt */
/* loaded from: classes16.dex */
public final class ffq {
    public static final int e = iah0.a(330);
    public final ExternalNpsCondition a;
    public final bfq b;
    public final Object c;
    public final Object d;

    public ffq(Context context, ExternalNpsCondition externalNpsCondition, bfq bfqVar) {
        this.a = externalNpsCondition;
        this.b = bfqVar;
        c6l c6lVar = new c6l(context, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, c6lVar);
        this.d = msy.a(lazyThreadSafetyMode, new v3n(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final kfq a() {
        return (kfq) this.d.getValue();
    }

    /* compiled from: ExternalNpsPollBottomSheet.kt */
    public static final class a extends ModalBottomSheetBehavior.d {
        public zqf a;

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            if (i == 3) {
                zqf zqfVar = this.a;
                if (zqfVar != null) {
                    zqfVar.invoke();
                }
                this.a = null;
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
        }
    }
}
