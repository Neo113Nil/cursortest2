package sg.bigo.ads.core.adview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.view.AdImageView;

/* loaded from: classes9.dex */
public final class a extends c {
    public a(@NonNull sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
    }

    public final void a(@Nullable Executor executor, String str, boolean z, @Nullable sg.bigo.ads.bj.g gVar) {
        this.a.removeAllViews();
        AdImageView adImageView = new AdImageView(this.a.getContext());
        adImageView.setIconTag(true);
        if (gVar != null) {
            adImageView.a(gVar);
        }
        a(adImageView);
        adImageView.a(executor, str, z);
    }
}
