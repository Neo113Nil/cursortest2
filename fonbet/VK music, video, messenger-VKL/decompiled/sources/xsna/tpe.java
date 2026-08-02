package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.a;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragmentWrapperActivity;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;

/* compiled from: ClipsPickerActivityResultLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class tpe implements a.InterfaceC0623a {
    public final Context a;
    public final izs<ClipsPlaylist, s3q0> b;
    public final spe c = new tb0() { // from class: xsna.spe
        @Override // xsna.tb0
        public final void onActivityResult(int i, int i2, Intent intent) {
            ClipsPlaylist clipsPlaylist;
            Parcelable parcelable;
            Object parcelableExtra;
            tpe tpeVar = tpe.this;
            if (i2 == -1 && i == 1801) {
                if (intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("playlist_result", ClipsPlaylist.class);
                        parcelable = (Parcelable) parcelableExtra;
                    } else {
                        Parcelable parcelableExtra2 = intent.getParcelableExtra("playlist_result");
                        if (!(parcelableExtra2 instanceof ClipsPlaylist)) {
                            parcelableExtra2 = null;
                        }
                        parcelable = (ClipsPlaylist) parcelableExtra2;
                    }
                    clipsPlaylist = (ClipsPlaylist) parcelable;
                } else {
                    clipsPlaylist = null;
                }
                if (clipsPlaylist != null) {
                    tpeVar.b.invoke(clipsPlaylist);
                }
            }
            Context context = tpeVar.a;
            bpn0 bpn0Var = enj.a;
            ComponentCallbacks2 h = e3m.h(context);
            aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
            if (aeg0Var != null) {
                aeg0Var.yk(tpeVar.c);
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.spe] */
    public tpe(Context context, izs<? super ClipsPlaylist, s3q0> izsVar) {
        this.a = context;
        this.b = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.playlists.a.InterfaceC0623a
    public final void a(ClipsPlaylistPickerParams.AddClips addClips) {
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(this.a);
        aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this.c);
        }
        int i = ClipsPlaylistPickerFragmentWrapperActivity.z;
        Bundle bundle = new Bundle();
        bundle.putParcelable("params", addClips);
        ClipsPlaylistPickerFragmentWrapperActivity.a aVar = new ClipsPlaylistPickerFragmentWrapperActivity.a(ClipsPlaylistPickerFragment.class, null, bundle);
        aVar.s(true);
        aVar.h(h, 1801);
    }
}
