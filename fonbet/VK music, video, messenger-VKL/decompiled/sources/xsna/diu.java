package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.b;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GroupCallParticipantGridView.kt */
/* loaded from: classes7.dex */
public final class diu extends giu {
    public final View f0;
    public final Guideline g0;
    public final x680 h0;
    public final x680 i0;
    public final List<View> j0;
    public final boolean k0;

    public diu(Context context) {
        super(cn70.b(8), R.layout.voip_group_call_grid_participant, R.drawable.voip_call_participant_border_speaking_8_radius, context);
        this.f0 = findViewById(R.id.hand_layout_group);
        this.g0 = (Guideline) findViewById(R.id.voip_video_icons_guide);
        this.h0 = new x680(new n0r(this, 1));
        this.i0 = new x680(new hci(4));
        this.j0 = e43.l(getAvatarView(), getBlurredPhotoBg(), getPinIconView(), getHandLayout(), getConnectionStatus(), getReactionView(), getWatchTogetherIconView(), getScreenCaptureIconView());
        this.k0 = true;
    }

    @Override // xsna.giu
    public final CallMemberId P4() {
        kiu viewModel = getViewModel();
        if (viewModel != null) {
            return viewModel.a.a;
        }
        return null;
    }

    @Override // xsna.giu
    public final boolean Y4(kiu kiuVar) {
        return false;
    }

    @Override // xsna.giu
    public final boolean Z4(kiu kiuVar) {
        return false;
    }

    @Override // xsna.giu
    public final void c5(boolean z) {
        this.f0.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.giu
    public final void d5() {
        GroupCallViewModel.b.getClass();
        int b = cn70.b(GroupCallViewModel.g.size() > 2 ? 8 : 12);
        f4m.u(getReactionView(), b, b, b, b);
    }

    public final void f5(androidx.constraintlayout.widget.b bVar, boolean z) {
        VKImageView blurredPhotoBg = getBlurredPhotoBg();
        if (blurredPhotoBg.getWidth() != blurredPhotoBg.getHeight()) {
            if (z) {
                bVar.u(blurredPhotoBg.getId()).f.e = 1.0f;
                bVar.u(blurredPhotoBg.getId()).f.f = 1.0f;
            } else if (blurredPhotoBg.getWidth() > blurredPhotoBg.getHeight()) {
                bVar.u(blurredPhotoBg.getId()).f.f = blurredPhotoBg.getWidth() / blurredPhotoBg.getHeight();
            } else {
                bVar.u(blurredPhotoBg.getId()).f.f = blurredPhotoBg.getHeight() / blurredPhotoBg.getWidth();
            }
        }
    }

    @Override // xsna.giu, xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return this.x ? this.j0 : EmptyList.b;
    }

    @Override // xsna.giu
    public boolean getIgnoreFrameRotation() {
        return false;
    }

    @Override // xsna.giu
    public boolean getShouldShowLastName() {
        return this.k0;
    }

    @Override // xsna.giu, xsna.tmg0
    public List<View> getViewsToRotate() {
        if (this.x) {
            return Collections.singletonList(getNameView());
        }
        return j5g.u0(Collections.singletonList(getNameView()), this.j0);
    }

