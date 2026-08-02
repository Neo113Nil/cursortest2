package xsna;

import com.vk.stories.design.view.StoryProgressView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityLiveCoverPagerHolder.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class z8h extends FunctionReferenceImpl implements wzs<Integer, Float, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Integer num, Float f) {
        int intValue = num.intValue();
        float floatValue = f.floatValue();
        StoryProgressView storyProgressView = ((w8h) this.receiver).f;
        storyProgressView.setCurrentSection(intValue);
        storyProgressView.setProgress(floatValue);
        return s3q0.a;
    }
}
