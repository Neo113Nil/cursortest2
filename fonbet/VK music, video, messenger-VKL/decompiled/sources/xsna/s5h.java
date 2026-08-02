package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import xsna.dt1;
import xsna.q630;
import xsna.s5h;
import xsna.z4h;

/* compiled from: CommunityInternalMenuItemViewHolder.kt */
/* loaded from: classes5.dex */
public abstract class s5h extends vif0<z4h.a> {
    public final izs<CommunityProfileAction.CommunityInternalMenuAction, s3q0> n;
    public final rg50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;

    /* compiled from: CommunityInternalMenuItemViewHolder.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(dt1 dt1Var, boolean z, long j, gzs gzsVar, final s5h s5hVar, androidx.compose.runtime.a aVar, final int i) {
            final dt1 dt1Var2;
            final boolean z2;
            final long j2;
            final gzs gzsVar2;
            dt1 dt1Var3;
            long floatToRawIntBits;
            int i2;
            androidx.compose.runtime.a M = aVar.M(1038654219);
            int i3 = i | 1174 | (M.y(s5hVar) ? 16384 : 8192);
            if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    dt1.a.getClass();
                    dt1Var3 = dt1.a.b;
                    boolean v6 = s5hVar.v6();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-170449335, 6, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuDefaults.defaults (CommunityInternalMenuDefaults.kt:21)");
                    }
                    a5h a5hVar = a5h.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(a5h.b) & 4294967295L);
                    boolean y = M.y(s5hVar);
                    Object x = M.x();
                    if (y || x == a.C0011a.a) {
                        x = new hd(s5hVar, 28);
                        M.R(x);
                    }
                    i2 = i3 & (-8177);
                    z2 = v6;
                    gzsVar2 = (gzs) x;
                } else {
                    M.h();
                    dt1Var3 = dt1Var;
                    floatToRawIntBits = j;
                    gzsVar2 = gzsVar;
                    i2 = i3 & (-8177);
                    z2 = z;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1038654219, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemViewHolder.ComposeDefaultImpls.ContextMenu$default (CommunityInternalMenuItemViewHolder.kt:-1)");
                }
                dt1Var2 = dt1Var3;
                j2 = floatToRawIntBits;
                s5hVar.t6(dt1Var2, z2, j2, gzsVar2, M, i2 & 65534);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
                dt1Var2 = dt1Var;
                z2 = z;
                j2 = j;
                gzsVar2 = gzsVar;
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new wzs(z2, j2, gzsVar2, s5hVar, i) { // from class: xsna.r5h
                    public final /* synthetic */ boolean c;
                    public final /* synthetic */ long d;
                    public final /* synthetic */ gzs e;
                    public final /* synthetic */ s5h f;

                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(1);
                        s5h.a.a(dt1.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                        return s3q0.a;
                    }
                };
            }
        }
    }

    public s5h() {
        throw null;
    }

    public s5h(ViewGroup viewGroup, ComposeView composeView, boolean z, izs izsVar) {
        super(composeView, viewGroup);
        this.n = izsVar;
        this.o = androidx.compose.runtime.i.a(0);
        Boolean bool = Boolean.FALSE;
        this.p = androidx.compose.runtime.k.b(bool);
        this.q = androidx.compose.runtime.k.b(bool);
        this.r = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        composeView.setContent(new jai(879277198, new th3(this, 1), true));
    }

    public final void A6(boolean z) {
        ((zak0) this.q).setValue(Boolean.valueOf(z));
    }

    public final void B6(boolean z) {
        ((zak0) this.p).setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onClick() {
        if (((Boolean) ((zak0) this.r).getValue()).booleanValue()) {
            B6(true);
            return;
        }
        B6(false);
        this.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.CLICK, (z4h.a) this.m, Integer.valueOf(((wak0) this.o).getIntValue())));
    }

    public final void q6(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType, final String str, final String str2, final String str3, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str4;
        CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(920784277);
        if ((i & 6) == 0) {
            i2 = (M.o(communityMenuActionType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= M.J(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str3) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= M.y(this) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(920784277, i3, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemViewHolder.ConfirmationDialog (CommunityInternalMenuItemViewHolder.kt:97)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.q).getValue()).booleanValue();
            q630Var2 = q630.a.a;
            if (booleanValue) {
                M.K(-871398780);
                boolean y = M.y(this);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (y || x == c0012a) {
                    x = new qqe(this, 3);
                    M.R(x);
                }
                izs izsVar = (izs) x;
                boolean y2 = M.y(this) | ((i3 & 14) == 4);
                Object x2 = M.x();
                if (y2 || x2 == c0012a) {
                    communityMenuActionType2 = communityMenuActionType;
                    x2 = new vq6(5, this, communityMenuActionType2);
                    M.R(x2);
                } else {
                    communityMenuActionType2 = communityMenuActionType;
                }
                Alert$Button alert$Button = new Alert$Button(str3, (gzs) x2, Alert$Button.Style.Negative, null);
                String N = d370.N(R.string.community_menu_alert_menu_negative, 0, M);
                boolean y3 = M.y(this);
                Object x3 = M.x();
                if (y3 || x3 == c0012a) {
                    x3 = new p5h(this, 0);
                    M.R(x3);
                }
                int i4 = i3 >> 3;
                p7u0.c((i3 & 57344) | (i4 & 112) | (i4 & 14) | 100663296, 96, M, alert$Button, new Alert$Button(N, (gzs) x3, Alert$Button.Style.Neutral, null), null, null, str, str4, new xim(true, 5), izsVar, q630Var2);
            } else {
                communityMenuActionType2 = communityMenuActionType;
                M.K(-874903795);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            communityMenuActionType2 = communityMenuActionType;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType3 = communityMenuActionType2;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs() { // from class: xsna.q5h
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s5h.this.q6(communityMenuActionType3, str, str2, str3, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public abstract void s6(int i, androidx.compose.runtime.a aVar);

    public abstract void t6(dt1 dt1Var, boolean z, long j, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i);

    public final boolean v6() {
        return ((Boolean) ((zak0) this.p).getValue()).booleanValue();
    }

    @Override // xsna.vif0
    /* renamed from: x6, reason: merged with bridge method [inline-methods] */
    public void i6(z4h.a aVar) {
        B6(false);
        A6(false);
    }
}
