package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.tasks.Task;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.web.UpdateMarketItemInvalidParamsError;
import com.vk.feature.uxpolls.modalpoll.UxPollsModalFragment;
import com.vk.feature.uxpolls.modalpoll.g;
import com.vk.libvideo.exceptions.CacheException;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.log.L;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vk.stories.design.view.stickerbutton.StickerType;
import com.vk.stories.design.view.stickerbutton.a;
import com.vk.story.api.storyflexboxfactory.StickerButtonType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.ok.media.StreamingLaunchScheduler;
import xsna.bex0;
import xsna.cwb0;
import xsna.gm50;
import xsna.mlx0;
import xsna.pzw0;
import xsna.tj50;
import xsna.uam0;
import xsna.y2m0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class m2l0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2l0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StickerButtonType stickerButtonType;
        s3q0 startAddressResolution$lambda$1;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                a.C1830a c1830a = (a.C1830a) obj2;
                Boolean bool = (Boolean) obj;
                c1830a.a = bool.booleanValue();
                z2x z2xVar = c1830a.b;
                if (z2xVar != null) {
                    z2xVar.invoke(bool);
                }
                return s3q0.a;
            case 1:
                return new x690(((e7l0) obj2).i, (ViewGroup) obj);
            case 2:
                r6i0 r6i0Var = (r6i0) obj2;
                switch (y2m0.a.$EnumSwitchMapping$0[((StickerType) obj).ordinal()]) {
                    case 1:
                        stickerButtonType = StickerButtonType.MENTION;
                        break;
                    case 2:
                        stickerButtonType = StickerButtonType.LINK;
                        break;
                    case 3:
                    case 4:
                        stickerButtonType = StickerButtonType.PHOTO;
                        break;
                    case 5:
                        stickerButtonType = StickerButtonType.HASHTAG;
                        break;
                    case 6:
                        stickerButtonType = StickerButtonType.LOCATION;
                        break;
                    case 7:
                        stickerButtonType = StickerButtonType.POLL;
                        break;
                    case 8:
                        stickerButtonType = StickerButtonType.GIF;
                        break;
                    case 9:
                    case 10:
                        stickerButtonType = StickerButtonType.TIME;
                        break;
                    case 11:
                        stickerButtonType = StickerButtonType.PRODUCT;
                        break;
                    case 12:
                        stickerButtonType = StickerButtonType.SERVICE;
                        break;
                    case 13:
                        stickerButtonType = StickerButtonType.MUSIC;
                        break;
                    case 14:
                        stickerButtonType = StickerButtonType.OPINION;
                        break;
                    case 15:
                        stickerButtonType = StickerButtonType.REACTION;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                r6i0Var.invoke(stickerButtonType);
                return s3q0.a;
            case 3:
                fyd0 fyd0Var = ((uam0.a) obj2).l;
                if (fyd0Var != null) {
                    fyd0Var.invoke();
                }
                return s3q0.a;
            case 4:
                ycm0 ycm0Var = (ycm0) obj2;
                List list = (List) obj;
                mcm0 mcm0Var = ycm0Var.h;
                tcm0 tcm0Var = (tcm0) (mcm0Var != null ? mcm0Var : null);
                tcm0Var.j.a = true;
                tcm0Var.l.submitList(list);
                ycm0Var.l = true;
                return s3q0.a;
            case 5:
                startAddressResolution$lambda$1 = StreamingLaunchScheduler.startAddressResolution$lambda$1((StreamingLaunchScheduler) obj2, ((Boolean) obj).booleanValue());
                return startAddressResolution$lambda$1;
            case 6:
                ((Task) obj2).addOnCompleteListener(new xtj0((io.reactivex.rxjava3.core.y) obj));
                return s3q0.a;
            case 7:
                g7q0 g7q0Var = (g7q0) obj2;
                g7q0Var.m -= 1000;
                ((Calendar) g7q0Var.p.getValue()).setTimeInMillis(g7q0Var.m);
                return s3q0.a;
            case 8:
                tgi0 tgi0Var = (tgi0) obj;
                if (((Boolean) ((mtk0) obj2).getValue()).booleanValue()) {
                    qgi0.a(tgi0Var);
                }
                return s3q0.a;
            case 9:
                qgi0.h((tgi0) obj, ((UserProfileBaseInfoState.a) obj2).b);
                return s3q0.a;
            case 10:
                return Boolean.valueOf(epx.f((UserId) ((Pair) obj).d(), ((nnq0) obj2).c.a()));
            case 11:
                lsq0 lsq0Var = (lsq0) obj2;
                Throwable th = (Throwable) obj;
                com.vk.lists.b<u1c0> bVar = lsq0Var.c;
                pxq0 pxq0Var = lsq0Var.d0;
                if (bVar.d.isEmpty()) {
                    pxq0Var.V1();
                }
                pxq0Var.g3();
                L.e(th);
                return s3q0.a;
            case 12:
                UxPollsModalFragment uxPollsModalFragment = (UxPollsModalFragment) obj2;
                int i2 = UxPollsModalFragment.f0;
                gm50.a.a(uxPollsModalFragment, ((g.a) obj).a, new z6f0(uxPollsModalFragment, 24));
                return s3q0.a;
            case 13:
                ((ddr0) obj2).f.B(new IllegalStateException("Failed to load install screen info"));
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 14:
                ((ppr0) obj2).k.w.setImageBitmap((Bitmap) obj);
                return s3q0.a;
            case 15:
                return io.reactivex.rxjava3.core.a.k(new CacheException((m7q) obj2, (Throwable) obj));
            case 16:
                ((eo2) obj2).invoke();
                return s3q0.a;
            case 17:
                List list2 = (List) obj2;
                int intValue = ((Integer) obj).intValue();
                if (list2 == null) {
                    return null;
                }
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        Integer s1 = ((VideoVideoFullDto) next).s1();
                        if (s1 != null && s1.intValue() == intValue) {
                            r2 = next;
                        }
                    }
                }
                return (VideoVideoFullDto) r2;
            case 18:
                rwo0 rwo0Var = ((VideoEditTimelineView) obj2).F;
                if (rwo0Var != null) {
                    rwo0Var.q();
                }
                return s3q0.a;
            case 19:
                ((kps0) obj2).b.remove(((wxr0) obj).a.a1());
                return s3q0.a;
            case 20:
                return VideoSkippablePartView.e((VideoSkippablePartView) obj2);
            case 21:
                VkAuthPhoneView vkAuthPhoneView = (VkAuthPhoneView) obj2;
                pno0 pno0Var = (pno0) obj;
                Regex regex = VkAuthPhoneView.q;
                int c = pno0Var.c();
                int b = pno0Var.b();
                EditText editText = vkAuthPhoneView.f;
                if (!vkAuthPhoneView.o) {
                    if (c == 0 && b >= 3 && b == editText.getText().length()) {
                        String q = PhoneNumberUtil.q(editText.getText());
                        String str = vkAuthPhoneView.k.d;
                        boolean z = str.equals("RU") || str.equals("KZ");
                        if (brm0.B(q, vkAuthPhoneView.k.c, false)) {
                            editText.setText(brm0.A(q, vkAuthPhoneView.k.c, ""));
                        } else if (z && brm0.B(q, "8", false)) {
                            editText.setText(brm0.A(q, "8", ""));
                        } else if (VkAuthPhoneView.q.f(q)) {
                            vkAuthPhoneView.b(Country.f);
                            editText.setText(VkAuthPhoneView.r.i(q, ""));
                        }
                        editText.setSelection(editText.getText().length());
                    }
                    String phoneWithoutCode = vkAuthPhoneView.getPhoneWithoutCode();
                    if (phoneWithoutCode.length() > 17 && b > 0) {
                        int i3 = b + c;
                        String q2 = PhoneNumberUtil.q(editText.getText().subSequence(c, i3).toString());
                        int max = Math.max(0, 17 - (phoneWithoutCode.length() - q2.length()));
                        vkAuthPhoneView.o = true;
                        try {
                            editText.getText().delete(c, i3);
                            editText.getText().insert(c, q2.substring(0, max));
                            s3q0 s3q0Var = s3q0.a;
                        } finally {
                            vkAuthPhoneView.o = false;
                        }
                    }
                    vkAuthPhoneView.a();
                }
                return s3q0.a;
            case 22:
                ((wh50) obj2).setValue((ljo0) obj);
                return s3q0.a;
            case 23:
                return ((VkTopBar.f) obj2).c.a;
            case 24:
                oxv0 oxv0Var = (oxv0) obj2;
                Throwable th2 = (Throwable) obj;
                VkAppsErrors.Client client = th2 instanceof UpdateMarketItemInvalidParamsError ? VkAppsErrors.Client.INVALID_PARAMS : VkAppsErrors.Client.UNKNOWN_ERROR;
                r6y r6yVar = oxv0Var.b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.MARKET_ITEM_EDIT, client, null, null, null, 60);
                }
                xgx0.a.getClass();
                xgx0.d(th2);
                return s3q0.a;
            case 25:
                lcw0 lcw0Var = (lcw0) obj2;
                bzb0.d((bzb0) lcw0Var.k.getValue(), new cwb0.a1(R.string.voip_asr_stop_submit_title, null, R.string.voip_asr_stop_submit_subtitle, null, R.string.voip_asr_stop_submit_yes, null, R.string.voip_asr_stop_submit_no, null, null, null, 938), new egu0(lcw0Var, 2), null, null, 28);
                lcw0Var.c.invoke();
                return s3q0.a;
            case 26:
                int i4 = wmw0.i1;
                ((wmw0) obj2).dismiss();
                return s3q0.a;
            case 27:
                return new pzw0.a(((tj50.a) obj).a(new lzw0(1, ((mzw0) obj2).d, ozw0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/watchmovie/selectsource/dialog/feature/VoipSelectMovieState;)Lcom/vk/voip/ui/watchmovie/selectsource/dialog/VoipSelectMovieViewState$ScreenState;", 0), ao8.d));
            case 28:
                ((y4x0) obj2).g = (IconCompat) ((it80) obj).a;
                L.e("VVMOpponentAvatarDelegate", "Peer icon updated with abbreviation icon");
                return Boolean.TRUE;
            default:
                plx0 plx0Var = (plx0) obj2;
                if (!((VoipViewModelState) obj).i()) {
                    plx0Var.k.b(mlx0.a.a);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ m2l0(eo2 eo2Var, abs0 abs0Var, Activity activity) {
        this.b = 16;
        this.c = eo2Var;
    }

    public /* synthetic */ m2l0(r6i0 r6i0Var, y2m0 y2m0Var) {
        this.b = 2;
        this.c = r6i0Var;
    }
}
