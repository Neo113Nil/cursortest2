package xsna;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ironsource.X3;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.toggle.features.SmbFeatures;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: RepliesController.kt */
/* loaded from: classes18.dex */
public final class e2g0 {
    public static final Regex j = new Regex("^\\s*" + eaz.c() + ",\\s?");
    public final WriteBar a;
    public final Context b;
    public final zal0 c;
    public StickersView d;
    public xgy e;
    public v3g0 f;
    public PopupStickerView g;
    public q420 h;
    public final g2g0 i;

    public e2g0(WriteBar writeBar, Context context, zal0 zal0Var, int i) {
        zal0Var = (i & 8) != 0 ? null : zal0Var;
        this.a = writeBar;
        this.b = context;
        this.c = zal0Var;
        this.i = new g2g0(this);
    }

    public final String a() {
        String b;
        q420 q420Var = this.h;
        String obj = (q420Var == null || (b = q420Var.b()) == null) ? null : drm0.p0(b).toString();
        return obj == null ? "" : obj;
    }

    public final boolean b() {
        this.a.n(true);
        xgy xgyVar = this.e;
        if (xgyVar == null || !xgyVar.e()) {
            return false;
        }
        xgy xgyVar2 = this.e;
        if (xgyVar2 != null) {
            xgyVar2.d();
        }
        return true;
    }

    public final void c(ViewGroup viewGroup, ViewGroup viewGroup2, UserId userId, izs<? super StickerAttachment, s3q0> izsVar) {
        bpn0 bpn0Var = enj.a;
        Context context = this.b;
        StickersView stickersView = new StickersView(e3m.h(context), (StickersView.c) null, 6);
        this.d = stickersView;
        stickersView.setStickersKeyboardContext(b.a.a);
        SmbFeatures smbFeatures = SmbFeatures.REPLY_VIDEO_ATTACH;
        smbFeatures.getClass();
        boolean z = !com.vk.toggle.b.A.a(smbFeatures);
        WriteBar writeBar = this.a;
        writeBar.setBottomSheetContainer(viewGroup2);
        writeBar.b(userId, true);
        writeBar.setAttachLimits(2);
        writeBar.setLocationAllowed(false);
        writeBar.S(e3m.h(context), null);
        writeBar.setHidePopup(true);
        writeBar.setAudioMsgRecordingAllowed(false);
        writeBar.setVideoMsgRecordingAllowed(false);
        writeBar.setOnlyPhotoFromGalleryAllowed(z);
        writeBar.setOnlyPhotoFromVkAllowed(z);
        EditText input = writeBar.getInput();
        input.setFilters((InputFilter[]) jw5.y(new InputFilter.LengthFilter(2048), input.getFilters()));
        writeBar.getInput().setHint(writeBar.getResources().getString(R.string.reply_input_hint));
        d();
        f2g0 f2g0Var = new f2g0(izsVar, this);
        StickersView stickersView2 = this.d;
        if (stickersView2 != null) {
            stickersView2.setListener(f2g0Var);
        }
        StickersView stickersView3 = this.d;
        if (stickersView3 != null) {
            xgy xgyVar = new xgy(e3m.h(context), viewGroup, stickersView3, null, null, 120);
            xgyVar.a(writeBar.getEmojiAnchor(), null);
            xgyVar.o = writeBar;
            this.e = xgyVar;
        }
        writeBar.setWriteBarStickersListener(new pll(this));
        writeBar.setAutoSuggestPopupListener(f2g0Var);
        q();
    }

    public final void d() {
        WriteBar writeBar = this.a;
        this.h = new q420(writeBar.getInput(), new a(), null, 28);
        writeBar.setEditTextSelectionChangeListener(new hd4(this, 5));
        q420 q420Var = this.h;
        if (q420Var != null) {
            q420Var.e(true);
        }
        q420 q420Var2 = this.h;
        if (q420Var2 != null) {
            q420Var2.g = new hr80();
        }
        writeBar.getInput().addTextChangedListener(this.i);
    }

