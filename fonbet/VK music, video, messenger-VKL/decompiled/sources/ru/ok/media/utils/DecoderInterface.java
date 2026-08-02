package ru.ok.media.utils;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public interface DecoderInterface {

    public interface Callback {
        void handleDecodedData(ByteBuffer byteBuffer);

        void handleFormatChanged(@NonNull MediaFormat mediaFormat);
    }

    void close();

    boolean enqueueDataBuffer(int i, long j);

    ByteBuffer getDataBuffer(int i);

    boolean requiresConfig();

    void setCallback(Callback callback);

    void setConfig(ByteBuffer byteBuffer);
}
