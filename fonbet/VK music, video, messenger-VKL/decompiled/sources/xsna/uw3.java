package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.camera.editor.common.di.CommonEditorComponentImpl;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponentImpl;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.fave.di.FaveComponentImpl;
import com.vk.httpexecutor.api.utils.debug.FakeNetworkConditions;
import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.MediaPipelineComponentVkApp;
import java.util.EnumSet;
import java.util.List;
import java.util.regex.Pattern;
import xsna.c8p;
import xsna.k840;
import xsna.r1r0;
import xsna.tzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class uw3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ uw3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return "Assertion failed";
            case 1:
                return new ix4();
            case 2:
                List l = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.DOMAIN, UsersFieldsDto.IS_NFT);
                if ((59 & 4) != 0) {
                    l = null;
                }
                return r1r0.a.a(null, null, l, null, null);
            case 3:
                return new ots();
            case 4:
                int i = BuyMusicSubscriptionButton.z;
                ryw rywVar = k840.a.b;
                return (ys8) (rywVar != null ? rywVar : null).invoke(Boolean.FALSE);
            case 5:
                return new rd9();
            case 6:
                return new a9a();
            case 7:
                return "Error on init load of suggested channels.";
            case 8:
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr = ClipsCoauthorsComponentImpl.d;
                return new kmd();
            case 10:
                qcy<Object>[] qcyVarArr2 = CommonEditorComponentImpl.h;
                return new m3n0();
            case 11:
                ComFeatures comFeatures = ComFeatures.COM_ADDRESSES_IN_DETAILS_MODAL;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 12:
                ComFeatures.COM_ADDRESSES_IN_DETAILS_MODAL.getClass();
                return Boolean.valueOf(!com.vk.toggle.b.A.a(r0));
            case 13:
                return new czm();
            case 14:
                c8p.b bVar = c8p.n1;
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 15:
                qcy<Object>[] qcyVarArr3 = FaveComponentImpl.e;
                return enq.a;
            case 16:
                return new bcg0();
            case 17:
                return dkw.a;
            case 18:
                return Pattern.compile("((\\+)|(?:011(?:\\s|-)?)?)?\\d{1,3}[\\s]?(?:([\\-(.])?\\d{1,4}([\\-).])?[ ]?){8}(([\\-.])?\\d{1,4})", 66);
            case 19:
                return s3q0.a;
            case 20:
                qcy<Object>[] qcyVarArr4 = MediaPipelineComponentVkApp.d;
                return new l9(18);
            case 21:
                return s3q0.a;
            case 22:
                com.vk.core.view.shimmer.a aVar = new com.vk.core.view.shimmer.a();
                Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
                abg0 abg0Var = dhr0.t;
                cVar.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
                cVar.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
                aVar.b(((Shimmer.c) cVar.d()).a());
                return aVar;
            case 23:
                return new u740();
            case 24:
                return new s550();
            case 25:
                return k840.a.c();
            case 26:
                return s3q0.a;
            case 27:
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 28:
                tzp0.c.a aVar2 = rt40.s1;
                return s3q0.a;
            default:
                return EnumSet.noneOf(FakeNetworkConditions.class);
        }
    }
}
