package androidx.media3.common.audio;

import defpackage.ng3;

/* loaded from: classes10.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public final ng3 inputAudioFormat;

    public AudioProcessor$UnhandledAudioFormatException(String str, ng3 ng3Var) {
        super(str + " " + ng3Var);
        this.inputAudioFormat = ng3Var;
    }

    public AudioProcessor$UnhandledAudioFormatException(ng3 ng3Var) {
        this("Unhandled input format:", ng3Var);
    }
}
