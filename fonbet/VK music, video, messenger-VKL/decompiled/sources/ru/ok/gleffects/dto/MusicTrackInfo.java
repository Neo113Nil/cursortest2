package ru.ok.gleffects.dto;

import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes9.dex */
public class MusicTrackInfo {
    public final String trackArtist;

    @NonNull
    public final File trackCoverFile;

    @NonNull
    public final String trackMusicId;
    public final String trackTitle;

    public MusicTrackInfo(@NonNull File file, @NonNull String str, String str2, String str3) {
        this.trackCoverFile = file;
        this.trackMusicId = str;
        this.trackTitle = str2;
        this.trackArtist = str3;
    }
}
