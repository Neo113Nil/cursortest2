package xsna;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import com.vk.log.L;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.story.api.di.StoriesComponentStub;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vk.voip.ui.service.BaseVoipService;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xs6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xs6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        List<Regex> list;
        JSONObject g;
        boolean z = true;
        switch (this.b) {
            case 0:
                boolean z2 = BaseVoipService.k;
                return new Handler(Looper.getMainLooper());
            case 1:
                qcy<Object>[] qcyVarArr = BookingPreloaderFragment.S;
                return new js7();
            case 2:
                int i = BroadcastConfigFragment.U;
                return zjq.b.i();
            case 3:
                return CatalogGetAudioSearchRequestFactory.z;
            case 4:
                zdw zdwVar = i7o0.b;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                return new e4w(zdwVar);
            case 5:
                qcy<Object>[] qcyVarArr2 = ClipsPlaylistsComponentImpl.h;
                return new vve();
            case 6:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return new q20();
            case 7:
                if (Build.VERSION.SDK_INT >= 31) {
                    str = Build.SOC_MODEL;
                    k4s0 b = com.vk.toggle.d.A.b();
                    if (b != null && (list = b.a) != null) {
                        List<Regex> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                if (((Regex) it.next()).f(str)) {
                                    return Boolean.valueOf(z);
                                }
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 8:
                return s3q0.a;
            case 9:
                int i2 = FutureDateTimePickerView.o;
                long Hn = com.google.android.material.datepicker.g.Hn();
                long b2 = yl10.b();
                CalendarConstraints.b bVar = new CalendarConstraints.b();
                bVar.a = Hn;
                bVar.b = b2;
                bVar.e = new CompositeDateValidator(e43.l(new DateValidatorPointForward(Hn), new DateValidatorPointBackward(b2)), CompositeDateValidator.e);
                return bVar.a();
            case 10:
                return s3q0.a;
            case 11:
                return s3q0.a;
            case 12:
                return "Ignoring request to startLongPoll for ImEnvironment. Reason: credentials are invalid";
            case 13:
                return new z11();
            case 14:
                return new Regex("(/games)?/(app[-0-9]+)((?:_([-0-9]+)))?((?:.*))?");
            case 15:
                return new f3x0();
            case 16:
                L.p("Subscribing to UpdateCountersQueueEvent");
                f620 f620Var = f620.b;
                if (f620.d != null) {
                    ((io.reactivex.rxjava3.subjects.f) f620.f.getValue()).onNext(s3q0.a);
                } else {
                    rsg0.T(new i730()).subscribe(new k2y(new kpr(7), 3));
                }
                return s3q0.a;
            case 17:
                return Boolean.valueOf(MusicFeatures.AUDIO_KIDS_MODE.h());
            case 18:
                return s3q0.a;
            case 19:
                return new p4r();
            case 20:
                return new p4r();
            case 21:
                qcy<Object>[] qcyVarArr4 = PostingComponentImpl.j;
                return new dp3(new fai());
            case 22:
                int i3 = PostingFragment.s0;
                return new dfu();
            case 23:
                return e43.l(new Pair("online_booking", elc0.b()), new Pair("video", elc0.b()), new Pair("album", elc0.b()), new Pair("photo", elc0.b()), new Pair("market_album", elc0.b()), new Pair("document_image", elc0.b()), new Pair("narrative", elc0.b()), new Pair("aliexpress_link", elc0.b()), new Pair("podcast", elc0.b()), new Pair("article", elc0.b()), new Pair("audio_playlist", elc0.b()), new Pair("artist", elc0.b()), new Pair("market", elc0.b()), new Pair("geo", elc0.b()), new Pair("graffiti", elc0.b()), new Pair("audio", elc0.b()), new Pair("group", elc0.b()), new Pair("link", elc0.b()), new Pair("doc", Collections.singletonList("compact")), new Pair(SignalingProtocol.KEY_ROOM, Collections.singletonList("full")), new Pair("poll", elc0.b()));
            case 24:
                return ((BridgeComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(BridgeComponent.class))).s();
            case 25:
                return s3q0.a;
            case 26:
                qcy<Object>[] qcyVarArr5 = StoriesComponentStub.C;
                return new p870();
            case 27:
                int i4 = StoryAttachImageView.t;
                return s3q0.a;
            case 28:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i5 = com.vk.toggle.b.A.i(StoriesFeatures.ST_VIDEO_PRELOADER_PART);
                return Long.valueOf((i5 == null || (g = i5.g()) == null) ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : g.optInt("load_duration_ms"));
            default:
                return new jed0();
        }
    }

    public /* synthetic */ xs6(elc0 elc0Var) {
        this.b = 23;
    }
}
