package ru.ok.android.externcalls.sdk.ui;

import kotlin.Lazy;
import org.webrtc.VideoFrame;
import xsna.bpn0;
import xsna.cfs;
import xsna.nm0;

/* compiled from: FrameDecorator.kt */
/* loaded from: classes9.dex */
public interface FrameDecorator {
    public static final Companion Companion = Companion.$$INSTANCE;

    VideoFrame apply(VideoFrame videoFrame);

    /* compiled from: FrameDecorator.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Lazy<FrameDecorator> EMPTY$delegate = new bpn0(new nm0(14));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FrameDecorator EMPTY_delegate$lambda$0() {
            return new cfs();
        }

        public final FrameDecorator getEMPTY() {
            return EMPTY$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoFrame EMPTY_delegate$lambda$0$0(VideoFrame videoFrame) {
            return videoFrame;
        }
    }
}
