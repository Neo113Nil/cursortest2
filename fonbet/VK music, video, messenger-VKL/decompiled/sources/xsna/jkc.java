package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.stories.StoryPrivacySettingsActivity;
import com.vk.stories.StorySettingsActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.dam0;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jkc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jkc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity a;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qkc qkcVar = (qkc) obj2;
                ClickableHashtag clickableHashtag = (ClickableHashtag) obj;
                izs<ClickableHashtag, Boolean> izsVar = qkcVar.d.e;
                if (izsVar == null) {
                    Context context = view.getContext();
                    ((anm0) qkcVar.i.getValue()).l(clickableHashtag);
                    qkcVar.m(clickableHashtag);
                    g2v.c().k().d(context, clickableHashtag.e.toLowerCase(Locale.ROOT));
                    break;
                } else {
                    izsVar.invoke(clickableHashtag).getClass();
                    break;
                }
            case 1:
                com.vk.movika.sdk.base.observable.q qVar = (com.vk.movika.sdk.base.observable.q) obj;
                urv0 urv0Var = ((sfd) obj2).q;
                if (urv0Var != null) {
                    qVar.invoke(urv0Var);
                    break;
                }
                break;
            case 2:
                CommunityNotificationSettingsFragment.b.a aVar = (CommunityNotificationSettingsFragment.b.a) obj2;
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj;
                h7u0.a aVar2 = new h7u0.a(aVar.itemView.getContext());
                Bundle arguments = communityNotificationSettingsFragment.getArguments();
                String string = arguments != null ? arguments.getString("title") : null;
                if (string == null) {
                    string = "";
                }
                aVar2.h0(aVar.h6(R.string.community_disable_notifications_title, string));
                aVar2.c0(R.string.community_disable_notifications_yes, new hbh(communityNotificationSettingsFragment, 0));
                aVar2.W(R.string.community_disable_notifications_cancel, new ibh());
                aVar2.m();
                break;
            case 3:
                GiftItem giftItem = (GiftItem) obj;
                izs<GiftItem, s3q0> izsVar2 = ((l4m) obj2).i;
                if (izsVar2 != null) {
                    izsVar2.invoke(giftItem);
                    break;
                }
                break;
            case 4:
                ehw ehwVar = (ehw) obj;
                ((ghw) obj2).m.u2(new uai0(ehwVar.a, ehwVar.b));
                break;
            case 5:
                med0 med0Var = (med0) obj2;
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) obj;
                PrivacySetting privacySetting = med0Var.v;
                if (privacySetting != null) {
                    int i2 = med0Var.u;
                    if (i2 == 9987) {
                        Intent intent = new Intent(storySettingsActivity, (Class<?>) StoryPrivacySettingsActivity.class);
                        intent.putExtra("settings_key", privacySetting.b);
                        Activity a2 = d3r0.a(storySettingsActivity);
                        if (a2 != null) {
                            a2.startActivityForResult(intent, med0Var.u);
                            break;
                        }
                    } else if (i2 == 9988 && (a = d3r0.a(storySettingsActivity)) != null) {
                        LinkedHashSet<String> linkedHashSet = dam0.d;
                        PrivacyRules.Exclude a3 = dam0.a.a(privacySetting);
                        List arrayList = a3 != null ? new ArrayList(a3.b) : EmptyList.b;
                        NewsfeedRouter newsfeedRouter = med0Var.t;
                        if (newsfeedRouter != null) {
                            newsfeedRouter.P(new bc6(storySettingsActivity, new z77(a, 12)), new FriendsListParams.HiddenFriendsList(arrayList), FriendsListPrivacyType.STORY, 9988, false);
                            break;
                        }
                    }
                }
                break;
            case 6:
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) obj2;
                Context context2 = (Context) obj;
                if (dVar != null) {
                    dVar.dismiss();
                }
                Object tag = view.getTag();
                if (!epx.f(tag, "CANCEL") && epx.f(tag, "SETTINGS")) {
                    xwk.d().e().d(context2, Uri.parse("/settings/general"), LaunchContext.A, null);
                    break;
                }
                break;
            default:
                VideoToolbarView videoToolbarView = (VideoToolbarView) obj2;
                int i3 = VideoToolbarView.M;
                Set<View> set = g6z.a;
                ImageView imageView = videoToolbarView.n;
                g6z.c(imageView, imageView, !((VideoFile) obj).O9(), true, 48);
                ebs0 ebs0Var = videoToolbarView.t;
                if (ebs0Var != null) {
                    ebs0Var.bk(dss0.a);
                    break;
                }
                break;
        }
    }
}
