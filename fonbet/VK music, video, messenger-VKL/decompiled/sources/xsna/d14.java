package xsna;

import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.comments.impl.di.CommentsComponentImpl;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.profile.community.api.component.CommunityComponentStub;
import com.vk.sharing.core.picker.PickingImpl;
import com.vk.sharing.im_engine_impl.di.SharingImEngineScopedComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Pair;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d14 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ d14(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        int i = 2;
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new ozr0(fxc0.B().J().a());
            case 2:
                int i2 = BaseAttachPickerFragment.y0;
                return new BaseAttachPickerFragment.h();
            case 3:
                return s3q0.a;
            case 4:
                return new r9a(new bpn0(new l63(5)), new ida[0]);
            case 5:
                qcy<Object>[] qcyVarArr = ClipsPlaylistsComponentImpl.h;
                return new gue();
            case 6:
                return new j8h0();
            case 7:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return new l5f();
            case 8:
                return new h170();
            case 9:
                qcy<Object>[] qcyVarArr3 = CommentsComponentImpl.g;
                return new veg();
            case 10:
                qcy<Object>[] qcyVarArr4 = CommunityComponentStub.c;
                return new f0i();
            case 11:
                return new mkj(247);
            case 12:
                return new gko(R.drawable.vk_icon_lego_search_outline_28);
            case 13:
                return "Ignoring request to startLongPoll for ImEnvironment. Reason: runner not started";
            case 14:
                return new Regex("/product([-0-9]+)_([0-9]+)(?:_([-a-zA-Z0-9]+))?");
            case 15:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.j0();
            case 16:
                return new ko1();
            case 17:
                return new zy10();
            case 18:
                return new zzw(0);
            case 19:
                Features.Type type = Features.Type.FEATURE_FEED_ENABLE_RECYCLER_PROFILING;
                type.getClass();
                if (!com.vk.toggle.b.A.a(type)) {
                    return null;
                }
                asu0.a.getClass();
                return new com.vk.stat.recycler.d(new com.vk.stat.recycler.c(asu0.o(), "newsfeed"));
            case 20:
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                return new la60();
            case 23:
                qcy<Object>[] qcyVarArr5 = PostingComponentImpl.j;
                return new zj1(new aha0());
            case 24:
                return e43.l(new Pair("poll", Collections.singletonList("full")), new Pair("photo", Collections.singletonList("compact")));
            case 25:
                qcy<Object>[] qcyVarArr6 = SharingImEngineScopedComponentImpl.g;
                return new PickingImpl();
            case 26:
                return new int[2];
            case 27:
                int i3 = com.vk.clips.sdk.shared.item.static_ads.c.F;
                return Integer.valueOf(R.layout.fullscreen_static_ads_item_controls);
            case 28:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i4 = com.vk.toggle.b.A.i(StoriesFeatures.ST_VIDEO_PRELOADER_PART);
                if (i4 != null && (g = i4.g()) != null) {
                    i = g.optInt("max_story_in_heap");
                }
                return Integer.valueOf(i);
            default:
                return new u1r0();
        }
    }
}
