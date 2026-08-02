package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.gdn;
import xsna.phw;
import xsna.q630;
import xsna.rco0;

/* compiled from: AudiobookListContent.kt */
/* loaded from: classes3.dex */
public final class f15 extends tab0 {
    public static final float l = 32;
    public final mtk0<List<AudioBookPerson>> e;
    public final mtk0<List<AudioBookPerson>> f;
    public final mtk0<n05> g;
    public final mtk0<Boolean> h;
    public final mtk0<String> i;
    public final pg4 j;
    public final i15 k;

    /* compiled from: AudiobookListContent.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((i15) this.receiver).a.invoke(gdn.e.a.b);
            return s3q0.a;
        }
    }

    /* compiled from: AudiobookListContent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((i15) this.receiver).a.invoke(gdn.e.a.b);
            return s3q0.a;
        }
    }

    /* compiled from: AudiobookListContent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((i15) this.receiver).a.invoke(gdn.e.b.b);
            return s3q0.a;
        }
    }

    public f15(wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3, wh50 wh50Var4, wh50 wh50Var5, wh50 wh50Var6, wh50 wh50Var7, pg4 pg4Var, i15 i15Var) {
        super(wh50Var, wh50Var2, new e15(1, i15Var, i15.class, "onOpenUrl", "onOpenUrl(Ljava/lang/String;)V", 0, 0));
        this.e = wh50Var3;
        this.f = wh50Var4;
        this.g = wh50Var5;
        this.h = wh50Var6;
        this.i = wh50Var7;
        this.j = pg4Var;
        this.k = i15Var;
    }

    public static String j(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
        Image image;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(675573684, i, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.getAvatarUrlFrom (AudiobookListContent.kt:225)");
        }
        AudioBookPerson audioBookPerson = (AudioBookPerson) j5g.a0((List) mtk0Var.getValue());
        String str = null;
        Thumb thumb = (audioBookPerson == null || (image = audioBookPerson.e) == null) ? null : new Thumb(image);
        if (thumb == null) {
            aVar.K(-200946669);
        } else {
            aVar.K(686254510);
            str = skd.d(thumb, l, aVar);
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return str;
    }

    public static String k(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(316372358, i, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.getPersonText (AudiobookListContent.kt:213)");
        }
        AudioBookPerson audioBookPerson = (AudioBookPerson) j5g.a0((List) mtk0Var.getValue());
        if (((List) mtk0Var.getValue()).size() > 1) {
            aVar.K(1890876681);
            StringBuilder sb = new StringBuilder();
            sb.append(audioBookPerson != null ? audioBookPerson.c : null);
            sb.append(' ');
            sb.append(d370.N(R.string.music_audio_book_narrator_and_other, 0, aVar));
            r1 = sb.toString();
            aVar.j();
        } else {
            aVar.K(1890994419);
            aVar.j();
            if (audioBookPerson != null) {
                r1 = audioBookPerson.c;
            }
        }
        if (r1 == null) {
            r1 = "";
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return r1;
    }

    @Override // xsna.tab0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-245739248);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-245739248, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.Component (AudiobookListContent.kt:68)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            xvy a2 = zvy.a(0, 3, M);
            q630 E = ahn.E(q630.a.a, "audiobookChapterItemList");
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new za(this, 7);
                M.R(x);
            }
            lqy.a(E, a2, null, null, null, null, false, null, (izs) x, M, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nz1(this, q630Var, i, 1);
        }
    }

    public final void c(hlb hlbVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(569977750);
        int i2 = (M.J(hlbVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(569977750, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.ListItemComponent (AudiobookListContent.kt:304)");
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new a8(this, 5);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new h4(2, this, hlbVar);
                M.R(x2);
            }
            ie4.a(hlbVar, izsVar, ahn.E(ojc.c(m, false, null, null, (gzs) x2, 15), "audiobookChapterItem"), M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e3(this, hlbVar, i, 4);
        }
    }

    public final void d(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1496147151);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1496147151, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.ListTitleComponent (AudiobookListContent.kt:316)");
            }
            nab0.a(d370.N(!z ? R.string.music_audio_books_all_chapters : R.string.music_audio_books_fairy_tales, 0, M), ahn.E(q630.a.a, "tracksCount"), !z ? this.b.getValue() : null, M, 48, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, i) { // from class: xsna.d15
                public final /* synthetic */ boolean c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    f15.this.d(this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void e(final chs chsVar, final lg90 lg90Var, final String str, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        efj b2;
        androidx.compose.runtime.a M = aVar.M(-1489782983);
        if ((i2 & 6) == 0) {
            i3 = (M.J(chsVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1489782983, i3, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.PersonAvatar (AudiobookListContent.kt:274)");
            }
            if ((chsVar instanceof chs.b) || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                M.K(2067502235);
                List a2 = k1a0.a(i);
                ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new l5g(f870.c(((Number) it.next()).intValue())));
                }
                b2 = rco0.a.b(new y7z(arrayList, null, 0L, 9187343241974906880L, 0), str.length() == 0 ? "" : j5g.g0(drm0.c0(str, new String[]{" "}, 2, 2), "", null, null, 0, new j0r(16), 30), M, 3072);
                M.j();
            } else {
                M.K(-1457318930);
                b2 = phw.a.a(lg90Var, null, null, null, null, M, 196616 | ((i3 >> 3) & 14), 30);
                M.j();
            }
            ldu0.b(b2, l, null, null, null, false, null, null, null, M, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.a15
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    f15.this.e(chsVar, lg90Var, str, i, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void f(final String str, final String str2, final String str3, final int i, final q630 q630Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1562884457);
        if ((i2 & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.J(this) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1562884457, i3, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.PersonItem (AudiobookListContent.kt:237)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new vt1(2);
                M.R(x);
            }
            q630 b2 = egi0.b(f, true, (izs) x);
            boolean z = (458752 & i3) == 131072;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new v05(0, gzsVar);
                M.R(x2);
            }
            wiu0.b(ojc.c(b2, false, null, null, (gzs) x2, 15), false, Cell$Left.Main.a.C0731a.a(kai.c(-1894237488, new zzs() { // from class: xsna.w05
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1894237488, intValue, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.PersonItem.<anonymous> (AudiobookListContent.kt:244)");
                        }
                        final f15 f15Var = this;
                        final String str4 = str;
                        final int i4 = i;
                        fwu0.c(null, null, str2, null, null, null, null, kai.c(1951367073, new a0t() { // from class: xsna.y05
                            @Override // xsna.a0t
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                                int i5;
                                chs chsVar = (chs) obj6;
                                lg90 lg90Var = (lg90) obj7;
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj8;
                                int intValue2 = ((Integer) obj9).intValue();
                                if ((intValue2 & 48) == 0) {
                                    i5 = (aVar3.J(chsVar) ? 32 : 16) | intValue2;
                                } else {
                                    i5 = intValue2;
                                }
                                if ((intValue2 & 384) == 0) {
                                    i5 |= (intValue2 & 512) == 0 ? aVar3.J(lg90Var) : aVar3.y(lg90Var) ? 256 : 128;
                                }
                                if (aVar3.t(i5 & 1, (i5 & 1169) != 1168)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1951367073, i5, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.PersonItem.<anonymous>.<anonymous> (AudiobookListContent.kt:245)");
                                    }
                                    int i6 = i5 >> 3;
                                    f15.this.e(chsVar, lg90Var, str4, i4, aVar3, (i6 & 14) | 64 | (i6 & 112));
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 100663296, 251);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M), Cell$Middle.a.a(Cell$Middle.d.b.a(str, null, null, 1, null, null, M, (i3 & 14) | 12610560, 102), Cell$Middle.c.b.b(str3, 1, null, null, null, M, ((i3 >> 6) & 14) | 12583344, 120), null, null, M, 196608, 28), null, null, null, M, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.x05
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f15.this.f(str, str2, str3, i, q630Var, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void g(int i, androidx.compose.runtime.a aVar) {
        i15 i15Var;
        int i2;
        int i3;
        int i4;
        f15 f15Var = this;
        androidx.compose.runtime.a M = aVar.M(601787842);
        int i5 = (M.J(f15Var) ? 4 : 2) | i;
        if (M.t(i5 & 1, (i5 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(601787842, i5, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.PersonsColumn (AudiobookListContent.kt:166)");
            }
            int i6 = (i5 << 3) & 112;
            mtk0<List<AudioBookPerson>> mtk0Var = f15Var.e;
            String k = k(mtk0Var, M, i6);
            mtk0<List<AudioBookPerson>> mtk0Var2 = f15Var.f;
            String k2 = k(mtk0Var2, M, i6);
            String j = j(mtk0Var, M, i6);
            boolean equals = k.equals(k2);
            q630.a aVar2 = q630.a.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            i15 i15Var2 = f15Var.k;
            if (equals && mtk0Var.getValue().size() == 1 && mtk0Var2.getValue().size() == 1) {
                M.K(668468701);
                String str = d370.N(R.string.music_audio_book_author, 0, M) + ' ' + d370.N(R.string.dot_separator, 0, M) + ' ' + d370.N(R.string.music_audio_book_narrator, 0, M);
                float f = 10;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                }
                squ0 squ0Var = (squ0) M.r(rrv0.b);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                squ0Var.getClass();
                q630 E = ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tqu0.e, 5), "audiobookAuthors");
                boolean J = M.J(i15Var2);
                Object x = M.x();
                if (J || x == c0012a) {
                    x = new a(0, i15Var2, i15.class, "showAuthor", "showAuthor()V", 0);
                    M.R(x);
                }
                fcy fcyVar = (fcy) x;
                AudioBookPerson audioBookPerson = (AudioBookPerson) j5g.a0(mtk0Var.getValue());
                f15Var = this;
                f15Var.f(k, j, str, audioBookPerson != null ? audioBookPerson.b : 0, E, (gzs) fcyVar, M, (i5 << 18) & 3670016);
                M.j();
            } else {
                M.K(669219397);
                String N = d370.N(R.string.music_audio_book_author, 0, M);
                String N2 = d370.N(R.string.music_audio_book_narrator, 0, M);
                q630 E2 = ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "audiobookAuthors");
                boolean J2 = M.J(i15Var2);
                Object x2 = M.x();
                if (J2 || x2 == c0012a) {
                    i15Var = i15Var2;
                    x2 = new b(0, i15Var, i15.class, "showAuthor", "showAuthor()V", 0);
                    M.R(x2);
                } else {
                    i15Var = i15Var2;
                }
                fcy fcyVar2 = (fcy) x2;
                AudioBookPerson audioBookPerson2 = (AudioBookPerson) j5g.a0(mtk0Var.getValue());
                if (audioBookPerson2 != null) {
                    i3 = audioBookPerson2.b;
                    i2 = i5;
                } else {
                    i2 = i5;
                    i3 = 0;
                }
                int i7 = (i2 << 18) & 3670016;
                i15 i15Var3 = i15Var;
                f(k, j, N, i3, E2, (gzs) fcyVar2, M, i7 | 24576);
                String j2 = j(mtk0Var2, M, i6);
                if (androidx.compose.runtime.b.d()) {
                    i4 = 0;
                    androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                } else {
                    i4 = 0;
                }
                squ0 squ0Var2 = (squ0) M.r(rrv0.b);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                squ0Var2.getClass();
                q630 E3 = ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tqu0.e, 7), "audiobookReader");
                boolean J3 = M.J(i15Var3);
                Object x3 = M.x();
                if (J3 || x3 == c0012a) {
                    x3 = new c(0, i15Var3, i15.class, "showNarrator", "showNarrator()V", 0);
                    M.R(x3);
                }
                fcy fcyVar3 = (fcy) x3;
                AudioBookPerson audioBookPerson3 = (AudioBookPerson) j5g.a0(mtk0Var2.getValue());
                f15Var = this;
                f15Var.f(k2, j2, N2, audioBookPerson3 != null ? audioBookPerson3.b : i4, E3, (gzs) fcyVar3, M, i7);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.k(f15Var, i, 2);
        }
    }

    public final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-571723504);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-571723504, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.Summary (AudiobookListContent.kt:105)");
            }
            q630 d = rte0.d(txj0.f(q630.a.a, 1.0f), vog0.b(20));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int i3 = i2 & 14;
            i(i3, M);
            g(i3, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.i(this, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i, androidx.compose.runtime.a aVar) {
        f15 f15Var;
        androidx.compose.runtime.a aVar2;
        int i2;
        float f;
        q630.a aVar3;
        a.C0011a.C0012a c0012a;
        f15 f15Var2;
        boolean z;
        Object x;
        androidx.compose.runtime.a M = aVar.M(-1390409437);
        int i3 = i | (M.J(this) ? 4 : 2);
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1390409437, i3, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.SummaryText (AudiobookListContent.kt:118)");
            }
            wlb0.i(M).getClass();
            float f2 = tqu0.e;
            q630.a aVar4 = q630.a.a;
            q630 H = s200.H(aVar4, f2, 13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z2 || x2 == c0012a2) {
                x2 = new im0(this, 6);
                M.R(x2);
            }
            yqv0.c(d370.N(R.string.music_audio_book_about_book, 0, M), ojc.c(H, false, null, null, (gzs) x2, 15), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).l, M, 100663296, 48, 5880);
            androidx.compose.runtime.a aVar5 = M;
            mtk0<String> mtk0Var = this.i;
            boolean N = drm0.N(mtk0Var.getValue());
            if (N) {
                i2 = 11;
                f = 0.0f;
                aVar3 = aVar4;
                aVar5.K(-1027592481);
            } else {
                aVar5.K(-1022315909);
                wlb0.i(aVar5).getClass();
                i2 = 11;
                f = 0.0f;
                aVar3 = aVar4;
                yqv0.c(mtk0Var.getValue(), ahn.E(s200.H(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "illegalMentionText"), wlb0.h(aVar5).getText().s, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar5).I, aVar5, 0, 0, 8184);
                aVar5 = aVar5;
            }
            aVar5.j();
            int i5 = !N ? 12 : i2;
            wlb0.i(aVar5).getClass();
            q630.a aVar6 = aVar3;
            q630 H2 = s200.H(s200.F(f2, f, 2, aVar6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z3 = i4 == 4;
            Object x3 = aVar5.x();
            if (z3) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
                if (x3 != c0012a) {
                    f15Var2 = this;
                    a.C0011a.C0012a c0012a3 = c0012a;
                    androidx.compose.runtime.a aVar7 = aVar5;
                    yqv0.c(f15Var2.b(i4, aVar5).c, ahn.E(ojc.c(H2, false, null, null, (gzs) x3, 15), "audiobookDescriptionBlock"), wlb0.h(aVar5).getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(aVar5).c0, aVar7, 100663296, 48, 5880);
                    wlb0.i(aVar7).getClass();
                    q630 F = s200.F(f2, f, 2, aVar6);
                    z = i4 == 4;
                    x = aVar7.x();
                    if (!z || x == c0012a3) {
                        f15Var = this;
                        x = new h20(f15Var, 4);
                        aVar7.R(x);
                    } else {
                        f15Var = this;
                    }
                    q630 E = ahn.E(ojc.c(F, false, null, null, (gzs) x, 15), "audiobookDescriptionShowAllBtn");
                    String N2 = d370.N(R.string.music_show_more, 0, aVar7);
                    frv0 frv0Var = wlb0.l(aVar7).X;
                    long j = wlb0.h(aVar7).getText().f;
                    aVar2 = aVar7;
                    yqv0.c(N2, E, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            f15Var2 = this;
            x3 = new ra(f15Var2, 5);
            aVar5.R(x3);
            a.C0011a.C0012a c0012a32 = c0012a;
            androidx.compose.runtime.a aVar72 = aVar5;
            yqv0.c(f15Var2.b(i4, aVar5).c, ahn.E(ojc.c(H2, false, null, null, (gzs) x3, 15), "audiobookDescriptionBlock"), wlb0.h(aVar5).getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(aVar5).c0, aVar72, 100663296, 48, 5880);
            wlb0.i(aVar72).getClass();
            q630 F2 = s200.F(f2, f, 2, aVar6);
            if (i4 == 4) {
            }
            x = aVar72.x();
            if (z) {
            }
            f15Var = this;
            x = new h20(f15Var, 4);
            aVar72.R(x);
            q630 E2 = ahn.E(ojc.c(F2, false, null, null, (gzs) x, 15), "audiobookDescriptionShowAllBtn");
            String N22 = d370.N(R.string.music_show_more, 0, aVar72);
            frv0 frv0Var2 = wlb0.l(aVar72).X;
            long j2 = wlb0.h(aVar72).getText().f;
            aVar2 = aVar72;
            yqv0.c(N22, E2, j2, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, aVar2, 0, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            f15Var = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new u05(f15Var, i, 0);
        }
    }
}
