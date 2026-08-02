package defpackage;

import java.util.concurrent.ThreadFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultVideoDataPreloadManagerFactory;
import ru.yandex.video.m3.player.YandexPlayerBuilder;

/* loaded from: classes7.dex */
public final /* synthetic */ class inh implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ inh(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread create$lambda$0;
        Thread build$lambda$24$lambda$23;
        Thread build$lambda$28$lambda$27;
        switch (this.a) {
            case 0:
                create$lambda$0 = DefaultVideoDataPreloadManagerFactory.create$lambda$0(runnable);
                return create$lambda$0;
            case 1:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 2:
                build$lambda$24$lambda$23 = YandexPlayerBuilder.build$lambda$24$lambda$23(runnable);
                return build$lambda$24$lambda$23;
            default:
                build$lambda$28$lambda$27 = YandexPlayerBuilder.build$lambda$28$lambda$27(runnable);
                return build$lambda$28$lambda$27;
        }
    }
}
