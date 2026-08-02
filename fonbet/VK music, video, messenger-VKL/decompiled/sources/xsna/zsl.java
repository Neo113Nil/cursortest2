package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DelayedPublishDialogsHelper.kt */
/* loaded from: classes17.dex */
public final class zsl {
    public static final zsl a = new zsl();

    public final void a(d5f d5fVar, com.vk.newsfeed.common.recycler.holders.attachments.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(855799614);
        int i2 = (M.y(d5fVar) ? 4 : 2) | i | (M.y(aVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(855799614, i2, -1, "com.vk.clips.upload.ui.impl.compose.features.delayed_publish.DelayedPublishDialogsHelper.BottomSheetContent (DelayedPublishDialogsHelper.kt:74)");
            }
            q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "pub_date_root");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            zsl zslVar = a;
            zslVar.b(d5fVar, M, (i2 & 14) | 48);
            zslVar.c(aVar, M, ((i2 >> 3) & 14) | 48);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vy7(i, 3, this, d5fVar, aVar);
        }
    }

    public final void b(d5f d5fVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-105570737);
        int i2 = (M.y(d5fVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-105570737, i2, -1, "com.vk.clips.upload.ui.impl.compose.features.delayed_publish.DelayedPublishDialogsHelper.ChangeButton (DelayedPublishDialogsHelper.kt:86)");
            }
            qiu0.a(d370.N(R.string.clips_publish_delayed_publication_change, 0, M), d5fVar, ahn.E(q630.a.a, "change_pub_date"), null, null, null, 0, CellButton$Appearance.Neutral, null, null, null, false, M, ((i2 << 3) & 112) | 12583296, 8056);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r85(this, d5fVar, i, 4);
        }
    }

    public final void c(com.vk.newsfeed.common.recycler.holders.attachments.a aVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-1600979677);
        if ((i & 6) == 0) {
            i2 = (M.y(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1600979677, i2, -1, "com.vk.clips.upload.ui.impl.compose.features.delayed_publish.DelayedPublishDialogsHelper.RemoveButton (DelayedPublishDialogsHelper.kt:96)");
            }
            qiu0.a(d370.N(R.string.clips_publish_delayed_publication_remove, 0, M), aVar, ahn.E(q630.a.a, "change_pub_date"), null, null, null, 0, CellButton$Appearance.Negative, null, null, null, false, M, ((i2 << 3) & 112) | 12583296, 8056);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z0(this, aVar, i, 1);
        }
    }
}
