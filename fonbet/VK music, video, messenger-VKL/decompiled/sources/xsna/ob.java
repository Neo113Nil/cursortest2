package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetAudioMetaResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridLikedClipsListFragment;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.feed.design.view.newsfeed.ads_action_button.VkFeedActionCellButton$Content$Middle;
import com.vk.feed.design.view.newsfeed.ads_action_button.b;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import xsna.dz40;
import xsna.iqq;
import xsna.q630;
import xsna.qs80;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ob implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ob(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ApiSessionStore lambda$joinAnonByLinkInternal$7;
        Object obj2 = null;
        int i = 1;
        switch (this.b) {
            case 0:
                return (UsersUserFullDto) j5g.Y((List) obj);
            case 1:
                return s3q0.a;
            case 2:
                int i2 = AppearanceSettingsWithBackgroundsFragment.b0;
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, null, 959);
            case 4:
                dy40 dy40Var = ((sy40) obj).e;
                return new dz40.c(dy40Var.a, dy40Var.b, dy40Var.c);
            case 5:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 6:
                return ((VkPaginationList) obj).b;
            case 7:
                return i5s.a(new StringBuilder(), ((zk10) obj).b().get(1), "\"<HIDE>\"");
            case 8:
                L.i((Throwable) obj);
                return s3q0.a;
            case 9:
                ShortVideoGetAudioMetaResponseDto shortVideoGetAudioMetaResponseDto = (ShortVideoGetAudioMetaResponseDto) obj;
                String url = shortVideoGetAudioMetaResponseDto.getUrl();
                if (url == null) {
                    url = "";
                }
                List<Integer> e = shortVideoGetAudioMetaResponseDto.e();
                if (e == null) {
                    e = EmptyList.b;
                }
                Integer d = shortVideoGetAudioMetaResponseDto.d();
                return new ta40(url, e, d != null ? d.intValue() : 0);
            case 10:
                ClipsCoauthorsSelectorMviState.c cVar = (ClipsCoauthorsSelectorMviState.c) obj;
                return new d8p0(cVar.b, fnd.e(cVar.c), true);
            case 11:
                return new io.reactivex.rxjava3.internal.operators.maybe.p(new t30((Image) obj, obj2, obj2, i));
            case 12:
                int i3 = ClipsGridLikedClipsListFragment.i0;
                return ((vee) obj).a;
            case 13:
                return String.valueOf(((Integer) obj).intValue());
            case 14:
                return ((wah) obj).d;
            case 15:
                Map.Entry entry = (Map.Entry) obj;
                return new Pair(fkq0.e((UserId) entry.getKey()), tsj.a((Group) entry.getValue()));
            case 16:
                return txj0.B(q630.a.a, null, 3);
            case 17:
                lambda$joinAnonByLinkInternal$7 = ConversationFactory.lambda$joinAnonByLinkInternal$7((ApiSessionStore) obj);
                return lambda$joinAnonByLinkInternal$7;
            case 18:
                c9k c9kVar = (c9k) obj;
                String str = c9kVar.g;
                y9k i4 = x8k.i(c9kVar.h);
                Integer num = c9kVar.i;
                return new x9k(str, (num == null || num.intValue() <= 0) ? 2500 : num.intValue(), i4);
            case 19:
                int i5 = com.vk.profile.questions.impl.b.q1;
                qgi0.r((tgi0) obj, "create_question_name");
                return s3q0.a;
            case 20:
                return ((com.vk.im.engine.models.messages.a) obj).K0();
            case 21:
                DonutBadge donutBadge = new DonutBadge((Context) obj, null, 6);
                donutBadge.setText("300 ₽/мес");
                return donutBadge;
            case 22:
                fzn fznVar = (fzn) obj;
                DonutContactsListFactory donutContactsListFactory = DonutContactsListFactory.SELECT_DONUT_USERS_VKAPP;
                return new uzn(fznVar.e, fznVar.a, SortOrder.BY_NAME, fznVar.d);
            case 23:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 24:
                if (((qs80) obj) instanceof qs80.b) {
                    cvk.u(gpt0.n(PlayerError.ERROR_NOT_PROCESSED, false), false);
                }
                return s3q0.a;
            case 25:
                Context context = (Context) obj;
                com.vk.feed.design.view.newsfeed.ads_action_button.c cVar2 = new com.vk.feed.design.view.newsfeed.ads_action_button.c(context);
                Drawable drawable = context.getDrawable(R.drawable.vk_icon_aliexpress_logo_squircle_28);
                VkFeedActionCellButton$Content$Middle.Label.TruncateMode truncateMode = VkFeedActionCellButton$Content$Middle.Label.TruncateMode.INTERACTIVE;
                tlo0.h d2 = oq.d(tlo0.Companion, "Очень длинный текст, чтобы не помещался в одну строку");
                x7g x7gVar = new x7g(R.attr.vk_ui_text_primary);
                if (drawable == null) {
                    drawable = null;
                }
                cVar2.setMiddle(new VkFeedActionCellButton$Content$Middle.Label(d2, x7gVar, drawable != null ? new eko(drawable) : null, new x7g(R.attr.vk_ui_icon_primary), truncateMode, 32));
                cVar2.setRight(new b.C1039b(new gko(R.drawable.vk_icon_chevron_right_24), new x7g(R.attr.vk_ui_icon_secondary), null));
                cVar2.setWithDivider(true);
                cVar2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_secondary, context));
                return cVar2;
            case 26:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new utz(tf3.b(viewGroup, R.layout.vkim_folder_peer_loading_wheel_vh, viewGroup, false));
            case 27:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 28:
                return iqq.a.a(((JSONObject) obj).getJSONObject("response"));
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ ob(Object obj, int i) {
        this.b = i;
    }
}
