package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.fragments.FragmentImpl;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.dto.clips.media.VideoConfigEditor;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.profile.community.api.widget.dto.CommunityWidgetPreviewArguments;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.polls.di.UxPollsComponentImpl;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.log.UrlSecretEraser;
import xsna.bex0;
import xsna.c8x0;
import xsna.ifz;
import xsna.ikv0;
import xsna.kne0;
import xsna.rg8;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ujm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ujm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Collection<qvw0> collection;
        boolean z;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                wjm0 wjm0Var = (wjm0) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bwt0.p0(wjm0Var.f, booleanValue);
                bwt0.p0(wjm0Var.e, !booleanValue);
                return s3q0.a;
            case 1:
                it80 it80Var = (it80) obj;
                pg8 pg8Var = ((StreamInfoFragment) this.c).Q;
                if (pg8Var != null) {
                    ViewGroup viewGroup = pg8Var.c;
                    ViewGroup viewGroup2 = pg8Var.e;
                    kfz kfzVar = pg8Var.i;
                    rg8 rg8Var = (rg8) it80Var.a;
                    pg8Var.a();
                    if (!pg8Var.n) {
                        ViewGroup viewGroup3 = pg8Var.a;
                        mk5 mk5Var = new mk5();
                        mk5Var.excludeChildren((View) pg8Var.h, true);
                        zmp0.a(viewGroup3, mk5Var);
                    }
                    ViewGroup viewGroup4 = pg8Var.f;
                    View view = pg8Var.b;
                    if (rg8Var instanceof rg8.c) {
                        bwt0.p0(view, true);
                        bwt0.p0(viewGroup, false);
                        bwt0.p0(viewGroup2, false);
                        kfzVar.submitList(EmptyList.b);
                    } else if (rg8Var instanceof rg8.e) {
                        bwt0.p0(view, true);
                        bwt0.p0(viewGroup, false);
                        bwt0.p0(viewGroup2, false);
                        kfzVar.submitList(EmptyList.b);
                    } else if (rg8Var instanceof rg8.b) {
                        bwt0.p0(view, false);
                        bwt0.p0(viewGroup2, false);
                        kfzVar.submitList(EmptyList.b);
                        bwt0.p0(viewGroup, true);
                        pg8Var.d.setText(zk70.b(((rg8.b) rg8Var).a));
                    } else if (rg8Var instanceof rg8.d) {
                        rg8.d dVar = (rg8.d) rg8Var;
                        bwt0.p0(view, false);
                        bwt0.p0(viewGroup, false);
                        bwt0.p0(viewGroup2, true);
                        ofz ofzVar = pg8Var.j;
                        Context context = ofzVar.a;
                        int i = dVar.i;
                        Collection<qvw0> collection2 = dVar.h;
                        boolean z3 = dVar.n;
                        boolean z4 = dVar.m;
                        boolean z5 = dVar.l;
                        boolean z6 = dVar.k;
                        boolean z7 = dVar.j;
                        ArrayList arrayList = new ArrayList();
                        if (dVar.p) {
                            arrayList.add(ifz.b.a);
                        }
                        if (z7 || z6 || z5 || z4 || z3) {
                            CharSequence charSequence = ofzVar.b;
                            if (charSequence == null) {
                                charSequence = context.getString(R.string.voip_broadcast_label_stats);
                            }
                            arrayList.add(new ifz.a(charSequence));
                            if (z7) {
                                collection = collection2;
                                z = z3;
                                arrayList.add(new ifz.e(context.getString(R.string.voip_broadcast_stats_views_total_count), uqm0.f(dVar.b)));
                            } else {
                                collection = collection2;
                                z = z3;
                            }
                            if (z6) {
                                arrayList.add(new ifz.e(context.getString(R.string.voip_broadcast_stats_views_unqiue_count), uqm0.f(dVar.c)));
                            }
                            if (z5) {
                                arrayList.add(new ifz.e(context.getString(R.string.voip_broadcast_stats_likes_count), uqm0.f(dVar.d)));
                            }
                            if (z4) {
                                arrayList.add(new ifz.e(context.getString(R.string.voip_broadcast_stats_comments_count), uqm0.f(dVar.e)));
                            }
                            if (z) {
                                arrayList.add(new ifz.f(dVar.a, dVar.f, dVar.g));
                            }
                        } else {
                            collection = collection2;
                        }
                        if (dVar.o && !collection.isEmpty() && i > 0) {
                            arrayList.add(new ifz.a(context.getString(R.string.voip_broadcast_label_spectators)));
                            for (qvw0 qvw0Var : collection) {
                                arrayList.add(new ifz.c(qvw0Var.getId(), qvw0Var.i(), qvw0Var.a()));
                            }
                            arrayList.add(new ifz.d(i));
                        }
                        kfzVar.submitList(arrayList);
                        bwt0.p0(viewGroup4, dVar.q);
                        z2 = false;
                    } else {
                        if (!(rg8Var instanceof rg8.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z2 = false;
                        bwt0.p0(view, false);
                        bwt0.p0(viewGroup, false);
                        bwt0.p0(viewGroup2, true);
                        kfzVar.submitList(EmptyList.b);
                        ((rg8.a) rg8Var).getClass();
                        bwt0.p0(viewGroup4, false);
                    }
                    pg8Var.n = z2;
                }
                return s3q0.a;
            case 2:
                ((uww0) this.c).invoke(obj);
                return s3q0.a;
            case 3:
                j1z j1zVar = (j1z) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) j1zVar.q).setValue(bool);
                return s3q0.a;
            case 4:
                return pn60.c(((u0p0) this.c).b, (NewsEntry) obj, null, null, 14);
            case 5:
                return UrlSecretEraser.a((UrlSecretEraser) this.c, (zk10) obj);
            case 6:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                com.vk.profile.user.impl.ui.i iVar = ((UserProfileFragment) this.c).Q;
                com.vk.profile.user.impl.ui.i iVar2 = iVar != null ? iVar : null;
                boolean z8 = (extendedUserProfile == null || extendedUserProfile.g()) ? false : true;
                com.vk.profile.user.impl.ui.a aVar = iVar2.h;
                aVar.i = z8;
                if (!z8) {
                    aVar.j = false;
                }
                iVar2.g.setEnabled(z8);
                iVar2.f.stopScroll();
                return s3q0.a;
            case 7:
                uvq0 uvq0Var = (uvq0) this.c;
                uvq0Var.s().w().b(153, uvq0Var.k);
                uvq0Var.s().w().b(155, uvq0Var.h);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(zou.a);
                Context context2 = e43.a;
                cuz.a(context2 != null ? context2 : null).b(uvq0Var.j, intentFilter);
                uvq0Var.s().w().b(9, uvq0Var.i);
                return s3q0.a;
            case 8:
                UxPollsComponentImpl uxPollsComponentImpl = (UxPollsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = UxPollsComponentImpl.i;
                return new com.vk.video.polls.nav.c((Context) obj, new gb70(1, uxPollsComponentImpl.v8().b(), a5r0.class, "hideEntryPoint", "hideEntryPoint(Lcom/vk/video/polls/entrypoint/model/UxPollEntryPoint;Z)V", 0));
            case 9:
                ((nrr0) this.c).l.p();
                return s3q0.a;
            case 10:
                VideoConfigEditor videoConfigEditor = (VideoConfigEditor) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(videoConfigEditor.b), "width");
                w9yVar.c(Integer.valueOf(videoConfigEditor.c), "height");
                w9yVar.c(Integer.valueOf(videoConfigEditor.d), "video_bitrate");
                w9yVar.c(Integer.valueOf(videoConfigEditor.e), "video_frame_rate");
                w9yVar.c(Integer.valueOf(videoConfigEditor.f), "duration");
                return s3q0.a;
            case 11:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                xn50.a.c(videoMinimizableDiscoveryFragment, new c.d0((DonutVideoAction) obj));
                return s3q0.a;
            case 12:
                return (xbu0) this.c;
            case 13:
                lcv0 lcv0Var = (lcv0) this.c;
                ysg0<Object> ysg0Var = ysg0.b;
                ysg0Var.a(new nru0(lcv0Var.getSearchParams(), true));
                ysg0Var.a(new iru0());
                return s3q0.a;
            case 14:
                ((l5v0) this.c).r = true;
                return s3q0.a;
            case 15:
                ((w6v0) this.c).y0();
                return s3q0.a;
            case 16:
                vuv0 vuv0Var = (vuv0) this.c;
                int intValue = ((Integer) obj).intValue();
                wnn0 wnn0Var = vuv0Var.e;
                wnn0 wnn0Var2 = wnn0Var != null ? wnn0Var : null;
                f4m.t(intValue, wnn0Var2.b);
                f4m.t(intValue, wnn0Var2.c);
                return s3q0.a;
            case 17:
                pwv0 pwv0Var = (pwv0) this.c;
                if (((Boolean) obj).booleanValue()) {
                    r6y r6yVar = pwv0Var.b;
                    if (r6yVar != null) {
                        bex0.a.b(r6yVar, JsApiMethodType.LEAVE_GROUP, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
                    }
                } else {
                    r6y r6yVar2 = pwv0Var.b;
                    if (r6yVar2 != null) {
                        bex0.a.a(r6yVar2, JsApiMethodType.LEAVE_GROUP, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                    }
                }
                return s3q0.a;
            case 18:
                com.vk.superapp.verification.account.f fVar = (com.vk.superapp.verification.account.f) this.c;
                com.vk.superapp.verification.account.d dVar2 = fVar.e;
                if (dVar2 != null) {
                    dVar2.I = true;
                }
                fVar.l(fVar.h.a());
                return s3q0.a;
            case 19:
                mjw0 mjw0Var = (mjw0) this.c;
                c8x0 c8x0Var = (c8x0) obj;
                if (c8x0Var instanceof c8x0.f) {
                    mjw0Var.I.c((c8x0.f) c8x0Var);
                } else if (c8x0Var instanceof c8x0.e) {
                    mjw0Var.K.b.setText(R.string.voip_waiting_room_label_waiting);
                    GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
                    GroupCallViewModel.GroupCallViewMode groupCallViewMode = GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode;
                    groupCallViewModel.getClass();
                    GroupCallViewModel.p(groupCallViewMode);
                    mjw0Var.setControlsAreHidden(false);
                    mjw0Var.s();
                } else if (c8x0Var instanceof c8x0.b) {
                    mjw0Var.s();
                } else if (c8x0Var instanceof c8x0.a) {
                    mjw0Var.s();
                } else if (!(c8x0Var instanceof c8x0.c) && !(c8x0Var instanceof c8x0.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 20:
                hkw0 hkw0Var = (hkw0) this.c;
                hrw0 hrw0Var = (hrw0) obj;
                ikv0 ikv0Var = hkw0Var.d;
                ViewGroup viewGroup5 = hkw0Var.a;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                Context context3 = viewGroup5.getContext();
                ikv0.a aVar2 = new ikv0.a(context3);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar2.u = new ikv0.d(context3.getString(R.string.voip_share_link_notification_title), (String) null, (ikv0.d.a) null, 6);
                aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context3.getString(R.string.voip_share_link_notification_action), new yd6(hkw0Var, context3, hrw0Var, 6));
                aVar2.o = Integer.valueOf(hkw0.e);
                aVar2.e = 10000L;
                aVar2.f = viewGroup5;
                aVar2.b = true;
                hkw0Var.d = aVar2.o(viewGroup5);
                return s3q0.a;
            case 21:
                s5x0 s5x0Var = (s5x0) obj;
                ((nrw0) this.c).p.a(s5x0Var, new p5x0(s5x0Var.d, cn70.a() * 6.0f), true);
                return s3q0.a;
            case 22:
                ((vvw0) this.c).T(new kne0.a.C3189a((Throwable) obj));
                return s3q0.a;
            case 23:
                f6x0 f6x0Var = (f6x0) this.c;
                String str = (String) obj;
                if (myc0.f(str)) {
                    VKImageView vKImageView = f6x0Var.l;
                    com.vk.voip.ui.c.b.getClass();
                    CallId b = com.vk.voip.ui.c.r.b();
                    if (b == null) {
                        b = CallId.e;
                    }
                    vKImageView.setImageDrawable(new s5x0(b, str, IronSourceError.ERROR_NO_INTERNET_CONNECTION, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, false));
                    f6x0Var.m.onNext(Boolean.TRUE);
                }
                return s3q0.a;
            case 24:
                g5i g5iVar = (g5i) this.c;
                qfx0.d.getClass();
                ((d0i) qfx0.h.getValue()).a(((FragmentImpl) obj).requireContext(), new CommunityWidgetPreviewArguments(g5iVar.a, g5iVar.d, new UserId(g5iVar.f), g5iVar.b, g5iVar.c, g5iVar.e, g5iVar.g, g5iVar.h));
                return s3q0.a;
            default:
                WriteBar writeBar = (WriteBar) this.c;
                s1y0 s1y0Var = writeBar.I;
                if (s1y0Var != null) {
                    s1y0Var.a(writeBar.getInputState());
                }
                return s3q0.a;
        }
    }
}
