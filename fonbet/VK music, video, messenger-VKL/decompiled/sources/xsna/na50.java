package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Size;
import android.view.View;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: MusicTrackCellHolder.kt */
/* loaded from: classes3.dex */
public final class na50 extends se50<MusicTrack> {
    public final rna n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public na50(rna rnaVar) {
        super(r0);
        VkCell vkCell = rnaVar.a;
        this.n = rnaVar;
        vkCell.setLeftMainPictureController(new ona(rnaVar.i));
        VkCell vkCell2 = rnaVar.a;
        vkCell2.setRightExtraViewController(new kna(vkCell2, rnaVar.l, rnaVar.j, rnaVar.k, rnaVar.h, rnaVar.d));
    }

    @Override // xsna.se50
    public final void V5(String str, boolean z, int i, Object obj) {
        MusicTrack musicTrack = (MusicTrack) obj;
        super.V5(str, z, i, musicTrack);
        rna rnaVar = this.n;
        rnaVar.a.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new pna(musicTrack, i, rnaVar.c), VkCell.Left.Main.Size.Medium)));
    }

    @Override // xsna.se50
    public final void b6(MusicTrack musicTrack) {
        final MusicTrack musicTrack2 = musicTrack;
        boolean B = musicTrack2.B();
        rna rnaVar = this.n;
        boolean z = B || (musicTrack2.Pb() && !rnaVar.b.invoke().booleanValue());
        VkCell vkCell = rnaVar.a;
        vkCell.setEnabledAppearance(!z);
        vkCell.setOnClickListener(new rjc(1, this, musicTrack2));
        vkCell.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.ma50
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                izs<MusicTrack, Boolean> izsVar = na50.this.n.f;
                if (izsVar != null) {
                    return izsVar.invoke(musicTrack2).booleanValue();
                }
                return false;
            }
        });
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new pna(musicTrack2, -1, rnaVar.c), VkCell.Left.Main.Size.Medium)));
        vkCell.setMiddle(l6(musicTrack2, null));
        o6(m6(musicTrack2, false, ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.se50
    public final void g6(String str, boolean z) {
        MusicTrack musicTrack = (MusicTrack) this.l;
        if (musicTrack == null) {
            return;
        }
        rna rnaVar = this.n;
        boolean z2 = rnaVar.k != null && z;
        rnaVar.a.setMiddle(l6(musicTrack, str));
        o6(m6(musicTrack, z2, str));
    }

    public final VkCell.Middle.b l6(MusicTrack musicTrack, String str) {
        CharSequence charSequence;
        rna rnaVar = this.n;
        Context context = rnaVar.a.getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context);
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        tlo0.a aVar3 = tlo0.Companion;
        VkCell vkCell = rnaVar.a;
        Context context2 = vkCell.getContext();
        String str2 = musicTrack.d;
        String str3 = musicTrack.e;
        ucp ucpVar = ucp.a;
        VkCell.Middle.c cVar = null;
        tlo0.h f = u11.f(aVar3, ucp.j(s490.d(context2, str2, str3, R.attr.vk_ui_text_secondary), null));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(f, 1, truncateAt, (VkCell.Middle.e.b) null, (!musicTrack.Lb() || a == null) ? null : new VkCell.Middle.e.b.C0817b(new eko(a), k1u0.c.a, (tlo0.f) null, (Size) null, 12), 18);
        VkCell.Middle.d dVar = new VkCell.Middle.d(new tlo0.h(fai.d(musicTrack)), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50);
        if (str != null && str.length() != 0) {
            Context context3 = vkCell.getContext();
            Size size = oa50.a;
            Spanned fromHtml = Html.fromHtml(brm0.y(str, "\\/", DomExceptionUtils.SEPARATOR), 0);
            int length = fromHtml.length();
            while (length > 0 && fromHtml.charAt(length - 1) == '\n') {
                length--;
            }
            CharSequence subSequence = fromHtml.subSequence(0, length);
            String string = context3.getString(R.string.music_search_lyrics);
            int K = drm0.K(0, 6, string, "%s", false);
            if (K < 0) {
                charSequence = String.format(string, subSequence);
            } else {
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string.substring(0, K)).append(subSequence).append((CharSequence) string.substring(K + 2));
                int i = K - 1;
                append.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_subhead)), i >= 0 ? i : 0, append.length(), 33);
                charSequence = append;
            }
            tlo0.h hVar = new tlo0.h(charSequence);
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            cVar = new VkCell.Middle.c(hVar, null, 1, 2);
        }
        return VkCell.Middle.a.a(aVar2, eVar, dVar, cVar, 8);
    }

    public final lna m6(MusicTrack musicTrack, boolean z, String str) {
        DownloadingState downloadingState = musicTrack.J;
        boolean z2 = downloadingState instanceof DownloadingState.Downloading;
        rna rnaVar = this.n;
        boolean z3 = z2 || (downloadingState instanceof DownloadingState.Downloaded) || (downloadingState instanceof DownloadingState.PartlyDownloaded) || (downloadingState instanceof DownloadingState.Corrupted) || (downloadingState instanceof DownloadingState.PendingDownload) || rnaVar.l;
        rnaVar.getClass();
        return new lna(musicTrack, downloadingState, z3, z, false, 0, null, (rnaVar.m && str.length() == 0) ? f870.q(musicTrack.f) : null);
    }

    public final void o6(lna lnaVar) {
        Size size;
        rna rnaVar = this.n;
        VkCell vkCell = rnaVar.a;
        izs<MusicTrack, s3q0> izsVar = rnaVar.g;
        VkCell vkCell2 = rnaVar.a;
        VkCell.Right.d right = vkCell.getRight();
        VkCell.Right.e eVar = right != null ? right.b : null;
        VkCell.Right.e.d dVar = eVar instanceof VkCell.Right.e.d ? (VkCell.Right.e.d) eVar : null;
        VkCell.Right.d right2 = vkCell2.getRight();
        boolean z = (right2 != null ? right2.c : null) instanceof VkCell.Right.ExtraAction.d;
        boolean z2 = izsVar != null;
        if (epx.f(dVar != null ? dVar.a : null, lnaVar) && z == z2) {
            return;
        }
        if (dVar == null || (size = dVar.b) == null) {
            size = oa50.a;
        }
        vkCell2.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(lnaVar, size), izsVar != null ? new VkCell.Right.ExtraAction.d(new uh3(19, this, lnaVar), tq.h(tlo0.Companion, R.string.music_talkback_more), 4) : null, null, 25));
    }
}
