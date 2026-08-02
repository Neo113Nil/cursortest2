package xsna;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.messages.Msg;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$CoverEvent;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.h;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.ewh;
import xsna.h7u0;
import xsna.nyd0;
import xsna.o9w0;
import xsna.w8v;
import xsna.xn50;
import xsna.ymb;
import xsna.zi3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gd0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ymb ymbVar;
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((hd0) obj2).n.c(((ed0) obj).a);
                break;
            case 1:
                break;
            case 2:
                ((gg1) obj2).C(new a.h(new i.n.a.d((Photo) obj)));
                break;
            case 3:
                ((rh3) obj2).o.b(new zi3.b.C4180b((String) obj));
                break;
            case 4:
                break;
            case 5:
                ((gta) obj2).getClass();
                Context context = ((po6) obj).getContext();
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i3 = dhr0.u().c;
                if (valueOf == null || valueOf.intValue() != i3) {
                    context = new l7s(context, dhr0.u().c);
                }
                int i4 = h7u0.p;
                h7u0.a c = h7u0.b.c(context);
                c.g0(R.string.cant_open_profile);
                c.U(R.string.try_again);
                c.c0(R.string.close, new fta(i2));
                c.m();
                break;
            case 6:
                ymb ymbVar2 = (ymb) obj2;
                LinkedHashMap linkedHashMap = ymbVar2.k;
                gob gobVar = ymbVar2.f;
                ymb.a aVar = (ymb.a) linkedHashMap.get(Integer.valueOf(((za80) obj).c));
                if (aVar != null) {
                    Msg msg = aVar.a;
                    if (!aVar.b) {
                        aux0 aux0Var = msg instanceof aux0 ? (aux0) msg : null;
                        Integer R5 = aux0Var != null ? aux0Var.R5() : null;
                        Integer num = aVar.d;
                        if (R5 != null && num == null) {
                            ymbVar = ymbVar2;
                            ymbVar.W(msg.d, gobVar.b(msg, R5.intValue()), null, null, false);
                        } else if (R5 != null || num == null) {
                            ymbVar = ymbVar2;
                            if (R5 != null && num != null) {
                                ymbVar.W(msg.d, gobVar.h(msg, R5, num.intValue()), num, null, true);
                            }
                        } else {
                            ymbVar = ymbVar2;
                            ymbVar.W(msg.d, gobVar.h(msg, null, num.intValue()), num, null, false);
                        }
                        ymbVar.V();
                        break;
                    }
                }
                break;
            case 7:
                h7m h7mVar = (h7m) obj2;
                String str = (String) obj;
                rfc a = fpf0.a(ClipsDraftComponent.class);
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                break;
            case 8:
                int i5 = CoverCropActivity.w;
                ((wh50) obj).setValue(Boolean.TRUE);
                nyd0.d f = ((lyd0) obj2).f();
                f.getClass();
                nyd0.d.a(f, MobileOfficialAppsProfileStat$CoverEvent.CoverEventType.CLICK_TO_PREVIEW);
                break;
            case 9:
                ((izs) obj2).invoke(new com.vk.profile.design.compose.header.sink.c((AuthorHeaderConfig.Header.Main.Name.Default.Verification) obj));
                break;
            case 10:
                ((z520) obj2).h((Photo) obj);
                break;
            case 11:
                eg20 eg20Var = (eg20) obj2;
                eg20Var.b.a.x((DialogTheme) obj);
                List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = eg20Var.p.P0().b;
                if (list != null && !list.isEmpty()) {
                    eg20Var.o.onNext(w8v.d.c);
                }
                break;
            case 12:
                pv30 pv30Var = (pv30) obj;
                int e = i35.c.e();
                o0w b = g2v.c().b();
                Context context2 = pv30Var.c;
                qv30 qv30Var = pv30Var.x;
                break;
            case 13:
                ((izs) obj2).invoke(new a.e(!((hh80) obj).e));
                break;
            case 14:
                break;
            case 15:
                ((bob0) obj2).d(!((yrb0) obj).c);
                break;
            case 16:
                ((izs) obj2).invoke((ewh.a) obj);
                break;
            case 17:
                lfo0 lfo0Var = (lfo0) obj2;
                lfo0Var.a.setMaxLines(Integer.MAX_VALUE);
                lfo0Var.a.setText((CharSequence) obj);
                break;
            case 18:
                ((izs) obj2).invoke(((yc0) obj).g);
                break;
            case 19:
                int i6 = VideoProfileFragmentOld.p0;
                ((h.b) ((com.vk.video.profile.presentation.h) obj)).getClass();
                xn50.a.c((VideoProfileFragmentOld) obj2, new a.s(null));
                break;
            case 20:
                ((r9w0) obj2).C(new o9w0.c(((o9w0.b) ((o9w0) obj)).b));
                break;
            default:
                ((gvw0) obj2).c = false;
                ((fr0) obj).invoke();
                break;
        }
        return s3q0.a;
    }
}
