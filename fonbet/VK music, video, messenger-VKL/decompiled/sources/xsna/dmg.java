package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.vrh0;

/* compiled from: CommonSearchQueryViewController.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class dmg extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dmg(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerView.e0 e0Var;
        View view;
        switch (this.b) {
            case 0:
                vrh0.a aVar = ((emg) this.receiver).d;
                if (aVar != null) {
                    aVar.a();
                }
                return s3q0.a;
            case 1:
                return (Boolean) ((mcy) this.receiver).get();
            default:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.receiver;
                VideoAutoPlay.a aVar2 = VideoAutoPlay.q0;
                int i = 100;
                if (!videoAutoPlay.Z0().a) {
                    WeakReference<RecyclerView.e0> weakReference = videoAutoPlay.B;
                    if (weakReference != null && (e0Var = weakReference.get()) != null && (view = e0Var.itemView) != null) {
                        if (view.getLocalVisibleRect(new Rect())) {
                            i = an10.b((r1.height() / view.getHeight()) * 100);
                        }
                    }
                    i = 0;
                }
                return Integer.valueOf(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmg(Object obj) {
        super(0, obj, VideoAutoPlay.class, "provideVisibilityPercent", "provideVisibilityPercent()I", 0);
        this.b = 2;
    }
}
