package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.MediaMessageData;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class VoiceMessageData extends MediaFileMessageData {
    public final boolean a;

    @Json(name = "duration")
    public int duration;

    @Json(name = "recognized_text")
    public String recognizedText;

    @Json(name = "was_recognized")
    public boolean wasRecognized;

    @Json(name = "waveform")
    public byte[] waveform;

    public VoiceMessageData(String str, String str2, int i, String str3, boolean z, byte[] bArr, boolean z2) {
        super(11, "");
        this.fileName = str;
        this.fileId = str2;
        this.duration = i;
        this.recognizedText = str3;
        this.wasRecognized = z;
        this.a = z2;
        if (bArr != null) {
            this.waveform = Arrays.copyOf(bArr, bArr.length);
        }
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData
    public final Object a(MediaMessageData.MessageHandler messageHandler) {
        return messageHandler.b(this);
    }

    @Deprecated
    public VoiceMessageData() {
    }
}
