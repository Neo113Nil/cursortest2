package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes13.dex */
public final class edo0 implements zo31 {
    public final GoFrameLayout a;
    public final nzm b;
    public final RecyclerView c;

    public edo0(GoFrameLayout goFrameLayout, nzm nzmVar, RecyclerView recyclerView) {
        this.a = goFrameLayout;
        this.b = nzmVar;
        this.c = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
