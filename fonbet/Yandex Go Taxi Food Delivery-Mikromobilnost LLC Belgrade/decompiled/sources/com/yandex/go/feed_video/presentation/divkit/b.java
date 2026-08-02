package com.yandex.go.feed_video.presentation.divkit;

import com.yandex.go.feed_video.presentation.divkit.ListYandexDivPlayerView;
import defpackage.q4l;
import defpackage.zty;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes.dex */
public final class b implements q4l {
    public final /* synthetic */ ListYandexDivPlayerView a;

    public b(ListYandexDivPlayerView listYandexDivPlayerView) {
        this.a = listYandexDivPlayerView;
    }

    @Override // defpackage.q4l
    public final void c() {
        zty ztyVar;
        boolean z;
        ListYandexPlayerView listYandexPlayerView;
        ListYandexDivPlayerView listYandexDivPlayerView = this.a;
        if (listYandexDivPlayerView.hasWindowFocus()) {
            z = listYandexDivPlayerView.isPlayerOverlapped;
            if (!z) {
                listYandexDivPlayerView.setPlayerState(ListYandexDivPlayerView.PlayerState.PLAYING);
                listYandexPlayerView = listYandexDivPlayerView.styledPlayerView;
                listYandexPlayerView.setKeepScreenOn(true);
                return;
            }
        }
        ztyVar = listYandexDivPlayerView.attachedPlayer;
        if (ztyVar != null) {
            ztyVar.pause();
        }
    }

    @Override // defpackage.q4l
    public final void onPause() {
        ListYandexPlayerView listYandexPlayerView;
        ListYandexDivPlayerView.PlayerState playerState = ListYandexDivPlayerView.PlayerState.PAUSED;
        ListYandexDivPlayerView listYandexDivPlayerView = this.a;
        listYandexDivPlayerView.setPlayerState(playerState);
        listYandexPlayerView = listYandexDivPlayerView.styledPlayerView;
        listYandexPlayerView.setKeepScreenOn(false);
    }
}
