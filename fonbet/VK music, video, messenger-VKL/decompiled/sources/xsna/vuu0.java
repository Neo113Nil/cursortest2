package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: VkFeedOnMediaAudioTrackView.kt */
/* loaded from: classes18.dex */
public final class vuu0 extends wuu0 {
    public final tuu0 c;

    public vuu0(Context context) {
        super(context);
        LayoutInflater from = LayoutInflater.from(getContext());
        getContext();
        from.inflate(R.layout.pds_on_media_audio_track, (ViewGroup) this, true);
        this.c = new tuu0(this);
    }

    @Override // xsna.wuu0
    public tuu0 getDelegate() {
        return this.c;
    }
}
