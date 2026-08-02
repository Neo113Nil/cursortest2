package sg.bigo.ads.m;

import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.y.b;

/* loaded from: classes9.dex */
public final class a extends sg.bigo.ads.k.a {
    protected MediaView y;

    public a(@NonNull b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final ViewGroup k() {
        return null;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final MediaView l() {
        return this.y;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final Button m() {
        return null;
    }

    @Override // sg.bigo.ads.k.a
    public final void t() {
        super.t();
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            this.y = (MediaView) viewGroup.findViewById(R.id.inter_media);
        }
    }

    @Override // sg.bigo.ads.k.a
    public final void a(double d) {
    }
}
