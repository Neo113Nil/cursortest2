package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.dh6;
import xsna.gne;
import xsna.k930;

/* compiled from: ClipsNotInterestedBottomSheet.kt */
/* loaded from: classes17.dex */
public final class ene extends kq6 implements w8i {
    public final Activity c;
    public final ikd d;
    public final k930.f e;
    public final Object f;
    public final List<bne> g;
    public final bpn0 h;

    /* compiled from: ClipsNotInterestedBottomSheet.kt */
    public static final class a implements dh6.a {
        public a() {
        }

        @Override // xsna.dh6.a
        public final void a() {
            dz20 dz20Var = ene.this.d.e;
            if (dz20Var != null) {
                dz20Var.Ff(null);
            }
        }

        @Override // xsna.dh6.a
        public final void b() {
            dz20 dz20Var = ene.this.d.e;
            if (dz20Var != null) {
                dz20Var.Qc(null);
            }
        }
    }

    public ene(Activity activity, ikd ikdVar, k930.f fVar) {
        this.c = activity;
        this.d = ikdVar;
        this.e = fVar;
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new dne(this, 0));
        this.f = a2;
        this.g = e43.l(new ysn((xne) a2.getValue()), new n4v((xne) a2.getValue()), new hzi((xne) a2.getValue(), o25.a().b()), new hp9(ClipsBottomSheetOptions.CANCEL.ordinal()));
        this.h = new bpn0(new h9(this, 23));
    }

    @Override // xsna.kq6
    public final dw20 a() {
        int v = dhr0.a.v();
        Activity activity = this.c;
        return new gne.a(new l7s(activity, v), new a(), (List) this.h.getValue(), new ix2(this, 26)).w0(activity.getString(R.string.clip_feed_need_configure_feed)).s0(activity.getString(R.string.clip_feed_will_be_hidden)).I0("clips_bottom_sheet_not_interested");
    }
}
