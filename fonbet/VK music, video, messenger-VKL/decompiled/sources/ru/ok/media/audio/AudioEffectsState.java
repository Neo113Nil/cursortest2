package ru.ok.media.audio;

/* loaded from: classes9.dex */
public class AudioEffectsState {
    private float fileSpeakerVolume;
    private float fileStreamVolume;
    private String filter;
    private float micVolume;
    private boolean mixToSpeaker;
    private int musicHalftone;
    private boolean noiseSuppressionEnabled;
    private boolean pause;
    private String playbackFile;
    private int shiftMS;

    public AudioEffectsState() {
        this(null);
    }

    public float getFileSpeakerVolume() {
        return this.fileSpeakerVolume;
    }

    public float getFileStreamVolume() {
        return this.fileStreamVolume;
    }

    public String getFilter() {
        return this.filter;
    }

    public float getMicVolume() {
        return this.micVolume;
    }

    public int getMusicHalftone() {
        return this.musicHalftone;
    }

    public String getPlaybackFile() {
        return this.playbackFile;
    }

    public int getShiftMS() {
        return this.shiftMS;
    }

    public boolean isMixToSpeaker() {
        return this.mixToSpeaker;
    }

    public boolean isNoiseSuppressionEnabled() {
        return this.noiseSuppressionEnabled;
    }

    public boolean isPause() {
        return this.pause;
    }

    public void setFileSpeakerVolume(float f) {
        this.fileSpeakerVolume = f;
    }

    public void setFileStreamVolume(float f) {
        this.fileStreamVolume = f;
    }

    public void setFilter(String str) {
        this.filter = str;
    }

    public void setMicVolume(float f) {
        this.micVolume = f;
    }

    public void setMixToSpeaker(boolean z) {
        this.mixToSpeaker = z;
    }

    public void setMusicHalftone(int i) {
        this.musicHalftone = i;
    }

    public void setNoiseSuppressionEnabled(boolean z) {
        this.noiseSuppressionEnabled = z;
    }

    public void setPause(boolean z) {
        this.pause = z;
    }

    public void setPlaybackFile(String str) {
        this.playbackFile = str;
    }

    public void setShiftMS(int i) {
        this.shiftMS = i;
    }

    public AudioEffectsState(AudioEffectsState audioEffectsState) {
        if (audioEffectsState == null) {
            this.pause = true;
            this.micVolume = 1.0f;
            this.fileStreamVolume = 1.0f;
            this.fileSpeakerVolume = 1.0f;
            return;
        }
        this.playbackFile = audioEffectsState.getPlaybackFile();
        this.pause = audioEffectsState.isPause();
        this.filter = audioEffectsState.getFilter();
        this.shiftMS = audioEffectsState.getShiftMS();
        this.musicHalftone = audioEffectsState.getMusicHalftone();
        this.fileSpeakerVolume = audioEffectsState.getFileSpeakerVolume();
        this.fileStreamVolume = audioEffectsState.getFileStreamVolume();
        this.micVolume = audioEffectsState.getMicVolume();
        this.mixToSpeaker = audioEffectsState.isMixToSpeaker();
        this.noiseSuppressionEnabled = audioEffectsState.isNoiseSuppressionEnabled();
    }
}
