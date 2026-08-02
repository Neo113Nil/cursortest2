package xsna;

import com.vk.media.pipeline.model.timeline.Timeline;
import kotlin.random.Random;

/* compiled from: PipelineBuilder.kt */
/* loaded from: classes3.dex */
public interface hpa0 extends fyi<hpa0> {

    /* compiled from: PipelineBuilder.kt */
    public static final class a {
        public static hpa0 a(hpa0 hpa0Var, String str) {
            Random.b.getClass();
            return hpa0Var.f(Random.c.j(), str);
        }
    }

    gpa0 build();

    hpa0 c(Timeline timeline);

    hpa0 f(int i, String str);
}
