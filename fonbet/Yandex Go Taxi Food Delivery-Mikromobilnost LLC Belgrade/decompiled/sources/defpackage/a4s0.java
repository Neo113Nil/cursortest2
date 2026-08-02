package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.yandex.go.dto.response.Action$MediaStory;
import com.yandex.go.shortcuts.impl.view.adapter.t;
import java.util.Iterator;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes6.dex */
public final class a4s0 implements fnu0 {
    public final /* synthetic */ ShortcutsView a;

    public a4s0(ShortcutsView shortcutsView) {
        this.a = shortcutsView;
    }

    @Override // defpackage.fnu0
    public final void a(String str) {
    }

    @Override // defpackage.fnu0
    public final Rect b(String str) {
        return null;
    }

    @Override // defpackage.fnu0
    public final View c(String str) {
        t tVar;
        SpannedGridLayoutManager spannedGridLayoutManager;
        Action$MediaStory action$MediaStory;
        ShortcutsView shortcutsView = this.a;
        tVar = shortcutsView.adapter;
        Iterator it = tVar.x.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            e6v e6vVar = (e6v) it.next();
            if ((e6vVar instanceof kf10) && (action$MediaStory = (Action$MediaStory) ((kf10) e6vVar).b.k) != null && jl40.l(str, action$MediaStory.a.a)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        spannedGridLayoutManager = shortcutsView.layoutManager;
        return spannedGridLayoutManager.X(i);
    }

    @Override // defpackage.fnu0
    public final void d(String str) {
    }

    @Override // defpackage.fnu0
    public final void e() {
    }
}
