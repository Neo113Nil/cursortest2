package ru.ok.android.externcalls.sdk.dev;

import java.util.Set;
import org.webrtc.DumpSource;
import xsna.asp;
import xsna.zrp;

/* compiled from: MediaDumpManager.kt */
/* loaded from: classes9.dex */
public interface MediaDumpManager {

    /* compiled from: MediaDumpManager.kt */
    /* loaded from: classes11.dex */
    public interface LocalAudioDumpRecordListener {
        void onRecordCompleted(String str);

        void onRecordStarted(String str);
    }

    /* compiled from: MediaDumpManager.kt */
    public interface RemoteMediaDumpRequestListener {
        void onRequestSent();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaDumpManager.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        private final String fileName;
        private final DumpSource webrtcDumpSource;
        public static final Source IN_ENTER_PROCESSING = new Source("IN_ENTER_PROCESSING", 0, DumpSource.IN_ENTER_PROCESSING, "in_enter_processing");
        public static final Source IN_AFTER_NS = new Source("IN_AFTER_NS", 1, DumpSource.IN_AFTER_NS, "in_after_ns");
        public static final Source IN_AFTER_ANIMOJI = new Source("IN_AFTER_ANIMOJI", 2, DumpSource.IN_AFTER_ANIMOJI, "in_after_animoji");
        public static final Source IN_EXIT_PROCESSING = new Source("IN_EXIT_PROCESSING", 3, DumpSource.IN_EXIT_PROCESSING, "in_exit_processing");
        public static final Source OUT_ENTER_PROCESSING = new Source("OUT_ENTER_PROCESSING", 4, DumpSource.OUT_ENTER_PROCESSING, "out_enter_processing");
        public static final Source OUT_EXIT_PROCESSING = new Source("OUT_EXIT_PROCESSING", 5, DumpSource.OUT_EXIT_PROCESSING, "out_exit_processing");

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{IN_ENTER_PROCESSING, IN_AFTER_NS, IN_AFTER_ANIMOJI, IN_EXIT_PROCESSING, OUT_ENTER_PROCESSING, OUT_EXIT_PROCESSING};
        }

        static {
            Source[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private Source(String str, int i, DumpSource dumpSource, String str2) {
            this.webrtcDumpSource = dumpSource;
            this.fileName = str2;
        }

        public static zrp<Source> getEntries() {
            return $ENTRIES;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final DumpSource getWebrtcDumpSource$calls_sdk_release() {
            return this.webrtcDumpSource;
        }
    }

    void cancelAudioDumpRecord();

    String recordAudioDump(int i, Set<? extends Source> set, LocalAudioDumpRecordListener localAudioDumpRecordListener);

    void requestMediaDump(int i, boolean z, boolean z2, RemoteMediaDumpRequestListener remoteMediaDumpRequestListener);

    void setLocalAudioDumpLocation(String str);
}
