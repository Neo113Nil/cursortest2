package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LegacyAndroidAutoUIBuilder.kt */
/* loaded from: classes16.dex */
public final class h0z implements r22 {
    public static final int b = iah0.a(48);
    public static final Pattern c = Pattern.compile("/artist/(.+)$");
    public static final Pattern d = Pattern.compile("/curator/(.+)$");
    public final Context a;

    public h0z(Context context) {
        this.a = context;
    }

    public static void b(UIBlockHeader uIBlockHeader, Bundle bundle, ArrayList arrayList) {
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
        bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", uIBlockHeader.y);
        bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 1);
        if (uIBlockActionOpenSection != null) {
            arrayList.add(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat.Builder().setMediaId(uIBlockActionOpenSection.B).setTitle(uIBlockActionOpenSection.z).setExtras(bundle).build(), 1));
        }
    }

    @Override // xsna.r22
    public final MediaBrowserCompat.MediaItem a(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str, String str2) {
        Bundle a = q9k.a("com.vk.libcatalog2.tracks.binding", str);
        a.putString("com.vk.libcatalog2.ref", musicPlaybackLaunchContext.t());
        a.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", null);
        s3q0 s3q0Var = s3q0.a;
        return c(musicTrack, a);
    }

    public final MediaBrowserCompat.MediaItem c(MusicTrack musicTrack, Bundle bundle) {
        bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 1);
        bundle.putLong("android.media.IS_EXPLICIT", musicTrack.s ? 1L : 0L);
        bundle.putString("com.vk.libcatalog2.tracks.type", "com.vk.libcatalog2.tracks.track");
        MediaDescriptionCompat.Builder subtitle = new MediaDescriptionCompat.Builder().setMediaId(musicTrack.Ib()).setTitle(musicTrack.d).setSubtitle(musicTrack.h);
        String Kb = musicTrack.Kb(b);
        if (Kb == null) {
            Kb = String.valueOf(enj.k(R.drawable.ic_song_placeholder_96, this.a));
        }
        return new MediaBrowserCompat.MediaItem(subtitle.setIconUri(Uri.parse(Kb)).setExtras(bundle).build(), 2);
    }

    public final ArrayList d(List list) {
        ArrayList<MediaBrowserCompat.MediaItem> arrayList = new ArrayList<>();
        bn40.f(new Object[0]);
        List<UIBlock> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (UIBlock uIBlock : list2) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
            bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2);
            s3q0 s3q0Var = s3q0.a;
            e(uIBlock, bundle, arrayList);
            arrayList2.add(s3q0.a);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r1 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(UIBlock uIBlock, Bundle bundle, ArrayList<MediaBrowserCompat.MediaItem> arrayList) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        CharSequence d2;
        UIBlockList uIBlockList;
        Object obj;
        if (uIBlock instanceof UIBlockCatalog) {
            UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
            Iterator<T> it = uIBlockCatalog.A.iterator();
            while (true) {
                uIBlockList = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((UIBlock) obj).b, uIBlockCatalog.D)) {
                        break;
                    }
                }
            }
            UIBlock uIBlock2 = (UIBlock) obj;
            if (uIBlock2 != null && (uIBlock2 instanceof UIBlockList)) {
                uIBlockList = (UIBlockList) uIBlock2;
            }
            if (uIBlockList != null) {
                f(uIBlockList, arrayList);
                return;
            }
            return;
        }
        if (uIBlock instanceof UIBlockHeader) {
            b((UIBlockHeader) uIBlock, bundle, arrayList);
            return;
        }
        if (uIBlock instanceof UIBlockMusicTrack) {
            UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
            bundle.putString("com.vk.libcatalog2.tracks.binding", uIBlockMusicTrack.b);
            bundle.putString("com.vk.libcatalog2.ref", uIBlockMusicTrack.f);
            arrayList.add(c(uIBlockMusicTrack.z, bundle));
            return;
        }
        boolean z = uIBlock instanceof UIBlockMusicPlaylist;
        int i = b;
        Context context = this.a;
        if (z) {
            UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
            bundle.putString("com.vk.libcatalog2.ref", uIBlockMusicPlaylist.f);
            Playlist playlist = uIBlockMusicPlaylist.z;
            bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
            bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2);
            bundle.putString("com.vk.libcatalog2.tracks.type", "com.vk.libcatalog2.tracks.playlist");
            MediaDescriptionCompat.Builder title = new MediaDescriptionCompat.Builder().setMediaId(playlist.Ib()).setTitle(playlist.h);
            Thumb thumb = playlist.m;
            if (thumb != null) {
                Serializer.c<Thumb> cVar = Thumb.CREATOR;
                valueOf3 = thumb.Ab(i, false);
            }
            valueOf3 = String.valueOf(enj.k(R.drawable.vk_icon_playlist_36, context));
            MediaDescriptionCompat.Builder iconUri = title.setIconUri(Uri.parse(valueOf3));
            if (xx1.u(playlist)) {
                d2 = playlist.i;
                if (d2 == null) {
                    d2 = "";
                }
            } else {
                d2 = (xx1.x(playlist) && xx1.w(playlist)) ? c9b0.d(context, playlist) : c9b0.g(context, playlist);
            }
            arrayList.add(new MediaBrowserCompat.MediaItem(iconUri.setSubtitle(d2).setExtras(bundle).build(), 2));
            return;
        }
        if (!(uIBlock instanceof UIBlockLink)) {
            if (uIBlock instanceof UIBlockList) {
                if (!uIBlock.d.j()) {
                    f((UIBlockList) uIBlock, arrayList);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", bundle.getString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT"));
                ArrayList<UIBlock> arrayList2 = ((UIBlockList) uIBlock).y;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator<T> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    e((UIBlock) it2.next(), bundle2, arrayList);
                    arrayList3.add(s3q0.a);
                }
                return;
            }
            return;
        }
        UIBlockLink uIBlockLink = (UIBlockLink) uIBlock;
        bn40.f("transformLinkBlock: " + uIBlockLink.y);
        CatalogLink catalogLink = uIBlockLink.y;
        String str = catalogLink.e;
        Image image = catalogLink.f;
        String str2 = catalogLink.c;
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2);
            bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
            bundle.putString("com.vk.libcatalog2.tracks.type", "com.vk.libcatalog2.tracks.artist");
            MediaDescriptionCompat.Builder title2 = new MediaDescriptionCompat.Builder().setMediaId(group).setTitle(str2);
            ImageSize Ab = image.Ab(i, false);
            if (Ab == null || (valueOf2 = Ab.d.d) == null) {
                valueOf2 = String.valueOf(enj.k(R.drawable.vk_icon_music_mic_24, context));
            }
            arrayList.add(new MediaBrowserCompat.MediaItem(title2.setIconUri(Uri.parse(valueOf2)).setExtras(bundle).build(), 2));
        }
        Matcher matcher2 = d.matcher(catalogLink.e);
        if (matcher2.find()) {
            String group2 = matcher2.group(1);
            bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2);
            bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
            bundle.putString("com.vk.libcatalog2.tracks.type", "com.vk.libcatalog2.tracks.curator");
            MediaDescriptionCompat.Builder title3 = new MediaDescriptionCompat.Builder().setMediaId(group2).setTitle(str2);
            ImageSize Ab2 = image.Ab(i, false);
            if (Ab2 == null || (valueOf = Ab2.d.d) == null) {
                valueOf = String.valueOf(enj.k(R.drawable.vk_icon_user_outline_24, context));
            }
            arrayList.add(new MediaBrowserCompat.MediaItem(title3.setIconUri(Uri.parse(valueOf)).setExtras(bundle).build(), 2));
        }
    }

    public final void f(UIBlockList uIBlockList, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        for (UIBlock uIBlock : uIBlockList.y) {
            if (uIBlock instanceof UIBlockHeader) {
                bundle = new Bundle();
                b((UIBlockHeader) uIBlock, bundle, arrayList);
            } else {
                e(uIBlock, bundle, arrayList);
            }
        }
    }
}
