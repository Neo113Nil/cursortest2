package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class o0r implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (r8 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        r8 = (com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory) r1.f.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r8 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        r8 = r8.e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r8.hasNext() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        r9 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (((com.vk.music.bottomsheets.domain.model.mixsettings.MixOption) r9).b.equals(r2) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        r9 = (com.vk.music.bottomsheets.domain.model.mixsettings.MixOption) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r9 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        r8 = r9.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r6 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        r9 = r1.f.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r9.hasNext() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        r12 = ((com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory) ((java.util.Map.Entry) r9.next()).getValue()).e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r12.hasNext() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        r13 = (com.vk.music.bottomsheets.domain.model.mixsettings.MixOption) r12.next();
        r13.f = xsna.epx.f(r13.b, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        r3 = (com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory) r1.f.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        if (r8 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        r3 = r3.e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
    
        if (r3.hasNext() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        r8 = (com.vk.music.bottomsheets.domain.model.mixsettings.MixOption) r3.next();
        r8.f = xsna.epx.f(r8.b, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        r1.x0();
        r3 = new xsna.a3j0(r2, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
    
        if (r6 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        r11 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        r1.notifyItemChanged(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0110, code lost:
    
        if (r5.intValue() != r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
    
        if (r6 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0119, code lost:
    
        return xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        r1.notifyItemChanged(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0086, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x005a, code lost:
    
        r5 = java.lang.Integer.valueOf(r8);
     */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1814491674, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:103)");
                    }
                    v0rVar.n("имя + многострочный текст + вложение", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                gzs gzsVar = (gzs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(446652815, intValue2, -1, "com.vk.games.presentation.components.gamesCatalogFooterError.<anonymous> (GamesCatalogFooterLoader.kt:42)");
                    }
                    q630 E = s200.E(txj0.f(txj0.h(q630.a.a, 60), 1.0f), 16, 8);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, E);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    xpy xpyVar = new xpy(1.0f, true);
                    String N = d370.N(R.string.vk_games_error_title, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().p;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, xpyVar, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.T, aVar2, 0, 0, 8184);
                    bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Link, ButtonAppearance.Accent, null, null, false, false, null, null, null, d370.N(R.string.vk_retry, 0, aVar2), null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190192);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                e4v0 e4v0Var = (e4v0) this.c;
                String str = (String) obj;
                String str2 = (String) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                List O0 = j5g.O0(e4v0Var.f.values());
                boolean z = e4v0Var.d;
                Iterator it = O0.iterator();
                int i = 0;
                while (true) {
                    String str3 = null;
                    int i2 = -1;
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else {
                        Object next = it.next();
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (!((MixCategory) next).d().isEmpty()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
        }
    }
}
