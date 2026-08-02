package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.coremedia.iso.boxes.MetaBox;
import com.facebook.soloader.MinElf;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.polls.Poll;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.QualityChooserViewState;
import com.vk.log.L;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.onepasspromo.impl.OnePassPromoFragment;
import com.vkontakte.android.sdk.SDKInviteDialog;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.an90;
import xsna.bcw0;
import xsna.fmc0;
import xsna.ghw0;
import xsna.gm50;
import xsna.o0r0;
import xsna.osb0;
import xsna.pvc0;
import xsna.qr60;
import xsna.x8a0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lw20 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lw20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Poll poll;
        kr5 kr5Var;
        ArrayList arrayList;
        xd50 xd50Var;
        Object obj2;
        switch (this.b) {
            case 0:
                nw20 nw20Var = (nw20) this.c;
                izs<? super View, s3q0> izsVar = nw20Var.E;
                if (izsVar != null) {
                    ?? r0 = nw20Var.d0;
                    izsVar.invoke(r0 != 0 ? r0 : null);
                }
                return s3q0.a;
            case 1:
                ((rg50) this.c).C((int) (((q9x) obj).a & 4294967295L));
                return s3q0.a;
            case 2:
                zs30 zs30Var = (zs30) this.c;
                at30 at30Var = zs30Var.h;
                if (at30Var != null && (poll = at30Var.h) != null) {
                    zs30Var.J4(poll);
                }
                return s3q0.a;
            case 3:
                lb40 lb40Var = (lb40) this.c;
                ((wh50) ((zak0) lb40Var.h).getValue()).setValue(Boolean.FALSE);
                lb40Var.a.invoke((sx40) obj);
                return s3q0.a;
            case 4:
                kea.w((qd40) this.c, false, null, false, 7);
                return s3q0.a;
            case 5:
                ((vh40) this.c).d.U((MusicTrack) obj);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((n8b0) obj).a.b == ((ro40) this.c).e.b);
            case 7:
                rt40 rt40Var = (rt40) this.c;
                tg50 tg50Var = rt40Var.n1;
                String str = ((bcw0.a) obj).a;
                tg50Var.c(new VkTopBar.k(str == null ? "" : str));
                if (str == null) {
                    str = "";
                }
                xn50.a.c(rt40Var, new ds40(str));
                return s3q0.a;
            case 8:
                kq50 kq50Var = (kq50) this.c;
                View view = (View) obj;
                cjx cjxVar = kq50Var.J;
                if (cjxVar != null) {
                    cjxVar.p(view, NativeAdContent.ViewTag.CTA);
                }
                kq50Var.s1(false);
                return s3q0.a;
            case 9:
                Throwable th = (Throwable) obj;
                ((uj60) this.c).f.k.h(th);
                L.e(th);
                return s3q0.a;
            case 10:
                lh80 lh80Var = (lh80) this.c;
                L.e("Error awaiting for slide up menu onboarding", (Throwable) obj);
                lh80Var.b.a(ghw0.m.a);
                return s3q0.a;
            case 11:
                OnePassPromoFragment onePassPromoFragment = (OnePassPromoFragment) this.c;
                int i = OnePassPromoFragment.R;
                ((ej80) onePassPromoFragment.N.getValue()).a();
                onePassPromoFragment.eo();
                FragmentActivity activity = onePassPromoFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 12:
                ((bn90) this.c).h.b(new an90.a((Throwable) obj));
                return s3q0.a;
            case 13:
                ((o8a0) this.c).i.b(x8a0.e.a);
                return s3q0.a;
            case 14:
                com.vk.photogallery.c cVar = (com.vk.photogallery.c) this.c;
                cVar.q.getText();
                cVar.b();
                return s3q0.a;
            case 15:
                ((vja0) this.c).a.getClass();
                dhw0 dhw0Var = com.vk.voip.ui.c.O;
                return (dhw0Var == null || (kr5Var = dhw0Var.N) == null) ? new kr5((AvatarBorderType) null, (h2z) null, (izs) null, 15) : kr5Var;
            case 16:
                mxa0 mxa0Var = (mxa0) this.c;
                MusicTrack b = ((u2b0) mxa0Var.d.getValue()).b();
                jxa0 s370Var = ((Boolean) obj).booleanValue() ? mxa0Var.b : new s370();
                if (b == null) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d() && s370Var.p()) {
                        r1 = true;
                    }
                }
                return Boolean.valueOf(r1);
            case 17:
                Playlist playlist = (Playlist) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(playlist.b), "id");
                w9yVar.d(Long.valueOf(playlist.c.b), "owner_id");
                w9yVar.e(playlist.e, "album_type");
                w9yVar.b(Boolean.valueOf(playlist.k), "is_explicit");
                w9yVar.c(Integer.valueOf(playlist.d), "type");
                w9yVar.g("original", playlist.f);
                w9yVar.g("followed", playlist.g);
                w9yVar.e(playlist.h, "title");
                w9yVar.e(playlist.i, "subtitle");
                w9yVar.e(playlist.j, "description");
                w9yVar.c(Integer.valueOf(playlist.l), "year");
                w9yVar.g("photo", playlist.m);
                w9yVar.e(playlist.n, "genres");
                w9yVar.e(playlist.o, "main_artist");
                w9yVar.e(playlist.p, "thumbs");
                w9yVar.e(playlist.r, "main_artists");
                w9yVar.e(playlist.s, "featured_artists");
                w9yVar.b(Boolean.valueOf(playlist.t), "is_following");
                w9yVar.c(Integer.valueOf(playlist.u), "plays");
                w9yVar.c(Integer.valueOf(playlist.v), "count");
                w9yVar.d(Long.valueOf(playlist.w), "update_time");
                w9yVar.e(playlist.x, "access_key");
                w9yVar.e(playlist.y, "audios");
                w9yVar.g("restriction", playlist.z);
                w9yVar.g(MetaBox.TYPE, playlist.A);
                w9yVar.g(SignalingProtocol.KEY_PERMISSIONS, playlist.B);
                w9yVar.b(Boolean.valueOf(playlist.C), "badge");
                w9yVar.b(Boolean.valueOf(playlist.D), "play_button");
                w9yVar.b(Boolean.valueOf(!playlist.E), "no_discover");
                w9yVar.e(playlist.F, "track_code");
                w9yVar.b(Boolean.valueOf(playlist.J), "is_curator");
                w9yVar.c(playlist.K, "match_score");
                w9yVar.e(playlist.L, "actions");
                w9yVar.b(Boolean.valueOf(playlist.M), "exclusive");
                w9yVar.e(playlist.N, "icon");
                w9yVar.c(Integer.valueOf(playlist.O), "flags_context");
                return s3q0.a;
            case 18:
                CatalogBlockItemsDto catalogBlockItemsDto = (CatalogBlockItemsDto) obj;
                PlaybackLaunchMeta playbackLaunchMeta = ((ihb0) this.c).a.b;
                CatalogBlockDto F = catalogBlockItemsDto.F();
                if ((F != null ? F.l0() : null) != CatalogBlockDataTypeDto.MUSIC_AUDIOS) {
                    return EmptyList.b;
                }
                List<AudioAudioDto> B = catalogBlockItemsDto.B();
                if (B != null) {
                    List<AudioAudioDto> list = B;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(oc4.d((AudioAudioDto) it.next()));
                    }
                } else {
                    arrayList = null;
                }
                List<String> C = F.C();
                if (C != null) {
                    ?? arrayList2 = new ArrayList();
                    for (String str2 : C) {
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (epx.f(String.valueOf(((MusicTrack) obj2).b), str2)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            MusicTrack musicTrack = (MusicTrack) obj2;
                            if (musicTrack != null) {
                                xd50Var = new xd50(musicTrack, playbackLaunchMeta);
                                if (xd50Var == null) {
                                    arrayList2.add(xd50Var);
                                }
                            }
                        }
                        xd50Var = null;
                        if (xd50Var == null) {
                        }
                    }
                    r3 = arrayList2;
                }
                return r3 == null ? EmptyList.b : r3;
            case 19:
                lsb0 lsb0Var = (lsb0) this.c;
                L.i((Throwable) obj);
                lsb0Var.T(new osb0.a(r3, 3));
                return s3q0.a;
            case 20:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                RecyclerView.Adapter L0 = postViewFragment.u0.L0(((Integer) obj).intValue());
                b2c0 b2c0Var = postViewFragment.s0;
                if (b2c0Var == null) {
                    b2c0Var = null;
                }
                if (epx.f(L0, b2c0Var)) {
                    return PostViewFragmentTimeSpentTracker.SectionType.Post;
                }
                vdg vdgVar = postViewFragment.t0;
                if (vdgVar == null) {
                    vdgVar = null;
                }
                if (epx.f(L0, vdgVar)) {
                    return PostViewFragmentTimeSpentTracker.SectionType.Comments;
                }
                return null;
            case 21:
                pvc0.a aVar = (pvc0.a) this.c;
                aVar.a();
                pvc0.this.e(new qvc0(qr60.a.b.a));
                return s3q0.a;
            case 22:
                c5d0 c5d0Var = (c5d0) this.c;
                fmc0.u uVar = (fmc0.u) obj;
                if (!(uVar instanceof fmc0.u.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PostingAttachment postingAttachment = ((fmc0.u.a) uVar).a;
                if (!hg10.l(c5d0Var.c)) {
                    c5d0Var.n.postDelayed(new ch5(2, c5d0Var, postingAttachment), 200L);
                }
                return s3q0.a;
            case 23:
                com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a aVar2 = (com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a) this.c;
                int i2 = com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a.p1;
                gm50.a.a(aVar2, ((QualityChooserViewState.a) obj).a, new kb40(aVar2, 18));
                return s3q0.a;
            case 24:
                ((wh50) this.c).setValue(new q9x(((q9x) obj).a));
                return s3q0.a;
            case 25:
                mze0 mze0Var = (mze0) this.c;
                long longValue = ((Long) obj).longValue();
                tze0 tze0Var = mze0Var.h1;
                Context requireContext = mze0Var.requireContext();
                tze0Var.getClass();
                xwk.e().m(requireContext, new UserId(longValue), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                mze0Var.hide();
                return s3q0.a;
            case 26:
                return new bs00((ViewGroup) obj, ((r2g0) this.c).i, true);
            case 27:
                ((SDKInviteDialog) this.c).W = (String) obj;
                return s3q0.a;
            case 28:
                final v2h0 v2h0Var = (v2h0) this.c;
                final JSONObject jSONObject = (JSONObject) obj;
                return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.y2h0
                    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[LOOP:0: B:14:0x004c->B:16:0x0052, LOOP_END] */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        final int i3;
                        JSONObject jSONObject2 = jSONObject;
                        final boolean optBoolean = jSONObject2 != null ? jSONObject2.optBoolean("icon", true) : true;
                        if (jSONObject2 != null) {
                            int optInt = jSONObject2.optInt("preferred_icon_size");
                            Integer valueOf = Integer.valueOf(optInt);
                            if (optInt <= 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                i3 = valueOf.intValue();
                                if (jSONObject2 != null || (r0 = jSONObject2.optString("sample_sbp_link")) == null) {
                                    String str3 = "";
                                }
                                List<p2h0> a = v2h0Var.a(str3);
                                w9y w9yVar2 = new w9y();
                                List<p2h0> list2 = a;
                                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                                for (final p2h0 p2h0Var : list2) {
                                    arrayList3.add(d370.C(new izs() { // from class: xsna.z2h0
                                        @Override // xsna.izs
                                        public final Object invoke(Object obj3) {
                                            Bitmap bitmap;
                                            w9y w9yVar3 = (w9y) obj3;
                                            p2h0 p2h0Var2 = p2h0.this;
                                            w9yVar3.e(p2h0Var2.a, "id");
                                            w9yVar3.e(p2h0Var2.c, "title");
                                            if (optBoolean) {
                                                Drawable drawable = p2h0Var2.b;
                                                if (drawable != null) {
                                                    int i4 = i3;
                                                    bitmap = xjo.c(drawable, i4, i4, 4);
                                                } else {
                                                    bitmap = null;
                                                }
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                if (bitmap != null) {
                                                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                                }
                                                w9yVar3.e(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0), "icon");
                                            }
                                            r2h0 r2h0Var = p2h0Var2.d;
                                            w9y w9yVar4 = new w9y();
                                            w9yVar4.e(r2h0Var.a, "packageName");
                                            w9yVar4.e(r2h0Var.b, "deeplinkScheme");
                                            s3q0 s3q0Var = s3q0.a;
                                            w9yVar3.e(w9yVar4.a, "launch_extra");
                                            return s3q0.a;
                                        }
                                    }));
                                }
                                w9yVar2.e(arrayList3, "items");
                                s3q0 s3q0Var = s3q0.a;
                                return w9yVar2.a;
                            }
                        }
                        i3 = 64;
                        if (jSONObject2 != null) {
                        }
                        String str32 = "";
                        List<p2h0> a2 = v2h0Var.a(str32);
                        w9y w9yVar22 = new w9y();
                        List<p2h0> list22 = a2;
                        ArrayList arrayList32 = new ArrayList(c5g.u(list22, 10));
                        while (r0.hasNext()) {
                        }
                        w9yVar22.e(arrayList32, "items");
                        s3q0 s3q0Var2 = s3q0.a;
                        return w9yVar22.a;
                    }
                }).q(asu0.a.c());
            default:
                pch0 pch0Var = (pch0) this.c;
                pch0Var.g = ((Boolean) obj).booleanValue();
                pch0Var.a();
                return s3q0.a;
        }
    }
}
