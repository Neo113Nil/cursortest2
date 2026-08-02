package xsna;

import android.view.View;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mzl0 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mzl0(int i, StoryBottomViewGroup storyBottomViewGroup, View view) {
        this.c = i;
        this.d = storyBottomViewGroup;
        this.e = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                StoryBottomViewGroup storyBottomViewGroup = (StoryBottomViewGroup) this.d;
                View view = (View) this.e;
                int i = storyBottomViewGroup.K;
                int i2 = this.c;
                if (i2 == i && view != null) {
                    bwt0.j(view, new qf4(storyBottomViewGroup, i2, 1));
                }
                return s3q0.a;
            default:
                UserProfileAction.a aVar = (UserProfileAction.a) this.d;
                fqq0 fqq0Var = (fqq0) this.e;
                StringBuilder sb = new StringBuilder("UserProfileHeaderFeatureDelegate: handleActivityResult(): action.isSuccess: ");
                sb.append(aVar.a());
                sb.append(",saltStableId = ");
                String str = fqq0Var.j;
                sb.append(str != null ? Integer.valueOf(str.hashCode()) : null);
                sb.append(", saltFallbackId = ");
                sb.append(fqq0Var.hashCode());
                sb.append(", action.reqCode = ");
                return bd3.b(", requestCode = ", aVar.b, this.c, sb);
        }
    }

    public /* synthetic */ mzl0(UserProfileAction.a aVar, fqq0 fqq0Var, int i) {
        this.d = aVar;
        this.e = fqq0Var;
        this.c = i;
    }
}
