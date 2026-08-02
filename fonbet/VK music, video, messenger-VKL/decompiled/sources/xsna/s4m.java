package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerView;
import org.json.JSONObject;
import xsna.h7u0;
import xsna.s4m;
import xsna.tlo0;

/* compiled from: DetailsInfoItemNew.kt */
/* loaded from: classes5.dex */
public final class s4m extends we6 {
    public final CharSequence g;
    public final int h;
    public final boolean i;
    public final VkMiniInfoCell.Mode j;
    public final gzs<s3q0> k;
    public final String l;
    public final String m;
    public final UserId n;
    public final String o;
    public final gzs<s3q0> p;

    /* compiled from: DetailsInfoItemNew.kt */
    public static final class a extends vif0<s4m> implements UsableRecyclerView.j {
        public final VkMiniInfoCell n;

        public a(VkMiniInfoCell vkMiniInfoCell, ViewGroup viewGroup) {
            super(vkMiniInfoCell, viewGroup);
            this.n = vkMiniInfoCell;
        }

        public static void q6(s4m s4mVar, boolean z) {
            String str = s4mVar.m;
            String str2 = s4mVar.l;
            if (str != null) {
                g2h g2hVar = new g2h(s4mVar.n);
                String str3 = s4mVar.o;
                if (str3 != null) {
                    g2hVar.e = str3;
                }
                g2hVar.b = str;
                g2hVar.c = z ? "long_tap" : "tap";
                if (!(str2 == null || str2.length() == 0)) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("link", str2);
                    jSONObject.put("source", "other");
                    g2hVar.g = jSONObject;
                }
                g2hVar.a();
            }
        }

        @Override // xsna.vif0
        public final void i6(s4m s4mVar) {
            final s4m s4mVar2 = s4mVar;
            CharSequence charSequence = s4mVar2.g;
            gzs<s3q0> gzsVar = s4mVar2.p;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            VkMiniInfoCell.Mode mode = s4mVar2.j;
            VkMiniInfoCell vkMiniInfoCell = this.n;
            vkMiniInfoCell.setMode(mode);
            tlo0.a aVar = tlo0.Companion;
            ucp ucpVar = ucp.a;
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(u11.f(aVar, ucp.i(charSequence)), true, false, s4mVar2.i, true, null, 36));
            int i = s4mVar2.h;
            vkMiniInfoCell.setIcon(i != 0 ? new VkMiniInfoCell.d(new gko(i), null, 6) : null);
            gzs<s3q0> gzsVar2 = s4mVar2.k;
            if (gzsVar2 != null) {
                vkMiniInfoCell.setOnClickListener(new q4m(gzsVar2, this, s4mVar2));
            } else {
                vkMiniInfoCell.setOnClickListener(null);
                vkMiniInfoCell.setClickable(false);
            }
            final String str = s4mVar2.l;
            if (str != null) {
                vkMiniInfoCell.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.r4m
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        s4m.a aVar2 = s4m.a.this;
                        or1 or1Var = new or1(aVar2.itemView.getContext());
                        s4m s4mVar3 = s4mVar2;
                        if (s4mVar3.k != null) {
                            or1Var.b(new x52(s4mVar3, aVar2), aVar2.itemView.getContext().getString(R.string.open));
                        }
                        String string = aVar2.itemView.getContext().getString(R.string.profile_copy);
                        String str2 = str;
                        or1Var.b(new x63(aVar2, str2, s4mVar3, 1), string);
                        if (xwk.d().a().g(str2)) {
                            or1Var.b(new k50(3, aVar2, s4mVar3), aVar2.itemView.getContext().getString(R.string.share));
                        }
                        h7u0.a c = or1Var.c();
                        c.h0(str2);
                        c.m();
                        return true;
                    }
                });
            } else {
                vkMiniInfoCell.setOnLongClickListener(null);
                vkMiniInfoCell.setLongClickable(false);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.j
        public final boolean isEnabled() {
            return ((s4m) this.m).k != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            gzs<s3q0> gzsVar = ((s4m) this.m).k;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public s4m() {
        throw null;
    }

    public s4m(CharSequence charSequence, int i, VkMiniInfoCell.Mode mode, gzs gzsVar, String str, String str2, UserId userId, pw pwVar, int i2) {
        boolean z = (i2 & 4) == 0;
        mode = (i2 & 8) != 0 ? VkMiniInfoCell.Mode.BaseAccent : mode;
        gzsVar = (i2 & 16) != 0 ? null : gzsVar;
        str = (i2 & 32) != 0 ? null : str;
        str2 = (i2 & 256) != 0 ? null : str2;
        userId = (i2 & 512) != 0 ? UserId.d : userId;
        String str3 = (i2 & 1024) != 0 ? null : "group_info";
        pwVar = (i2 & 2048) != 0 ? null : pwVar;
        this.g = charSequence;
        this.h = i;
        this.i = z;
        this.j = mode;
        this.k = gzsVar;
        this.l = str;
        this.m = str2;
        this.n = userId;
        this.o = str3;
        this.p = pwVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(viewGroup.getContext(), null, 6);
        vkMiniInfoCell.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new a(vkMiniInfoCell, viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return -1014;
    }
}
