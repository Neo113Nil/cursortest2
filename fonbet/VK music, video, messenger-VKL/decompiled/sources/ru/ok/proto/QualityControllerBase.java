package ru.ok.proto;

import java.util.concurrent.atomic.AtomicBoolean;
import xsna.ne7;

/* loaded from: classes9.dex */
public abstract class QualityControllerBase implements QualityController {
    private static final String TAG = "Publisher";
    private AtomicBoolean keyFrameRequested = new AtomicBoolean(false);
    protected int slowpokeIdx;

    public QualityControllerBase() {
        ne7.m(TAG, "QualityControllerBase()");
    }

    @Override // ru.ok.proto.QualityController
    public boolean getAndResetKeyFrameRequest() {
        boolean andSet = this.keyFrameRequested.getAndSet(false);
        ne7.m(TAG, "getAndResetKeyFrameRequest() - " + andSet);
        return andSet;
    }

    public int getSwitchUpSpeed() {
        ne7.m(TAG, "getSwitchUpSpeed() - 1 (hard-coded)");
        return 1;
    }

    @Override // ru.ok.proto.QualityController
    public void requestKeyFrame() {
        ne7.m(TAG, "requestKeyFrame()");
        this.keyFrameRequested.set(true);
    }

    @Override // ru.ok.proto.QualityController
    public void setSlowpokeIdx(int i) {
        ne7.m(TAG, "setSlowpokeIdx(" + i + ")");
        this.slowpokeIdx = i;
    }
}
