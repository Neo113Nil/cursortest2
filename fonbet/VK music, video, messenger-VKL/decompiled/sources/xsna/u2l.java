package xsna;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorVh;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryMusicTrackVh;
import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$SubTitleParams;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.Protocol;
import xsna.avh0;
import xsna.qs80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u2l implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u2l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj5;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) obj4;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) obj3;
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj2;
                jkv jkvVar = (jkv) obj;
                int i2 = DebugDevImageFragment.U;
                if (epx.f(jkvVar.z, ((Ref$ObjectRef) obj6).element)) {
                    StringBuilder sb = new StringBuilder("Protocol: ");
                    Protocol protocol = jkvVar.f;
                    sb.append(protocol != null ? protocol.name() : null);
                    appCompatTextView.setText(sb.toString());
                    appCompatTextView2.setText("Time: " + jkvVar.O);
                    appCompatTextView3.setText("Total Time: " + ref$LongRef.element);
                }
                return s3q0.a;
            case 1:
                SearchAuthorVh searchAuthorVh = (SearchAuthorVh) obj6;
                Context context = (Context) obj5;
                UserId userId = (UserId) obj4;
                SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) obj3;
                UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) obj2;
                if (((qs80) obj) instanceof qs80.c) {
                    searchAuthorVh.e(CommonVideoStat$CommunityClickInfo.Direction.TO_PLAYER_LIVE);
                } else {
                    searchAuthorVh.e(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
                    searchAuthorVh.d(context, userId, searchStatsLoggingInfo, uIBlockSearchAuthor);
                }
                return s3q0.a;
            default:
                MusicTrack musicTrack = (MusicTrack) obj6;
                String str = (String) obj4;
                return new zuh0(new avh0.c(musicTrack.Jb(), null, ((SearchHistoryMusicTrackVh) obj5).k.getString(musicTrack.Bb() == 1 ? R.string.music_talkback_track_cover_one_author : R.string.music_talkback_track_cover_many_authors, musicTrack.d, ob50.a(musicTrack)), 14), di40.a(musicTrack.J), new bvh0(musicTrack.d, Boolean.valueOf(musicTrack.s)), str != null ? new SearchHistoryItemViewParams$SubTitleParams(str, null) : ((zuh0) obj).d, (SearchHistoryItemViewParams$ActionIconParams) obj3, (SearchHistoryItemViewParams$ActionIconParams) obj2);
        }
    }
}
