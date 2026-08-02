package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.posting.presentation.album.AlbumPickerFragment;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;

/* compiled from: AlbumPickerView.kt */
/* loaded from: classes5.dex */
public final class dk1 implements gm50 {
    public final Context b;
    public final AlbumPickerFragment c;
    public final AlbumPickerFragment d;
    public final View e;
    public final UsableRecyclerPaginatedView f;
    public final jj1 g;
    public int h;
    public final bk1 i;

    /* compiled from: AlbumPickerView.kt */
    public final class a extends RecyclerView.n {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition < 0) {
                return;
            }
            int b = childAdapterPosition < dk1.this.h ? 0 : cn70.b(14);
            rect.right = 0;
            rect.bottom = 0;
            rect.left = cn70.b(12);
            rect.top = b;
        }
    }

    public dk1(Context context, AlbumPickerFragment albumPickerFragment, AlbumPickerFragment albumPickerFragment2) {
        this.b = context;
        this.c = albumPickerFragment2;
        this.d = albumPickerFragment;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_picker, (ViewGroup) null);
        this.e = inflate;
        final UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        this.f = usableRecyclerPaginatedView;
        jj1 jj1Var = new jj1(nr4.a(), new com.vk.posting.presentation.album.d(this));
        this.g = jj1Var;
        bk1 bk1Var = new bk1(this, 0);
        this.i = bk1Var;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.GRID;
        usableRecyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, usableRecyclerPaginatedView);
        dVar.c(this.h);
        dVar.d(bk1Var);
        dVar.a();
        usableRecyclerPaginatedView.setAdapter(jj1Var);
        usableRecyclerPaginatedView.getRecyclerView().setVerticalScrollBarEnabled(false);
        usableRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        usableRecyclerPaginatedView.getRecyclerView().setPadding(cn70.b(4), cn70.b(12), cn70.b(16), cn70.b(16));
        usableRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        usableRecyclerPaginatedView.getRecyclerView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.ck1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                bk1 bk1Var2 = this.i;
                UsableRecyclerPaginatedView usableRecyclerPaginatedView2 = UsableRecyclerPaginatedView.this;
                usableRecyclerPaginatedView2.setSpanCountLookup(bk1Var2);
                usableRecyclerPaginatedView2.getRecyclerView().invalidateItemDecorations();
            }
        });
        usableRecyclerPaginatedView.getRecyclerView().addItemDecoration(new a());
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
