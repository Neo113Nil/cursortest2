package ru.ok.android.externcalls.sdk.android.ext.lifecycle;

import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import xsna.f5z;
import xsna.nhl;

/* compiled from: DisplayLayoutLifecycleObserver.kt */
/* loaded from: classes11.dex */
public final class DisplayLayoutLifecycleObserver implements nhl {
    private final DisplayLayoutSender sender;

    public DisplayLayoutLifecycleObserver(DisplayLayoutSender displayLayoutSender) {
        this.sender = displayLayoutSender;
    }

    @Override // xsna.nhl
    public void onStop(f5z f5zVar) {
        this.sender.sendDisplayLayouts(EmptyList.b);
    }

    @Override // xsna.nhl
    public /* bridge */ /* synthetic */ void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public /* bridge */ /* synthetic */ void onDestroy(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public /* bridge */ /* synthetic */ void onPause(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public /* bridge */ /* synthetic */ void onResume(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public /* bridge */ /* synthetic */ void onStart(f5z f5zVar) {
    }
}
