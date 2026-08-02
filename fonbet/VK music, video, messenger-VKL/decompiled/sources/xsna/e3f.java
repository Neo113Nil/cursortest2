package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: ClipsSelectionTouchListener.kt */
/* loaded from: classes15.dex */
public final class e3f extends kfi0 {
    public final RecyclerView C;
    public final com.vk.attachpicker.b D;

    public e3f(RecyclerView recyclerView, com.vk.attachpicker.b bVar, t4t t4tVar, h7v h7vVar, q3t q3tVar, PhotoSmallAdapter photoSmallAdapter) {
        super(recyclerView, bVar, t4tVar.j, t4tVar.v, h7vVar, q3tVar, photoSmallAdapter);
        this.C = recyclerView;
        this.D = bVar;
    }

    @Override // xsna.kfi0, xsna.yj3
    /* renamed from: B */
    public final void s(int i, gz10 gz10Var) {
        MediaStoreEntry mediaStoreEntry;
        int K0 = i - this.B.K0();
        if (gz10Var == null || (mediaStoreEntry = gz10Var.t) == null) {
            mediaStoreEntry = null;
        }
        if (mediaStoreEntry == null) {
            return;
        }
        com.vk.attachpicker.b bVar = this.D;
        if (bVar.q(mediaStoreEntry)) {
            bVar.c(mediaStoreEntry);
            return;
        }
        int f = bVar.f(K0, null, mediaStoreEntry);
        if (f >= 0 || f == Integer.MIN_VALUE) {
            return;
        }
        RecyclerView recyclerView = this.C;
        Context context = recyclerView.getContext();
        bpn0 bpn0Var = enj.a;
        String string = e3m.h(context).getString(R.string.picker_attachments_limit_clips);
        ikv0.a aVar = new ikv0.a(bwt0.u(e3m.h(recyclerView.getContext())));
        aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, e3m.h(recyclerView.getContext()).getString(R.string.selection_limit_action_text), new od3(14));
        aVar.o = Integer.valueOf(iah0.a(80));
        aVar.n();
    }

    @Override // xsna.kfi0
    public final void y(int i, MediaStoreEntry mediaStoreEntry) {
    }
}
