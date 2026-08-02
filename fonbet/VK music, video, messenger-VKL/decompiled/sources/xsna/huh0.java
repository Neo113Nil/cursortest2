package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchHistoryViewStyle;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryMusicTrackVh;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryOtherVh;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryRadioStationVh;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryVideoVh;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ikv0;
import xsna.u4a;

/* compiled from: SearchHistoryCatalogViewHolderFactory.kt */
/* loaded from: classes16.dex */
public final class huh0 {
    public final bpn0 a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final com.vk.music.track.a e;
    public final boolean f;

    /* compiled from: SearchHistoryCatalogViewHolderFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchHistoryViewStyle.Style.values().length];
            try {
                iArr[SearchHistoryViewStyle.Style.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.TrackLyrics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.RadioStation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Video.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SearchHistoryCatalogViewHolderFactory.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<MusicTrack, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(MusicTrack musicTrack) {
            return Boolean.valueOf(((huh0) this.receiver).e.i(musicTrack));
        }
    }

    /* compiled from: SearchHistoryCatalogViewHolderFactory.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<MusicTrack, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(MusicTrack musicTrack) {
            return Boolean.valueOf(((huh0) this.receiver).e.i0(musicTrack));
        }
    }

    public huh0(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, com.vk.music.track.a aVar, boolean z) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        this.c = bpn0Var3;
        this.d = bpn0Var4;
        this.e = aVar;
        this.f = z;
    }

    public static void b(Context context) {
        if (e3m.h(context) != null) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.u = new ikv0.d(context.getString(R.string.music_catalog_generic_error_message), (String) null, (ikv0.d.a) null, 6);
            aVar.e = 4000L;
            pkv0.f(aVar);
        }
    }

    public final CatalogViewHolder a(CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        u4a.b bVar = u4aVar.c;
        u4a.a aVar = u4aVar.b;
        SearchHistoryViewStyle searchHistoryViewStyle = catalogViewStyle instanceof SearchHistoryViewStyle ? (SearchHistoryViewStyle) catalogViewStyle : null;
        SearchHistoryViewStyle.Style style = searchHistoryViewStyle != null ? searchHistoryViewStyle.b : null;
        if (style == null || catalogViewType != CatalogViewType.LIST) {
            return new EmptyVh(false);
        }
        int i = a.$EnumSwitchMapping$0[style.ordinal()];
        return (i == 1 || i == 2) ? new SearchHistoryMusicTrackVh(bVar.f, bVar.a, aVar.i, aVar.f, new o4e(this, 10), new guh0(this), new com.vk.movika.tools.controls.seekbar.t(this, 12), new b(1, this, huh0.class, "canAddAudio", "canAddAudio(Lcom/vk/dto/music/MusicTrack;)Z", 0), new c(1, this, huh0.class, "canRemoveAudio", "canRemoveAudio(Lcom/vk/dto/music/MusicTrack;)Z", 0), aVar.m, !this.f) : i != 3 ? i != 4 ? new SearchHistoryOtherVh(bVar.f, bVar.a, aVar.f, ((b25) this.a.getValue()).c(), new un7(this, 3), new ini(this, 5), aVar.m) : new SearchHistoryVideoVh(bVar.f, bVar.a, aVar.f, new com.vk.movika.tools.controls.seekbar.p(this, 13), new yi4(9)) : new SearchHistoryRadioStationVh(bVar.f, bVar.a, aVar.i, aVar.f, new vp4(this, 7));
    }
}
