package xsna;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetWatchTogetherVideosResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.stories.design.view.stats.tabs.info.mvi.g;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.fyw0;
import xsna.gm50;
import xsna.h4v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qjg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qjg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Drawable drawable;
        int i = this.b;
        int i2 = 14;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                rzq0 rzq0Var = (rzq0) obj;
                rzq0Var.b(new wow(((sjg0) obj2).g), ujg0.b);
                rzq0Var.a(vjg0.b);
                return s3q0.a;
            case 1:
                ((io.reactivex.rxjava3.core.b) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 2:
                ((po5) obj2).invoke((p9i0) obj);
                return s3q0.a;
            case 3:
                return new obw0(((f3l0) obj2).i, (ViewGroup) obj);
            case 4:
                fil0 fil0Var = (fil0) obj2;
                fil0Var.a.S0().C(fil0Var, (xpp) obj);
                return s3q0.a;
            case 5:
                myl0 myl0Var = (myl0) obj2;
                int intValue = ((Integer) obj).intValue();
                LayerDrawable layerDrawable = myl0Var.l;
                Drawable mutate = (layerDrawable == null || (drawable = layerDrawable.getDrawable(1)) == null) ? null : drawable.mutate();
                ColorDrawable colorDrawable = mutate instanceof ColorDrawable ? (ColorDrawable) mutate : null;
                if (colorDrawable != null) {
                    colorDrawable.setColor(intValue);
                }
                ImageView imageView = myl0Var.e;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setImageDrawable(myl0Var.l);
                ImageView imageView2 = myl0Var.e;
                ImageView imageView3 = imageView2 != null ? imageView2 : null;
                float c = cn70.c(16);
                imageView3.setClipToOutline(true);
                imageView3.setOutlineProvider(new t0w0(6, c, false, false));
                return s3q0.a;
            case 6:
                int i3 = StoryMediaPickerFragment.d0;
                ((StoryMediaPickerFragment) obj2).ko(null);
                return s3q0.a;
            case 7:
                com.vk.stories.design.view.stats.tabs.info.mvi.c cVar = (com.vk.stories.design.view.stats.tabs.info.mvi.c) obj2;
                gm50.a.a(cVar, ((g.a) obj).a, new ggb0(cVar, i2));
                return s3q0.a;
            case 8:
                ((zim0) obj2).l.performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 9:
                ((px30) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 10:
                nbn0 nbn0Var = (nbn0) obj2;
                u7n0 u7n0Var = nbn0Var.p;
                Object obj3 = nbn0Var.l;
                u7n0Var.i1((obn0) (obj3 != null ? obj3 : null));
                return s3q0.a;
            case 11:
                com.vk.movika.sdk.base.observable.a aVar = ((com.vk.voip.ui.settings.participants_view.k) obj2).l;
                if (aVar != null) {
                    aVar.invoke(j.d.C2089d.a);
                }
                return s3q0.a;
            case 12:
                return ((yks0) obj2).e(true);
            case 13:
                int i4 = VideoNewProfileHeaderViewV2.y;
                ((etv0) obj).b(false);
                ((View) obj2).performClick();
                return s3q0.a;
            case 14:
                int i5 = VideoOfflineFragment.f1;
                ((VideoOfflineFragment) obj2).Ao((List) obj);
                return s3q0.a;
            case 15:
                ImageSize Cb = ((VideoFile) obj2).getImage().Cb(((ImageScreenSize) obj).h(), true, false);
                Uri parse = Uri.parse(Cb != null ? Cb.d.d : null);
                Field field = mcr0.a;
                itg0.j(new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.e(new mh40(new u0n(parse, 4), 18)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()), io.reactivex.rxjava3.internal.functions.a.g), null, 3);
                return s3q0.a;
            case 16:
                ((VideoProfileFragmentOld) obj2).g0 = null;
                return s3q0.a;
            case 17:
                hbt0 hbt0Var = (hbt0) obj2;
                if (hbt0Var.t()) {
                    hbt0Var.A();
                } else {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    ((n1s0) b.C1208b.a().l.getValue()).getClass();
                    hbt0Var.y();
                }
                return s3q0.a;
            case 18:
                ((av20) ((ect0) obj2).m1.getValue()).setItems((List) obj);
                return s3q0.a;
            case 19:
                return ((tet0) obj2).getResources().getString(((ecr) obj).a());
            case 20:
                uut0 uut0Var = (uut0) obj2;
                IllegalStateException illegalStateException = new IllegalStateException((Throwable) obj);
                uut0Var.a.a(k5t.d);
                if (uut0Var.g) {
                    uut0Var.g = false;
                    uut0Var.i.removeCallbacksAndMessages(null);
                }
                uut0Var.d.getClass();
                com.vk.metrics.eventtracking.b.a.a(illegalStateException);
                return s3q0.a;
            case 21:
                h4v0 h4v0Var = (h4v0) obj2;
                h4v0.a aVar2 = (h4v0.a) obj;
                ix4 ix4Var = h4v0Var.c;
                StartPlayVkMixSource startPlayVkMixSource = h4v0Var.f;
                String str = startPlayVkMixSource.e;
                boolean z = h4v0Var.g;
                String str2 = aVar2.a;
                String str3 = startPlayVkMixSource.i;
                String str4 = aVar2.b;
                String zb = h4v0Var.b.b.zb();
                ix4Var.getClass();
                tfx tfxVar = new tfx("audio.getStreamMixAudios", new oq(3), new pq(2));
                tfx.o(tfxVar, "mix_id", str, 0, 0, 12);
                tfxVar.j("append", z);
                if (str2 != null) {
                    tfx.o(tfxVar, SignalingProtocol.KEY_OPTIONS, str2, 0, 0, 12);
                    tfxVar = tfxVar;
                }
                if (str4 != null) {
                    tfx.o(tfxVar, "prompt_events", str4, 0, 0, 12);
                }
                tfx.o(tfxVar, "ref", zb, 0, 0, 12);
                if (str3 != null) {
                    tfx.o(tfxVar, "entity_id", str3, 0, 0, 12);
                }
                dz2 x = yfb.x(tfxVar);
                x.n = true;
                return rsg0.w0(x);
            case 22:
                ((lgv0) obj2).un();
                return s3q0.a;
            case 23:
                lcw0 lcw0Var = (lcw0) obj2;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.j0().G0();
                VoipMainMenuFragmentBase voipMainMenuFragmentBase = lcw0Var.a;
                ng8 ng8Var = new ng8(voipMainMenuFragmentBase.getString(R.string.voip_broadcast), voipMainMenuFragmentBase.getString(R.string.voip_broadcast_label_stats), 1012);
                int i6 = StreamInfoFragment.S;
                StreamInfoFragment.a.a(voipMainMenuFragmentBase.getParentFragmentManager(), ng8Var);
                lcw0Var.c.invoke();
                return s3q0.a;
            case 24:
                VideoGetWatchTogetherVideosResponseDto videoGetWatchTogetherVideosResponseDto = (VideoGetWatchTogetherVideosResponseDto) obj;
                String f = videoGetWatchTogetherVideosResponseDto.f();
                iid iidVar = ((zcw0) obj2).c;
                List<VideoVideoFullDto> e = videoGetWatchTogetherVideosResponseDto.e();
                List<UsersUserFullDto> g = videoGetWatchTogetherVideosResponseDto.g();
                if (g == null) {
                    g = EmptyList.b;
                }
                List<GroupsGroupFullDto> d = videoGetWatchTogetherVideosResponseDto.d();
                if (d == null) {
                    d = EmptyList.b;
                }
                return new u6x0(f, iidVar.f(e, g, d), videoGetWatchTogetherVideosResponseDto.getCount());
            case 25:
                return new slw0((ViewGroup) obj, ((ulw0) obj2).i);
            case 26:
                otw0 otw0Var = (otw0) obj2;
                int i7 = otw0.i1;
                dhw0 dhw0Var = (dhw0) ((it80) obj).a;
                return Boolean.valueOf(otw0Var.Yn(dhw0Var != null ? dhw0Var.v : null));
            default:
                VoipScheduledCallSettingsFragment voipScheduledCallSettingsFragment = (VoipScheduledCallSettingsFragment) obj2;
                fyw0 fyw0Var = (fyw0) obj;
                int i8 = VoipScheduledCallSettingsFragment.T;
                if (fyw0Var.equals(fyw0.a.a)) {
                    Dialog dialog = voipScheduledCallSettingsFragment.s;
                    nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                    if (nw20Var != null) {
                        nw20Var.cancel();
                    }
                } else if (fyw0Var.equals(fyw0.b.a)) {
                    voipScheduledCallSettingsFragment.finish();
                } else if (fyw0Var instanceof fyw0.c) {
                    new uxw0(voipScheduledCallSettingsFragment.requireContext(), ((fyw0.c) fyw0Var).a, new cbt0(voipScheduledCallSettingsFragment, i2)).a();
                } else {
                    if (!(fyw0Var instanceof fyw0.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    new qyw0(voipScheduledCallSettingsFragment.requireContext(), ((fyw0.d) fyw0Var).a, new hfm0(voipScheduledCallSettingsFragment, 25)).a();
                }
                return s3q0.a;
        }
    }
}
