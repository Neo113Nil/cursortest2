package com.yandex.runtime.model;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AnimatedModel {
    public static final int INFINITE_ANIMATION = 0;
    private final List<Frame> frames;
    private final int loopCount;

    public AnimatedModel(int i) {
        this(i, new ArrayList());
    }

    public void addFrame(ModelProvider modelProvider, long j) {
        this.frames.add(new Frame(modelProvider, j));
    }

    public List<Frame> getFrames() {
        return this.frames;
    }

    public int getLoopCount() {
        return this.loopCount;
    }

    public AnimatedModel(int i, List<Frame> list) {
        this.frames = list;
        this.loopCount = i;
    }
}
