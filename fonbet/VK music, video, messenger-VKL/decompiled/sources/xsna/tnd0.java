package xsna;

import xsna.tlo0;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public class tnd0 extends vcr<Boolean> {
    public final tlo0.f e;
    public final tlo0 f;
    public Boolean g;

    public tnd0(tlo0.f fVar, tlo0.f fVar2, Boolean bool) {
        super(12, null, null);
        this.e = fVar;
        this.f = fVar2;
        this.g = bool;
    }

    @Override // xsna.vcr
    public final void a() {
        e(null);
        h(b());
    }

    @Override // xsna.vcr
    public /* bridge */ /* synthetic */ void e(Boolean bool) {
        h(null);
    }

    @Override // xsna.vcr
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        return Boolean.FALSE;
    }

    @Override // xsna.vcr
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean d() {
        return this.g;
    }

    public void h(Boolean bool) {
        this.g = bool;
    }
}
