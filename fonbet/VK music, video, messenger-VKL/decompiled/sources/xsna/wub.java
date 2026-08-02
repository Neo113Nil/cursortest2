package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.im.Image;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.nwb;

/* compiled from: ChatProfileAchievementItemsDelegate.kt */
/* loaded from: classes2.dex */
public final class wub extends p1u0<nwb.a> {
    public final kkm a;
    public final com.vk.im.ui.components.chat_profile.a b;

    /* compiled from: ChatProfileAchievementItemsDelegate.kt */
    public static final class a extends vfz<nwb.a> {
        public final View l;
        public final ViewGroup m;
        public final ViewGroup n;
        public final ImageView o;
        public final kkm p;
        public final InterfaceC3959a q;

        /* compiled from: ChatProfileAchievementItemsDelegate.kt */
        /* renamed from: xsna.wub$a$a, reason: collision with other inner class name */
        public interface InterfaceC3959a {
            void e(EduAchievement eduAchievement);
        }

        public a(View view, ViewGroup viewGroup, ViewGroup viewGroup2, ImageView imageView, kkm kkmVar, com.vk.im.ui.components.chat_profile.a aVar) {
            super(view);
            this.l = view;
            this.m = viewGroup;
            this.n = viewGroup2;
            this.o = imageView;
            this.p = kkmVar;
            this.q = aVar;
        }

        @Override // xsna.vfz
        public final void V5() {
            this.p.e(this.o, new wa5(this, 2));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(nwb.a aVar) {
            List<EduAchievement> list = aVar.b.h;
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                EduAchievement eduAchievement = (EduAchievement) obj;
                if (i < 5) {
                    ViewGroup viewGroup = this.m;
                    VKImageView vKImageView = (VKImageView) bwt0.I(R.layout.vkim_chat_profile_adapter_achievements_list_item, viewGroup, false);
                    bwt0.i0(vKImageView, new az2(5, this, eduAchievement));
                    Image image = eduAchievement.e;
                    vKImageView.load(image != null ? image.d : null);
                    viewGroup.addView(vKImageView);
                }
                i = i2;
            }
            sa saVar = new sa(this, 22);
            ViewGroup viewGroup2 = this.n;
            bwt0.i0(viewGroup2, saVar);
            dg dgVar = new dg(this, 17);
            View view = this.l;
            bwt0.i0(view, dgVar);
            awt0.v(viewGroup2, list.size() >= 5);
            view.setClipToOutline(true);
            view.setOutlineProvider(new t0w0(6, cn70.a() * 20.0f, false, false));
            view.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e3m.f(R.attr.vk_legacy_background_content, view.getContext()), 0, 254));
            view.setPadding(cn70.b(0), cn70.b(12), cn70.b(0), cn70.b(12));
        }

        @Override // xsna.vfz
        public final void a6() {
            this.p.h(this.o);
        }
    }

    public wub(kkm kkmVar, com.vk.im.ui.components.chat_profile.a aVar) {
        this.a = kkmVar;
        this.b = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends nwb.a> b(ViewGroup viewGroup) {
        View I = bwt0.I(R.layout.vkim_chat_profile_adapter_achievements_list, viewGroup, false);
        return new a(I, (ViewGroup) I.findViewById(R.id.scrollview), (ViewGroup) I.findViewById(R.id.all_achievements), (ImageView) I.findViewById(R.id.more_icon), this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof nwb.a;
    }
}
