package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class exf0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ fxf0 b;
    public final /* synthetic */ MusicTrack c;
    public final /* synthetic */ Context d;

    public /* synthetic */ exf0(fxf0 fxf0Var, MusicTrack musicTrack, Context context) {
        this.b = fxf0Var;
        this.c = musicTrack;
        this.d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fxf0 fxf0Var = this.b;
        a630 a630Var = fxf0Var.a;
        MusicTrack musicTrack = this.c;
        itg0.m(new io.reactivex.rxjava3.internal.operators.observable.a0(l370.J(a630Var.u1(musicTrack, true), jnj.h(musicTrack.V) ? R.string.music_toast_kids_audio_removal_done : R.string.music_toast_audio_removal_done), new c55(fxf0Var, this.d, musicTrack, 1)));
    }
}
