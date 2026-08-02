package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.ViewGroup;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.design.view.editor.swap.SwapItemsView;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVkTicket;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreenFragment;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.community.impl.ui.profile.scheduled_clips.CommunityScheduledClipsGridFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stories.design.view.AvatarButton;
import com.vk.webapp.fragments.BannedFragment;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import xsna.bre;
import xsna.bsm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bu1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bu1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.disposables.c cVar;
        Object parcelable;
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AllHighlightsFragment.g0;
                return ((AllHighlightsFragment) obj).requireArguments().getString("ref");
            case 1:
                bsu0 bsu0Var = (bsu0) ((oy3) obj).c.getValue();
                return Boolean.valueOf(bsu0Var != null ? bsu0Var.c : false);
            case 2:
                return Float.valueOf(e3m.d(R.attr.im_msg_part_corner_radius_big, (Context) ((gc4) obj).a));
            case 3:
                int i3 = BannedFragment.c0;
                return Boolean.valueOf(((BannedFragment) obj).requireArguments().getBoolean("userWasLoggedIn"));
            case 4:
                int i4 = BonusCatalogFragment.f0;
                ((BonusCatalogFragment) obj).fo();
                return s3q0.a;
            case 5:
                BookingRecordCompletedScreenFragment bookingRecordCompletedScreenFragment = (BookingRecordCompletedScreenFragment) obj;
                qcy<Object>[] qcyVarArr = BookingRecordCompletedScreenFragment.Q;
                return new qu7(bookingRecordCompletedScreenFragment.eo(), ((OnlineBookingInternalComponent) bookingRecordCompletedScreenFragment.O.getValue()).Kf());
            case 6:
                return (AvatarButton) ((u48) obj).findViewById(R.id.share_instant);
            case 7:
                return ColorStateList.valueOf(((rmb) obj).c.getContext().getColor(R.color.audio_ad_progress_color));
            case 8:
                tsu tsuVar = ((azb) obj).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).z.f) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 9:
                return ((qdz) ((r4c) obj).b.getValue()).e();
            case 10:
                return ((ClassifiedsCatalogBaseRootVh) obj).s.U1();
            case 11:
                List<ClickableSticker> list = ((ClickableStickers) obj).d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((ClickableSticker) it.next()) instanceof ClickableVkTicket) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 12:
                kid presenter = ((pid) obj).getPresenter();
                if (presenter != null) {
                    presenter.c();
                }
                return s3q0.a;
            case 13:
                return ((rwd) obj).d().findViewById(R.id.format_overlay_view);
            case 14:
                k0e k0eVar = (k0e) obj;
                i0e i0eVar = k0eVar.f;
                return new hvc(i0eVar.f(), i0eVar.c(), ((SwapItemsView) k0eVar.j.getValue()).getRecyclerView(), new tm0(k0eVar, 27));
            case 15:
                bre.b bVar = bre.s1;
                return (BridgeComponent) m7m.d((bre) obj).a(fpf0.a(BridgeComponent.class));
            case 16:
                return ((ClipsViewerComponentImpl) obj).l.y0();
            case 17:
                ynh ynhVar = (ynh) obj;
                return new w4y0((v4y0) ynhVar.I0.getValue(), ynhVar.a());
            case 18:
                ynh ynhVar2 = ((ksh) obj).d;
                return new qdh((isq) ynhVar2.c0.getValue(), (lt00) ynhVar2.Y.getValue());
            case 19:
                CommunityScheduledClipsGridFragment communityScheduledClipsGridFragment = (CommunityScheduledClipsGridFragment) obj;
                int i5 = CommunityScheduledClipsGridFragment.W;
                if (Build.VERSION.SDK_INT < 33) {
                    UserId userId = (UserId) communityScheduledClipsGridFragment.requireArguments().getParcelable("CommunityScheduledClipsGridFragment.user_id");
                    return userId == null ? UserId.d : userId;
                }
                parcelable = communityScheduledClipsGridFragment.requireArguments().getParcelable("CommunityScheduledClipsGridFragment.user_id", UserId.class);
                UserId userId2 = (UserId) parcelable;
                return userId2 == null ? UserId.d : userId2;
            case 20:
                return ((u1j) obj).findViewById(R.id.back);
            case 21:
                ((l8j) obj).k.getClass();
                return new j9u0();
            case 22:
                qnj qnjVar = (qnj) obj;
                ViewGroup viewGroup = qnjVar.e;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                qnjVar.b(viewGroup);
                return s3q0.a;
            case 23:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 24:
                return ((com.vk.core.compose.component.datetime.g) obj).d(com.vk.core.compose.component.datetime.c.b(), com.vk.core.compose.component.datetime.f.c);
            case 25:
                ((hrl) obj).d = false;
                return s3q0.a;
            case 26:
                return new bzb0(((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj).f);
            case 27:
                hkp hkpVar = ((tim) obj).p;
                if (hkpVar != null) {
                    hkpVar.g();
                }
                return s3q0.a;
            case 28:
                return new bsm.j((bsm) obj);
            default:
                e9n e9nVar = ((h8n) obj).f;
                return new Result(e9nVar.a.f(new txf0(), new kjj0(e9nVar.b)));
        }
    }
}
