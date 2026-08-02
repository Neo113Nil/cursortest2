package xsna;

import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.content.design.view.camera.CameraUIView;
import java.util.Arrays;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sn9 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sn9(int i, Object[] objArr) {
        this.c = i;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AppCompatImageView appCompatImageView = ((CameraUIView) this.d).n0;
                if (appCompatImageView != null) {
                    appCompatImageView.startAnimation(AnimationUtils.loadAnimation(appCompatImageView.getContext(), this.c));
                    break;
                }
                break;
            default:
                Object[] objArr = (Object[]) this.d;
                cvk.v(this.c, Arrays.copyOf(objArr, objArr.length));
                break;
        }
    }

    public /* synthetic */ sn9(CameraUIView cameraUIView, int i) {
        this.d = cameraUIView;
        this.c = i;
    }
}
