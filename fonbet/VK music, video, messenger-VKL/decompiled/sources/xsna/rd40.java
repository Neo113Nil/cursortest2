package xsna;

import kotlin.Lazy;

/* compiled from: MusicCatalogSerializerCache.kt */
/* loaded from: classes16.dex */
public final class rd40 extends vga {
    public final Lazy<q9a> b;

    public rd40(String str, bpn0 bpn0Var) {
        super(str);
        this.b = bpn0Var;
    }

    @Override // xsna.vga, xsna.w2a
    public final io.reactivex.rxjava3.core.q<hda> a() {
        return this.b.getValue().b(super.a());
    }
}
