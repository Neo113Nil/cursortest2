package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.SparseArray;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.mvp.auto.ui.VkAndroidAutoSectionTints;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastItem;
import com.vk.catalog2.feature.music.dto.ui.UiBlockAndroidAutoVkMix;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.Podcast;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.c22;
import xsna.q22;

/* compiled from: AndroidAutoUIBuilderImpl.kt */
/* loaded from: classes16.dex */
public final class s22 implements r22 {
    public static final int d = iah0.a(48);
    public static final Pattern e = Pattern.compile("/artist/(.+)$");
    public static final Pattern f = Pattern.compile("/curator/(.+)$");
    public static final Pattern g = Pattern.compile("[?]section=([^&]+)$");
    public final Context a;
    public final f8u0 b;
    public final k8u0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AndroidAutoUIBuilderImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a GRID;
        public static final a LIST;
        private final int apiValue;

        static {
            a aVar = new a("LIST", 0, 1);
            LIST = aVar;
            a aVar2 = new a(SignalingProtocol.KEY_GRID, 1, 2);
            GRID = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2) {
            this.apiValue = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.apiValue;
        }
    }

    public s22(Context context, f8u0 f8u0Var, k8u0 k8u0Var) {
        this.a = context;
        this.b = f8u0Var;
        this.c = k8u0Var;
    }

    public static c22 b(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            return new c22.c(uIBlock.c, ((UIBlockList) uIBlock).A);
        }
        if (uIBlock instanceof UIBlockLink) {
            return new c22.a(((UIBlockLink) uIBlock).y.e, uIBlock.f);
        }
        if (uIBlock instanceof UIBlockActionOpenSection) {
            return new c22.c(((UIBlockActionOpenSection) uIBlock).B, null);
        }
        if (!(uIBlock instanceof UIBlockSearchSuggestion)) {
            return c22.a.c;
        }
        SearchSuggestion searchSuggestion = ((UIBlockSearchSuggestion) uIBlock).y;
        return new c22.b(searchSuggestion.c, searchSuggestion.k);
    }

    @Override // xsna.r22
    public final MediaBrowserCompat.MediaItem a(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str, String str2) {
        q22.f fVar = new q22.f(musicTrack.Ib(), musicPlaybackLaunchContext.t(), str);
        a aVar = a.LIST;
        MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(this.c.a.serialize(fVar));
        mediaId.setTitle(musicTrack.d);
        mediaId.setSubtitle(musicTrack.h);
        String Kb = musicTrack.Kb(d);
        if (Kb == null) {
            Kb = String.valueOf(enj.k(R.drawable.ic_song_placeholder_96, this.a));
        }
        mediaId.setIconUri(Uri.parse(Kb));
        boolean z = musicTrack.s;
        Bundle bundle = new Bundle();
        bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", aVar.h());
        if (str2 != null) {
            bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str2);
        }
        bundle.putLong("android.media.IS_EXPLICIT", z ? 1L : 0L);
        return new MediaBrowserCompat.MediaItem(mediaId.setExtras(bundle).build(), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List c(String str, UIBlock uIBlock) {
        String string;
        String str2;
        Integer num;
        MediaBrowserCompat.MediaItem mediaItem;
        Object obj;
        String valueOf;
        String valueOf2;
        String valueOf3;
        Thumb thumb;
        SparseArray<Uri> sparseArray;
        Uri uri;
        String valueOf4;
        CharSequence d2;
        String str3 = str;
        i8u0<c22> i8u0Var = this.b.a;
        i8u0<q22> i8u0Var2 = this.c.a;
        if (uIBlock instanceof UIBlockCatalog) {
            return (List) myc0.i(EmptyCoroutineContext.b, new t22((UIBlockCatalog) uIBlock, this, str3, null));
        }
        if (uIBlock instanceof UIBlockHeader) {
            UIBlockActionOpenSection uIBlockActionOpenSection = ((UIBlockHeader) uIBlock).E;
            return e43.m(uIBlockActionOpenSection != null ? d(uIBlockActionOpenSection, str3) : null);
        }
        if (uIBlock instanceof UIBlockMusicTrack) {
            UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
            return Collections.singletonList(a(uIBlockMusicTrack.z, MusicPlaybackLaunchContext.Fb(uIBlockMusicTrack.f), uIBlockMusicTrack.b, str3));
        }
        boolean z = uIBlock instanceof UIBlockMusicPlaylist;
        int i = d;
        Context context = this.a;
        if (z) {
            UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
            q22.d dVar = new q22.d(uIBlockMusicPlaylist.z.Ib(), uIBlockMusicPlaylist.f, uIBlockMusicPlaylist.b);
            a aVar = a.LIST;
            MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(i8u0Var2.serialize(dVar));
            mediaId.setTitle(uIBlockMusicPlaylist.z.h);
            Thumb thumb2 = uIBlockMusicPlaylist.z.m;
            if (thumb2 != null) {
                Serializer.c<Thumb> cVar = Thumb.CREATOR;
                valueOf4 = thumb2.Ab(i, false);
            }
            valueOf4 = String.valueOf(enj.k(R.drawable.vk_icon_playlist_36, context));
            mediaId.setIconUri(Uri.parse(valueOf4));
            Playlist playlist = uIBlockMusicPlaylist.z;
            if (xx1.u(playlist)) {
                d2 = playlist.i;
                if (d2 == null) {
                    d2 = "";
                }
            } else {
                d2 = (xx1.x(playlist) && xx1.w(playlist)) ? c9b0.d(context, playlist) : c9b0.g(context, playlist);
            }
            mediaId.setSubtitle(d2);
            boolean z2 = uIBlockMusicPlaylist.z.k;
            Bundle bundle = new Bundle();
            bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", aVar.h());
            if (str3 != null) {
                bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str3);
            }
            bundle.putLong("android.media.IS_EXPLICIT", z2 ? 1L : 0L);
            return Collections.singletonList(new MediaBrowserCompat.MediaItem(mediaId.setExtras(bundle).build(), 2));
        }
        if (uIBlock instanceof UIBlockPodcastItem) {
            UIBlockPodcastItem uIBlockPodcastItem = (UIBlockPodcastItem) uIBlock;
            Podcast podcast = uIBlockPodcastItem.y;
            q22.e eVar = new q22.e(podcast.e(), uIBlockPodcastItem.f, uIBlockPodcastItem.b);
            a aVar2 = a.LIST;
            MediaDescriptionCompat.Builder mediaId2 = new MediaDescriptionCompat.Builder().setMediaId(i8u0Var2.serialize(eVar));
            mediaId2.setTitle(podcast.d);
            List<Thumb> list = podcast.f;
            if (list == null || (thumb = (Thumb) j5g.Y(list)) == null || (sparseArray = thumb.e) == null || (uri = sparseArray.get(120)) == null || (valueOf3 = uri.toString()) == null) {
                valueOf3 = String.valueOf(enj.k(R.drawable.vk_icon_playlist_36, context));
            }
            mediaId2.setIconUri(Uri.parse(valueOf3));
            mediaId2.setSubtitle(podcast.i);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", aVar2.h());
            if (str3 != null) {
                bundle2.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str3);
            }
            return Collections.singletonList(new MediaBrowserCompat.MediaItem(mediaId2.setExtras(bundle2).build(), 2));
        }
        if (!(uIBlock instanceof UIBlockLink)) {
            if (uIBlock instanceof UIBlockList) {
                if (uIBlock.d.j()) {
                    ArrayList<UIBlock> arrayList = ((UIBlockList) uIBlock).y;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        g5g.y(c(str3, (UIBlock) it.next()), arrayList2);
                    }
                    return arrayList2;
                }
                ListBuilder e2 = e43.e();
                UIBlockActionOpenSection uIBlockActionOpenSection2 = null;
                for (UIBlock uIBlock2 : ((UIBlockList) uIBlock).y) {
                    if (uIBlock2 instanceof UIBlockHeader) {
                        if (uIBlockActionOpenSection2 != null) {
                            e2.add(d(uIBlockActionOpenSection2, str3));
                        }
                        UIBlockHeader uIBlockHeader = (UIBlockHeader) uIBlock2;
                        str3 = uIBlockHeader.y;
                        uIBlockActionOpenSection2 = uIBlockHeader.E;
                    } else {
                        e2.addAll(c(str3, uIBlock2));
                    }
                }
                if (uIBlockActionOpenSection2 != null) {
                    e2.add(d(uIBlockActionOpenSection2, str3));
                }
                return e2.g();
            }
            if (uIBlock instanceof UiBlockAndroidAutoVkMix) {
                UiBlockAndroidAutoVkMix uiBlockAndroidAutoVkMix = (UiBlockAndroidAutoVkMix) uIBlock;
                q22.g gVar = new q22.g(uiBlockAndroidAutoVkMix.y, uiBlockAndroidAutoVkMix.f, uiBlockAndroidAutoVkMix.b);
                a aVar3 = a.LIST;
                MediaDescriptionCompat.Builder mediaId3 = new MediaDescriptionCompat.Builder().setMediaId(i8u0Var2.serialize(gVar));
                AudioStreamMixTitles audioStreamMixTitles = uiBlockAndroidAutoVkMix.z;
                if (audioStreamMixTitles == null || (str2 = audioStreamMixTitles.b) == null || (string = cqm0.a(str2)) == null) {
                    string = context.getString(R.string.catalog_vk_mix_title);
                }
                mediaId3.setTitle(string);
                mediaId3.setSubtitle(uiBlockAndroidAutoVkMix.A);
                mediaId3.setIconUri(Uri.parse(uiBlockAndroidAutoVkMix.D));
                Bundle bundle3 = new Bundle();
                bundle3.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", aVar3.h());
                return Collections.singletonList(new MediaBrowserCompat.MediaItem(mediaId3.setExtras(bundle3).build(), 2));
            }
            if (uIBlock instanceof UIBlockSearchSuggestion) {
                UIBlockSearchSuggestion uIBlockSearchSuggestion = (UIBlockSearchSuggestion) uIBlock;
                c22 b = b(uIBlockSearchSuggestion);
                a aVar4 = a.LIST;
                MediaDescriptionCompat.Builder mediaId4 = new MediaDescriptionCompat.Builder().setMediaId(i8u0Var.serialize(b));
                mediaId4.setTitle(uIBlockSearchSuggestion.y.c);
                Bundle bundle4 = new Bundle();
                bundle4.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", aVar4.h());
                if (str3 != null) {
                    bundle4.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str3);
                }
                return Collections.singletonList(new MediaBrowserCompat.MediaItem(mediaId4.setExtras(bundle4).build(), 1));
            }
            if (!(uIBlock instanceof UIBlockActionPlayAudiosFromBlock)) {
                bn40.f("Unhandled block " + uIBlock);
                return EmptyList.b;
            }
            UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = (UIBlockActionPlayAudiosFromBlock) uIBlock;
            String str4 = uIBlockActionPlayAudiosFromBlock.f;
            boolean z3 = uIBlockActionPlayAudiosFromBlock.B;
            MediaDescriptionCompat a2 = b22.a(context, i8u0Var2.serialize(new q22.c(str4, z3, uIBlockActionPlayAudiosFromBlock.b)), z3);
            return e43.m(a2 == null ? null : new MediaBrowserCompat.MediaItem(a2, 2));
        }
        UIBlockLink uIBlockLink = (UIBlockLink) uIBlock;
        StringBuilder sb = new StringBuilder("transformLinkBlock: ");
        CatalogLink catalogLink = uIBlockLink.y;
        String str5 = uIBlockLink.b;
        String str6 = uIBlockLink.f;
        sb.append(catalogLink);
        bn40.f(sb.toString());
        CatalogLink catalogLink2 = uIBlockLink.y;
        String str7 = catalogLink2.e;
        Image image = catalogLink2.f;
        String str8 = catalogLink2.c;
        Matcher matcher = e.matcher(str7);
        Matcher matcher2 = f.matcher(str7);
        if (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                q22.a aVar5 = new q22.a(group, str6, str5);
                a aVar6 = a.LIST;
                MediaDescriptionCompat.Builder mediaId5 = new MediaDescriptionCompat.Builder().setMediaId(i8u0Var2.serialize(aVar5));
                mediaId5.setTitle(str8);
                ImageSize Ab = image.Ab(i, false);
                if (Ab == null || (valueOf2 = Ab.d.d) == null) {
                    valueOf2 = String.valueOf(enj.k(R.drawable.vk_icon_music_mic_24, context));
                }
                mediaId5.setIconUri(Uri.parse(valueOf2));
                Bundle bundle5 = new Bundle();
                bundle5.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", aVar6.h());
                if (str3 != null) {
                    bundle5.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str3);
                }
                mediaItem = new MediaBrowserCompat.MediaItem(mediaId5.setExtras(bundle5).build(), 2);
            }
            mediaItem = null;
        } else if (matcher2.find()) {
            String group2 = matcher2.group(1);
            if (group2 != null) {
                q22.b bVar = new q22.b(group2, str6, str5);
                a aVar7 = a.LIST;
                MediaDescriptionCompat.Builder mediaId6 = new MediaDescriptionCompat.Builder().setMediaId(i8u0Var2.serialize(bVar));
                mediaId6.setTitle(str8);
                ImageSize Ab2 = image.Ab(i, false);
                if (Ab2 == null || (valueOf = Ab2.d.d) == null) {
                    valueOf = String.valueOf(enj.k(R.drawable.vk_icon_user_outline_24, context));
                }
                mediaId6.setIconUri(Uri.parse(valueOf));
                Bundle bundle6 = new Bundle();
                bundle6.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", aVar7.h());
                if (str3 != null) {
                    bundle6.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str3);
                }
                mediaItem = new MediaBrowserCompat.MediaItem(mediaId6.setExtras(bundle6).build(), 2);
            }
            mediaItem = null;
        } else {
            ImageSize Ab3 = image.Ab(i, false);
            String str9 = Ab3 != null ? Ab3.d.d : null;
            Matcher matcher3 = g.matcher(str7);
            if (matcher3.find()) {
                Iterator<E> it2 = VkAndroidAutoSectionTints.h().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (epx.f(((VkAndroidAutoSectionTints) obj).i(), matcher3.group(1))) {
                        break;
                    }
                }
                VkAndroidAutoSectionTints vkAndroidAutoSectionTints = (VkAndroidAutoSectionTints) obj;
                if (vkAndroidAutoSectionTints != null) {
                    num = Integer.valueOf(vkAndroidAutoSectionTints.j());
                    Bitmap a3 = mg5.a(4, num, str9);
                    c22 b2 = b(uIBlockLink);
                    a aVar8 = a.LIST;
                    MediaDescriptionCompat.Builder mediaId7 = new MediaDescriptionCompat.Builder().setMediaId(i8u0Var.serialize(b2));
                    mediaId7.setTitle(str8);
                    mediaId7.setIconBitmap(a3);
                    Bundle bundle7 = new Bundle();
                    bundle7.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", aVar8.h());
                    if (str3 != null) {
                        bundle7.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str3);
                    }
                    mediaItem = new MediaBrowserCompat.MediaItem(mediaId7.setExtras(bundle7).build(), 1);
                }
            }
            num = null;
            Bitmap a32 = mg5.a(4, num, str9);
            c22 b22 = b(uIBlockLink);
            a aVar82 = a.LIST;
            MediaDescriptionCompat.Builder mediaId72 = new MediaDescriptionCompat.Builder().setMediaId(i8u0Var.serialize(b22));
            mediaId72.setTitle(str8);
            mediaId72.setIconBitmap(a32);
            Bundle bundle72 = new Bundle();
            bundle72.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", aVar82.h());
            if (str3 != null) {
            }
            mediaItem = new MediaBrowserCompat.MediaItem(mediaId72.setExtras(bundle72).build(), 1);
        }
        return e43.m(mediaItem);
    }

    public final MediaBrowserCompat.MediaItem d(UIBlockActionOpenSection uIBlockActionOpenSection, String str) {
        c22 b = b(uIBlockActionOpenSection);
        a aVar = a.LIST;
        MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(this.b.a.serialize(b));
        mediaId.setTitle(uIBlockActionOpenSection.z);
        Bundle bundle = new Bundle();
        bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", aVar.h());
        if (str != null) {
            bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
        }
        return new MediaBrowserCompat.MediaItem(mediaId.setExtras(bundle).build(), 1);
    }
}
