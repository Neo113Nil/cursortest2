package xsna;

import androidx.preference.Preference;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoFile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.b9o;
import xsna.eeu0;
import xsna.h7u0;
import xsna.ig3;
import xsna.ihz;
import xsna.jza0;
import xsna.osh;
import xsna.t8g0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z7 implements io.reactivex.rxjava3.core.s, PhotoFlowToolbarView.c, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, Preference.c, io.reactivex.rxjava3.functions.d, t8g0.b, ihz.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.t8g0.b
    public void a(t8g0 t8g0Var, int i) {
        b9o b9oVar = (b9o) this.c;
        if (b9oVar.i != i) {
            b9oVar.i = i;
            b9oVar.e++;
            b9oVar.b.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean i2 = b9oVar.i();
        Iterator<b9o.c> it = b9oVar.c.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (i2) {
            b9oVar.b();
        }
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.c
    public void a0() {
        switch (this.b) {
            case 1:
                xn50.a.c(((com.vk.photos.root.albumdetails.presentation.c) this.c).c, a.f.b);
                break;
            default:
                ((nj3) this.c).d.invoke(ig3.b.b);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return (AlbumsRepository.a) ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.a) this.c).invoke(obj);
            case 3:
                return (al60) ((fb) this.c).invoke(obj);
            case 4:
            case 9:
            case 11:
            case 15:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                return (p8w) ((q8w) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((z14) this.c).invoke(obj);
            case 6:
                return (Boolean) ((da6) this.c).invoke(obj);
            case 7:
                return (bwr0) ((pt) this.c).invoke(obj);
            case 8:
                return (t69) ((e15) this.c).invoke(obj);
            case 10:
                return (adp0) ((pt) this.c).invoke(obj);
            case 12:
                return (Integer) ((fb) this.c).invoke(obj);
            case 13:
                return (cc50) ((fb) this.c).invoke(obj);
            case 14:
                return (List) ((pt) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.t) ((jeh) this.c).invoke(obj);
            case 17:
                return ((osh.c) this.c).invoke(obj);
            case 18:
                return (f3i) ((fre) this.c).invoke(obj);
            case 19:
                ((pt) this.c).invoke(obj);
                return 0;
            case 25:
                return (SdkVideoFile) ((fre) this.c).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        int i = com.vk.core.preference.Preference.j().getInt("__dbg_music_ad_slot_id", 0);
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
        c2801a.b = "Music ad slot id";
        c2801a.s = new p3l(debugDevSettingsFragment, i);
        c2801a.c(R.string.ok, new te1(debugDevSettingsFragment, 3), true);
        c2801a.g();
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).y((vr10) this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.bd70, xsna.d8] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final VideoFile videoFile = (VideoFile) this.c;
        final ?? r1 = new bd70() { // from class: xsna.d8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                NewsEntry newsEntry = (NewsEntry) obj;
                if ((newsEntry instanceof c6z) && newsEntry.zb() == 2) {
                    String Bb = newsEntry.Bb();
                    StringBuilder sb = new StringBuilder();
                    VideoFile videoFile2 = VideoFile.this;
                    sb.append(videoFile2.I0());
                    sb.append('_');
                    sb.append(videoFile2.o0());
                    if (epx.f(Bb, sb.toString())) {
                        c6z c6zVar = (c6z) newsEntry;
                        if (c6zVar.E1() >= 0) {
                            videoFile2.P2(c6zVar.E1());
                            rVar.onNext(videoFile2);
                        }
                    }
                }
            }
        };
        p870.f().b(102, r1);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.f8
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                p870.f().g(d8.this);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 9:
                int i2 = CallParticipantsFragment.W;
                return ((Boolean) ((pt) obj2).invoke(obj)).booleanValue();
            case 11:
                int i3 = ChannelFragment.a1;
                return ((Boolean) ((pt) obj2).invoke(obj)).booleanValue();
            case 21:
                return ((Boolean) ((pt) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((i1w) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((log) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 15:
                return (List) ((hue) this.c).invoke(obj, obj2);
            case 26:
                return (kqs) ((log) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((wzs) this.c).invoke(obj, obj2);
        }
    }
}
