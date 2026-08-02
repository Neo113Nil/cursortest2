package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;

/* compiled from: StoryMusicPlaylistHeaderAdapter.kt */
/* loaded from: classes3.dex */
public final class i7m0 extends t550<Playlist, se50<Playlist>> {
    public final Playlist d;
    public final ze5 e;
    public final boolean f;

    /* compiled from: StoryMusicPlaylistHeaderAdapter.kt */
    public static final class a extends cg40<Playlist> {
        public final TextView o;

        public a(zeb0 zeb0Var, boolean z) {
            super(zeb0Var);
            this.o = (TextView) this.itemView.findViewById(R.id.playlist_snippet1);
            bwt0.p0(this.itemView.findViewById(R.id.playlist_menu), z);
        }

        @Override // xsna.se50
        public final void b6(Object obj) {
            ey2.i(this.o, c9b0.g(this.itemView.getContext(), (Playlist) obj));
        }
    }

    public i7m0(Playlist playlist, ze5 ze5Var, boolean z) {
        this.d = playlist;
        this.e = ze5Var;
        this.f = z;
        setHasStableIds(true);
    }

    @Override // xsna.etj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.d.Db();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, R.layout.music_bottom_sheet_header_playlist, viewGroup, false);
        zeb0 zeb0Var = new zeb0(b);
        boolean z = this.f;
        a aVar = new a(zeb0Var, z);
        if (z) {
            b.setOnClickListener(new brg(3, aVar, this));
        }
        return aVar;
    }

    @Override // xsna.t550, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: y0 */
    public final void onBindViewHolder(se50<Playlist> se50Var, int i) {
        se50Var.V5("", false, 0, this.d);
    }
}
