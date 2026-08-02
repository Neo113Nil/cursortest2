package xsna;

import android.content.DialogInterface;
import android.view.ViewGroup;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.h7u0;
import xsna.ikv0;
import xsna.kuc;
import xsna.t0e;

/* compiled from: ClipsEditorAlertsHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class mwd implements hwd {
    public final lpj a;
    public final t0e.a b;
    public final e2e c;
    public ikv0 d;
    public final HashSet<String> e = new HashSet<>();
    public final HashSet<String> f = new HashSet<>();
    public final HashSet<String> g = new HashSet<>();

    public mwd(lpj lpjVar, t0e.a aVar, e2e e2eVar) {
        this.a = lpjVar;
        this.b = aVar;
        this.c = e2eVar;
    }

    public static String j(long j) {
        return brm0.y(String.valueOf(j / 1000.0f), ".", StringUtils.COMMA);
    }

    @Override // xsna.hwd
    public final void a(long j) {
        k();
        l(R.string.clip_editor_min_crop_duration_action_snackbar, wlb0.t(this.a, R.string.clip_editor_min_voiceover_duration_text_snackbar, j(j)));
    }

    @Override // xsna.hwd
    public final void b() {
        k();
        l(R.string.clip_editor_speed_up_limit_reached_action_snackbar, wlb0.s(R.string.clip_editor_speed_up_limit_reached_text_snackbar, this.a));
    }

    @Override // xsna.hwd
    public final void c(final kuc kucVar) {
        kuc.a aVar = kucVar.d;
        Integer num = kucVar.c;
        Object[] objArr = kucVar.b;
        Integer num2 = kucVar.a;
        kuc.a aVar2 = kucVar.e;
        boolean z = kucVar instanceof kuc.b;
        lpj lpjVar = this.a;
        if (z) {
            if (aVar2 == null) {
                aVar2 = new kuc.a(R.string.clip_advanced_editor_dialog_cancel, null, new i21(5));
            }
            gxd gxdVar = this.c.f;
            int i = h7u0.p;
            h7u0.a c = h7u0.b.c(lpjVar);
            if (num2 != null) {
                c.h0(wlb0.t(lpjVar, num2.intValue(), Arrays.copyOf(objArr, objArr.length)));
            }
            if (num != null) {
                c.U(num.intValue());
            }
            c.c0(aVar.a, new DialogInterface.OnClickListener() { // from class: xsna.kwd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    kuc.this.d.c.invoke();
                }
            });
            c.W(aVar2.a, new lwd(aVar2, 0));
            c.m();
            return;
        }
        if (!(kucVar instanceof kuc.d) && !(kucVar instanceof kuc.e) && !(kucVar instanceof kuc.c)) {
            throw new NoWhenBranchMatchedException();
        }
        String string = num2 != null ? lpjVar.getString(num2.intValue(), Arrays.copyOf(objArr, objArr.length)) : null;
        String string2 = num != null ? lpjVar.getString(num.intValue()) : null;
        ArrayList arrayList = (string == null && string2 == null) ? new ArrayList() : e43.o(new xu20(string, string2, 0, null, 12));
        ModalActionSheetListItem.IconSize iconSize = ModalActionSheetListItem.IconSize.Small;
        String string3 = aVar2 != null ? lpjVar.getString(aVar2.a) : null;
        if (string3 == null) {
            string3 = "";
        }
        arrayList.add(new ModalActionSheetListItem(1, null, string3, null, null, 0, iconSize, false, false, 442));
        arrayList.add(new ModalActionSheetListItem(2, ModalActionSheetListItem.Appearance.Negative, lpjVar.getString(aVar.a), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
        a.C0785a c0785a = new a.C0785a();
        c0785a.b = arrayList;
        c0785a.c = new m7(kucVar, 28);
        c0785a.a(lpjVar, null);
    }

    @Override // xsna.hwd
    public final void d() {
        l(R.string.clip_editor_voiceover_unknown_error_snackbar, wlb0.s(R.string.error_unknown, this.a));
    }

    @Override // xsna.hwd
    public final void e(ty0 ty0Var, pr6 pr6Var) {
        gxd gxdVar = this.c.f;
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(this.a);
        c.g0(R.string.clip_save_without_audio);
        c.c0(R.string.save, new iwd(ty0Var, 0));
        c.W(R.string.cancel, new jwd(pr6Var));
        c.m();
    }

    @Override // xsna.hwd
    public final void f(long j, String str) {
        HashSet<String> hashSet = this.g;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        k();
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
        l(R.string.clip_editor_audio_duration_action_snackbar, this.a.getResources().getQuantityString(R.plurals.clip_editor_audio_duration_text_snackbar, minutes, Arrays.copyOf(new Object[]{Integer.valueOf(minutes)}, 1)));
    }

    @Override // xsna.hwd
    public final void g(long j, String str) {
        HashSet<String> hashSet = this.f;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        k();
        l(R.string.clip_editor_photo_duration_action_snackbar, wlb0.t(this.a, R.string.clip_editor_photo_duration_text_snackbar, j(j)));
    }

    @Override // xsna.hwd
    public final void h() {
        k();
        l(R.string.clips_music_recommended_time_selected_btn, wlb0.s(R.string.clips_music_recommended_time_selected, this.a));
    }

    @Override // xsna.hwd
    public final void i(long j, String str) {
        HashSet<String> hashSet = this.e;
        if (str == null || !hashSet.contains(str)) {
            if (str != null) {
                hashSet.add(str);
            }
            k();
            l(R.string.clip_editor_min_crop_duration_action_snackbar, wlb0.t(this.a, R.string.clip_editor_min_crop_duration_text_snackbar, j(j)));
        }
    }

    public final void k() {
        ikv0 ikv0Var = this.d;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.d = null;
    }

    public final void l(int i, String str) {
        lpj lpjVar = this.a;
        ikv0.a aVar = new ikv0.a(lpjVar);
        aVar.i = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        float f = iah0.f().heightPixels;
        t0e t0eVar = t0e.this;
        ViewGroup viewGroup = t0eVar.v;
        aVar.o = Integer.valueOf(((int) ((f - viewGroup.getY()) - (viewGroup.getScaleY() * viewGroup.getHeight()))) - e3m.a(R.dimen.clips_video_cropper_snackbars_margin, t0eVar.getCtx()));
        aVar.d = true;
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, wlb0.s(i, lpjVar), new gt(9));
        this.d = aVar.n();
    }
}
