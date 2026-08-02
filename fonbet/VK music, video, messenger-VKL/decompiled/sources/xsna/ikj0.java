package xsna;

import android.content.Context;
import android.os.Parcelable;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.dto.video.VideoListWithTotalCount;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ikj0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Parcelable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ikj0(int i, StoryPrivacyType storyPrivacyType, svk0 svk0Var, vfm0 vfm0Var) {
        this.d = vfm0Var;
        this.e = storyPrivacyType;
        this.c = i;
        this.f = svk0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((kkj0) this.d).b((UIBlockVideoAlbum) ((UIBlock) this.e), (n4t0) ((CatalogConfiguration) this.f), this.c, (VideoListWithTotalCount) obj);
                break;
            default:
                final vfm0 vfm0Var = (vfm0) this.d;
                final StoryPrivacyType storyPrivacyType = (StoryPrivacyType) this.e;
                final svk0 svk0Var = (svk0) this.f;
                ((Boolean) obj).getClass();
                u1m0 u1m0Var = (u1m0) vfm0Var.e.getValue();
                Context context = vfm0Var.b.getContext();
                hed0 hed0Var = new hed0(storyPrivacyType == null ? StoryPrivacyType.ALL : storyPrivacyType, storyPrivacyType, vfm0Var.a().j());
                g9m0 a = vfm0Var.a();
                final int i = this.c;
                u1m0Var.a(context, hed0Var, a, true, new zzs() { // from class: xsna.sfm0
                    @Override // xsna.zzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        vfm0Var.b(i, storyPrivacyType, (StoryPrivacyType) obj2, svk0Var);
                        return s3q0.a;
                    }
                });
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ikj0(kkj0 kkj0Var, UIBlock uIBlock, CatalogConfiguration catalogConfiguration, int i) {
        this.d = kkj0Var;
        this.e = uIBlock;
        this.f = catalogConfiguration;
        this.c = i;
    }
}
