package defpackage;

import java.util.concurrent.ThreadFactory;
import ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerFactoryImpl;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultStrmTrackingApiFactory;
import ru.yandex.video.m3.ott.OttStrategyBuilder;
import ru.yandex.video.m3.ott.ott.TrackingPendingReporterBuilder;
import ru.yandex.video.m3.ott.vh.VhPlayerStrategy;
import ru.yandex.video.m3.player.ExoPlayerDelegateFactory;
import ru.yandex.video.m3.player.ExternalExoPlayerDelegateFactory;
import ru.yandex.video.m3.player.baseurls.BlacklistedBaseUrlsManagerImpl;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;
import ru.yandex.video.m3.telemetry.helpers.ImplBuildHelperKt;
import ru.yandex.video.m3.trackselection.videoformatselector.DefaultOptimalVideoFormatSelectorFactory;

/* loaded from: classes7.dex */
public final /* synthetic */ class p16 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThreadFactory b;

    public /* synthetic */ p16(ThreadFactory threadFactory, int i) {
        this.a = i;
        this.b = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread scheduledExecutorService$lambda$2$lambda$1;
        Thread executor$lambda$5$lambda$4;
        Thread createEventTracker$lambda$2$lambda$1;
        Thread create$lambda$2$lambda$1;
        Thread create$lambda$2$lambda$12;
        Thread createDefaultExecutorService$lambda$1;
        Thread _init_$lambda$2$lambda$1;
        Thread internalBuildImpl$lambda$1;
        Thread build$lambda$31$lambda$30;
        Thread build$lambda$36$lambda$35;
        Thread createEventTracker$lambda$40$lambda$39;
        Thread defaultDownloaderFactory$lambda$34$lambda$33;
        Thread playerAliveScheduledExecutorService$lambda$2$lambda$1;
        Thread builder$lambda$4$lambda$3;
        Thread onPrepared$lambda$8$lambda$7;
        Thread onPrepared$lambda$11$lambda$10;
        Thread _init_$lambda$1;
        int i = this.a;
        ThreadFactory threadFactory = this.b;
        switch (i) {
            case 0:
                scheduledExecutorService$lambda$2$lambda$1 = BlacklistedBaseUrlsManagerImpl.scheduledExecutorService$lambda$2$lambda$1(threadFactory, runnable);
                return scheduledExecutorService$lambda$2$lambda$1;
            case 1:
                executor$lambda$5$lambda$4 = BlacklistedBaseUrlsManagerImpl.executor$lambda$5$lambda$4(threadFactory, runnable);
                return executor$lambda$5$lambda$4;
            case 2:
                createEventTracker$lambda$2$lambda$1 = DefaultOptimalVideoFormatSelectorFactory.Companion.createEventTracker$lambda$2$lambda$1(threadFactory, runnable);
                return createEventTracker$lambda$2$lambda$1;
            case 3:
                create$lambda$2$lambda$1 = DefaultPlayerDelegateFactory.Companion.create$lambda$2$lambda$1(threadFactory, runnable);
                return create$lambda$2$lambda$1;
            case 4:
                create$lambda$2$lambda$12 = DefaultStrmTrackingApiFactory.create$lambda$2$lambda$1(threadFactory, runnable);
                return create$lambda$2$lambda$12;
            case 5:
                createDefaultExecutorService$lambda$1 = ExoPlayerDelegateFactory.Companion.createDefaultExecutorService$lambda$1(threadFactory, runnable);
                return createDefaultExecutorService$lambda$1;
            case 6:
                _init_$lambda$2$lambda$1 = ExternalExoPlayerDelegateFactory._init_$lambda$2$lambda$1(threadFactory, runnable);
                return _init_$lambda$2$lambda$1;
            case 7:
                internalBuildImpl$lambda$1 = ImplBuildHelperKt.internalBuildImpl$lambda$1(threadFactory, runnable);
                return internalBuildImpl$lambda$1;
            case 8:
                build$lambda$31$lambda$30 = OttStrategyBuilder.build$lambda$31$lambda$30(threadFactory, runnable);
                return build$lambda$31$lambda$30;
            case 9:
                build$lambda$36$lambda$35 = OttStrategyBuilder.build$lambda$36$lambda$35(threadFactory, runnable);
                return build$lambda$36$lambda$35;
            case 10:
                createEventTracker$lambda$40$lambda$39 = PreloadManagerBuilder.createEventTracker$lambda$40$lambda$39(threadFactory, runnable);
                return createEventTracker$lambda$40$lambda$39;
            case 11:
                defaultDownloaderFactory$lambda$34$lambda$33 = PreloadManagerBuilder.defaultDownloaderFactory$lambda$34$lambda$33(threadFactory, runnable);
                return defaultDownloaderFactory$lambda$34$lambda$33;
            case 12:
                playerAliveScheduledExecutorService$lambda$2$lambda$1 = StrmManagerImpl.playerAliveScheduledExecutorService$lambda$2$lambda$1(threadFactory, runnable);
                return playerAliveScheduledExecutorService$lambda$2$lambda$1;
            case 13:
                builder$lambda$4$lambda$3 = TrackingPendingReporterBuilder.builder$lambda$4$lambda$3(threadFactory, runnable);
                return builder$lambda$4$lambda$3;
            case 14:
                onPrepared$lambda$8$lambda$7 = VhPlayerStrategy.onPrepared$lambda$8$lambda$7(threadFactory, runnable);
                return onPrepared$lambda$8$lambda$7;
            case 15:
                onPrepared$lambda$11$lambda$10 = VhPlayerStrategy.onPrepared$lambda$11$lambda$10(threadFactory, runnable);
                return onPrepared$lambda$11$lambda$10;
            default:
                _init_$lambda$1 = YandexPlayerFactoryImpl._init_$lambda$1(threadFactory, runnable);
                return _init_$lambda$1;
        }
    }
}
