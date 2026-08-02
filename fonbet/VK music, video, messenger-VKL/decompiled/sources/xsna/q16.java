package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;

/* compiled from: BannerCompanionMyTargetHelper.kt */
/* loaded from: classes17.dex */
public final class q16 implements n16 {
    public final /* synthetic */ p16 a;

    public q16(p16 p16Var) {
        this.a = p16Var;
    }

    @Override // xsna.n16
    public final void a(View view) {
        ckz0 ckz0Var;
        zu50 zu50Var = this.a.d;
        if (zu50Var == null || (ckz0Var = zu50Var.h) == null) {
            return;
        }
        ckz0Var.c(view);
    }

    @Override // xsna.n16
    public final void b() {
        izs<? super ClipItemAction.e, s3q0> izsVar = this.a.c;
        if (izsVar != null) {
            izsVar.invoke(ClipItemAction.e.f.b);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.n16
    public final void c(Context context) {
        p16 p16Var = this.a;
        ((bp50) p16Var.h.getValue()).c.clear();
        zu50 zu50Var = p16Var.d;
        if (zu50Var != null) {
            zu50Var.e(context);
        }
    }

    @Override // xsna.n16
    public final void d() {
        p16 p16Var = this.a;
        izs<? super ClipItemAction.e, s3q0> izsVar = p16Var.c;
        if (izsVar != null) {
            izsVar.invoke(ClipItemAction.e.a.b);
        }
        p16Var.b();
    }
}
