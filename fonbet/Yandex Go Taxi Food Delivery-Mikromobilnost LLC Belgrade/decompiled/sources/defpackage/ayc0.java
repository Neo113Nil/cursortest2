package defpackage;

import ru.yandex.video.m3.player.impl.tracking.PlayerAliveLogHolder;

/* loaded from: classes7.dex */
public final /* synthetic */ class ayc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerAliveLogHolder b;

    public /* synthetic */ ayc0(PlayerAliveLogHolder playerAliveLogHolder, int i) {
        this.a = i;
        this.b = playerAliveLogHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PlayerAliveLogHolder playerAliveLogHolder = this.b;
        switch (i) {
            case 0:
                PlayerAliveLogHolder.releaseLog$lambda$5(playerAliveLogHolder);
                break;
            case 1:
                PlayerAliveLogHolder.startLog$lambda$3(playerAliveLogHolder);
                break;
            case 2:
                playerAliveLogHolder.internalSyncInitLog();
                break;
            case 3:
                playerAliveLogHolder.internalSyncStopLog();
                break;
            default:
                PlayerAliveLogHolder.saveCurrentState$lambda$2(playerAliveLogHolder);
                break;
        }
    }
}
