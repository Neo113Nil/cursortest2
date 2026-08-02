package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import sg.bigo.ads.bj.g;

@Deprecated
/* loaded from: classes9.dex */
public class AdIconView extends a<sg.bigo.ads.core.adview.a> {
    public AdIconView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.core.adview.a a() {
        return new sg.bigo.ads.core.adview.a(this);
    }

    public AdIconView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(String str, boolean z) {
        getViewImpl().a(null, str, z, null);
    }

    public AdIconView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(@Nullable Executor executor, String str, boolean z, @Nullable g gVar) {
        getViewImpl().a(executor, str, z, gVar);
    }
}
