package xsna;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.preference.Preference;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.apps.BuildInfo;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.photos.root.presentation.e;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vkontakte.android.R;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import java.util.List;
import kotlin.Pair;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import ru.ok.android.webrtc.PeerConnectionClient;
import xsna.c8p;
import xsna.eeu0;
import xsna.h7u0;
import xsna.ihz;
import xsna.jza0;
import xsna.qlh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj4 implements io.reactivex.rxjava3.functions.l, HeightCalculatorFactory.GetTabCountFn, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, Preference.c, pcs, ihz.a, RtpReceiver.Observer, PhotoFlowToolbarView.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rj4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.c
    public void a0() {
        ((com.vk.photos.root.presentation.h) this.c).e.invoke(e.a.a);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (nd4) ((af2) obj2).invoke(obj);
            case 1:
            case 5:
            case 8:
            case 9:
            case 11:
            case 12:
            case 26:
            case 27:
            default:
                return (NewsEntry) ((yu1) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((r97) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((h5) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.e) ((l2e) obj2).invoke(obj);
            case 6:
                int i2 = CommunityAddressesFragment.E0;
                return (Bitmap) ((af2) obj2).invoke(obj);
            case 7:
                return ((qlh.c) obj2).invoke(obj);
            case 10:
                return ((yu1) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((yad) obj2).invoke(obj);
            case 14:
                return (SuperAppAnimationConfig) ((yad) obj2).invoke(obj);
            case 15:
                return (dmt) ((af2) obj2).invoke(obj);
            case 16:
                return (Boolean) ((af2) obj2).invoke(obj);
            case 17:
                return (u820) ((b95) obj2).invoke(obj);
            case 18:
                return (Boolean) ((af2) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((yu1) obj2).invoke(obj);
            case 20:
                return (List) ((y510) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.e) ((v320) obj2).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.b0) ((y510) obj2).invoke(obj);
            case 23:
                return (List) ((y510) obj2).invoke(obj);
            case 24:
                int i3 = el70.g1;
                return (Boolean) ((y510) obj2).invoke(obj);
            case 25:
                return (NewsEntry) ((tbx) obj2).invoke(obj);
            case 28:
                return (VKList) ((y510) obj2).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        final DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        final long j = BuildInfo.h() ? com.vk.core.preference.Preference.j().getLong("__dbg_lp_sync_start_delay_ms", 0L) : 0L;
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
        c2801a.b = "Delay getDiff/getDiffContent start";
        c2801a.s = new wzs(debugDevSettingsFragment, j) { // from class: xsna.h3l
            public final /* synthetic */ long b;

            {
                this.b = j;
            }

            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                EditText editText = (EditText) obj;
                TextView textView = (TextView) obj2;
                String[] strArr2 = DebugDevSettingsFragment.t0;
                editText.setInputType(2);
                editText.setHint("Delays (ms)");
                long j2 = this.b;
                editText.setText(j2 != 0 ? defpackage.k0.a(j2, "") : "");
                editText.addTextChangedListener(new u4l(textView));
                return null;
            }
        };
        c2801a.c(R.string.ok, new com.vk.movika.sdk.android.defaultplayer.control.l(debugDevSettingsFragment, 2), true);
        c2801a.g();
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).onCues((List) this.c);
    }

    @Override // org.webrtc.RtpReceiver.Observer
    public void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType) {
        ((PeerConnectionClient) this.c).a(mediaType);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        c8p c8pVar = (c8p) this.c;
        c8p.b bVar = c8p.n1;
        q7p feature = c8pVar.getFeature();
        qcy<Object>[] qcyVarArr = ph.n1;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("database_result", School.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("database_result");
            if (!(parcelable3 instanceof School)) {
                parcelable3 = null;
            }
            parcelable = (School) parcelable3;
        }
        feature.C(new a.k((School) parcelable));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((yad) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((ug4) this.c).invoke(obj, obj2);
    }
}
