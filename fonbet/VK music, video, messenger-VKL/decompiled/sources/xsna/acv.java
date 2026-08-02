package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.im.design.view.placeholder.ImPlaceholder;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class acv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ acv(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                return view.getContext().getString(R.string.feed_accessibility_simple_posting_create);
            case 1:
                int i2 = ModalPostCommonFragment.a0;
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt.getId() != R.id.modal_post_common_background) {
                        bwt0.r0(iah0.f().widthPixels - ModalPostCommonFragment.a0, childAt);
                    }
                }
                return s3q0.a;
            default:
                ImPlaceholder imPlaceholder = (ImPlaceholder) ((ViewStub) view.findViewById(R.id.empty_placeholder_stub)).inflate();
                imPlaceholder.setVisibility(8);
                return imPlaceholder;
        }
    }
}
