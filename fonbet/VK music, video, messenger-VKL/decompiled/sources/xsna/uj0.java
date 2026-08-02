package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.a;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt;
import ru.ok.android.webrtc.features.CallFeature;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class uj0 implements io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.s, weq, ub9.c, pcs {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uj0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        AtomicReference atomicReference = (AtomicReference) this.b;
        String str = (String) this.c;
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    @Override // xsna.weq
    public boolean c(String str, List list) {
        aq50 aq50Var = (aq50) this.b;
        izs izsVar = (izs) this.c;
        aq50Var.getClass();
        if (!list.contains("vk") && !list.contains("lead_form") && !list.contains("vk_miniapp")) {
            return false;
        }
        izsVar.invoke(str);
        return true;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        FragmentManager fragmentManager = (FragmentManager) this.b;
        a.InterfaceC0623a interfaceC0623a = (a.InterfaceC0623a) this.c;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("playlist_selected", ClipsPlaylist.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("playlist_selected");
            if (!(parcelable3 instanceof ClipsPlaylist)) {
                parcelable3 = null;
            }
            parcelable = (ClipsPlaylist) parcelable3;
        }
        ClipsPlaylist clipsPlaylist = (ClipsPlaylist) parcelable;
        if (clipsPlaylist != null) {
            interfaceC0623a.a(new ClipsPlaylistPickerParams.AddClips(clipsPlaylist, false));
        }
        fragmentManager.f("community_playlist_result");
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        AdaptersKt.setAudioDeviceCompletable$lambda$1((CallsAudioManager) this.b, (CallsAudioDeviceInfo) this.c, bVar);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        ConversationFeatureManagerAdaptersKt.observeFeatureEnabled$lambda$0((ConversationFeatureManager) this.b, (CallFeature) this.c, rVar);
    }
}
