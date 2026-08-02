package xsna;

import android.graphics.drawable.StateListDrawable;
import android.widget.TextView;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.contacts.ContactSyncState;
import com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.home.HomeFragment2;
import com.vk.log.L;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.R;
import java.util.ArrayList;
import one.video.exo.codecs.DecoderSupportInfo;
import xsna.gko;
import xsna.jns;
import xsna.nbx;
import xsna.uns;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ncg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ncg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                return ((AttachmentMappersComponent) m7m.d((CommentThreadFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 1:
                return ((xeg) obj).i;
            case 2:
                int i2 = com.vk.profile.community.details.impl.contacts.b.m1;
                return ((SearchParamsComponent) m7m.d((com.vk.profile.community.details.impl.contacts.b) obj).a(fpf0.a(SearchParamsComponent.class))).be();
            case 3:
                int i3 = CommunityCheckListFragment.Y;
                return ((BridgeComponent) m7m.d((CommunityCheckListFragment) obj).a(fpf0.a(BridgeComponent.class))).p().e();
            case 4:
                c1h c1hVar = (c1h) obj;
                return Float.valueOf(((Number) c1hVar.n.getValue()).floatValue() * (c1hVar.x() + c1hVar.l));
            case 5:
                elh elhVar = (elh) obj;
                Services services = (Services) elhVar.t;
                if (services != null) {
                    elhVar.E.b(services);
                }
                return s3q0.a;
            case 6:
                int i4 = CommunityProfileFragment.k0;
                return new znh(((CommunityProfileFragment) obj).requireContext());
            case 7:
                vuh vuhVar = (vuh) obj;
                if (!jjc.b()) {
                    vuhVar.q6();
                }
                return s3q0.a;
            case 8:
                ((y89) obj).invoke(CommunityProfileAction.e.i.f.b);
                return s3q0.a;
            case 9:
                return (TextView) ((s5i) obj).a.findViewById(R.id.nativeads_rating);
            case 10:
                L.A("Rooms " + ((v1j.n) obj).b + " wes removed");
                return s3q0.a;
            case 11:
                gzs gzsVar = (gzs) obj;
                com.vk.contacts.c.b.I0(true);
                com.vk.contacts.c.i(ContactSyncState.PERMITTED);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 12:
                int ceil = (int) Math.ceil(((a7k) obj).f.getDividerHeight());
                return Integer.valueOf(ceil >= 1 ? ceil : 1);
            case 13:
                ((gzs) ((mtk0) obj).getValue()).invoke();
                return s3q0.a;
            case 14:
                return Boolean.valueOf(DecoderSupportInfo.b(((DecoderSupportInfo) obj).a, DecoderSupportInfo.CodecType.SW));
            case 15:
                ((jdo0) obj).close();
                return s3q0.a;
            case 16:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj).e;
                if (efmVar != null) {
                    efmVar.n();
                }
                return s3q0.a;
            case 17:
                rdi.y((DzenArticleInlineActor) obj, new ol(22));
                return s3q0.a;
            case 18:
                a5 a5Var = ((r2r) obj).e;
                if (a5Var != null) {
                    a5Var.invoke(Boolean.FALSE);
                }
                return s3q0.a;
            case 19:
                return go9.b("Can not write event ", ((yi80) obj).a);
            case 20:
                com.vk.newsfeed.common.recycler.holders.a aVar = (com.vk.newsfeed.common.recycler.holders.a) obj;
                StateListDrawable stateListDrawable = new StateListDrawable();
                int[] iArr = {android.R.attr.state_selected};
                gko.b bVar = gko.Companion;
                stateListDrawable.addState(iArr, gko.b(R.drawable.vk_icon_like_24, aVar.itemView.getContext()));
                stateListDrawable.addState(new int[0], gko.b(R.drawable.vk_icon_like_outline_24, aVar.itemView.getContext()));
                stateListDrawable.setTintList(anj.b(R.color.feed_like_icon_tint_red, aVar.itemView.getContext()));
                return stateListDrawable;
            case 21:
                ((yis) obj).D6();
                return s3q0.a;
            case 22:
                xms xmsVar = (xms) obj;
                xmsVar.j.b(new uns.b.a(true, false));
                xmsVar.T(jns.a.b);
                return s3q0.a;
            case 23:
                int i5 = GalleryFragmentImpl.R0;
                return ((PhotoEditorComponent) ((k7m) m7m.f((GalleryFragmentImpl) obj)).a(fpf0.a(PhotoEditorComponent.class))).k4();
            case 24:
                return new c4u((t410) ((y4u) obj).A.getValue());
            case 25:
                HomeFragment2 homeFragment2 = (HomeFragment2) obj;
                if (((hlu0) homeFragment2.l0.getValue()).a()) {
                    ((jlu0) homeFragment2.m0.getValue()).e(homeFragment2, MultiAccountEntryPoint.LongTap.d);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                return Integer.valueOf(((ovw) obj).itemView.getContext().getResources().getDimensionPixelSize(R.dimen.vkim_dialog_info_bar_icon_size));
            case 27:
                return new nbx.d((nbx) obj);
            case 28:
                return (StoryProgressView) ((qex) obj).itemView.findViewById(R.id.video_single_clip_song_progress);
            default:
                xwv0 xwv0Var = ((n1y) obj).b;
                if (xwv0Var != null) {
                    return xwv0Var.E();
                }
                return null;
        }
    }
}
