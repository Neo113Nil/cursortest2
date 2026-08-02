package xsna;

import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.data.VKList;
import com.vk.dto.geo.GeoLocation;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.tensorflow.util.Function;
import xsna.ni40;
import xsna.ung;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class v34 implements io.reactivex.rxjava3.functions.l, Function, io.reactivex.rxjava3.functions.m, Preference.c, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v34(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        PatternMatchRaw lambda$process$6;
        Map observeLocalGalleryContentChangePaginated$lambda$20;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = AttachVideoFragment.F0;
                return (VkPaginationList) ((u34) obj2).invoke(obj);
            case 1:
                return (hda) ((po1) obj2).invoke(obj);
            case 2:
            case 7:
            case 8:
            case 18:
            case 20:
            case 22:
            case 24:
            default:
                return (NewsEntry) ((l140) obj2).invoke(obj);
            case 3:
                lambda$process$6 = ((BodyPatternMatchingPipeline) obj2).lambda$process$6((PatternMatchRaw) obj);
                return lambda$process$6;
            case 4:
                return (s89) ((fk2) obj2).invoke(obj);
            case 5:
                return (List) ((tr0) obj2).invoke(obj);
            case 6:
                return (hda) ((ung.c) obj2).invoke(obj);
            case 9:
                return (PrivacySetting) ((ayo) obj2).invoke(obj);
            case 10:
                observeLocalGalleryContentChangePaginated$lambda$20 = LocalGalleryProvider.observeLocalGalleryContentChangePaginated$lambda$20((ayo) obj2, obj);
                return observeLocalGalleryContentChangePaginated$lambda$20;
            case 11:
                return (GeoLocation) ((tr0) obj2).invoke(obj);
            case 12:
                int i3 = MsgViewFragment.i0;
                return (MsgFromUser) ((l140) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.e) ((ayo) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.e) ((gh40) obj2).invoke(obj);
            case 15:
                return (hda) ((ni40.b) obj2).invoke(obj);
            case 16:
                return (List) ((l140) obj2).invoke(obj);
            case 17:
                return (xg60) ((ayo) obj2).invoke(obj);
            case 19:
                return (iw60) ((rte) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.b0) ((gh40) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((defpackage.v) obj2).invoke(obj);
            case 25:
                return (VKList) ((bgy) obj2).invoke(obj);
            case 26:
                float f = PrimaryActionsView.t;
                return (List) ((ie90) obj2).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ((SessionRoomsManager) this.c).getAllInRoomParticipants(new l850(yVar, 11), new rtg0(yVar, 3));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 7:
                return ((Boolean) ((po1) this.c).invoke(obj)).booleanValue();
            case 20:
                return ((Boolean) ((ayo) this.c).invoke(obj)).booleanValue();
            case 22:
                return ((Boolean) ((l140) this.c).invoke(obj)).booleanValue();
            case 24:
                return ((Boolean) ((kl60) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((d230) this.c).invoke(obj)).booleanValue();
        }
    }
}
