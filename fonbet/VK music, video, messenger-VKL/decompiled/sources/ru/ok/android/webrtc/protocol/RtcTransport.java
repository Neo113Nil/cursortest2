package ru.ok.android.webrtc.protocol;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import org.webrtc.DataChannel;

/* loaded from: classes9.dex */
public interface RtcTransport {

    public interface ConnectionStateListener {
        void onConnectionStateChanged(@NonNull RtcTransport rtcTransport, boolean z);
    }

    public interface DataListener {
        default void onSend(@NonNull RtcTransport rtcTransport, @NonNull RtcFormat rtcFormat, @NonNull ByteBuffer... byteBufferArr) {
        }

        default void onSend(@NonNull RtcTransport rtcTransport, @NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
            onSend(rtcTransport, rtcFormat, ByteBuffer.wrap(bArr));
        }

        default void onReceive(@NonNull RtcTransport rtcTransport, @NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        }
    }

    void addBufferedAmountChangeListener(@NonNull BufferedAmountChangeListener bufferedAmountChangeListener);

    void addConnectionStateListener(@NonNull ConnectionStateListener connectionStateListener);

    void addDataListener(@NonNull DataListener dataListener);

    long bufferedAmount();

    void dispose();

    DataChannel get();

    boolean isConnected();

    void removeBufferedAmountChangeListener(@NonNull BufferedAmountChangeListener bufferedAmountChangeListener);

    void removeConnectionStateListener(@NonNull ConnectionStateListener connectionStateListener);

    void removeDataListener(@NonNull DataListener dataListener);

    boolean send(@NonNull RtcFormat rtcFormat, @NonNull ByteBuffer... byteBufferArr);

    boolean send(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat);

    public interface BufferedAmountChangeListener {
        default void onBufferedAmountChange(@NonNull RtcTransport rtcTransport, long j) {
        }
    }
}
