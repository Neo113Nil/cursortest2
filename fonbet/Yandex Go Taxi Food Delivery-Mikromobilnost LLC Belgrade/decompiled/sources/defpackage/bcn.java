package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.eatskit.ContentView;

/* loaded from: classes5.dex */
public final class bcn implements zo31 {
    public final ContentView a;
    public final rm b;
    public final rm c;
    public final dna d;
    public final FrameLayout e;

    public bcn(ContentView contentView, rm rmVar, rm rmVar2, dna dnaVar, FrameLayout frameLayout) {
        this.a = contentView;
        this.b = rmVar;
        this.c = rmVar2;
        this.d = dnaVar;
        this.e = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
