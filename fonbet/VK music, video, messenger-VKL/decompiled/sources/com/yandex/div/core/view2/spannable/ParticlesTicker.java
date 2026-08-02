package com.yandex.div.core.view2.spannable;

import android.view.Choreographer;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.swe0;

/* compiled from: ParticlesTicker.kt */
/* loaded from: classes7.dex */
public final class ParticlesTicker implements Choreographer.FrameCallback {
    private long lastFrameNs;
    private boolean running;
    private final TextView view;
    private final Choreographer choreographer = Choreographer.getInstance();
    private final LinkedHashSet<MaskSpan> spans = new LinkedHashSet<>();

    public ParticlesTicker(TextView textView) {
        this.view = textView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z;
        if (this.running) {
            if (this.spans.isEmpty() || !this.view.isShown()) {
                stop();
                return;
            }
            long j2 = this.lastFrameNs;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (j2 != 0) {
                f = swe0.f((j - j2) * 1.0E-9f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.05f);
            }
            this.lastFrameNs = j;
            Iterator<MaskSpan> it = this.spans.iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    MaskSpan next = it.next();
                    if (!next.isAlive$div_release()) {
                        it.remove();
                    } else if (next.onFrame$div_release(f) || z) {
                        z = true;
                    }
                }
            }
            if (this.spans.isEmpty() || !z) {
                stop();
            } else {
                this.view.postInvalidateOnAnimation();
                this.choreographer.postFrameCallback(this);
            }
        }
    }

    public final void resumeIfNeeded() {
        if (this.running || this.spans.isEmpty() || !this.view.isShown()) {
            return;
        }
        this.running = true;
        this.lastFrameNs = 0L;
        this.choreographer.postFrameCallback(this);
    }

    public final void stop() {
        if (this.running) {
            this.running = false;
            this.choreographer.removeFrameCallback(this);
        }
    }

    public final void track(MaskSpan maskSpan) {
        this.spans.add(maskSpan);
        resumeIfNeeded();
    }

    public final void untrack(MaskSpan maskSpan) {
        this.spans.remove(maskSpan);
        if (this.spans.isEmpty()) {
            stop();
        }
    }
}
