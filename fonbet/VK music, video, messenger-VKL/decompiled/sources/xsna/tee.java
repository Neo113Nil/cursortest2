package xsna;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.metrics.eventtracking.Event;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsGridTrackerFacade.kt */
/* loaded from: classes17.dex */
public final class tee {
    public static void a(ClipGridParams clipGridParams) {
        Event.a b;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        ClipGridParams.OnlyId zb = clipGridParams.zb();
        if (zb instanceof ClipGridParams.OnlyId.Profile) {
            el3 el3Var = Event.b;
            b = h5s.b("clips_open_author_page");
            b.a(((ClipGridParams.OnlyId.Profile) zb).b, "object");
        } else if (zb instanceof ClipGridParams.OnlyId.Hashtag) {
            el3 el3Var2 = Event.b;
            b = h5s.b("clips_open_hashtag_page");
            b.c("object", ((ClipGridParams.OnlyId.Hashtag) zb).b);
        } else if (zb instanceof ClipGridParams.OnlyId.ClipCompilation) {
            el3 el3Var3 = Event.b;
            b = h5s.b("clips_open_compilation_page");
            b.b("object", Integer.valueOf(((ClipGridParams.OnlyId.ClipCompilation) zb).b));
        } else if (zb instanceof ClipGridParams.OnlyId.Audio) {
            el3 el3Var4 = Event.b;
            b = h5s.b("clips_open_music_page");
            b.c("object", ((ClipGridParams.OnlyId.Audio) zb).b);
        } else if (zb instanceof ClipGridParams.OnlyId.CameraMask) {
            el3 el3Var5 = Event.b;
            b = h5s.b("clips_open_effect_page");
            b.c("object", ((ClipGridParams.OnlyId.CameraMask) zb).b);
        } else {
            if (!(zb instanceof ClipGridParams.OnlyId.GeoPlace)) {
                throw new NoWhenBranchMatchedException();
            }
            el3 el3Var6 = Event.b;
            b = h5s.b("clips_open_place_page");
            b.b("object", Integer.valueOf(((ClipGridParams.OnlyId.GeoPlace) zb).b));
        }
        b.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        bVar.k(b.e());
    }
}
