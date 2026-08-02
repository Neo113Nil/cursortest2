package defpackage;

import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;

/* loaded from: classes10.dex */
public final class kch implements bou {
    @Override // defpackage.bou
    public final gg90 createPlaylistParser() {
        return new HlsPlaylistParser();
    }

    @Override // defpackage.bou
    public final gg90 createPlaylistParser(ynu ynuVar, unu unuVar) {
        return new HlsPlaylistParser(ynuVar, unuVar);
    }
}
