package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.market.dto.MarketProfileInfoSimpleButtonDto;
import com.vk.attachpicker.impl.fragment.AttachMediaFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenArguments;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment.p;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.ClipVideoFile;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.Locale;
import org.json.JSONObject;
import xsna.hab;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        io.reactivex.rxjava3.disposables.c cVar;
        String url;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AbstractPollView abstractPollView = (AbstractPollView) obj2;
                AbstractPollView.c cVar2 = abstractPollView.b;
                if (cVar2 != null) {
                    cVar2.J3(abstractPollView.getPoll(), abstractPollView.e);
                }
                return s3q0.a;
            case 1:
                e12 e12Var = (e12) obj2;
                wh50 wh50Var = e12Var.k;
                wh50 wh50Var2 = e12Var.f;
                Object value = ((zak0) wh50Var).getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = ((vak0) e12Var.i).getFloatValue();
                if (Float.isNaN(floatValue)) {
                    return ((zak0) wh50Var2).getValue();
                }
                Object value2 = ((zak0) wh50Var2).getValue();
                ugo e = e12Var.e();
                float c = e.c(value2);
                if (c != floatValue && !Float.isNaN(c)) {
                    if (c < floatValue) {
                        Object b = e.b(floatValue, true);
                        if (b != null) {
                            return b;
                        }
                    } else {
                        Object b2 = e.b(floatValue, false);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                return value2;
            case 2:
                ((qfj) obj2).invoke();
                return s3q0.a;
            case 3:
                new b.d(new JSONObject((String) obj2), i2, "article_analytics_event").e();
                return s3q0.a;
            case 4:
                int i3 = AttachMediaFragment.S;
                return ((BridgeComponent) m7m.d((AttachMediaFragment) obj2).a(fpf0.a(BridgeComponent.class))).id();
            case 5:
                ((u86) obj2).Hk();
                return s3q0.a;
            case 6:
                return ((SearchParamsComponent) ((k7m) m7m.f((om6) obj2)).a(fpf0.a(SearchParamsComponent.class))).C4();
            case 7:
                return Boolean.valueOf(((BaseVideoAutoPlayHolder) obj2).t);
            case 8:
                return h5s.c(((qr6) obj2).o, " after successful upload", new StringBuilder("UPLOAD_TRACE upload: no directLink received for attach "));
            case 9:
                ((izs) ((zak0) ((xn7) obj2).b).getValue()).invoke(a.c.b.b);
                return s3q0.a;
            case 10:
                ((m99) obj2).u();
                return s3q0.a;
            case 11:
                return (RecyclerView) obj2;
            case 12:
                CatalogSectionScreenFragment catalogSectionScreenFragment = (CatalogSectionScreenFragment) obj2;
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                cea fo = catalogSectionScreenFragment.fo();
                Bundle requireArguments = catalogSectionScreenFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arguments", CatalogSectionScreenArguments.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arguments");
                    if (!(parcelable2 instanceof CatalogSectionScreenArguments)) {
                        parcelable2 = null;
                    }
                    obj = (CatalogSectionScreenArguments) parcelable2;
                }
                CatalogSectionScreenArguments catalogSectionScreenArguments = (CatalogSectionScreenArguments) obj;
                return catalogSectionScreenFragment.fo().g(cea.a(fo, catalogSectionScreenArguments != null ? catalogSectionScreenArguments.d : null, 6));
            case 13:
                ((zak0) ((noa) obj2).r).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 14:
                int i4 = ChannelFragment.a1;
                return (VkOnboardingComponent) m7m.d((ChannelFragment) obj2).a(fpf0.a(VkOnboardingComponent.class));
            case 15:
                ChannelProfileFragment channelProfileFragment = (ChannelProfileFragment) obj2;
                int i5 = ChannelProfileFragment.e0;
                return new p9b((ixa) channelProfileFragment.V.getValue(), (v8b) channelProfileFragment.W.getValue());
            case 16:
                ((uab) obj2).d.invoke(hab.d.b);
                return s3q0.a;
            case 17:
                return i5s.a(new StringBuilder(), ((wgb) obj2).s, ": updateExpiredHistory: update expired profiles");
            case 18:
                ChatFragment chatFragment = (ChatFragment) obj2;
                chatFragment.G0 = null;
                chatFragment.v0 = null;
                if (!chatFragment.isResumed() || !chatFragment.isAdded() || !chatFragment.isVisible()) {
                    return s3q0.a;
                }
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.V0();
                imv imvVar = chatFragment.J0;
                (imvVar != null ? imvVar : null).onResume();
                return s3q0.a;
            case 19:
                jsb jsbVar = (jsb) obj2;
                Context context = e43.a;
                Resources resources = (context != null ? context : null).getResources();
                int i6 = jsbVar.b.i;
                return resources.getQuantityString(R.plurals.group_chats_members, i6, Integer.valueOf(i6)).toLowerCase(Locale.ROOT);
            case 20:
                tsu tsuVar = ((azb) obj2).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).v) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 21:
                z4c z4cVar = (z4c) obj2;
                return new lbq0(z4cVar, z4cVar.i);
            case 22:
                fgc fgcVar = (fgc) obj2;
                dw20 dw20Var = fgcVar.a.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                ggc ggcVar = fgcVar.b;
                MarketProfileInfoSimpleButtonDto j = ggcVar.b.j();
                if (j != null && (url = j.getUrl()) != null) {
                    maz.c(ggcVar.c, ggcVar.a, url, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 23:
                wsc wscVar = (wsc) obj2;
                irk0 irk0Var = wscVar.c;
                if (irk0Var != null) {
                    return new buc(wscVar.b.getCurrentState().i, irk0Var);
                }
                return null;
            case 24:
                int i7 = ClipFeedListFragment.a2;
                return ((ClipFeedListFragment) obj2).new p();
            case 25:
                return (TextView) ((q8d) obj2).b().findViewById(R.id.video_single_clip_title);
            case 26:
                return ClipVideoFile.Jb((ClipVideoFile) obj2);
            case 27:
                return (RecyclerView) ((pid) obj2).findViewById(R.id.clips_authors_selector_recycler);
            case 28:
                ((mqd) obj2).w0("@");
                return s3q0.a;
            default:
                return ((CameraClipsComponent) ((k7m) m7m.f((fxd) obj2)).a(fpf0.a(CameraClipsComponent.class))).X9();
        }
    }
}
