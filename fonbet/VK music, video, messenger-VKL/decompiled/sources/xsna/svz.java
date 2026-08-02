package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.video.dto.VideoGetExternalStatsTokenResponseDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.photogallery.LocalPhotoGalleryProvider;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.search.params.api.SearchParams;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b9i0;
import xsna.ksh0;
import xsna.tv40;
import xsna.uv40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class svz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ svz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean _init_$lambda$0;
        switch (this.b) {
            case 0:
                _init_$lambda$0 = LocalPhotoGalleryProvider._init_$lambda$0((q4t) obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 1:
                qgi0.r((tgi0) obj, "congratulationsTitle");
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                q9n0 q9n0Var = (q9n0) obj;
                return q9n0Var.a.isEmpty() ? io.reactivex.rxjava3.core.q.H(new IOException("Empty response")) : io.reactivex.rxjava3.core.q.T(q9n0Var);
            case 4:
                return bn00.a((EcosystemSendOtpResponseDto) obj);
            case 5:
                jt4.a.getClass();
                return jt4.a((AudioPlaylistDto) obj);
            case 6:
                List list = (List) obj;
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    long j2 = 0;
                    while (((Playlist) it.next()).y.iterator().hasNext()) {
                        j2 += ((MusicTrack) r5.next()).f;
                    }
                    j += j2;
                }
                return new tt70(4, j, rli0.A(rli0.y(rli0.t(new i5g(list), new y8m(17)), 2)));
            case 7:
                qgi0.r((tgi0) obj, "downloads_mid_test_tag");
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "downloads_settings_by_network_setting_switch");
                return s3q0.a;
            case 9:
                qgi0.r((tgi0) obj, "MusicPickerPreviewCellSubtitle");
                return s3q0.a;
            case 10:
                tv40 tv40Var = (tv40) obj;
                if (tv40Var instanceof tv40.a) {
                    tv40.a aVar = (tv40.a) tv40Var;
                    return new uv40.a.C3835a(aVar.d, aVar.e, tv40Var.c && tv40Var.b);
                }
                if (tv40Var.equals(tv40.b.d)) {
                    return uv40.a.b.a;
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                return MusicPlayerInformerViewState.c.a;
            case 12:
                return drm0.p0(((pno0) obj).d()).toString();
            case 13:
                return ((x960) obj).a();
            case 14:
                float[] fArr = xk80.t0;
                return Boolean.TRUE;
            case 15:
                return ((VideoGetExternalStatsTokenResponseDto) obj).d();
            case 16:
                x290.a.e((Activity) obj);
                return s3q0.a;
            case 17:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((VideoFile) obj).c0());
            case 19:
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    qr.d(ce60.b, 101, (NewsEntry) it2.next());
                }
                return s3q0.a;
            case 20:
                return Integer.valueOf(((ld10) obj).a);
            case 21:
                return Float.valueOf(((hfk) obj).getY0());
            case 22:
                int i = RestoreSearchFragment.h0;
                L.i((Throwable) obj);
                return s3q0.a;
            case 23:
                ((Integer) obj).intValue();
                int i2 = RouletteView.k;
                return s3q0.a;
            case 24:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj2 = list2.get(i3);
                    fh9 fh9Var = i2h0.B;
                    kwz kwzVar = null;
                    if (!epx.f(obj2, Boolean.FALSE) && obj2 != null) {
                        kwzVar = (kwz) ((izs) fh9Var.c).invoke(obj2);
                    }
                    arrayList.add(kwzVar);
                }
                return new lwz(arrayList);
            case 25:
                return new hsn((ViewGroup) obj);
            case 26:
                qgi0.r((tgi0) obj, "search_address_input_field");
                return s3q0.a;
            case 27:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 28:
                SearchParams searchParams = ((ksh0.b) obj).c;
                return Boolean.valueOf((searchParams == null || searchParams.I()) ? false : true);
            default:
                return Boolean.valueOf(((b9i0) obj) instanceof b9i0.a);
        }
    }

    public /* synthetic */ svz(xe40 xe40Var) {
        this.b = 6;
    }
}
