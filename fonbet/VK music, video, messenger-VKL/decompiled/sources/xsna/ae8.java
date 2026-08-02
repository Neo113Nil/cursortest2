package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StubAddStoriesContainer;
import com.vk.log.L;
import com.vk.method.selector.impl.MethodSelectorView;
import com.vk.method.selector.impl.a;
import com.vk.music.view.ThumbsImageView;
import com.vk.registration.funnels.b;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e3m;
import xsna.enr0;
import xsna.h5b0;
import xsna.k8z;
import xsna.qbx;
import xsna.tts0;
import xsna.yj20;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ae8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0204 A[SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object next;
        Integer valueOf;
        Integer valueOf2;
        int i;
        String a;
        String str;
        int H;
        int i2;
        yj20 aVar;
        g5b0 qbxVar;
        int i3 = 1;
        switch (this.b) {
            case 0:
                ((ke8) this.receiver).s.setEnabled(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 1:
                atd atdVar = (atd) this.receiver;
                atdVar.f.invoke(new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.DELETE_DRAFT));
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                qt5 qt5Var = new qt5(3, (jdo) obj, atdVar);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(qt5Var);
                return s3q0.a;
            case 2:
                ((iqf) this.receiver).T((ttf) obj);
                return s3q0.a;
            case 3:
                ((cpk) this.receiver).b(R.string.voip_add_custom_virtual_background_upload_error);
                L.e("save custom virtual background error", (Throwable) obj);
                return s3q0.a;
            case 4:
                Country country = (Country) obj;
                com.vk.auth.enterphone.a aVar2 = (com.vk.auth.enterphone.a) this.receiver;
                aVar2.C = country;
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                String valueOf3 = String.valueOf(country.b);
                bVar.getClass();
                com.vk.registration.funnels.b.u(valueOf3);
                cpp cppVar = (cpp) aVar2.a;
                if (cppVar != null) {
                    cppVar.bj(country);
                }
                return s3q0.a;
            case 5:
                return ak10.n((ak10) this.receiver, (String) obj);
            case 6:
                com.vk.method.selector.impl.b bVar2 = (com.vk.method.selector.impl.b) this.receiver;
                Context context = bVar2.g;
                List<cyo> list = ((gxo) obj).a;
                enr0 enr0Var = bVar2.n;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList(j5g.D0(new lnt(1), arrayList));
                        if (bVar2.f != null && arrayList2.size() > 1) {
                            p4g.m(arrayList2, new ee8(bVar2, 10));
                        }
                        if (!bVar2.d) {
                            Iterator it2 = arrayList2.iterator();
                            if (it2.hasNext()) {
                                valueOf = Integer.valueOf(((yj20) it2.next()).a());
                                while (it2.hasNext()) {
                                    Integer valueOf4 = Integer.valueOf(((yj20) it2.next()).a());
                                    if (valueOf.compareTo(valueOf4) < 0) {
                                        valueOf = valueOf4;
                                    }
                                }
                            } else {
                                valueOf = null;
                            }
                            int intValue = valueOf != null ? valueOf.intValue() : 0;
                            String string = context.getString(R.string.vk_otp_method_selection_verification_methods_restore_access_title);
                            arrayList2.add(new yj20.b(string, intValue, string));
                            if (otu0.a()) {
                                Iterator it3 = arrayList2.iterator();
                                if (it3.hasNext()) {
                                    valueOf2 = Integer.valueOf(((yj20) it3.next()).a());
                                    while (it3.hasNext()) {
                                        Integer valueOf5 = Integer.valueOf(((yj20) it3.next()).a());
                                        if (valueOf2.compareTo(valueOf5) < 0) {
                                            valueOf2 = valueOf5;
                                        }
                                    }
                                } else {
                                    valueOf2 = null;
                                }
                                int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
                                String string2 = context.getString(R.string.vk_auth_help_button);
                                arrayList2.add(new yj20.a(string2, intValue2 + 1, string2));
                            }
                        }
                        com.vk.method.selector.impl.a bVar3 = arrayList2.isEmpty() ? a.c.a : new a.b(arrayList2);
                        bVar2.o = bVar3;
                        MethodSelectorView methodSelectorView = bVar2.h;
                        if (methodSelectorView != null) {
                            methodSelectorView.setState(bVar3);
                        }
                        com.vk.method.selector.impl.c cVar = bVar2.p;
                        cVar.a = bVar2.o;
                        cVar.getClass();
                        cVar.c(new jk20(0, b.a.a, b.a.class, "onAvailableFactors", "onAvailableFactors()V", 0));
                        com.vk.method.selector.impl.a aVar3 = bVar2.o;
                        if (aVar3 instanceof a.b) {
                            List<yj20> list2 = ((a.b) aVar3).a;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (obj2 instanceof yj20.c) {
                                    arrayList3.add(obj2);
                                }
                            }
                            Iterator it4 = arrayList3.iterator();
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (it4.hasNext()) {
                                    int h = ((yj20.c) next).h();
                                    do {
                                        Object next2 = it4.next();
                                        int h2 = ((yj20.c) next2).h();
                                        if (h < h2) {
                                            next = next2;
                                            h = h2;
                                        }
                                    } while (it4.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            yj20.c cVar2 = (yj20.c) next;
                            if (cVar2 != null) {
                                vk20 vk20Var = new vk20(cVar2.h(), list2, bVar2.j);
                                vk20Var.start();
                                bVar2.k = vk20Var;
                            }
                        }
                        return s3q0.a;
                    }
                    cyo cyoVar = (cyo) it.next();
                    enr0Var.getClass();
                    String str2 = cyoVar.d;
                    VerificationMethodTypes verificationMethodTypes = cyoVar.a;
                    Context context2 = enr0Var.a;
                    int[] iArr = enr0.a.$EnumSwitchMapping$0;
                    switch (iArr[verificationMethodTypes.ordinal()]) {
                        case 1:
                            i = R.string.vk_otp_method_selection_verification_methods_code_gen_title;
                            break;
                        case 2:
                            i = R.string.vk_otp_method_selection_verification_methods_email_title;
                            break;
                        case 3:
                            i = R.string.vk_otp_method_selection_verification_methods_one_pass_title;
                            break;
                        case 4:
                            i = R.string.vk_otp_method_selection_verification_methods_password_title;
                            break;
                        case 5:
                            i = R.string.vk_otp_method_selection_verification_methods_push_title;
                            break;
                        case 6:
                            i = R.string.vk_otp_method_selection_verification_methods_reserve_codes_title;
                            break;
                        case 7:
                        case 8:
                            i = R.string.vk_otp_method_selection_verification_methods_sms_title;
                            break;
                        case 9:
                        case 11:
                            i = R.string.vk_otp_method_selection_verification_methods_max_messenger_title;
                            break;
                        case 10:
                            i = R.string.vk_otp_method_selection_verification_methods_official_messenger_title;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    String string3 = context2.getString(i);
                    String a2 = enr0Var.a(verificationMethodTypes, str2);
                    switch (iArr[verificationMethodTypes.ordinal()]) {
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            a = enr0Var.a(verificationMethodTypes, str2);
                            break;
                        case 2:
                            String string4 = context2.getString(R.string.vk_otp_method_selection_verification_methods_email_subtitle_description_for_talkback);
                            int length = str2.length();
                            for (int i4 = 0; i4 < length; i4++) {
                                char charAt = str2.charAt(i4);
                                if (charAt == '@' || charAt == '*') {
                                    str = str2.substring(0, i4);
                                    H = drm0.H(str2);
                                    while (true) {
                                        if (-1 < H) {
                                            if (str2.charAt(H) != '*') {
                                                H--;
                                            } else {
                                                str2 = str2.substring(H + 1);
                                            }
                                        }
                                    }
                                    a = String.format(string4, Arrays.copyOf(new Object[]{str, str2}, 2));
                                    break;
                                }
                            }
                            str = str2;
                            H = drm0.H(str2);
                            while (true) {
                                if (-1 < H) {
                                }
                                H--;
                            }
                            a = String.format(string4, Arrays.copyOf(new Object[]{str, str2}, 2));
                            break;
                        case 7:
                        case 8:
                            a = String.format(context2.getString(R.string.vk_otp_method_selection_verification_methods_sms_subtitle_description_for_talkback), Arrays.copyOf(new Object[]{erm0.E0(2, str2)}, i3));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    String str3 = a;
                    int[] iArr2 = enr0.a.$EnumSwitchMapping$0;
                    switch (iArr2[verificationMethodTypes.ordinal()]) {
                        case 1:
                            i2 = R.drawable.vk_icon_pincode_lock_outline_28;
                            break;
                        case 2:
                            i2 = R.drawable.vk_icon_mail_outline_28;
                            break;
                        case 3:
                            i2 = R.drawable.vk_icon_touch_id_outline_28;
                            break;
                        case 4:
                            i2 = R.drawable.vk_icon_key_outline_28;
                            break;
                        case 5:
                            i2 = R.drawable.vk_icon_smartphone_outline_28;
                            break;
                        case 6:
                            i2 = R.drawable.vk_icon_article_outline_28;
                            break;
                        case 7:
                        case 8:
                            i2 = R.drawable.vk_icon_phone_outline_28;
                            break;
                        case 9:
                        case 11:
                            i2 = R.drawable.vk_icon_logo_max_circle_color_28;
                            break;
                        case 10:
                            i2 = R.drawable.vk_icon_message_outline_28;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    int i5 = i2;
                    int i6 = iArr2[verificationMethodTypes.ordinal()];
                    Integer valueOf6 = (i6 == 9 || i6 == 11) ? null : Integer.valueOf(R.attr.vk_ui_icon_accent);
                    int i7 = cyoVar.c;
                    int i8 = cyoVar.b;
                    switch (iArr2[verificationMethodTypes.ordinal()]) {
                        case 1:
                            aVar = new yj20.c.a(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 2:
                            aVar = new yj20.c.C4105c(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 3:
                            aVar = new yj20.c.g(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 4:
                            aVar = new yj20.c.h(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 5:
                            aVar = new yj20.c.i(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 6:
                            aVar = new yj20.c.j(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 7:
                            aVar = new yj20.c.k(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 8:
                            aVar = new yj20.c.b(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 9:
                            aVar = new yj20.c.d(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 10:
                            aVar = new yj20.c.f(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        case 11:
                            aVar = new yj20.c.e(string3, i7, str3, a2, i5, valueOf6, i8);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(aVar);
                    i3 = 1;
                }
                break;
            case 7:
                MusicTrack musicTrack = (MusicTrack) obj;
                vte0 vte0Var = (vte0) this.receiver;
                View view = vte0Var.d;
                ThumbsImageView thumbsImageView = vte0Var.g;
                TextView textView = vte0Var.h;
                Context context3 = textView.getContext();
                String str4 = musicTrack.d;
                String str5 = musicTrack.e;
                Float valueOf7 = Float.valueOf(textView.getTextSize());
                ucp ucpVar = ucp.a;
                textView.setText(ucp.j(s490.d(context3, str4, str5, R.attr.vk_ui_text_primary), valueOf7));
                Context context4 = textView.getContext();
                e3m.a aVar4 = e3m.a;
                Drawable a3 = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context4);
                if (musicTrack.Lb()) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a3, (Drawable) null);
                } else {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView.setCompoundDrawablePadding(cn70.b(5));
                thumbsImageView.setThumb(musicTrack.Jb());
                thumbsImageView.setContentDescription(view.getContext().getString(R.string.music_radio_talkback_cover, musicTrack.d));
                at.d(view, R.string.auido_radiostation_artist, vte0Var.i);
                return s3q0.a;
            case 8:
                ((lqc0) this.receiver).e2((kqc0) obj);
                return s3q0.a;
            case 9:
                int intValue3 = ((Number) obj).intValue();
                opl0 opl0Var = ((arl0) this.receiver).x;
                boolean z = opl0Var.t;
                uuk uukVar = opl0Var.c;
                return z ? intValue3 == 0 ? new StubAddStoriesContainer(null) : (StoriesContainer) uukVar.c(intValue3 - 1) : (StoriesContainer) uukVar.c(intValue3);
            default:
                h5b0 h5b0Var = (h5b0) obj;
                tts0 tts0Var = ((VideoMinimizableDiscoveryFragment) this.receiver).V;
                if (tts0Var == null) {
                    tts0Var = null;
                }
                com.vk.video.kidsprofile.restricteduseractions.a aVar5 = tts0Var.g;
                tts0.b bVar4 = tts0Var.a;
                g5b0 g5b0Var = tts0Var.k;
                if (g5b0Var != null) {
                    g5b0Var.clear();
                }
                if (h5b0Var instanceof h5b0.b) {
                    ViewGroup viewGroup = bVar4.a;
                    aVar5.getClass();
                    qbxVar = new l8z(viewGroup, null);
                } else if (h5b0Var instanceof h5b0.c) {
                    hgs0 hgs0Var = ((h5b0.c) h5b0Var).a;
                    k8z.b bVar5 = new k8z.b(bVar4.a);
                    MiniPlayerControllersWrapper miniPlayerControllersWrapper = tts0Var.m;
                    aVar5.getClass();
                    qbxVar = new k8z(bVar5, hgs0Var, new dbj0(tts0Var, 16), miniPlayerControllersWrapper, null);
                } else {
                    if (!(h5b0Var instanceof h5b0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qbxVar = new qbx(bVar4.a, new qbx.a(((h5b0.a) h5b0Var).a), bVar4.b, new vpj0(tts0Var, 17));
                }
                tts0Var.k = qbxVar;
                qbxVar.init();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae8(Object obj) {
        super(1, obj, com.vk.method.selector.impl.b.class, "onLoadVerificationMethodsSuccess", "onLoadVerificationMethodsSuccess(Lcom/vk/auth/smartflow/api/data/EcosystemGetVerificationMethodsResponse;)V", 0);
        this.b = 6;
    }
}
