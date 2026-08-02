package sg.bigo.ads.z;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import sg.bigo.ads.ai.m;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;

/* loaded from: classes9.dex */
public class d extends sg.bigo.ads.y.b {
    private m I;

    public d(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        m x = gVar.b.x();
        this.I = x;
        this.H = x.c();
    }

    @Override // sg.bigo.ads.y.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i, viewArr);
        if (this.I.b()) {
            sg.bigo.ads.y.a.a(viewGroup, viewGroup, i, this, this.H);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.y.b, sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.q) {
            return;
        }
        this.q = true;
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) f(), SystemClock.elapsedRealtime() - this.k);
    }
}
