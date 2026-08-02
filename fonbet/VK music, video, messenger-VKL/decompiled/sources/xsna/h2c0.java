package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PostDisplayItemsDecorations.kt */
/* loaded from: classes4.dex */
public final class h2c0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public h2c0() {
        lk lkVar = new lk(29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, lkVar);
        this.b = msy.a(lazyThreadSafetyMode, new g2c0(0));
        this.c = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.m(23));
        this.d = msy.a(lazyThreadSafetyMode, new la0(20));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final kln0 a() {
        kln0 kln0Var = new kln0();
        j2n j2nVar = (j2n) this.a.getValue();
        HashMap<String, RecyclerView.n> hashMap = kln0Var.c;
        hashMap.put("decoration", j2nVar);
        hashMap.put("decorationWithBackground", (j2n) this.b.getValue());
        return kln0Var;
    }
}
