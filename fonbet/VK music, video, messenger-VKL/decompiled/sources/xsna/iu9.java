package xsna;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.a;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsView;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;
import xsna.q5b0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class iu9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ iu9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v41, types: [one.video.ad.ux.controls.OneVideoAdControlsView] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        OneVideoAdControlsViewNew oneVideoAdControlsViewNew;
        switch (this.b) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) this.c;
                return new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.b(layoutInflater.inflate(R.layout.vkim_msg_part_carousel_item, (ViewGroup) obj, false), layoutInflater, (RecyclerView.u) this.d, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.a) this.e).h);
            case 1:
                gta gtaVar = (gta) this.c;
                StoryPrivacyType storyPrivacyType = (StoryPrivacyType) this.d;
                StoryEntry storyEntry = (StoryEntry) this.e;
                ((i070) gtaVar.f.getValue()).f(true);
                gtaVar.d().m(storyPrivacyType.j());
                storyEntry.x0 = storyPrivacyType.j();
                return s3q0.a;
            case 2:
                yzs yzsVar = (yzs) this.c;
                CommunityAddContactsState.ContactField contactField = (CommunityAddContactsState.ContactField) this.d;
                tho0 tho0Var = (tho0) obj;
                ((wh50) this.e).setValue(tho0Var);
                yzsVar.invoke(contactField.d, tho0Var.a.c, new qko0(tho0Var.b));
                return s3q0.a;
            case 3:
                PopupWindow popupWindow = (PopupWindow) this.c;
                gvo gvoVar = (gvo) this.d;
                muo muoVar = (muo) this.e;
                popupWindow.dismiss();
                xuo xuoVar = gvoVar.a;
                xuoVar.d.onNext(EmptyList.b);
                cbb cbbVar = xuoVar.b;
                int i = muoVar.b;
                ((ivo) cbbVar.c).a.getClass();
                tfx tfxVar = new tfx("specials.hideEasterEggEvent", new oq(28), new pq(20));
                tfx.l(tfxVar, "event_id", i, 0, 0, 12);
                io.reactivex.rxjava3.internal.operators.observable.b1 Z = rsg0.Z(yfb.x(tfxVar));
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                itg0.g(Z.q(asu0.r()).o(asu0Var.d()), new yqf(xuoVar, 14), new com.vk.movika.sdk.base.observable.s(26));
                return s3q0.a;
            case 4:
                Playlist playlist = (Playlist) this.c;
                xh40 xh40Var = (xh40) this.d;
                UserId userId = (UserId) this.e;
                MusicTrack musicTrack = (MusicTrack) obj;
                if (playlist.b == -1) {
                    xh40Var.Q(userId, musicTrack, null, new yh40(xh40Var, musicTrack, playlist.Ib()));
                } else if (musicTrack == null || !musicTrack.S4()) {
                    xh40Var.Q(userId, musicTrack, playlist.Ib(), new yh40(xh40Var, musicTrack, playlist.Ib()));
                } else {
                    sg40 sg40Var = xh40Var.g;
                    if (sg40Var != null) {
                        sg40Var.e.i(userId, musicTrack, playlist.Ib());
                    }
                }
                return s3q0.a;
            case 5:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.c;
                String[] strArr = (String[]) this.d;
                com.vk.music.onboarding.impl.b bVar = (com.vk.music.onboarding.impl.b) this.e;
                if (ref$IntRef.element == strArr.length) {
                    ref$IntRef.element = 0;
                }
                TextView textView = bVar.w;
                int i2 = ref$IntRef.element;
                ref$IntRef.element = i2 + 1;
                textView.setText(strArr[i2]);
                return s3q0.a;
            case 6:
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE audio_track SET manifest_url = ? WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    V0.D3(3, str3);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                q5b0.a aVar = (q5b0.a) this.c;
                jl80 jl80Var = (jl80) this.d;
                wh50 wh50Var = (wh50) this.e;
                Context context = (Context) obj;
                com.vk.libvideo.api.ad.a aVar2 = aVar.b;
                je0 je0Var = aVar.a;
                if (aVar2 instanceof a.AbstractC1195a) {
                    a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar2;
                    a6z0 a = je0Var.f().a();
                    if (abstractC1195a instanceof a.AbstractC1195a.C1196a) {
                        throw null;
                    }
                    if (!(abstractC1195a instanceof a.AbstractC1195a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AdBannerData.a aVar3 = ((a.AbstractC1195a.b) abstractC1195a).d;
                    String str4 = aVar3.a;
                    Size size = new Size(aVar3.c, aVar3.d);
                    int i3 = (int) (aVar3.e * 1000.0f);
                    boolean z = aVar3.b;
                    boolean z2 = aVar3.f;
                    ArrayList<jh0> arrayList = aVar3.j;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    for (jh0 jh0Var : arrayList) {
                        arrayList2.add(new nej0(jh0Var.a, jh0Var.b, jh0Var.c, jh0Var.g, jh0Var.h, jh0Var.i, jh0Var.d));
                        context = context;
                    }
                    Context context2 = context;
                    AdBannerData.AdRedirectData adRedirectData = aVar3.g;
                    String str5 = adRedirectData.b;
                    Integer num = adRedirectData.c;
                    Integer num2 = adRedirectData.d;
                    String str6 = adRedirectData.e;
                    String str7 = adRedirectData.f;
                    sc0 sc0Var = new sc0(str4, size, i3, z, z2, a, arrayList2, new sh0(str5, num, num2, str6, str7 != null ? new kiw(str7) : null));
                    kzr0 kzr0Var = aVar.c;
                    OneVideoAdControlsViewNew oneVideoAdControlsViewNew2 = !z ? new OneVideoAdControlsViewNew(context2, null, 0, 14, 0) : new OneVideoAdControlsView(context2, null, 0, 14, 0);
                    oneVideoAdControlsViewNew2.setImageLoader(jl80Var);
                    oneVideoAdControlsViewNew2.setShoppableAdViewListener(new n5b0(aVar));
                    oneVideoAdControlsViewNew2.setShowAdShoppableProducts(kzr0Var.a);
                    oneVideoAdControlsViewNew2.setListener(new o5b0(aVar, kzr0Var, oneVideoAdControlsViewNew2));
                    if (!z) {
                        boolean z3 = kzr0Var.c;
                        boolean z4 = kzr0Var.e;
                        oneVideoAdControlsViewNew2.setState(new OneVideoAdBaseControls.c(z3 ? OneVideoAdBaseControls.Type.FULLSCREEN : (kzr0Var.a && z4) ? OneVideoAdBaseControls.Type.CATALOG_LARGE : z4 ? OneVideoAdBaseControls.Type.DISCOVERY : OneVideoAdBaseControls.Type.CATALOG_SMALL, abstractC1195a.b() == 1.0f ? OneVideoAdBaseControls.SoundState.ON : OneVideoAdBaseControls.SoundState.OFF, abstractC1195a.c(), -1, -1));
                        n9c0 postView = oneVideoAdControlsViewNew2.getPostView();
                        if (postView != null) {
                            je0Var.e(postView);
                        }
                    }
                    oneVideoAdControlsViewNew2.setAdBannerData(sc0Var);
                    oneVideoAdControlsViewNew = oneVideoAdControlsViewNew2;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OneVideoAdControlsViewNew oneVideoAdControlsViewNew3 = new OneVideoAdControlsViewNew(context, null, 0, 14, 0);
                    oneVideoAdControlsViewNew3.setImageLoader(jl80Var);
                    je0Var.d().getClass();
                    je0Var.d().getClass();
                    oneVideoAdControlsViewNew = oneVideoAdControlsViewNew3;
                }
                wh50Var.setValue(oneVideoAdControlsViewNew);
                View view = oneVideoAdControlsViewNew.getView();
                if (view != null) {
                    return view;
                }
                throw new NullPointerException("Controls view for ads is null");
        }
    }
}
