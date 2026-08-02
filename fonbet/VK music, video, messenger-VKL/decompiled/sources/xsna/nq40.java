package xsna;

import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: MusicOfflineMyAudiosMapperImpl.kt */
/* loaded from: classes16.dex */
public final class nq40 {
    public final /* synthetic */ oq40 a = new oq40();
    public final boolean b;
    public final lu70 c;
    public final String d;
    public final f5 e;

    /* compiled from: MusicOfflineMyAudiosMapperImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicCollectionType.values().length];
            try {
                iArr[MusicCollectionType.AUDIOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicCollectionType.PLAYLISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicCollectionType.ALBUMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nq40(boolean z, lu70 lu70Var, String str, f5 f5Var) {
        this.b = z;
        this.c = lu70Var;
        this.d = str;
        this.e = f5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef A[LOOP:0: B:35:0x00e9->B:37:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118 A[LOOP:1: B:40:0x0112->B:42:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hda a(nq40 nq40Var, MusicCollectionType musicCollectionType, String str, List list, List list2, int i) {
        MusicCollectionType musicCollectionType2;
        boolean z;
        int i2;
        int i3;
        CatalogBadge catalogBadge;
        List list3 = (i & 4) != 0 ? EmptyList.b : list;
        List list4 = (i & 8) != 0 ? EmptyList.b : list2;
        nq40Var.getClass();
        boolean f = myc0.f(str);
        boolean z2 = nq40Var.b;
        if (z2) {
            musicCollectionType2 = musicCollectionType;
            if (musicCollectionType2 == MusicCollectionType.AUDIOS) {
                z = true;
                nt70 nt70Var = new nt70(nq40Var.d);
                nt70Var.d = true;
                nt70Var.l = list3;
                nt70Var.e = f;
                nt70Var.i = !z ? R.string.music_my_audios_kids_offline_empty_placeholder : musicCollectionType2.h();
                nt70Var.j = !z ? R.string.music_my_audios_kids_offline_empty_search_placeholder : musicCollectionType2.i();
                nt70Var.n = list4;
                nt70Var.m = list4;
                if (z2) {
                    i2 = R.string.catalog_offline_absent_subscription;
                } else {
                    int i4 = a.$EnumSwitchMapping$0[musicCollectionType2.ordinal()];
                    if (i4 == 1) {
                        i2 = R.string.catalog_offline_kids_track_absent_subscription;
                    } else if (i4 == 2) {
                        i2 = R.string.catalog_offline_kids_playlist_absent_subscription;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R.string.catalog_offline_kids_album_absent_subscription;
                    }
                }
                nt70Var.h.put("subscription_placeholder_big", Integer.valueOf(i2));
                mt70 a2 = nt70Var.a(musicCollectionType2.k());
                CatalogSection g = lu70.g(nq40Var.c, a2, musicCollectionType2.l(), 4);
                i3 = a.$EnumSwitchMapping$0[musicCollectionType2.ordinal()];
                if (i3 != 1) {
                    catalogBadge = new CatalogBadge(String.valueOf(list3.size()), X3.i.T);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    catalogBadge = new CatalogBadge(String.valueOf(list4.size()), X3.i.T);
                }
                CatalogSection zb = CatalogSection.zb(g, null, catalogBadge, null, null, 16351);
                List list5 = list3;
                HashMap hashMap = new HashMap(list5.size());
                for (Object obj : list5) {
                    hashMap.put(((MusicTrack) obj).Fb(), obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
                List list6 = list4;
                HashMap hashMap2 = new HashMap(list6.size());
                for (Object obj2 : list6) {
                    hashMap2.put(((Playlist) obj2).Ib(), obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(hashMap2);
                oq40 oq40Var = nq40Var.a;
                return new hda(zb, new CatalogExtendedData(null, null, null, null, null, null, null, null, linkedHashMap2, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, pn00.m(new Pair("empty_placeholder", oq40Var.b(a2, f ? "synthetic_offline_my_audios_placeholder_id" : "synthetic_offline_placeholder_id", str)), new Pair("subscription_placeholder_small", oq40Var.c(null)), new Pair("subscription_placeholder_big", oq40Var.a(a2.a("subscription_placeholder_big"))), new Pair("status_item", oq40.d(oq40Var, "", null, null, null, 10))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16785665, -1, 7, null), null);
            }
        } else {
            musicCollectionType2 = musicCollectionType;
        }
        z = false;
        nt70 nt70Var2 = new nt70(nq40Var.d);
        nt70Var2.d = true;
        nt70Var2.l = list3;
        nt70Var2.e = f;
        nt70Var2.i = !z ? R.string.music_my_audios_kids_offline_empty_placeholder : musicCollectionType2.h();
        nt70Var2.j = !z ? R.string.music_my_audios_kids_offline_empty_search_placeholder : musicCollectionType2.i();
        nt70Var2.n = list4;
        nt70Var2.m = list4;
        if (z2) {
        }
        nt70Var2.h.put("subscription_placeholder_big", Integer.valueOf(i2));
        mt70 a22 = nt70Var2.a(musicCollectionType2.k());
        CatalogSection g2 = lu70.g(nq40Var.c, a22, musicCollectionType2.l(), 4);
        i3 = a.$EnumSwitchMapping$0[musicCollectionType2.ordinal()];
        if (i3 != 1) {
        }
        CatalogSection zb2 = CatalogSection.zb(g2, null, catalogBadge, null, null, 16351);
        List list52 = list3;
        HashMap hashMap3 = new HashMap(list52.size());
        while (r1.hasNext()) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(hashMap3);
        List list62 = list4;
        HashMap hashMap22 = new HashMap(list62.size());
        while (r2.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(hashMap22);
        oq40 oq40Var2 = nq40Var.a;
        return new hda(zb2, new CatalogExtendedData(null, null, null, null, null, null, null, null, linkedHashMap22, null, null, null, null, linkedHashMap3, null, null, null, null, null, null, null, null, null, null, pn00.m(new Pair("empty_placeholder", oq40Var2.b(a22, f ? "synthetic_offline_my_audios_placeholder_id" : "synthetic_offline_placeholder_id", str)), new Pair("subscription_placeholder_small", oq40Var2.c(null)), new Pair("subscription_placeholder_big", oq40Var2.a(a22.a("subscription_placeholder_big"))), new Pair("status_item", oq40.d(oq40Var2, "", null, null, null, 10))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16785665, -1, 7, null), null);
    }
}
