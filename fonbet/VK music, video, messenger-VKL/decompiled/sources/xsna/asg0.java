package xsna;

import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* compiled from: RunWhenReadyHandler.kt */
/* loaded from: classes3.dex */
public final class asg0 implements PlaybackStateListener {
    public Object b = EmptyList.b;
    public PlaybackStateListener.PlaybackState c;

    @Override // com.vk.movika.sdk.player.base.listener.PlaybackStateListener
    public final void i(PlaybackStateListener.PlaybackState playbackState) {
        this.c = playbackState;
        if (playbackState == PlaybackStateListener.PlaybackState.READY) {
            do {
                Object obj = this.b;
                this.b = EmptyList.b;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    ((gzs) it.next()).invoke();
                }
            } while (!((Collection) this.b).isEmpty());
        }
    }
}
