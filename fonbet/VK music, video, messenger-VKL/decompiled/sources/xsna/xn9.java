package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import com.vk.imageloader.view.VKImageView;
import com.vk.media.recorder.RecorderBase;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class xn9 extends zd9 {
    public final /* synthetic */ CameraUIView e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn9(doe0 doe0Var, b1y b1yVar, zn9 zn9Var, h3g0 h3g0Var, e8 e8Var, bo9 bo9Var, rw70 rw70Var, rj9 rj9Var, a1y a1yVar, sc4 sc4Var, CameraUIView cameraUIView, Context context, String str, String str2, RecorderBase.RecordingType recordingType, boolean z, boolean z2) {
        super(context, doe0Var, b1yVar, zn9Var, h3g0Var, e8Var, bo9Var, rw70Var, rj9Var, a1yVar, sc4Var, str, str2, recordingType, z, z2);
        this.e0 = cameraUIView;
    }

    @Override // xsna.zd9
    public final void E(boolean z) {
        super.E(z);
        float f = CameraUIView.w1;
        gm9 gm9Var = this.e0.B;
        if (z) {
            return;
        }
        gm9Var.getState().o(false);
        gm9Var.d();
    }

    @Override // xsna.zd9
    public final void H(Mask mask, String str, boolean z) {
        Mask selectedMask;
        I(mask, str, z);
        CameraUIView cameraUIView = this.e0;
        MasksWrap masksWrap = cameraUIView.b0;
        if (masksWrap == null || (selectedMask = masksWrap.getSelectedMask()) == null) {
            return;
        }
        gm9 gm9Var = cameraUIView.B;
        gm9Var.b.U = true;
        gm9Var.d();
        VKImageView vKImageView = cameraUIView.d1;
        if (vKImageView != null) {
            vKImageView.load(selectedMask.Bb());
        }
        TextView textView = cameraUIView.e1;
        if (textView != null) {
            textView.setText(selectedMask.g);
        }
    }
}
