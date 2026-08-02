package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: CheckoutMethodsAdapter.kt */
/* loaded from: classes6.dex */
public final class y5c extends sxm {
    public final a i;
    public b6c j;

    /* compiled from: CheckoutMethodsAdapter.kt */
    public interface a {
        void a();

        void b();

        void c(PayMethodData payMethodData);

        void d(PayMethodData payMethodData, int i);
    }

    public y5c(a aVar) {
        this.i = aVar;
        x0(ht9.class, new v9(this, 20));
        x0(vk0.class, new pd(this, 21));
        x0(yy9.class, new tl0(this, 25));
        x0(z9u.class, new ns1(this, 21));
        x0(q470.class, new com.vk.movika.sdk.base.hooks.p(this, 28));
        x0(jer0.class, new r6(this, 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: E0 */
    public final vfz onCreateViewHolder(int i, ViewGroup viewGroup) {
        vfz onCreateViewHolder = super.onCreateViewHolder(i, viewGroup);
        b6c b6cVar = this.j;
        if (b6cVar != null) {
            ArrayList<WeakReference<RecyclerView.e0>> arrayList = b6cVar.a.j;
            arrayList.add(new WeakReference<>(onCreateViewHolder));
            ns8 ns8Var = new ns8(arrayList);
            b6cVar.b.addOnScrollListener(ns8Var);
            if (onCreateViewHolder instanceof wgh0) {
                ((wgh0) onCreateViewHolder).n2(ns8Var);
            }
        }
        return onCreateViewHolder;
    }
}
