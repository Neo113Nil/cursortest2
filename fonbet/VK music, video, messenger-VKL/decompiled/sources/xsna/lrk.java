package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.restore.RestoreNavValue;
import com.vk.auth.restore.RestoreReason;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.debug.ui.dev.DebugDevHintsFragment;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.Episode;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.profile.user.impl.ui.b;
import com.vk.search.integration.api.SearchTab;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import xsna.cwb0;
import xsna.ddz;
import xsna.eeu0;
import xsna.fsz;
import xsna.iax;
import xsna.nsz;
import xsna.p810;
import xsna.tj50;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lrk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lrk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x030c, code lost:
    
        if (r3 == null) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List<? extends HintId> list;
        String str;
        s3q0 prefetch$lambda$1;
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Pair[] pairArr = (Pair[]) obj2;
                break;
            case 1:
                ((zak0) ((c0l) obj2).i).setValue((DateTimePickerState.UpdateValueFromDialogsStrategy) obj);
                break;
            case 2:
                DebugDevHintsFragment debugDevHintsFragment = (DebugDevHintsFragment) obj2;
                String str2 = (String) obj;
                RecyclerView recyclerView = debugDevHintsFragment.T;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.scrollToPosition(0);
                if (drm0.N(str2)) {
                    list = debugDevHintsFragment.V;
                    if (list == null) {
                        list = null;
                    }
                } else {
                    Locale locale = Locale.ENGLISH;
                    String lowerCase = str2.toLowerCase(locale);
                    Locale locale2 = Locale.ROOT;
                    String M = blk.M(lowerCase.toLowerCase(locale2));
                    String N = blk.N(str2.toLowerCase(locale).toLowerCase(locale2));
                    List<? extends HintId> list2 = debugDevHintsFragment.V;
                    if (list2 == null) {
                        list2 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        String lowerCase2 = ((HintId) obj3).getId().toLowerCase(Locale.ENGLISH);
                        if (drm0.D(lowerCase2, M, false) || drm0.D(lowerCase2, N, false)) {
                            arrayList.add(obj3);
                        }
                    }
                    list = arrayList;
                }
                DebugDevHintsFragment.c cVar = debugDevHintsFragment.S;
                (cVar != null ? cVar : null).setItems(list);
                break;
            case 3:
                ((TextView) obj).setLinkTextColor(((kkm) obj2).f(R.attr.vk_ui_text_link));
                break;
            case 4:
                pdn pdnVar = (pdn) obj2;
                tj50.a aVar = (tj50.a) obj;
                io3 io3Var = new io3(13);
                ao8 ao8Var = ao8.d;
                break;
            case 5:
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = ((dxn) obj2).e;
                (izsVar != null ? izsVar : null).invoke(b.f.a.b);
                break;
            case 6:
                UserId userId = (UserId) obj2;
                Group group = (Group) obj;
                String str3 = group.e;
                if (str3 != null) {
                    str = pzl.b(str3, drm0.E(str3, '?') ? (drm0.G(str3, '?') || drm0.G(str3, '&')) ? "" : "&" : "?", "cs=200x0");
                    break;
                }
                str = null;
                Bitmap bitmap = str != null ? (Bitmap) itg0.e(mcr0.m(iah0.f().widthPixels / 2, -1L, str)) : null;
                String str4 = group.d;
                StringBuilder sb = new StringBuilder("@");
                String str5 = group.h;
                if (str5 == null) {
                    str5 = b4q.b(userId, "id");
                }
                sb.append(str5);
                pao paoVar = new pao(userId, str4, sb.toString());
                paoVar.d = bitmap;
                break;
            case 7:
                ((com.vk.photos.ui.editalbum.domain.c) obj2).T(e.d.b);
                break;
            case 8:
                break;
            case 9:
                Episode episode = (Episode) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(episode.b), "plays");
                w9yVar.b(Boolean.valueOf(episode.c), "is_favorite");
                w9yVar.d(Long.valueOf(episode.d / 1000), X3.i.L);
                w9yVar.e(episode.e, "description");
                w9y w9yVar2 = new w9y();
                Image image = episode.f;
                w9yVar2.e(image != null ? image.Gb() : null, "sizes");
                s3q0 s3q0Var = s3q0.a;
                w9yVar.e(w9yVar2.a, "cover");
                w9yVar.e(episode.g, "post");
                w9yVar.e(episode.h, "restriction_description");
                w9yVar.e(episode.i, "restriction_text");
                w9yVar.g("restriction_button", episode.j);
                w9yVar.b(Boolean.valueOf(episode.k), "is_donut");
                break;
            case 10:
                Object obj4 = ((u4q) obj2).o;
                Object obj5 = obj4;
                if (obj4 == null) {
                    obj5 = null;
                }
                w4q w4qVar = (w4q) obj5;
                w4qVar.getClass();
                if (!w4qVar.z0(new x4q(com.vk.registration.funnels.b.a, 0))) {
                    com.vk.auth.main.b bVar = w4qVar.d;
                    if (bVar == null) {
                        bVar = null;
                    }
                    String str6 = w4qVar.z;
                    SignUpDataHolder signUpDataHolder = w4qVar.p;
                    bVar.S0(new RestoreReason.ForgetPassword(str6, (signUpDataHolder != null ? signUpDataHolder : null).o, RestoreNavValue.REG_SCREEN));
                }
                break;
            case 11:
                break;
            case 12:
                ((q7r) obj2).r0.c();
                break;
            case 13:
                xyr xyrVar = (xyr) obj2;
                v1s v1sVar = (v1s) obj;
                xyr xyrVar2 = v1sVar.a.get(Integer.valueOf(xyrVar.getId()));
                break;
            case 14:
                ((FriendsItemListVh.a) obj2).b.invoke((View) obj);
                break;
            case 15:
                evs evsVar = (evs) obj2;
                r6p0 r6p0Var = evsVar.K;
                if (r6p0Var.b.c != null) {
                    r6p0Var.a();
                } else {
                    r6p0Var.b(true, evsVar.E.G, new jpf(evsVar, 23), new sfg(evsVar, 21));
                }
                break;
            case 16:
                c3t c3tVar = (c3t) obj2;
                bpn0 bpn0Var = iz10.a;
                Context context = e43.a;
                break;
            case 17:
                break;
            case 18:
                bmt.this.f.b.f(new vxf0());
                break;
            case 19:
                break;
            case 20:
                ImRequestsFragment imRequestsFragment = (ImRequestsFragment) obj2;
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                g9e0 g9e0Var = imRequestsFragment.Y;
                qcy<Object> qcyVar = ImRequestsFragment.Z[0];
                bzb0.d((bzb0) g9e0Var.b(), cwb0.o0.l, new oz4(imRequestsFragment, 3), null, null, 28);
                break;
            case 21:
                ((jax) obj2).i(new iax.a.f((SearchTab) obj));
                break;
            case 22:
                tgi0 tgi0Var = (tgi0) obj;
                int i4 = ItemsDialogWrapper.S;
                qgi0.h(tgi0Var, ((ItemsDialogWrapper) obj2).getString(R.string.done));
                qgi0.r(tgi0Var, "items_done_button");
                qgi0.e(tgi0Var, null, new re0(19));
                break;
            case 23:
                Object obj6 = ((z2z) obj2).o;
                ((x2z) (obj6 != null ? obj6 : null)).Q();
                break;
            case 24:
                zcz zczVar = (zcz) obj2;
                ddz.a aVar2 = (ddz.a) obj;
                boolean z = aVar2 instanceof ddz.a.c;
                bwt0.p0(zczVar.p, z);
                bwt0.p0(zczVar.s, z && ((ddz.a.c) aVar2).c);
                bwt0.p0(zczVar.u, z && ((ddz.a.c) aVar2).e);
                break;
            case 25:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((gcp0) obj2).invoke(bool, Boolean.FALSE);
                break;
            case 26:
                final krz krzVar = (krz) obj2;
                nsz.a.C3412a c3412a = (nsz.a.C3412a) obj;
                FragmentActivity activity = krzVar.getActivity();
                if (activity != null) {
                    String str7 = c3412a.a;
                    String str8 = c3412a.b;
                    androidx.appcompat.app.d dVar = krzVar.j;
                    if (dVar != null) {
                        dVar.hide();
                    }
                    eeu0.a aVar3 = new eeu0.a(activity);
                    aVar3.c = false;
                    aVar3.setTitle(str7);
                    AlertController.b bVar2 = aVar3.a;
                    bVar2.f = str8;
                    aVar3.f(activity.getString(R.string.vk_qr_web_to_app_error_dialog_close), new hrz(krzVar, i3));
                    bVar2.n = new DialogInterface.OnCancelListener() { // from class: xsna.irz
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            krz.this.getFeature().C(fsz.a.b);
                        }
                    };
                    krzVar.j = aVar3.m();
                }
                break;
            case 27:
                prefetch$lambda$1 = LocalGalleryProvider.prefetch$lambda$1((LocalGalleryProvider) obj2, (List) obj);
                break;
            case 28:
                ((f810) obj2).T(new p810.d((Throwable) obj));
                break;
            default:
                tra0.a.K((tra0.a) obj, (tra0) obj2, 0, 0, null, 12);
                break;
        }
        return s3q0.a;
    }
}
