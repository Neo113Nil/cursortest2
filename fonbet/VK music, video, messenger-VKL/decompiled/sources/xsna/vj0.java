package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.transformer.a0;
import androidx.preference.Preference;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoStaticSectionItemsDto;
import com.vk.auth.ui.checkaccess.CheckAccessBottomSheetFragment;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.checkaccess.VkCheckAccessRequiredData;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import xsna.eeu0;
import xsna.f3m;
import xsna.ihz;
import xsna.ntl;
import xsna.ta6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class vj0 implements io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.l, pcs, Preference.c, ihz.a, SimpleVideoView.k, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vj0(androidx.media3.transformer.u uVar, androidx.media3.transformer.z zVar) {
        this.b = 17;
        this.c = uVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((defpackage.s) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((t97) obj2).invoke(obj);
            case 3:
                return (s3q0) ((r58) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.o) ((kz0) obj2).invoke(obj);
            case 5:
                return (List) ((kz0) obj2).invoke(obj);
            case 6:
                return (hda) ((j5) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((kz0) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((mbb) obj2).invoke(obj);
            case 9:
            case 14:
            case 17:
            case 20:
            case 24:
            case 25:
            case 27:
            default:
                return (io.reactivex.rxjava3.core.t) ((f410) obj2).invoke(obj);
            case 10:
                return (qih0) ((kz0) obj2).invoke(obj);
            case 11:
                return (ShortVideoStaticSectionItemsDto) ((kz0) obj2).invoke(obj);
            case 12:
                return (Long) ((kz0) obj2).invoke(obj);
            case 13:
                return (MarketMarketItemFullDto) ((kz0) obj2).invoke(obj);
            case 15:
                return (f3m.a) ((wcg) obj2).invoke(obj);
            case 16:
                return (xpp) ((dbm) obj2).invoke(obj);
            case 18:
                int i2 = FeedAnimatedView.y;
                return (io.reactivex.rxjava3.core.t) ((lbe) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((kz0) obj2).invoke(obj);
            case 21:
                return (Boolean) ((kz0) obj2).invoke(obj);
            case 22:
                return (p2v0) ((p99) obj2).invoke(obj);
            case 23:
                return (List) ((wcg) obj2).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.o) ((ddm) obj2).invoke(obj);
            case 28:
                return (eu90) ((vx30) obj2).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        pzv r = debugDevSettingsFragment.o0.r();
        ((ntl) new bzb0(debugDevSettingsFragment.requireContext()).b.getValue()).a(new ntl.a(1, Long.toString(TimeUnit.DAYS.toMillis(1L)), 2, Long.toString(r.y), "Время жизни кэша юзеров/контактов (ms)"), new defpackage.v(7, debugDevSettingsFragment, r));
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        androidx.media3.transformer.f fVar = ((androidx.media3.transformer.u) this.c).a;
        ((a0.c) obj).getClass();
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Dialog dialog;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        CheckAccessBottomSheetFragment checkAccessBottomSheetFragment = (CheckAccessBottomSheetFragment) this.c;
        if (epx.f(str, "key_check_access_result")) {
            if (bundle.containsKey("open_sms")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = bundle.getParcelable("open_sms", VkCheckAccessRequiredData.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    Parcelable parcelable5 = bundle.getParcelable("open_sms");
                    parcelable3 = (VkCheckAccessRequiredData) (parcelable5 instanceof VkCheckAccessRequiredData ? parcelable5 : null);
                }
                VkCheckAccessRequiredData vkCheckAccessRequiredData = (VkCheckAccessRequiredData) parcelable3;
                k6k0 k6k0Var = new k6k0();
                String str2 = vkCheckAccessRequiredData.d;
                if (str2 == null) {
                    str2 = "";
                }
                k6k0Var.setArguments(ta6.a.a(str2, "", new CheckPresenterInfo.Validation("", false, vkCheckAccessRequiredData.b, false, 8, null), new CodeState.CheckAccess(0L, 0L, 3, null), null, null, 0, false, vkCheckAccessRequiredData.b, vkCheckAccessRequiredData.e, null, 1264));
                checkAccessBottomSheetFragment.Mn(k6k0Var, vkCheckAccessRequiredData.e);
                return;
            }
            if (bundle.containsKey("dismiss")) {
                checkAccessBottomSheetFragment.D = bundle.getBoolean("dismiss");
                Dialog dialog2 = checkAccessBottomSheetFragment.s;
                if (dialog2 != null) {
                    dialog2.dismiss();
                    return;
                }
                return;
            }
            if (bundle.containsKey("close_with_error")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("close_with_error", CheckAccessBottomSheetFragment.CloseWithErrorResult.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable6 = bundle.getParcelable("close_with_error");
                    parcelable = (CheckAccessBottomSheetFragment.CloseWithErrorResult) (parcelable6 instanceof CheckAccessBottomSheetFragment.CloseWithErrorResult ? parcelable6 : null);
                }
                CheckAccessBottomSheetFragment.CloseWithErrorResult closeWithErrorResult = (CheckAccessBottomSheetFragment.CloseWithErrorResult) parcelable;
                Context mo2getContext = checkAccessBottomSheetFragment.mo2getContext();
                if (mo2getContext == null) {
                    return;
                }
                if (closeWithErrorResult.c && (dialog = checkAccessBottomSheetFragment.s) != null) {
                    dialog.hide();
                }
                String str3 = closeWithErrorResult.b;
                b0c b0cVar = new b0c(checkAccessBottomSheetFragment, 0);
                eeu0.a aVar = new eeu0.a(mo2getContext);
                aVar.B(R.string.vk_auth_error);
                aVar.a.f = str3;
                aVar.setPositiveButton(R.string.vk_ok, new o1c());
                aVar.i = b0cVar;
                aVar.m();
            }
        }
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.k
    public void p0(Integer num) {
        q7r q7rVar = (q7r) this.c;
        long j = q7rVar.q;
        if (j != 0 && j != q7rVar.v.getCurrentPosition()) {
            elm0 elm0Var = q7rVar.i0.c;
            if (elm0Var != null) {
                elm0Var.l();
            }
            q7rVar.v.b(q7rVar.q);
            q7rVar.q = 0L;
        }
        i0q0.d(10L, new n93(q7rVar, 3));
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        AdaptersKt.hasWiredHeadsetSingle$lambda$5((CallsAudioManager) this.c, yVar);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 25:
                return ((Boolean) ((wcg) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((f410) this.c).invoke(obj)).booleanValue();
        }
    }

    public /* synthetic */ vj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
