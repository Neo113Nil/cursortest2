package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.serialize.Serializer.StreamParcelable;
import com.vk.dto.actionlinks.ActionLinksResponse;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.awu;
import xsna.vif0;

/* compiled from: AttachPickerAdapter.kt */
/* loaded from: classes15.dex */
public final class b34<T extends Serializer.StreamParcelable, VH extends vif0<T>> extends awu<T> {
    public final BaseAttachPickerFragment i;
    public final zom0<T> j;
    public final h2u<T> k = new h2u<>();
    public final a<T> l;
    public int m;
    public boolean n;
    public boolean o;

    public b34(BaseAttachPickerFragment baseAttachPickerFragment, zom0 zom0Var) {
        this.i = baseAttachPickerFragment;
        this.j = zom0Var;
        this.l = new a<>(baseAttachPickerFragment);
    }

    @Override // xsna.awu
    public final int N0(int i) {
        return (this.o && i == 0) ? 1 : 0;
    }

    @Override // xsna.awu
    public final void O0(RecyclerView.e0 e0Var, int i) {
        if (getItemViewType(i) == 0) {
            ((vif0) e0Var).V5(this.c.c(i));
        }
    }

    @Override // xsna.awu
    public final RecyclerView.e0 P0(int i, ViewGroup viewGroup) {
        return this.i.Cl(viewGroup, this.j);
    }

    @Override // xsna.zoj0
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final ArrayList<T> y0() {
        ArrayList arrayList = (ArrayList) super.y0();
        ActionLinksResponse actionLinksResponse = (ArrayList<T>) new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Serializer.StreamParcelable streamParcelable = (Serializer.StreamParcelable) it.next();
            if (streamParcelable != null) {
                actionLinksResponse.add(streamParcelable);
            }
        }
        return actionLinksResponse;
    }

    public final void W0(int i) {
        this.m = i;
        this.k.a = i;
        notifyItemRangeChanged(Math.max(i - 1, 0), Math.min(3, getItemCount()));
    }

    /* compiled from: AttachPickerAdapter.kt */
    public static final class a<T extends Serializer.StreamParcelable> extends awu.b<T> {
        public final BaseAttachPickerFragment a;

        public a(BaseAttachPickerFragment baseAttachPickerFragment) {
            this.a = baseAttachPickerFragment;
        }

        @Override // xsna.awu.b
        public final int a() {
            return 1;
        }

        @Override // xsna.awu.b
        public final RecyclerView.e0 c(ViewGroup viewGroup) {
            return this.a.bn(viewGroup);
        }

        @Override // xsna.awu.b
        public final /* bridge */ /* synthetic */ boolean d(Object obj) {
            return false;
        }

        @Override // xsna.awu.b
        public final /* bridge */ /* synthetic */ boolean e(Object obj) {
            return true;
        }

        @Override // xsna.awu.b
        public final /* bridge */ /* synthetic */ boolean f(int i, Object obj, Object obj2) {
            return false;
        }

        @Override // xsna.awu.b
        public final void b(RecyclerView.e0 e0Var) {
        }
    }
}
