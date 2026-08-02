package xsna;

import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.menu.MusicBottomSheetHeaderMenuItem;
import com.vk.music.bottomsheets.menu.MusicBottomSheetListMenuItem;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.p4g;

/* compiled from: BaseMusicBottomSheetMenuConfig.kt */
/* loaded from: classes3.dex */
public final class jh6 implements lc40 {
    public final ListBuilder a;
    public final List<MusicBottomSheetListMenuItem> b;
    public final List<MusicBottomSheetListMenuItem> c;
    public final List<MusicBottomSheetListMenuItem> d;
    public final List<MusicBottomSheetHeaderMenuItem> e;
    public final List<MusicBottomSheetHeaderMenuItem> f;
    public final List<MusicBottomSheetHeaderMenuItem> g;

    public jh6() {
        ListBuilder e = e43.e();
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem = MusicBottomSheetListMenuItem.AddToMyMusic;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem2 = MusicBottomSheetListMenuItem.AddToPlaylist;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem3 = MusicBottomSheetListMenuItem.ShareToStory;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem4 = MusicBottomSheetListMenuItem.GoToArtist;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem5 = MusicBottomSheetListMenuItem.GoToAlbum;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem6 = MusicBottomSheetListMenuItem.MixByTrack;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem7 = MusicBottomSheetListMenuItem.PlayerSettingsMenu;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem8 = MusicBottomSheetListMenuItem.RemoveFromQueue;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem9 = MusicBottomSheetListMenuItem.RemoveFromMyMusic;
        MusicBottomSheetListMenuItem[] musicBottomSheetListMenuItemArr = {musicBottomSheetListMenuItem, musicBottomSheetListMenuItem2, musicBottomSheetListMenuItem3, musicBottomSheetListMenuItem4, musicBottomSheetListMenuItem5, musicBottomSheetListMenuItem6, musicBottomSheetListMenuItem7, musicBottomSheetListMenuItem8, musicBottomSheetListMenuItem9, MusicBottomSheetListMenuItem.Separator, MusicBottomSheetListMenuItem.ChangeVolume};
        p4g.a aVar = p4g.a;
        g5g.A(e, musicBottomSheetListMenuItemArr);
        this.a = e.g();
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem10 = MusicBottomSheetListMenuItem.Radio;
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem11 = MusicBottomSheetListMenuItem.SetTimer;
        this.b = e43.l(musicBottomSheetListMenuItem10, musicBottomSheetListMenuItem11, MusicBottomSheetListMenuItem.RemoveRadio);
        MusicBottomSheetListMenuItem musicBottomSheetListMenuItem12 = MusicBottomSheetListMenuItem.PlaySimilar;
        this.c = e43.l(musicBottomSheetListMenuItem12, musicBottomSheetListMenuItem8, musicBottomSheetListMenuItem9);
        this.d = e43.l(musicBottomSheetListMenuItem, musicBottomSheetListMenuItem2, musicBottomSheetListMenuItem4, musicBottomSheetListMenuItem5, musicBottomSheetListMenuItem12, musicBottomSheetListMenuItem11, musicBottomSheetListMenuItem8, musicBottomSheetListMenuItem9);
        MusicBottomSheetHeaderMenuItem musicBottomSheetHeaderMenuItem = MusicBottomSheetHeaderMenuItem.Share;
        this.e = Collections.singletonList(musicBottomSheetHeaderMenuItem);
        MusicBottomSheetHeaderMenuItem musicBottomSheetHeaderMenuItem2 = MusicBottomSheetHeaderMenuItem.ToggleBroadcast;
        this.f = e43.l(musicBottomSheetHeaderMenuItem2, musicBottomSheetHeaderMenuItem);
        this.g = e43.l(MusicBottomSheetHeaderMenuItem.ToggleDownload, musicBottomSheetHeaderMenuItem2, musicBottomSheetHeaderMenuItem);
    }

    @Override // xsna.lc40
    public final List<MusicBottomSheetListMenuItem> a(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, u2b0 u2b0Var, boolean z) {
        if (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Full) {
            ListBuilder e = e43.e();
            if (z) {
                e.addAll(this.b);
            } else {
                e.addAll(this.a);
            }
            return e.g();
        }
        if (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Limited) {
            return this.c;
        }
        if (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Messenger) {
            return this.d;
        }
        if (!(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Playlist)) {
            ListBuilder e2 = e43.e();
            MusicBottomSheetListMenuItem[] musicBottomSheetListMenuItemArr = {MusicBottomSheetListMenuItem.AddToMyMusic, MusicBottomSheetListMenuItem.AddToPlaylist, MusicBottomSheetListMenuItem.ShareToStory};
            p4g.a aVar = p4g.a;
            g5g.A(e2, musicBottomSheetListMenuItemArr);
            e2.add(MusicBottomSheetListMenuItem.PlaySimilar);
            if (sp.f(u2b0Var)) {
                e2.add(MusicBottomSheetListMenuItem.PlayNext);
            }
            g5g.A(e2, new MusicBottomSheetListMenuItem[]{MusicBottomSheetListMenuItem.GoToArtist, MusicBottomSheetListMenuItem.GoToAlbum});
            e2.add(MusicBottomSheetListMenuItem.RemoveFromMyMusic);
            return e2.g();
        }
        Playlist playlist = ((MusicBottomSheetLaunchPoint.Playlist) musicBottomSheetLaunchPoint).b;
        ListBuilder e3 = e43.e();
        MusicBottomSheetListMenuItem[] musicBottomSheetListMenuItemArr2 = {MusicBottomSheetListMenuItem.AddToMyMusic, MusicBottomSheetListMenuItem.AddToPlaylist, MusicBottomSheetListMenuItem.ShareToStory};
        p4g.a aVar2 = p4g.a;
        g5g.A(e3, musicBottomSheetListMenuItemArr2);
        if (sp.f(u2b0Var)) {
            e3.add(MusicBottomSheetListMenuItem.PlayNext);
        }
        g5g.A(e3, new MusicBottomSheetListMenuItem[]{MusicBottomSheetListMenuItem.GoToArtist, MusicBottomSheetListMenuItem.GoToAlbum, MusicBottomSheetListMenuItem.PlaySimilar});
        if (xx1.w(xx1.m(playlist))) {
            e3.add(MusicBottomSheetListMenuItem.RemoveFromPlaylist);
        }
        return e3.g();
    }

    @Override // xsna.lc40
    public final List<MusicBottomSheetHeaderMenuItem> b(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
        return musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Limited ? this.e : musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Messenger ? this.f : this.g;
    }
}
