package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionViewHolder;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.search.params.api.VkGroupsSearchParams;
import xsna.awr0;
import xsna.sj40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class cv3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cv3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                vao.a((Context) ((dv3) this.c).b, (String) this.d, (String) this.e, "text/plain");
                break;
            case 1:
                MusicDynamicRestriction musicDynamicRestriction = (MusicDynamicRestriction) this.c;
                com.vk.music.notifications.inapp.b.f(sj40.a.a(musicDynamicRestriction.c, musicDynamicRestriction.b, musicDynamicRestriction.d, (rj40) this.d), null, (DialogInterface.OnDismissListener) this.e, 10);
                break;
            case 2:
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) this.c;
                Activity activity = (Activity) this.d;
                CommunitiesCatalogFragment communitiesCatalogFragment = (CommunitiesCatalogFragment) this.e;
                bpn0 bpn0Var = communitiesCatalogRootVh.H;
                VkGroupsSearchParams vkGroupsSearchParams = communitiesCatalogRootVh.C;
                if (((Boolean) bpn0Var.getValue()).booleanValue()) {
                    ((xsh0) communitiesCatalogRootVh.G.getValue()).a(activity.getBaseContext(), communitiesCatalogFragment.getChildFragmentManager(), vkGroupsSearchParams);
                } else {
                    ((cpu) communitiesCatalogRootVh.b0.getValue()).c(activity, communitiesCatalogFragment.getChildFragmentManager(), vkGroupsSearchParams);
                }
                break;
            case 3:
                izs izsVar = (izs) this.c;
                ((wh50) this.e).setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                izsVar.invoke(this.d);
                break;
            case 4:
                GenreActionViewHolder genreActionViewHolder = (GenreActionViewHolder) this.c;
                ComposeView composeView = (ComposeView) this.d;
                UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) this.e;
                nda.e(genreActionViewHolder.c.b.b, composeView.getContext(), genreActionViewHolder.b, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, null, null, genreActionViewHolder.d, 112);
                break;
            case 5:
                ((izs) this.c).invoke(new fcq0(((acq0) this.d).b, ((bdq0) this.e).h));
                break;
            default:
                ((izs) this.c).invoke(new awr0.e(((dqt0) this.d).b, p490.C((tny) ((bpf0) this.e).a())));
                break;
        }
        return s3q0.a;
    }
}
