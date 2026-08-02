package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.artist.dto.ArtistArtistPromoDto;
import com.vk.api.generated.artist.dto.ArtistGetArtistPromoResponseDto;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.AudioBookListItemViewStyle;
import com.vk.catalog2.common.dto.api.style.AudioBookSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.channels.impl.post_settings.g;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.PollFilterParams;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.music.informer.mvi.h;
import com.vk.newsfeed.impl.posting.newposter.NewPosterFragment;
import com.vk.newsfeed.impl.posting.newposter.NewPosterImageView;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.UserWallPostingSettings;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.photos.root.photoflow.presentation.views.PhotoFlowRecyclerPaginatedView;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.stickers.settings.popup.PopupSettingsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.cca0;
import xsna.jv60;
import xsna.kxb0;
import xsna.nn20;
import xsna.no90;
import xsna.pnb0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kn20 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kn20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if ((r4 != null ? r4.c : null) == com.vk.newsfeed.posting.impl.presentation.model.GroupPrivacyType.OPEN) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r1.b == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v53, types: [Offset, java.lang.Integer] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        CatalogViewStyle audioBookSliderViewStyle;
        Object[] objArr;
        int i = this.b;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((zak0) ((nn20.a) obj2).a).setValue((String) obj);
                break;
            case 1:
                ((ArrayList) obj2).add((lr20) obj);
                break;
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                if (!((u2m) obj2).d) {
                    qgi0.a(tgi0Var);
                }
                break;
            case 3:
                Uri uri = (Uri) obj;
                int i2 = MoneyTransferLinkFragment.u0;
                kbj0 b = nr4.b();
                View view = ((MoneyTransferLinkFragment) obj2).s0;
                b.D((view != null ? view : null).getContext(), uri.toString());
                break;
            case 4:
                u440 u440Var = (u440) obj2;
                List list = (List) obj;
                if (list.isEmpty() && u440Var.G7()) {
                    u440Var.A7();
                    u440Var.j.h(u440Var.G7());
                } else {
                    u440Var.v.clear();
                    u440Var.v.addAll(list);
                    u440Var.a8(1);
                    u440Var.c8();
                }
                break;
            case 5:
                q840 q840Var = (q840) obj2;
                tc50 tc50Var = q840Var.n;
                if (tc50Var != null) {
                    q840Var.l.invoke(tc50Var.b);
                }
                break;
            case 6:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, ((ma40) obj2).b);
                qgi0.r(tgi0Var2, "MusicPickerPreviewCellTitle");
                break;
            case 7:
                com.vk.music.informer.mvi.d dVar = (com.vk.music.informer.mvi.d) obj2;
                ArtistArtistPromoDto e = ((ArtistGetArtistPromoResponseDto) obj).e();
                if (e != null) {
                    dVar.T(new h.b(e));
                    if (dVar.n && !dVar.o) {
                        dVar.o = true;
                        String r = e.r();
                        if (r == null) {
                            r = "";
                        }
                        com.vk.music.informer.mvi.d.U(r);
                    }
                } else {
                    dVar.T(h.c.b);
                }
                break;
            case 8:
                Object[] objArr2 = (Object[]) obj;
                break;
            case 9:
                ((ep50) obj2).getDelegateProvider().b().f(null, (Throwable) obj);
                break;
            case 10:
                nx50 nx50Var = (nx50) obj2;
                ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) nx50Var.i0.getValue();
                ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                profileFragmentProviderComponent.ye((UserId) obj, null).G("TAB_BAR".toLowerCase(Locale.ROOT)).k(nx50Var.b);
                VkContextMenu vkContextMenu = nx50Var.L0;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                break;
            case 11:
                bi20 bi20Var = (bi20) obj2;
                AudioBook audioBook = (AudioBook) obj;
                CatalogViewType catalogViewType = bi20Var.d;
                Bundle bundle = bi20Var.p;
                if (catalogViewType == CatalogViewType.LIST) {
                    audioBookSliderViewStyle = new AudioBookListItemViewStyle(bundle.getString(CatalogCustomAttributes$Keys.STYLE.h()));
                } else {
                    String string = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                    AudioBookSliderViewStyle.Style.Companion.getClass();
                    audioBookSliderViewStyle = new AudioBookSliderViewStyle(AudioBookSliderViewStyle.Style.a.a(string));
                }
                break;
            case 12:
                p860 p860Var = (p860) obj2;
                Bitmap bitmap = (Bitmap) ((it80) obj).a;
                if (bitmap != null) {
                    p860Var.f = bitmap;
                    NewPosterFragment newPosterFragment = p860Var.b;
                    ViewGroup viewGroup = newPosterFragment.U;
                    if (viewGroup != null) {
                        bwt0.p0(viewGroup, false);
                    }
                    TextView textView = newPosterFragment.V;
                    if (textView != null) {
                        bwt0.p0(textView, false);
                    }
                    ViewGroup viewGroup2 = newPosterFragment.Y;
                    if (viewGroup2 != null) {
                        bwt0.p0(viewGroup2, true);
                    }
                    View view2 = newPosterFragment.Z;
                    if (view2 != null) {
                        bwt0.p0(view2, true);
                    }
                    View view3 = newPosterFragment.a0;
                    if (view3 != null) {
                        bwt0.p0(view3, true);
                    }
                    RecyclerView recyclerView = newPosterFragment.b0;
                    if (recyclerView != null) {
                        bwt0.p0(recyclerView, true);
                    }
                    newPosterFragment.setHasOptionsMenu(true);
                    NewPosterImageView newPosterImageView = newPosterFragment.W;
                    if (newPosterImageView != null) {
                        newPosterImageView.setImageBitmap(bitmap);
                    }
                }
                break;
            case 13:
                break;
            case 14:
                iui iuiVar = (iui) obj;
                rr60 rr60Var = new rr60();
                lv60 lv60Var = new lv60();
                final e64 a = iuiVar.a(new qu60(lv60Var, ((zz60) obj2).s, rr60Var));
                final e64 a2 = iuiVar.a(new l070(lv60Var));
                final e64 a3 = iuiVar.a(new ms60(lv60Var));
                final e64 a4 = iuiVar.a(new qj60(lv60Var));
                final e64 a5 = iuiVar.a(new lz60(lv60Var));
                final e64 a6 = iuiVar.a(new wl60());
                iuiVar.a = new wzs() { // from class: xsna.sz60
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        em50 em50Var = (em50) obj3;
                        jv60 jv60Var = (jv60) obj4;
                        if (jv60Var instanceof kv60) {
                            return em50Var.a(e64.this, jv60Var);
                        }
                        if (jv60Var instanceof jv60.e) {
                            return em50Var.a(a2, jv60Var);
                        }
                        if (jv60Var instanceof jv60.c) {
                            return em50Var.a(a3, jv60Var);
                        }
                        if (jv60Var instanceof jv60.a) {
                            return em50Var.a(a4, jv60Var);
                        }
                        if (jv60Var instanceof jv60.d) {
                            return em50Var.a(a5, jv60Var);
                        }
                        if (jv60Var instanceof jv60.b) {
                            return em50Var.a(a6, jv60Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                break;
            case 15:
                m990 m990Var = (m990) obj2;
                l370 l370Var = m990Var.b;
                Offset offset = m990Var.g;
                frz frzVar = (frz) ((utk) obj).a;
                l370Var.getClass();
                m990Var.g = Integer.valueOf(((e4u0) frzVar).getSize() + ((Number) offset).intValue());
                break;
            case 16:
                ((bo90) obj2).T(new no90.a.C3406a((Throwable) obj));
                break;
            case 17:
                com.vk.photos.root.photoflow.presentation.j jVar = (com.vk.photos.root.photoflow.presentation.j) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                PhotoFlowRecyclerPaginatedView photoFlowRecyclerPaginatedView = jVar.l;
                photoFlowRecyclerPaginatedView.P = booleanValue;
                View view4 = photoFlowRecyclerPaginatedView.d;
                ((TextView) view4.findViewById(R.id.tv_empty_title)).setText(view4.getContext().getString(booleanValue ? R.string.photo_flow_empty_text_self : R.string.photo_flow_empty_text_other));
                bwt0.p0(view4.findViewById(R.id.tv_add_photo), booleanValue);
                bwt0.p0(view4.findViewById(R.id.iv_icon), booleanValue);
                if (!booleanValue) {
                    bwt0.d(photoFlowRecyclerPaginatedView, cn70.a() * 20.0f, (r4 & 2) != 0, (r4 & 4) != 0);
                }
                photoFlowRecyclerPaginatedView.x(photoFlowRecyclerPaginatedView.d, booleanValue);
                photoFlowRecyclerPaginatedView.x(photoFlowRecyclerPaginatedView.c, booleanValue);
                photoFlowRecyclerPaginatedView.x(photoFlowRecyclerPaginatedView.b, booleanValue);
                jVar.p.a = booleanValue;
                break;
            case 18:
                ((kca0) obj2).a.getFeature().C(new cca0.i((qba0) obj));
                break;
            case 19:
                com.vk.superapp.miniapps.picker.j jVar2 = (com.vk.superapp.miniapps.picker.j) obj2;
                jVar2.g1.c();
                jVar2.dismiss();
                break;
            case 20:
                ((kra0) obj2).l.yi(new a.c.C1410a((String) obj));
                break;
            case 21:
                ((ze5) obj2).a(Integer.valueOf(R.id.music_action_go_to_community));
                break;
            case 22:
                ((job0) obj2).a.b(pnb0.c.i.b);
                break;
            case 23:
                int i3 = PollResultsFragment.b0;
                ((PollResultsFragment) obj2).lo((PollFilterParams) obj);
                break;
            case 24:
                PopupSettingsFragment popupSettingsFragment = (PopupSettingsFragment) obj2;
                kxb0 kxb0Var = (kxb0) obj;
                int i4 = PopupSettingsFragment.R;
                if (kxb0Var instanceof kxb0.a) {
                    popupSettingsFragment.finish();
                } else {
                    xn50.a.c(popupSettingsFragment, kxb0Var);
                }
                break;
            case 25:
                com.vk.channels.impl.post_settings.b bVar = (com.vk.channels.impl.post_settings.b) obj2;
                j7c0 j7c0Var = (j7c0) obj;
                ChannelMsgSendConfig channelMsgSendConfig = j7c0Var.a;
                ChannelMsgSendState channelMsgSendState = j7c0Var.d;
                if (channelMsgSendState.c && channelMsgSendState.b) {
                    z = true;
                }
                if (channelMsgSendConfig.l() == null || z) {
                    Date l = channelMsgSendConfig.l();
                    if (l == null) {
                        Calendar d = pvo0.d();
                        d.add(11, 1);
                        l = d.getTime();
                    }
                    bVar.n(new g.b(l));
                } else {
                    bVar.q(new lfa(13, new k990(6), bVar));
                }
                break;
            case 26:
                Photo photo = (Photo) obj2;
                photo.x = (List) obj;
                photo.m = true;
                break;
            case 27:
                PostingState.Editing editing = (PostingState.Editing) obj;
                ((qkc0) obj2).getClass();
                PostEditableData postEditableData = editing.i;
                PostingSettings postingSettings = editing.d;
                boolean f = epx.f(postEditableData.i, PrivacyPostType.AllUsers.b);
                PostingContext postingContext = editing.c;
                if (fkq0.b(postingContext.b.b)) {
                    GroupWallPostingSettings groupWallPostingSettings = postingSettings.h;
                    break;
                } else {
                    UserWallPostingSettings userWallPostingSettings = postingSettings.g;
                    if (userWallPostingSettings != null) {
                        break;
                    }
                    objArr = false;
                }
                AdditionalSettingsConfiguration additionalSettingsConfiguration = postEditableData.q;
                boolean z2 = additionalSettingsConfiguration != null ? additionalSettingsConfiguration.c : false;
                Object[] objArr3 = postEditableData.t == null;
                boolean z3 = postingContext.j;
                if (f && objArr != false && !z2 && objArr3 != false && !z3) {
                    z = true;
                }
                break;
            case 28:
                Throwable th = (Throwable) obj;
                j03.j((Context) obj2, th);
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            default:
                ProfileFriendsFragment profileFriendsFragment = ((exd0) obj2).c;
                VkRecyclerPaginatedView vkRecyclerPaginatedView = profileFriendsFragment.Z;
                if (vkRecyclerPaginatedView == null) {
                    vkRecyclerPaginatedView = null;
                }
                vkRecyclerPaginatedView.e0();
                VkSearchView vkSearchView = profileFriendsFragment.a0;
                if (vkSearchView == null) {
                    vkSearchView = null;
                }
                bwt0.p0(vkSearchView, false);
                View view5 = profileFriendsFragment.X;
                bwt0.p0(view5 != null ? view5 : null, false);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kn20(w060 w060Var, bi20 bi20Var) {
        this.b = 11;
        this.c = bi20Var;
    }
}
