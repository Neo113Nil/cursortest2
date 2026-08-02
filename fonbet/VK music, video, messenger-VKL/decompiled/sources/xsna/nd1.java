package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.HandlerThread;
import android.util.LruCache;
import android.widget.FrameLayout;
import com.google.gson.GsonBuilder;
import com.vk.api.generated.base.dto.BaseLinkProductCategoryDto;
import com.vk.api.generated.core.JsonStringDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDelayedPublishListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridLikedClipsListFragment;
import com.vk.common.api.generated.GsonHolder;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.notifications.di.NotificationsComponentImpl;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.p2i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class nd1 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nd1(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        p2i0 a;
        switch (this.b) {
            case 0:
                AlbumChooseFragmentInternalComponent.a aVar = AlbumChooseFragmentInternalComponent.g;
                return new bee0(new uft0(), new zqu(), new dy2());
            case 1:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_LINKVH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 2:
                return new vvb0(12);
            case 3:
                return ((StoriesSettingsComponent) ((k7m) m7m.f(nf9.b)).a(fpf0.a(StoriesSettingsComponent.class))).B7();
            case 4:
                List<String> list = p2i0.b;
                a = p2i0.a.a(p2i0.b);
                a.b(new Regex("(\\[(?:70001|70002).*\"text\":)(\"(?:\\\\\"|[^\"])*\")", RegexOption.IGNORE_CASE), new ob(7));
                return a;
            case 5:
                cvk.u(R.string.error, false);
                return s3q0.a;
            case 6:
                int i = ClipsGridDelayedPublishListFragment.l0;
                return 0;
            case 7:
                int i2 = ClipsGridLikedClipsListFragment.i0;
                return 0;
            case 8:
                return new u1r0();
            case 9:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                return Boolean.valueOf(com.vk.libvideo.autoplay.e.b());
            case 10:
                return Boolean.valueOf(fxc0.B().J().X1());
            case 11:
                return new LruCache(100);
            case 12:
                return new FrameLayout.LayoutParams(-1, -1);
            case 13:
                nto b = com.vk.toggle.d.f.b();
                if (b == null) {
                    b = new nto(false);
                }
                return Boolean.valueOf(b.a);
            case 14:
                return s3q0.a;
            case 15:
                return new gc10();
            case 16:
                return new GsonBuilder().registerTypeAdapter(BaseLinkProductCategoryDto.class, new BaseLinkProductCategoryDto.Deserializer()).registerTypeAdapter(GroupsGroupDonutDescriptionDto.class, new GroupsGroupDonutDescriptionDto.Deserializer()).registerTypeAdapter(UserId.class, new UserId.GsonSerializer(false)).registerTypeAdapter(JsonStringDto.class, new JsonStringDto.Deserializer()).registerTypeAdapter(Boolean.class, new GsonHolder.BooleanGsonSerializer()).registerTypeAdapter(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer()).disableHtmlEscaping().create();
            case 17:
                return s3q0.a;
            case 18:
                return kay.b;
            case 19:
                int i3 = LegoStickersBottomSheetDialog.d0;
                return new rdf0();
            case 20:
                int i4 = LiveView.p0;
                return new ozr0(fxc0.B().J().a());
            case 21:
                pqo pqoVar = auz.a;
                return Boolean.TRUE;
            case 22:
                List<Integer> list2 = a500.z;
                return "request for lp history";
            case 23:
                return new PorterDuffColorFilter(e43.a.getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_ATOP);
            case 24:
                return Boolean.valueOf(MusicFeatures.OFFLINE_PENDING_UI.h());
            case 25:
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 26:
                qcy<Object>[] qcyVarArr2 = NotificationsComponentImpl.b;
                return new sj70();
            case 27:
                HandlerThread handlerThread = new HandlerThread("ov-playback-thread", -16);
                handlerThread.start();
                return handlerThread;
            case 28:
                return new d0b0();
            default:
                return s3q0.a;
        }
    }
}
