package xsna;

import android.content.ContextWrapper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.hg1;

/* compiled from: VideoAlbumsController.kt */
/* loaded from: classes7.dex */
public final class i1s0 implements c.l<fns0> {
    public final UserId b;
    public final VideoFile c;
    public final VideoApiHelperRepository d;
    public final String e;
    public final b f;
    public final b g;
    public final a h;
    public final SparseBooleanArray i;
    public final HashSet<Integer> j;
    public final RecyclerPaginatedView k;
    public final com.vk.lists.c l;
    public final rg0 m;
    public Integer n;

    /* compiled from: VideoAlbumsController.kt */
    public final class a extends zoj0<b, RecyclerView.e0> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            c cVar = (c) e0Var;
            cVar.q.setTag(Integer.valueOf(i));
            cVar.V5(this.c.c(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new c(viewGroup, i1s0.this.m);
        }
    }

    /* compiled from: VideoAlbumsController.kt */
    public final class b {
        public final int a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public boolean e;

        public b(int i, String str, boolean z, boolean z2, boolean z3) {
            this.a = i;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }
    }

    /* compiled from: VideoAlbumsController.kt */
    public final class c extends vif0<b> {
        public final View.OnClickListener n;
        public final VkText o;
        public final View p;
        public final VkCheckbox q;
        public boolean r;
        public final ImageView s;

        public c(ViewGroup viewGroup, rg0 rg0Var) {
            super(viewGroup, R.layout.video_album_action_item, 0);
            this.n = rg0Var;
            this.o = (VkText) this.itemView.findViewById(R.id.title);
            View findViewById = this.itemView.findViewById(R.id.container);
            this.p = findViewById;
            VkCheckbox vkCheckbox = (VkCheckbox) this.itemView.findViewById(R.id.checkbox);
            this.q = vkCheckbox;
            this.r = true;
            this.s = (ImageView) this.itemView.findViewById(R.id.privacy_icon);
            vkCheckbox.setOnClickListener(rg0Var);
            findViewById.setOnClickListener(rg0Var);
            findViewById.setTag(this);
        }

        @Override // xsna.vif0
        public final void i6(b bVar) {
            b bVar2 = bVar;
            boolean z = bVar2.d;
            this.r = z;
            VkCheckbox vkCheckbox = this.q;
            vkCheckbox.setEnabled(z);
            vkCheckbox.setChecked(bVar2.e);
            int f = e3m.f(z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_tertiary, this.itemView.getContext());
            VkText vkText = this.o;
            vkText.setTextColor(f);
            vkText.setText(bVar2.b);
            this.s.setVisibility(bVar2.c ? 0 : 8);
        }
    }

    public i1s0(ContextWrapper contextWrapper, UserId userId, VideoFile videoFile, VideoApiHelperRepository videoApiHelperRepository, String str) {
        this.b = userId;
        this.c = videoFile;
        this.d = videoApiHelperRepository;
        this.e = str;
        this.f = new b(-1, contextWrapper.getString(R.string.video_album_uploaded), false, false, true);
        this.g = new b(-2, contextWrapper.getString(R.string.video_album_added), false, !epx.f(userId, videoFile.I0()), false);
        a aVar = new a();
        this.h = aVar;
        this.i = new SparseBooleanArray();
        this.j = new HashSet<>();
        RecyclerPaginatedView recyclerPaginatedView = new RecyclerPaginatedView(contextWrapper);
        this.k = recyclerPaginatedView;
        this.m = new rg0(this, 14);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        recyclerPaginatedView.setAdapter(aVar);
        recyclerPaginatedView.setBackgroundColor(e3m.f(R.attr.vk_ui_background_modal, contextWrapper));
        this.l = com.vk.lists.f.a(new c.h(this), recyclerPaginatedView);
        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
        hg1.p4 p4Var = new hg1.p4();
        fVar.getClass();
        hg1.b(recyclerPaginatedView, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, p4Var).U(new hg1.o4()).a0(asu0.a.d()).subscribe(new w250(new r6i0(this, 15), 29)));
        recyclerPaginatedView.getRecyclerView().addOnItemTouchListener(new h1s0());
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<fns0> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<fns0> ui(int i, com.vk.lists.c cVar) {
        VideoFile videoFile = this.c;
        return this.d.c(videoFile.I0(), videoFile.o0(), this.b, cVar.k(), i);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<fns0> qVar, boolean z, com.vk.lists.c cVar) {
        qVar.subscribe(new a8v(new eih(this, z, cVar), 26), new j7l0(new g1s0(0), 8));
    }
}
