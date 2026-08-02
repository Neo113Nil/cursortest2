package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.track.MusicTrackId;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.cmy;
import xsna.ec40;
import xsna.fsv;
import xsna.h7u0;
import xsna.i0p;
import xsna.l840;
import xsna.r0p;
import xsna.t550;
import xsna.tlo0;

/* compiled from: EditPlaylistContainer.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class f0p extends CoordinatorLayout implements i0p.a, gv5 {
    public static final /* synthetic */ int T = 0;
    public final LifecycleHandler A;
    public final i0p B;
    public final LayoutInflater C;
    public final e D;
    public final RecyclerView E;
    public final utt0 F;
    public final t550.a G;
    public final utt0 H;
    public final r0p I;
    public final ViewAnimator J;
    public final View K;
    public final d L;
    public final t550.a M;
    public final a N;
    public final b O;
    public final VkTopBar P;
    public boolean Q;
    public final FragmentImpl R;

    @Nullable
    public final mzp0 S;
    public final Activity z;

    /* compiled from: EditPlaylistContainer.java */
    public class a extends fsv.a<MusicTrack> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.fsv
        public final void Ig(int i, Object obj) {
            MusicTrack musicTrack = (MusicTrack) obj;
            f0p f0pVar = f0p.this;
            i0p i0pVar = f0pVar.B;
            e eVar = f0pVar.D;
            if (i == R.id.audio_action) {
                if (musicTrack == null) {
                    return;
                }
                f0p f0pVar2 = f0p.this;
                i0p i0pVar2 = f0pVar2.B;
                if (i0pVar2.v(musicTrack)) {
                    i0pVar2.K(musicTrack);
                    f0pVar2.I.B0(musicTrack);
                    f0p.w0(f0pVar2);
                    f0pVar2.K0();
                    f0pVar2.F.notifyDataSetChanged();
                } else {
                    i0pVar2.e0(musicTrack);
                }
                f0pVar.I.notifyDataSetChanged();
                return;
            }
            if (i == R.id.audio_image) {
                if (musicTrack == null) {
                    return;
                }
                i0pVar.r().N0(new lqk0((StartPlaySource) null, musicTrack, (List<MusicTrack>) i0pVar.Z(), MusicPlaybackLaunchContext.f, false, 0, ShuffleMode.SHUFFLE_AUTO, PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO, (AdsAudioPixelsContainer) null, SystemClock.elapsedRealtime()));
            } else if (i == R.id.music_action_btn) {
                if (((l840.a) f0pVar.G.c).a) {
                    cvk.w(f0pVar.getContext().getString(R.string.music_toast_attach_limit_exceeded, 100), false);
                    return;
                }
                f0p f0pVar3 = f0p.this;
                i0p i0pVar3 = f0pVar3.B;
                ArrayList arrayList = i0pVar3.Z() == null ? new ArrayList() : new ArrayList(i0pVar3.Z());
                ArrayList arrayList2 = new ArrayList(i0pVar3.X());
                arrayList.removeAll(i0pVar3.L());
                Intent a = lyd.g().a().a(f0pVar3.getContext(), MusicTrackId.a(arrayList), MusicTrackId.a(arrayList2), i0pVar3.q());
                if (i0pVar3.Z0() != null) {
                    a.putExtra("playlist_pid", i0pVar3.Z0().Db());
                }
                f0pVar3.A.g(10, String.valueOf(eVar.b), a);
            }
        }
    }

    /* compiled from: EditPlaylistContainer.java */
    public class b extends e.a {
        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            r0p r0pVar = f0p.this.I;
            if (r0pVar != null) {
                r0pVar.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: EditPlaylistContainer.java */
    public class d implements izs<ViewGroup, View> {
        public ThumbsImageView b;
        public VKImageView c;
        public ImageView d;
        public ImageView e;
        public VkCell f;
        public EditText g;
        public EditText h;
        public TextView i;
        public TextView j;
        public TextView k;
        public View l;
        public nwk o;
        public final float q;
        public boolean r;
        public final baf0 s;
        public final baf0 t;
        public final qog0 u;
        public String m = null;
        public String n = null;
        public final int p = e43.a.getResources().getInteger(R.integer.music_playlist_title_max_length);

        public d() {
            float b = iah0.b(6.0f);
            this.q = b;
            this.r = false;
            abg0 abg0Var = dhr0.t;
            this.s = abg0Var.b(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_accent);
            this.t = new baf0(abg0Var.a(R.drawable.vk_icon_picture_outline_28), -1);
            this.u = new qog0(b, f0p.this.getContext().getColor(R.color.vk_black_alpha20));
        }

        @NonNull
        public static String a(@Nullable EditText editText) {
            return (editText == null || editText.getText() == null) ? "" : editText.getText().toString().trim();
        }

        public final void c() {
            this.f.setVisibility(0);
            this.f.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.music_is_discoverable_title_option_2), (gzs<s3q0>) null, Integer.MAX_VALUE, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null), new VkCell.Middle.d(new tlo0.f(R.string.music_is_discoverable_subtitle_option_2), null, Integer.MAX_VALUE, null, null, null), null, VkCell.Middle.Size.Medium));
            this.f.setRight(new VkCell.Right.d(new VkCell.Right.a.f((gzs) new i5f(this, 18), !f0p.this.B.g1(), true), (VkCell.Right.e) null, (VkCell.Right.ExtraAction) null, (VkCell.Right.b) null, (VkCell.Right.f) null));
            this.f.setOnClickListener(new xz5(this, 3));
        }

        @Override // xsna.izs
        public final View invoke(ViewGroup viewGroup) {
            f0p f0pVar = f0p.this;
            View inflate = f0pVar.C.inflate(R.layout.music_edit_playlist_header_info, viewGroup, false);
            this.b = (ThumbsImageView) inflate.findViewById(R.id.playlist_image);
            this.g = (EditText) inflate.findViewById(R.id.playlist_title);
            this.h = (EditText) inflate.findViewById(R.id.playlist_description);
            this.d = (ImageView) inflate.findViewById(R.id.playlist_attach_photo_btn);
            this.c = (VKImageView) inflate.findViewById(R.id.temporary_playlist_cover);
            this.e = (ImageView) inflate.findViewById(R.id.overlay_playlist_cover);
            this.i = (TextView) inflate.findViewById(R.id.playlist_chat_description);
            this.j = (TextView) inflate.findViewById(R.id.header_playlist_chat_description);
            this.k = (TextView) inflate.findViewById(R.id.header_playlist_description);
            this.f = (VkCell) inflate.findViewById(R.id.discoverable_toggle);
            c();
            this.l = inflate.findViewById(R.id.playlist_chat_separator);
            bwt0.h0(f0pVar.D, this.d);
            this.c.setCornerRadius(this.q);
            this.g.setFilters(new InputFilter[]{new dzf(this.p)});
            this.g.addTextChangedListener(new g0p(this));
            this.h.addTextChangedListener(new h0p(this));
            nwk nwkVar = this.o;
            if (nwkVar != null) {
                nwkVar.invoke();
            }
            return inflate;
        }
    }

    /* compiled from: EditPlaylistContainer.java */
    public class e extends b5z implements View.OnClickListener, cmy.a {

        /* compiled from: EditPlaylistContainer.java */
        public class a implements ec40.a<Playlist> {
            public a() {
            }

            @Override // xsna.ec40.a
            public final /* bridge */ /* synthetic */ boolean a(Playlist playlist) {
                return false;
            }

            @Override // xsna.ec40.a
            public final boolean b(ec40<Playlist> ec40Var) {
                f0p f0pVar = f0p.this;
                int i = ec40Var.a;
                if (i == R.id.music_action_attach_playlist_cover_image) {
                    rwi.d().g().b(f0pVar.A);
                    return true;
                }
                if (i != R.id.music_action_remove_playlist_cover_image) {
                    return true;
                }
                f0pVar.B.D1();
                f0pVar.F.notifyDataSetChanged();
                return true;
            }
        }

        public e() {
        }

        @Override // xsna.cmy.a
        public final void I2() {
            f0p f0pVar = f0p.this;
            i0p i0pVar = f0pVar.B;
            if (i0pVar.a()) {
                f0pVar.H.x0(true);
                i0pVar.c();
            }
        }

        @Override // xsna.b5z
        public final void b(@NonNull Activity activity) {
            f0p.this.A.e(this);
        }

        @Override // xsna.b5z
        public final void d(@NonNull String str, int i, int i2, @Nullable Intent intent) {
            f0p f0pVar = f0p.this;
            i0p i0pVar = f0pVar.B;
            if (i2 != -1) {
                return;
            }
            if (i == 10 && intent != null) {
                ArrayList c = lyd.g().a().c(intent);
                if (c != null) {
                    i0pVar.K1(c);
                    f0pVar.I.setItems(i0pVar.Z());
                }
                ArrayList b = lyd.g().a().b(intent);
                if (b != null) {
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        MusicTrackId musicTrackId = (MusicTrackId) it.next();
                        MusicTrack Q0 = i0pVar.Q0(musicTrackId);
                        if (Q0 != null) {
                            i0pVar.K(Q0);
                            f0pVar.I.B0(Q0);
                            f0p.w0(f0pVar);
                            f0pVar.K0();
                            f0pVar.F.notifyDataSetChanged();
                        } else {
                            i0pVar.k0(musicTrackId);
                        }
                    }
                }
                f0p.w0(f0pVar);
                f0pVar.K0();
                f0pVar.F.notifyDataSetChanged();
            }
            if (i != 11 || intent == null) {
                return;
            }
            i0pVar.s1(intent.getStringExtra(X3.i.b));
            f0pVar.F.notifyDataSetChanged();
        }

        @Override // xsna.b5z
        public final void f(@NonNull Activity activity) {
            f0p f0pVar = f0p.this;
            i0p i0pVar = f0pVar.B;
            i0pVar.m(d.a(f0pVar.L.g));
            i0pVar.setDescription(d.a(f0pVar.L.h));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f0p f0pVar = f0p.this;
            i0p i0pVar = f0pVar.B;
            if (view.getId() == R.id.playlist_attach_photo_btn) {
                if (i0pVar.x() == null && i0pVar.O0() == null) {
                    rwi.d().g().b(f0pVar.A);
                } else {
                    lyd.g().w().m(f0pVar.z, i0pVar.Z0(), new a());
                }
            }
        }
    }

    public f0p(FragmentImpl fragmentImpl, @NonNull i0p i0pVar, @Nullable mzp0 mzp0Var) {
        super(fragmentImpl.mo2getContext(), null);
        a aVar = new a();
        this.N = aVar;
        b bVar = new b();
        this.O = bVar;
        this.Q = true;
        this.S = mzp0Var;
        this.R = fragmentImpl;
        Activity h = e3m.h(fragmentImpl.mo2getContext());
        this.z = h;
        this.B = i0pVar;
        LayoutInflater from = LayoutInflater.from(fragmentImpl.mo2getContext());
        this.C = from;
        e eVar = new e();
        this.D = eVar;
        from.inflate(R.layout.music_edit_playlist, this);
        this.P = (VkTopBar) findViewById(R.id.toolbar);
        this.J = (ViewAnimator) findViewById(R.id.content_animator);
        this.K = findViewById(R.id.progress);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.music_edit_playlist_list);
        this.E = recyclerView;
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        recyclerView.setLayoutManager(linearLayoutManager);
        cmy cmyVar = new cmy(linearLayoutManager, 15);
        cmyVar.e = eVar;
        recyclerView.addOnScrollListener(cmyVar);
        d dVar = new d();
        this.L = dVar;
        dVar.o = new nwk(this, 4);
        utt0 utt0Var = new utt0(dVar, new cnh(this, 5), 1);
        this.F = utt0Var;
        t550.a aVar2 = new t550.a("null", new pwk(this, 6));
        this.G = aVar2;
        aVar2.x0(l840.n);
        r0p.a aVar3 = new r0p.a();
        aVar3.b = i0pVar;
        u2b0 r = i0pVar.r();
        aVar3.a = r;
        i0p i0pVar2 = aVar3.b;
        r0p r0pVar = new r0p(i0pVar2 == null ? null : i0pVar2, aVar, r == null ? null : r);
        this.I = r0pVar;
        utt0 utt0Var2 = new utt0(from, R.layout.music_footer_loading, 4);
        this.H = utt0Var2;
        t550.a aVar4 = new t550.a("null", new vd1(16));
        this.M = aVar4;
        d920 y0 = d920.y0(utt0Var, aVar2, r0pVar, utt0Var2, aVar4);
        y0.setHasStableIds(true);
        recyclerView.setAdapter(y0);
        new androidx.recyclerview.widget.r(new c(y0, r0pVar, i0pVar, new wcg(this, 10))).l(recyclerView);
        LifecycleHandler c2 = LifecycleHandler.c(h);
        this.A = c2;
        c2.a(eVar);
        utt0Var2.x0(false);
        i0pVar.r().P0(bVar, true);
        y0();
        J0();
        J0();
    }

    public static void w0(f0p f0pVar) {
        t550.a aVar = f0pVar.G;
        aVar.x0(new l840.a(f0pVar.B.X().size() == 100));
        aVar.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0() {
        int i = this.B.f0() ? R.string.music_title_new_playlist : R.string.music_title_playlist;
        d dVar = this.L;
        boolean z = !d.a(dVar.g).isEmpty() && d.a(dVar.g).length() < dVar.p;
        Context context = getContext();
        boolean z2 = this.Q;
        krh krhVar = new krh(this, 11);
        ldl ldlVar = new ldl(this, 7);
        VkTopBar.c.d dVar2 = new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.ui_accessibility_close), krhVar, null, null, 12);
        VkTopBar vkTopBar = this.P;
        vkTopBar.setBefore(dVar2);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(i), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        VkTopBar.a after = vkTopBar.getAfter();
        VkTopBar.a.c b2 = after != null ? after.b() : null;
        VkTopBar.a.c.d dVar3 = b2 instanceof VkTopBar.a.c.d ? (VkTopBar.a.c.d) b2 : null;
        if (!z2) {
            vkTopBar.setAfter(null);
            return;
        }
        if (dVar3 != null) {
            View view = dVar3.a;
            view.setEnabled(z);
            view.setAlpha(z ? 1.0f : 0.64f);
            return;
        }
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setId(R.id.music_edit_playlist_save_button);
        float f = 48;
        vKImageView.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(f), iah0.a(f)));
        vKImageView.setScaleType(ImageView.ScaleType.CENTER);
        vKImageView.setImageResource(R.drawable.vk_icon_done_outline_28);
        gpo0.f(vKImageView, Integer.valueOf(R.attr.vk_ui_icon_accent_themed));
        vKImageView.setContentDescription(context.getString(R.string.accessibility_save));
        vKImageView.setEnabled(z);
        vKImageView.setAlpha(z ? 1.0f : 0.64f);
        bwt0.i0(vKImageView, new ozh(ldlVar, 11));
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.d(vKImageView), null, 6));
    }

    public final void K0() {
        i0p i0pVar = this.B;
        this.M.x0(ad0.y(i0pVar.Z()) ? new Pair(i0pVar.Z0(), i0pVar.Z()) : null);
    }

    @Override // xsna.i0p.a
    public final void a(@NonNull VKApiExecutionException vKApiExecutionException) {
        j03.i(getContext(), vKApiExecutionException);
        RecyclerView recyclerView = this.E;
        ViewAnimator viewAnimator = this.J;
        viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(recyclerView));
    }

    @Override // xsna.gv5
    public final boolean a0() {
        d dVar = this.L;
        int i = 0;
        if (!this.B.T(d.a(dVar.g), d.a(dVar.h))) {
            return false;
        }
        int i2 = h7u0.p;
        h7u0.a c2 = h7u0.b.c(getContext());
        c2.g0(R.string.confirm);
        c2.U(R.string.music_alert_exit_edit_mode_message);
        c2.c0(R.string.dont_save, new d0p(this, i));
        c2.W(R.string.cancel, new e0p());
        c2.m();
        return true;
    }

    @Override // xsna.i0p.a
    public final void b(@NonNull i0p i0pVar, @NonNull List<MusicTrack> list) {
        this.I.n0(list);
        this.H.x0(i0pVar.a());
        K0();
    }

    @Override // xsna.i0p.a
    public final void d(@Nullable VKApiExecutionException vKApiExecutionException) {
        if (vKApiExecutionException == null) {
            y0();
            return;
        }
        j03.i(getContext(), vKApiExecutionException);
        RecyclerView recyclerView = this.E;
        ViewAnimator viewAnimator = this.J;
        viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(recyclerView));
    }

    @Override // xsna.i0p.a
    public final void l(@NonNull VKApiExecutionException vKApiExecutionException) {
        j03.i(getContext(), vKApiExecutionException);
    }

    @Override // xsna.i0p.a
    public final void o(@NonNull i0p i0pVar, @NonNull Playlist playlist) {
        FragmentImpl fragmentImpl = this.R;
        ComponentCallbacks2 componentCallbacks2 = this.z;
        if (componentCallbacks2 instanceof w8i) {
            f9t b6 = ((MusicFragmentComponent) j6i.b(m7m.f((w8i) componentCallbacks2), MusicFragmentComponent.class)).b6();
            vob vobVar = new vob(playlist);
            b6.getClass();
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            a1wVar.C(b6, new z8q0((Playlist) vobVar.b)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe();
        }
        i0pVar.r().n0(this.O);
        Editable text = this.L.g.getText();
        fragmentImpl.setResult(22, new Intent().putExtra("key_title_playlist", text != null ? text.toString() : "").putExtra("playlist", playlist));
        fragmentImpl.finish();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3m.h(getContext()).getWindow().setSoftInputMode(3);
        this.B.l1(this);
        y0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.a0(this);
    }

    public final void y0() {
        i0p i0pVar = this.B;
        ArrayList Z = i0pVar.Z();
        if (Z == null && !i0pVar.f0()) {
            i0pVar.load();
            return;
        }
        K0();
        this.I.setItems(Z);
        RecyclerView recyclerView = this.E;
        ViewAnimator viewAnimator = this.J;
        viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(recyclerView));
        mzp0 mzp0Var = this.S;
        if (mzp0Var != null) {
            mzp0Var.d(getRootView());
        }
    }

    /* compiled from: EditPlaylistContainer.java */
    public static class c extends r.d {
        public final d920 e;
        public final r0p f;
        public final i0p g;
        public final wcg h;
        public int i = -1;
        public int j = -1;

        public c(d920 d920Var, r0p r0pVar, i0p i0pVar, wcg wcgVar) {
            this.e = d920Var;
            this.f = r0pVar;
            this.g = i0pVar;
            this.h = wcgVar;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            int adapterPosition = e0Var2.getAdapterPosition();
            d920 d920Var = this.e;
            r0p r0pVar = this.f;
            if (adapterPosition >= d920Var.B0(r0pVar)) {
                return adapterPosition < r0pVar.getItemCount() + d920Var.B0(r0pVar);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            super.b(recyclerView, e0Var);
            int i = this.i;
            int i2 = this.j;
            if (i != i2 && i >= 0 && i2 >= 0) {
                this.g.S(i, i2);
            }
            this.i = -1;
            this.j = -1;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            int adapterPosition = e0Var.getAdapterPosition();
            d920 d920Var = this.e;
            r0p r0pVar = this.f;
            if (adapterPosition >= d920Var.B0(r0pVar)) {
                if (adapterPosition < r0pVar.getItemCount() + d920Var.B0(r0pVar)) {
                    return r.d.l(3, 0);
                }
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean j() {
            return false;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean k() {
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            int adapterPosition = e0Var.getAdapterPosition();
            int adapterPosition2 = e0Var2.getAdapterPosition();
            r0p r0pVar = this.f;
            if (adapterPosition < adapterPosition2) {
                int i = adapterPosition;
                while (i < adapterPosition2) {
                    List<MusicTrack> y0 = r0pVar.y0();
                    int q = q(i);
                    i++;
                    Collections.swap(y0, q, q(i));
                }
            } else {
                for (int i2 = adapterPosition; i2 > adapterPosition2; i2--) {
                    Collections.swap(r0pVar.y0(), q(i2), q(i2 - 1));
                }
            }
            if (this.i < 0) {
                this.i = q(adapterPosition);
            }
            this.j = q(adapterPosition2);
            this.e.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void o(RecyclerView.e0 e0Var, int i) {
            this.h.invoke(Integer.valueOf(i));
            if (i != 2) {
                return;
            }
            e0Var.itemView.performHapticFeedback(0);
        }

        public final int q(int i) {
            return i - this.e.B0(this.f);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
