package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import xsna.lwq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mql0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mql0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        Parcelable parcelable;
        Object parcelable2;
        switch (this.b) {
            case 0:
                ((qql0) this.c).getClass();
                break;
            case 1:
                StoryEntry storyEntry = (StoryEntry) obj;
                StoriesViewPager storiesViewPager = ((com.vk.story.viewer.impl.presentation.stories.b) this.c).O;
                for (int i3 = 0; i3 < storiesViewPager.getChildCount(); i3++) {
                    if (storiesViewPager.getChildAt(i3) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i3)).J(storyEntry);
                    }
                }
                break;
            default:
                uvq0 uvq0Var = (uvq0) this.c;
                Bundle bundle = (Bundle) obj;
                if (epx.f(bundle != null ? bundle.getString("type") : null, "wall")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = bundle.getParcelable("owner_id", UserId.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = bundle.getParcelable("owner_id");
                        if (!(parcelable3 instanceof UserId)) {
                            parcelable3 = null;
                        }
                        parcelable = (UserId) parcelable3;
                    }
                    UserId userId = (UserId) parcelable;
                    Long e = bo8.e(bundle, "item_id");
                    Integer valueOf = e != null ? Integer.valueOf((int) e.longValue()) : null;
                    if (userId != null && valueOf != null) {
                        uvq0Var.a(new lwq0.b.a(userId, valueOf.intValue()));
                        break;
                    }
                }
                break;
        }
    }
}
