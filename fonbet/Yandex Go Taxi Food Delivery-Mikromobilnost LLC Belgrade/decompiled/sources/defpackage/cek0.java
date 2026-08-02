package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes14.dex */
public final class cek0 implements zo31 {
    public final GoFrameLayout a;
    public final RecyclerView b;

    public cek0(GoFrameLayout goFrameLayout, ViewStub viewStub, RecyclerView recyclerView) {
        this.a = goFrameLayout;
        this.b = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
