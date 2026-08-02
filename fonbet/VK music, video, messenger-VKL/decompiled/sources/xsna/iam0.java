package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import xsna.w9m0;

/* compiled from: StoryPrivacyView.kt */
/* loaded from: classes16.dex */
public final class iam0 implements jjv0 {
    public final /* synthetic */ jam0 b;

    public iam0(jam0 jam0Var) {
        this.b = jam0Var;
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        Object b0 = j5g.b0(i, this.b.d.h);
        w9m0.a aVar = b0 instanceof w9m0.a ? (w9m0.a) b0 : null;
        return ((aVar != null ? aVar.b : null) == StoryPrivacyType.EXCLUDED || i == 0) ? 4 : 0;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }
}
