package xsna;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import androidx.compose.runtime.a;
import com.vk.common.links.LinksParserData;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;

/* compiled from: CommunityStrikeErrorBottomSheet.kt */
/* loaded from: classes17.dex */
public final class n2i extends jmu0 {
    public static final /* synthetic */ int j1 = 0;
    public final wh50<String> h1 = androidx.compose.runtime.k.b("");
    public final wh50<String> i1 = androidx.compose.runtime.k.b("");

    /* compiled from: CommunityStrikeErrorBottomSheet.kt */
    public static final class a extends kmu0 {
        public final String h;
        public final String i;

        public a(Context context, String str, String str2) {
            super(context, tzp0.a(null, 3));
            this.h = str;
            this.i = str2;
            F0(true);
            P0();
            O0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            n2i n2iVar = new n2i();
            String str = this.h;
            if (str == null) {
                str = "";
            }
            ((zak0) n2iVar.h1).setValue(str);
            String str2 = this.i;
            ((zak0) n2iVar.i1).setValue(str2 != null ? str2 : "");
            return n2iVar;
        }
    }

    /* compiled from: CommunityStrikeErrorBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((n2i) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1216170686);
        int i6 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i6 & 1, (i6 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1216170686, i6, -1, "com.vk.community.strikes.impl.dialog.CommunityStrikeErrorBottomSheet.ThemedContent (CommunityStrikeErrorBottomSheet.kt:30)");
            }
            String N = d370.N(R.string.community_strike_error_ok, 0, M);
            String str = (String) ((zak0) this.i1).getValue();
            VkTypographyToken vkTypographyToken = VkTypographyToken.Footnote;
            int i7 = i6 & 14;
            boolean z = i7 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new dwg(this, 3);
                M.R(x);
            }
            final izs izsVar = (izs) x;
            VkColorToken vkColorToken = VkColorToken.TextSubhead;
            VkColorToken vkColorToken2 = VkColorToken.TextLink;
            s8u0 s8u0Var = new s8u0(0);
            ucp ucpVar = ucp.a;
            SpannedString valueOf = SpannedString.valueOf(ucp.i(xwk.d().a().d(str, new LinksParserData(41851, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))));
            Iterable<qjc> u0 = valueOf != null ? rl3.u0(valueOf.getSpans(0, valueOf.length(), qjc.class)) : EmptyList.b;
            int i8 = s8u0Var.i(new klv0(vkTypographyToken, vkColorToken));
            try {
                s8u0Var.e(valueOf.toString());
                for (qjc qjcVar : u0) {
                    s8u0Var.d(new klv0(vkTypographyToken, vkColorToken2), valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar));
                    final String i9 = qjcVar.i();
                    if (i9 == null) {
                        i9 = "";
                    }
                    s8u0Var.a(new h2v0(i9, null, new i9z() { // from class: xsna.zpm0
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            izs izsVar2 = izsVar;
                            if (izsVar2 != null) {
                                izsVar2.invoke(i9);
                            }
                        }
                    }), valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar));
                    izsVar = izsVar;
                }
                s3q0 s3q0Var = s3q0.a;
                s8u0Var.f(i8);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    i3 = -1;
                    i4 = 0;
                    androidx.compose.runtime.b.f(1903584792, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationStrike96H> (VkIcons.kt:4024)");
                } else {
                    i3 = -1;
                    i4 = 0;
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_illustration_strike_96h, i4, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                vy20 a3 = qy20.c.a.a(a2, 0L, null, M, 6);
                xy20 b2 = py20.a.b(ws2.e((String) ((zak0) this.h1).getValue()), s8u0Var.j(8, M), M, 384);
                int i10 = (i7 == 4 || M.y(this)) ? 1 : i4;
                Object x2 = M.x();
                if (i10 != 0 || x2 == c0012a) {
                    i5 = i3;
                    b bVar = new b(0, this, n2i.class, "dismiss", "dismiss()V", 0);
                    M.R(bVar);
                    x2 = bVar;
                } else {
                    i5 = i3;
                }
                gzs gzsVar = (gzs) ((fcy) x2);
                int i11 = i5;
                boolean z2 = i4;
                i2 = 2;
                ty20 a4 = oy20.b.a(oy20.a.C3478a.a(N, gzsVar, null, null, null, null, M, 0, 8188), null, z2, M, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, z2 ? 1 : 0, i11, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                e5v0.b(hr80.m(q630.a.a, ylu0Var.getBackground().r, vog0.b(kqu0.f)), a3, b2, null, a4, M, 0, 24);
                aVar2 = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } catch (Throwable th) {
                s8u0Var.f(i8);
                throw th;
            }
        } else {
            aVar2 = M;
            i2 = 2;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fd4(this, i, i2);
        }
    }
}
