package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: NarrativesInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class wu50 implements vu50 {
    public final ou50 a;

    public wu50(ou50 ou50Var) {
        this.a = ou50Var;
    }

    @Override // xsna.vu50
    public final io.reactivex.rxjava3.core.x a(int i, UserId userId, String str) {
        return this.a.a(i, userId, str);
    }

    @Override // xsna.vu50
    public final io.reactivex.rxjava3.core.q b(int i, UserId userId, String str, boolean z) {
        return this.a.b(i, userId, str, z);
    }

    @Override // xsna.vu50
    public final io.reactivex.rxjava3.core.x<Narrative> c(UserId userId, String str, Collection<Integer> collection, ju50 ju50Var) {
        return this.a.c(userId, str, collection, ju50Var);
    }

    @Override // xsna.vu50
    public final io.reactivex.rxjava3.core.x<Narrative> d(UserId userId, int i, String str, Iterable<Integer> iterable, ju50 ju50Var) {
        return this.a.d(userId, i, str, iterable, ju50Var);
    }

    @Override // xsna.vu50
    public final io.reactivex.rxjava3.core.q<Photo> e(String str) {
        return this.a.e(str);
    }

    @Override // xsna.vu50
    public final String g(Collection collection, Collection collection2, boolean z) {
        int i = R.string.highlight_one_story_removed_in_one_highlight_redesign;
        int i2 = z ? R.string.highlight_one_story_added_in_one_highlight_redesign : R.string.highlight_one_story_removed_in_one_highlight_redesign;
        if (!z) {
            i = R.string.highlight_one_story_added_in_one_highlight_redesign;
        }
        int i3 = R.plurals.highlight_one_story_delete_in_multiple_highlights_redesign;
        int i4 = z ? R.plurals.highlight_one_story_added_in_multiple_highlights_redesign : R.plurals.highlight_one_story_delete_in_multiple_highlights_redesign;
        if (!z) {
            i3 = R.plurals.highlight_one_story_added_in_multiple_highlights_redesign;
        }
        if (collection.size() == 1 && collection2.isEmpty()) {
            return y8g0.f(i2, ((Narrative) j5g.X(collection)).d);
        }
        if (collection.size() == 1 && collection2.size() == 1) {
            return y8g0.f(i2, ((Narrative) j5g.X(collection)).d) + ". " + y8g0.f(i, ((Narrative) j5g.X(collection2)).d);
        }
        if (collection.size() > 1 && collection2.isEmpty()) {
            return y8g0.c(i4, collection.size());
        }
        if (collection.size() <= 1 || collection2.size() != 1) {
            return y8g0.c(i4, collection.size()) + ". " + y8g0.c(i3, collection2.size());
        }
        return y8g0.c(i4, collection.size()) + ". " + y8g0.f(i, ((Narrative) j5g.X(collection2)).d);
    }

    @Override // xsna.vu50
    public final io.reactivex.rxjava3.core.x h(UserId userId, ArrayList arrayList) {
        return this.a.f(userId, arrayList);
    }
}
