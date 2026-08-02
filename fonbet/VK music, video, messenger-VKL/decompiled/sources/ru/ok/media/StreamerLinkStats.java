package ru.ok.media;

/* compiled from: StreamerLinkStats.kt */
/* loaded from: classes9.dex */
public final class StreamerLinkStats {
    private final StreamerMediaLinkStats audio;
    private final StreamerMediaLinkStats video;

    public StreamerLinkStats(StreamerMediaLinkStats streamerMediaLinkStats, StreamerMediaLinkStats streamerMediaLinkStats2) {
        this.audio = streamerMediaLinkStats;
        this.video = streamerMediaLinkStats2;
    }

    public final StreamerMediaLinkStats getAudio() {
        return this.audio;
    }

    public final StreamerMediaLinkStats getVideo() {
        return this.video;
    }

    public String toString() {
        return "{ audio: " + this.audio + ", video: " + this.video + " }";
    }
}
