package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.lists.AbstractPaginatedView;
import com.vk.posting.presentation.articlepicker.ArticlePickerFragment;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;

/* compiled from: ArticlePickerView.kt */
/* loaded from: classes5.dex */
public final class fp3 implements gm50 {
    public final Context b;
    public final ArticlePickerFragment c;
    public final f5z d;
    public final View e;
    public final UsableRecyclerPaginatedView f;
    public final so3 g;

    public fp3(Context context, f5z f5zVar, ArticlePickerFragment articlePickerFragment) {
        this.b = context;
        this.c = articlePickerFragment;
        this.d = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_picker, (ViewGroup) null);
        this.e = inflate;
        UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        this.f = usableRecyclerPaginatedView;
        so3 so3Var = new so3(new com.vk.posting.presentation.articlepicker.d(this));
        this.g = so3Var;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        usableRecyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, usableRecyclerPaginatedView).a();
        usableRecyclerPaginatedView.setAdapter(so3Var);
        usableRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        usableRecyclerPaginatedView.getRecyclerView().setPadding(0, 0, 0, cn70.b(16));
        usableRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
