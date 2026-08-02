package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.artists.slider.entity.ArtistSliderState;
import com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.oq3;

/* compiled from: ArtistSliderViewStateMapper.kt */
/* loaded from: classes.dex */
public final class kt3 implements s2a<ArtistSliderState, jt3> {
    public final Object b = pn00.k(new Pair(1, Collections.singletonList(new oq3.a(byc0.b(106.6f, 102.5f), (float) 102.5d, (float) 23.1d, -8.7f))), new Pair(2, e43.l(new oq3.a(byc0.b(92.0f, 87.9f), (float) 139.5d, (float) 19.1d, -8.7f), new oq3.a(byc0.b(59.5f, 57.0f), (float) 85.2d, 99, -8.7f))), new Pair(3, e43.l(new oq3.a(byc0.b(92.0f, 87.9f), (float) 144.5d, (float) 17.1d, -8.7f), new oq3.a(byc0.b(59.5f, 57.0f), (float) 112.2d, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, -8.7f), new oq3.a(byc0.b(45.8f, 43.8f), (float) 95.5d, (float) 64.3d, 6.5f))));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.s2a
    public final jt3 a(ArtistSliderState artistSliderState) {
        ArrayList arrayList;
        ImageSize Bb;
        ArtistSliderState artistSliderState2 = artistSliderState;
        Playlist playlist = artistSliderState2.e;
        List<Artist> list = artistSliderState2.f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Image image = null;
            if (!it.hasNext()) {
                break;
            }
            Artist artist = (Artist) it.next();
            Image Ab = artist.Ab();
            if (Ab != null && !Ab.b.isEmpty() && !artist.Bb()) {
                image = artist.Ab();
            }
            if (image != null) {
                arrayList2.add(image);
            }
        }
        List H0 = j5g.H0(arrayList2, 3);
        int a = iah0.a(PsExtractor.VIDEO_STREAM_MASK);
        Image image2 = (Image) j5g.a0(H0);
        String url = (image2 == null || (Bb = Image.Bb(a, image2.b, false, true, true)) == null) ? null : Bb.getUrl();
        Thumb thumb = playlist.m;
        String Ab2 = thumb != null ? thumb.Ab(a, true) : null;
        int a2 = iah0.a(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = H0.iterator();
        while (it2.hasNext()) {
            ImageSize Bb2 = Image.Bb(a2, ((Image) it2.next()).b, true, true, true);
            String url2 = Bb2 != null ? Bb2.getUrl() : null;
            if (url2 != null) {
                arrayList3.add(url2);
            }
        }
        BlockId blockId = artistSliderState2.b;
        String str = playlist.h;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = playlist.i;
        String str4 = url == null ? Ab2 : url;
        PlayPauseButtonState playPauseButtonState = new PlayPauseButtonState(artistSliderState2.d, PlayPauseButtonState.Size.SIZE_48);
        List list2 = (List) this.b.get(Integer.valueOf(swe0.g(arrayList3.size(), 1, 3)));
        if (list2 == null) {
            arrayList = yiz.h(new oq3[0]);
        } else {
            List list3 = list2;
            Iterator it3 = arrayList3.iterator();
            Iterator it4 = list3.iterator();
            ArrayList arrayList4 = new ArrayList(Math.min(c5g.u(arrayList3, 10), c5g.u(list3, 10)));
            while (it3.hasNext() && it4.hasNext()) {
                arrayList4.add(new oq3((String) it3.next(), (oq3.a) it4.next()));
            }
            arrayList = arrayList4;
        }
        return new jt3(blockId, str2, playPauseButtonState, str3, str4, arrayList3, arrayList);
    }
}
