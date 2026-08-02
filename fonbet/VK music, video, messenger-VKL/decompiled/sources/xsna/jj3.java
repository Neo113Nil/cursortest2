package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vkontakte.android.R;
import xsna.nzl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jj3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ jj3(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                lda0.a(view, 0.75f, false);
                return s3q0.a;
            case 1:
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getId() != R.id.comment_bottom_sheet_background && childAt.getId() != R.id.jump_to_end) {
                        bwt0.r0(iah0.f().widthPixels - BottomSheetCommentsFragment.g1, childAt);
                    }
                }
                return s3q0.a;
            case 2:
                return (ViewGroup) view.findViewById(R.id.dialog_audio_msg_recorder_container);
            default:
                ViewStub viewStub = (ViewStub) view.findViewById(R.id.add_reaction_floating_stub);
                return (ImageView) (viewStub != null ? viewStub.inflate() : null);
        }
    }
}
