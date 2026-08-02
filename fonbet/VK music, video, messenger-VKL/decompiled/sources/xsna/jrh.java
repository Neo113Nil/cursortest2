package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.group.GroupInviteVh;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.album.editor.cover.presentation.b;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.log.L;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.api.DependencyAllRule;
import com.vk.photo.editor.features.mlenhance.b;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.resetcounters.api.di.ResetCountersComponent;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.ok.android.utils.Logger;
import xsna.r5p;
import xsna.udt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jrh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jrh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 3;
        Object obj = this.c;
        switch (i) {
            case 0:
                lrh lrhVar = (lrh) obj;
                return new ruh(lrhVar.e, lrhVar.s());
            case 1:
                int i3 = com.vk.profile.community.impl.ui.trust_mark.a.p1;
                return ((BridgeComponent) m7m.d((com.vk.profile.community.impl.ui.trust_mark.a) obj).a(fpf0.a(BridgeComponent.class))).p().e();
            case 2:
                Context context = ((fhl) obj).a.getContext();
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d(context));
            case 3:
                String str = ((DependencyAllRule) obj).d;
                if (str != null) {
                    return new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.StringText(str), null, 4, null);
                }
                return null;
            case 4:
                int i4 = DialogsScreenFragment.p0;
                return ((ImExperimentsComponent) m7m.d((DialogsScreenFragment) obj).a(fpf0.a(ImExperimentsComponent.class))).getExperiments();
            case 5:
                return ((DiscoverMediaTabFragment2) obj).o0;
            case 6:
                int i5 = DiscoverSearchFragment.s0;
                Object obj2 = DiscoverSearchTabs.a;
                Bundle arguments = ((DiscoverSearchFragment) obj).getArguments();
                if (arguments != null) {
                    arguments.getString("KEY_AD_CAMPAIGN_SOURCE");
                }
                return new DiscoverSearchTabs.a(R.string.discover_search_all, new jg0(16), null, R.string.search, DiscoverSearchTabs.SearchTabName.SearchAll.i());
            case 7:
                dw20 dw20Var = ((DisplayAudioBookChaptersFragment) obj).R;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 8:
                int i6 = DonutReactionButtonView.h;
                Drawable background = ((DonutReactionButtonView) obj).getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                Drawable drawable = rippleDrawable != null ? rippleDrawable.getDrawable(0) : null;
                if (drawable instanceof GradientDrawable) {
                    return (GradientDrawable) drawable;
                }
                return null;
            case 9:
                r5p r5pVar = (r5p) obj;
                return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(r5pVar.c.F(new k5(new r5p.a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 19)), new m5(new d9j(r5pVar, 4), 21), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new xv(r5pVar, i2));
            case 10:
                int i7 = EntriesListFragment.m0;
                FragmentActivity activity = ((EntriesListFragment) obj).getActivity();
                if (activity != null) {
                    return activity.findViewById(R.id.bottom_nav_content);
                }
                return null;
            case 11:
                return ((ResetCountersComponent) m7m.d(((l1s) obj).n).a(fpf0.a(ResetCountersComponent.class))).b();
            case 12:
                int i8 = GiftsCatalogFragment.c0;
                ((GiftsCatalogFragment) obj).eo();
                return s3q0.a;
            case 13:
                return ((y4u) obj).l.G2();
            case 14:
                int i9 = GoodPreviewFragment.X;
                return new drd0((zqd0) ((GoodPreviewFragment) obj).R.getValue());
            case 15:
                ((GroupInviteVh) obj).a(false);
                return s3q0.a;
            case 16:
                return Integer.valueOf(((udt.d) obj).b.size() * 2000);
            case 17:
                return new PorterDuffColorFilter(((fqv) obj).b.o, PorterDuff.Mode.SRC_IN);
            case 18:
                return (ImConfigurationComponent) ((g8m) obj).a(fpf0.a(ImConfigurationComponent.class));
            case 19:
                new FriendsImportFragment.b(R.string.friends_recommendations_contacts).k((Activity) obj);
                return s3q0.a;
            case 20:
                int i10 = JoinCallFragment.U;
                return ((b25) obj).c();
            case 21:
                return new t1n0(((com.vk.superapp.vibration.js.bridge.impl.a) obj).b);
            case 22:
                ((zdo0) obj).onCancel();
                return s3q0.a;
            case 23:
                int i11 = MarketEditAlbumCoverFragment.d0;
                ((MarketEditAlbumCoverFragment) obj).ko();
                return s3q0.a;
            case 24:
                ((com.vk.ecomm.market.album.editor.cover.presentation.a) obj).b.b(b.a.a);
                return s3q0.a;
            case 25:
                return ((MarketItemCommentsFragment) obj).U;
            case 26:
                return (VkImage) ((l910) obj).findViewById(R.id.iv_info_badge);
            case 27:
                File externalFilesDir = ((rq10) obj).a.getExternalFilesDir(Environment.DIRECTORY_DCIM);
                if (externalFilesDir == null) {
                    return null;
                }
                return externalFilesDir.getAbsolutePath() + "/Camera/";
            case 28:
                com.vk.photo.editor.features.mlenhance.c cVar = (com.vk.photo.editor.features.mlenhance.c) obj;
                boolean z = cVar.q;
                v3p v3pVar = cVar.c;
                if (z) {
                    return s3q0.a;
                }
                o3p o3pVar = cVar.o;
                if (o3pVar == null) {
                    return s3q0.a;
                }
                v3pVar.b().b(b.e.a);
                cVar.q = true;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                Set<f5p> keySet = ((EditorState) v3pVar.d().b.b.getValue()).b.keySet();
                for (Map.Entry<f5p, g5p> entry : ((EditorState) v3pVar.d().b.b.getValue()).b.entrySet()) {
                    f5p key = entry.getKey();
                    g5p value = entry.getValue();
                    if (keySet.contains(key)) {
                        hashMap2.put(key, value);
                    } else {
                        hashMap.put(key, value);
                    }
                }
                v3pVar.d().a(new EditorMessage.f(new i4p(o3pVar.b, (e4p) null, 6), pn00.n(hashMap, on00.f(new Pair(ot20.a, new dc0(hashMap2)))), false));
                new Handler(Looper.getMainLooper()).postDelayed(new yy4(i2, cVar, o3pVar), 500L);
                return s3q0.a;
            default:
                return ((fo30) obj).a().getString(R.string.vkim_accessibility_icon_pause);
        }
    }
}
