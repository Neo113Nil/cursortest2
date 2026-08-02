package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionAddPlaylistResponseDto;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.articles.Article;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.feed.design.view.newsfeed.ads_action_button.VkFeedActionCellButton$Content$Middle;
import com.vk.feed.design.view.newsfeed.ads_action_button.b;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photos.root.presentation.i;
import com.vk.reefton.Reef;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.b230;
import xsna.gfp0;
import xsna.go20;
import xsna.obz;
import xsna.snx;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gzn implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ gzn(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkTopBar.j jVar;
        VkTopBar.b bVar;
        VkTopBar.c cVar;
        VkTopBar.Middle middle;
        VkTopBar.a aVar;
        VkTopBar.a.b.C0877b c0877b;
        VkTopBar.a.b.C0877b c0877b2;
        FrameLayout frameLayout;
        VkTopBar.Middle.Text.Title.a aVar2;
        VkTopBar.Middle.Text.Title.Size size;
        VkTopBar.Middle.Text.c cVar2;
        VkTopBar.Middle.Text.c cVar3;
        VkTopBar.Middle.Text.Title.a c0870a;
        int i = 26;
        boolean z = true;
        switch (this.b) {
            case 0:
                fzn fznVar = (fzn) obj;
                DonutContactsListFactory donutContactsListFactory = DonutContactsListFactory.SELECT_DONUT_USERS_VKAPP;
                return new r0o(fznVar.e, fznVar.a, SortOrder.BY_NAME, fznVar.d);
            case 1:
                return DzenArticleState.a((DzenArticleState) obj, null, null, null, null, null, false, 63);
            case 2:
                kpp kppVar = opp.T;
                return ((pno0) obj).d().toString();
            case 3:
                Pair pair = (Pair) obj;
                return new Pair(new ptk((ExtendedUserProfile) pair.d(), false), (JSONObject) pair.g());
            case 4:
                Context context = (Context) obj;
                com.vk.feed.design.view.newsfeed.ads_action_button.c cVar4 = new com.vk.feed.design.view.newsfeed.ads_action_button.c(context);
                cVar4.setMiddle(new VkFeedActionCellButton$Content$Middle.Label(oq.d(tlo0.Companion, "Перейти"), new x7g(R.attr.vk_ui_text_primary), (eko) null, (x7g) null, VkFeedActionCellButton$Content$Middle.Label.TruncateMode.STATIC, 44));
                cVar4.setRight(new b.C1039b(new gko(R.drawable.vk_icon_chevron_right_24), new x7g(R.attr.vk_ui_icon_secondary), null));
                cVar4.setWithDivider(true);
                cVar4.setBackgroundColor(e3m.f(R.attr.vk_ui_background_secondary, context));
                return cVar4;
            case 5:
                int i2 = FriendsImportFragment.a0;
                return ((Item) obj).c;
            case 6:
                return Boolean.TRUE;
            case 7:
                L.g("Can't get recent gifs", (Throwable) obj);
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "storefront_group_name");
                return s3q0.a;
            case 9:
                xqj xqjVar = (xqj) obj;
                boolean z2 = xqjVar.a;
                return new brj(z2, z2 && xqjVar.d, xqjVar.e, xqjVar.b, xqjVar.c);
            case 10:
                return Boolean.valueOf(((vrw) obj).e());
            case 11:
                obz obzVar = (obz) obj;
                obz.b bVar2 = obzVar instanceof obz.b ? (obz.b) obzVar : null;
                if (bVar2 != null) {
                    return bVar2.b;
                }
                return null;
            case 12:
                new p8(LocationCommon.a, 6);
                return s3q0.a;
            case 13:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 14:
                return k4g0.a((k4g0) obj, false, false, 3967);
            case 15:
                VkTopBar vkTopBar = (VkTopBar) obj;
                go20 go20Var = go20.a;
                int i3 = go20.k.$EnumSwitchMapping$9[((go20.g) ((zak0) go20.m).getValue()).ordinal()];
                if (i3 == 1) {
                    jVar = VkTopBar.j.a.a;
                } else if (i3 == 2) {
                    jVar = com.vk.core.view.components.topbar.d.a;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar = com.vk.core.view.components.topbar.c.a;
                }
                vkTopBar.setInitialMode(jVar);
                vkTopBar.setTransformFraction(((vak0) go20.l).getFloatValue());
                int i4 = go20.k.$EnumSwitchMapping$0[((go20.b) ((zak0) go20.o).getValue()).ordinal()];
                if (i4 == 1) {
                    bVar = null;
                } else if (i4 == 2) {
                    bVar = new VkTopBar.b(new y84(11), null, null, null, null, 30);
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new VkTopBar.b(new jb(24), null, new VkTopBar.l.c(99, VkCounter.CounterAppearance.Appearance.Accent, null, 12), null, null, 26);
                }
                vkTopBar.setBack(bVar);
                int i5 = go20.k.$EnumSwitchMapping$1[((go20.c) ((zak0) go20.p).getValue()).ordinal()];
                int i6 = 21;
                if (i5 == 1) {
                    cVar = null;
                } else if (i5 == 2) {
                    cVar = new VkTopBar.c.d(null, new i21(18), null, null, 13);
                } else if (i5 == 3) {
                    cVar = new VkTopBar.c.a(new snx(new snx.b.e()), new lz2(16), null, null, null, 28);
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new VkTopBar.c.f(new gko(R.drawable.vk_icon_square_outline_24), null, new lg(i6), null, null, 58);
                }
                vkTopBar.setBefore(cVar);
                int i7 = go20.k.$EnumSwitchMapping$3[((go20.f) ((zak0) go20.q).getValue()).ordinal()];
                int i8 = 22;
                if (i7 == 1) {
                    middle = VkTopBar.Middle.c.a;
                } else if (i7 == 2) {
                    int i9 = go20.k.$EnumSwitchMapping$4[((go20.i) ((zak0) go20.r).getValue()).ordinal()];
                    if (i9 != 1) {
                        if (i9 == 2) {
                            c0870a = new VkTopBar.Middle.Text.Title.a.C0870a(null);
                        } else if (i9 == 3) {
                            c0870a = new VkTopBar.Middle.Text.Title.a.b(new VkTopBar.Middle.Text.b(new gko(R.drawable.vk_icon_square_part_16)), null);
                        } else {
                            if (i9 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c0870a = new VkTopBar.Middle.Text.Title.a.b(new VkTopBar.Middle.Text.b(new gko(R.drawable.vk_icon_square_part_16)), new VkTopBar.Middle.Text.b(new gko(R.drawable.vk_icon_square_part_16)));
                        }
                        aVar2 = c0870a;
                    } else {
                        aVar2 = null;
                    }
                    int i10 = go20.k.$EnumSwitchMapping$2[((go20.j) ((zak0) go20.s).getValue()).ordinal()];
                    if (i10 == 1) {
                        size = VkTopBar.Middle.Text.Title.Size.Small;
                    } else {
                        if (i10 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        size = VkTopBar.Middle.Text.Title.Size.Medium;
                    }
                    VkTopBar.Middle.Text.Title title = new VkTopBar.Middle.Text.Title("TopBar", (e4) null, aVar2, size, 2);
                    int i11 = go20.k.$EnumSwitchMapping$5[((go20.h) ((zak0) go20.t).getValue()).ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            cVar3 = new VkTopBar.Middle.Text.c(oq.d(tlo0.Companion, "Subtitle"), null, null, 30);
                        } else {
                            if (i11 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar3 = new VkTopBar.Middle.Text.c(oq.d(tlo0.Companion, "Subtitle"), new VkTopBar.Middle.Text.b(new gko(R.drawable.vk_icon_square_part_16)), null, 22);
                        }
                        cVar2 = cVar3;
                    } else {
                        cVar2 = null;
                    }
                    middle = new VkTopBar.Middle.Text(title, cVar2, null, null, 12);
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    middle = new VkTopBar.Middle.d("Search", new tho0((String) null, 0L, 7), false, null, null, null, null, null, null, null, 4092);
                }
                vkTopBar.setMiddle(middle);
                switch (go20.k.$EnumSwitchMapping$7[((go20.a) ((zak0) go20.u).getValue()).ordinal()]) {
                    case 1:
                        aVar = null;
                        break;
                    case 2:
                        aVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.C0878a(new snx(new snx.b.e()), new nh0(21), null, 12), null, 6);
                        break;
                    case 3:
                        VkTopBar.a.c.f fVar = new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_square_outline_24), null, new com.vk.movika.sdk.base.model.props.a(17), null, null, null, 58);
                        wh50 wh50Var = go20.v;
                        go20.e eVar = (go20.e) ((zak0) wh50Var).getValue();
                        int[] iArr = go20.k.$EnumSwitchMapping$6;
                        int i12 = iArr[eVar.ordinal()];
                        if (i12 == 1) {
                            c0877b = null;
                        } else {
                            if (i12 != 2 && i12 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c0877b = new VkTopBar.a.b.C0877b(new gko(R.drawable.vk_icon_square_outline_24), null, new f4(24), null, null, null, 58);
                        }
                        int i13 = iArr[((go20.e) ((zak0) wh50Var).getValue()).ordinal()];
                        if (i13 == 1 || i13 == 2) {
                            c0877b2 = null;
                        } else {
                            if (i13 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c0877b2 = new VkTopBar.a.b.C0877b(new gko(R.drawable.vk_icon_square_outline_24), null, new com.vk.movika.sdk.base.model.props.c(20), null, null, null, 58);
                        }
                        aVar = new VkTopBar.a.d(fVar, c0877b, c0877b2);
                        break;
                    case 4:
                        aVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.b(oq.d(tlo0.Companion, "Button"), 1.0f, new com.vk.movika.sdk.base.model.props.d(29), null), null, 6);
                        break;
                    case 5:
                        aVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.e(new com.vk.movika.tools.controls.seekbar.n(24)), null, 6);
                        break;
                    case 6:
                        aVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.g(new gu0(26)), null, 6);
                        break;
                    case 7:
                        aVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.C0879c(new x84(i8), null), null, 6);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                vkTopBar.setAfter(aVar);
                Context context2 = vkTopBar.getContext();
                int i14 = go20.k.$EnumSwitchMapping$8[((go20.d) ((zak0) go20.w).getValue()).ordinal()];
                if (i14 == 1) {
                    frameLayout = null;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    frameLayout = new FrameLayout(context2);
                    TextView textView = new TextView(context2);
                    textView.setText("Bottom Slot");
                    textView.setTextAppearance(R.style.VkUiTypography_Footnote);
                    long j = l5g.f;
                    textView.setTextColor(f870.H(j));
                    frameLayout.addView(textView);
                    textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                    frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, hbh0.b(32, context2)));
                    frameLayout.setBackground(new ColorDrawable(f870.H(l5g.c(14, j, 0.1f))));
                }
                vkTopBar.setBottomSlot(frameLayout);
                vkTopBar.setShowBottomDivider(((Boolean) ((zak0) go20.x).getValue()).booleanValue());
                vkTopBar.setGradient(((Boolean) ((zak0) go20.n).getValue()).booleanValue() ? new VkTopBar.h.a(hbh0.b(32, vkTopBar.getContext())) : null);
                return s3q0.a;
            case 16:
                return b230.b.a;
            case 17:
                Attach attach = (Attach) obj;
                if (!(attach instanceof AttachCall) && !(attach instanceof AttachGroupCall)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                return Boolean.valueOf(((gfp0.b) obj) instanceof gfp0.b.c);
            case 19:
                List list = (List) obj;
                Iterator it = list.iterator();
                long j2 = 0;
                while (it.hasNext()) {
                    long j3 = 0;
                    while (((Playlist) it.next()).y.iterator().hasNext()) {
                        j3 += ((MusicTrack) r10.next()).f;
                    }
                    j2 += j3;
                }
                return new tt70(4, j2, rli0.A(rli0.y(rli0.t(new i5g(list), new wh1(i)), 2)));
            case 20:
                qgi0.r((tgi0) obj, "downloads_settings_remove_all_downloads_size_btn");
                return s3q0.a;
            case 21:
                KidsCollectionAddPlaylistResponseDto kidsCollectionAddPlaylistResponseDto = (KidsCollectionAddPlaylistResponseDto) obj;
                Integer d = kidsCollectionAddPlaylistResponseDto.d();
                int intValue = d != null ? d.intValue() : 0;
                UserId q = kidsCollectionAddPlaylistResponseDto.q();
                if (q == null) {
                    q = UserId.d;
                }
                return new PlaylistLink(intValue, q, null, 4, null);
            case 22:
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((MsgFromUser) obj).D3(AttachVideoMsg.class, true));
            case 24:
                return (Article) ((VKList) obj).get(0);
            case 25:
                tj50.a aVar3 = (tj50.a) obj;
                ega0 ega0Var = ega0.b;
                ao8 ao8Var = ao8.d;
                return new i.a(aVar3.a(ega0Var, ao8Var), aVar3.a(hga0.b, ao8Var), aVar3.a(fga0.b, ao8Var), aVar3.a(gga0.b, ao8Var));
            case 26:
                return new ArrayList();
            case 27:
                return ((PostingState.Editing) obj).d.q.b;
            case 28:
                return s3q0.a;
            default:
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
        }
    }
}
