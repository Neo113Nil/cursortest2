package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatarpicker.c;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicTrackVh;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.ecomm.orders.impl.common.model.OrderSnackbar;
import com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.a;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.mentions.MentionProfileVO;
import com.vk.money.MoneyTransfersFragment;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.stats.CoachMarkAction;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.ModalPostRepostsTabFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.b;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.photoflow.presentation.d;
import com.vk.photos.root.photoflow.presentation.views.PhotoFlowRecyclerPaginatedView;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapCloseCoachmarkItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;
import com.vk.superapp.browser.internal.ui.time.StaticTimerView;
import com.vk.superapp.browser.ui.discount.PersonalDiscountModalBottomSheet$removeLinksUnderline$1;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ad40;
import xsna.b080;
import xsna.b9a0;
import xsna.gm50;
import xsna.iv20;
import xsna.k010;
import xsna.m7a0;
import xsna.p270;
import xsna.qr60;
import xsna.u1a0;
import xsna.vzi0;
import xsna.xn50;
import xsna.z180;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class o010 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o010(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05cb  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, xsna.jv20] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        CommonAudioStat$TypeAudioTapCloseCoachmarkItem.Type type;
        zf40 zf40Var;
        boolean c;
        UIBlockMusicTrack uIBlockMusicTrack;
        zf40 zf40Var2;
        boolean c2;
        ow2 ow2Var;
        zf40 zf40Var3;
        zf40 zf40Var4;
        FragmentManager supportFragmentManager;
        WebImage webImage;
        WebImageSize d;
        int i = this.b;
        int i2 = 14;
        vzi0.a aVar = vzi0.a.a;
        int i3 = 7;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                int i4 = MarketItemCommentsFragment.j0;
                xn50.a.c((MarketItemCommentsFragment) obj2, new k010.h(intValue));
                return s3q0.a;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e2g0 e2g0Var = ((MarketItemReviewsFragment) obj2).R;
                if (e2g0Var != null) {
                    e2g0Var.o(booleanValue);
                }
                return s3q0.a;
            case 2:
                ((n320) obj2).a.a(new xjc0(Collections.singletonList((MentionProfileVO) obj), false));
                return s3q0.a;
            case 3:
                wv20 wv20Var = (wv20) obj2;
                wv20Var.b.W8(iv20.c.a);
                wv20Var.b((vgg) obj);
                return s3q0.a;
            case 4:
                ModalPostRepostsTabFragment modalPostRepostsTabFragment = (ModalPostRepostsTabFragment) obj2;
                b.d dVar = (b.d) obj;
                int i5 = ModalPostRepostsTabFragment.Y;
                gm50.a.a(modalPostRepostsTabFragment, dVar.a, new qd1(21, modalPostRepostsTabFragment, dVar));
                gm50.a.a(modalPostRepostsTabFragment, dVar.b, new bgy(modalPostRepostsTabFragment, i3));
                gm50.a.a(modalPostRepostsTabFragment, dVar.c, new defpackage.m(22, modalPostRepostsTabFragment, dVar));
                return s3q0.a;
            case 5:
                Playlist playlist = (Playlist) obj;
                ModernPlaylistModel.M((ModernPlaylistModel) obj2, playlist, null, 2);
                i0q0.j(new o4(playlist, 14));
                return s3q0.a;
            case 6:
                MoneyTransfersFragment moneyTransfersFragment = (MoneyTransfersFragment) obj2;
                int intValue2 = ((Integer) obj).intValue();
                if (intValue2 == R.id.money_transfer_send) {
                    moneyTransfersFragment.U0 = false;
                    moneyTransfersFragment.Mo(1006);
                } else if (intValue2 == R.id.money_transfer_request) {
                    moneyTransfersFragment.U0 = true;
                    moneyTransfersFragment.Mo(1007);
                } else if (intValue2 == R.id.money_transfer_link) {
                    moneyTransfersFragment.U0 = false;
                    moneyTransfersFragment.Ko();
                } else {
                    int i6 = MoneyTransfersFragment.b1;
                    moneyTransfersFragment.getClass();
                }
                return s3q0.a;
            case 7:
                com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj2;
                View view = (View) obj;
                MsgListEmptyViewState msgListEmptyViewState = aVar2.Q;
                if (msgListEmptyViewState instanceof MsgListEmptyViewState.b) {
                    aVar2.e(new b.C1172b());
                } else if (msgListEmptyViewState instanceof MsgListEmptyViewState.c) {
                    aVar2.e(b.j.a);
                } else if (msgListEmptyViewState instanceof MsgListEmptyViewState.ForDialog) {
                    MsgListEmptyViewState.ForDialog forDialog = (MsgListEmptyViewState.ForDialog) msgListEmptyViewState;
                    Dialog dialog = forDialog.a;
                    ProfilesSimpleInfo profilesSimpleInfo = forDialog.b;
                    if (dialog.Va()) {
                        qtd0 zb = profilesSimpleInfo.zb(dialog.Zb());
                        Group group = zb instanceof Group ? (Group) zb : null;
                        if (group != null) {
                            if (group.Cb()) {
                                aVar2.T = false;
                                aVar2.e(new b.n(group, view));
                            } else {
                                aVar2.T = true;
                                aVar2.e(new b.l(group, view));
                            }
                        }
                    } else {
                        qtd0 zb2 = profilesSimpleInfo.zb(dialog.Zb());
                        User user = zb2 instanceof User ? (User) zb2 : null;
                        if (user != null && e43.l(0, 2).contains(Integer.valueOf(user.z))) {
                            int i7 = a.b.$EnumSwitchMapping$0[user.R.ordinal()];
                            if (i7 == 1) {
                                aVar2.e(new b.a(user));
                            } else {
                                if (i7 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.e(new b.c(user));
                            }
                        }
                        if (user != null && e43.l(1, 3).contains(Integer.valueOf(user.z))) {
                            int i8 = a.b.$EnumSwitchMapping$0[user.R.ordinal()];
                            if (i8 == 1) {
                                aVar2.e(new b.k(user));
                            } else {
                                if (i8 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.e(new b.m(user));
                            }
                        }
                    }
                }
                return s3q0.a;
            case 8:
                int i9 = pqr0.o;
                return new pqr0((VkCell) bwt0.I(R.layout.vkim_dialogs_list_item_channel, (ViewGroup) obj, false), ((rx30) obj2).h);
            case 9:
                return ((ab40) obj2).d((List) obj, false);
            case 10:
                ad40 ad40Var = (ad40) obj2;
                n680 n680Var = (n680) obj;
                if (ad40Var.d) {
                    CoachMarkAction coachMarkAction = n680Var.b;
                    UIBlockHint uIBlockHint = n680Var.a;
                    int i10 = ad40.a.$EnumSwitchMapping$1[coachMarkAction.ordinal()];
                    if (i10 == 1) {
                        type = null;
                    } else if (i10 == 2) {
                        type = CommonAudioStat$TypeAudioTapCloseCoachmarkItem.Type.HIDE;
                    } else if (i10 == 3) {
                        type = CommonAudioStat$TypeAudioTapCloseCoachmarkItem.Type.EXIT;
                    } else {
                        if (i10 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = CommonAudioStat$TypeAudioTapCloseCoachmarkItem.Type.HIDE;
                    }
                    if (type != null) {
                        CommonAudioStat$TypeAudioTapCloseCoachmarkItem commonAudioStat$TypeAudioTapCloseCoachmarkItem = new CommonAudioStat$TypeAudioTapCloseCoachmarkItem(ad40Var.a(uIBlockHint), type);
                        UiTracker uiTracker = UiTracker.a;
                        new qf40(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, commonAudioStat$TypeAudioTapCloseCoachmarkItem, 3)).q();
                    }
                    ad40Var.c = uIBlockHint;
                }
                return s3q0.a;
            case 11:
                MusicTrackVh musicTrackVh = (MusicTrackVh) obj2;
                Set<String> set = MusicTrackVh.v;
                UIBlockMusicTrack uIBlockMusicTrack2 = musicTrackVh.l;
                if (uIBlockMusicTrack2 != null) {
                    boolean contains = set.contains(uIBlockMusicTrack2.f);
                    if (!uIBlockMusicTrack2.z.Vb() && !contains && !uIBlockMusicTrack2.Ob()) {
                        CatalogMusicTrackLocalState catalogMusicTrackLocalState = uIBlockMusicTrack2.C;
                        if (catalogMusicTrackLocalState.b && !catalogMusicTrackLocalState.c && (zf40Var = musicTrackVh.u) != null) {
                            c = zf40Var.c();
                            uIBlockMusicTrack = musicTrackVh.l;
                            if (uIBlockMusicTrack != null && uIBlockMusicTrack.u == 1 && musicTrackVh.s) {
                                boolean contains2 = set.contains(uIBlockMusicTrack.f);
                                if (!uIBlockMusicTrack.z.Vb() && !contains2 && !uIBlockMusicTrack.Ob() && (zf40Var2 = musicTrackVh.t) != null) {
                                    c2 = zf40Var2.c();
                                    ow2Var = musicTrackVh.o;
                                    if (ow2Var == null) {
                                        ow2Var = null;
                                    }
                                    if (e3m.h(ow2Var.itemView.getContext()) != null) {
                                        Rect rect = new Rect();
                                        if (c2) {
                                            ow2 ow2Var2 = musicTrackVh.o;
                                            if (ow2Var2 == null) {
                                                ow2Var2 = null;
                                            }
                                            if (ow2Var2.itemView.getGlobalVisibleRect(rect) && (zf40Var4 = musicTrackVh.t) != null) {
                                                zf40Var4.a(rect, null);
                                            }
                                        } else if (c) {
                                            View view2 = musicTrackVh.p;
                                            if ((view2 != null ? view2.getGlobalVisibleRect(rect) : false) && (zf40Var3 = musicTrackVh.u) != null) {
                                                zf40Var3.a(rect, new nly(musicTrackVh, i2));
                                            }
                                        }
                                    }
                                    musicTrackVh.n.b(null);
                                    return s3q0.a;
                                }
                            }
                            c2 = false;
                            ow2Var = musicTrackVh.o;
                            if (ow2Var == null) {
                            }
                            if (e3m.h(ow2Var.itemView.getContext()) != null) {
                            }
                            musicTrackVh.n.b(null);
                            return s3q0.a;
                        }
                    }
                }
                c = false;
                uIBlockMusicTrack = musicTrackVh.l;
                if (uIBlockMusicTrack != null) {
                    boolean contains22 = set.contains(uIBlockMusicTrack.f);
                    if (!uIBlockMusicTrack.z.Vb()) {
                        c2 = zf40Var2.c();
                        ow2Var = musicTrackVh.o;
                        if (ow2Var == null) {
                        }
                        if (e3m.h(ow2Var.itemView.getContext()) != null) {
                        }
                        musicTrackVh.n.b(null);
                        return s3q0.a;
                    }
                }
                c2 = false;
                ow2Var = musicTrackVh.o;
                if (ow2Var == null) {
                }
                if (e3m.h(ow2Var.itemView.getContext()) != null) {
                }
                musicTrackVh.n.b(null);
                return s3q0.a;
            case 12:
                Boolean bool = (Boolean) obj;
                cjx cjxVar = ((rr50) obj2).J;
                (cjxVar != null ? cjxVar : null).o(!bool.booleanValue());
                return s3q0.a;
            case 13:
                g960 g960Var = (g960) obj2;
                e960 e960Var = g960Var.l;
                f960 f960Var = g960Var.q;
                e960Var.u((f960Var != null ? f960Var : null).b);
                return s3q0.a;
            case 14:
                return new tvf0((NewsEntriesContainer) obj, (awq) obj2);
            case 15:
                ((lfa) obj2).invoke((etv0) obj);
                return s3q0.a;
            case 16:
                return ((py60) obj2).b.e(new ux60((qr60.a) obj));
            case 17:
                p270 p270Var = (p270) obj2;
                m270 m270Var = p270Var.q;
                l270 l270Var = p270Var.l;
                int i11 = p270.a.$EnumSwitchMapping$0[(m270Var != null ? m270Var : null).b.ordinal()];
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    l270Var.s();
                } else if (i11 != 4) {
                    if (i11 != 5) {
                        l270Var.b();
                    } else {
                        l270Var.e();
                    }
                }
                return s3q0.a;
            case 18:
                wjs0.a(new oxr0((VideoFile) obj2, false));
                return s3q0.a;
            case 19:
                ((qe70) obj2).o.b(aVar);
                return s3q0.a;
            case 20:
                ((hg70) obj2).q.b(aVar);
                return s3q0.a;
            case 21:
                b080 b080Var = (b080) obj2;
                z180 z180Var = (z180) obj;
                qcy<Object>[] qcyVarArr = b080.q1;
                if (z180Var instanceof z180.b) {
                    b080Var.hide();
                    if (((z180.b) z180Var).a) {
                        b080.b bVar = b080Var.o1;
                        if (bVar != null) {
                            bVar.a();
                        }
                    } else {
                        b080.b bVar2 = b080Var.o1;
                        if (bVar2 != null) {
                            bVar2.onClose();
                        }
                    }
                } else if (z180Var instanceof z180.a) {
                    z180.a aVar3 = (z180.a) z180Var;
                    Bundle b = yfb.b(new Pair("BANNER_VISIBILITY", Boolean.valueOf(aVar3.a)), new Pair("HINT_ID", aVar3.b));
                    c63 c63Var = c63.a;
                    Activity b2 = c63.b();
                    FragmentActivity fragmentActivity = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
                    if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                        Bundle arguments = b080Var.getArguments();
                        String string = arguments != null ? arguments.getString("ONBOARDING_KEY") : null;
                        if (string == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        supportFragmentManager.k0(b, string);
                    }
                    b080.b bVar3 = b080Var.o1;
                    if (bVar3 != null) {
                        bVar3.b(b);
                    }
                } else {
                    if (!(z180Var instanceof z180.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b080.b bVar4 = b080Var.o1;
                    if (bVar4 != null) {
                        bVar4.c(((z180.c) z180Var).a);
                    }
                }
                return s3q0.a;
            case 22:
                Bitmap bitmap = (Bitmap) obj;
                kog0 kog0Var = ((xd80) obj2).m;
                kog0Var.getClass();
                Canvas canvas = new Canvas(bitmap);
                float f = xd80.v;
                float[] fArr = {f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                float height = bitmap.getHeight();
                float width = bitmap.getWidth();
                Path path = kog0Var.a;
                path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, fArr, Path.Direction.CCW);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                PorterDuff.Mode mode = PorterDuff.Mode.ADD;
                Paint paint = kog0Var.b;
                paint.reset();
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                paint.setAntiAlias(true);
                paint.setXfermode(new PorterDuffXfermode(mode));
                canvas2.drawPath(path, paint);
                PorterDuff.Mode mode2 = PorterDuff.Mode.DST_IN;
                paint.reset();
                paint.setStyle(style);
                paint.setAntiAlias(true);
                paint.setXfermode(new PorterDuffXfermode(mode2));
                canvas.drawBitmap(createBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                path.reset();
                return bitmap;
            case 23:
                OrderListFragment orderListFragment = (OrderListFragment) obj2;
                com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c cVar = (com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c) obj;
                qcy<Object>[] qcyVarArr2 = OrderListFragment.Q;
                hv80 hv80Var = (hv80) orderListFragment.O.getValue();
                hv80Var.getClass();
                Context requireContext = orderListFragment.requireContext();
                if (cVar instanceof c.a) {
                    orderListFragment.kn().onBackPressed();
                } else if (cVar instanceof c.b) {
                    fy9.a(hv80Var.d, requireContext, null, new CartCounterState(((c.b) cVar).a), null, 10);
                } else if (cVar instanceof c.C0996c) {
                    maz.c(hv80Var.g, orderListFragment.requireContext(), hv80Var.h, LaunchContext.A, null, null, 24);
                } else if (cVar instanceof c.g) {
                    c.g gVar = (c.g) cVar;
                    hv80Var.c.a(orderListFragment.requireContext(), gVar.a, gVar.b, gVar.c);
                } else if (cVar instanceof c.h) {
                    hv80Var.b.a(((c.h) cVar).a, CommonMarketStat$TypeMarketOrdersItem.Source.ORDER_BUTTON, orderListFragment);
                } else if (cVar instanceof c.e) {
                    c.e eVar = (c.e) cVar;
                    hv80Var.f.d(orderListFragment.requireContext(), new qz00(eVar.b, eVar.a, CommonMarketStat$TypeRefSource.CART, null, null, null, null, null, null, null, null, null, null, 1048568));
                } else if (cVar instanceof c.i) {
                    ReviewSuggestion reviewSuggestion = ((c.i) cVar).a;
                    ajg0 ajg0Var = hv80Var.e;
                    if (reviewSuggestion instanceof ReviewSuggestion.AllOrders) {
                        ajg0Var.e(orderListFragment.requireContext());
                    } else {
                        if (!(reviewSuggestion instanceof ReviewSuggestion.Order)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ajg0Var.f(((ReviewSuggestion.Order) reviewSuggestion).b, orderListFragment.requireContext());
                    }
                } else if (cVar instanceof c.j) {
                    fx80 fx80Var = (fx80) hv80Var.i.getValue();
                    Context requireContext2 = orderListFragment.requireContext();
                    OrderSnackbar orderSnackbar = ((c.j) cVar).a;
                    fx80Var.getClass();
                    fx80.a(requireContext2, orderSnackbar);
                } else if (cVar instanceof c.d) {
                    maz.c(hv80Var.g, requireContext, ((c.d) cVar).a, LaunchContext.A, null, null, 24);
                } else {
                    if (!(cVar instanceof c.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cpu a = xg5.a();
                    UserId userId = ((c.f) cVar).a;
                    int i12 = cpu.a;
                    a.g(requireContext, userId, null);
                }
                return s3q0.a;
            case 24:
                ((gk90) obj2).l.b();
                return s3q0.a;
            case 25:
                Object obj3 = ((mm90) obj2).o;
                ((km90) (obj3 != null ? obj3 : null)).r();
                return s3q0.a;
            case 26:
                u1a0 u1a0Var = (u1a0) obj2;
                q1a0 q1a0Var = (q1a0) obj;
                u1a0Var.x1 = q1a0Var;
                int i13 = q1a0Var.a;
                l1a0 l1a0Var = q1a0Var.b;
                if (i13 != 0) {
                    r1a0 r1a0Var = u1a0Var.u1;
                    if (r1a0Var != null) {
                        r1a0Var.c(l1a0Var != null ? l1a0Var.d : null, u1a0Var.v1);
                    }
                    wdx0 wdx0Var = e370.f;
                    if (wdx0Var == null) {
                        wdx0Var = null;
                    }
                    wdx0Var.getClass();
                    String a2 = wdx0.d().o().a();
                    if (a2 == null) {
                        a2 = "";
                    }
                    TextView textView = u1a0Var.h1;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setText(u1a0Var.getString(R.string.vk_apps_personal_discount_title, a2));
                    if (l1a0Var != null) {
                        PersonalBannerView personalBannerView = u1a0Var.i1;
                        if (personalBannerView == null) {
                            personalBannerView = null;
                        }
                        personalBannerView.P4(l1a0Var, PersonalBannerView.Source.BOTTOM_SHEET, new v1a0(u1a0Var));
                    }
                    StaticTimerView staticTimerView = u1a0Var.k1;
                    if (staticTimerView == null) {
                        staticTimerView = null;
                    }
                    staticTimerView.P4(q1a0Var.c);
                    u1a0Var.Yn(u1a0.b.CONTENT);
                    String str = l1a0Var != null ? l1a0Var.f : null;
                    if (str == null) {
                        TextView textView2 = u1a0Var.n1;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        textView2.setVisibility(8);
                    } else {
                        TextView textView3 = u1a0Var.n1;
                        if (textView3 == null) {
                            textView3 = null;
                        }
                        textView3.setMovementMethod(LinkMovementMethod.getInstance());
                        TextView textView4 = u1a0Var.n1;
                        TextView textView5 = textView4;
                        if (textView4 == null) {
                            textView5 = null;
                        }
                        SpannableString spannableString = new SpannableString(textView5.getText());
                        Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                        int i14 = 0;
                        while (i14 < spans.length) {
                            int i15 = i14 + 1;
                            try {
                                URLSpan uRLSpan = (URLSpan) spans[i14];
                                spannableString.setSpan(new PersonalDiscountModalBottomSheet$removeLinksUnderline$1(uRLSpan.getURL()), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
                                i14 = i15;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        }
                        textView5.setText(spannableString);
                        TextView textView6 = u1a0Var.n1;
                        if (textView6 == null) {
                            textView6 = null;
                        }
                        jjc.g(textView6, new mu1(23, u1a0Var, str));
                    }
                    ifx0 ifx0Var = e370.c;
                    if (ifx0Var == null) {
                        ifx0Var = null;
                    }
                    VKImageController<View> create = ifx0Var.b().create(u1a0Var.requireContext());
                    VKReplacerView vKReplacerView = u1a0Var.f1;
                    if (vKReplacerView == null) {
                        vKReplacerView = null;
                    }
                    vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
                    WebUserShortInfo webUserShortInfo = q1a0Var.d;
                    create.f((webUserShortInfo == null || (webImage = webUserShortInfo.h) == null || (d = webImage.d()) == null) ? null : d.b, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, R.drawable.vk_circle_placeholder, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65515));
                    VkButton vkButton = u1a0Var.l1;
                    if (vkButton == null) {
                        vkButton = null;
                    }
                    vkButton.setLoading(false);
                    VkButton vkButton2 = u1a0Var.l1;
                    if (vkButton2 == null) {
                        vkButton2 = null;
                    }
                    jjc.g(vkButton2, new lxz(u1a0Var, 16));
                    TextView textView7 = u1a0Var.m1;
                    jjc.g(textView7 != null ? textView7 : null, new c230(u1a0Var, 13));
                } else {
                    u1a0Var.Yn(u1a0.b.ERROR);
                }
                return s3q0.a;
            case 27:
                com.vk.photos.root.photoflow.presentation.b bVar5 = (com.vk.photos.root.photoflow.presentation.b) obj2;
                f4z f4zVar = bVar5.h;
                m7a0 m7a0Var = (m7a0) obj;
                if (m7a0Var instanceof m7a0.b) {
                    List<Photo> list = ((m7a0.b) m7a0Var).a;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((Photo) it.next()).c));
                    }
                    bVar5.T(new d.e(j5g.S0(arrayList)));
                } else if (m7a0Var instanceof m7a0.a) {
                    f4zVar.b(b9a0.h.a);
                } else if (m7a0Var instanceof m7a0.e) {
                    f4zVar.b(b9a0.h.a);
                } else if (m7a0Var instanceof m7a0.g) {
                    bVar5.C(new a.p(true));
                } else if (m7a0Var instanceof m7a0.c.b) {
                    f4zVar.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_settings_success), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, null, 32)));
                }
                return s3q0.a;
            case 28:
                PhotoFlowRecyclerPaginatedView.a aVar4 = ((PhotoFlowRecyclerPaginatedView) obj2).O;
                if (aVar4 != null) {
                    ((com.vk.photos.root.photoflow.presentation.j) ((or20) aVar4).c).e.invoke(a.d.C1502a.b);
                }
                return s3q0.a;
            default:
                q4t q4tVar = (q4t) obj;
                c.a aVar5 = ((com.vk.avatarpicker.c) obj2).k;
                if (aVar5 != null) {
                    aVar5.v0(q4tVar);
                }
                return s3q0.a;
        }
    }
}
