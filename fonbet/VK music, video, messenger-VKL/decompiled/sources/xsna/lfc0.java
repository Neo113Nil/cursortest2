package xsna;

import com.vk.dto.stories.model.mention.SelectionChangeEditText;
import com.vk.newsfeed.common.views.poster.PosterEditText;
import com.vk.newsfeed.impl.posting.PostingFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lfc0 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lfc0(yan0 yan0Var, String str, boolean z) {
        this.d = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                PostingFragment postingFragment = (PostingFragment) obj;
                int i2 = PostingFragment.s0;
                if (!z) {
                    SelectionChangeEditText selectionChangeEditText = postingFragment.jo().c;
                    if (selectionChangeEditText != null) {
                        awt0.t(selectionChangeEditText, new dac0(selectionChangeEditText, 20));
                        break;
                    }
                } else {
                    PosterEditText posterEditText = ((uac0) postingFragment.b0.getValue()).e;
                    if (posterEditText != null) {
                        awt0.t(posterEditText, new wm80(posterEditText, 7));
                        break;
                    }
                }
                break;
            default:
                yan0.g().q((String) obj, z);
                break;
        }
    }

    public /* synthetic */ lfc0(boolean z, PostingFragment postingFragment) {
        this.c = z;
        this.d = postingFragment;
    }
}
