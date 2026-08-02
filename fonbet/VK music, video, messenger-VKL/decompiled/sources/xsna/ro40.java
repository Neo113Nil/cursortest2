package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.ec40;
import xsna.h7u0;
import xsna.ikv0;
import xsna.k840;

/* compiled from: MusicMyAudiosActionsController.kt */
/* loaded from: classes16.dex */
public final class ro40 {
    public final Activity a;
    public final ViewGroup b;
    public final u4a c;
    public final MusicCollectionType d;
    public Playlist e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final io.reactivex.rxjava3.disposables.b g;
    public ikv0 h;
    public final ikv0.d i;
    public boolean j;
    public boolean k;
    public ArrayList l;
    public List<CatalogFilterData> m;
    public final a n;

    /* compiled from: MusicMyAudiosActionsController.kt */
    public static final class a implements ec40.a<Playlist> {
        public a() {
        }

        @Override // xsna.ec40.a
        public final /* bridge */ /* synthetic */ boolean a(Playlist playlist) {
            return false;
        }

        @Override // xsna.ec40.a
        public final boolean b(ec40<Playlist> ec40Var) {
            final ro40 ro40Var = ro40.this;
            Activity activity = ro40Var.a;
            int i = ec40Var.a;
            if (i == R.id.music_action_toggle_download) {
                DownloadingState downloadingState = ec40Var.b.H;
                if ((downloadingState instanceof DownloadingState.Downloading) || (downloadingState instanceof DownloadingState.PendingDownload)) {
                    k840.a.d().v(ro40Var.e);
                    return true;
                }
                ((dw20.b) dw20.a.Q(new dw20.b(activity, null).M(R.drawable.vk_icon_download_square_outline_56, Integer.valueOf(R.attr.vk_legacy_accent)).v0(R.string.music_my_audios_alert_download_all_title), R.string.music_my_audios_alert_download_all_text)).h0(R.string.music_my_audios_alert_download_all_button, new u210(ro40Var, 7)).T(R.string.music_my_audios_alert_download_all_cancel, new uw3(26)).M0().I0(null);
                return true;
            }
            if (i == R.id.music_action_edit) {
                Iterator it = ro40Var.f.iterator();
                while (it.hasNext()) {
                    ((ap40) it.next()).E();
                }
                return true;
            }
            if (i != R.id.music_action_remove_downloaded) {
                return false;
            }
            int i2 = h7u0.p;
            h7u0.a c = h7u0.b.c(activity);
            c.g0(R.string.music_my_audios_alert_remove_download_title);
            c.U(R.string.music_my_audios_alert_remove_download_text);
            c.c0(R.string.music_my_audios_alert_remove_download_button, new DialogInterface.OnClickListener() { // from class: xsna.qo40
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ro40 ro40Var2 = ro40.this;
                    ro40Var2.k = true;
                    ro40Var2.j = true;
                    Iterator it2 = ro40Var2.f.iterator();
                    while (it2.hasNext()) {
                        ((ap40) it2.next()).h();
                    }
                    k840.a.d().W(ro40Var2.e, null);
                }
            });
            c.W(R.string.music_edit_mode_cancel_dialog_negative_button, null);
            c.m();
            return true;
        }
    }

    public ro40(Activity activity, ViewGroup viewGroup, u4a u4aVar, MusicCollectionType musicCollectionType, Playlist playlist) {
        this.a = activity;
        this.b = viewGroup;
        this.c = u4aVar;
        this.d = musicCollectionType;
        this.e = playlist;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.g = bVar;
        int i = 6;
        this.i = new ikv0.d("", (String) null, (ikv0.d.a) null, 6);
        String k = musicCollectionType.k();
        ArrayList arrayList = new ArrayList();
        CatalogFilterData catalogFilterData = new CatalogFilterData(musicCollectionType.k(), activity.getString(R.string.catalog_offline_default_replacement), null, epx.f(k, musicCollectionType.k()), null, null, null, null, null, 480, null);
        arrayList.add(catalogFilterData);
        arrayList.add(CatalogFilterData.zb(catalogFilterData, "offline_music_replacement_name", activity.getString(R.string.catalog_offline_name_replacement), epx.f(k, "offline_music_replacement_name"), 500));
        if (musicCollectionType == MusicCollectionType.PLAYLISTS) {
            arrayList.add(CatalogFilterData.zb(catalogFilterData, "offline_music_replacement_by_user", activity.getString(R.string.catalog_offline_by_user_replacement), epx.f(k, "offline_music_replacement_by_user"), 500));
            arrayList.add(CatalogFilterData.zb(catalogFilterData, "offline_music_replacement_added", activity.getString(R.string.catalog_offline_added_replacement), epx.f(k, "offline_music_replacement_added"), 500));
        }
        if (musicCollectionType == MusicCollectionType.ALBUMS) {
            arrayList.add(CatalogFilterData.zb(catalogFilterData, "offline_music_replacement_artist", activity.getString(R.string.catalog_offline_artist_replacement), epx.f(k, "offline_music_replacement_artist"), 500));
        }
        this.l = arrayList;
        this.m = EmptyList.b;
        this.n = new a();
        k840.a.d().e(this.e);
        r5v0 r5v0Var = k840.a.h;
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0((r5v0Var != null ? r5v0Var : null).a.a.b0(n8b0.class), new m40(new lw20(this, i), 28));
        s440 s440Var = new s440(new kb40(this, 2), 3);
        int i2 = kwg0.a;
        bVar.b(i0Var.subscribe(s440Var, new hwg0()));
    }
}
