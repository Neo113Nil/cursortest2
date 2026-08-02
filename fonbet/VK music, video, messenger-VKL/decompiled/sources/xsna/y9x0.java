package xsna;

import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import kotlin.LazyThreadSafetyMode;
import xsna.fhc0;

/* compiled from: WallPostProfileFriendsListsStatSource.kt */
/* loaded from: classes4.dex */
public final class y9x0 extends be implements w8i {
    public final Object b;
    public final Object c;

    public y9x0() {
        x9x0 x9x0Var = new x9x0(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, x9x0Var);
        this.c = msy.a(lazyThreadSafetyMode, new pvh0(this, 25));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.be
    public final void V() {
        jbc0 jbc0Var = (jbc0) this.b.getValue();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var.g();
        ((fhc0.c) this.c.getValue()).h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.be
    public final void W() {
        ((fhc0.c) this.c.getValue()).i();
        jbc0 jbc0Var = (jbc0) this.b.getValue();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.be
    public final void X(boolean z) {
        ?? r0 = this.b;
        ?? r1 = this.c;
        if (z) {
            ((fhc0.c) r1.getValue()).a();
            jbc0 jbc0Var = (jbc0) r0.getValue();
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
            return;
        }
        ((fhc0.c) r1.getValue()).c();
        jbc0 jbc0Var2 = (jbc0) r0.getValue();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var2.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.be
    public final void Y() {
        ((fhc0.c) this.c.getValue()).d();
        jbc0 jbc0Var = (jbc0) this.b.getValue();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var.g();
    }
}
