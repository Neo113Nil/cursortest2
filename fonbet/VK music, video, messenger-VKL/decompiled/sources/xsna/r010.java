package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import com.vk.catalog2.feature.music.holders.MusicCategoryVh;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorComponent;
import com.vk.im.engine.di.ImCommonCommandsFactoryComponent;
import com.vk.im.popup.a;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.im.ui.views.RestrictionFrescoImageViewLegacy;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mvi.core.internal.executors.ThreadType;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.ejd0;
import xsna.ghc0.i;
import xsna.tj50;
import xsna.ug30;
import xsna.vm30;
import xsna.z0d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class r010 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r010(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((MarketItemCommentsFragment) this.c).b0;
            case 1:
                ((zak0) ((su10) this.c).h).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 2:
                mc20 mc20Var = (mc20) this.c;
                int i = mc20.m1;
                return new g9w(((ImCommonCommandsFactoryComponent) m7m.d(mc20Var).mo408a(fpf0.a(ImCommonCommandsFactoryComponent.class))).w7(), ((ImCmdCoroutinesExecutorComponent) m7m.d(mc20Var).a(fpf0.a(ImCmdCoroutinesExecutorComponent.class))).g());
            case 3:
                dw20 dw20Var = (dw20) this.c;
                String str = dw20.d1;
                return new com.vk.core.ui.bottomsheet.internal.e(dw20Var);
            case 4:
                ((com.vk.im.ui.components.msg_list.a) this.c).A.u.getClass();
                SharedPreferences.Editor edit = cew.h().edit();
                edit.putBoolean("pref_cfg_chat_should_override_theme", false);
                edit.apply();
                cew.f.onNext(Boolean.FALSE);
                return s3q0.a;
            case 5:
                vm30.i iVar = (vm30.i) this.c;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures)) {
                    a.b<ug30> bVar = iVar.c;
                    if (bVar != null) {
                        bVar.setItems(Collections.singletonList(new lwb0(null, R.string.vkim_msg_action_back_to_msg_actions, null, null, R.drawable.vk_icon_arrow_left_outline_28, ug30.b.a, false, null, false, false, 1741)));
                    }
                } else {
                    czb0 czb0Var = iVar.d;
                    if (czb0Var != null) {
                        czb0Var.a(Collections.singletonList(new jwb0(null, R.string.vkim_msg_action_back_to_msg_actions, null, null, R.drawable.vk_icon_arrow_left_outline_28, ug30.b.a, false, null, 461)));
                    }
                }
                return s3q0.a;
            case 6:
                return ((fo30) this.c).a().getString(R.string.vkim_accessibility_icon_play);
            case 7:
                Context context = ((ps30) this.c).d;
                return new fk30(context != null ? context : null);
            case 8:
                MsgViewFragment msgViewFragment = (MsgViewFragment) this.c;
                int i2 = MsgViewFragment.i0;
                return up2.g(m7m.d(msgViewFragment), msgViewFragment.requireContext());
            case 9:
                MusicCategoryVh musicCategoryVh = (MusicCategoryVh) this.c;
                return new de40(musicCategoryVh.b, musicCategoryVh.c, musicCategoryVh.d);
            case 10:
                return (TextView) ((g850) this.c).a.findViewById(R.id.nativeads_advertising_text);
            case 11:
                tj50.a aVar = (tj50.a) this.c;
                ThreadType.a aVar2 = ThreadType.Companion;
                ThreadType threadType = ThreadType.STATE;
                aVar2.getClass();
                ThreadType.a.a(threadType);
                ThreadType.a.a(threadType);
                ArrayList arrayList = aVar.a;
                tj50 tj50Var = new tj50();
                tj50Var.a = arrayList;
                return tj50Var;
            case 12:
                aq50 aq50Var = (aq50) this.c;
                yix yixVar = aq50Var.b;
                if (yixVar != null) {
                    return yixVar.b(aq50Var.a);
                }
                return null;
            case 13:
                return (AttachmentMappersComponent) ((e7m) this.c).b(fpf0.a(AttachmentMappersComponent.class));
            case 14:
                return new ny60(new nl30((fx60) this.c, 8));
            case 15:
                return "internalStart() - LivePlayerImpl instance created " + ((wl80) this.c).M;
            case 16:
                String str2 = (String) this.c;
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.k(str2);
                return s3q0.a;
            case 17:
                m8a0 m8a0Var = (m8a0) this.c;
                int i3 = m8a0.v1;
                return m8a0Var.bo().i3();
            case 18:
                u1b0 u1b0Var = (u1b0) this.c;
                return new d0d0(u1b0Var.b, u1b0Var.c.getAttachedPlayer(), u1b0Var.d);
            case 19:
                ((PodcastCatalogRootVh) this.c).s.d();
                return s3q0.a;
            case 20:
                return (StoryViewerComponent) ((k7m) m7m.f((y1c0) this.c)).a(fpf0.a(StoryViewerComponent.class));
            case 21:
                return bo8.b(((rbc0) this.c).a, "is_coauthors_allowed");
            case 22:
                return ((ghc0) this.c).new i();
            case 23:
                Iterator<z0d0.b> it = ((z0d0) this.c).g.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                return s3q0.a;
            case 24:
                return ((MarketComponent) ((k7m) m7m.f((pid0) this.c)).a(fpf0.a(MarketComponent.class))).Ob();
            case 25:
                qjd0 qjd0Var = (qjd0) this.c;
                qjd0Var.a.invoke(ejd0.a.C2815a.b);
                dw20 dw20Var2 = qjd0Var.c;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                qjd0Var.c = null;
                return s3q0.a;
            case 26:
                return (TextView) ((prf0) this.c).a.findViewById(R.id.nativeads_description);
            case 27:
                RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = (RestrictionFrescoImageViewLegacy) this.c;
                int i4 = RestrictionFrescoImageViewLegacy.f0;
                restrictionFrescoImageViewLegacy.postInvalidateOnAnimation();
                return s3q0.a;
            case 28:
                ((gzs) ((zak0) ((ngg0) this.c).b).getValue()).invoke();
                return s3q0.a;
            default:
                return new gjl((evg0) this.c);
        }
    }
}
