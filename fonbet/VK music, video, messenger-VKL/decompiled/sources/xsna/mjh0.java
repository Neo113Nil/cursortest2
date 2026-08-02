package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosGridTypeDto;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import kotlin.NoWhenBranchMatchedException;
import xsna.lgj0;
import xsna.mke;

/* compiled from: SdkFeedRepository.kt */
/* loaded from: classes17.dex */
public abstract class mjh0 implements t8e {
    public final oie a;
    public final yof b;
    public final String c;

    public mjh0(v6e v6eVar, oie oieVar, zof zofVar, k6k k6kVar) {
        String str;
        String str2;
        this.a = oieVar;
        this.b = zofVar;
        ClipFeedTab clipFeedTab = v6eVar.b;
        if (clipFeedTab instanceof ClipFeedTab.TopVideo) {
            ClipFeedTab.TopVideo topVideo = (ClipFeedTab.TopVideo) clipFeedTab;
            str = topVideo.c;
            if (str == null) {
                int i = u8e.$EnumSwitchMapping$0[topVideo.b.ordinal()];
                if (i == 1) {
                    str = "clips";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "retention_block";
                }
            }
        } else if (clipFeedTab instanceof ClipFeedTab.Compilation) {
            str = ((ClipFeedTab.Compilation) clipFeedTab).e;
        } else if (clipFeedTab instanceof ClipFeedTab.Hashtag) {
            str = ((ClipFeedTab.Hashtag) clipFeedTab).d;
        } else if (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) {
            str = ((ClipFeedTab.NewsfeedDiscoverMedia) clipFeedTab).d;
        } else if (clipFeedTab instanceof ClipFeedTab.SingleClip) {
            str = ((ClipFeedTab.SingleClip) clipFeedTab).d;
        } else if (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) {
            str = ((ClipFeedTab.SingleClipByVideoId) clipFeedTab).f;
        } else if (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) {
            str = ((ClipFeedTab.SingleClipWithDecoration) clipFeedTab).d;
        } else if (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) {
            int i2 = ClipFeedTab.ClipsFromShopsSource.a.$EnumSwitchMapping$0[((ClipFeedTab.ClipsFromShopsSource) clipFeedTab).Fb().ordinal()];
            if (i2 == 1) {
                str2 = "clips_shops_deeplink";
            } else if (i2 == 2) {
                str2 = "clips_shops_block_similar";
            } else if (i2 == 3) {
                str2 = "clips_more_shops_similar";
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "clips_shops_tab";
            }
            str = str2;
        } else {
            str = clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource ? "clips_trends_tab" : clipFeedTab instanceof ClipFeedTab.NewsMonotheme ? ((ClipFeedTab.NewsMonotheme) clipFeedTab).e : null;
        }
        this.c = str != null ? str : "clips";
    }

    public final io.reactivex.rxjava3.core.x<qih0> d(mke.q qVar, PaginationKey paginationKey) {
        int i;
        ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto = ShortVideoGetGridShortVideosGridTypeDto.NEWS_MONOTHEME;
        String str = qVar.a;
        yof yofVar = this.b;
        y6e O = yofVar.O();
        b6e g0 = yofVar.g0();
        if (paginationKey instanceof PaginationKey.Initial) {
            i = O.a ? O.b : g0.a;
        } else {
            if (!(paginationKey instanceof PaginationKey.LoadedFull) && !(paginationKey instanceof PaginationKey.Next) && !(paginationKey instanceof PaginationKey.NextPageWithDecoration)) {
                throw new NoWhenBranchMatchedException();
            }
            i = g0.a;
        }
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        String str2 = next != null ? next.b : null;
        return e(lgj0.a.e(shortVideoGetGridShortVideosGridTypeDto, str, Integer.valueOf(i), (192 & 8) == 0 ? str2 : null, this.c, xfj0.a));
    }

    public abstract io.reactivex.rxjava3.internal.operators.single.y e(xy2 xy2Var);
}
