package xsna;

import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.RemoteViews;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.vk.antispam.SpammerModel;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockSettings;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockViewSettings;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.components.common.UserActions;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.music.player.presentation.widgets.AudioPlayerWidget;
import com.vk.music.player.presentation.widgets.PlayerBigWidget;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b26;
import xsna.ddh;
import xsna.osh;
import xsna.xam;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fd4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05e8  */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings;
        GroupsPrimaryBlockViewSettings groupsPrimaryBlockViewSettings;
        Object a;
        Peer B7;
        SpammerModel spammerModel;
        SpammerModel spammerModel2;
        int i;
        Drawable drawable;
        int i2 = this.b;
        int i3 = 2;
        r7 = false;
        boolean z = false;
        char c = 1;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                ((kd4) obj3).e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                osh oshVar = (osh) obj3;
                osh.a aVar = (osh.a) obj;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj2;
                l3f l3fVar = oshVar.f;
                List<o9h> list = aVar.a;
                String str = (extendedCommunityProfile.a0 < 3 || (groupsPrimaryBlockSettings = extendedCommunityProfile.L2) == null || (groupsPrimaryBlockViewSettings = groupsPrimaryBlockSettings.c) == null) ? null : groupsPrimaryBlockViewSettings.c;
                List<lsh> list2 = aVar.f;
                MarketInfoBlockModel marketInfoBlockModel = aVar.d;
                String str2 = aVar.c;
                ExtendedUserProfile.b bVar = extendedCommunityProfile.R;
                l3fVar.invoke(new d.n.c.a.C1614a(new ddh.a(list, list2, marketInfoBlockModel, str, bVar != null ? new e11(bVar.a, bVar.b, bVar.c) : null, str2, 40)));
                oshVar.h.invoke(CommunityProfileAction.n.a.i.b);
                ((q530) oshVar.l.getValue()).d(new rsh(oshVar));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                int i4 = n2i.j1;
                ((n2i) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                InfoBar infoBar = (InfoBar) obj;
                InfoBar.Button button = (InfoBar.Button) obj2;
                qkr0 qkr0Var = ((zam) obj3).h;
                if (qkr0Var != null) {
                    xam xamVar = qkr0Var.a;
                    FragmentActivity fragmentActivity = xamVar.i;
                    a1w a1wVar = xamVar.j;
                    String str3 = button.f;
                    InfoBar.ButtonType buttonType = button.d;
                    ktk0 ktk0Var = xamVar.t;
                    ktk0Var.i = infoBar;
                    Dialog Cb = ktk0Var.a.Cb();
                    if (Cb != null) {
                        qtd0 Cb2 = xamVar.t.a.b.Cb(Cb.Sb());
                        User user = Cb2 instanceof User ? (User) Cb2 : null;
                        switch (xam.a.$EnumSwitchMapping$1[buttonType.ordinal()]) {
                            case 1:
                                xamVar.b1(infoBar, str3, buttonType);
                                if (button.h) {
                                    xamVar.Z0(infoBar, "action");
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 2:
                                xamVar.b1(infoBar, str3, buttonType);
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 3:
                                String str4 = button.g;
                                if (!hg1.d(xamVar.v)) {
                                    zam zamVar = xamVar.u;
                                    if (zamVar != null) {
                                        com.vk.im.popup.a a2 = zamVar.a();
                                        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                                        imFeatures.getClass();
                                        a2.b(new dhd0(com.vk.toggle.b.A.a(imFeatures)), new b1j(zamVar, 8));
                                    }
                                    Serializer.c<Peer> cVar = Peer.CREATOR;
                                    int i5 = 19;
                                    xamVar.v = new io.reactivex.rxjava3.internal.operators.single.j(a1wVar.F(xamVar, new nfm(Peer.a.b(xamVar.t.a.e), infoBar.b, str4, null, false, xam.z)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new g50(xamVar, i3)).subscribe(new zl0(new dh8(xamVar, 1), i5), new mf1(new wv2(xamVar, 3), i5));
                                }
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 4:
                                y9w.a(fragmentActivity, new yam(xamVar, 0), BuildInfo.s());
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 5:
                                zam zamVar2 = xamVar.u;
                                if (zamVar2 != null) {
                                    com.vk.im.popup.a a3 = zamVar2.a();
                                    Context context = zamVar2.a;
                                    UserNameCase userNameCase = UserNameCase.ACC;
                                    if (user == null) {
                                        a = "…";
                                    } else {
                                        gdp gdpVar = zamVar2.g;
                                        String Ab = user.Ab(userNameCase);
                                        gdpVar.getClass();
                                        a = gdp.a(Ab);
                                    }
                                    UserActions userActions = UserActions.MARK_AS_SPAM;
                                    a3.e(new vv30(R.string.vkim_chat_message_request_info_bar_popup_title, null, 0, context.getString(R.string.vkim_chat_message_request_info_bar_popup_description, a), cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_chat_message_request_info_bar_popup_yes)), R.string.vkim_chat_message_request_info_bar_popup_no, Collections.singletonList(new lwb0(null, R.string.vkim_chat_message_request_info_bar_popup_action_mark_as_spam, null, null, 0, userActions, false, null, false, false, 2013)), Collections.singletonList(userActions), 918), new eph(zamVar2, 8));
                                }
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 6:
                                if (!hg1.d(xamVar.s) && user != null && (B7 = user.B7()) != null) {
                                    zam zamVar3 = xamVar.u;
                                    if (zamVar3 != null) {
                                        com.vk.im.popup.a a4 = zamVar3.a();
                                        ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                                        imFeatures2.getClass();
                                        a4.b(new dhd0(com.vk.toggle.b.A.a(imFeatures2)), new sje(zamVar3, 17));
                                    }
                                    xamVar.s = new io.reactivex.rxjava3.internal.operators.single.j(a1wVar.F(xamVar, new zjs(B7, null, null, 12)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new shd(xamVar, c == true ? 1 : 0)).subscribe(new f50(new o1g(xamVar, 2), 25), new ia(new vze(xamVar, 2), 23));
                                }
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 7:
                                if (user == null) {
                                    zam zamVar4 = xamVar.u;
                                    if (zamVar4 != null) {
                                        zamVar4.e();
                                    }
                                } else {
                                    zam zamVar5 = xamVar.u;
                                    if (zamVar5 != null) {
                                        gdp gdpVar2 = zamVar5.g;
                                        String str5 = "from_" + infoBar.b;
                                        String Ab2 = user.Ab(UserNameCase.NOM);
                                        gdpVar2.getClass();
                                        CharSequence a5 = gdp.a(Ab2);
                                        CharSequence a6 = gdp.a(user.Ab(UserNameCase.ACC));
                                        ArrayList arrayList = new ArrayList();
                                        UserActions userActions2 = UserActions.ADD_TO_BLACK_LIST;
                                        p4g.a(userActions2, arrayList, !(user.z == 3));
                                        com.vk.im.popup.a a7 = zamVar5.a();
                                        Context context2 = zamVar5.a;
                                        a7.e(new b6g0(R.string.vkim_msg_header_delete_spam_chat_title, null, 0, context2.getString(R.string.vkim_msg_header_delete_spam_user_submit_desc, a6), cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context2), context2.getString(R.string.vkim_blame)), R.string.vkim_kick_submit_no, Collections.singletonList(new lwb0(null, R.string.vkim_dialog_actions_add_to_black_list, null, null, 0, userActions2, false, null, false, false, 2013)), arrayList, 918), new bme(zamVar5, user, a5, str5, 1));
                                    }
                                }
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 8:
                                xamVar.b1(infoBar, str3, buttonType);
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 9:
                                if (a1wVar.r().h.D()) {
                                    Peer Zb = Cb.Zb();
                                    Zb.getClass();
                                    if (Zb.Ab(Peer.Type.UNKNOWN)) {
                                        edw.d(R.string.vkim_msg_header_antispam_actions_not_supported, fragmentActivity, false);
                                    }
                                    ktk0 ktk0Var2 = xamVar.t;
                                    ChatSettings Bb = ktk0Var2.a.Bb();
                                    qtd0 b = ktk0Var2.b();
                                    Dialog Cb3 = ktk0Var2.a.Cb();
                                    if (Cb3 != null) {
                                        Peer Zb2 = Cb3.Zb();
                                        if (Bb != null) {
                                            spammerModel = new SpammerModel(Bb.b, Bb.c, Zb2, Bb.g ? Integer.valueOf(c4g0.t(Cb3.hc())) : null, false, 16, null);
                                        } else if (b != null) {
                                            String name = b.name();
                                            ImageList C8 = b.C8();
                                            User user2 = b instanceof User ? (User) b : null;
                                            spammerModel = new SpammerModel(name, C8, Zb2, null, user2 != null && user2.Q, 8, null);
                                        }
                                        spammerModel2 = spammerModel;
                                        if (spammerModel2 != null) {
                                            zam zamVar6 = xamVar.u;
                                            if (zamVar6 != null) {
                                                zamVar6.e();
                                            }
                                        } else {
                                            b26.b bVar2 = xamVar.x;
                                            if (bVar2 != null) {
                                                b26.this.d.invoke(spammerModel2);
                                            }
                                        }
                                        if (button.h) {
                                        }
                                        xamVar.l.r().b(infoBar);
                                        break;
                                    }
                                    spammerModel2 = null;
                                    if (spammerModel2 != null) {
                                    }
                                    if (button.h) {
                                    }
                                    xamVar.l.r().b(infoBar);
                                }
                                break;
                            case 10:
                                xamVar.Z0(infoBar, "action");
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            case 11:
                                InfoBar.PopUp popUp = button.i;
                                zam zamVar7 = xamVar.u;
                                if (popUp != null && zamVar7 != null) {
                                    int i6 = xam.a.$EnumSwitchMapping$0[popUp.b.ordinal()];
                                    if (i6 == 1) {
                                        i = R.drawable.vk_icon_illustration_exceeding_limit_120h;
                                    } else {
                                        if (i6 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        i = R.drawable.vk_icon_illustration_comments_120h;
                                    }
                                    InfoModalBottomSheet.Params params = new InfoModalBottomSheet.Params(i, popUp.c, popUp.d, popUp.e);
                                    int i7 = InfoModalBottomSheet.g1;
                                    InfoModalBottomSheet.b.a(zamVar7.a, params);
                                }
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                            default:
                                if (button.h) {
                                }
                                xamVar.l.r().b(infoBar);
                                break;
                        }
                    }
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                i6t.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                mzz mzzVar = (mzz) obj3;
                kkm kkmVar = (kkm) obj2;
                Drawable drawable2 = mzzVar.s;
                LayerDrawable layerDrawable = drawable2 instanceof LayerDrawable ? (LayerDrawable) drawable2 : null;
                if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
                    drawable.setTint(kkmVar.f(R.attr.vk_legacy_accent));
                }
                Drawable drawable3 = mzzVar.s;
                if (drawable3 != null) {
                    drawable3.invalidateSelf();
                }
                return s3q0.a;
            case 6:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) obj3;
                RepliesView repliesView = marketItemReviewRepliesFragment.T;
                if (repliesView != null) {
                    repliesView.d();
                }
                RepliesView repliesView2 = marketItemReviewRepliesFragment.T;
                if (repliesView2 != null) {
                    repliesView2.b();
                }
                RepliesView repliesView3 = marketItemReviewRepliesFragment.T;
                if (repliesView3 != null) {
                    repliesView3.setVisibility(8);
                }
                NestedScrollView nestedScrollView = marketItemReviewRepliesFragment.V;
                if (nestedScrollView != null) {
                    nestedScrollView.setVisibility(8);
                }
                VkSpinner vkSpinner = marketItemReviewRepliesFragment.U;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(0);
                }
                return s3q0.a;
            case 7:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Float f = (Float) obj2;
                ?? r3 = musicCatalogRootVh.H;
                VkTopBarSearchQueryVh vkTopBarSearchQueryVh = musicCatalogRootVh.C;
                v750 v750Var = (v750) r3.getValue();
                oqx0 oqx0Var = v750Var.c;
                Activity activity = v750Var.a;
                if (!v750Var.b.c()) {
                    if (booleanValue) {
                        float floatValue = f != null ? f.floatValue() : 255.0f;
                        int c2 = dhr0.t.c(R.attr.vk_ui_header_background);
                        activity.getWindow().setStatusBarColor(Color.argb((int) floatValue, Color.red(c2), Color.green(c2), Color.blue(c2)));
                        if (!dhr0.M()) {
                            if ((f != null ? f.floatValue() : 255.0f) >= 127.5f) {
                                z = true;
                            }
                        }
                        oqx0Var.b(z);
                    } else {
                        oqx0Var.b(!dhr0.M());
                        activity.getWindow().setStatusBarColor(dhr0.t.c(R.attr.vk_ui_header_background));
                    }
                }
                if (booleanValue) {
                    vkTopBarSearchQueryVh.j(Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_contrast)));
                    hpj hpjVar = musicCatalogRootVh.E;
                    if (hpjVar != null) {
                        myc0.h(hpjVar, null, null, new id40(musicCatalogRootVh, f, null), 3);
                    }
                } else {
                    vkTopBarSearchQueryVh.j(null);
                    hpj hpjVar2 = musicCatalogRootVh.E;
                    if (hpjVar2 != null) {
                        myc0.h(hpjVar2, null, null, new jd40(musicCatalogRootVh, null), 3);
                    }
                }
                return s3q0.a;
            case 8:
                PlayerService playerService = (PlayerService) obj3;
                AppWidgetManager appWidgetManager = (AppWidgetManager) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = PlayerBigWidget.b;
                RemoteViews remoteViews = new RemoteViews(playerService.getPackageName(), R.layout.widget_player_big);
                PendingIntent c3 = AudioPlayerWidget.c(playerService, "big_player_widget");
                remoteViews.setOnClickPendingIntent(R.id.w_player_clickbox, c3);
                remoteViews.setOnClickPendingIntent(R.id.w_player_cover, c3);
                remoteViews.setTextViewText(R.id.w_player_title, "");
                remoteViews.setTextViewText(R.id.w_player_artist, "");
                remoteViews.setViewVisibility(R.id.w_player_cover, 8);
                remoteViews.setViewVisibility(R.id.w_player_placeholder, 0);
                remoteViews.setViewVisibility(R.id.w_player_inactive_view, 0);
                remoteViews.setTextViewText(R.id.w_player_inactive_view, playerService.getString(R.string.audio_widget_inactive));
                remoteViews.setOnClickPendingIntent(R.id.w_player_play_pause, null);
                remoteViews.setOnClickPendingIntent(R.id.w_player_next, null);
                remoteViews.setOnClickPendingIntent(R.id.w_player_prev, null);
                remoteViews.setOnClickPendingIntent(R.id.w_player_shuffle, null);
                remoteViews.setOnClickPendingIntent(R.id.w_player_repeat, null);
                remoteViews.setImageViewBitmap(R.id.w_player_prev, AudioPlayerWidget.e(R.drawable.vk_icon_skip_previous_48, -1, playerService));
                remoteViews.setImageViewBitmap(R.id.w_player_next, AudioPlayerWidget.e(R.drawable.vk_icon_skip_next_48, -1, playerService));
                remoteViews.setContentDescription(R.id.w_player_next, playerService.getString(R.string.music_talkback_next));
                remoteViews.setContentDescription(R.id.w_player_next, playerService.getString(R.string.music_talkback_prev));
                remoteViews.setImageViewBitmap(R.id.w_player_shuffle, AudioPlayerWidget.e(R.drawable.vk_icon_shuffle_24, -1, playerService));
                remoteViews.setImageViewBitmap(R.id.w_player_repeat, AudioPlayerWidget.e(R.drawable.vk_icon_repeat_24, -1, playerService));
                for (int i8 : (int[]) obj2) {
                    appWidgetManager.updateAppWidget(i8, remoteViews);
                }
                return s3q0.a;
            case 9:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(146077325, intValue, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.SmartCropComposeComponent.Theme.<anonymous> (SmartCropComposeComponent.kt:43)");
                    }
                    if (cq.i(0, aVar2, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                tet0 tet0Var = (tet0) obj3;
                int intValue2 = ((Integer) obj).intValue();
                wh50<set0> wh50Var = tet0Var.m;
                VideoSearchFiltersImpl copy = ((set0) ((zak0) wh50Var).getValue()).copy();
                List list3 = tet0Var.p;
                copy.b = ((Number) list3.get(intValue2)).intValue();
                copy.c = intValue2;
                copy.o = String.valueOf(((Number) list3.get(intValue2)).intValue());
                ((zak0) wh50Var).setValue(copy);
                tet0Var.B();
                return s3q0.a;
        }
    }

    public /* synthetic */ fd4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
