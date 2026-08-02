package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.narratives.Narrative;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.stickers.settings.StickerSettingsFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.rrt;
import xsna.ru50;
import xsna.ung;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj4 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.m, Preference.c, rrt.a, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sj4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        int i = this.b;
        wni wniVar = (wni) this.c;
        switch (i) {
            case 19:
                return (List) wniVar.invoke(obj, obj2);
            default:
                int i2 = el70.g1;
                return (Boolean) wniVar.invoke(obj, obj2);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 7:
                return (Pair) ((rch) this.c).invoke(obj, obj2, obj3);
            default:
                return (Triple) ((rch) this.c).invoke(obj, obj2, obj3);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 11:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj;
                debugDevSettingsFragment.o0.n(debugDevSettingsFragment, new itw());
                enj.r(debugDevSettingsFragment.mo2getContext(), "phaseId увеличен", 0);
                break;
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj;
                int i2 = SettingsGeneralFragment.z0;
                settingsGeneralFragment.getClass();
                new StickerSettingsFragment.a().k(settingsGeneralFragment.requireContext());
                break;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ((SessionRoomsManager) this.c).getRoomParticipants(SessionRoomId.MainCall.INSTANCE, new rj60(yVar, 18), new gj80(yVar, 12));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 10:
                return ((Boolean) ((iz0) this.c).invoke(obj)).booleanValue();
            case 14:
                return ((Boolean) ((cws) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((n3b0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        List observeLocalGalleryContentChangePaginated$lambda$15;
        switch (this.b) {
            case 0:
                return (nd4) ((vd1) this.c).invoke(obj);
            case 1:
                return (AuthResult) ((iz0) this.c).c;
            case 2:
                return (io.reactivex.rxjava3.core.t) ((sh3) this.c).invoke(obj);
            case 3:
                return ((uvs0) this.c).invoke();
            case 4:
                return (s3q0) ((fdd) this.c).invoke(obj);
            case 5:
                return (ShortVideoGetTemplateExtendedResponseDto) ((iz0) this.c).c;
            case 6:
                return (hda) ((ung.e) this.c).invoke(obj);
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 14:
            case 19:
            case 24:
            case 25:
            default:
                return (nov) ((n3b0) this.c).invoke(obj);
            case 9:
                return (Boolean) ((izs) this.c).invoke(obj);
            case 13:
                return (crq) ((iz0) this.c).invoke(obj);
            case 15:
                return (AppCarousel) ((g9t) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((cws) this.c).invoke(obj);
            case 17:
                observeLocalGalleryContentChangePaginated$lambda$15 = LocalGalleryProvider.observeLocalGalleryContentChangePaginated$lambda$15((cws) this.c, obj);
                return observeLocalGalleryContentChangePaginated$lambda$15;
            case 18:
                return (List) ((cws) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.b0) ((c2k) this.c).invoke(obj);
            case 21:
                return (Pair) ((vd1) this.c).invoke(obj);
            case 22:
                return (Narrative) ((ru50.a) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((cws) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.b0) ((y160) this.c).invoke(obj);
        }
    }
}
