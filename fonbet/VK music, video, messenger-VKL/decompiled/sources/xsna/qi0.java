package xsna;

import android.location.Location;
import com.huawei.hms.health.aacl;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import okhttp3.p;
import xsna.it80;
import xsna.ti0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qi0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qi0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [xsna.abo] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List<com.vk.dto.music.MusicTrack>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.vk.clips.sdk.stats.pixels.models.AdStatPixel] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ?? r1;
        Map aab;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ti0 ti0Var = (ti0) obj2;
                oi0 oi0Var = ti0Var.a;
                ?? r2 = (AdStatPixel) obj;
                if (r2 instanceof AdStatPixel.a ? oi0Var.a((AdStatPixel.a) r2) : false) {
                    return s3q0.a;
                }
                okhttp3.o a = ti0Var.b.a();
                p.a aVar = new p.a();
                aVar.i(r2.getUrl());
                okhttp3.u execute = ((f8f0) a.a(aVar.b())).execute();
                boolean t = execute.t();
                execute.close();
                if (!t) {
                    throw new ti0.a();
                }
                if (r2 instanceof AdStatPixel.a) {
                    oi0Var.b((AdStatPixel.a) r2);
                }
                return s3q0.a;
            case 1:
                int i2 = CommunityAddressesFragment.E0;
                it80.a aVar2 = it80.b;
                Location i3 = ((oj00) obj2).i(((CommunityAddressesFragment) obj).requireContext());
                aVar2.getClass();
                return new it80(i3);
            case 2:
                vh40 vh40Var = (vh40) obj2;
                Playlist playlist = (Playlist) obj;
                int size = playlist.y.size();
                int i4 = playlist.v;
                Throwable th = null;
                if (size < i4) {
                    try {
                        List<AudioAudioDto> d = ((AudioGetResponseDto) rsg0.a0(yfb.x(hx4.r((hx4) vh40Var.l.getValue(), playlist.c, Integer.valueOf(playlist.b), 0, Integer.valueOf(i4), playlist.x, MusicPlaybackLaunchContext.f.t(), 13114))).a()).d();
                        r1 = new ArrayList(c5g.u(d, 10));
                        Iterator it = d.iterator();
                        while (it.hasNext()) {
                            r1.add(oc4.d((AudioAudioDto) it.next()));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = EmptyList.b;
                    }
                } else {
                    r1 = playlist.y;
                }
                List<MusicTrack> a2 = vh40Var.e.a(playlist, r1);
                if (th != null) {
                    ((q8b0) vh40Var.k.getValue()).a(playlist).b(th);
                }
                return a2;
            default:
                aab = aacl.aab((List) obj2, (HealthKitApiInvoker) obj);
                return aab;
        }
    }
}
