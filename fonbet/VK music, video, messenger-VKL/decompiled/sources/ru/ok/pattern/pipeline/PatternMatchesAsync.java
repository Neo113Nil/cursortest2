package ru.ok.pattern.pipeline;

import java.util.List;
import org.opencv.core.Mat;
import ru.ok.pattern.entity.PatternMatchRaw;

/* loaded from: classes9.dex */
public class PatternMatchesAsync {
    public final Mat frameMatScaled;
    public final List<PatternMatchRaw> matches;

    public PatternMatchesAsync(List<PatternMatchRaw> list, Mat mat) {
        this.matches = list;
        this.frameMatScaled = mat;
    }
}
