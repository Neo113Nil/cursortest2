package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.stories.StorySettingsActivity;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kz implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((com.vk.superapp.browser.internal.ui.shortcats.a) obj).g = null;
                break;
            case 1:
                ((ng4) obj).k.b(null);
                break;
            case 2:
                ((CidLogger) ((rd7) obj).b).log("BitrateDumpGatheringConfigCacherImpl", "Remote bitrate dump config has not been provided");
                break;
            case 3:
                MusicTrack musicTrack = (MusicTrack) obj;
                MusicTrack a = kq40.a(musicTrack);
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new ib50(musicTrack, a));
                break;
            case 4:
                ((b2e0) obj).a();
                break;
            default:
                int i2 = StorySettingsActivity.P;
                ((StorySettingsActivity) obj).V1();
                break;
        }
    }
}
