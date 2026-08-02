package ru.ok.media;

import android.os.Handler;
import ru.ok.media.StreamingLaunchScheduler;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.StreamerState;
import xsna.ne7;
import xsna.qe9;

/* compiled from: StreamingLaunchScheduler.kt */
/* loaded from: classes9.dex */
public final class StreamingLaunchScheduler$publisherStateListener$1 implements Streamer.Listener {
    final /* synthetic */ StreamingLaunchScheduler this$0;

    public StreamingLaunchScheduler$publisherStateListener$1(StreamingLaunchScheduler streamingLaunchScheduler) {
        this.this$0 = streamingLaunchScheduler;
    }

    @Override // ru.ok.media.api.Streamer.Listener
    public void onStreamerStateChanged(StreamerState streamerState, StreamerState streamerState2) {
        StreamingLaunchScheduler.State state;
        Handler handler;
        String idNameString = streamerState.idNameString();
        state = this.this$0.state;
        ne7.m("Publisher", "onStreamerStateChanged() - streamer state= " + idNameString + " in state " + state.nameIdString());
        handler = this.this$0.handler;
        handler.post(new qe9(6, this.this$0, streamerState));
    }
}
