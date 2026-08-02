package defpackage;

import com.ybsdk.feature.stories.internal.screens.stories.StoriesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class jmu0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoriesFragment b;

    public /* synthetic */ jmu0(StoriesFragment storiesFragment, int i) {
        this.a = i;
        this.b = storiesFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        StoriesFragment.ProgressType progressType_delegate$lambda$1;
        zy11 onViewCreated$lambda$17$lambda$14;
        zy11 onViewCreated$lambda$17$lambda$15;
        zy11 onViewCreated$lambda$17$lambda$6;
        zy11 onViewCreated$lambda$17$lambda$16;
        zy11 onViewCreated$lambda$17$lambda$7;
        zy11 onViewCreated$lambda$17$lambda$8;
        zy11 onViewCreated$lambda$17$lambda$9;
        int i = this.a;
        StoriesFragment storiesFragment = this.b;
        switch (i) {
            case 0:
                progressType_delegate$lambda$1 = StoriesFragment.progressType_delegate$lambda$1(storiesFragment);
                return progressType_delegate$lambda$1;
            case 1:
                onViewCreated$lambda$17$lambda$14 = StoriesFragment.onViewCreated$lambda$17$lambda$14(storiesFragment);
                return onViewCreated$lambda$17$lambda$14;
            case 2:
                onViewCreated$lambda$17$lambda$15 = StoriesFragment.onViewCreated$lambda$17$lambda$15(storiesFragment);
                return onViewCreated$lambda$17$lambda$15;
            case 3:
                onViewCreated$lambda$17$lambda$6 = StoriesFragment.onViewCreated$lambda$17$lambda$6(storiesFragment);
                return onViewCreated$lambda$17$lambda$6;
            case 4:
                onViewCreated$lambda$17$lambda$16 = StoriesFragment.onViewCreated$lambda$17$lambda$16(storiesFragment);
                return onViewCreated$lambda$17$lambda$16;
            case 5:
                onViewCreated$lambda$17$lambda$7 = StoriesFragment.onViewCreated$lambda$17$lambda$7(storiesFragment);
                return onViewCreated$lambda$17$lambda$7;
            case 6:
                onViewCreated$lambda$17$lambda$8 = StoriesFragment.onViewCreated$lambda$17$lambda$8(storiesFragment);
                return onViewCreated$lambda$17$lambda$8;
            default:
                onViewCreated$lambda$17$lambda$9 = StoriesFragment.onViewCreated$lambda$17$lambda$9(storiesFragment);
                return onViewCreated$lambda$17$lambda$9;
        }
    }
}
