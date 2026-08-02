package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.r4i;

/* compiled from: CommunityUnpublishedPostsBottomSheet.kt */
/* loaded from: classes5.dex */
public final class q4i extends jmu0 {
    public final r4i h1;

    /* compiled from: CommunityUnpublishedPostsBottomSheet.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final gzs<s3q0> d;

        public a(int i, int i2, int i3, gzs<s3q0> gzsVar) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action(titleResId=");
            sb.append(this.a);
            sb.append(", iconResId=");
            sb.append(this.b);
            sb.append(", counter=");
            sb.append(this.c);
            sb.append(", onClick=");
            return uf3.d(sb, this.d, ')');
        }
    }

    /* compiled from: CommunityUnpublishedPostsBottomSheet.kt */
    public static final class b extends wpi {
        public final r4i g;

        public b(Context context, r4i r4iVar) {
            super(context, tzp0.a(null, 3));
            this.g = r4iVar;
            B(cn70.a() * 12.0f, true, false);
            x(0);
            c(new cpo(false, 0, 7));
            F0(true);
            I(true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new q4i(this.g);
        }
    }

    public q4i(r4i r4iVar) {
        this.h1 = r4iVar;
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        ListBuilder g;
        aVar.K(-2128563047);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2128563047, 8, -1, "com.vk.profile.community.newsfeed.impl.posting.CommunityUnpublishedPostsBottomSheet.ThemedContent (CommunityUnpublishedPostsBottomSheet.kt:40)");
        }
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630.a aVar2 = q630.a.a;
        q630 c = qri.c(aVar, aVar2);
        cri.h7.getClass();
        LayoutNode.a aVar3 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar3);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a2, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(getString(R.string.unpublished_posts_title), null, null, null, null, aVar, 196608, 30);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = new zj(20);
            aVar.R(x);
        }
        Object obj2 = obj;
        muv0.h(TopBar$Middle.Text.b.a(a3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar, 6), null, null, null, null, null, null, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 100663296, 0, 7934);
        androidx.compose.runtime.a aVar4 = aVar;
        f9t.e(txj0.h(aVar2, kqu0.r), aVar4, 0);
        aVar4.K(-1800407593);
        r4i r4iVar = this.h1;
        boolean z = r4iVar.b;
        r4i.a aVar5 = r4iVar.a;
        int i2 = aVar5.a;
        int i3 = aVar5.c;
        int i4 = aVar5.b;
        if (z) {
            ListBuilder e = e43.e();
            p4g.a(new a(R.string.profile_unpublished_suggested_posts_title, R.drawable.vk_icon_inbox_outline_28, i4, new xyh(r4iVar, 1)), e, i4 > 0);
            p4g.a(new a(R.string.postponed_posts_title_short, R.drawable.vk_icon_calendar_outline_24, i3, new mag(r4iVar, 7)), e, i3 > 0);
            p4g.a(new a(R.string.draft_posts_title, R.drawable.vk_icon_scribble_pencil_rectangle_outline_24, i2, new sx0(r4iVar, 24)), e, i2 > 0);
            g = e.g();
        } else {
            ListBuilder e2 = e43.e();
            p4g.a(new a(R.string.draft_posts_title, R.drawable.vk_icon_scribble_pencil_rectangle_outline_24, i2, new com.vk.movika.sdk.base.logic.interactor.b(r4iVar, 27)), e2, i2 > 0);
            p4g.a(new a(R.string.postponed_posts_title_short, R.drawable.vk_icon_calendar_outline_24, i3, new v6(r4iVar, 26)), e2, i3 > 0);
            p4g.a(new a(R.string.suggested_posts_title_long, R.drawable.vk_icon_inbox_outline_28, i4, new bih(r4iVar, 4)), e2, i4 > 0);
            g = e2.g();
        }
        int i5 = 0;
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar6 = (ListBuilder.a) listIterator;
            if (!aVar6.hasNext()) {
                break;
            }
            a aVar7 = (a) aVar6.next();
            lg90 a4 = pg90.a(aVar7.b, i5, aVar4);
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i5, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.i0 a5 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(a4, size, ylu0Var.getIcon().a, null, null, aVar, 196664, 24), null, aVar, 2);
            com.vk.core.compose.component.cell.content.k0 a6 = Cell$Middle.a.a(Cell$Middle.d.b.a(getString(aVar7.a), null, null, 1, null, null, aVar, 12610560, 102), null, null, null, aVar, 196608, 30);
            com.vk.core.compose.component.cell.content.y0 a7 = o.c.a(com.vk.core.compose.component.cell.content.m.a(String.valueOf(aVar7.c), null, aVar, 384, 2), null, null, null, null, aVar, 62);
            q630 E = ahn.E(aVar2, "UnpublishedCell");
            boolean y = aVar.y(this) | aVar.J(aVar7);
            Object x2 = aVar.x();
            Object obj3 = obj2;
            if (y || x2 == obj3) {
                x2 = new com.vk.movika.sdk.base.ui.r(5, this, aVar7);
                aVar.R(x2);
            }
            wiu0.b(E, false, a5, a6, a7, (gzs) x2, null, aVar, 6, 66);
            aVar4 = aVar;
            obj2 = obj3;
            i5 = 0;
        }
        aVar4.j();
        if (xga0.c(aVar2, kqu0.w, aVar4, 0)) {
            androidx.compose.runtime.b.e();
        }
        aVar4.j();
    }
}
