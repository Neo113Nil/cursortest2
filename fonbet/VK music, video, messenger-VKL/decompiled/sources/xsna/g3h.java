package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.q630;
import xsna.q8z;
import xsna.us2;

/* compiled from: CommunityHeaderContentWithDonutComposeView.kt */
/* loaded from: classes5.dex */
public final class g3h extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;

    public g3h(Context context) {
        super(context, null, 0);
        setBackground(e3m.f(R.attr.vk_ui_background_content, context));
        this.m = androidx.compose.runtime.k.b(z1h.l);
        this.n = androidx.compose.runtime.k.b(new kr6(7));
        this.o = androidx.compose.runtime.k.b(new d4(12));
        this.p = androidx.compose.runtime.k.b(new nh0(9));
    }

    private final z1h getModel() {
        return (z1h) ((zak0) this.m).getValue();
    }

    private final void setBackground(int i) {
        setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(i), dhr0.w(R.drawable.highlight, getContext())}));
    }

    private final void setModel(z1h z1hVar) {
        ((zak0) this.m).setValue(z1hVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        int l;
        androidx.compose.runtime.a M = aVar.M(605909075);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(605909075, i2, -1, "com.vk.profile.community.impl.ui.view.CommunityHeaderContentWithDonutComposeView.ThemedContent (CommunityHeaderContentWithDonutComposeView.kt:79)");
            }
            List H0 = !getModel().j ? EmptyList.b : ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp < 375 ? j5g.H0(getModel().g, 2) : getModel().g;
            us2.b b = xga0.b(-1836918415, M);
            StringBuilder sb = b.b;
            if (getModel().b) {
                M.K(-1191049311);
                boolean z = (i2 & 14) == 4 || M.y(this);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new i9z() { // from class: xsna.f3h
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            g3h.this.getOnSubscribedStateClick().invoke();
                        }
                    };
                    M.R(x);
                }
                l = b.l(new q8z.a("member_state", null, (i9z) x));
                try {
                    b.g(d370.N(R.string.community_status_button_group_joined, 0, M));
                    s3q0 s3q0Var = s3q0.a;
                    b.k(l);
                    b.f(rik0.a);
                    int i3 = getModel().f.a;
                    gzs<s3q0> onMembersClick = getOnMembersClick();
                    String d = uqm0.d(i3);
                    String i4 = uqm0.i(i3, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
                    int length = sb.length() + drm0.K(0, 6, i4, d, false);
                    int length2 = d.length() + length;
                    l = b.l(new q8z.a("members", null, new k3h(onMembersClick)));
                    try {
                        b.g(i4);
                        b.d(new hik0(0L, 0L, b6s.i, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), length, length2);
                        b.k(l);
                        M.j();
                    } finally {
                    }
                } finally {
                }
            } else {
                M.K(-1190546212);
                M.j();
                int i5 = getModel().f.a;
                gzs<s3q0> onMembersClick2 = getOnMembersClick();
                String d2 = uqm0.d(i5);
                String i6 = uqm0.i(i5, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
                int length3 = sb.length() + drm0.K(0, 6, i6, d2, false);
                int length4 = d2.length() + length3;
                l = b.l(new q8z.a("members", null, new k3h(onMembersClick2)));
                try {
                    b.g(i6);
                    b6s b6sVar = b6s.i;
                    b.d(new hik0(0L, 0L, b6sVar, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), length3, length4);
                    s3q0 s3q0Var2 = s3q0.a;
                    b.k(l);
                    int i7 = getModel().f.b;
                    if (getModel().j && i7 > 0) {
                        b.f(rik0.a);
                        int i8 = getModel().f.b;
                        gzs<s3q0> onFriendsClick = getOnFriendsClick();
                        String d3 = uqm0.d(i8);
                        String i9 = uqm0.i(i8, R.plurals.group_friends_members_count, R.string.community_friends_formatted, true);
                        int length5 = sb.length() + drm0.K(0, 6, i9, d3, false);
                        int length6 = d3.length() + length5;
                        l = b.l(new q8z.a("friends", null, new k3h(onFriendsClick)));
                        try {
                            b.g(i9);
                            b.d(new hik0(0L, 0L, b6sVar, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), length5, length6);
                        } finally {
                        }
                    }
                } finally {
                }
            }
            us2 n = b.n();
            M.j();
            q630 h = txj0.h(txj0.f(q630.a.a, 1.0f), 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j3h.b(n, H0, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(h, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a)), getOnFriendsClick(), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.k(this, i, 4);
        }
    }

    public final void B(z1h z1hVar) {
        setModel(z1hVar);
    }

    public final gzs<s3q0> getOnFriendsClick() {
        return (gzs) ((zak0) this.o).getValue();
    }

    public final gzs<s3q0> getOnMembersClick() {
        return (gzs) ((zak0) this.p).getValue();
    }

    public final gzs<s3q0> getOnSubscribedStateClick() {
        return (gzs) ((zak0) this.n).getValue();
    }

    public final void setOnFriendsClick(gzs<s3q0> gzsVar) {
        ((zak0) this.o).setValue(gzsVar);
    }

    public final void setOnMembersClick(gzs<s3q0> gzsVar) {
        ((zak0) this.p).setValue(gzsVar);
    }

    public final void setOnSubscribedStateClick(gzs<s3q0> gzsVar) {
        ((zak0) this.n).setValue(gzsVar);
    }
}
