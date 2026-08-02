package xsna;

import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.catalog2.feature.music.holders.MusicTrackVh;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.ui.fragments.SimpleDialogsFilterFragment;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.newsfeed.common.recycler.holders.clips.ClipActionButtonStateRepository;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.text.Regex;
import xsna.f8r;
import xsna.k840;
import xsna.oab0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class iz3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ iz3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new float[3];
            case 1:
                return new com.vk.music.track.a();
            case 2:
                return new ne6();
            case 3:
                return Boolean.valueOf(MusicFeatures.AUDIO_NEW_DOWNLOADED_FILTERS.h());
            case 4:
                return new Regex("^[+]?[\\d\\s()-]*$");
            case 5:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 6:
                return f8r.a.a;
            case 7:
                return new qmr();
            case 8:
                return new p4r();
            case 9:
                int i = FriendsImportFragment.a0;
                return new zi50();
            case 10:
                return new com.vk.ecomm.market.good.a();
            case 11:
                return dhr0.t.b(R.drawable.vk_icon_sort_outline_24, R.attr.vk_ui_icon_primary);
            case 12:
                return s3q0.a;
            case 13:
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 14:
                return Boolean.valueOf(MusicFeatures.AUDIO_ARTIST_CONCERTS_INFORMER.h());
            case 15:
                Set<String> set = MusicTrackVh.v;
                return new ms1(new com.vk.music.track.a(), new a34(k840.a.i, 5));
            case 16:
                return new xu50();
            case 17:
                return new dui();
            case 18:
                qcy<Object>[] qcyVarArr = NewsfeedMappersComponentImpl.o;
                return new b590();
            case 19:
                return new i1t0(true, bo.h());
            case 20:
                int i2 = PhotoVideoAttachActivity.g0;
                return s3q0.a;
            case 21:
                return oab0.a.a();
            case 22:
                PlaylistScreenFragmentInternalComponent.a aVar = PlaylistScreenFragmentInternalComponent.x;
                return new xba(UiMeasuringScreen.VIDEO_CATALOG_CHANNEL, PerformanceScoreProduct.VIDEO_CHANNEL);
            case 23:
                hhd0 hhd0Var = znk0.o;
                hhd0 hhd0Var2 = hhd0Var != null ? hhd0Var : null;
                yeg0 a = hhd0Var2.a();
                u6g0 u6g0Var = (u6g0) hhd0Var2.b;
                return new ltt(a, new fqt(u6g0Var.a()), new hqt(u6g0Var.a()));
            case 24:
                dhr0.a.getClass();
                return new brj0(2, 0, dhr0.t.b(R.drawable.vk_icon_add_square_outline_28, R.attr.vk_ui_icon_accent), R.string.modal_dialog_option_subscribe, null, false, false, null, 0, null, null, null, null, null, 131058);
            case 25:
                return new ClipActionButtonStateRepository();
            case 26:
                bpn0 bpn0Var = o25.a;
                return ((b25) (bpn0Var != null ? bpn0Var : null).getValue()).L();
            case 27:
                return s3q0.a;
            case 28:
                return new qxq();
            default:
                qcy<Object>[] qcyVarArr2 = SimpleDialogsFilterFragment.Y;
                return Boolean.valueOf(o25.b(o25.a()));
        }
    }

    public /* synthetic */ iz3(Object obj, int i) {
        this.b = i;
    }
}
