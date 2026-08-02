package com.yandex.div.core.view2.spannable;

import android.view.Choreographer;
import android.widget.TextView;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import defpackage.y6i0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0018j\b\u0012\u0004\u0012\u00020\u0006`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ParticlesTicker;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/widget/TextView;", "view", "<init>", "(Landroid/widget/TextView;)V", "Lcom/yandex/div/core/view2/spannable/MaskSpan;", "span", "Lzy11;", BaseTrack.KEY_TRACK, "(Lcom/yandex/div/core/view2/spannable/MaskSpan;)V", "untrack", "resumeIfNeeded", "()V", "stop", "", "frameTimeNanos", "doFrame", "(J)V", "Landroid/widget/TextView;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "choreographer", "Landroid/view/Choreographer;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "spans", "Ljava/util/LinkedHashSet;", "", "running", "Z", "lastFrameNs", "J", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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
    public void doFrame(long frameTimeNanos) {
        boolean z;
        if (this.running) {
            if (this.spans.isEmpty() || !this.view.isShown()) {
                stop();
                return;
            }
            float c = this.lastFrameNs != 0 ? y6i0.c((frameTimeNanos - r0) * 1.0E-9f, 0.0f, 0.05f) : 0.0f;
            this.lastFrameNs = frameTimeNanos;
            Iterator<MaskSpan> it = this.spans.iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    MaskSpan next = it.next();
                    if (!next.isAlive$div_release()) {
                        it.remove();
                    } else if (next.onFrame$div_release(c) || z) {
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

    public final void track(MaskSpan span) {
        this.spans.add(span);
        resumeIfNeeded();
    }

    public final void untrack(MaskSpan span) {
        this.spans.remove(span);
        if (this.spans.isEmpty()) {
            stop();
        }
    }
}