    public final void e() {
        WriteBar writeBar = this.a;
        Context context = writeBar.getContext();
        bpn0 bpn0Var = enj.a;
        writeBar.S(e3m.h(context), null);
        writeBar.setAddAttachAllowed(false);
        writeBar.setAttachNewDot(false);
        writeBar.setEmojiAllowed(false);
        writeBar.setAudioMsgRecordingAllowed(false);
        writeBar.setVideoMsgRecordingAllowed(false);
        EditText input = writeBar.getInput();
        input.setFilters((InputFilter[]) jw5.y(new InputFilter.LengthFilter(2048), input.getFilters()));
        writeBar.getInput().setHint(writeBar.getResources().getString(R.string.reply_input_hint));
        d();
        q();
    }

    public final void f() {
        WriteBar writeBar = this.a;
        writeBar.getInput().removeTextChangedListener(this.i);
        writeBar.N();
        this.d = null;
        this.e = null;
    }

    public final void g() {
        z0y0 z0y0Var;
        y0y0 y0y0Var = this.a.D;
        if (!y0y0Var.c(null) || (z0y0Var = y0y0Var.d) == null) {
            return;
        }
        y0y0Var.c.getInputState();
        z0y0Var.a(false, true);
    }

    public final void h() {
        e3m.h(this.b);
        this.a.getState().f = true;
    }

