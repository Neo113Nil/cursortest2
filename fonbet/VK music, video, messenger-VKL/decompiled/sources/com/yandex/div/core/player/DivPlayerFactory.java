package com.yandex.div.core.player;

import android.content.Context;
import com.yandex.div2.DivVideoScale;
import java.util.List;

/* compiled from: DivPlayerFactory.kt */
/* loaded from: classes7.dex */
public interface DivPlayerFactory {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivPlayerFactory STUB = new DivPlayerFactory() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public /* bridge */ /* synthetic */ DivPlayer makePlayer(List list, DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return makePlayer((List<DivVideoSource>) list, divPlayerPlaybackConfig);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public DivPlayerFactory$Companion$STUB$1$makePlayer$1 makePlayer(List<DivVideoSource> list, DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return new DivPlayer() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1
            };
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public DivPlayerFactory$Companion$STUB$1$makePlayerView$1 makePlayerView(final Context context) {
            return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
                @Override // com.yandex.div.core.player.DivPlayerView, com.yandex.div.core.player.DivVideoAttachable
                public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
                    return super.getAttachedPlayer();
                }

                @Override // com.yandex.div.core.player.DivPlayerView, com.yandex.div.core.player.DivVideoAttachable
                public /* bridge */ /* synthetic */ void setScale(DivVideoScale divVideoScale) {
                    super.setScale(divVideoScale);
                }

                @Override // com.yandex.div.core.player.DivPlayerView, com.yandex.div.core.player.DivVideoAttachable
                public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
                    super.setVisibleOnScreen(z);
                }
            };
        }
    };

    /* compiled from: DivPlayerFactory.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    DivPlayer makePlayer(List<DivVideoSource> list, DivPlayerPlaybackConfig divPlayerPlaybackConfig);

    DivPlayerView makePlayerView(Context context);

    default DivPlayerPreloader makePreloader() {
        return DivPlayerPreloader.STUB;
    }
}
