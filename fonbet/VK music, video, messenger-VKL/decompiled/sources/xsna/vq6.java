package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.VideoFile;
import com.vk.dto.hints.HintId;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.impl.photoviewer.di.MarketPhotoviewerComponentImpl;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.user.impl.ui.UserProfileAction;
import xsna.e8v0;
import xsna.ljh;
import xsna.nzg;
import xsna.o9t;
import xsna.omt0;
import xsna.pb60;
import xsna.sqt0;
import xsna.tja0;
import xsna.tzp0;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class vq6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vq6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Context mo2getContext;
        ebs0 videoClickActionCallback;
        int i = this.b;
        int i2 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                s38 s38Var = (s38) obj2;
                String str = (String) obj;
                FragmentImpl m = s38Var.g.m();
                if (m != null && (mo2getContext = m.mo2getContext()) != null) {
                    s38Var.d.c(mo2getContext, str);
                }
                break;
            case 2:
                break;
            case 3:
                int i3 = CommunitiesCatalogFragment.T;
                ((h7v) obj2).b(((HintId) obj).getId());
                break;
            case 4:
                nzg.a.b bVar = (nzg.a.b) obj;
                ww50 v = s200.v(((nzg) obj2).requireContext());
                if (v != null) {
                    v.S(bVar);
                }
                break;
            case 5:
                s5h s5hVar = (s5h) obj2;
                s5hVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction((CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType) obj, (z4h.a) s5hVar.m, Integer.valueOf(((wak0) s5hVar.o).getIntValue())));
                s5hVar.A6(false);
                break;
            case 6:
                ljh.b bVar2 = (ljh.b) obj2;
                bVar2.o.invoke((f5u) obj, Integer.valueOf(bVar2.getAbsoluteAdapterPosition()));
                break;
            case 7:
                ((iyp) obj2).a((pk50) obj);
                break;
            case 8:
                vdl vdlVar = (vdl) obj2;
                com.vk.movika.sdk.base.ui.r rVar = (com.vk.movika.sdk.base.ui.r) obj;
                VkContextMenu vkContextMenu = vdlVar.h;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                vdlVar.h = null;
                rVar.invoke();
                break;
            case 9:
                break;
            case 10:
                DialogItemView dialogItemView = (DialogItemView) obj2;
                AttributeSet attributeSet = (AttributeSet) obj;
                if (!dialogItemView.c) {
                    break;
                } else {
                    break;
                }
            case 11:
                rw30.i1((rw30) obj2, ((lvm) obj).q, 2);
                break;
            case 12:
                ((wmf) ((hoz) obj2).a).Cb((VideoFile) obj);
                break;
            case 13:
                qcy<Object>[] qcyVarArr = MarketPhotoviewerComponentImpl.c;
                break;
            case 14:
                pa20 pa20Var = (pa20) obj;
                break;
            case 15:
                ((pb60.b) obj2).b.b((buz) obj, false);
                break;
            case 16:
                mo60 mo60Var = (mo60) obj2;
                break;
            case 17:
                o6a0 o6a0Var = (o6a0) obj2;
                break;
            case 18:
                ((tja0) obj2).g((tja0.e) obj);
                break;
            case 19:
                eeb0 eeb0Var = (eeb0) obj2;
                l0u0 l0u0Var = (l0u0) obj;
                View view = eeb0Var.i;
                if (!bwt0.K(view)) {
                    view = eeb0Var.j;
                }
                x7l0 x7l0Var = x7l0.b;
                break;
            case 20:
                ((pfd0) obj2).q.invoke((UserProfile) obj);
                break;
            case 21:
                izs izsVar = (izs) obj;
                uet uetVar = ((w7t) obj2).b;
                if (uetVar != null) {
                    izsVar.invoke(new o9t.a(uetVar));
                }
                break;
            case 22:
                Object obj3 = (Context) obj2;
                com.vk.newsfeed.impl.views.c cVar = (com.vk.newsfeed.impl.views.c) obj;
                tzp0.c.a aVar = com.vk.newsfeed.impl.views.a.l1;
                if (obj3 instanceof ey50) {
                    ((ey50) obj3).Y().H(cVar);
                }
                break;
            case 23:
                ((izs) obj2).invoke((String) obj);
                break;
            case 24:
                break;
            case 25:
                ((slq0) obj2).a(new UserProfileAction.s.c.a.d(new xq70((VkButton) obj, 19)));
                break;
            case 26:
                ((izs) obj2).invoke(new omt0.e(((vmt0) obj).b));
                break;
            case 27:
                sqt0 sqt0Var = (sqt0) obj;
                VideoFile videoFile = ((sqt0.i) obj2).a;
                if (videoFile != null && (videoClickActionCallback = sqt0Var.getVideoClickActionCallback()) != null) {
                    videoClickActionCallback.bk(new v0t0(videoFile));
                }
                break;
            default:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj2;
                etv0 etv0Var = (etv0) obj;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.i.b);
                }
                etv0Var.b(true);
                break;
        }
        return s3q0.a;
    }
}
