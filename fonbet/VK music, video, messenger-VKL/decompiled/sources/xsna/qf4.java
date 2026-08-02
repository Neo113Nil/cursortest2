package xsna;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.stories.design.view.viewer.AnimatedReactionsView;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qf4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qyg0 V0;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj2;
                hyg0 hyg0Var = (hyg0) obj;
                V0 = hyg0Var.V0("DELETE FROM audio_book WHERE uid = ? AND book_id = ?");
                try {
                    V0.D3(1, str);
                    V0.bindLong(2, i2);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } finally {
                }
            case 1:
                StoryBottomViewGroup storyBottomViewGroup = (StoryBottomViewGroup) obj2;
                int i3 = StoryBottomViewGroup.P;
                int[] iArr = new int[2];
                ((View) obj).getLocationOnScreen(iArr);
                AnimatedReactionsView animatedReactionsView = storyBottomViewGroup.A;
                int i4 = 0;
                f4m.s((animatedReactionsView.getWidth() / 2) + (iArr[0] / 2), animatedReactionsView);
                List<? extends StoryUserProfile> list = storyBottomViewGroup.F;
                if (list != null) {
                    for (Object obj3 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        kzl0 kzl0Var = new kzl0(i2, storyBottomViewGroup, (StoryUserProfile) obj3);
                        storyBottomViewGroup.postDelayed(new qb3(kzl0Var, 14), i4 * 600);
                        storyBottomViewGroup.J.add(new r44(kzl0Var, 18));
                        i4 = i5;
                    }
                }
                vvr0.c();
                return s3q0.a;
            default:
                UserId userId = (UserId) obj2;
                V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_viewer WHERE owner_id = ? AND story_id = ?");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } finally {
                }
        }
    }
}
