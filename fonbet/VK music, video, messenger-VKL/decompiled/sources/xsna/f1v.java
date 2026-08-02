package xsna;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.LazyThreadSafetyMode;
import xsna.lfe;

/* compiled from: HeartAvatarDrawableControllerImpl.kt */
/* loaded from: classes17.dex */
public final class f1v implements lfe.c {
    public static final int b = iah0.a(40);
    public static final float c = iah0.b(0.5f);
    public final Object a;

    public f1v(Context context) {
        this.a = msy.a(LazyThreadSafetyMode.NONE, new e3g(context, 1));
    }

    @Override // xsna.lfe.c
    public final void a(Canvas canvas) {
        if (i().getBounds().isEmpty()) {
            return;
        }
        i().draw(canvas);
    }

    @Override // xsna.lfe.c
    public final void b(lfe lfeVar) {
        i().q(lfeVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lfe.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ccr0 i() {
        return (ccr0) this.a.getValue();
    }

    @Override // xsna.lfe.c
    public final void load(String str) {
        i().r(str);
        i().invalidateSelf();
    }
}
