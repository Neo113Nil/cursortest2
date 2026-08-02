package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsAdminBannerModalDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.censoredsettings.presentation.obscenetext.ObsceneTextFilterFragment;
import com.vk.core.files.ExternalDirType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.profile.user.impl.ui.b;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dda0;
import xsna.dug0;
import xsna.nnj0;
import xsna.osb0;
import xsna.qn60;
import xsna.qy40;
import xsna.rtb0;
import xsna.se90;
import xsna.ssd0;
import xsna.t70;
import xsna.tzp0;
import xsna.wbu0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o440 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o440(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 3;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((g440) ((u440) obj2).s).m9(300L);
                return s3q0.a;
            case 1:
                lb40 lb40Var = (lb40) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                return Integer.valueOf((booleanValue || !lb40Var.g()) ? !booleanValue ? R.string.music_talkback_player_shuffle_track_in_queue : lb40Var.g() ? R.string.music_kids_talkback_player_shuffle_track_in_queue_turn_off : R.string.music_talkback_player_shuffle_track_in_queue_turn_off : R.string.music_kids_talkback_player_shuffle_track_in_queue);
            case 2:
                mq40 mq40Var = (mq40) obj2;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(mq40Var.a.d((UserId) it.next()));
                }
                return io.reactivex.rxjava3.core.a.m(arrayList);
            case 3:
                rt40 rt40Var = (rt40) obj2;
                tzp0.c.a aVar = rt40.s1;
                MusicTrack musicTrack = ((MusicDto) obj).m;
                if (musicTrack != null) {
                    yr40 yr40Var = new yr40(musicTrack);
                    rt40Var.getClass();
                    xn50.a.c(rt40Var, yr40Var);
                }
                return s3q0.a;
            case 4:
                rw40 rw40Var = (rw40) obj2;
                rw40Var.w.b(qy40.a.b.b);
                rw40Var.x.b(MusicHapticEvent.ERROR);
                return s3q0.a;
            case 5:
                x960 x960Var = (x960) obj2;
                qn60.c cVar = (qn60.c) obj;
                return new xg60(cVar.a, cVar.b, x960Var.a().c, x960Var.a().b.b, x960Var.a().b.c, x960Var.a().b.e);
            case 6:
                int i3 = el70.g1;
                ((el70) obj2).tn();
                return s3q0.a;
            case 7:
                ((ObsceneTextFilterFragment) obj2).Q.submitList((List) obj);
                return s3q0.a;
            case 8:
                ((tgp0) obj).m((ur4) obj2);
                return s3q0.a;
            case 9:
                ((zak0) ((se90) obj2).e).setValue((se90.a) obj);
                return s3q0.a;
            case 10:
                ((hca0) obj2).j.b(new dda0.d((Throwable) obj));
                return s3q0.a;
            case 11:
                return com.vk.core.files.b.c(new com.vk.core.files.b((Context) obj2), ((dug0.c) obj).c, ExternalDirType.IMAGES, 4);
            case 12:
                bn40.c((Throwable) obj, new Object[0]);
                ((wzs) obj2).invoke(EmptyList.b, null);
                return s3q0.a;
            case 13:
                lsb0 lsb0Var = (lsb0) obj2;
                rtb0.a aVar2 = (rtb0.a) obj;
                boolean z = aVar2.b;
                Poll poll = aVar2.a;
                if (z) {
                    lsb0Var.T(new osb0.g(poll));
                } else {
                    lsb0Var.T(new osb0.a(Integer.valueOf(R.string.poll_user_already_voted), poll));
                }
                return s3q0.a;
            case 14:
                lfg lfgVar = ((PostViewFragment) obj2).C0;
                (lfgVar != null ? lfgVar : null).H7();
                return s3q0.a;
            case 15:
                return io.reactivex.rxjava3.core.a.l(new g9b((com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b) obj2, 8));
            case 16:
                enc0 enc0Var = (enc0) obj2;
                float floatValue = ((Float) obj).floatValue();
                enc0Var.S = floatValue;
                ahc0 ahc0Var = enc0Var.V;
                if (ahc0Var != null) {
                    ahc0Var.J0(floatValue, enc0Var.T);
                }
                return s3q0.a;
            case 17:
                PrimaryActionsView primaryActionsView = (PrimaryActionsView) obj2;
                float f = PrimaryActionsView.t;
                for (Pair pair : (List) obj) {
                    ku kuVar = (ku) pair.d();
                    Object g = pair.g();
                    View view = kuVar.b;
                    if (view != null) {
                        kuVar.g(view, g);
                    }
                    if (kuVar.equals(primaryActionsView.d) && (g instanceof t70.c)) {
                        PrimaryActionsView.c cVar2 = primaryActionsView.n;
                        boolean a = ((t70.c) g).a();
                        cVar2.b.a(a);
                        PrimaryActionsView.this.o.setElevation(a ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 5.0f * cn70.a());
                    }
                }
                return s3q0.a;
            case 18:
                o8d0 o8d0Var = (o8d0) obj2;
                nvy nvyVar = (nvy) obj;
                int intValue = (((Number) ((zak0) o8d0Var.e).getValue()).intValue() / ((int) o8d0Var.c)) + 2;
                for (int i4 = 0; i4 < intValue; i4++) {
                    nvy.g(nvyVar, null, null, new jai(-997553846, new t26(o8d0Var, i2), true), 3);
                }
                return s3q0.a;
            case 19:
                MarketIntegrationSettingsAdminBannerModalDto.TypeDto e = ((MarketIntegrationSettingsAdminBannerModalDto) obj).e();
                ((ssd0) obj2).getClass();
                int i5 = ssd0.a.$EnumSwitchMapping$2[e.ordinal()];
                if (i5 == 1) {
                    return ProductsManagementActionType.HIDE_VK_PRODUCTS;
                }
                if (i5 == 2) {
                    return ProductsManagementActionType.ALLOW_VK_PRODUCTS;
                }
                if (i5 == 3) {
                    return ProductsManagementActionType.RESTORE_VK_PRODUCTS;
                }
                if (i5 == 4) {
                    return ProductsManagementActionType.DO_NOT_RESTORE_VK_PRODUCTS;
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                tgi0 tgi0Var = (tgi0) obj;
                int i6 = ProfileFriendsFragment.k0;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, ((ProfileFriendsFragment) obj2).getString(R.string.edit_friends_list_desc));
                return s3q0.a;
            case 21:
                List list2 = (List) obj;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = ((c5e0) obj2).e;
                (izsVar != null ? izsVar : null).invoke(new b.x(list2));
                return s3q0.a;
            case 22:
                ((thf0) obj2).b((pzo) obj);
                return s3q0.a;
            case 23:
                hqh0 hqh0Var = (hqh0) obj2;
                VkTopBarSearchQueryVh vkTopBarSearchQueryVh = hqh0Var.i;
                if (vkTopBarSearchQueryVh != null) {
                    vkTopBarSearchQueryVh.Km(0L);
                }
                yp70 yp70Var = hqh0Var.g;
                myc0.h(yp70Var.h, yp70Var.b, null, new xp70(yp70Var, null), 2);
                hqh0Var.c.b();
                return s3q0.a;
            case 24:
                return (Boolean) ((mb8) obj2).invoke();
            case 25:
                ((w8j0) obj2).c.setLifeTime(((Integer) obj).intValue());
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                ((znj0) obj2).j(new nnj0.e((AboutVideoItem.SimilarVideoRedesign) obj));
                return s3q0.a;
            case 28:
                ((rg50) obj2).C((int) (((tny) obj).a() & 4294967295L));
                return s3q0.a;
            default:
                o6k0 o6k0Var = (o6k0) obj2;
                Context context = o6k0Var.b;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 9) {
                    String str = wbu0.a(context, th, true).a;
                    l6k0 l6k0Var = (l6k0) o6k0Var.a;
                    if (l6k0Var != null) {
                        l6k0Var.Of(str);
                    }
                } else if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    wbu0.a a2 = wbu0.a(context, th, true);
                    l6k0 l6k0Var2 = (l6k0) o6k0Var.a;
                    if (l6k0Var2 != null) {
                        l6k0Var2.vf(a2);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ o440(kw70 kw70Var, ur4 ur4Var) {
        this.b = 8;
        this.c = ur4Var;
    }
}
