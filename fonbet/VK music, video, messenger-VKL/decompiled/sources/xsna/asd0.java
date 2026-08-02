package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public class asd0 extends vcr<Integer> {
    public Integer e;
    public final Integer f;
    public final List<Integer> g;

    public asd0(Integer num, Integer num2, ArrayList arrayList) {
        super(11, null, null);
        this.e = num;
        this.f = num2;
        this.g = arrayList;
    }

    @Override // xsna.vcr
    public final void a() {
        e(null);
        h(b());
    }

    @Override // xsna.vcr
    public /* bridge */ /* synthetic */ void e(Integer num) {
        h(null);
    }

    @Override // xsna.vcr
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer b() {
        return this.f;
    }

    @Override // xsna.vcr
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer d() {
        return this.e;
    }

    public void h(Integer num) {
        this.e = num;
    }

    public asd0() {
        this(null, null, null);
    }
}
