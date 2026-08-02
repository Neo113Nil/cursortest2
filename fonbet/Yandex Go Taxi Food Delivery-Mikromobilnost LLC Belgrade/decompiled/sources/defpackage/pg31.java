package defpackage;

import com.ybsdk.feature.stories.internal.screens.verticalstories.VerticalStoriesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class pg31 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ VerticalStoriesFragment b;

    public /* synthetic */ pg31(VerticalStoriesFragment verticalStoriesFragment, int i) {
        this.a = i;
        this.b = verticalStoriesFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        dvb storiesPagerAdapter_delegate$lambda$0;
        zy11 onViewCreated$lambda$5$lambda$2;
        zy11 onViewCreated$lambda$5$lambda$3;
        int i = this.a;
        VerticalStoriesFragment verticalStoriesFragment = this.b;
        switch (i) {
            case 0:
                storiesPagerAdapter_delegate$lambda$0 = VerticalStoriesFragment.storiesPagerAdapter_delegate$lambda$0(verticalStoriesFragment);
                return storiesPagerAdapter_delegate$lambda$0;
            case 1:
                onViewCreated$lambda$5$lambda$2 = VerticalStoriesFragment.onViewCreated$lambda$5$lambda$2(verticalStoriesFragment);
                return onViewCreated$lambda$5$lambda$2;
            default:
                onViewCreated$lambda$5$lambda$3 = VerticalStoriesFragment.onViewCreated$lambda$5$lambda$3(verticalStoriesFragment);
                return onViewCreated$lambda$5$lambda$3;
        }
    }
}
