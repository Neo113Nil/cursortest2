package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bi40;
import xsna.ci40;
import xsna.q630;
import xsna.us2;

/* compiled from: AudioBookChapterItemView.kt */
/* loaded from: classes3.dex */
public final class ie4 {
    public static final bpn0 a = new bpn0(new de4(0));
    public static final bpn0 b = new bpn0(new ee4(0));

    /* compiled from: AudioBookChapterItemView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioBooksChapterProgressStatus.values().length];
            try {
                iArr[AudioBooksChapterProgressStatus.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioBooksChapterProgressStatus.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioBooksChapterProgressStatus.IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    public static final void a(hlb hlbVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        ci40 ci40Var;
        ?? r10;
        AudioBookChapter audioBookChapter = hlbVar.a;
        androidx.compose.runtime.a M = aVar.M(656748595);
        int i2 = (M.J(hlbVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(656748595, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookChapterComponent (AudioBookChapterItemView.kt:55)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            String str = audioBookChapter.c;
            AudioBooksChapterProgressStatus audioBooksChapterProgressStatus = audioBookChapter.f;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new md(5);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(str, null, null, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, M, 12610560, 70);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            int i3 = audioBookChapter.e;
            AudioBookFile audioBookFile = audioBookChapter.d;
            String c = c(context, audioBooksChapterProgressStatus, i3, audioBookFile != null ? audioBookFile.c : 0);
            us2.b bVar = new us2.b();
            bVar.g(c);
            if (audioBooksChapterProgressStatus == AudioBooksChapterProgressStatus.DONE) {
                s0x.a(bVar, "(✓)", " ✓");
            }
            us2 n = bVar.n();
            Map d = d(M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new oj(1);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a2, Cell$Middle.c.b.a(n, d, 0, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, M, 805306368, 444), null, null, M, 196608, 28);
            if (!((Boolean) a.getValue()).booleanValue() || jnj.d(audioBookChapter.i)) {
                M.K(1622996051);
                M.j();
                ci40Var = null;
            } else {
                M.K(1622528912);
                bi40 a4 = di40.a(audioBookChapter.j);
                if (androidx.compose.runtime.b.d()) {
                    r10 = 0;
                    androidx.compose.runtime.b.f(1899616736, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowDownCircle16> (VkSdkIcons.kt:96)");
                } else {
                    r10 = 0;
                }
                lg90 a5 = pg90.a(R.drawable.vk_icon_arrow_down_circle_16, r10, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                qzu0.a.getClass();
                lg90 K = qzu0.K(M);
                boolean booleanValue = ((Boolean) b.getValue()).booleanValue();
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = he4.b;
                    M.R(x3);
                }
                izs izsVar2 = (izs) ((fcy) x3);
                boolean y = ((i2 & 112) != 32 ? r10 : true) | M.y(audioBookChapter);
                Object x4 = M.x();
                if (y || x4 == c0012a) {
                    x4 = new ww(2, izsVar, audioBookChapter);
                    M.R(x4);
                }
                ci40 a6 = ci40.a.a(a4, a5, izsVar2, K, (gzs) x4, booleanValue, M);
                M.j();
                ci40Var = a6;
            }
            wiu0.b(f, false, null, a3, ci40Var, null, null, M, 0, 102);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fe4(hlbVar, izsVar, q630Var, i);
        }
    }

    public static final int b(bi40 bi40Var) {
        if (bi40Var.equals(bi40.a.a)) {
            return R.string.music_talkback_downloaded_audio_book_chapter;
        }
        if (bi40Var.equals(bi40.c.a)) {
            return R.string.music_talkback_download_audio_book_chapter;
        }
        if (bi40Var.equals(bi40.d.a)) {
            return R.string.music_talkback_pending_downloading_audio_book_chapter;
        }
        if (bi40Var instanceof bi40.b) {
            return R.string.music_talkback_downloading_audio_book_chapter;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String c(Context context, AudioBooksChapterProgressStatus audioBooksChapterProgressStatus, int i, int i2) {
        int i3 = a.$EnumSwitchMapping$0[audioBooksChapterProgressStatus.ordinal()];
        if (i3 == 1) {
            return context.getString(R.string.music_audio_book_listened, pq3.a(i2, context).toString());
        }
        if (i3 == 2) {
            return pq3.a(i2, context).toString();
        }
        if (i3 == 3) {
            return pq3.d(context, i2 * 1000, i * 1000).toString();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Map d(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1493332005, 0, -1, "com.vk.music.playlist.display.audiobook.presentation.getListenedIconInlineContent (AudioBookChapterItemView.kt:131)");
        }
        long l = l2l0.l(12);
        final float f = 6;
        azl azlVar = (azl) aVar.r(uvi.h);
        Map f2 = on00.f(new Pair("(✓)", new r0x(new esa0(azlVar.i0(azlVar.O0(l) + f), l, 4), kai.c(-113925474, new yzs() { // from class: xsna.ge4
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-113925474, intValue, -1, "com.vk.music.playlist.display.audiobook.presentation.getListenedIconInlineContent.<anonymous> (AudioBookChapterItemView.kt:145)");
                    }
                    q630 H = s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1105415512, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Check12> (VkIcons.kt:1174)");
                    }
                    lg90 b2 = or.b(aVar2, 1919423893, R.drawable.vk_icon_check_12, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(b2, null, H, ylu0Var.getIcon().a, aVar2, 440, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            }
        }, aVar))));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f2;
    }
}
