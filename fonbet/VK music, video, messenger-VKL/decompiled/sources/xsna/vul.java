package xsna;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.dto.music.Playlist;
import com.vk.search.params.api.City;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: DeleteCalendarEventsInteractor.kt */
/* loaded from: classes7.dex */
public final class vul implements jph0, gc40, ouf0 {
    public final Object b;
    public final Object c;

    public /* synthetic */ vul(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.gc40
    public List a() {
        Playlist playlist = (Playlist) this.b;
        ArrayList arrayList = new ArrayList();
        j7b0 j7b0Var = (j7b0) this.c;
        Playlist playlist2 = j7b0Var.c;
        if (xx1.d(playlist2) && !j7b0Var.D()) {
            Pair pair = playlist.Eb() ? new Pair(Integer.valueOf(R.string.music_remove_albums_from_my_albums), Integer.valueOf(R.string.music_talkback_remove_album_from_my_albums)) : new Pair(Integer.valueOf(R.string.music_remove_playlist_from_my_playlists), Integer.valueOf(R.string.music_talkback_remove_playlist_from_my_playlists));
            arrayList.add(new ec40(R.id.music_action_remove_from_my_music, (Playlist) this.b, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), R.drawable.vk_icon_delete_outline_28, 0, 0, 992));
        } else if (xx1.b(playlist2)) {
            Pair pair2 = playlist.Eb() ? new Pair(Integer.valueOf(R.string.music_add_album_to_my_albums), Integer.valueOf(R.string.music_talkback_album_add_to_my_albums)) : new Pair(Integer.valueOf(R.string.music_add_playlist_to_my_playlists), Integer.valueOf(R.string.music_talkback_playlist_add_to_my_playlists));
            arrayList.add(new ec40(R.id.music_action_add_to_my_music, (Playlist) this.b, ((Number) pair2.d()).intValue(), ((Number) pair2.g()).intValue(), R.drawable.vk_icon_add_outline_28, 0, 0, 992));
        }
        if (!playlist.Fb() && playlist.v > 0) {
            arrayList.add(new ec40(R.id.music_action_play_next, playlist, R.string.music_play_next_redesigned, R.string.music_talkback_play_next, R.drawable.vk_icon_list_play_outline_28, 0, 0, 992));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        a401 a401Var = (a401) this.b;
        String str = (String) this.c;
        ms01 ms01Var = (ms01) obj;
        exc0.k("Not connected to device", a401Var.e());
        nwz0 nwz0Var = (nwz0) ms01Var.getService();
        ApiMetadata zza = zzff.zza(ms01Var.getContext());
        Parcel zza2 = nwz0Var.zza();
        zza2.writeString(str);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        nwz0Var.zzd(5, zza2);
        synchronized (a401Var.i) {
            try {
                if (a401Var.f != null) {
                    taskCompletionSource.setException(ey2.g(new Status(2001)));
                } else {
                    a401Var.f = taskCompletionSource;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.gc40
    public EmptyList c() {
        return EmptyList.b;
    }

    @Override // xsna.jph0
    public hfz h(boolean z, cph0 cph0Var, int i) {
        Object obj = cph0Var.a;
        if (!(obj instanceof eyz)) {
            return null;
        }
        eyz eyzVar = (eyz) obj;
        return new ykt(i, eyzVar.b, eyzVar.c, eyzVar.d, z, eyzVar.a, eyzVar.e);
    }

    @Override // xsna.jph0
    public hfz n(int i, Object obj, boolean z) {
        return ((oec) this.c).n(i, (City) obj, z);
    }

    @Override // xsna.jph0
    public hfz o(boolean z) {
        return new iph0(Integer.MIN_VALUE, ((Context) this.b).getString(R.string.search_params_any_location_title), null, z, -1);
    }
}
