package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.holders.MusicDynamicGridVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.e3m;
import xsna.ejd0;
import xsna.ghc0.b;
import xsna.pnb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cr20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cr20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0265, code lost:
    
        if (((java.lang.Boolean) r0.A.getValue()).booleanValue() == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        a1w a1wVar;
        Parcelable parcelable;
        Object parcelable2;
        boolean z = true;
        switch (this.b) {
            case 0:
                wh50 wh50Var = ((dr20) this.c).n;
                ((zak0) wh50Var).setValue(Boolean.valueOf(true ^ ((Boolean) ((zak0) wh50Var).getValue()).booleanValue()));
                return s3q0.a;
            case 1:
                com.vk.photo.editor.features.mlenhance.c cVar = (com.vk.photo.editor.features.mlenhance.c) this.c;
                v3p v3pVar = cVar.c;
                return new com.vk.photo.editor.features.mlenhance.a(v3pVar, cVar.m, cVar.d, g5z.a(v3pVar.w()));
            case 2:
                ((com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) this.c).e(b.j.a);
                return s3q0.a;
            case 3:
                fo30 fo30Var = (fo30) this.c;
                if (iah0.w(fo30Var.a()) >= iah0.a(360)) {
                    Context a = fo30Var.a();
                    e3m.a aVar = e3m.a;
                    return m33.a(R.drawable.vk_icon_pause_36, a);
                }
                Context a2 = fo30Var.a();
                e3m.a aVar2 = e3m.a;
                return m33.a(R.drawable.vk_icon_pause_24, a2);
            case 4:
                MsgViewFragment msgViewFragment = (MsgViewFragment) this.c;
                int i = MsgViewFragment.i0;
                Peer peer = (Peer) msgViewFragment.S.getValue();
                if (BuildInfo.s() && peer.Ab(Peer.Type.GROUP)) {
                    a1wVar = q1w.b;
                    if (a1wVar == null) {
                        return null;
                    }
                } else {
                    a1wVar = q1w.a;
                    if (a1wVar == null) {
                        return null;
                    }
                }
                return a1wVar;
            case 5:
                return ((AuthBridgeComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) this.c)).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 6:
                return ((BridgeComponent) ((k7m) m7m.f((MusicDynamicGridVh) this.c)).a(fpf0.a(BridgeComponent.class))).p();
            case 7:
                MusicHidingToolbarVh musicHidingToolbarVh = (MusicHidingToolbarVh) this.c;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i2 = com.vk.toggle.b.A.i(MusicFeatures.VK_MIX_ANIMATION);
                if (i2 != null) {
                    JSONObject g = i2.g();
                    boolean z2 = g != null && g.optBoolean("exclude");
                    if (p1p0.a(i2)) {
                        if (!z2) {
                            break;
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 8:
                Bundle arguments = ((ko40) this.c).getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("extra_is_tablet") : false);
            case 9:
                return ((g850) this.c).a.findViewById(R.id.ads_image_container);
            case 10:
                return ((OnboardingComponent) j6i.b((h7m) ((yx50) this.c).C.getValue(), OnboardingComponent.class)).Yd();
            case 11:
                mo60 mo60Var = (mo60) this.c;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) mo60Var.j.getValue()).cc());
            case 12:
                nwy nwyVar = ((NewsfeedMappersComponentImpl) this.c).h;
                qcy<Object> qcyVar = NewsfeedMappersComponentImpl.o[4];
                return new u9x0((oax0) nwyVar.c());
            case 13:
                ax60 ax60Var = (ax60) this.c;
                mo60 mo60Var2 = ax60Var.a;
                return new hv50(mo60Var2.X, mo60Var2.Y, ((NewsFeedComponent) ax60Var.c.getValue()).cc());
            case 14:
                b2r b2rVar = ((com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) this.c).h;
                if (b2rVar != null) {
                    return b2rVar.b.getContext();
                }
                return null;
            case 15:
                return "OneVideoLivePlayer.maybeReportFirstFrameDecoded() - state= " + ((wl80) this.c).G;
            case 16:
                return (IconCompat) ((po80) this.c).b.c.invoke();
            case 17:
                return ((tm90) this.c).itemView.findViewById(R.id.past_asr_list_divider);
            case 18:
                bca0 bca0Var = (bca0) this.c;
                if (bca0Var.r.isAttachedToWindow()) {
                    bca0Var.r.requestLayout();
                }
                return s3q0.a;
            case 19:
                o3b0 o3b0Var = (o3b0) this.c;
                qcy<Object>[] qcyVarArr = o3b0.m1;
                return ((BridgeComponent) m7m.d(o3b0Var).a(fpf0.a(BridgeComponent.class))).Le().w();
            case 20:
                aob0 aob0Var = (aob0) this.c;
                List<qv2> list = aob0Var.f.invoke().b;
                List<qv2> list2 = aob0Var.h.invoke().b;
                Iterator<qv2> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (!list2.contains((qv2) next)) {
                            r4 = next;
                        }
                    }
                }
                qv2 qv2Var = (qv2) r4;
                if (qv2Var != null) {
                    ArrayList arrayList = new ArrayList(new wow(list));
                    arrayList.remove(qv2Var);
                    arrayList.add(qv2Var);
                    aob0Var.g.invoke(new wow<>(arrayList));
                    ArrayList arrayList2 = new ArrayList(new wow(list2));
                    arrayList2.add(qv2Var);
                    List O0 = j5g.O0(arrayList2);
                    aob0Var.i.invoke(new wow<>(O0));
                    aob0Var.a.invoke(new pnb0.a.c(aob0Var.b.invoke(), arrayList, O0, aob0Var.d.invoke().b));
                }
                return s3q0.a;
            case 21:
                return ((NewsFeedComponent) ((y1c0) this.c).f.getValue()).w();
            case 22:
                PostFragment postFragment = (PostFragment) this.c;
                int i3 = PostFragment.S0;
                try {
                    VkTopBar vkTopBar = postFragment.r0;
                    if (vkTopBar != null) {
                        awt0.q(vkTopBar);
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable unused) {
                }
                return s3q0.a;
            case 23:
                Bundle bundle = ((rbc0) this.c).a;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("editing_reason", PostEditingReason.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Object parcelable3 = bundle.getParcelable("editing_reason");
                    parcelable = (PostEditingReason) (parcelable3 instanceof PostEditingReason ? parcelable3 : null);
                }
                PostEditingReason postEditingReason = (PostEditingReason) parcelable;
                if (postEditingReason != null) {
                    return postEditingReason;
                }
                throw new IllegalArgumentException("Editing reason should be specified when creating PostingFragment");
            case 24:
                return ((ghc0) this.c).new b();
            case 25:
                ((kxw) this.c).b.invoke(Boolean.TRUE);
                return s3q0.a;
            case 26:
                PrivacyEditFragment privacyEditFragment = (PrivacyEditFragment) this.c;
                privacyEditFragment.So(privacyEditFragment.M0);
                return null;
            case 27:
                ((jid0) this.c).g.invoke(ejd0.g.a.b);
                return s3q0.a;
            case 28:
                vkd0 vkd0Var = (vkd0) this.c;
                return new qjd0(vkd0Var.a, vkd0Var.b);
            default:
                ProfileFriendsFragment profileFriendsFragment = (ProfileFriendsFragment) this.c;
                int i4 = ProfileFriendsFragment.k0;
                return (FriendsListParams) profileFriendsFragment.requireArguments().getParcelable("ProfileFriendsFragment.params");
        }
    }
}
