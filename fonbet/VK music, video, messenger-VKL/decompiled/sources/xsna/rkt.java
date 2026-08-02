package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ironsource.Hb;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.clips.tool.view.nps.internal.moreless.MoreLessFeedbackView;
import com.vk.core.view.components.button.VkButton;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.geo.api.GeoFragmentOptions;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.im.engine.di.ImReportersScopedComponentImpl;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.log.L;
import com.vk.metrics.logging.PerfLogger;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ccx.a;
import xsna.h7u0;
import xsna.le60;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rkt implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rkt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        String str;
        Window window;
        int i = this.b;
        int i2 = 4;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                Bundle arguments = ((GeoFragment) obj).getArguments();
                if (arguments != null) {
                    return (GeoFragmentOptions) arguments.getParcelable("geo_fragment:options");
                }
                return null;
            case 1:
                return (TextView) ((piu) obj).findViewById(R.id.open_prefs_button);
            case 2:
                ((GroupVh) obj).s(true);
                return s3q0.a;
            case 3:
                return quv.e((quv) obj);
            case 4:
                return sdy.n(((ImReportersScopedComponentImpl) obj).a).r().O;
            case 5:
                return ((ccx) obj).new a();
            case 6:
                return ((StoryViewerComponent) ((k7m) m7m.f((zex) obj)).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 7:
                return ((MarketComponent) ((k7m) m7m.c((qtx) obj)).a(fpf0.a(MarketComponent.class))).l7();
            case 8:
                zfz zfzVar = (zfz) obj;
                try {
                    return zfzVar.getWritableDatabase();
                } catch (SQLiteException e) {
                    L.i(e);
                    zfzVar.getClass();
                    try {
                        zfzVar.close();
                    } catch (Throwable th) {
                        L.i(th);
                    }
                    try {
                        zfzVar.b.getDatabasePath(zfzVar.c).delete();
                    } catch (Throwable th2) {
                        L.i(th2);
                    }
                    return zfzVar.getWritableDatabase();
                }
            case 9:
                return ((VideoPlaybackSpeedComponent) ((k7m) m7m.c((k120) obj)).mo408a(fpf0.a(VideoPlaybackSpeedComponent.class))).m0();
            case 10:
                izs<? super MoreLessFeedbackView.FeedbackResult, s3q0> izsVar = ((MoreLessFeedbackView) obj).d;
                if (izsVar != null) {
                    izsVar.invoke(MoreLessFeedbackView.FeedbackResult.LESS);
                }
                return s3q0.a;
            case 11:
                int i3 = m740.l1;
                ((NewsFeedComponent) ((k7m) m7m.f((m740) obj)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 12:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((ni40) obj)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 13:
                MusicSelectorCatalogRootVh.a aVar = ((MusicSelectorCatalogRootVh) obj).q;
                if (aVar != null) {
                    aVar.c();
                }
                return s3q0.a;
            case 14:
                ((ne60) obj).f.e(le60.a.C3263a.a);
                return s3q0.a;
            case 15:
                vt60 vt60Var = (vt60) obj;
                it60 it60Var = (it60) vt60Var.e.getValue();
                yo60.j.a aVar2 = yo60.j.a.a;
                xk2 xk2Var = vt60Var.c;
                it60Var.getClass();
                it60.a(aVar2, xk2Var);
                return s3q0.a;
            case 16:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj;
                qcy<Object>[] qcyVarArr2 = NewsfeedSearchFragment.p0;
                return new dx60(new jw30(newsfeedSearchFragment, 7), new so40(newsfeedSearchFragment, i2), new k7z(newsfeedSearchFragment, 11), new cvs(newsfeedSearchFragment, 28));
            case 17:
                dx90 dx90Var = ow90.e;
                dx90Var.getClass();
                dx90Var.m = System.currentTimeMillis();
                dx90Var.r();
                mzp0 a = ((f170) obj).a();
                if (a != null) {
                    a.h();
                }
                new PerfLogger().a(PerfLogger.Event.NEWSFEED_DISPLAYED);
                return s3q0.a;
            case 18:
                int i4 = m8a0.v1;
                return ((s0e0) ((m8a0) obj).q1.getValue()).b();
            case 19:
                return Float.valueOf(((e2b0) obj).getVolume());
            case 20:
                return ((MarketComponent) ((k7m) m7m.f((y1c0) obj)).a(fpf0.a(MarketComponent.class))).l7();
            case 21:
                String[] strArr = PostViewFragment.T0;
                return ((BridgeComponent) m7m.d((PostViewFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 22:
                Bundle bundle = ((rbc0) obj).a;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable(Hb.b, Publisher.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = bundle.getParcelable(Hb.b);
                    parcelable = (Publisher) (parcelable3 instanceof Publisher ? parcelable3 : null);
                }
                return (Publisher) parcelable;
            case 23:
                enc0 enc0Var = (enc0) obj;
                return new com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a(new nnc0(enc0Var), enc0Var.i);
            case 24:
                return ((PostponedPostsFragment) obj).Z;
            case 25:
                return ((MarketComponent) ((k7m) m7m.f((pid0) obj)).a(fpf0.a(MarketComponent.class))).l7();
            case 26:
                dw20 dw20Var = ((lld0) obj).c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 27:
                ((omo) obj).onCancel();
                return s3q0.a;
            case 28:
                ProfileFriendsFragment profileFriendsFragment = (ProfileFriendsFragment) obj;
                int i5 = ProfileFriendsFragment.k0;
                FriendsListParams oo = profileFriendsFragment.oo();
                if (oo instanceof FriendsListParams.FriendsList) {
                    str = ((FriendsListParams.FriendsList) oo).c;
                } else {
                    if (!(oo instanceof FriendsListParams.FriendListCreation)) {
                        if (!(oo instanceof FriendsListParams.BestFriendsList) && !(oo instanceof FriendsListParams.HiddenFriendsList) && !(oo instanceof FriendsListParams.FriendsListsWithFriends)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return s3q0.a;
                    }
                    str = ((FriendsListParams.FriendListCreation) oo).b;
                }
                Context requireContext = profileFriendsFragment.requireContext();
                View inflate = LayoutInflater.from(requireContext).inflate(R.layout.lists_friends_creation_suggests, (ViewGroup) null, false);
                EditText editText = (EditText) inflate.findViewById(R.id.new_list_name_input_text);
                ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.new_list_name_input_text_clear);
                VkButton vkButton = (VkButton) inflate.findViewById(R.id.lists_friends_save);
                editText.addTextChangedListener(new wwd0(vkButton, imageButton));
                editText.setFilters(new m2r0[]{new m2r0()});
                editText.setText(str);
                editText.setSelection(str.length());
                editText.setEnabled(true);
                f4m.t(iah0.a(4), (FrameLayout) inflate.findViewById(R.id.new_list_name_container));
                bwt0.p0(imageButton, true);
                imageButton.setOnClickListener(new a06(editText, 10));
                jjc.g(vkButton, new fd5(profileFriendsFragment, editText, str, 6));
                vkButton.setEnabled(false);
                vkButton.setText(R.string.lists_friends_rename_save);
                h7u0.a aVar3 = new h7u0.a(requireContext);
                aVar3.f = inflate;
                String e2 = y8g0.e(R.string.lists_friends_create_name_title);
                AppCompatTextView appCompatTextView = new AppCompatTextView(requireContext);
                appCompatTextView.setText(String.valueOf(e2));
                int a2 = e3m.a(R.dimen.lists_friends_creation_title_top, requireContext);
                appCompatTextView.setPadding(a2, a2, a2, e3m.a(R.dimen.lists_friends_creation_title_bottom, requireContext));
                appCompatTextView.setGravity(17);
                appCompatTextView.setIncludeFontPadding(false);
                com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, Float.valueOf(24.0f), 4);
                appCompatTextView.setTextColor(krv0.l(R.attr.vk_ui_text_muted));
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                aVar3.a.e = appCompatTextView;
                androidx.appcompat.app.d m = aVar3.m();
                if (m != null && (window = m.getWindow()) != null) {
                    window.clearFlags(8);
                    window.clearFlags(131072);
                    window.setSoftInputMode(5);
                }
                if (m != null) {
                    profileFriendsFragment.d0 = m;
                    mhy.j(editText);
                }
                return s3q0.a;
            default:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) obj;
                qcy<Object>[] qcyVarArr3 = ReactionsFeedFragment.q0;
                return reactionsFeedFragment;
        }
    }
}
