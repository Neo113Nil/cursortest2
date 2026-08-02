package xsna;

import android.os.SystemClock;
import com.ironsource.V2;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.di.VideoHistoryRecordComponent;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: VideoHistoryRecordDelegate.kt */
/* loaded from: classes14.dex */
public final class jps0 implements w8i {
    public static final /* synthetic */ qcy<Object>[] i;
    public VideoFile b;
    public long c = V2.h;
    public final kps0 d = ((VideoHistoryRecordComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(VideoHistoryRecordComponent.class))).S7();
    public final pgn e = new pgn();
    public long f;
    public boolean g;
    public boolean h;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(jps0.class, "timerDisposable", "getTimerDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        i = new qcy[]{mutablePropertyReference1Impl};
    }

    public jps0(VideoFile videoFile) {
        this.b = videoFile;
    }

    public final boolean a() {
        return (this.b.C2() || this.b.p0()) ? false : true;
    }

    public final void b() {
        if (this.h || !a()) {
            return;
        }
        qcy<Object> qcyVar = i[0];
        this.e.b(null);
        this.c -= SystemClock.elapsedRealtime() - this.f;
        this.g = false;
    }
}
