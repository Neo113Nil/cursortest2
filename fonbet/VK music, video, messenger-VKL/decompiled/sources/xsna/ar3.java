package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.artistlist.domain.LoadingState;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.mk50;

/* compiled from: ArtistListBottomSheet.kt */
/* loaded from: classes3.dex */
public final class ar3 extends tl50<hr3, mr3, br3> {
    public static final /* synthetic */ int l1 = 0;
    public fr3 i1;
    public final Object j1;
    public final Object k1;

    /* compiled from: ArtistListBottomSheet.kt */
    public static final class a extends dw20.b {
        public final MusicTrack e;
        public final MusicPlaybackLaunchContext f;
        public final boolean g;

        public a(Context context, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
            super(context, null);
            this.e = musicTrack;
            this.f = musicPlaybackLaunchContext;
            this.g = z;
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ar3 ar3Var = new ar3();
            Bundle bundle = new Bundle();
            bundle.putParcelable("music_track", this.e);
            bundle.putString("ref", this.f.Lb());
            bundle.putBoolean("is_force_dark_theme", this.g);
            ar3Var.setArguments(bundle);
            return ar3Var;
        }
    }

    /* compiled from: ArtistListBottomSheet.kt */
    public static final class b {
        public static final MusicTrack a(Bundle bundle) {
            Parcelable parcelable;
            Object parcelable2;
            int i = ar3.l1;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("music_track", MusicTrack.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("music_track");
                if (!(parcelable3 instanceof MusicTrack)) {
                    parcelable3 = null;
                }
                parcelable = (MusicTrack) parcelable3;
            }
            MusicTrack musicTrack = (MusicTrack) parcelable;
            if (musicTrack != null) {
                return musicTrack;
            }
            throw new IllegalStateException("Need set MusicTrack before open ArtistListBottomSheet");
        }
    }

    public ar3() {
        na naVar = new na(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j1 = msy.a(lazyThreadSafetyMode, naVar);
        this.k1 = msy.a(lazyThreadSafetyMode, new ra0(this, 5));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        fr3 fr3Var = new fr3(requireContext(), this, requireArguments().getBoolean("is_force_dark_theme"));
        this.i1 = fr3Var;
        return new mk50.c(fr3Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        mr3 mr3Var = (mr3) ao50Var;
        fr3 fr3Var = this.i1;
        if (fr3Var == null) {
            fr3Var = null;
        }
        fr3Var.f(mr3Var, new t50(1, this, ar3.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 2));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((hr3) vk50Var).j.a(new fm0(this, 2), this);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        List<Artist> list = b.a(requireArguments()).t;
        if (list == null) {
            throw new IllegalStateException("cant open artist bottomsheet without setting artistlist");
        }
        ArrayList arrayList = new ArrayList(list);
        Collection collection = b.a(requireArguments()).u;
        if (collection == null) {
            collection = EmptyList.b;
        }
        arrayList.addAll(collection);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Artist artist = (Artist) it.next();
            arrayList2.add(new yq3(artist.b, artist.c, artist.f, artist.m));
        }
        return new hr3(new kr3(new lr3(arrayList2, LoadingState.LOADING)), new com.vk.channels.impl.channel_screen.send_msg.c(new ix4()), requireArguments().getString("ref", ""), (x2b0) this.k1.getValue());
    }
}
