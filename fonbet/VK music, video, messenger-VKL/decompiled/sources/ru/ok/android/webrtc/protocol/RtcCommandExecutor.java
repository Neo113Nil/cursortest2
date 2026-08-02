package ru.ok.android.webrtc.protocol;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.webrtc.protocol.RtcCommandConfig;

/* loaded from: classes9.dex */
public interface RtcCommandExecutor {

    public interface Listener {
        default void onRtcCommandError(@NonNull Throwable th) {
        }

        default void onRtcCommandError(@NonNull RtcCommand<?> rtcCommand, @NonNull Throwable th) {
        }

        default void onRtcCommandRemoved(@NonNull RtcCommand<?> rtcCommand) {
        }

        default void onRtcCommandSent(@NonNull RtcCommand<?> rtcCommand) {
        }

        default void onRtcCommandSubmit(@NonNull RtcCommand<?> rtcCommand) {
        }

        default void onRtcCommandSuccess(@NonNull RtcCommand<?> rtcCommand, @NonNull RtcResponse rtcResponse) {
        }

        default void onRtcDataReceived(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        }

        default void onRtcDataSent(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        }
    }

    void addListener(@NonNull Listener listener);

    default void execute(@NonNull RtcCommand<?> rtcCommand) {
        execute(new RtcCommandConfig.Builder(rtcCommand).build());
    }

    void execute(@NonNull RtcCommandConfig<?, ?> rtcCommandConfig);

    void removeListener(@NonNull Listener listener);

    default <Command extends RtcCommand<Response>, Response extends RtcResponse> void execute(@NonNull Command command, @Nullable RtcCommandOnSuccessListener<Command, Response> rtcCommandOnSuccessListener) {
        execute(new RtcCommandConfig.Builder(command).setSuccessListener(rtcCommandOnSuccessListener).build());
    }

    default <Command extends RtcCommand<Response>, Response extends RtcResponse> void execute(@NonNull Command command, @Nullable RtcCommandOnSuccessListener<Command, Response> rtcCommandOnSuccessListener, @Nullable RtcCommandOnErrorListener<Command, Response> rtcCommandOnErrorListener) {
        execute(new RtcCommandConfig.Builder(command).setSuccessListener(rtcCommandOnSuccessListener).setErrorListener(rtcCommandOnErrorListener).build());
    }
}
