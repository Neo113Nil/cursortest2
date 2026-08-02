package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.antispam.ProfileSpamAction;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.translate.impl.models.LanguageModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.ikv0;
import xsna.k65;
import xsna.ky0;
import xsna.owg;
import xsna.xn50;

/* compiled from: AdsItemMviView.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class hy0 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float f;
        com.vk.photo.editor.features.colorgrading.a a;
        int i = 4;
        int i2 = 10;
        switch (this.b) {
            case 0:
                ky0 ky0Var = (ky0) obj;
                ly0 ly0Var = (ly0) this.receiver;
                a1r a1rVar = ly0Var.c;
                com.vk.clips.sdk.shared.item.ads.c cVar = ly0Var.a;
                if (ky0Var instanceof ky0.b) {
                    ly0Var.e.a(cVar.getContext(), ((ky0.b) ky0Var).a);
                } else if (ky0Var instanceof ky0.g) {
                    ly0Var.g.a(null);
                } else if (ky0Var instanceof ky0.c) {
                    ly0Var.f.a(((ky0.c) ky0Var).a);
                } else if (ky0Var instanceof ky0.a) {
                    Intent intent = ((ky0.a) ky0Var).a;
                    Activity L = blk.L(cVar);
                    if (L != null) {
                        L.startActivity(intent);
                    }
                } else if (ky0Var instanceof ky0.e) {
                    a1rVar.d(cVar.getContext(), ((ky0.e) ky0Var).a, false);
                } else if (ky0Var instanceof ky0.d) {
                    SdkClipVideoFile sdkClipVideoFile = ((ky0.d) ky0Var).a;
                    UserId b = dgd.b(sdkClipVideoFile);
                    if (b != null) {
                        ly0Var.d.o2(new SdkClipViewerClick.b(sdkClipVideoFile, false));
                        a1rVar.d(cVar.getContext(), b, true);
                    }
                } else if (ky0Var instanceof ky0.f) {
                    ly0Var.i.a(cVar.getContext(), ((ky0.f) ky0Var).a);
                } else {
                    if (!(ky0Var instanceof jy0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SdkClipVideoFile sdkClipVideoFile2 = ((jy0) ky0Var).a;
                    Activity L2 = blk.L(cVar);
                    if (L2 != null) {
                        ly0Var.h.a(sdkClipVideoFile2, ly0Var.b, L2);
                    }
                }
                return s3q0.a;
            case 1:
                yvg yvgVar = (yvg) this.receiver;
                yvgVar.getClass();
                yvgVar.T(new owg.c.a((nwg) obj));
                return s3q0.a;
            case 2:
                String str = (String) obj;
                kih kihVar = (kih) this.receiver;
                int i3 = kih.O;
                p8u p8uVar = (p8u) kihVar.t;
                if (p8uVar != null) {
                    kihVar.E.j(new pwc(str, p8uVar));
                }
                return s3q0.a;
            case 3:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.receiver;
                communityProfileFragment.getClass();
                xn50.a.c(communityProfileFragment, (CommunityProfileAction) obj);
                return s3q0.a;
            case 4:
                List list = (List) obj;
                xam xamVar = (xam) this.receiver;
                if (!hg1.d(xamVar.r)) {
                    ktk0 ktk0Var = xamVar.t;
                    InfoBar infoBar = ktk0Var.i;
                    qtd0 b2 = ktk0Var.b();
                    if (infoBar == null || b2 == null) {
                        edw edwVar = edw.a;
                        edw.d(R.string.vkim_msg_header_antispam_actions_failed, xamVar.i, false);
                    } else {
                        String str2 = infoBar.b;
                        String Y0 = xam.Y0(infoBar);
                        if (Y0 == null) {
                            Y0 = "";
                        }
                        String str3 = Y0;
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        io.reactivex.rxjava3.internal.operators.single.c C = xamVar.j.C(xamVar, new wim(Peer.a.b(xamVar.t.a.e), list.contains(ProfileSpamAction.DeleteChat.b), list.contains(ProfileSpamAction.BlackList.b), list.contains(ProfileSpamAction.Report.b), str2, str3, go9.b("from_", str2), xyb.D, b2.Q2(UserNameCase.NOM), b2.B2()));
                        asu0 asu0Var = asu0.a;
                        int i4 = 18;
                        xamVar.r = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(C.q(asu0Var.c()).m(asu0Var.d()), new el6(new u9(11, xamVar, list), i4)), new ot1(xamVar, i)), new mmf(xamVar, i4), new by5(i2, xamVar, list));
                    }
                }
                return s3q0.a;
            case 5:
                ((Boolean) obj).getClass();
                mem memVar = (mem) this.receiver;
                Context context = memVar.i;
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_animated_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar.u = new ikv0.d(context.getString(R.string.vkim_msg_report_spam_dialog_toast_message), (String) null, (ikv0.d.a) null, 6);
                pkv0.f(aVar);
                sem semVar = memVar.s;
                if (semVar != null) {
                    semVar.c().dismiss();
                }
                return s3q0.a;
            case 6:
                yqx yqxVar = (yqx) this.receiver;
                yqxVar.getClass();
                xn50.a.c(yqxVar, (gqx) obj);
                return s3q0.a;
            case 7:
                ((Boolean) obj).getClass();
                vm30 vm30Var = ((com.vk.im.ui.components.msg_list.a) this.receiver).o;
                if (vm30Var != null) {
                    vm30Var.e0.dismiss();
                }
                return s3q0.a;
            case 8:
                m670 m670Var = (m670) this.receiver;
                m670Var.getClass();
                if (((k65) obj) instanceof k65.e) {
                    vdx0 vdx0Var = e370.e;
                    m670Var.b.b((vdx0Var != null ? vdx0Var : null).e().n().r0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new cc20(new or50(m670Var, 3), 8), new tk40(new j4x(m670Var, 24), 5)));
                }
                return s3q0.a;
            case 9:
                LanguageModel languageModel = (LanguageModel) obj;
                i9i0 i9i0Var = (i9i0) this.receiver;
                i9i0Var.h = languageModel;
                i9i0Var.d.setText(languageModel.g());
                i9i0Var.b.Y0(languageModel);
                return s3q0.a;
            case 10:
                int intValue = ((Number) obj).intValue();
                com.vk.photo.editor.features.colorgrading.h hVar = (com.vk.photo.editor.features.colorgrading.h) this.receiver;
                v3p v3pVar = hVar.a;
                DashedSeekBar dashedSeekBar = hVar.o;
                List<f0g> list2 = hVar.h;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                int i5 = 0;
                for (Object obj2 : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList.add(f0g.a((f0g) obj2, i5 == intValue));
                    i5 = i6;
                }
                hVar.p.submitList(arrayList);
                com.vk.photo.editor.features.colorgrading.a b3 = com.vk.photo.editor.features.colorgrading.h.b(v3pVar.d());
                if (b3 != null) {
                    a.b bVar = b3.k;
                    float f2 = bVar.c;
                    float f3 = f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.5f : f2;
                    float f4 = bVar.d;
                    if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f4 = 0.5f;
                    }
                    if (hVar.g) {
                        f = f3;
                        a = com.vk.photo.editor.features.colorgrading.a.a(b3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, a.b.a(bVar, intValue + 1, 0, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 4095);
                    } else {
                        f = f3;
                        a = com.vk.photo.editor.features.colorgrading.a.a(b3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, a.b.a(bVar, 0, intValue + 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 5), 4095);
                    }
                    v3pVar.d().a(new EditorMessage.i(a, EditorMessage.Source.UserInput, 4));
                    float f5 = hVar.g ? f * 100.0f : f4 * 100.0f;
                    hVar.k.setText(hVar.b.getContext().getString(((f0g) arrayList.get(intValue)).c.a));
                    hVar.j.setText(String.valueOf(an10.b(f5)));
                    dashedSeekBar.a(f5, false);
                    dashedSeekBar.setEnabled(true);
                    hVar.n.setAlpha(1.0f);
                    if (hVar.d) {
                        hVar.d = false;
                        mmf mmfVar = hVar.c;
                        if (mmfVar != null) {
                            mmfVar.invoke(Boolean.FALSE);
                        }
                    }
                }
                return s3q0.a;
            case 11:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 12:
                ((com.vk.auth.ui.password.askpassword.a) this.receiver).b((io.reactivex.rxjava3.core.q) obj);
                return s3q0.a;
            default:
                ((sfv0) this.receiver).a((ufv0) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy0(Object obj, int i) {
        super(1, obj, CommunityProfileFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, xam.class, "executeProfileSpamActions", "executeProfileSpamActions(Ljava/util/List;)V", 0);
                break;
            case 5:
                super(1, obj, mem.class, "onMsgMarkAsSpamSuccess", "onMsgMarkAsSpamSuccess(Z)V", 0);
                break;
            case 6:
            case 7:
            case 8:
            case 10:
            default:
                break;
            case 9:
                super(1, obj, i9i0.class, "onOriginalLanguageSelected", "onOriginalLanguageSelected(Lcom/vk/translate/impl/models/LanguageModel;)V", 0);
                break;
            case 11:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, com.vk.auth.ui.password.askpassword.a.class, "runAuth", "runAuth(Lio/reactivex/rxjava3/core/Observable;)V", 0);
                break;
        }
    }
}
