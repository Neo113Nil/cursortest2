package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.lists.AbstractPaginatedView;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import com.vkontakte.android.R;
import xsna.gm50;

/* compiled from: VideoPickerView.kt */
/* loaded from: classes4.dex */
public final class f3t0 implements gm50 {
    public final f5z b;
    public final View c;
    public final PickerRecyclerPaginatedView d;
    public final c2t0 e;

    public f3t0(Context context, f5z f5zVar, VkVideoPickerFragment vkVideoPickerFragment) {
        this.b = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.media_picker_video_vk_fragment, (ViewGroup) null);
        this.c = inflate;
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = (PickerRecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        this.d = pickerRecyclerPaginatedView;
        c2t0 c2t0Var = new c2t0(vkVideoPickerFragment);
        this.e = c2t0Var;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        pickerRecyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, pickerRecyclerPaginatedView).a();
        pickerRecyclerPaginatedView.setAdapter(c2t0Var);
        pickerRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        pickerRecyclerPaginatedView.getRecyclerView().setPadding(0, cn70.b(2), 0, cn70.b(16));
        pickerRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        pickerRecyclerPaginatedView.setSwipeRefreshEnabled(false);
    }

    public final void a(float f) {
        int computeVerticalScrollOffset = this.d.x.computeVerticalScrollOffset();
        View view = this.c;
        if (computeVerticalScrollOffset == 0) {
            f4m.y((int) ((1.0f - f) * cn70.b(23)), view);
        } else {
            f4m.y(0, view);
        }
    }

    public final void b(i3t0 i3t0Var) {
        gm50.a.b(this, i3t0Var.a, new c4q0(this, 5));
    }

    public final void c() {
        this.d.getRecyclerView().scrollToPosition(0);
    }

    public final View getView() {
        return this.c;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
