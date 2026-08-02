package xsna;

import android.app.Dialog;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.toj0;

/* compiled from: AboutVideoBottomSheet.kt */
/* loaded from: classes2.dex */
public final class uxn0 {
    public final Dialog a;
    public final RecyclerView b;
    public final a.b c;
    public final a.C3849a d;

    /* compiled from: AboutVideoBottomSheet.kt */
    public interface a {

        /* compiled from: AboutVideoBottomSheet.kt */
        /* renamed from: xsna.uxn0$a$a, reason: collision with other inner class name */
        public static final class C3849a implements a {
            public final LinearLayoutManager a;
            public final toj0.a b;

            public C3849a(RecyclerView recyclerView) {
                recyclerView.getContext();
                this.a = new LinearLayoutManager();
                this.b = new toj0.a(new wrl0(recyclerView, 6));
            }

            @Override // xsna.uxn0.a
            public final RecyclerView.n a() {
                return this.b;
            }

            @Override // xsna.uxn0.a
            public final RecyclerView.o b() {
                return this.a;
            }
        }

        /* compiled from: AboutVideoBottomSheet.kt */
        public static final class b implements a {
            public final GridLayoutManager a;
            public final toj0.b b;

            public b(RecyclerView recyclerView) {
                recyclerView.getContext();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
                gridLayoutManager.x = new yxn0(new hsc0(recyclerView, 19));
                this.a = gridLayoutManager;
                this.b = new toj0.b(new rme0(recyclerView, 11));
            }

            @Override // xsna.uxn0.a
            public final RecyclerView.n a() {
                return this.b;
            }

            @Override // xsna.uxn0.a
            public final RecyclerView.o b() {
                return this.a;
            }
        }

        RecyclerView.n a();

        RecyclerView.o b();
    }

    public uxn0(Dialog dialog) {
        this.a = dialog;
        RecyclerView recyclerView = (RecyclerView) dialog.findViewById(R.id.recycler);
        this.b = recyclerView;
        this.c = recyclerView != null ? new a.b(recyclerView) : null;
        this.d = recyclerView != null ? new a.C3849a(recyclerView) : null;
    }
}
