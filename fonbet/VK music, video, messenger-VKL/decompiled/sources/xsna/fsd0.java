package xsna;

import java.util.ArrayList;
import java.util.List;
import xsna.tlo0;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public class fsd0 extends vcr<Integer> {
    public final tlo0 e;
    public Integer f;
    public final Integer g;
    public final List<Integer> h;

    public fsd0(tlo0.f fVar, Integer num, Integer num2, ArrayList arrayList) {
        super(14, null, null);
        this.e = fVar;
        this.f = num;
        this.g = num2;
        this.h = arrayList;
    }

    @Override // xsna.vcr
    public /* bridge */ /* synthetic */ void e(Integer num) {
        h(null);
    }

    @Override // xsna.vcr
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer b() {
        return this.g;
    }

    @Override // xsna.vcr
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer d() {
        return this.f;
    }

    public void h(Integer num) {
        this.f = num;
    }

    public fsd0() {
        this(null, null, null, null);
    }
}
