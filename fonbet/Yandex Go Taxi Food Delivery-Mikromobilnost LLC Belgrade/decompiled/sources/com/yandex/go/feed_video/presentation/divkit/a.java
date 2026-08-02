package com.yandex.go.feed_video.presentation.divkit;

import android.graphics.Rect;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.go.feed_video.presentation.divkit.ListYandexDivPlayerView;
import defpackage.pey;
import defpackage.zty;

/* loaded from: classes.dex */
public final class a implements DefaultLifecycleObserver {
    public final /* synthetic */ ListYandexDivPlayerView a;

    public a(ListYandexDivPlayerView listYandexDivPlayerView) {
        this.a = listYandexDivPlayerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r1 = r1.attachedPlayer;
     */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPause(pey peyVar) {
        ListYandexDivPlayerView.PlayerState playerState;
        zty ztyVar;
        ListYandexDivPlayerView listYandexDivPlayerView = this.a;
        if (listYandexDivPlayerView.hasWindowFocus()) {
            listYandexDivPlayerView.isPlayerOverlapped = true;
            playerState = listYandexDivPlayerView.lastStateBeforeOverlap;
            if (playerState != ListYandexDivPlayerView.PlayerState.PLAYING || ztyVar == null) {
                return;
            }
            ztyVar.pause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = r1.attachedPlayer;
     */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume(pey peyVar) {
        ListYandexDivPlayerView.PlayerState playerState;
        zty ztyVar;
        ListYandexDivPlayerView listYandexDivPlayerView = this.a;
        if (listYandexDivPlayerView.hasWindowFocus()) {
            listYandexDivPlayerView.isPlayerOverlapped = false;
            playerState = listYandexDivPlayerView.lastStateBeforeOverlap;
            if (playerState == ListYandexDivPlayerView.PlayerState.PLAYING && listYandexDivPlayerView.hasWindowFocus() && listYandexDivPlayerView.getGlobalVisibleRect(new Rect()) && ztyVar != null) {
                ztyVar.play();
            }
        }
    }
}
