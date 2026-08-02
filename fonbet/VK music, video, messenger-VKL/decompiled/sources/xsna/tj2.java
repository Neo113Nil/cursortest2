package xsna;

import android.graphics.drawable.ColorDrawable;
import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.ecomm.clipproductattaches.di.ClipProductAttachesComponentImpl;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.stickers.views.gift.AnimatedGiftView;
import com.vk.story.viewer.impl.presentation.stories.StoryViewActivity;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkEditComponentVkApp;
import java.util.List;
import one.video.controls20.SimpleControlsView;
import xsna.nri;
import xsna.nzl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tj2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ tj2(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                int i = AnimatedGiftView.g;
                return s3q0.a;
            case 1:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 2:
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                ColorDrawable colorDrawable = new ColorDrawable(-16777216);
                colorDrawable.setAlpha(0);
                return colorDrawable;
            case 3:
                qcy<Object>[] qcyVarArr = ClipProductAttachesComponentImpl.b;
                return new sad();
            case 4:
                return new ngj0();
            case 5:
                return new dgf();
            case 6:
                qcy<Object>[] qcyVarArr2 = ClipsUploadSdkEditComponentVkApp.h;
                return new lef();
            case 7:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_DEVICE_VOLUME;
                clipsFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(clipsFeatures));
            case 8:
                return new i1t0(true, bo.h());
            case 9:
                if (!androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.a = new nri.a(nri.c.a, new nri.b(true));
                }
                return s3q0.a;
            case 10:
                int i2 = CreateChatTransferFragment.F0;
                return new sbv0();
            case 11:
                return new StringBuilder();
            case 12:
                StoriesFeatures storiesFeatures = StoriesFeatures.VERTICALIZATION;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 13:
                return new v4u();
            case 14:
                List<Integer> list = a500.z;
                return "request for lp server";
            case 15:
                return Boolean.valueOf(o25.b(o25.a()));
            case 16:
                return new vfa0();
            case 17:
                int i3 = PlayerService.t;
                return Boolean.valueOf(MusicFeatures.AUDIO_SERVICE_NO_DELAY_STOP.h());
            case 18:
                return s3q0.a;
            case 19:
                return s3q0.a;
            case 20:
                int i4 = RestoreSearchFragment.h0;
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 21:
                return new e3a();
            case 22:
                int i5 = SimpleControlsView.S;
                return new SimpleControlsView.l();
            case 23:
                qcy<Object>[] qcyVarArr4 = StoryEditorComponentImpl.h;
                return new z1m0();
            case 24:
                int i6 = StoryViewActivity.H;
                return x260.b(com.vk.core.utils.newtork.b.c());
            case 25:
                return Boolean.valueOf(fxc0.B().J().X1());
            case 26:
                return s3q0.a;
            case 27:
                return Integer.valueOf((int) ((Number) x5r0.b.getValue()).floatValue());
            case 28:
                return new a390();
            default:
                return new i1t0(true, bo.h());
        }
    }

    public /* synthetic */ tj2(nri nriVar) {
        this.b = 9;
    }
}
