package xsna;

import android.content.Context;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.dto.hints.HintId;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.r6v;

/* compiled from: SelectionTouchListener.kt */
/* loaded from: classes15.dex */
public abstract class kfi0 extends yj3<gz10> {
    public final q3t A;
    public final PhotoSmallAdapter B;
    public final RecyclerView v;
    public final com.vk.attachpicker.b w;
    public final boolean x;
    public final boolean y;
    public final h7v z;

    public kfi0(RecyclerView recyclerView, com.vk.attachpicker.b bVar, boolean z, boolean z2, h7v h7vVar, q3t q3tVar, PhotoSmallAdapter photoSmallAdapter) {
        super(recyclerView);
        this.v = recyclerView;
        this.w = bVar;
        this.x = z;
        this.y = z2;
        this.z = h7vVar;
        this.A = q3tVar;
        this.B = photoSmallAdapter;
    }

    @Override // xsna.yj3
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void m(gz10 gz10Var) {
        try {
            int adapterPosition = gz10Var.getAdapterPosition();
            if (adapterPosition != -1) {
                Object c = this.B.c.c(adapterPosition);
                MediaStoreEntry mediaStoreEntry = c instanceof MediaStoreEntry ? (MediaStoreEntry) c : null;
                if (mediaStoreEntry == null || jjc.d().a()) {
                    return;
                }
                y(adapterPosition, mediaStoreEntry);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
    }

    @Override // xsna.yj3
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void s(int i, gz10 gz10Var) {
        if (!this.x) {
            z(i, gz10Var);
        } else if (gz10Var != null) {
            m(gz10Var);
        }
    }

    public final void C(int i, gz10 gz10Var) {
        MediaStoreEntry mediaStoreEntry;
        boolean z;
        PhotoSmallAdapter photoSmallAdapter = this.B;
        int K0 = i - photoSmallAdapter.K0();
        if (gz10Var == null || (mediaStoreEntry = gz10Var.t) == null) {
            mediaStoreEntry = null;
        }
        if (mediaStoreEntry == null) {
            return;
        }
        com.vk.attachpicker.b bVar = this.w;
        boolean q = bVar.q(mediaStoreEntry);
        RecyclerView recyclerView = this.v;
        if (q) {
            bVar.c(mediaStoreEntry);
            z = false;
        } else {
            int f = bVar.f(K0, null, mediaStoreEntry);
            if (f < 0 && f != Integer.MIN_VALUE) {
                int i2 = this.x ? R.string.picker_attachments_limit_one : R.string.picker_attachments_limit;
                Context context = recyclerView.getContext();
                bpn0 bpn0Var = enj.a;
                String string = e3m.h(context).getString(i2, Integer.valueOf(bVar.h()));
                ikv0.a aVar = new ikv0.a(bwt0.u(e3m.h(recyclerView.getContext())));
                aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, e3m.h(recyclerView.getContext()).getString(R.string.selection_limit_action_text), new fo20(21));
                aVar.n();
            }
            z = true;
        }
        RecyclerView.e0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(photoSmallAdapter.K0() + K0);
        gz10 gz10Var2 = findViewHolderForLayoutPosition instanceof gz10 ? (gz10) findViewHolderForLayoutPosition : null;
        if (gz10Var2 != null && z && this.y) {
            HintId hintId = HintId.IM_INCREASE_MSG_ATTACH_LIMIT;
            String id = hintId.getId();
            h7v h7vVar = this.z;
            if (h7vVar.a(id)) {
                r6v.a e = h7vVar.r(hintId.getId(), gz10Var2.X1(new Rect())).m().e();
                Context context2 = recyclerView.getContext();
                bpn0 bpn0Var2 = enj.a;
                e.j(e3m.h(context2));
            }
        }
    }

    @Override // xsna.yj3
    public final boolean k(int i) {
        return !this.x;
    }

    @Override // xsna.yj3
    public final void r(int i) {
        this.A.e(i);
    }

    @Override // xsna.yj3
    public final void v(int i, gz10 gz10Var) {
        C(i, gz10Var);
    }

    public abstract void y(int i, MediaStoreEntry mediaStoreEntry);

    public void z(int i, gz10 gz10Var) {
        C(i, gz10Var);
    }
}
