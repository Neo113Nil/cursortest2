package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class guh0 implements zzs {
    public final /* synthetic */ huh0 b;

    public /* synthetic */ guh0(huh0 huh0Var) {
        this.b = huh0Var;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        b5a b5aVar = (b5a) obj2;
        UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) obj3;
        SearchStatInfoProvider searchStatInfoProvider = (SearchStatInfoProvider) obj4;
        Activity h = e3m.h((Context) obj);
        if (h != null) {
            MusicTrack musicTrack = uIBlockSearchHistoryTrack.A;
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MUSIC;
            String str = musicTrack.y;
            if (str == null) {
                str = "";
            }
            ic40.r(((fl4) this.b.b.getValue()).w(), h, MusicBottomSheetLaunchPoint.App.b, musicTrack, MusicPlaybackLaunchContext.Fb(uIBlockSearchHistoryTrack.f).Cb(jnj.a(musicTrack.V)), new p9a(b5aVar, uIBlockSearchHistoryTrack, searchStatInfoProvider.b(type, str, false)), false, false, uIBlockSearchHistoryTrack.b, uIBlockSearchHistoryTrack.c, 64);
        }
        return s3q0.a;
    }
}
