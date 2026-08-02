package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: CommentAttachmentHoldersFactory.kt */
/* loaded from: classes4.dex */
public final class nag implements w8i {
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public nag() {
        ca caVar = new ca(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, caVar);
        this.c = msy.a(lazyThreadSafetyMode, new d14(8));
        this.d = msy.a(lazyThreadSafetyMode, new mag(this, 0));
        this.e = msy.a(lazyThreadSafetyMode, new sx0(this, 19));
        this.f = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(this, 22));
        this.g = msy.a(lazyThreadSafetyMode, new v6(this, 21));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h170 a() {
        return (h170) this.c.getValue();
    }
}
