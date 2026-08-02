package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: MusicTrackHolderBuilder.kt */
/* loaded from: classes3.dex */
public final class ub50<T> {
    public boolean a;
    public boolean b;
    public int g;
    public View h;
    public fsv<T> j;
    public final izs<T, MusicTrack> k;
    public se50<MusicTrack> l;
    public u2b0 m;
    public dhb0 n;
    public boolean c = true;
    public boolean d = true;
    public int e = R.color.music_playing_drawable_rect_blue;
    public int f = 1;
    public gzs<Boolean> i = new aq0(10);
    public wzs<? super Integer, ? super MusicTrack, Boolean> o = new b47(this, 6);

    /* JADX WARN: Multi-variable type inference failed */
    public ub50(izs<? super T, MusicTrack> izsVar) {
        if (izsVar == 0) {
            this.k = new p2u(10);
        } else {
            this.k = izsVar;
        }
    }

    public final ow2 a(ViewGroup viewGroup) {
        f();
        se50 se50Var = this.l;
        if (se50Var == null) {
            View view = this.h;
            if (view == null) {
                view = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(this.g, viewGroup, false);
            }
            se50Var = new sf40(view, this.i, this.c);
        }
        int i = this.f;
        if (i == 3) {
            se50Var = new gr40(se50Var, this.m, this.o, this.d);
        } else if (i == 5) {
            se50Var = new wm40(se50Var, this.m, this.n);
        }
        if (this.b) {
            se50Var = new kz40(se50Var, this.m, this.e, this.o);
        }
        if (this.a) {
            se50Var = new ei40(se50Var);
        }
        ow2 ow2Var = new ow2(new mn40(se50Var), this.k);
        fsv<T> fsvVar = this.j;
        if (fsvVar == null) {
            return ow2Var;
        }
        View view2 = ow2Var.p;
        if (view2 != null) {
            bwt0.i0(view2, new s53(26, ow2Var, fsvVar));
        }
        ThumbsImageView thumbsImageView = ow2Var.q;
        if (thumbsImageView != null) {
            bwt0.i0(thumbsImageView, new defpackage.y(16, ow2Var, fsvVar));
        }
        bwt0.i0(ow2Var.itemView, new bv1(24, ow2Var, fsvVar));
        return ow2Var;
    }

    public final se50 b(ViewGroup viewGroup, nm8 nm8Var, izs izsVar, izs izsVar2, l22 l22Var, ma maVar, izs izsVar3, ut6 ut6Var, mp3 mp3Var, boolean z, boolean z2) {
        f();
        se50<MusicTrack> se50Var = this.l;
        if (se50Var != null) {
            return se50Var;
        }
        View view = this.h;
        if (view == null) {
            view = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(this.g, viewGroup, false);
        }
        return new na50(new rna((VkCell) view, this.i, new jg8(this.o, this.m), nm8Var, izsVar, izsVar2, l22Var, maVar, izsVar3, ut6Var, mp3Var, z, z2));
    }

    public final void d() {
        this.f = 1;
        if (this.g == 0 && this.h == null) {
            this.g = R.layout.music_audio_item_playlist;
        }
    }

    public final void e(wzs wzsVar) {
        this.b = true;
        if (wzsVar != null) {
            this.o = wzsVar;
        }
        this.e = R.color.music_playing_drawable_rect_white;
    }

    public final void f() {
        if (this.l == null && this.g == 0 && this.h == null) {
            throw new IllegalStateException("Nor delegated ViewHolder or itemView or layoutId is defined");
        }
        if ((this.f != 1 || this.b) && this.m == null) {
            throw new IllegalStateException("PlayerModel is required");
        }
    }
}