    public final void i(int i) {
        zal0 zal0Var = this.c;
        if (zal0Var != null) {
            zal0.H(zal0Var, this.b, i, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
    }

    public final void j(List<? extends Attachment> list) {
        WriteBar writeBar = this.a;
        writeBar.F();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            writeBar.A1((Attachment) it.next());
        }
    }

    public final void k(gzs<s3q0> gzsVar) {
        v3g0 v3g0Var = this.f;
        if (v3g0Var != null) {
            v3g0Var.setOnReplyFromClickListener(gzsVar);
        }
    }

    public final void l(gzs<s3q0> gzsVar) {
        v3g0 v3g0Var = this.f;
        if (v3g0Var != null) {
            v3g0Var.setOnReplyToClickListener(gzsVar);
        }
    }

    public final void m(gzs<s3q0> gzsVar) {
        v3g0 v3g0Var = this.f;
        if (v3g0Var != null) {
            v3g0Var.setOnReplyViewClickListener(gzsVar);
        }
    }

    public final void n(String str, boolean z, boolean z2) {
        v3g0 v3g0Var;
        v3g0 v3g0Var2 = this.f;
        if (v3g0Var2 != null) {
            v3g0Var2.setReplyFromVisibility(z2);
        }
        if (!z2 || (v3g0Var = this.f) == null) {
            return;
        }
        if (z) {
            str = v3g0Var.getContext().getResources().getString(R.string.from_own_name);
        }
        TextView textView = v3g0Var.c;
        if (textView == null) {
            textView = null;
        }
        textView.setText(v3g0Var.a(R.string.reply_from_text, str, !z));
    }

    public final void o(boolean z) {
        v3g0 v3g0Var = this.f;
        if (v3g0Var != null) {
            v3g0Var.setReplyFromVisibility(z);
        }
    }

    public final void p(UserId userId, boolean z, String str, String str2) {
        String str3;
        v3g0 v3g0Var = this.f;
        if (v3g0Var != null) {
            v3g0Var.setReplyToVisibility(z || (userId != null && fkq0.c(userId)));
        }
        if (z) {
            v3g0 v3g0Var2 = this.f;
            if (v3g0Var2 != null) {
                String string = v3g0Var2.getContext().getResources().getString(R.string.edit_review_reply_reply_bar_text);
                int K = drm0.K(0, 6, string, " ", false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_link)), K, spannableStringBuilder.length(), 0);
                TextView textView = v3g0Var2.b;
                (textView != null ? textView : null).setText(spannableStringBuilder);
                v3g0Var2.b();
            }
            StickersView stickersView = this.d;
            if (stickersView != null) {
                stickersView.setStickersEnabled(false);
                return;
            }
            return;
        }
        v3g0 v3g0Var3 = this.f;
        if (v3g0Var3 != null) {
            if (userId != null && fkq0.c(userId)) {
                TextView textView2 = v3g0Var3.b;
                (textView2 != null ? textView2 : null).setText(v3g0Var3.a(R.string.reply_to_text, str2, false));
            }
            v3g0Var3.b();
        }
        if (drm0.N(str) || userId == null) {
            str3 = "";
        } else {
            StringBuilder sb = new StringBuilder(X3.j.d);
            sb.append(fkq0.b(userId) ? "club" : "id");
            sb.append(fkq0.a(userId).b);
            sb.append('|');
            sb.append(str);
            sb.append("], ");
            str3 = sb.toString();
        }
        String a2 = a();
        Regex regex = j;
        boolean a3 = regex.a(a2);
        WriteBar writeBar = this.a;
        if (a3) {
            writeBar.setText(regex.i(a(), str3));
        } else {
            StringBuilder e = fw3.e(str3);
            e.append(a());
            writeBar.setText(e.toString());
        }
        StickersView stickersView2 = this.d;
        if (stickersView2 != null) {
            stickersView2.setStickersEnabled(true);
        }
    }

    public final void q() {
        WriteBar writeBar = this.a;
        Context context = writeBar.getContext();
        v3g0 v3g0Var = new v3g0(context, null, 0);
        View.inflate(context, R.layout.reply_bar, v3g0Var);
        v3g0Var.b = (TextView) v3g0Var.findViewById(R.id.to);
        v3g0Var.c = (TextView) v3g0Var.findViewById(R.id.from);
        f4m.x(iah0.a(8), v3g0Var);
        v3g0Var.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
        this.f = v3g0Var;
        writeBar.M(v3g0Var);
    }

    public final void r(s1y0 s1y0Var) {
        this.a.setWriteBarSendListener(s1y0Var);
    }

    public final void s(StickerAttachment stickerAttachment, xwb0 xwb0Var) {
        ViewGroup bottomSheetContainer;
        PopupStickerView popupStickerView = this.g;
        WriteBar writeBar = this.a;
        if (popupStickerView != null && (bottomSheetContainer = writeBar.getBottomSheetContainer()) != null) {
            bottomSheetContainer.removeView(this.g);
        }
        PopupStickerAnimation popupStickerAnimation = stickerAttachment.f.k;
        if (popupStickerAnimation == null) {
            return;
        }
        PopupStickerView popupStickerView2 = new PopupStickerView(this.b, null, 0, 14, 0);
        this.g = popupStickerView2;
        popupStickerView2.setLoadingCallback(xwb0Var);
        PopupStickerView popupStickerView3 = this.g;
        if (popupStickerView3 != null) {
            PopupStickerView.d(popupStickerView3, popupStickerAnimation, false, null, 12);
        }
        ViewGroup bottomSheetContainer2 = writeBar.getBottomSheetContainer();
        if (bottomSheetContainer2 != null) {
            bottomSheetContainer2.setVisibility(0);
        }
        ViewGroup bottomSheetContainer3 = writeBar.getBottomSheetContainer();
        if (bottomSheetContainer3 != null) {
            bottomSheetContainer3.addView(this.g, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void t(boolean z) {
        int i = z ? 0 : 8;
        WriteBar writeBar = this.a;
        writeBar.setVisibility(i);
        crx0.E(writeBar.getInput(), z);
        b();
        writeBar.setStickersSuggestEnabled(z);
    }

    /* compiled from: RepliesController.kt */
    public static final class a implements l420 {
        @Override // xsna.l420
        public final void Y0() {
        }

        @Override // xsna.l420
        public final void N3(UserId userId) {
        }

        @Override // xsna.l420
        public final void x0(String str) {
        }
    }
}
