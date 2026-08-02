package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarketFilterDialogListener.kt */
/* loaded from: classes18.dex */
public final class ry00<T> implements ncr<vcr<?>> {
    public final FragmentActivity a;
    public final pcr<T> b;
    public final FunctionReferenceImpl c;
    public final izs<T, s3q0> d;
    public final yzs<dz00, ddr, izs<? super dz00, s3q0>, dw20> e;
    public List<? extends vcr<?>> f;

    /* JADX WARN: Multi-variable type inference failed */
    public ry00(FragmentActivity fragmentActivity, pcr pcrVar, izs izsVar, izs izsVar2, gb10 gb10Var) {
        this.a = fragmentActivity;
        this.b = pcrVar;
        this.c = (FunctionReferenceImpl) izsVar;
        this.d = izsVar2;
        this.e = gb10Var;
        ListBuilder fields = pcrVar.getFields();
        izsVar.invoke(fields);
        this.f = fields;
    }

    @Override // xsna.ncr
    public final dw20 a(vcr vcrVar, omo omoVar) {
        yzs<dz00, ddr, izs<? super dz00, s3q0>, dw20> yzsVar;
        if (!(vcrVar instanceof mec) || (yzsVar = this.e) == null) {
            return null;
        }
        return yzsVar.invoke(((mec) vcrVar).l, omoVar, new defpackage.h0(17, vcrVar, this));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.ncr
    public final void b() {
        Iterator<T> it = this.f.iterator();
        while (it.hasNext()) {
            ((vcr) it.next()).a();
        }
        List<? extends vcr<?>> list = this.f;
        pcr<T> pcrVar = this.b;
        pcrVar.a(list);
        ListBuilder fields = pcrVar.getFields();
        this.f = fields;
        this.c.invoke(fields);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.ncr
    public final void c(vcr vcrVar) {
        if (vcrVar instanceof n6d0) {
            return;
        }
        List<? extends vcr<?>> list = this.f;
        pcr<T> pcrVar = this.b;
        if (pcrVar.a(list)) {
            ListBuilder fields = pcrVar.getFields();
            this.f = fields;
            this.c.invoke(fields);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.ncr
    public final boolean t() {
        p6d0 p6d0Var;
        Integer num;
        Integer num2;
        List<? extends vcr<?>> list = this.f;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof n6d0) {
                arrayList.add(t);
            }
        }
        n6d0 n6d0Var = (n6d0) j5g.a0(arrayList);
        if (n6d0Var != null && (p6d0Var = n6d0Var.f) != null && (num = p6d0Var.a) != null) {
            int intValue = num.intValue();
            p6d0 p6d0Var2 = n6d0Var.f;
            if (p6d0Var2 != null && (num2 = p6d0Var2.b) != null && intValue > num2.intValue()) {
                n6d0Var.g = this.a.getString(R.string.wrong_price_range);
                this.c.invoke(this.f);
                return false;
            }
        }
        List<? extends vcr<?>> list2 = this.f;
        pcr<T> pcrVar = this.b;
        pcrVar.a(list2);
        this.d.invoke(pcrVar.b());
        return true;
    }
}
