package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.a;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.hints.HintId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lph implements pcs, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lph(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        FragmentManager fragmentManager = (FragmentManager) this.c;
        a.InterfaceC0623a interfaceC0623a = (a.InterfaceC0623a) this.d;
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
        switch (this.b) {
            case 1:
                ConversationFeatureManagerAdaptersKt.enableFeatureForAllCompletable$lambda$0((ConversationFeatureManager) this.c, (CallFeature) this.d, bVar);
                break;
            default:
                StereoRoomManagerAdaptersKt.revokeAdmin$lambda$0((StereoRoomManager) this.c, (ParticipantId) this.d, bVar);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        List list = (List) this.c;
        HintId hintId = (HintId) this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((w4p0) obj).a != hintId) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        yVar.onSuccess(new Pair(arrayList2, g5g.H(arrayList2)));
    }
}
