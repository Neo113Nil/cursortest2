package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;

/* compiled from: PlaylistHeaderAdapter.kt */
/* loaded from: classes3.dex */
public final class d9b0 extends t550<Playlist, se50<Playlist>> {
    public final ze5 d;
    public final boolean e;

    /* compiled from: PlaylistHeaderAdapter.kt */
    public static final class a extends cg40<Playlist> {
        public final TextView o;

        public a(zeb0 zeb0Var, boolean z) {
            super(zeb0Var);
            this.o = (TextView) this.itemView.findViewById(R.id.playlist_snippet2);
            bwt0.p0(this.itemView.findViewById(R.id.playlist_menu), z);
        }

        @Override // xsna.se50
        public final void b6(Object obj) {
            String quantityString;
            Playlist playlist = (Playlist) obj;
            if (playlist.d == 1) {
                quantityString = c9b0.a(playlist.l, this.itemView.getContext(), playlist.n);
            } else {
                Context context = this.itemView.getContext();
                int i = playlist.u;
                if (i == 0) {
                    quantityString = "";
                } else {
                    quantityString = context.getResources().getQuantityString(R.plurals.music_snippet_listenings, i < 1000 ? i : 1000, uqm0.f(i));
                }
            }
            ey2.i(this.o, quantityString);
        }
    }

    public d9b0(ze5 ze5Var, boolean z) {
        this.d = ze5Var;
        this.e = z;
        setHasStableIds(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((Playlist) this.c).Db();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, R.layout.music_bottom_sheet_header_playlist, viewGroup, false);
        zeb0 zeb0Var = new zeb0(b);
        boolean z = this.e;
        a aVar = new a(zeb0Var, z);
        if (z) {
            b.setOnClickListener(new ba(3, aVar, this));
        }
        return aVar;
    }
}
