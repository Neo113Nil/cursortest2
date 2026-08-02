package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.lvx;

/* compiled from: MusicArtistSelector.kt */
/* loaded from: classes3.dex */
public final class ka40 extends qfz<Artist> {
    public static final String B = qjg.a(qfz.A);

    /* compiled from: MusicArtistSelector.kt */
    public static final class a {
        public static void a(Activity activity, VideoFile videoFile, MusicPlaybackLaunchContext musicPlaybackLaunchContext, SearchStatsLoggingInfo searchStatsLoggingInfo) {
            if (videoFile instanceof MusicVideoFile) {
                List<Artist> list = ((MusicVideoFile) videoFile).B1;
                Artist artist = list != null ? (Artist) j5g.a0(list) : null;
                if (artist == null) {
                    return;
                }
                f(activity, Collections.singletonList(artist), null, musicPlaybackLaunchContext, searchStatsLoggingInfo);
            }
        }

        public static void b(Context context, Artist artist, MusicPlaybackLaunchContext musicPlaybackLaunchContext, SearchStatsLoggingInfo searchStatsLoggingInfo) {
            boolean equals = musicPlaybackLaunchContext.Gb().equals("kids_section");
            if (artist.Cb() && !jnj.j(artist.m)) {
                wk40.d(lyd.g().g(), context, artist.b, musicPlaybackLaunchContext.t(), musicPlaybackLaunchContext.Gb(), searchStatsLoggingInfo, 32);
            } else if (equals) {
                i0q0.f(new i3r(context, 2));
            } else {
                lyd.g().g().a(context, artist.c);
            }
        }

        public static void c(Activity activity, VideoFile videoFile, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            if (videoFile instanceof MusicVideoFile) {
                ArrayList arrayList = new ArrayList();
                MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
                List list = musicVideoFile.B1;
                arrayList.addAll(list != null ? list : EmptyList.b);
                List list2 = musicVideoFile.C1;
                arrayList.addAll(list2 != null ? list2 : EmptyList.b);
                f(activity, arrayList, null, musicPlaybackLaunchContext, null);
            }
        }

        public static void d(Activity activity, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            if (musicTrack != null) {
                ArrayList arrayList = new ArrayList();
                List list = musicTrack.t;
                arrayList.addAll(list != null ? list : EmptyList.b);
                List list2 = musicTrack.u;
                arrayList.addAll(list2 != null ? list2 : EmptyList.b);
                f(activity, arrayList, musicTrack.h, musicPlaybackLaunchContext, null);
            }
        }

        public static void e(Activity activity, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            if (playlist != null) {
                ArrayList arrayList = new ArrayList();
                List list = playlist.r;
                arrayList.addAll(list != null ? list : EmptyList.b);
                List list2 = playlist.s;
                arrayList.addAll(list2 != null ? list2 : EmptyList.b);
                f(activity, arrayList, playlist.o, musicPlaybackLaunchContext, null);
            }
        }

        public static void f(Activity activity, List list, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, SearchStatsLoggingInfo searchStatsLoggingInfo) {
            if (activity instanceof AppCompatActivity) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Artist artist = (Artist) obj;
                    if (artist.Cb() || artist.Db()) {
                        arrayList.add(obj);
                    }
                }
                boolean equals = musicPlaybackLaunchContext.Gb().equals("kids_section");
                if (arrayList.size() <= 1) {
                    if (!arrayList.isEmpty()) {
                        b(activity, (Artist) arrayList.get(0), musicPlaybackLaunchContext, searchStatsLoggingInfo);
                        return;
                    }
                    if (equals) {
                        i0q0.f(new i3r(activity, 2));
                        return;
                    } else if (str == null || str.length() <= 0) {
                        cvk.u(R.string.error, false);
                        return;
                    } else {
                        lyd.g().g().a(activity, str);
                        return;
                    }
                }
                String str2 = ka40.B;
                EmptyList emptyList = EmptyList.b;
                ju juVar = new ju(13, activity, musicPlaybackLaunchContext);
                FragmentManager supportFragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
                Fragment H = supportFragmentManager.H(str2);
                if ((H instanceof qfz ? (qfz) H : null) == null) {
                    ka40 ka40Var = new ka40();
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("ListItemSelectorBottomSheet_ITEMS", new ArrayList<>(arrayList));
                    ka40Var.setArguments(bundle);
                    ka40Var.z = juVar;
                    ka40Var.Td(supportFragmentManager, str2);
                }
            }
        }
    }

    @Override // xsna.qfz
    public final a920 Fn() {
        a920 a920Var = new a920();
        LayoutInflater from = LayoutInflater.from(mo2getContext());
        lvx.b bVar = new lvx.b();
        bVar.a = R.layout.music_action_go_to_artist;
        bVar.b = new la40(this);
        lvx.c cVar = new lvx.c() { // from class: xsna.ja40
            @Override // xsna.lvx.c
            public final void a(Object obj) {
                Artist artist = (Artist) obj;
                String str = ka40.B;
                ka40 ka40Var = ka40.this;
                ju juVar = ka40Var.z;
                if (juVar != null) {
                    juVar.invoke(artist);
                }
                ka40Var.dismiss();
            }
        };
        if (bVar.c == null) {
            bVar.c = new SparseArray<>();
        }
        bVar.c.put(-1, cVar);
        vtx vtxVar = new vtx(from, bVar);
        List list = this.y;
        if (list != null) {
            Collections.reverse(list);
        } else {
            list = null;
        }
        ArrayList arrayList = vtxVar.c;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        vtxVar.notifyDataSetChanged();
        a920Var.setHasStableIds(true);
        a920Var.K0(vtxVar);
        return a920Var;
    }

    @Override // com.google.android.material.bottomsheet.c, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        yn.setOnShowListener(new q7q());
        return yn;
    }
}
