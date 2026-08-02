package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.utils.newtork.d;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import xsna.dd9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class oan0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ oan0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 1:
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                int i = UserProfileHeaderView.G;
                ((etv0) obj).b(false);
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 6:
                l31 l31Var = (l31) ((it80) obj).a;
                return l31Var != null ? new VideoAdvertisementsRepository.a.d(l31Var) : new VideoAdvertisementsRepository.a.C1194a(true);
            case 7:
                return Boolean.valueOf(dd80.f((UIBlockList) obj, new l140(26)) != null);
            case 8:
                return Boolean.valueOf(((com.vk.core.utils.newtork.d) obj) instanceof d.a);
            case 9:
                return Boolean.valueOf(((UIBlock) obj) instanceof UIBlockVideoAlbum);
            case 10:
                qgi0.r((tgi0) obj, "topBarLeftIcon");
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                qgi0.r((tgi0) obj, "vk_top_bar_search_title");
                return s3q0.a;
            default:
                return Boolean.valueOf(((dd9.a) obj) instanceof dd9.a.f);
        }
    }

    public /* synthetic */ oan0(ToolbarVh toolbarVh) {
        this.b = 1;
    }
}
