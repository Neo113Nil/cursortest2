package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.account.dto.AccountGetHelpHintsResponseDto;
import com.vk.api.generated.account.dto.AccountHelpHintDto;
import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.core.serialize.Serializer;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.hints.Hint;
import com.vk.dto.music.SuggestMusicNotificationInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.it80;
import xsna.oj8;
import xsna.y8b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb4 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ tb4(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i;
        boolean z = false;
        switch (this.b) {
            case 0:
                ax1 ax1Var = (ax1) obj;
                if (ax1Var instanceof xm40) {
                    xm40 xm40Var = (xm40) ax1Var;
                    if (!xm40Var.a && TimeUnit.MILLISECONDS.toSeconds(xm40Var.d) >= 300) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                return Integer.valueOf((int) ((Double) obj).doubleValue());
            case 2:
                return Boolean.valueOf(((Group) obj).q0);
            case 3:
                return oj8.c.a;
            case 4:
                return ((Channel) obj).t != ChannelActionInProgress.NONE ? y8b.d.a : y8b.c.a;
            case 5:
                return s3q0.a;
            case 6:
                int i2 = ClipsEntryPointsFragment.i0;
                return s3q0.a;
            case 7:
                TextView textView = (TextView) obj;
                ColorStateList textColors = textView.getTextColors();
                textView.setTextAppearance(R.style.VkUiTypography_Caption2);
                textView.setTextColor(textColors);
                textView.setTextSize(11.0f);
                textView.setMaxLines(5);
                int i3 = lce.s;
                f4m.x(i3, textView);
                f4m.w(i3, textView);
                return s3q0.a;
            case 8:
                CharSequence charSequence = ((guf) obj).b;
                return charSequence == null ? "" : charSequence;
            case 9:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-1, 1, 1)));
            case 10:
                L.i((Throwable) obj);
                return s3q0.a;
            case 11:
                it80.a aVar = it80.b;
                Object a0 = j5g.a0((List) obj);
                aVar.getClass();
                return new it80(a0);
            case 12:
                return new iwg((ViewGroup) obj);
            case 13:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 14:
                return ((ztg) obj).d;
            case 15:
                List<yzi> list = ((d0j) obj).c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((yzi) obj2).b) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yzi yziVar = (yzi) it.next();
                    ConfigureItem configureItem = yziVar.a;
                    long j = configureItem.b.b;
                    Image image = configureItem.e;
                    if (image != null) {
                        Serializer.c<Owner> cVar = Owner.CREATOR;
                        str = Owner.a.a(iah0.a(48), image);
                    } else {
                        str = null;
                    }
                    ConfigureItem configureItem2 = yziVar.a;
                    String str2 = configureItem2.c;
                    ConfigureItem.ProductPrice productPrice = configureItem2.d;
                    String str3 = productPrice.d;
                    if (str3 == null || str3.length() == 0) {
                        str3 = productPrice.b;
                    }
                    arrayList2.add(new xzi(j, str, str2, str3));
                }
                return arrayList2;
            case 16:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, false, null, 384);
            case 17:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_channel_invite_link);
            case 18:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 19:
                return ((u180) obj).b;
            case 20:
                ArrayList arrayList3 = new ArrayList();
                for (AccountHelpHintDto accountHelpHintDto : ((AccountGetHelpHintsResponseDto) obj).d()) {
                    arrayList3.add(new Hint(accountHelpHintDto.getId(), accountHelpHintDto.getTitle(), accountHelpHintDto.getDescription(), null, 8, null));
                }
                return arrayList3;
            case 21:
                qgi0.r((tgi0) obj, "DonutTeaserTextField");
                return s3q0.a;
            case 22:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.IDLE, 0, false, false, 59);
            case 23:
                L.i((Throwable) obj);
                return s3q0.a;
            case 24:
                return i7d.a((h7d) obj);
            case 25:
                nf9.b.i(((Long) obj).longValue());
                return s3q0.a;
            case 26:
                L.i((Throwable) obj);
                return s3q0.a;
            case 27:
                VKList vKList = (VKList) obj;
                bzu bzuVar = bzu.b;
                bn40.f("HSNMan", "get notification info from NETWORK list =", vKList);
                SuggestMusicNotificationInfo suggestMusicNotificationInfo = (SuggestMusicNotificationInfo) j5g.a0(e43.r(vKList));
                if (suggestMusicNotificationInfo == null) {
                    suggestMusicNotificationInfo = (SuggestMusicNotificationInfo) bzu.m.getValue();
                }
                wmi0.a.m("__KEY_SUGGEST_NOTIFICATIONS_CACHE__", e43.r(j5g.s0(vKList, suggestMusicNotificationInfo)));
                bzu.f(suggestMusicNotificationInfo);
                bzu.d = System.currentTimeMillis();
                return s3q0.a;
            case 28:
                ((ojt) obj).b = 100;
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    i = R.string.music_talkback_player_pause;
                } else {
                    if (booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_player_audiobook_play;
                }
                return Integer.valueOf(i);
        }
    }

    public /* synthetic */ tb4(a0j a0jVar) {
        this.b = 15;
    }
}
