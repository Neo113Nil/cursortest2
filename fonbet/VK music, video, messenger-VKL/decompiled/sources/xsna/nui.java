package xsna;

import one.video.controls.view.seekbar.CompositeSeekBarView;
import one.video.controls.view.seekbar.CustomSeekBar;
import one.video.controls.view.seekbar.ProgressSeekBarView;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayerAdapterKt;
import ru.ok.android.webrtc.participant.movie.MovieId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class nui implements CustomSeekBar.a, io.reactivex.rxjava3.core.d {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nui(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // one.video.controls.view.seekbar.CustomSeekBar.a
    public void a(boolean z) {
        ProgressSeekBarView progressSeekBarView = (ProgressSeekBarView) this.b;
        CompositeSeekBarView compositeSeekBarView = (CompositeSeekBarView) this.c;
        if (!z) {
            int i = CompositeSeekBarView.j;
            return;
        }
        progressSeekBarView.setMax(compositeSeekBarView.d);
        progressSeekBarView.setProgress(compositeSeekBarView.e);
        progressSeekBarView.setSecondaryProgress(compositeSeekBarView.f);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        WatchTogetherPlayerAdapterKt.resumeCompletable$lambda$0((WatchTogetherPlayer) this.b, (MovieId) this.c, bVar);
    }
}
