package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import com.vk.core.compose.component.datetime.EditingMode;
import com.vk.dto.narratives.Narrative;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bqv0;
import xsna.h7u0;
import xsna.q2b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p2b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p2b(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (q2b.b) ((l7r0) this.c).d((ij20) this.d, (q2b.a) this.e);
            case 1:
                izs izsVar = (izs) this.c;
                DraftShortVideoListView.d.a aVar = (DraftShortVideoListView.d.a) this.d;
                izsVar.invoke(new DraftShortVideoListView.c.C0467c(aVar.b, (View) this.e));
                return s3q0.a;
            case 2:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) this.c;
                return new cu0(bVar.g, bVar.k, bVar.m, (uvx) this.d, (emi) this.e);
            case 3:
                Context context = (Context) this.c;
                xsq0 xsq0Var = (xsq0) this.d;
                Narrative narrative = (Narrative) this.e;
                h7u0.a aVar2 = new h7u0.a(context);
                aVar2.U(R.string.highlight_delete_confirm_message);
                aVar2.c0(R.string.delete, new bw8(xsq0Var, narrative));
                aVar2.W(R.string.cancel_request, new o1c());
                aVar2.m();
                return s3q0.a;
            default:
                EditingMode editingMode = (EditingMode) this.c;
                rwr rwrVar = (rwr) this.d;
                gzs gzsVar = (gzs) this.e;
                int i = bqv0.a.$EnumSwitchMapping$0[editingMode.ordinal()];
                if (i == 1) {
                    rwr.b(rwrVar);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gzsVar.invoke();
                }
                return s3q0.a;
        }
    }
}
