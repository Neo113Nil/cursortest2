package xsna;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import xsna.k840;

/* compiled from: VkMusicSleepTimerBottomSheet.kt */
/* loaded from: classes3.dex */
public final class e6v0 extends dc40 {
    public static final Object g = new Object();
    public final d6v0 e;
    public final com.vk.music.player.d f;

    public e6v0(d6v0 d6v0Var, com.vk.music.player.d dVar, boolean z) {
        super(z);
        this.e = d6v0Var;
        this.f = dVar;
    }

    @Override // xsna.dc40
    public final List<RecyclerView.Adapter<?>> a(AppCompatActivity appCompatActivity) {
        ze5 ze5Var = new ze5(new f6v0(this.f), this);
        List<ec40<Long>> a = this.e.a();
        g6v0 g6v0Var = new g6v0();
        g6v0Var.x0(g);
        fc40 fc40Var = new fc40(ze5Var, this.b);
        fc40Var.setItems(a);
        return e43.l(g6v0Var, fc40Var);
    }

    @Override // xsna.dc40
    public final void d(Activity activity) {
        super.d(activity);
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        s750Var.j();
    }
}
