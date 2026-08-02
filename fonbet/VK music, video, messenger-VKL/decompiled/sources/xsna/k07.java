package xsna;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.vk.music.player.presentation.main.BigPlayerLayout;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BigPlayerLayout.kt */
/* loaded from: classes3.dex */
public final class k07 extends androidx.constraintlayout.motion.widget.c {
    public final /* synthetic */ ty0 b;
    public final /* synthetic */ BigPlayerLayout c;

    public k07(ty0 ty0Var, BigPlayerLayout bigPlayerLayout) {
        this.b = ty0Var;
        this.c = bigPlayerLayout;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void c(int i) {
        this.b.invoke();
        CopyOnWriteArrayList<MotionLayout.i> copyOnWriteArrayList = this.c.g0;
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(this);
    }
}