    @Override // xsna.giu, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getNameView().addOnLayoutChangeListener(this.h0);
        getBlurredPhotoBg().addOnLayoutChangeListener(this.i0);
    }

    @Override // xsna.giu, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getNameView().removeOnLayoutChangeListener(this.h0);
        getBlurredPhotoBg().removeOnLayoutChangeListener(this.i0);
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(this);
        Guideline guideline = this.g0;
        if (f == 90.0f) {
            TextView nameView = getNameView();
            bVar.o(nameView.getId(), getHeight());
            bVar.k(nameView.getId(), 3, 0, 3);
            bVar.k(nameView.getId(), 4, 0, 4);
            bVar.k(nameView.getId(), 6, 0, 6);
            bVar.k(nameView.getId(), 7, -1, 7);
            f5(bVar, false);
            b.C0021b c0021b = bVar.u(guideline.getId()).e;
            c0021b.a = true;
            c0021b.F = 1;
            int id = guideline.getId();
            bVar.u(id).e.f = cn70.b(12);
            bVar.u(id).e.e = -1;
            bVar.u(id).e.g = -1.0f;
            ImageView watchTogetherIconView = getWatchTogetherIconView();
            bVar.k(watchTogetherIconView.getId(), 6, guideline.getId(), 6);
            bVar.k(watchTogetherIconView.getId(), 7, guideline.getId(), 7);
            bVar.k(watchTogetherIconView.getId(), 3, 0, 3);
            bVar.k(watchTogetherIconView.getId(), 4, -1, 4);
            View screenCaptureIconView = getScreenCaptureIconView();
            bVar.k(screenCaptureIconView.getId(), 6, guideline.getId(), 7);
            bVar.k(screenCaptureIconView.getId(), 7, guideline.getId(), 6);
            bVar.k(screenCaptureIconView.getId(), 3, getWatchTogetherIconView().getId(), 4);
            bVar.k(screenCaptureIconView.getId(), 4, -1, 4);
            VKImageView reactionView = getReactionView();
            bVar.k(reactionView.getId(), 7, 0, 7);
            bVar.k(reactionView.getId(), 3, 0, 3);
            bVar.k(reactionView.getId(), 6, -1, 6);
            bVar.k(reactionView.getId(), 4, -1, 4);
        } else if (f == 270.0f) {
            TextView nameView2 = getNameView();
            bVar.o(nameView2.getId(), getHeight());
            bVar.k(nameView2.getId(), 3, 0, 3);
            bVar.k(nameView2.getId(), 4, 0, 4);
            bVar.k(nameView2.getId(), 7, 0, 7);
            bVar.k(nameView2.getId(), 6, -1, 6);
            f5(bVar, false);
            b.C0021b c0021b2 = bVar.u(guideline.getId()).e;
            c0021b2.a = true;
            c0021b2.F = 1;
            bVar.E(guideline.getId(), cn70.b(12));
            ImageView watchTogetherIconView2 = getWatchTogetherIconView();
            bVar.k(watchTogetherIconView2.getId(), 6, guideline.getId(), 6);
            bVar.k(watchTogetherIconView2.getId(), 7, guideline.getId(), 7);
            bVar.k(watchTogetherIconView2.getId(), 4, 0, 4);
            bVar.k(watchTogetherIconView2.getId(), 3, -1, 3);
            View screenCaptureIconView2 = getScreenCaptureIconView();
            bVar.k(screenCaptureIconView2.getId(), 6, guideline.getId(), 7);
            bVar.k(screenCaptureIconView2.getId(), 7, guideline.getId(), 6);
            bVar.k(screenCaptureIconView2.getId(), 4, getWatchTogetherIconView().getId(), 3);
            bVar.k(screenCaptureIconView2.getId(), 3, -1, 3);
            VKImageView reactionView2 = getReactionView();
            bVar.k(reactionView2.getId(), 6, 0, 6);
            bVar.k(reactionView2.getId(), 4, 0, 4);
            bVar.k(reactionView2.getId(), 7, -1, 7);
            bVar.k(reactionView2.getId(), 3, -1, 3);
        } else if (f == 180.0f) {
            TextView nameView3 = getNameView();
            bVar.o(nameView3.getId(), getWidth());
            bVar.k(nameView3.getId(), 3, 0, 3);
            bVar.k(nameView3.getId(), 6, 0, 6);
            bVar.k(nameView3.getId(), 7, 0, 7);
            bVar.k(nameView3.getId(), 4, -1, 4);
            f5(bVar, true);
            b.C0021b c0021b3 = bVar.u(guideline.getId()).e;
            c0021b3.a = true;
            c0021b3.F = 0;
            int id2 = guideline.getId();
            bVar.u(id2).e.f = cn70.b(12);
            bVar.u(id2).e.e = -1;
            bVar.u(id2).e.g = -1.0f;
            ImageView watchTogetherIconView3 = getWatchTogetherIconView();
            bVar.k(watchTogetherIconView3.getId(), 3, guideline.getId(), 3);
            bVar.k(watchTogetherIconView3.getId(), 4, guideline.getId(), 4);
            bVar.k(watchTogetherIconView3.getId(), 7, 0, 7);
            bVar.k(watchTogetherIconView3.getId(), 6, -1, 6);
            View screenCaptureIconView3 = getScreenCaptureIconView();
            bVar.k(screenCaptureIconView3.getId(), 3, guideline.getId(), 3);
            bVar.k(screenCaptureIconView3.getId(), 4, guideline.getId(), 4);
            bVar.k(screenCaptureIconView3.getId(), 7, getWatchTogetherIconView().getId(), 6);
            bVar.k(screenCaptureIconView3.getId(), 6, -1, 7);
            VKImageView reactionView3 = getReactionView();
            bVar.k(reactionView3.getId(), 7, 0, 7);
            bVar.k(reactionView3.getId(), 4, 0, 4);
            bVar.k(reactionView3.getId(), 3, -1, 3);
            bVar.k(reactionView3.getId(), 6, -1, 6);
        } else {
            TextView nameView4 = getNameView();
            bVar.o(nameView4.getId(), getWidth());
            bVar.k(nameView4.getId(), 6, 0, 6);
            bVar.k(nameView4.getId(), 7, 0, 7);
            bVar.k(nameView4.getId(), 4, 0, 4);
            bVar.k(nameView4.getId(), 3, -1, 3);
            f5(bVar, true);
            b.C0021b c0021b4 = bVar.u(guideline.getId()).e;
            c0021b4.a = true;
            c0021b4.F = 0;
            bVar.E(guideline.getId(), cn70.b(12));
            ImageView watchTogetherIconView4 = getWatchTogetherIconView();
            bVar.k(watchTogetherIconView4.getId(), 3, guideline.getId(), 3);
            bVar.k(watchTogetherIconView4.getId(), 4, guideline.getId(), 4);
            bVar.k(watchTogetherIconView4.getId(), 6, 0, 6);
            bVar.k(watchTogetherIconView4.getId(), 7, -1, 7);
            View screenCaptureIconView4 = getScreenCaptureIconView();
            bVar.k(screenCaptureIconView4.getId(), 3, guideline.getId(), 3);
            bVar.k(screenCaptureIconView4.getId(), 4, guideline.getId(), 4);
            bVar.k(screenCaptureIconView4.getId(), 6, getWatchTogetherIconView().getId(), 7);
            bVar.k(screenCaptureIconView4.getId(), 7, -1, 6);
            VKImageView reactionView4 = getReactionView();
            bVar.k(reactionView4.getId(), 3, 0, 3);
            bVar.k(reactionView4.getId(), 6, 0, 6);
            bVar.k(reactionView4.getId(), 4, -1, 4);
            bVar.k(reactionView4.getId(), 7, -1, 7);
        }
        bVar.b(this);
    }
}
