package xsna;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.VKApplication;

/* compiled from: ViewInfoItem.kt */
/* loaded from: classes5.dex */
public class ayt0 extends we6 {
    public final com.vk.newsfeed.posting.mediapicker.photovk.base.a g;

    @Nullable
    public ViewGroup h;

    /* compiled from: ViewInfoItem.kt */
    public static final class a extends vif0<we6> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(we6 we6Var) {
        }
    }

    public ayt0(com.vk.newsfeed.posting.mediapicker.photovk.base.a aVar, int i) {
        this.g = aVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.h;
        if (viewGroup2 == null) {
            viewGroup2 = (ViewGroup) this.g.c;
        }
        if (viewGroup2.getLayoutParams() == null) {
            viewGroup2.setLayoutParams(new RecyclerView.p(-1, -2));
        }
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return new a(viewGroup2);
    }
}
