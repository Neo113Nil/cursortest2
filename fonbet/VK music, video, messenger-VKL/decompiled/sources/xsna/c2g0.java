package xsna;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.cvj0;
import xsna.rtj0;

/* compiled from: RepliesAttachmentsAdapter.kt */
/* loaded from: classes18.dex */
public final class c2g0 implements w8i {
    public final gzs<tdg> b;
    public final LinearLayout c;
    public final s980 d;
    public final h170 e = new h170();
    public final zsj0 f = new zsj0();
    public final ArrayList<RecyclerView.e0> g = new ArrayList<>(2);
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new io60(this, 21));

    public c2g0(gzs gzsVar, LinearLayout linearLayout, s980 s980Var) {
        this.b = gzsVar;
        this.c = linearLayout;
        this.d = s980Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qi6 a(LinearLayout linearLayout, int i) {
        qi6 gfuVar;
        qi6 sp4Var;
        ?? r1 = this.h;
        if (i != 5) {
            h170 h170Var = this.e;
            if (i == 6) {
                sp4Var = ((Boolean) h170Var.f.getValue()).booleanValue() ? new sp4(linearLayout) : new rp4(linearLayout);
            } else if (i == 7) {
                gfuVar = new in2(linearLayout);
            } else if (i == 11) {
                int i2 = rtj0.J;
                gfuVar = rtj0.a.a(linearLayout);
            } else if (i != 39) {
                gfuVar = null;
                if (i == 50) {
                    int i3 = cvj0.n0;
                    sp4Var = new cvj0(cvj0.a.a(linearLayout), true, h170Var, null);
                } else if (i == 51) {
                    gfuVar = new com.vk.newsfeed.common.recycler.holders.i(linearLayout);
                } else if (i == 66) {
                    gfuVar = new n4l0(linearLayout);
                } else if (i == 67) {
                    gfuVar = new bm2(linearLayout);
                } else if (i == 109) {
                    gfuVar = new ncg0(linearLayout);
                } else if (i == 110) {
                    gfuVar = new hcg0(linearLayout, (kdg0) r1.getValue(), h170Var);
                }
            } else {
                gfuVar = new cun(linearLayout);
            }
            gfuVar = sp4Var;
        } else {
            gfuVar = new gfu(linearLayout, (kdg0) r1.getValue());
        }
        if (gfuVar != null) {
            gfuVar.itemView.setTag(R.id.view_type, Integer.valueOf(i));
        }
        return gfuVar;
    }
}
