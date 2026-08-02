package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Recomposer;
import com.vk.attachpicker.di.PhotoEditorComponentImpl;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.channels.impl.post_settings.PostSettingsFragment;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.coowners.di.NewsfeedCoownersComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.snippet.ui.presentation.MusicSnippetsFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed_section.presentation.base.fragment.NewsfeedSectionFragment;
import com.vk.newsfeed.posting.impl.domain.model.EditingPost;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.privacyui.PrivacyEditFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.g650;
import xsna.ncg0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class q010 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q010(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj;
                int i2 = MarketItemCommentsFragment.j0;
                return marketItemCommentsFragment;
            case 1:
                ((vm30) obj).i.a();
                return s3q0.a;
            case 2:
                return ((MarketComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) obj)).a(fpf0.a(MarketComponent.class))).Ob();
            case 3:
                return Boolean.valueOf(((xvy) obj).j.a());
            case 4:
                ((rw40) obj).y.L0(new PlaybackActionMeta(21, 0L, 2, null));
                return s3q0.a;
            case 5:
                MusicSnippetsFragment musicSnippetsFragment = (MusicSnippetsFragment) obj;
                int i3 = MusicSnippetsFragment.Y;
                g650.a.b bVar = g650.a.b.b;
                musicSnippetsFragment.getClass();
                xn50.a.c(musicSnippetsFragment, bVar);
                return s3q0.a;
            case 6:
                return ((MusicFragmentComponent) m7m.a((AppCompatActivity) obj).a(fpf0.a(MusicFragmentComponent.class))).tc();
            case 7:
                return ((CommunityStrikesComponent) j6i.b((h7m) ((yx50) obj).C.getValue(), CommunityStrikesComponent.class)).ge();
            case 8:
                int i4 = ge60.l1;
                return ((BridgeComponent) m7m.d((ge60) obj).a(fpf0.a(BridgeComponent.class))).F();
            case 9:
                return (AuthBridgeComponent) ((mo60) obj).c().a(fpf0.a(AuthBridgeComponent.class));
            case 10:
                return new oax0(((AttachmentMappersComponent) ((NewsfeedMappersComponentImpl) obj).b.getValue()).f3());
            case 11:
                int i5 = NewsfeedSectionFragment.V;
                h3p0.b((NewsfeedSectionFragment) obj);
                return s3q0.a;
            case 12:
                return ((NewsFeedComponent) ((j070) obj).l.getValue()).Bb();
            case 13:
                qcy<Object>[] qcyVarArr = PhotoEditorComponentImpl.e;
                nwy nwyVar = ((PhotoEditorComponentImpl) obj).c;
                qcy<Object> qcyVar = PhotoEditorComponentImpl.e[1];
                return (naa0) nwyVar.c();
            case 14:
                return Boolean.valueOf(((PhotoGalleryView) obj).i);
            case 15:
                return ((NewsfeedCoownersComponent) ((k7m) m7m.f((y1c0) obj)).a(fpf0.a(NewsfeedCoownersComponent.class))).a();
            case 16:
                int i6 = PostSettingsFragment.Y;
                Bundle requireArguments = ((PostSettingsFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("channel_post_config", ChannelMsgSendConfig.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable5 = requireArguments.getParcelable("channel_post_config");
                    parcelable = (ChannelMsgSendConfig) (parcelable5 instanceof ChannelMsgSendConfig ? parcelable5 : null);
                }
                ChannelMsgSendConfig channelMsgSendConfig = (ChannelMsgSendConfig) parcelable;
                return channelMsgSendConfig == null ? ChannelMsgSendConfig.c : channelMsgSendConfig;
            case 17:
                Bundle bundle = ((rbc0) obj).a;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = bundle.getParcelable("editing_post", EditingPost.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    Parcelable parcelable6 = bundle.getParcelable("editing_post");
                    parcelable3 = (EditingPost) (parcelable6 instanceof EditingPost ? parcelable6 : null);
                }
                return (EditingPost) parcelable3;
            case 18:
                PrivacyEditFragment privacyEditFragment = (PrivacyEditFragment) obj;
                privacyEditFragment.So(privacyEditFragment.L0);
                return null;
            case 19:
                GoodFragment goodFragment = (GoodFragment) ((jid0) obj).e.c.c;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                goodFragment.so();
                return s3q0.a;
            case 20:
                vkd0 vkd0Var = (vkd0) obj;
                return new ald0(vkd0Var.a, vkd0Var.b);
            case 21:
                List<xqy> f = ((dsy) obj).i().f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((xqy) it.next()).getKey());
                }
                return j5g.S0(arrayList);
            case 22:
                xa80 xa80Var = (xa80) obj;
                if (xa80Var != null) {
                    xa80Var.b();
                }
                return s3q0.a;
            case 23:
                return ((j1e0) obj).f;
            case 24:
                return (cuu0) ((pbf0) obj).itemView;
            case 25:
                ((Recomposer) obj).I();
                return s3q0.a;
            case 26:
                ((s8g0) obj).e();
                return s3q0.a;
            case 27:
                return new ncg0.a((ncg0) obj);
            case 28:
                Toast.makeText((Context) obj, "on marusia voice clicked", 0).show();
                return s3q0.a;
            default:
                return (TextView) ((noi0) obj).findViewById(R.id.ecomm_service_cell_title);
        }
    }
}
