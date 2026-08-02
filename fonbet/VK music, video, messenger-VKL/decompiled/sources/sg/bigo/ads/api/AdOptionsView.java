package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class AdOptionsView extends a<sg.bigo.ads.core.adview.b> {
    public AdOptionsView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.core.adview.b a() {
        return new sg.bigo.ads.core.adview.b(this);
    }

    public AdOptionsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(sg.bigo.ads.api.core.b bVar, String str) {
        getViewImpl().a(bVar, str);
    }

    public AdOptionsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
