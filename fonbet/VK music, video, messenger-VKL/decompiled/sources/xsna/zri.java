package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.typing.ComposingType;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.spans.dialogitem.MsgBodySpan;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;

/* compiled from: ComposingFormatter.kt */
/* loaded from: classes2.dex */
public final class zri {
    public final Context a;
    public final ArrayList<wh30> b = new ArrayList<>();
    public final SpannableStringBuilder c = new SpannableStringBuilder();
    public final SpannableStringBuilder d = new SpannableStringBuilder();

    public zri(Context context) {
        this.a = context;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, ComposingType composingType) {
        boolean z = composingType == ComposingType.TEXT;
        Context context = this.a;
        if (z) {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_typing_default));
        }
        if (composingType == ComposingType.AUDIO) {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_reecording_default));
        }
        if (composingType == ComposingType.VIDEO_MSG) {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_reecording_video_msg_default));
        }
        if (composingType == ComposingType.PHOTO) {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_send_photo_default));
        }
        if (composingType == ComposingType.VIDEO) {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_send_video_default));
        }
        if (composingType == ComposingType.FILE) {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_send_file_default));
        }
    }

    public final String b(hcm hcmVar, Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        SpannableStringBuilder spannableStringBuilder = this.c;
        spannableStringBuilder.clear();
        if (hcmVar.b.isEmpty() || dialog == null || profilesSimpleInfo == null) {
            spannableStringBuilder.append("");
        } else {
            qtd0 Ab = profilesSimpleInfo.Ab(dialog.Sb());
            if (dialog.uc()) {
                d(hcmVar, profilesSimpleInfo, spannableStringBuilder);
            } else if (Ab != null) {
                a(spannableStringBuilder, hcmVar.b());
            } else {
                spannableStringBuilder.append("");
            }
        }
        return spannableStringBuilder.toString();
    }

    public final void c(ProfilesSimpleInfo profilesSimpleInfo, hcm hcmVar, Dialog dialog, SpannableStringBuilder spannableStringBuilder) {
        if (profilesSimpleInfo.zb(dialog.Zb()) != null && hcmVar.c()) {
            a(spannableStringBuilder, hcmVar.b());
        } else if (dialog.uc() && hcmVar.c()) {
            d(hcmVar, profilesSimpleInfo, spannableStringBuilder);
        }
        if (spannableStringBuilder.length() > 0) {
            com.vk.im.ui.formatters.spans.dialogitem.b.a(spannableStringBuilder, MsgBodySpan.Type.COMPOSING_TEXT, spannableStringBuilder.length(), 8);
        }
    }

    public final void d(hcm hcmVar, ProfilesSimpleInfo profilesSimpleInfo, SpannableStringBuilder spannableStringBuilder) {
        if (hcmVar.b.isEmpty() || profilesSimpleInfo == null) {
            spannableStringBuilder.append("");
            return;
        }
        ArrayList<wh30> arrayList = this.b;
        arrayList.clear();
        for (vh30 vh30Var : j5g.O0(hcmVar.b)) {
            qtd0 zb = profilesSimpleInfo.zb(vh30Var.a);
            if (zb != null) {
                arrayList.add(new wh30(zb, vh30Var.b));
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            spannableStringBuilder.append("");
            return;
        }
        if (size == 1) {
            qtd0 qtd0Var = ((wh30) j5g.Y(arrayList)).a;
            a(spannableStringBuilder.append((CharSequence) e(qtd0Var)).append(" "), hcmVar.b());
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        Context context = this.a;
        if (size != 2) {
            int i = size - 1;
            spannableStringBuilder.append((CharSequence) context.getResources().getQuantityString(R.plurals.vkim_typing_many, i, e(((wh30) j5g.Y(arrayList)).a), Integer.valueOf(i)));
        } else {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_typing_two, e(arrayList.get(0).a), e(arrayList.get(1).a)));
        }
    }

    public final String e(qtd0 qtd0Var) {
        UserNameCase userNameCase = UserNameCase.NOM;
        String d6 = qtd0Var.d6(userNameCase);
        String H5 = qtd0Var.H5(userNameCase);
        SpannableStringBuilder spannableStringBuilder = this.d;
        spannableStringBuilder.clear();
        spannableStringBuilder.append((CharSequence) d6);
        if (!drm0.N(H5)) {
            spannableStringBuilder.append(' ').append(H5.charAt(0)).append(JwtParser.SEPARATOR_CHAR);
        }
        return spannableStringBuilder.toString();
    }
}
